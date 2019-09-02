package com.example.lab5intent_603021734_4

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*


@Parcelize
 data class Student (val id:String, val name: String, val age: Int) : Parcelable {

}