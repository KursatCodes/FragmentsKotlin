package com.muhammedkursatgokgun.fragmentskotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.muhammedkursatgokgun.fragmentskotlin.databinding.Fragment1Binding
import com.muhammedkursatgokgun.fragmentskotlin.databinding.Fragment2Binding

private var binding0 : Fragment2Binding? = null
private val binding get() = binding0!!
class Fragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding0 = Fragment2Binding.inflate(inflater,container,false)
        val view = binding.root
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_2, container, false)
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button2.setOnClickListener {
            val action = Fragment2Directions.actionFragment2ToFragment1()
            Navigation.findNavController(it).navigate(action)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding0 = null
    }

}