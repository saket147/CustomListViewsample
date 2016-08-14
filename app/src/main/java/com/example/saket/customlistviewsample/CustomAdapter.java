package com.example.saket.customlistviewsample;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by saket on 29-Jul-16.
 */
public class CustomAdapter extends BaseAdapter
{
    String []result;
    Context context;
    int []imageid;
    public static LayoutInflater inflater=null;
    public CustomAdapter(MainActivity mainActivity,String[] programNameList,int[] programImages)
    {
        result=programNameList;
        imageid=programImages;
        context=mainActivity;
        inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);


    }
    public class Holder
    {
        TextView tv;
        ImageView imageView;
    }
    @Override
    public int getCount()
    {
        return result.length;
    }
    @Override
    public Object getItem(int position)
    {
        return position;
    }
    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(final int position, View counterView, ViewGroup parent)
    {
        Holder holder=new Holder();
        View rowView;
        rowView=inflater.inflate(R.layout.program_list,null);
        holder.tv=(TextView)rowView.findViewById(R.id.list);
        holder.imageView=(ImageView)rowView.findViewById(R.id.imgView);
        holder.tv.setText(result[position]);
        holder.imageView.setImageResource(imageid[position]);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Clicked"+result[position], Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                context.startActivity(intent);
            }
        });
        return rowView;
    }


}


