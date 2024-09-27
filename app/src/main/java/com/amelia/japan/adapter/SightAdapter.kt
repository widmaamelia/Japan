package com.amelia.japan.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.amelia.japan.DetailWisata
import com.amelia.japan.R
import com.amelia.japan.model.Sight

class SightAdapter(private val sightList: List<Sight>, private val context: Context) :
    RecyclerView.Adapter<SightAdapter.SightViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SightViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_sight, parent, false)
        return SightViewHolder(view)
    }

    override fun onBindViewHolder(holder: SightViewHolder, position: Int) {
        val sight = sightList[position]
        holder.sightName.text = sight.name
        holder.sightLocation.text = sight.location
        holder.sightImage.setImageResource(sight.imageResId)




        // Menambahkan OnClickListener untuk item
        holder.itemView.setOnClickListener {
            // Intent untuk membuka DetailWisataActivity
            val intent = Intent(context, DetailWisata::class.java)
            intent.putExtra("SIGHT_NAME", sight.name)
            intent.putExtra("SIGHT_LOCATION", sight.location)
            intent.putExtra("SIGHT_IMAGE", sight.imageResId)
            intent.putExtra("SIGHT_TANGGAL", sight.tanggal)
            intent.putExtra("SIGHT_DESCRIPTION", sight.description)



            context.startActivity(intent)


        }
    }

    override fun getItemCount(): Int = sightList.size

    class SightViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sightImage: ImageView = itemView.findViewById(R.id.sightImage)
        val sightName: TextView = itemView.findViewById(R.id.sightName)
        val sightLocation: TextView = itemView.findViewById(R.id.sightLocation)
    }
}