package com.status.a2zstatus.model

import com.google.gson.annotations.SerializedName

data class ResponseModel(@SerializedName("data")val items:ArrayList<ImageItems>,
                         @SerializedName("message")val message: String){
}