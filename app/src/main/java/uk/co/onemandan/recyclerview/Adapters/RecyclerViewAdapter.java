package uk.co.onemandan.recyclerview.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import uk.co.onemandan.recyclerview.Classes.RecyclerViewItem;
import uk.co.onemandan.recyclerview.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    //The data set, all items within the RecyclerView
    private List<RecyclerViewItem> _recyclerViewItems;

    //The ViewHolder provides access to all views within the layout corresponding to the
    //RecyclerViewItem
    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView Title, Subtitle;

        ViewHolder(View itemView) {
            super(itemView);

            Title       = itemView.findViewById(R.id.tv_title);
            Subtitle    = itemView.findViewById(R.id.tv_subtitle);
        }
    }

    //Constructor to set the data set
    public RecyclerViewAdapter(List<RecyclerViewItem> recyclerViewItems){
        _recyclerViewItems = recyclerViewItems;
    }

    //Inflate the RecyclerView view with the layout corresponding to the RecyclerViewItem
    //data class
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent,false);
        return new ViewHolder(view);
    }

    //Set the contents of the RecyclerView item
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecyclerViewItem recyclerViewItem = _recyclerViewItems.get(position);

        holder.Title.setText(recyclerViewItem.GetTitle());
        holder.Subtitle.setText(recyclerViewItem.GetSubtitle());
    }

    //Return the size of the data set
    @Override
    public int getItemCount() {
        return _recyclerViewItems.size();
    }
}
