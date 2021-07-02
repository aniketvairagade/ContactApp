package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val users = ArrayList<User>()
        users.add(User("Bapuji", "8442311525", 2))

        users.add(User("Sonu", "8487652018", 1))

        users.add(User("Sonpari", "9452171626", 2))

        users.add(User("Jalpari", "7888777888", 3))

        users.add(User("Tapu", "36445278225", 1))

        users.add(User("Ye Bhide", "946133723", 2))

        users.add(User("Goli", "8442311525", 1))

        users.add(User("Popatlal", "62431", 3))

        users.add(User("Jeta Uncle", "946521300", 2))

        users.add(User("Tapu ke Papa", "62334576", 1))

        users.add(User("Babitaji", "8442311525", 2))

        users.add(User("AMBULANCE", "108", 3))

        users.add(User("POLICE", "100", 2))

        users.add(User("FIRE", "101 ", 1))

        users.add(User("WOMEN HELPLINE", "22620111", 3))

        users.add(User("BLOOD BANK", "104", 2))

        users.add(User("TOURIST POLICE", "555", 1))

        users.add(User("CHILD HELPLINE", "1098", 2))

        users.add(User("Air Ambulance", "8442311525", 3))

        users.add(User("Railway Enquiry", "139", 2))

        users.add(User("Kisan Call Centre","1551", 1))

        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==R.id.home)
        {
            Toast.makeText(this,"Home Menu Click",Toast.LENGTH_LONG).show()
        }
        else if(item.itemId==R.id.call)
        {
            Toast.makeText(this,"Call Menu Click",Toast.LENGTH_LONG).show()
        }
        else
        {
            Toast.makeText(this,"Account Menu Click",Toast.LENGTH_LONG).show()
        }
        return true
    }
}