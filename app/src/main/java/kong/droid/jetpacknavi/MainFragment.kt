package kong.droid.jetpacknavi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kong.droid.jetpacknavi.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.frag = this@MainFragment
    }

    fun moveToList(view: TextView) {
        val action =
            MainFragmentDirections
                .toList()
        view.findNavController().navigate(action)
    }

    fun moveToGrid(view: TextView) {
        val action =
            MainFragmentDirections
                .toGrid()
        view.findNavController().navigate(action)
    }
}