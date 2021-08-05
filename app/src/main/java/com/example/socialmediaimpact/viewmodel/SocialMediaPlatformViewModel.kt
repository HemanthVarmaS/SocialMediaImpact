package com.example.socialmediaimpact.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.socialmediaimpact.model.SocialMediaPlatform
import com.example.socialmediaimpact.repository.SocialMediaList

class SocialMediaPlatformViewModel(private val smList:SocialMediaList):ViewModel() {
    private val _mySmp : MutableLiveData<SocialMediaList> = MutableLiveData()
    val mySmp : LiveData<SocialMediaList> = _mySmp
    fun getSmpList() {
        _mySmp.value = smList.socialMediaList
    }
}