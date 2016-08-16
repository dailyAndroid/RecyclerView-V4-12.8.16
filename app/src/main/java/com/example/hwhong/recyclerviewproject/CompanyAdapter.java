package com.example.hwhong.recyclerviewproject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hwhong on 8/12/16.
 */
public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.MyViewHolder> {

    private List<Company> companyList;

    @Override
    public CompanyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CompanyAdapter.MyViewHolder holder, int position) {
        Company company = companyList.get(position);
        holder.name.setText(company.getName());
        holder.description.setText(company.getDescription());
        holder.image.setImageResource(company.getImage());
    }

    @Override
    public int getItemCount() {
        return companyList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, description;
        public ImageView image;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            description = (TextView) view.findViewById(R.id.description);
            image = (ImageView) view.findViewById(R.id.imageView);
        }
    }

    public CompanyAdapter(List<Company> companyList) {
        this.companyList = companyList;
    }
}
