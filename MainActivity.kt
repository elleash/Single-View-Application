package com.example.naancalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupWindow
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

//  declared variables for the information button and the dropdown menus
    private lateinit var showPopup : ImageButton
    private lateinit var spin1 : Spinner
    private lateinit var spin2 : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      assign the information image button to the variables and set onClick to call the popup function
        showPopup = findViewById(R.id.infoBtn)
        showPopup.setOnClickListener {
            showPopup()
        }

//      assign the spinners to the variables
        spin1 = findViewById(R.id.spinner1)
        spin2 = findViewById(R.id.spinner2)

//      created a list of items for the dropdown menus
        val items1 = listOf("Bicep", "Tricep", "Shoulder", "Back", "Legs")
        val items2 = listOf("Weights", "Calisthenics")

//      created array adapters to display the items in the list into a dropdown menu
        val arrayAdapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, items1)
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spin1.adapter = arrayAdapter1

        val arrayAdapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, items2)
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spin2.adapter = arrayAdapter2

    }

//  function for the button to execute
    fun onCombination(view: View){
//      created variables to get the items of the spinners and convert to string
        val item1 = spin1.getSelectedItem().toString()
        val item2 = spin2.getSelectedItem().toString()

//      conditional statements for all the combinations
        if(item1 == "Bicep" && item2 == "Weights"){

//          displayed the result as a popup modal
            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.ex1, null)
//          gathered the textview from the results layout file and edited the Textview
            val newTxt = popupView.findViewById<TextView>(R.id.exText)
            newTxt.text = "1. Hammer Curl\n" + "2. Barbell Curl\n" + "3. Cable Curl"

            val width = 1000
            val height = 1200

            val instructWindow = PopupWindow(popupView, width, height, true)
            instructWindow.showAtLocation(popupView, Gravity.CENTER,0,0)

//          set button to closs the popup modal
            val closeButton = popupView.findViewById<Button>(R.id.closeBtn)
            closeButton.setOnClickListener {
                instructWindow.dismiss()
            }
        }
        else if(item1 == "Tricep" && item2 == "Weights"){

            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.ex1, null)
            val newTxt = popupView.findViewById<TextView>(R.id.exText)
            newTxt.text = "1. Skullcrusher\n" + "2. Tricep Pushdown\n" + "3. Tricep Extentsion"

            val width = 1000
            val height = 1200

            val instructWindow = PopupWindow(popupView, width, height, true)
            instructWindow.showAtLocation(popupView, Gravity.CENTER,0,0)

            val closeButton = popupView.findViewById<Button>(R.id.closeBtn)
            closeButton.setOnClickListener {
                instructWindow.dismiss()
            }
        }
        else if(item1 == "Shoulder" && item2 == "Weights"){

            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.ex1, null)
            val newTxt = popupView.findViewById<TextView>(R.id.exText)
            newTxt.text = "1. Lateral raise\n" + "2. Shoulder Shrugs\n" + "3. Shoulder press"

            val width = 1000
            val height = 1200

            val instructWindow = PopupWindow(popupView, width, height, true)
            instructWindow.showAtLocation(popupView, Gravity.CENTER,0,0)

            val closeButton = popupView.findViewById<Button>(R.id.closeBtn)
            closeButton.setOnClickListener {
                instructWindow.dismiss()
            }
        }
        else if(item1 == "Back" && item2 == "Weights"){

            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.ex1, null)
            val newTxt = popupView.findViewById<TextView>(R.id.exText)
            newTxt.text = "1. Pull-Down\n" + "2. Barbell Row\n" + "3. Deadlift"

            val width = 1000
            val height = 1200

            val instructWindow = PopupWindow(popupView, width, height, true)
            instructWindow.showAtLocation(popupView, Gravity.CENTER,0,0)

            val closeButton = popupView.findViewById<Button>(R.id.closeBtn)
            closeButton.setOnClickListener {
                instructWindow.dismiss()
            }
        }
        else if(item1 == "Legs" && item2 == "Weights"){

            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.ex1, null)
            val newTxt = popupView.findViewById<TextView>(R.id.exText)
            newTxt.text = "1. Barbell Squat\n" + "2. Lunge\n" + "3. Leg Press"

            val width = 1000
            val height = 1200

            val instructWindow = PopupWindow(popupView, width, height, true)
            instructWindow.showAtLocation(popupView, Gravity.CENTER,0,0)

            val closeButton = popupView.findViewById<Button>(R.id.closeBtn)
            closeButton.setOnClickListener {
                instructWindow.dismiss()
            }
        }
        else if(item1 == "Bicep" && item2 == "Calisthenics"){

            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.ex1, null)
            val newTxt = popupView.findViewById<TextView>(R.id.exText)
            newTxt.text = "1. Reverse Push Up\n" + "2. Australian Pull Ups\n" + "3. Bicep Rows"

            val width = 1000
            val height = 1200

            val instructWindow = PopupWindow(popupView, width, height, true)
            instructWindow.showAtLocation(popupView, Gravity.CENTER,0,0)

            val closeButton = popupView.findViewById<Button>(R.id.closeBtn)
            closeButton.setOnClickListener {
                instructWindow.dismiss()
            }
        }
        else if(item1 == "Tricep" && item2 == "Calisthenics"){

            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.ex1, null)
            val newTxt = popupView.findViewById<TextView>(R.id.exText)
            newTxt.text = "1. Dips\n" + "2. Diamond Pushup\n" + "3. Tricep Extentsion (Bodyweight)"

            val width = 1000
            val height = 1200

            val instructWindow = PopupWindow(popupView, width, height, true)
            instructWindow.showAtLocation(popupView, Gravity.CENTER,0,0)

            val closeButton = popupView.findViewById<Button>(R.id.closeBtn)
            closeButton.setOnClickListener {
                instructWindow.dismiss()
            }
        }
        else if(item1 == "Shoulder" && item2 == "Calisthenics"){

            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.ex1, null)
            val newTxt = popupView.findViewById<TextView>(R.id.exText)
            newTxt.text = "1. Pike Pushups\n" + "2. Wall walks\n" + "3. Full Planche"

            val width = 1000
            val height = 1200

            val instructWindow = PopupWindow(popupView, width, height, true)
            instructWindow.showAtLocation(popupView, Gravity.CENTER,0,0)

            val closeButton = popupView.findViewById<Button>(R.id.closeBtn)
            closeButton.setOnClickListener {
                instructWindow.dismiss()
            }
        }
        else if(item1 == "Back" && item2 == "Calisthenics"){

            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.ex1, null)
            val newTxt = popupView.findViewById<TextView>(R.id.exText)
            newTxt.text = "1. Superman\n" + "2. Pull up\n" + "3. Inverted Rows"

            val width = 1000
            val height = 1200

            val instructWindow = PopupWindow(popupView, width, height, true)
            instructWindow.showAtLocation(popupView, Gravity.CENTER,0,0)

            val closeButton = popupView.findViewById<Button>(R.id.closeBtn)
            closeButton.setOnClickListener {
                instructWindow.dismiss()
            }
        }
        else if(item1 == "Legs" && item2 == "Calisthenics"){

            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = inflater.inflate(R.layout.ex1, null)
            val newTxt = popupView.findViewById<TextView>(R.id.exText)
            newTxt.text = "1. Pistol Squats\n" + "2. Wall sit\n" + "3. Donkey Kicks"

            val width = 1000
            val height = 1200

            val instructWindow = PopupWindow(popupView, width, height, true)
            instructWindow.showAtLocation(popupView, Gravity.CENTER,0,0)

            val closeButton = popupView.findViewById<Button>(R.id.closeBtn)
            closeButton.setOnClickListener {
                instructWindow.dismiss()
            }
        }
    }

//  function to show information about the app
    private fun showPopup(){
        val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val popupView = inflater.inflate(R.layout.activity_popup1, null)

        val width = 1300
        val height = 2000

        val instructWindow = PopupWindow(popupView, width, height, true)
        instructWindow.showAtLocation(popupView, Gravity.CENTER,1,1)

        val closeButton = popupView.findViewById<Button>(R.id.closeBtn)
        closeButton.setOnClickListener {
            instructWindow.dismiss()
        }
    }
}