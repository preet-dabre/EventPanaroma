package com.example.aarohi.eventpanaroma

import android.app.DatePickerDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.WindowManager
import android.widget.Button
import android.widget.DatePicker

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        var createEvent: Button = this.findViewById(R.id.create_events)
        createEvent.setOnClickListener{
            val intent=Intent(this, CreateEvents::class.java)
            startActivity(intent)

        }

        //go to event list to update

        var updateEvent: Button = findViewById(R.id.manage_events)
        updateEvent.setOnClickListener{
            val intent = Intent(this, EventList::class.java)
            intent.putExtra("activity", 0)
            RecyclerViewAdapter.activity = "update"
            startActivity(intent)

        }

        //go to event list to view stats

        var viewStats: Button = findViewById(R.id.view_stats)
        viewStats.setOnClickListener{
            val intent = Intent(this, EventList::class.java)
            intent.putExtra("activity", 1)
            RecyclerViewAdapter.activity = "stats"
            startActivity(intent)

        }

    }
}
