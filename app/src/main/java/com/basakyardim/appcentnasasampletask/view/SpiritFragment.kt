package com.basakyardim.appcentnasasampletask.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.basakyardim.appcentnasasampletask.R
import com.basakyardim.appcentnasasampletask.adapter.RoverAdapter
import com.basakyardim.appcentnasasampletask.databinding.FragmentSpiritBinding
import com.basakyardim.appcentnasasampletask.model.Photo
import com.basakyardim.appcentnasasampletask.viewmodel.SpiritViewModel


class SpiritFragment : Fragment() {

    private var _binding: FragmentSpiritBinding?= null
    private val binding get() = _binding!!

    private lateinit var viewModel : SpiritViewModel
    private var roverAdapter = RoverAdapter(arrayListOf())

    private lateinit var resultList : ArrayList<Photo>
    private lateinit var filteredList: ArrayList<Photo>

    private var spinnerItemList = ArrayList<String>(arrayListOf())
    private var currentPage = 1
    private val pageSize = 25

    private var isLoading = false
    private var isScrolling = false
    private var isLastPage = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSpiritBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SpiritViewModel::class.java)

        spinnerItemList = arrayListOf(
            "ALL",
            "FHAZ",
            "RHAZ",
            "MAST",
            "CHEMCAM",
            "MAHLI",
            "MARDI",
            "NAVCAM",
            "PANCAM",
            "MINITES"
        )
        val arrayAdapter =
            ArrayAdapter(view.context, R.layout.spinner_item, spinnerItemList)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerSpirit.adapter = arrayAdapter
        viewModel.getRoversSpiritFromApi(currentPage)
        filteredList = ArrayList()
        resultList = ArrayList()

        val scrollListener = object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (newState == AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL) {
                    isScrolling = true
                }
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val layoutManager = binding.spiritList.layoutManager as GridLayoutManager
                val firstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition()
                val visibleItemCount = layoutManager.childCount
                val totalItemCount = layoutManager.itemCount

                val isNotLoadingAndNotLastPage = !isLoading && !isLastPage
                val isAtLastItem = firstVisibleItemPosition + visibleItemCount >= totalItemCount
                val isNotAtBeginning = firstVisibleItemPosition >= 0
                val isTotalMoreThanVisible = totalItemCount >= pageSize

                val shouldPaginate = isNotLoadingAndNotLastPage && isAtLastItem && isNotAtBeginning
                        && isTotalMoreThanVisible && isScrolling
                if (shouldPaginate) {
                    viewModel.getRoversSpiritFromApi(currentPage)
                    isScrolling = false

                }
            }
        }
        binding.spiritList.addOnScrollListener(scrollListener)


        //spinnerItemSelection
        binding.spinnerSpirit.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent?.getItemAtPosition(position).toString()
                filteredList.clear()
                if (selectedItem == "ALL") {
                    roverAdapter.updateList(resultList)
                }
                for (item in resultList) {
                    if (selectedItem == item.camera.name) {
                        filteredList.add(item)
                        roverAdapter.updateList(filteredList)
                    }
                }

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        binding.spiritList.layoutManager =
            GridLayoutManager(context, 2, RecyclerView.VERTICAL, false)
        binding.spiritList.adapter = roverAdapter
        observeLiveData()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null

    }

    private fun observeLiveData(){
        viewModel.roversSpiritLiveData.observe(viewLifecycleOwner,{ roversData ->

            roversData?.let {
                currentPage++
                if(resultList.size <= 0){
                    resultList = roversData as ArrayList<Photo>
                    roverAdapter.updateList(resultList)
                }

                else{
                    val newList = roversData as ArrayList<Photo>
                    resultList.addAll(newList)
                    roverAdapter.updateList(resultList)
                }


            }
        })
    }

}