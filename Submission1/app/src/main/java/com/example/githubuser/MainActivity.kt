package com.example.githubuser

import android.content.Intent
import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_detail.*
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: UserAdapter
    private lateinit var dataName: Array<String>
    private lateinit var dataUsername: Array<String>
    private lateinit var dataPhoto: TypedArray
    private lateinit var dataFollowers: Array<String>
    private lateinit var dataFollowing: Array<String>
    private lateinit var dataLocation: Array<String>
    private lateinit var dataCompany: Array<String>
    private lateinit var dataRepository: Array<String>
    private var users = arrayListOf<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.lv_list)
        adapter = UserAdapter(this)
        listView.adapter = adapter

        prepare()
        addItem()
        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            //Toast.makeText(this@MainActivity, users[position].name, Toast.LENGTH_SHORT).show()
            val moveIntent = Intent(this@MainActivity, DetailActivity::class.java)
            val selectedUser: User = users[position]
            moveIntent.putExtra(DetailActivity.EXTRA_USER, selectedUser)

            startActivity(moveIntent)

        }
    }

    private fun prepare(){
        dataName = resources.getStringArray(R.array.data_name)
        dataUsername = resources.getStringArray(R.array.data_username)
        dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        dataFollowers = resources.getStringArray(R.array.data_followers)
        dataFollowing = resources.getStringArray(R.array.data_following)
        dataLocation = resources.getStringArray(R.array.data_location)
        dataCompany = resources.getStringArray(R.array.data_company)
        dataRepository = resources.getStringArray(R.array.data_repository)
    }

    private fun addItem(){
        for (position in dataName.indices){
            val user = User(
                dataPhoto.getResourceId(position, -1),
                dataName[position],
                dataUsername[position],
                dataFollowers[position],
                dataFollowing[position],
                dataLocation[position],
                dataCompany[position],
                dataRepository[position]
            )
            users.add(user)
        }
        adapter.users = users
    }
}