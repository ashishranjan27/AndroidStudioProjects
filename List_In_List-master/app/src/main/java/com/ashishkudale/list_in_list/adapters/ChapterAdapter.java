package com.ashishkudale.list_in_list.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ashishkudale.list_in_list.R;
import com.ashishkudale.list_in_list.RecyclerViewClickListner;
import com.ashishkudale.list_in_list.models.Chapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class ChapterAdapter extends RecyclerView.Adapter<ChapterAdapter.CustomViewHolder> {

    private Context context;
    private ArrayList<Chapter> chapters;
    RecyclerViewClickListner recyclerViewClickListner;

    public ChapterAdapter(Context context, ArrayList<Chapter> chapters,RecyclerViewClickListner recyclerViewClickListner) {
        this.context = context;
        this.chapters = chapters;
        this.recyclerViewClickListner=recyclerViewClickListner;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.single_chapter, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.tvChapterName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerViewClickListner.OnClickOnItem(position);
            }
        });
        Chapter chapter = chapters.get(position);
        holder.tvChapterName.setText(chapter.chapterName);

    }

    @Override
    public int getItemCount() {
        return chapters.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {


        public TextView tvChapterName;

        public CustomViewHolder(View itemView) {
            super(itemView);

            tvChapterName = (TextView) itemView.findViewById(R.id.tvChapterName);

        }
    }
}
