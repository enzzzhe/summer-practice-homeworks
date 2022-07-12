package com.example.homework2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

class SnackFragment : Fragment(R.layout.snack_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text = arguments?.getString(ARG_TEXT).orEmpty()

        if (text.isNotEmpty()){
            Snackbar.make(view, text, Snackbar.LENGTH_LONG).show()
        }
    }

    companion object {

        private const val ARG_TEXT = "MainFragment"

        fun createBundle(text: String): Bundle {
            val bundle = Bundle()
            bundle.putString(
                ARG_TEXT,
                text
            )
            return bundle
        }
    }
}