package com.example.laundry.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import com.example.laundry.R

class HomeFragment : Fragment(), OnClickListener {
    // TODO: Rename and change types of parameters

    private lateinit var BtnSetting : ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        BtnSetting = view.findViewById(R.id.imageButton)
        BtnSetting.setOnClickListener(this)
    }

    override fun onResume() {
        SettingFragment.list.clear()
        super.onResume()
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.imageButton -> {
                findNavController().navigate(R.id.action_homeFragment_to_settingFragment)
            }
        }
    }
}