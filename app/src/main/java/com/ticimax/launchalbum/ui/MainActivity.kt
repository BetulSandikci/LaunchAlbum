package com.ticimax.launchalbum.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.ticimax.launchalbum.adapter.AlbumListAdapter
import com.ticimax.launchalbum.datalayer.dto.ResultListDTO
import com.ticimax.launchalbum.di.DependecyUtil
import com.ticimax.launchalbum.viewmodel.AlbumViewModel
import com.ticimax.launchalbum.viewmodel.ViewModelFactory
import com.ticimax.launchalbum.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val albumRepository by lazy { DependecyUtil.getAlbumRepository() }
    private val albumViewModel: AlbumViewModel by lazy {

        ViewModelProviders.of(
            this,
            ViewModelFactory(albumRepository)
        ).get(AlbumViewModel::class.java)
    }

    private val data by lazy { ArrayList<ResultListDTO>() }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        albumViewModel.live_album.observe(this, Observer { _list ->

            for (i in 1 until _list.size) {
                data.add(_list[i])
            }
            with(recycAlbumList) {
                adapter = AlbumListAdapter(data)
                layoutManager = LinearLayoutManager(this@MainActivity)
            }

        }

        )
        albumViewModel.live_allData.observe(this, Observer { _allData ->
            Toast.makeText(this, _allData.meta.code, Toast.LENGTH_LONG).show()
        })


    }
}
