package com.example.companytask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.companytask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var usersList=ArrayList<User>()
    private var userAdapter=UserAdapter(usersList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        initListener()
    }
    private fun  initRecyclerView()
    {
        binding.recyclerView.adapter=userAdapter
        binding.recyclerView.layoutManager=LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)
    }
    private fun initListener()
    {
        binding.btnClick.setOnClickListener {
            WebThread().execute(null)
        }
    }
}