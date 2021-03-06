package com.adgvit.externals.RecyclerViewAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.adgvit.externals.JavaActivities.EventDetails;
import com.adgvit.externals.NetworkModels.EventModelNetwork;
import com.adgvit.externals.R;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.List;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class EventHomeAdapter extends RecyclerView.Adapter<ViewHolderEvents> {
    @NonNull
    @NotNull

    List<EventModelNetwork> list;
    Context context;

    public EventHomeAdapter(@NotNull Context context, List<EventModelNetwork> list) {
        this.list = list;
        this.context = context;
    }

    public ViewHolderEvents onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.card_view_home,parent,false);
        return new ViewHolderEvents(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolderEvents holder, int position) {
        Glide.with(context).load(list.get(position).getPosterURL()).into(holder.imageView);
        holder.heading.setText(list.get(position).getName());

        long date = list.get(position).getDate();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String convertedDate = sdf.format(new java.util.Date(date));

//        System.out.println("Name : " + list.get(position).getName() + " , Date  : " + convertedDate + " , Unix TimeStamp : " + date);

        holder.date.setText(convertedDate);

        holder.knowMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(context, EventDetails.class);
                    intent.setFlags(FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("event_id",list.get(position).get_id());
                    context.startActivity(intent);
                }catch (Exception e)
                {
                    Toast.makeText(context,"Event URL not found" + e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

class ViewHolderEvents extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView heading, date;
    Button knowMore;

    public ViewHolderEvents(@NonNull @NotNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imageView_events_home);
        heading = itemView.findViewById(R.id.heading_events_home);
        date = itemView.findViewById(R.id.date_events_home);
        knowMore = itemView.findViewById(R.id.know_more);
    }
}
