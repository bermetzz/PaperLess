package com.example.hacathon.vm

import CategoryAdapter
import Doc
import RecentlyOpenedAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hacathon.R
import com.example.hacathon.databinding.FragmentMainBinding
import com.example.hacathon.model.Category

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Мок-данные для категорий
        val categories = listOf(
            Category("Design", R.drawable.ic_category),
            Category("Development", R.drawable.ic_category),
            Category("Cooking", R.drawable.ic_category),
            Category("Family", R.drawable.ic_category),
            // добавьте остальные категории
        )

        val categoryAdapter = CategoryAdapter(categories)
        binding.categoryRecyclerView.layoutManager = GridLayoutManager(requireContext(), 4)
        binding.categoryRecyclerView.adapter = categoryAdapter

        binding.recentlyOpenRecyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        val documents = listOf(
            Doc("Interview", R.drawable.category_background, "14 Mai 2024"),
            Doc("Powerful2", R.drawable.category_background, "14 Mai 2024"),
            Doc("Report", R.drawable.category_background, "13 Mai 2024"),
            Doc("Summary", R.drawable.category_background, "12 Mai 2024")
        )

        val adapter = RecentlyOpenedAdapter(documents)
        binding.recentlyOpenRecyclerView.adapter = adapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
