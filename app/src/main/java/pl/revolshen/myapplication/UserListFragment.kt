package pl.revolshen.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import pl.revolshen.myapplication.databinding.FragmentStartBinding
import pl.revolshen.myapplication.databinding.FragmentUserListBinding

class UserListFragment : Fragment() {
        private val mainVm by activityViewModels<MainViewModel>()
        private var _binding: FragmentUserListBinding? = null
        private val binding get() = _binding!!


        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            _binding = FragmentUserListBinding.inflate(inflater, container, false)
            return binding.root

        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = UserAdapter(
        users = mainVm.loadDataFromDb(),
        onUserClick = { user ->
            mainVm.setUser(user)
            findNavController().navigate(R.id.action_userListFragment_to_detailFragment)
        }
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter

    }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }

    }