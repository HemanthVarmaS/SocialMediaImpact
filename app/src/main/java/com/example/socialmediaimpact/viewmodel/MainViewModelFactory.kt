package com.example.socialmediaimpact.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.socialmediaimpact.repository.SocialMediaList

class MainViewModelFactory():ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SocialMediaPlatformViewModel::class.java)) {
            return SocialMediaPlatformViewModel(SocialMediaList()) as T
        }
        throw IllegalArgumentException("UnknownViewModel")
    }

}