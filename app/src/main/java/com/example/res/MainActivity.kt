package com.example.res

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ProductAdapter(getProducts())
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
    }

    private fun getProducts(): List<Product> {
        val p1 = Product(1, "Apple", "USD 100", R.drawable.apple)
        val p2 = Product(2, "Samsung", "USD 100", R.drawable.samsung)
        val p3 = Product(3, "Sony", "USD 100", R.drawable.sony)
        val p4 = Product(4, "Redmi", "USD 100", R.drawable.redmi)
        val p5 = Product(4, "Dell", "USD 100", R.drawable.dell)
        val p6 = Product(4, "Nikon", "USD 100", R.drawable.nikon)
        val p7 = Product(4, "Google", "USD 100", R.drawable.google)
        val p8 = Product(4, "Motorola", "USD 100", R.drawable.motorola)

        val returnList = ArrayList<Product>()

        returnList.add(p1)
        returnList.add(p2)
        returnList.add(p3)
        returnList.add(p4)
        returnList.add(p5)
        returnList.add(p6)
        returnList.add(p7)
        returnList.add(p8)





        return returnList
    }
}
