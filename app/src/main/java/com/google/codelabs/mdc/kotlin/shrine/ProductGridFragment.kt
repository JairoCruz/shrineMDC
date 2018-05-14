package com.google.codelabs.mdc.kotlin.shrine

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.*
import kotlinx.android.synthetic.main.shr_product_grid_fragment.view.*

class ProductGridFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set Menu
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.shr_product_grid_fragment, container, false)

        // Add Toolbar
        (activity as AppCompatActivity).setSupportActionBar(view.app_bar)



        // Inflate the layout for this fragment
        return view
    }

    // Add Menu
    override fun onCreateOptionsMenu(menu: Menu?, menuInflater: MenuInflater?){
        menuInflater!!.inflate(R.menu.shr_toolbar_menu, menu)
        super.onCreateOptionsMenu(menu, menuInflater)
    }
}
