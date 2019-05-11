package com.example.rypta.nthexam;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Test extends RecyclerView.Adapter<Test.InstaFeedViewHolder>{

        ArrayList<Profile> std;
        Context mctx;

        public Test(Context ctx,ArrayList<Profile>s)
        {
            mctx=ctx;
            std=s;
        }

        @NonNull
        @Override
        public InstaFeedViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater inflater=LayoutInflater.from(mctx);
            View v=inflater.inflate(R.layout.activity_test,null);
            return new InstaFeedViewHolder(v,mctx,std);
        }

        @Override
        public void onBindViewHolder(@NonNull InstaFeedViewHolder instaFeedViewHolder, int i) {
            instaFeedViewHolder.name.setText(std.get(i).getName());
            instaFeedViewHolder.name.setTextSize(11);
            instaFeedViewHolder.name.setTypeface(null, Typeface.BOLD);

            instaFeedViewHolder.SequenceNumber.setText(std.get(i).getSequenceNumber());

            instaFeedViewHolder.SequenceNumber.setTextSize(11);

            instaFeedViewHolder.SequenceNumber.setTypeface(null, Typeface.BOLD);
            instaFeedViewHolder.Date.setText(std.get(i).getCreateddate());

            instaFeedViewHolder.Date.setTextSize(11);

            instaFeedViewHolder.Date.setTypeface(null, Typeface.BOLD);
            instaFeedViewHolder.ExamName.setText(std.get(i).getExamName());

            instaFeedViewHolder.ExamName.setTextSize(11);

            instaFeedViewHolder.ExamName.setTypeface(null, Typeface.BOLD);



        }

        @Override
        public int getItemCount() {
            return std.size();
        }

        static class InstaFeedViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
        {
            Context ctx;
            ArrayList<Profile> prof=new ArrayList<Profile>();
            TextView name,SequenceNumber,Date,ExamName;
            RecyclerView rl;
            public InstaFeedViewHolder(View itemView,Context ctx,ArrayList<Profile>prof)
            {
                super(itemView);
                this.ctx=ctx;
                this.prof=prof;
                itemView.setOnClickListener(this);
                name=itemView.findViewById(R.id.NAME);
                SequenceNumber=itemView.findViewById(R.id.SQ);
                Date=itemView.findViewById(R.id.CD);
                ExamName=itemView.findViewById(R.id.EN);
                rl=itemView.findViewById(R.id.recyclerV);
            }

            @Override
            public void onClick(View v) {
                int pos=getAdapterPosition();
                Profile pro = this.prof.get(pos);
                if(pos!=0)
                    Toast.makeText(ctx,"{"+pro.SequenceNumber+":}"+"-"+"{"+pro.Name+"} selected",Toast.LENGTH_LONG).show();
            }
        }
}
