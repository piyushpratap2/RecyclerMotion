package com.example.recycler_motion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler_motion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     private lateinit var recyclerAdapter: RecyclerAdapter
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list: MutableList<String> = ArrayList()
        list.add("Vinay")
        list.add("piyush")
        list.add("vasu")
        list.add("naveen")
        list.add("Vinay")
        list.add("piyush")
        list.add("vasu")
        list.add("naveen")
        list.add("Vinay")
        list.add("piyush")
        list.add("vasu")
        list.add("naveen")
        list.add("Vinay")
        list.add("piyush")
        list.add("vasu")
        list.add("naveen")
        list.add("Vinay")
        list.add("piyush")
        list.add("vasu")
        list.add("naveen")


        binding!!.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerAdapter = RecyclerAdapter(this@MainActivity,list)
            adapter = recyclerAdapter
        }


        val transition = object: MotionLayout.TransitionListener{
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {
                TODO("Not yet implemented")
            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {
                TODO("Not yet implemented")
            }

            @SuppressLint("CommitTransaction")
            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                val fm = supportFragmentManager.beginTransaction()
                fm.replace(binding.container.id,BlankFragment())
                fm.commit()
            }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ){
                TODO("Not yet implemented")
            }

        }
    }
}


