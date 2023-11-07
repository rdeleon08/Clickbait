package com.example.clickbait.data

import com.example.clickbait.R
import com.example.clickbait.model.News


object DataSource {
    val news = listOf(
        News(R.drawable.travel, R.string.headline1, "BuzzFeed", "22m ago"),
        News(R.drawable.pet, R.string.headline2, "InfoFrenzyHub", "22h ago"),
        News(R.drawable.fantasy, R.string.headline3, "VirallnsightGlobe", " ago"),
        News(R.drawable.diy, R.string.headline4, "VirallnsightGlobe", " ago"),
        News(R.drawable.cartoons, R.string.headline5, "CuriositySphere", "2d ago"),
        News(R.drawable.pizza, R.string.headline6, "InfoFrenzyHub", "42m ago"),
        News(R.drawable.celebrity, R.string.headline7, "TrendUnveilArena", "12m ago"),
        News(R.drawable.junkfood, R.string.headline8, "BuzzFeed", "2h ago"),
        News(R.drawable.soulmate, R.string.headline9, "CuriositySphere", "4h ago"),
        News(R.drawable.lifehacks, R.string.headline10, "HuffPost", "51m ago"),
    )
}

