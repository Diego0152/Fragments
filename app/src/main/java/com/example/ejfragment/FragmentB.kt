package com.example.ejfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FragmentB : Fragment(R.layout.fragment_b) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnBGoC).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentB_to_fragmentC)
        }

        view.findViewById<Button>(R.id.btnBGoA).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentB_to_fragmentA)
        }
    }
}