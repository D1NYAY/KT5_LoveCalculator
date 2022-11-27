package com.example.kt5_lovecalculator

import android.app.Application
import com.example.kt5_lovecalculator.love.LoveAPI

class App:Application() {

    companion object{
        lateinit var api: LoveAPI
    }


    override fun onCreate() {
        super.onCreate()
        api = RetrofitService().api
    }
}