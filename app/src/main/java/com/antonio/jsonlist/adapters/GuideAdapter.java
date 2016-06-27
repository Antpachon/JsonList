package com.antonio.jsonlist.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.antonio.jsonlist.R;
import com.antonio.jsonlist.model.Guide;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GuideAdapter extends RecyclerView.Adapter<GuideAdapter.GuideViewHolder> {

    private List<Guide> guideList;

    public GuideAdapter(List<Guide> guideList) {
        this.guideList = guideList;
    }

    @Override
    public GuideViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.guide_row, parent, false);
        GuideViewHolder vh = new GuideViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(GuideViewHolder holder, int position) {
        Guide guide = guideList.get(position);

        holder.textViewName.setText(guide.getName());
        holder.textViewEndDate.setText(guide.getEndDate());
        holder.textViewStateAndCity.setText(guide.getVenue().toString());
        Picasso.with(holder.imageViewIcon.getContext()).load(guide.getIcon()).into(holder.imageViewIcon);
    }

    @Override
    public int getItemCount() {
        return guideList.size();
    }

    public  static class GuideViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewStateAndCity;
        TextView textViewEndDate;
        ImageView imageViewIcon;

        public GuideViewHolder(View itemView) {
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewStateAndCity = (TextView) itemView.findViewById(R.id.textViewCityAndState);
            textViewEndDate = (TextView) itemView.findViewById(R.id.textViewEndDate);
            imageViewIcon = (ImageView) itemView.findViewById(R.id.imageViewIcon);
        }
    }
}
