package com.example.homework2

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework2.databinding.FragmentMainBinding

class FragmentMain : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)
        val snackbar_button = findViewById<Button>(R.id.snackbar_button)
        with(binding) {

            snackbar_button.setOnClickListener {
                findNavController().navigate(
                    R.id.action_mainFragment_to_snackFragment,
                    SnackFragment.createBundle(("From FragmentMain")
                    ),
                )
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}