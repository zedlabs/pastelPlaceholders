package tk.zedlabs.placeholder_sample

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.zedlabs.pastelplaceholder.Pastel

class MainAdapter(private val imageSet: List<String>) :
    RecyclerView.Adapter<MainAdapter.MyViewHolder>() {

    class MyViewHolder(imageView: ImageView) : RecyclerView.ViewHolder(imageView)

    override fun getItemCount(): Int {
        return imageSet.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val imageView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false) as ImageView
        return MyViewHolder(imageView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val imageView = holder.itemView.findViewById<ImageView>(R.id.current_image)

        Glide.with(holder.itemView.context)
            .load(imageSet[position])
            .placeholder(Pastel().getColorDark())
            .transition(DrawableTransitionOptions.withCrossFade(300))
            .into(imageView)
    }

}