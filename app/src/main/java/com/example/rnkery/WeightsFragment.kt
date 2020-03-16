package com.example.rnkery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment

class WeightsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_weight, null)
        var mweights = arrayOf("58- Kg", "68- Kg", "80- Kg", "87+ Kg")
        var fweights = arrayOf("49- Kg", "59- Kg", "67- Kg", "74+ Kg")
        val checkbox = rootView.findViewById<CheckBox>(R.id.cb)
        val mylistview = rootView.findViewById(R.id.mylistview) as ListView
        mylistview.adapter =
            ArrayAdapter<String>(activity!!, R.layout.weightslistlayout, R.id.tv, mweights)

        mylistview.setOnItemClickListener { adapterView,
                                            view,
                                            position,
                                            l
            ->
            Toast.makeText(activity, mweights[position], Toast.LENGTH_SHORT).show()
            val fragment = RankingsFragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }


        return rootView
    }

}