package com.zedlabs.pastelplaceholder

open class Pastel {

     fun getColorLight(): Int{
        return LightColors.list.random()
    }

    fun getColorDark(): Int{
        return DarkColors.list.random()
    }
}