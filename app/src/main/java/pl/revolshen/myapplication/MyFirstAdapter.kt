package pl.revolshen.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import pl.revolshen.myapplication.databinding.ContactRowBinding

class MyFirstAdapter(private val contacts: List<Contact>): RecyclerView.Adapter<MyFirstAdapter.MyViewHolder>() {

    inner class MyViewHolder(biding: ContactRowBinding): ViewHolder(biding.root){
        val nameTv = biding.nameTv
        val numberTv = biding.numberTv
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val contactRowBinding = ContactRowBinding.inflate(inflater,parent,false)
        return MyViewHolder(contactRowBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nameTv.text = contacts[position].name
        holder.numberTv.text = contacts[position].number
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

}