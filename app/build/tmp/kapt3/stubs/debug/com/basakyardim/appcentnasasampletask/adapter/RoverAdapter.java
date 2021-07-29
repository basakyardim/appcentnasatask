package com.basakyardim.appcentnasasampletask.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0014\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/basakyardim/appcentnasasampletask/adapter/RoverAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/basakyardim/appcentnasasampletask/adapter/RoverAdapter$RoverItemViewHolder;", "roverList", "Ljava/util/ArrayList;", "Lcom/basakyardim/appcentnasasampletask/model/Photo;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newRoverList", "", "RoverItemViewHolder", "app_debug"})
public final class RoverAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.basakyardim.appcentnasasampletask.adapter.RoverAdapter.RoverItemViewHolder> {
    private final java.util.ArrayList<com.basakyardim.appcentnasasampletask.model.Photo> roverList = null;
    
    public RoverAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.basakyardim.appcentnasasampletask.model.Photo> roverList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.basakyardim.appcentnasasampletask.adapter.RoverAdapter.RoverItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.basakyardim.appcentnasasampletask.adapter.RoverAdapter.RoverItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.basakyardim.appcentnasasampletask.model.Photo> newRoverList) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004\u00a8\u0006\u0014"}, d2 = {"Lcom/basakyardim/appcentnasasampletask/adapter/RoverAdapter$RoverItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "roverCardView", "Landroidx/cardview/widget/CardView;", "getRoverCardView", "()Landroidx/cardview/widget/CardView;", "setRoverCardView", "(Landroidx/cardview/widget/CardView;)V", "roverImage", "Landroid/widget/ImageView;", "getRoverImage", "()Landroid/widget/ImageView;", "setRoverImage", "(Landroid/widget/ImageView;)V", "getView", "()Landroid/view/View;", "setView", "app_debug"})
    public static final class RoverItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.view.View view;
        @org.jetbrains.annotations.NotNull()
        private androidx.cardview.widget.CardView roverCardView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView roverImage;
        
        public RoverItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public final void setView(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getRoverCardView() {
            return null;
        }
        
        public final void setRoverCardView(@org.jetbrains.annotations.NotNull()
        androidx.cardview.widget.CardView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getRoverImage() {
            return null;
        }
        
        public final void setRoverImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
    }
}