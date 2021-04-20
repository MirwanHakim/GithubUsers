package com.example.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_USER = "extra_user"
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val tvUsername: TextView = findViewById(R.id.tv_username)
        val tvName: TextView = findViewById(R.id.tv_name)
        val tvImg: ImageView = findViewById(R.id.img_received)
        val tvCompany: TextView = findViewById(R.id.tv_company)
        val tvFollowers: TextView = findViewById(R.id.tv_followers)
        val tvFollowing: TextView = findViewById(R.id.tv_following)
        val tvLocation: TextView = findViewById(R.id.tv_location)
        val tvRepository: TextView = findViewById(R.id.tv_repository)

        val dataUser = intent.getParcelableExtra<User>(EXTRA_USER) as User
        tvUsername.text = dataUser.username
        tvName.text = dataUser.name
        tvImg.setImageResource(dataUser.photo)
        tvCompany.text = dataUser.company
        tvFollowers.text = dataUser.follower
        tvFollowing.text = dataUser.following
        tvLocation.text = dataUser.location
        tvRepository.text = dataUser.repository
    }
}