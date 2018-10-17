package com.example.aarohi.eventpanaroma

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ProgressBar
import android.widget.TextView
import com.bumptech.glide.Glide
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import de.hdodenhof.circleimageview.CircleImageView

class Stats : AppCompatActivity() {

    var totalRegistrations: Int = 0


    val eventListener = object: ValueEventListener {
        override fun onCancelled(p0: DatabaseError) {

        }

        override fun onDataChange(p0: DataSnapshot) {
            var mTotalEvents = p0.childrenCount.toInt()


            for((i, childSnapshot: DataSnapshot) in p0.children.withIndex())
            {
                var keyId: String = childSnapshot.key!!
                if(keyId.equals(intent.getStringExtra("key")))
                {
                    totalRegistrations = childSnapshot.child("eventRegistrations").childrenCount.toInt()
                    findViewById<TextView>(R.id.registrations_text).text = "Registrations $totalRegistrations"
                    var pr:Int = ((totalRegistrations.toDouble() /intent.getStringExtra("entries").toDouble()) * 100.0).toInt()
                    findViewById<ProgressBar>(R.id.registration_progress).progress = pr//67

                    //findViewById<CircleImageView>(R.id.stats_event_image).


                    break
                }


            }

        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)


        val database = FirebaseDatabase.getInstance()
        val myRef = database.reference

        //myRef.addListenerForSingleValueEvent(eventListener)
        myRef.child("events").addValueEventListener(eventListener)

        var title: TextView = findViewById(R.id.re_event_title)
        //var registrations: TextView = findViewById(R.id.registrations_text)
        var regProgress: ProgressBar = findViewById(R.id.registration_progress)

        title.text = intent.getStringExtra("title")
        //registrations.text = "Registrations: " + totalRegistrations.toString()

        Glide.with(this@Stats)
                .asBitmap()
                .load(intent.getStringExtra("imageUrl"))
                .into(findViewById<CircleImageView>(R.id.stats_event_image))




    }
}
