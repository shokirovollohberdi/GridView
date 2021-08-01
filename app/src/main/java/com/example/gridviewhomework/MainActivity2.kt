package com.example.gridviewhomework

import Models.UserList
import Models.UserList.os_list
import Models.index
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var a = index.pos

        txt_info.text = UserList.os_list[a].info


    }
}