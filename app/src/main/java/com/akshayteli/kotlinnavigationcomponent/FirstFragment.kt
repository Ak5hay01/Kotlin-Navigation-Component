package com.akshayteli.kotlinnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation


/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {

    lateinit var textView: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        textView = view.findViewById(R.id.textView1)

        textView.setOnClickListener {
            //Sending data from 1st to 2nd fragment.
            val action = FirstFragmentDirections.navigateToSecondScreen("Second(2nd) Fragment") // even if we dont pass the string the app will work and default value specified will be shown
            Navigation.findNavController(view).navigate(action)
        }

        return view
    }


}