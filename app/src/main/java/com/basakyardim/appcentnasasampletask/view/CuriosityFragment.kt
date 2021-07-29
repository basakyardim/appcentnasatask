package com.basakyardim.appcentnasasampletask.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.basakyardim.appcentnasasampletask.adapter.RoverAdapter
import com.basakyardim.appcentnasasampletask.databinding.FragmentCuriosityBinding
import com.basakyardim.appcentnasasampletask.viewmodel.CuriosityViewModel

class CuriosityFragment : Fragment() {

    private var _binding:FragmentCuriosityBinding ?= null
    private val binding get() = _binding!!

    private lateinit var viewModel : CuriosityViewModel
    private var roverAdapter = RoverAdapter(arrayListOf())


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentCuriosityBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CuriosityViewModel::class.java)
        viewModel.getRoversFromApi()

        binding.curiosityList.layoutManager = GridLayoutManager(context,2,RecyclerView.VERTICAL,false)
        binding.curiosityList.adapter = roverAdapter

        obserVeLiveData()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun obserVeLiveData(){
        viewModel.roversLiveData.observe(viewLifecycleOwner,{ roversData ->

            roversData?.let {
                roverAdapter.updateList(roversData)

            }
        })
    }


}