package com.example.homework2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework2.databinding.MainFragmentBinding

class MainFragment : Fragment(R.layout.main_fragment) {

    private var _binding: MainFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = MainFragmentBinding.bind(view)

        with(binding) {
            btnSnackbar.setOnClickListener {
                findNavController().navigate(
                    R.id.action_mainFragment_to_snackbarFragment,
                    SnackbarFragment.createBundle(("From MainFragment")
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