package com.example.mvpassignment


import android.app.Activity
import android.os.Handler
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.util.*


class Model : Contract.Model {
    // array list of strings from which
    // random strings will be selected
    // to display in the activity
    private val arrayList =
        Arrays.asList(

    "DSA Self Paced: Master the basics of Data Structures and Algorithms to solve complex problems efficiently. ",
    "Placement 100: This course will guide you for placement with theory,lecture videos, weekly assignments " +
            "contests and doubt assistance.",
    "Amazon SDE Test Series: Test your skill & give the final touch to your preparation before applying for " +
            "product based against like Amazon, Microsoft, etc.",
    "Complete Interview Preparation: Cover all the important concepts and topics required for the interviews. " +
            "Get placement ready before the interviews begin",
    "Low Level Design for SDE 1 Interview: Learn Object-oriented Analysis and Design to prepare for " +
            "SDE 1 Interviews in top companies"

        )
    var randomId = Random().nextInt(20)
    private val pokemonUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/${randomId}.png"

    private val urlList = Arrays.asList(
        "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/4.png",
        "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/7.png",
        "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/9.png",
        "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/5.png",
        "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/7.png",
        "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/4.png",
        "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/9.png",
        "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/3.png"


    )



    // this method will invoke when
    // user clicks on the button
    // and it will take a delay of
    // 1200 milliseconds to display next course detail
    override fun getNextCourse(onFinishedListener: Contract.Model.OnFinishedListener?) {
        Handler().postDelayed({ onFinishedListener!!.onFinished(getRandomImages, pokemonUrl) }, 1200)
    }


    // method to select random
    // string from the list of strings
    private val getRandomImages: String?
        private get() {
            val random = Random()
            val index = random.nextInt(arrayList.size)
            return arrayList[index]

        }
















}
