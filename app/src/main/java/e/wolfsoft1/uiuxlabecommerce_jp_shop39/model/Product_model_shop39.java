package e.wolfsoft1.uiuxlabecommerce_jp_shop39.model;

public class Product_model_shop39 {
    private final String feature_product_type;
    private final String feature_product_desc;
    private final Integer feature_product_image;
    private final String feature_product_price;

    public String getFeature_product_type() {
        return feature_product_type;
    }

    public String getFeature_product_desc() {
        return feature_product_desc;
    }

    public Integer getFeature_product_image() {
        return feature_product_image;
    }

    public String getFeature_product_price() {
        return feature_product_price;
    }

    public Product_model_shop39(Integer feature_product_image, String feature_product_price, String feature_product_type, String feature_product_desc) {
        this.feature_product_desc=feature_product_desc;
        this.feature_product_image=feature_product_image;
        this.feature_product_type=feature_product_type;
        this.feature_product_price=feature_product_price;

    }
}
