package com.example.companytask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.companytask.databinding.UserViewBinding

class UserAdapter(var usersList:ArrayList<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {


    inner class UserViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        var userViewBinding=UserViewBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.user_view,null))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.userViewBinding.name.text="${usersList[position].firstName}"
        holder.userViewBinding.lastName.text="${usersList[position].lastName}"
        holder.userViewBinding.age.text="${usersList[position].age}"
       // holder.userViewBinding.lat.text="${usersList[position].lat}"
        //holder.userViewBinding.lang.text="${usersList[position].lat}"
    }

    override fun getItemCount(): Int {
        return usersList.size
    }

}