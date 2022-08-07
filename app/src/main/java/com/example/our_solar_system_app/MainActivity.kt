package com.example.our_solar_system_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var NewRecyclerView : RecyclerView
    private lateinit var newArrayList : ArrayList<Planets>
    lateinit var imageId : Array<Int>
    lateinit var PlanetName : Array<String>
    lateinit var Description : Array<String>
    lateinit var Distance : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.asun,
            R.drawable.bmercury,
            R.drawable.cvenus,
            R.drawable.dearth,
            R.drawable.emars,
            R.drawable.fjupiter,
            R.drawable.gsaturn,
            R.drawable.ineptune
        )

        PlanetName = arrayOf(
            "Sun",
            "Mercury",
            "Venus",
            "Earth",
            "Mars",
            "Jupiter",
            "Saturn",
            "Neptune"
        )

        Description = arrayOf(
            "It is a huge, spinning, glowing sphere of hot gas. The Sun is just like the stars that you see in the night sky.",
            "Mercury is the smallest planet in the Solar System and the closest to the Sun.",
            "Venus is the second planet from the Sun and Earth's closest planetary neighbor.",
            "The planet of which we live on and it is the densest planet in the Solar System.",
            "Mars is the fourth planet from the Sun – a dusty, cold, desert world with a very thin atmosphere.",
            "Jupiter is covered in swirling cloud stripes. It has big storms which has been going for hundreds of years.",
            "Saturn is a massive ball made mostly of hydrogen and helium. Saturn also has spectacular and complex rings.",
            "In the Solar System, it is the fourth-largest planet by diameter, the third-most-massive planet, and the densest giant planet."
        )

        Distance = arrayOf(
            "Distance from the sun: 0km",
            "Distance from the sun: 65 million km",
            "Distance from the sun: 108 million km",
            "Distance from the sun: 152 million km",
            "Distance from the sun: 210 million km",
            "Distance from the sun: 742 million km",
            "Distance from the sun: 1.5 billion km",
            "Distance from the sun: 4.5 billion km"
        )

        NewRecyclerView = findViewById(R.id.RecyclerView)
        NewRecyclerView.layoutManager = LinearLayoutManager(this)
        NewRecyclerView.setHasFixedSize(true)
        newArrayList = arrayListOf<Planets>()
        getUserData()
    }

    private fun getUserData() {
        for (i in imageId.indices) {

            val planets = Planets(imageId[i], PlanetName[i], Description[i], Distance[i])
            newArrayList.add(planets)

        }
        NewRecyclerView.adapter = MyAdapter(newArrayList)
    }
}