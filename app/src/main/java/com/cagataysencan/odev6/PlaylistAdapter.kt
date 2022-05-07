package com.cagataysencan.odev6

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cagataysencan.odev6.databinding.CardViewBinding

class PlaylistAdapter(var mContext : Context, var playLists : List<Playlists>) : RecyclerView.Adapter<PlaylistAdapter.CardTasarimTutucu>()   {
    inner class CardTasarimTutucu(tasarim : CardViewBinding) : RecyclerView.ViewHolder(tasarim.root) {
        var tasarim : CardViewBinding
        init {
            this.tasarim = tasarim
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardViewBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val playlist = playLists.get(position)
        val t = holder.tasarim

        t.imageView.setImageResource(mContext.resources.getIdentifier(playlist.imageName,"drawable",mContext.packageName))
        t.textViewFollower.text = playlist.followers
        t.textViewName.text = playlist.name

    }

    override fun getItemCount(): Int {
       return playLists.size
    }
}