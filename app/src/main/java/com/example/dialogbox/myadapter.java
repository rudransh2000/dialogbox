package com.example.dialogbox;

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

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder> {
    int []arr;
    public myadapter(int []arr){
        this.arr=arr;
    }
    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.details,parent,false);
        return new myviewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.img.setImageResource(arr[position]);
    }



    @Override
    public int getItemCount() {
        return arr.length;
    }

    class myviewholder extends RecyclerView.ViewHolder {

        ImageView img;
        Button btn;

        public myviewholder(@NonNull final View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            btn=itemView.findViewById(R.id.btn);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openn();
                }
            });

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openn();
                }
            });



        }
        void openn(){
            int pos = this.getAdapterPosition();
            Intent intent = new Intent(itemView.getContext(),recycle.class);
            intent.putExtra("Val",String.valueOf(pos));
            itemView.getContext().startActivity(intent);

        }


    }
}
