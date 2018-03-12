package com.viseator.viewtestsforfun

import android.content.Intent
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.main_list_content.view.*

/**
 * Created by wudi.viseator on 2018/3/12.
 * Wu Di
 * wudi.viseator@bytedance.com
 */
class MainListAdapter(private val activity: AppCompatActivity) :
        RecyclerView.Adapter<MainListAdapter.ViewHolder>() {
    internal var items = listOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.main_list_content, parent,
                        false))
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.main_text.text = items[position]
        when (position) {
            0 -> {
                holder.itemView.setOnClickListener {
                    val intent = Intent(activity, SharedElementTestActivity::class.java)
                    val options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity,
                            holder.itemView.main_avatar,
                            activity.resources.getString(R.string.activity_transition))
                    activity.startActivity(intent, options.toBundle())
                }
            }
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}