package com.sinothk.view.image9.demo.style1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;

import com.sinothk.view.image9.style1.ImageNice9Layout;
import com.sinothk.view.image9.demo.R;

import java.util.List;


/**
 * Created by wxy on 2017/6/14.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<DemoEntity> mDemoEntities;
    private Context mContext;

    public ListAdapter(Context mContext, List<DemoEntity> demoEntities) {
        this.mContext = mContext;
        mDemoEntities = demoEntities;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.mImageNice9Layout.bindData(mDemoEntities.get(position).pictures);

        holder.mImageNice9Layout.setItemDelegate(new ImageNice9Layout.ItemDelegate() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(mContext, "位置" + position, Toast.LENGTH_SHORT).show();
            }
        });

        holder.rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Item = " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDemoEntities.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageNice9Layout mImageNice9Layout;
        LinearLayout rootView;

        public ViewHolder(View itemView) {
            super(itemView);

            rootView = itemView.findViewById(R.id.rootView);
            mImageNice9Layout = itemView.findViewById(R.id.item_nice9_image);
        }
    }
}
