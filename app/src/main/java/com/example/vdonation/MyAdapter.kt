package com.example.vdonation

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.firebase.database.core.view.View

//class MyAdapter(private val context: Context, private var dataList: List<DataClass>) : RecyclerView.Adapter<MyViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
//        return MyViewHolder(view)
//    }
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        Glide.with(context).load(dataList[position].dataImage)
//            .into(holder.recImage)
//        holder.vieworgName.text = dataList[position].dataName
//        holder.address1.text = dataList[position].dataAddress1
//        holder.address2.text = dataList[position].dataAddress2
//        holder.contact.text = dataList[position].phone
//        holder.recCard.setOnClickListener {
//            val intent = Intent(context, DetailActivity::class.java)
//            intent.putExtra("Image", dataList[holder.adapterPosition].dataImage)
//            intent.putExtra("Description", dataList[holder.adapterPosition].dataName)
//            intent.putExtra("Title", dataList[holder.adapterPosition].dataAddress1)
//            intent.putExtra("Priority", dataList[holder.adapterPosition].dataAddress2)
//            intent.putExtra("Priority", dataList[holder.adapterPosition].phone)
//            context.startActivity(intent)
//        }
//    }
//    override fun getItemCount(): Int {
//        return dataList.size
//    }
//    fun searchDataList(searchList: List<DataClass>) {
//        dataList = searchList
//        notifyDataSetChanged()
//    }
//}
//class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//    var recImage: ImageView
//    var vieworgName: TextView
//    var address1: TextView
//    var address2: TextView
//    var contact: TextView
//    init {
//        recImage = itemView.findViewBy(R.id.recImage)
//        vieworgName = itemView.findViewById(R.id.vieworgName)
//        address1 = itemView.findViewById(R.id.address1)
//        address2 = itemView.findViewById(R.id.address2)
//        contact = itemView.findViewById(R.id.contact)
//
//    }
//}