package com.example.mulact_improvedrv

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class confirm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)
        var tv1=findViewById<TextView>(R.id.tv1)
        var tv2=findViewById<TextView>(R.id.tv2)
        var tv3=findViewById<TextView>(R.id.tv3)
        var tv4=findViewById<TextView>(R.id.tv4)
        var but=findViewById<Button>(R.id.conf)
        tv1.text=person.people[0].name
        tv2.text=person.people[0].location
        tv3.text=person.people[0].mobile
        tv4.text=person.people[0].email
        but.setOnClickListener{
            alert()
        }
    }
    fun alert(){
        // first we create a variable to hold an AlertDialog builder
        val dialogBuilder = AlertDialog.Builder(this)
        // set input on dialog
        val input= TextView(this)
        input.text="${person.people[0].name}\n${person.people[0].location}\n${person.people[0].mobile}\n${person.people[0].email}"

        // if the dialog is cancelable
        dialogBuilder.setCancelable(false)
        // positive button text and action

        dialogBuilder.setPositiveButton("confirm", DialogInterface.OnClickListener {
                dialog, id ->  intent= Intent(this, ac2::class.java);startActivity(intent)
        })
            // negative button text and action
            .setNegativeButton("No", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })

        // create dialog box
        val alert = dialogBuilder.create()
        // set title for alert dialog box

        alert.setTitle("confirm?")

        alert.setView(input)

        // show alert dialog
        alert.show()

    }

}