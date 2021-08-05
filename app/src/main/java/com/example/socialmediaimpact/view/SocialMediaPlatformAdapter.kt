package com.example.socialmediaimpact.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.socialmediaimpact.R
import com.example.socialmediaimpact.model.SocialMediaPlatform

class SocialMediaPlatformAdapter(private val smpList:List<SocialMediaPlatform>): RecyclerView.Adapter<SocialMediaPlatformAdapter.ViewHolder>() {
    inner class ViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
        val txtSmpName = itemView.findViewById<TextView>(R.id.txt_smp_name)
        val txtSmpYearFounded=itemView.findViewById<TextView>(R.id.txt_smp_year_founded)
        val txtSmpContent = itemView.findViewById<TextView>(R.id.txt_smp_content)
        val txtAddictionImpact = itemView.findViewById<TextView>(R.id.txt_smp_addiction_impact)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SocialMediaPlatformAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val smpView = inflater.inflate(R.layout.activity_social_media_platform_item,parent,false)
        return ViewHolder(smpView)
    }

    override fun onBindViewHolder(holder: SocialMediaPlatformAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return smpList.size
    }


}