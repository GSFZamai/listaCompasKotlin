package br.com.livrokotlin.listadecompras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val itemsAdapter = ItemsAdapter()

        recyclerView.adapter = itemsAdapter

        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editText)


        button.setOnClickListener() {
            if(editText.text.isNotEmpty()) {
                val itemModel = ItemModel(
                    name = editText.text.toString()
                )
                itemsAdapter.addItem(itemModel)
                editText.text.clear()
            }

        }
    }
}