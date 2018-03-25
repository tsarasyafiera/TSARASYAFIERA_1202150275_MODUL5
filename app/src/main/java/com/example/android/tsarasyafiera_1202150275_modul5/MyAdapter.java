package com.example.android.tsarasyafiera_1202150275_modul5;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by TSARA on 25/03/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.holder> {

    //deklarasi variable
    private Context mContext;
    private List<AddData> mList;
    int color;

    //konstruktor adapter
    public MyAdapter(Context cntx, List<AddData> list, int color){
        this.mContext=cntx;
        this.mList=list;
        this.color=color;
    }

    //menentukan viewholder untuk recyclerview
    @Override
    public MyAdapter.holder onCreateViewHolder(ViewGroup parent, int viewType) {
        //membuat view baru
        View view = LayoutInflater.from(mContext).inflate(R.layout.cardview, parent, false);
        holder mholder = new holder(view);
        return mholder;
    }

    //menyetting nilai yang didapatkan pada viewholder
    @Override
    public void onBindViewHolder(MyAdapter.holder holder, int position) {
        AddData data = mList.get(position);
        holder.ToDo.setText(data.getTodo());
        holder.Description.setText(data.getDesc());
        holder.Priority.setText(data.getPrior());
        holder.mcardview.setCardBackgroundColor(mContext.getResources().getColor(this.color));
    }

    //mendapatkan jumlah list
    @Override
    public int getItemCount() {
        return mList.size();
    }

    //mendapatkan list dari adapter
    public AddData getData(int position){
        return mList.get(position);
    }

    //menghapus list pada todolist
    public void deleteData(int i){
        //remove item yang terpilih
        mList.remove(i);
        //memberi notifikasi item yang di remove
        notifyItemRemoved(i);
        notifyItemRangeChanged(i, mList.size());
    }

    class holder extends RecyclerView.ViewHolder{
        //deklarasi variabel
        public TextView ToDo, Description, Priority;
        public CardView mcardview;
        public holder(View itemView){
            super(itemView);

            //mengakses id text view pada layout dan cardview
            ToDo = itemView.findViewById(R.id.headline);
            Description = itemView.findViewById(R.id.explanation);
            Priority = itemView.findViewById(R.id.number);
            mcardview = itemView.findViewById(R.id.cardlist);
        }
    }
}
