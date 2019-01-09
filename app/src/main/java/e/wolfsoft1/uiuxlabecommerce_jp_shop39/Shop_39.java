package e.wolfsoft1.uiuxlabecommerce_jp_shop39;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.w3c.dom.Comment;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop39.adapter.ColorAdapter_39;
import e.wolfsoft1.uiuxlabecommerce_jp_shop39.adapter.CommentAdapter;
import e.wolfsoft1.uiuxlabecommerce_jp_shop39.adapter.Product_Adapter;
import e.wolfsoft1.uiuxlabecommerce_jp_shop39.adapter.SizeAdapter_39;
import e.wolfsoft1.uiuxlabecommerce_jp_shop39.adapter.ViewPagerAdapter_Shop39;
import e.wolfsoft1.uiuxlabecommerce_jp_shop39.model.Color_Model_39;
import e.wolfsoft1.uiuxlabecommerce_jp_shop39.model.Comment_model_Shop39;
import e.wolfsoft1.uiuxlabecommerce_jp_shop39.model.Product_model_shop39;
import e.wolfsoft1.uiuxlabecommerce_jp_shop39.model.Size_Model_39;

public class Shop_39 extends AppCompatActivity {

    ViewPager viewpager_shop39;
    RecyclerView size_recyclerview_39, color_recycler_39, product_recyclerview_39,comment_recyclerview39;

    private String size[] = {"X", "XL", "S", "XS", "XL", "XX", "L", "SL"};
    private Integer[] color = {R.drawable.ic_color39_1, R.drawable.ic_color39_2, R.drawable.ic_color39_3, R.drawable.ic_color39_4, R.drawable.ic_color39_5, R.drawable.ic_color39_6, R.drawable.ic_color39_7, R.drawable.ic_color39_8};

    private Integer[] feature_product_image = {R.drawable.panel1_shop39, R.drawable.panel_shop39,R.drawable.panel1_shop39, R.drawable.panel_shop39};
    private String[] feature_product_price = {"$500", "$786","$500", "$786"};
    private String[] feature_product_type = {"Summer dress", "Summer dress - coral summer","Summer dress", "Summer dress - coral summer"};
    private String[] feature_product_desc = {"Sometimes the scent of seasonal hand wash is all we need to rouse our holiday spirits. Available in an array of festive fragrances, our naturally derived gel hand wash.", "That’s a yeah, yeah phrase. As soon as a potential buyer reads excellent product quality he thinks, yeah, yeah, of course; that’s what everyone says. Ever heard someone ","Sometimes the scent of seasonal hand wash is all we need to rouse our holiday spirits. Available in an array of festive fragrances, our naturally derived gel hand wash.", "That’s a yeah, yeah phrase. As soon as a potential buyer reads excellent product quality he thinks, yeah, yeah, of course; that’s what everyone says. Ever heard someone "};

    private String[] commenter_name={"Elizabeth Rolson","Vanessa May"};
    private String[] comment_time={"01:34 PM","03:30 PM"};
    private String comment[]={"When will the discount be?","Great productю"};
    private Integer commenter_image[]={R.drawable.commentimage1,R.drawable.commentimage2};

    ArrayList<Size_Model_39> size_modelArrayList;
    ArrayList<Color_Model_39> color_modelArrayList;
    ArrayList<Product_model_shop39> productArrayList;
    ArrayList<Comment_model_Shop39> commentArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_39);

        viewpager_shop39 = findViewById(R.id.viewpager_shop39);
        size_recyclerview_39 = findViewById(R.id.size_recyclerview_39);
        color_recycler_39 = findViewById(R.id.color_recycler_39);
        product_recyclerview_39 = findViewById(R.id.product_recyclerview_39);
        comment_recyclerview39=findViewById(R.id.comment_recyclerview39);


        viewpager_shop39.setPageMargin(20);
        viewpager_shop39.setClipToPadding(false);
        ViewPagerAdapter_Shop39 viewPagerAdapter = new ViewPagerAdapter_Shop39(getSupportFragmentManager(), 3);
        viewpager_shop39.setAdapter(viewPagerAdapter);

        size_modelArrayList = new ArrayList<>();

        for (int i = 0; i < size.length; i++) {
            Size_Model_39 size_model = new Size_Model_39(size[i]);
            size_modelArrayList.add(size_model);
        }
        color_modelArrayList = new ArrayList<>();
        for (int i = 0; i < color.length; i++) {
            Color_Model_39 color_model = new Color_Model_39(color[i]);
            color_modelArrayList.add(color_model);
        }
        productArrayList = new ArrayList<>();
        for (int i = 0; i <feature_product_image.length; i++) {
            Product_model_shop39 product_model = new Product_model_shop39(feature_product_image[i], feature_product_price[i], feature_product_type[i], feature_product_desc[i]);
            productArrayList.add(product_model);
        }

        commentArrayList=new ArrayList<>();
        for(int i=0;i<commenter_image.length;i++){
            Comment_model_Shop39 comment_model=new Comment_model_Shop39(commenter_image[i],commenter_name[i],comment[i],comment_time[i]);
            commentArrayList.add(comment_model);
        }

        size_recyclerview_39.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        SizeAdapter_39 sizeAdapter = new SizeAdapter_39(this, size_modelArrayList);
        size_recyclerview_39.setAdapter(sizeAdapter);

        color_recycler_39.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ColorAdapter_39 adapter = new ColorAdapter_39(this, color_modelArrayList);
        color_recycler_39.setAdapter(adapter);

        product_recyclerview_39.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        Product_Adapter product_adapter = new Product_Adapter(this, productArrayList);
        product_recyclerview_39.setAdapter(product_adapter);

        comment_recyclerview39.setLayoutManager(new LinearLayoutManager(this));
        CommentAdapter commentAdapter=new CommentAdapter(this,commentArrayList);
        comment_recyclerview39.setAdapter(commentAdapter);



    }
}
