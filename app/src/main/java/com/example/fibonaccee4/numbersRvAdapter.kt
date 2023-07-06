//package com.example.fibonaccee4


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.fibonaccee4.R

class  numbersRvAdapter(var numbersList: List<String>): Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.numbers, parent, false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        val currentNumber = numbersList.get(position)
        holder.tvnumbers.text = currentNumber.toString()
    }

    override fun getItemCount(): Int {
        return numbersList.size
    }
}



class NumbersViewHolder(itemView: View): ViewHolder(itemView){                         // has an attribute view after creating this adapter class
    var tvnumbers: TextView = itemView.findViewById<TextView>(R.id.tvnumbers)
}
