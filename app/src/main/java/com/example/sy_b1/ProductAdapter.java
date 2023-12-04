package com.example.sy_b1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductAdapter extends BaseAdapter {

    Context context;
    Product data[];

    public ProductAdapter(Context context, Product[] data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return data[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View myView = LayoutInflater.from(context).inflate(R.layout.product_item_layout,null,true);

        ImageView prod_img = myView.findViewById(R.id.prod_img);
        TextView prod_name = myView.findViewById(R.id.prod_name);
        TextView prod_price = myView.findViewById(R.id.prod_price);

        prod_name.setText(data[i].getName());
        prod_price.setText(String.valueOf(data[i].getPrice()));
        prod_img.setImageResource(data[i].getProductImage());

        return myView;
    }
}
