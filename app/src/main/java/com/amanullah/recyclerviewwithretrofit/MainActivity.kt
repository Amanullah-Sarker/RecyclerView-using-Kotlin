package com.amanullah.recyclerviewwithretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.amanullah.recyclerviewwithretrofit.adapter.MyAdapter
import com.amanullah.recyclerviewwithretrofit.databinding.ActivityMainBinding
import com.amanullah.recyclerviewwithretrofit.model.News

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var newsArrayList: ArrayList<News>
    lateinit var image: Array<Int>
    lateinit var title: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        image = arrayOf(
            R.drawable.aman,
            R.drawable.aman_2,
            R.drawable.aman,
            R.drawable.aman_2,
            R.drawable.aman,
            R.drawable.aman_2,
            R.drawable.aman,
            R.drawable.aman_2,
            R.drawable.aman,
            R.drawable.aman_2,
            R.drawable.aman,
            R.drawable.aman_2,
            R.drawable.aman,
            R.drawable.aman_2,
            R.drawable.aman,
            R.drawable.aman_2,
            R.drawable.aman,
            R.drawable.aman_2,
            R.drawable.aman,
            R.drawable.aman_2
        )

        title = arrayOf(
            "Amanullah Sarker 1",
            "Amanullah Sarker 2",
            "Amanullah Sarker 3",
            "Amanullah Sarker 4",
            "Amanullah Sarker 5",
            "Amanullah Sarker 6",
            "Amanullah Sarker 7",
            "Amanullah Sarker 8",
            "Amanullah Sarker 9",
            "Amanullah Sarker 10",
            "Amanullah Sarker 11",
            "Amanullah Sarker 12",
            "Amanullah Sarker 13",
            "Amanullah Sarker 14",
            "Amanullah Sarker 15",
            "Amanullah Sarker 16",
            "Amanullah Sarker 17",
            "Amanullah Sarker 18",
            "Amanullah Sarker 19",
            "Amanullah Sarker 20",
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)

        newsArrayList = arrayListOf<News>()

        getData()
    }

    private fun getData() {

        for (i in image.indices) {

            val news = News(image[i], title[i])
            newsArrayList.add(news)
        }

        binding.recyclerView.adapter = MyAdapter(newsArrayList)
    }
}