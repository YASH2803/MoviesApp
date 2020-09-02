package com.example.moviesapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_main_screen.*


class MainScreenFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        movieList.add(Movie("Iron Man", "2008"))
        movieList.add(Movie("Iron Man", "2008"))
        movieList.add(Movie("Iron Man", "2008"))
        movieList.add(Movie("Iron Man", "2008"))

        val layoutManager = GridLayoutManager(activity, 2)
//        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup(){
//            override fun getSpanSize(position: Int) = when(position) {
//                0 -> 2
//                else -> 1
//            }
//
//        }
        movie_recyclerview.layoutManager = layoutManager
        movie_recyclerview.adapter = MovieAdapter(movieList)
    }

    private val movieList: ArrayList<Movie> = ArrayList()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_main_screen, container, false)

//
//        movieList.add(Movie("Iron Man", "2008"))
//        movieList.add(Movie("Iron Man", "2008"))
//        movieList.add(Movie("Iron Man", "2008"))
//        movieList.add(Movie("Iron Man", "2008"))
//
//        val layoutManager = GridLayoutManager(activity, 2)
//        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup(){
//            override fun getSpanSize(position: Int) = when(position) {
//                0 -> 2
//                else -> 1
//            }
//
//        }
//        movie_recyclerview.layoutManager = layoutManager
//        movie_recyclerview.adapter = MovieAdapter(movieList)
//

        return root
    }

}