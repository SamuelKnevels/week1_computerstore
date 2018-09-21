package be.pxl.computerstore.hardware;

import java.util.Random;

public abstract class ComputerComponent {
    private String vendor;
    private String name;
    private Double price;
    private String articleNumber;
    private static int counter = 0;

    {
        counter++;
    }

    public ComputerComponent(String vendor, String name, Double price) {
        this.vendor = vendor;
        this.name = name;
        this.price = price;
        articleNumber = createArticleNumber();
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public String createArticleNumber() {
        StringBuilder builder = new StringBuilder();
        if (vendor.length() < 3){
            builder.append(vendor.toUpperCase());
            while (builder.length() < 3){
                builder.append("X");
            }
        } else {
            builder.append(vendor.substring(0,3).toUpperCase());
        }
        builder.append("-");
        builder.append(String.format("%05d", counter));
        return builder.toString();
    }

    @Override
    public String toString() {
        return name + " (" + articleNumber + ")";
    }
}
