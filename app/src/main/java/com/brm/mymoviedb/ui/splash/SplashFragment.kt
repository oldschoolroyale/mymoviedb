package com.brm.mymoviedb.ui.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.ObservableBoolean
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.brm.mymoviedb.R
import com.brm.mymoviedb.databinding.FragmentSplashBinding
import com.brm.mymoviedb.exceptions.MovieDbNetworkException
import com.brm.mymoviedb.ui.HomeFragment
import com.brm.mymoviedb.utils.BaseResponse


class SplashFragment : HomeFragment() {

    private val _status = Observer<Boolean> {isComplete ->
        binding.progress.isVisible = !isComplete
        if (isComplete)
            startListFragment()
    }

    private val splashViewModel by viewModels<SplashViewModel>()

    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSplashBinding.inflate(layoutInflater, container, false)
        splashViewModel.status.observe(viewLifecycleOwner, _status)

        try {
            splashViewModel.startDataRetrieve()
        }catch (e: MovieDbNetworkException){
            onRequestError(e)
        }

        return binding.root
    }

    private fun startListFragment(){

    }


    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}