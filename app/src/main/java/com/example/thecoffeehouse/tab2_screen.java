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

public class tab2_screen extends Fragment {
    private View view207;
    private orderScreen orderScreen;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public tab2_screen() {
    }
    public static tab2_screen newInstance(String param1, String param2) {
        tab2_screen fragment = new tab2_screen();
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
        view207 = inflater.inflate(R.layout.fragment_tab2,container,false);
        recycle_list();
        return view207;
    }
    public void recycle_list(){
        RecyclerView order_recycle=view207.findViewById(R.id.thucuong_recycle);
        order_recycle.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new GridLayoutManager(orderScreen,2);
        order_recycle.setLayoutManager(linearLayoutManager);
        List<orderItem> orderItems = new ArrayList<>();
        orderItems.add(new orderItem("CÀ PHÊ ĐÁ XAY","69.000đ",R.drawable.product_10));
        orderItems.add(new orderItem("CÀ PHÊ SỮA ĐÁ","69.000đ",R.drawable.coffee_2));
        orderItems.add(new orderItem("CÀ PHÊ ĐEN ĐÁ","69.000đ",R.drawable.coffee_1));
        orderItems.add(new orderItem("SINH TỐ CAM XOÀI","50,000 đ",R.drawable.product_1));
        orderItems.add(new orderItem("PHÚC BỒN TỬ CAM ĐÁ XAY","45,000 đ",R.drawable.product_11));
        orderItems.add(new orderItem("SÔ-CÔ-LA ĐÁ","45,000 đ",R.drawable.product_3));
        orderItems.add(new orderItem("TRÀ OOLONG PHÚC BỒN TỬ","55,000 đ",R.drawable.product_4));
        orderItems.add(new orderItem("TRÀ OOLONG HẠT SEN","49,000 đ",R.drawable.product_5));
        orderItems.add(new orderItem("TRÀ SỮA KHOAI MÔN","45,000 đ",R.drawable.product_6));
        orderItems.add(new orderItem("TRÀ OOLONG BƯỞI MẬT ONG","69.000đ",R.drawable.product_7));
        orderItems.add(new orderItem("TRÀ ĐÀO CAM SẢ","69.000đ",R.drawable.product_9));
        orderAdapter orderAdapter=new orderAdapter(orderScreen,orderItems,R.layout.row_grid);
        order_recycle.setAdapter(orderAdapter);
    }
}