package com.example.socialmediaimpact.repository

import com.example.socialmediaimpact.model.SocialMediaPlatform;

class SocialMediaList {
    val socialMediaList = arrayListOf<SocialMediaPlatform>(
        SocialMediaPlatform("Facebook",2005,"All media","high"),
        SocialMediaPlatform("Instagram",2010,"Image&Video","very high"),
        SocialMediaPlatform("Youtube",2008,"Video","high"),
        SocialMediaPlatform("TikTok",2015,"Short form","extreme")
    )

}