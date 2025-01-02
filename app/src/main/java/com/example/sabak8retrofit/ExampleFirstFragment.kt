package com.example.sabak8retrofit

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.sabak8retrofit.data.RetrofitService
import com.example.sabak8retrofit.databinding.FragmentExampleFirstBinding
import kotlinx.coroutines.launch

class ExampleFirstFragment : Fragment() {

    private lateinit var binding: FragmentExampleFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExampleFirstBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnFirstFragment.setOnClickListener {
            findNavController().navigate(R.id.action_exampleFirstFragment_to_exampleSecondFragment)
        }

        binding.button2.setOnClickListener {
            lifecycleScope.launch {
                try {
                    val data = RetrofitService.apiService.getFact()
                    binding.textViewFact.text = data.text
                }
                catch (e:Exception){
                    Log.d("AAA", e.message.toString())
                }
            }
        }
    }
}