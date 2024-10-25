import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hacathon.R

class RecentlyOpenedAdapter(private val documents: List<Doc>) :
    RecyclerView.Adapter<RecentlyOpenedAdapter.DocumentViewHolder>() {

    class DocumentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val documentThumbnail: ImageView = itemView.findViewById(R.id.document_thumbnail)
        val documentTitle: TextView = itemView.findViewById(R.id.document_title)
        val documentDate: TextView = itemView.findViewById(R.id.document_date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DocumentViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recently_opened, parent, false)
        return DocumentViewHolder(view)
    }

    override fun onBindViewHolder(holder: DocumentViewHolder, position: Int) {
        val document = documents[position]
        holder.documentThumbnail.setImageResource(document.thumbnail) // Установите изображение документа
        holder.documentTitle.text = document.title
        holder.documentDate.text = document.date
    }

    override fun getItemCount(): Int {
        return documents.size
    }
}
