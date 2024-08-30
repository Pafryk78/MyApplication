package pl.revolshen.myapplication

import androidx.lifecycle.ViewModel

private val user1 =
    User(
        name = "Tomo",
        surname = "Szulc",
        technology = "Szulcow",
        image = R.drawable.szulc,
        birthdate = "2002-01-01",
        city = "Łódź"
    )
private val user2 =
    User(
        name = "Maciej",
        surname = "Zberzeźny",
        technology = "Raptorek",
        image = R.drawable.zberzezny,
        birthdate = "2003-01-01",
        city = "Łódź"
    )
private val user3 =
    User(
        name = "Taylor",
        surname = "Swift",
        technology = "Singer",
        image = R.drawable.ts,
        birthdate = "1000-01-01",
        city = "Los Kebabos"
    )

private val data = listOf(user1, user2, user3)

    interface Server {
        fun loadDataFromDb(): List<User>
}

class MainViewModel: ViewModel(), Server {
    private var user: User? = null

    override fun loadDataFromDb(): List<User> {
        return data
    }
    fun setUser(user: User) {
        this.user = user
    }

    fun getUser() = user

}