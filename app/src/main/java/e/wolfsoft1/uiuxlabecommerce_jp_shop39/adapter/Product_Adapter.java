package e.wolfsoft1.uiuxlabecommerce_jp_shop39.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop39.R;
import e.wolfsoft1.uiuxlabecommerce_jp_shop39.model.Product_model_shop39;

public class Product_Adapter extends RecyclerView.Adapter<Product_Adapter.MyProductHolder> {
    private final ArrayList<Product_model_shop39> productArrayList;
    private final Context context;

    public Product_Adapter(Context context, ArrayList<Product_model_shop39> productArrayList) {
        this.productArrayList = productArrayList;
        this.context = context;

    }

    @NonNull
    @Override
    public MyProductHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_product_39, viewGroup, false);
        return new MyProductHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyProductHolder myProductHolder, int i) {

        myProductHolder.feature_product_image.setImageResource(productArrayList.get(i).getFeature_product_image());
        myProductHolder.feature_product_price.setText(productArrayList.get(i).getFeature_product_price());
        myProductHolder.feature_product_type.setText(productArrayList.get(i).getFeature_product_type());
        myProductHolder.feature_product_desc.setText(productArrayList.get(i).getFeature_product_desc());

    }

    @Override
    public int getItemCount() {
        return productArrayList.size();
    }

    class MyProductHolder extends RecyclerView.ViewHolder {

        ImageView feature_product_image;
        TextView feature_product_price, feature_product_type, feature_product_desc;

        public MyProductHolder(@NonNull View itemView) {
            super(itemView);
            feature_product_image = itemView.findViewById(R.id.feature_product_image);
            feature_product_price = itemView.findViewById(R.id.feature_product_price);
            feature_product_type = itemView.findViewById(R.id.feature_product_type);
            feature_product_desc = itemView.findViewById(R.id.feature_product_desc);
        }
    }
}
