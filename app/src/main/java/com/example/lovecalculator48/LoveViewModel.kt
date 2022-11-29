package com.example.lovecalculator48

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lovecalculator48.remote.LoveModel

class LoveViewModel : ViewModel() {

    val repository = Repository()

    fun liveModel(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getLiveLoveModel(firstName, secondName)
    }

}