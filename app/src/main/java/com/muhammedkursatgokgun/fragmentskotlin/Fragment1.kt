package com.muhammedkursatgokgun.fragmentskotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.navigation.Navigation
import com.muhammedkursatgokgun.fragmentskotlin.databinding.Fragment1Binding

private var binding0 : Fragment1Binding? = null
private val binding get() = binding0!!
class Fragment1 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding0 = Fragment1Binding.inflate(inflater,container,false)
        val view = binding.root
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_1, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            val action= Fragment1Directions.actionFragment1ToFragment2()
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding0 = null
    }
}
