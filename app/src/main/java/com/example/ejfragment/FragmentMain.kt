package com.example.ejfragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentMain : Fragment(R.layout.fragment_main) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnGoA).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_fragmentA)
        }

        view.findViewById<Button>(R.id.btnGoB).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_fragmentB)
        }
    }
}

