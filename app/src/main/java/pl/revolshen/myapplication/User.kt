package pl.revolshen.myapplication

import androidx.annotation.DrawableRes

data class User(val name: String, val surname: String, val technology: String, @DrawableRes val image: Int, val birthdate: String, val city: String)
