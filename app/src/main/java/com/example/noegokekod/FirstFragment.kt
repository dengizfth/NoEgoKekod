package com.example.noegokekod

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.noegokekod.databinding.FragmentFirstBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class FirstFragment : Fragment() {

    private  var bottomNavigationView : BottomNavigationView? = null
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root

        // BottomNavigationView'a erişmek için
        bottomNavigationView = activity?.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView!!.visibility = View.GONE // Gizle

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        switchDurum()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun switchDurum(){

        binding.switchEgo.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked){
                bottomNavigationView!!.visibility = View.GONE
            } else  {
                bottomNavigationView!!.visibility = View.VISIBLE
            }

            binding.happinessSwitch.isChecked = false
            binding.optimismSwitch.isChecked = false
            binding.givingSwitch.isChecked = false
            binding.respectSwitch.isChecked = false
            binding.kindnessSwitch.isChecked = false

            val duration = 300L // Animasyon süresi (milisaniye)
            binding.happinessSwitch.animate().alpha(if (isChecked) 0.5f else 1f).setDuration(duration)
                .withEndAction { binding.happinessSwitch.isEnabled = !isChecked }
            binding.optimismSwitch.animate().alpha(if (isChecked) 0.5f else 1f).setDuration(duration)
                .withEndAction { binding.optimismSwitch.isEnabled = !isChecked }
            binding.givingSwitch.animate().alpha(if (isChecked) 0.5f else 1f).setDuration(duration)
                .withEndAction { binding.givingSwitch.isEnabled = !isChecked }
            binding.respectSwitch.animate().alpha(if (isChecked) 0.5f else 1f).setDuration(duration)
                .withEndAction { binding.respectSwitch.isEnabled = !isChecked }
            binding.kindnessSwitch.animate().alpha(if (isChecked) 0.5f else 1f).setDuration(duration)
                .withEndAction { binding.kindnessSwitch.isEnabled = !isChecked }
        }
    }
}