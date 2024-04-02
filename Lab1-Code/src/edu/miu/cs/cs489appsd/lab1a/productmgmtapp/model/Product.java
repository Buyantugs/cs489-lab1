package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model;
import java.util.Date;
import java.util.UUID;

public class Product {
    private  String productId;
    private String productName;
    private Date dateSupplied;
    private Integer qtyInStock;
    private Double unitPrice;
    // Default constructor
    public Product() {
    }

    // Constructor with all fields
    public Product(String productId, String productName, Date dateSupplied, Integer qtyInStock, Double unitPrice) {
        this.productId=productId;
        this.productName=productName;
        this.dateSupplied = dateSupplied;
        this.qtyInStock = qtyInStock;
        this.unitPrice = unitPrice;
    }

    // Constructor without productID
    public Product(String productName, Date dateSupplied, Integer qtyInStock, Double unitPrice) {
        this.productId = UUID.randomUUID().toString();
        this.productName = productName;
        this.dateSupplied = dateSupplied;
        this.qtyInStock = qtyInStock;
        this.unitPrice = unitPrice;
    }

    // Getter methods
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Date getDateSupplied() {
        return dateSupplied;
    }

    public Integer getQtyInStock() {
        return qtyInStock;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    // Setter methods
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDateSupplied(Date dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public void setQtyInStock(Integer qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // toString method to represent Product details
    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", dateSupplied=" + dateSupplied +
                ", qtyInStock=" + qtyInStock +
                ", unitPrice=" + unitPrice +
                '}';
    }

}
