package com.tusu.santoecomerch.Pojo_Class;

public class Products {

    private String productNameKey,productName,lastPrice,updatePrice,quentityShow,imageUrl;
    private int currentPrice,count=0,productCountPrice=0,allTotalPrice=0;
    private double quentity=0;

    public Products(String productNameKey, String productName, String lastPrice, String updatePrice, int currentPrice, int count, String quentityShow, String imageUrl) {
        this.productNameKey = productNameKey;
        this.productName = productName;
        this.lastPrice = lastPrice;
        this.updatePrice = updatePrice;
        this.quentityShow = quentityShow;
        this.imageUrl = imageUrl;
        this.currentPrice = currentPrice;
        this.count = count;
        this.quentity = quentity;
    }

    public Products(String productNameKey, String productName, String updatePrice, String quentityShow, int currentPrice, int count, int productCountPrice, String imageUrl) {
        this.productNameKey = productNameKey;
        this.productName = productName;
        this.updatePrice = updatePrice;
        this.quentityShow = quentityShow;
        this.currentPrice = currentPrice;
        this.count = count;
        this.productCountPrice = productCountPrice;
        this.imageUrl=imageUrl;
    }


    public Products() {
    }

    public String getProductNameKey() {
        return productNameKey;
    }

    public String getProductName() {
        return productName;
    }

    public String getLastPrice() {
        return lastPrice;
    }

    public String getUpdatePrice() {
        return updatePrice;
    }

    public String getQuentityShow() {
        return quentityShow;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public double getQuentity() {
        return quentity;
    }

    public int getCount() {
        return count;
    }

    public int getProductCountPrice() {
        return productCountPrice;
    }
}
