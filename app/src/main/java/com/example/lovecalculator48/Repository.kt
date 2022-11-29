package com.example.lovecalculator48

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.lovecalculator48.remote.LoveModel
import com.example.lovecalculator48.remote.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    fun getLiveLoveModel(firstName: String, secondName: String): MutableLiveData<LoveModel> {
        var liveModel = MutableLiveData<LoveModel>()

        RetrofitService().api.calculateLove(firstName, secondName)
            .enqueue(object : Callback<LoveModel> {
                override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                    if (response.isSuccessful) {
                        liveModel.postValue(response.body())
                    }
                }

                override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                    Log.e("loh", "onFailure: ${t.message} ")
                }

            })

        return liveModel


    }
}