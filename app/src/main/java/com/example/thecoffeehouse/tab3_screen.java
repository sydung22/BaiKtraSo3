package com.example.thecoffeehouse;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class tab3_screen extends Fragment {
    private View view207;
    private orderScreen orderScreen;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public tab3_screen() {
    }
    public static tab3_screen newInstance(String param1, String param2) {
        tab3_screen fragment = new tab3_screen();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view207 = inflater.inflate(R.layout.fragment_tab3,container,false);
        recycle_list();
        return view207;
    }
    public void recycle_list(){
        RecyclerView order_recycle=view207.findViewById(R.id.doan_recycle);
        order_recycle.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new GridLayoutManager(orderScreen,2);
        order_recycle.setLayoutManager(linearLayoutManager);
        List<orderItem> orderItems = new ArrayList<>();
        orderItems.add(new orderItem("BÁNH MÌ CHÀ BÔNG PHÔ MAI","50,000 đ",R.drawable.monan1));
        orderItems.add(new orderItem("BÔNG LAN TRỨNG MUỐI","45,000 đ",R.drawable.monan2));
        orderItems.add(new orderItem("MOUSSE GẤU CHOCOLATE","39,000 đ",R.drawable.monan3));
        orderItems.add(new orderItem("GÀ XÉ LÁ CHANH","55,000 đ",R.drawable.monan4));
        orderItems.add(new orderItem("BÁNH MÌ QUE","12,000 đ",R.drawable.monan5));
        orderItems.add(new orderItem("CAM VÀNG SẤY DẺO","45,000 đ",R.drawable.monan6));
        orderItems.add(new orderItem("MOUSSE TIRAMISU","49.000đ",R.drawable.monan7));
        orderItems.add(new orderItem("GÀ XÉ LÁ CHANH","49.000đ",R.drawable.monan8));
        orderItems.add(new orderItem("MACCA PHỦ SOCOLA","39.000đ",R.drawable.monan9));
        orderItems.add(new orderItem("MÍT SẤY","29.000đ",R.drawable.monan10));
        orderItems.add(new orderItem("MOCHI KEM XOÀI","19.000đ",R.drawable.monan11));
        orderItems.add(new orderItem("MOCHI KEM MATCHA","19.000đ",R.drawable.monan12));
        orderAdapter orderAdapter=new orderAdapter(orderScreen,orderItems,R.layout.row_grid);
        order_recycle.setAdapter(orderAdapter);
    }
}