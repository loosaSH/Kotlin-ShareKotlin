package net.loosash.sharekotlin.demo

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.loosash.sharekotlin.R

class KTAdapter(context: Context, var datas: ArrayList<String>) : RecyclerView.Adapter<KTAdapter.ViewHolder>() {

    private val mInflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            mInflater.inflate(
                R.layout.activity_main,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            Log.e("xx","点击item")
        }
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}


