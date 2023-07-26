package pe.edu.idat.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pe.edu.idat.R
import pe.edu.idat.databinding.FragmentFavoBinding


class FavoFragment : Fragment() {

    private lateinit var binding: FragmentFavoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentFavoBinding.inflate(inflater, container,false)
        return binding.root
    }


}
