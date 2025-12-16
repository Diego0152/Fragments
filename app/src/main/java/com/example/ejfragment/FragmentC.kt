package com.example.ejfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FragmentC : Fragment(R.layout.fragment_c) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnCGoMain).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentC_to_fragmentMain)
        }

        view.findViewById<Button>(R.id.btnCGoB).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentC_to_fragmentB)
        }
    }
}