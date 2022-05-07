package com.cagataysencan.odev6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.cagataysencan.odev6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)
        tasarim.rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val playLists = ArrayList<Playlists>()

        val pl1 = Playlists("2,193,246 FOLLOWERS","Old School Metal","oldschool_metal")
        val pl2 = Playlists("645,167 FOLLOWERS","Heavy Metal","heavy_metal")
        val pl3 = Playlists("1,021,334 FOLLOWERS","Metal Ballads","metal_ballads")
        val pl4 = Playlists("1,213,690 FOLLOWERS","Metal Essentials","metal_essentials")
        val pl5 = Playlists("297,346 FOLLOWERS","Progressive Metal","progressive_metal")
        val pl6 = Playlists("156,491 FOLLOWERS", "Metal Covers","metal_covers")
        val pl7 = Playlists("132,792 FOLLOWERS","Thrash Metal","thrash_metal_essentials")
        val pl8 = Playlists("615,756 FOLLOWERS","00s Metal Classics","classic_00s_metals")

        playLists.add(pl1)
        playLists.add(pl2)
        playLists.add(pl3)
        playLists.add(pl4)
        playLists.add(pl5)
        playLists.add(pl6)
        playLists.add(pl7)
        playLists.add(pl8)


        val adapter = PlaylistAdapter(this,playLists)
        tasarim.rv.adapter = adapter
    }
}