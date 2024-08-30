package pl.revolshen.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pl.revolshen.myapplication.databinding.DeveloperRowBinding

class UserAdapter(private val users: List<User>, private val onUserClick:(User)->Unit): RecyclerView.Adapter<UserAdapter.MyViewHolder>() {
    inner class MyViewHolder(binding: DeveloperRowBinding): RecyclerView.ViewHolder(binding.root) {
        val name = binding.nameTv
        val technology = binding.technologyTv
        val image = binding.imageViewRow

        init{
            binding.root.setOnClickListener{ onUserClick(users[adapterPosition])
            }
        }
    }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            return MyViewHolder(DeveloperRowBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }

        override fun getItemCount(): Int {
        return users.size
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.image.setImageResource(users[position].image)
            holder.name.text = users[position].name
            holder.technology.text = users[position].technology
        }
    }
