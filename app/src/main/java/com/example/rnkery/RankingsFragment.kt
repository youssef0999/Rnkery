package com.example.rnkery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

//A JASON FILE NAMED Athletes.json IN assets FOLDER TO BE USED AS DUMMY DATA FOR THE RANKINGS LIST
//A JSON READER AND ADAPTER NEEDS TO BE IMPLEMETED TO READ THE FILE FROM JSON
//TEXT READ FROM JSON WILL BE PUT INTO LIST IDS (rank, name, country, points)
//LATER WE NEED TO IMPLEMENT THE DRAWSHEETFRAGMENT IN THE TOPBAR OF THE SCREEN
class RankingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootview = inflater.inflate(R.layout.fragment_rankings, container, false)


        return rootview
    }

}