package com.example.rnkery.ui.rankings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.rnkery.R

class RankingsFragment : Fragment() {

    private lateinit var rankingsViewModel: RankingsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        rankingsViewModel =
                ViewModelProviders.of(this).get(RankingsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_rankings, container, false)
        val textView: TextView = root.findViewById(R.id.text_rankings)
        rankingsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
