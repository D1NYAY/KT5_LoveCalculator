package com.example.kt5_lovecalculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.kt5_lovecalculator.love.LoveModel

class LoveViewModel:ViewModel() {

    val repository = Repository()

    fun liveModel(firstName:String,secondName:String):LiveData<LoveModel>{
        return repository.getLiveLoveModel(firstName,secondName)
    }

}