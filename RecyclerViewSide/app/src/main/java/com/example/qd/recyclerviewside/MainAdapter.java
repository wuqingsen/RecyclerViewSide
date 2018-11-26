package com.example.qd.recyclerviewside;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.qd.recyclerviewside.utils.SwipeMenuLayout;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {
    private Context context;
    private LayoutInflater inflater;

    public MainAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = inflater.getContext();
        View view = inflater.inflate(R.layout.adapter_main, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.swipeMenuLayout.setIos(false);//设置是否开启IOS阻塞式交互
        holder.swipeMenuLayout.setLeftSwipe(true);//true往左滑动,false为往右侧滑动
        holder.swipeMenuLayout.setSwipeEnable(true);//设置侧滑功能开关

        holder.btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"置顶",Toast.LENGTH_SHORT).show();
            }
        });
        holder.btnUnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"标记未读",Toast.LENGTH_SHORT).show();
            }
        });
        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"删除",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        SwipeMenuLayout swipeMenuLayout;
        Button btnTop,btnUnRead,btnDelete;
        public MyViewHolder(View itemView) {
            super(itemView);
            swipeMenuLayout = itemView.findViewById(R.id.swipeMenuLayout);
            btnTop = itemView.findViewById(R.id.btnTop);
            btnUnRead = itemView.findViewById(R.id.btnUnRead);
            btnDelete = itemView.findViewById(R.id.btnDelete);
        }
    }
}

