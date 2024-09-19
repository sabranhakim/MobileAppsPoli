package com.sabran.mobileappspoli.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sabran.mobileappspoli.R
import com.sabran.mobileappspoli.model.GaleriModel

class GaleriAdapter(private val galeriList: ArrayList<GaleriModel>,
                    private val onItemClick: (GaleriModel) -> Unit) :
    RecyclerView.Adapter<GaleriAdapter.MyViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_galeri, parent, false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = galeriList[position]
        holder.bind(item)

        // Klik pada item grid
        holder.itemView.setOnClickListener {
            onItemClick(item)
        }
    }

    override fun getItemCount(): Int = galeriList.size

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.gambar1)

        fun bind(galeriModel: GaleriModel) {
            imageView.setImageResource(galeriModel.gambar1) // atau setImageURI jika dari URL atau URI
        }
    }
}