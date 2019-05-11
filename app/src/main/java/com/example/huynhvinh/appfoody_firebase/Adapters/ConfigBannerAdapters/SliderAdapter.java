package com.example.huynhvinh.appfoody_firebase.Adapters.ConfigBannerAdapters;


import com.example.huynhvinh.appfoody_firebase.ConfigBanner.SlideType;
import com.example.huynhvinh.appfoody_firebase.viewholder.ImageSlideViewHolder;

public abstract class SliderAdapter {
    public abstract int getItemCount();

    public final SlideType getSlideType(int position) {
        return SlideType.IMAGE;
    }

    public abstract void onBindImageSlide(int position, ImageSlideViewHolder imageSlideViewHolder);
}
