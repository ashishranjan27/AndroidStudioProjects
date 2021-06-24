package com.ashishkudale.list_in_list.adapters;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ashishkudale.list_in_list.R;
import com.ashishkudale.list_in_list.RecyclerViewClickListner;
import com.ashishkudale.list_in_list.models.Subject;

import java.util.ArrayList;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.ViewHolder> {

    public ArrayList<Subject> subjects;
    private Context context;
    private RecyclerViewClickListner recyclerViewClickListner;
    private int position;


    public SubjectAdapter(ArrayList<Subject> subjects, Context context,RecyclerViewClickListner recyclerViewClickListner) {
        this.subjects = subjects;
        this.context = context;
        this.recyclerViewClickListner = recyclerViewClickListner;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_subject, parent, false);
        return new ViewHolder(view);
    }

//    @Override
//    public int getItemViewType(int position) {
//        subjects.get(position);
//        return super.getItemViewType(position);
//    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position) {

        holder.tvHeading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerViewClickListner.OnClickOnItem(position);
            }
        });


        holder.recyclerView.setAdapter(new ChapterAdapter(context, subjects.get(position).chapters,recyclerViewClickListner ));
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));

        holder.recyclerView.setHasFixedSize(true);
        holder.tvHeading.setText(subjects.get(position).subjectName);
    }

    @Override
    public int getItemCount() {
        return subjects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView;
        TextView tvHeading;

        public ViewHolder(View itemView) {

            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.rvChapters);
            tvHeading = (TextView) itemView.findViewById(R.id.tvSubjectName);

        }
    }
}
