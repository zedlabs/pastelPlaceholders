package com.zedlabs.pastelplaceholder

object Pastel {

     fun getColorLight(): Int{
        return LightColors.list.random()
    }

    fun getColorDark(): Int{
        return DarkColors.list.random()
    }
}