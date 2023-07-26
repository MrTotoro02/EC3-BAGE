package pe.edu.idat

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.Model.Comida
import pe.edu.idat.databinding.FragmentDetailBinding
import pe.edu.idat.databinding.ItemspersonBinding

class RVComidaListAdaptar(var comida: List<Comida>): RecyclerView.Adapter<ComidaVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComidaVH {
        val binding = ItemspersonBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ComidaVH(binding)
    }

    override fun getItemCount(): Int = comida.size


    override fun onBindViewHolder(holder: ComidaVH, position: Int){
        holder.bind(comida[position])
    }
}

class ComidaVH(private var binding: ItemspersonBinding) : RecyclerView.ViewHolder(binding.root){
    fun bind(comida: Comida) {
        binding.imageView.setImageResource(R.drawable.imagen1)
        binding.txtid.text = "-${comida.idMeal}%"
        binding.txtnombrePlatillo.text = comida.strMeal
        binding.txtplatilloCategory.text = comida.strCategory
        binding.txtorigins.text = comida.strArea
    }

}