package com.example.full_training.screens

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.full_training.common.factory.ViewMvcFactory
import com.example.full_training.model.User
import com.example.full_training.screens.userListItem.UserListItemViewMvc
import com.example.full_training.screens.userListItem.UserListItemViewMvcImpl

class UserListAdapter(
    private val listener: UserListAdapter.Listener,
    private val viewMvcFactory: ViewMvcFactory
) : RecyclerView.Adapter<UserListAdapter.UserListViewHolder>(),
    UserListItemViewMvc.Listener {

    interface Listener {
        fun onUserItemClicked(user: User)
    }

    override fun onUserItemClick(user: User) {
        listener.onUserItemClicked(user)
    }

    private var movies = arrayListOf<User>()
    private lateinit var userListItemViewMvcImpl: UserListItemViewMvcImpl

    fun bindMovies(user: List<User>) {
        movies.addAll(user)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListViewHolder {
        userListItemViewMvcImpl = viewMvcFactory.getUserListViewMvc(parent)
        userListItemViewMvcImpl.registerListener(this)
        return UserListViewHolder(userListItemViewMvcImpl)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: UserListViewHolder, position: Int) {
        holder.userListViewMvcImpl.bindMovie(movies[position])
    }

    data class UserListViewHolder(var userListViewMvcImpl: UserListItemViewMvc) :
        RecyclerView.ViewHolder(userListViewMvcImpl.getRootView())
}
