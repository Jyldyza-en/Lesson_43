package kg.tutorialapp.lesson_43

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycler: RecyclerView
    lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
    }

    private fun setup() {

        recycler = findViewById(R.id.recyclerView)
        myAdapter = MyAdapter()

        recycler.adapter = myAdapter

        myAdapter.setItems(Data.getLongListOfItems())
    }
}