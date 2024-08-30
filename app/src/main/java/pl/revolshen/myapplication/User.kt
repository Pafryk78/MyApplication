package pl.revolshen.myapplication

import androidx.annotation.DrawableRes

data class User(val name: String, val surname: String, val technology: String, val birthdate: String, val city: String, @DrawableRes val image: Int)
