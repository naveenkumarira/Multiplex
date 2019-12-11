package com.example.multiplex.meme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.core.meme.MemeUseCase
import com.example.data.data_source.network.RetrofitManager
import com.example.data.data_source.source.MemeRemoteData
import com.example.data.repository.IMemeRepositoryImpl

import com.example.multiplex.R

class MemeListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_meme_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        MemeListViewModel(
//            MemeUseCase(
//                IMemeRepositoryImpl(
//                    MemeRemoteData(
//                        RetrofitManager.getMemeService()
//                    )
//                )
//            )
//        )
    }




    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MemeListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MemeListFragment().apply {
               //TODO:
            }
    }
}
