package kong.droid.jetpacknavi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kong.droid.jetpacknavi.databinding.FragmentGridBinding

class GridFragment : Fragment() {
    lateinit var binding : FragmentGridBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGridBinding.inflate(inflater, container, false)
        return binding.root
    }
}