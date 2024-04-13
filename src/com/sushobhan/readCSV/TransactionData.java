package com.sushobhan.readCSV;

public class TransactionData {
    private String transactionDate;
    private String transactionPlace;
    private String productName;
    private String productPrice;
    private String paymentMode;
    private long transactionID;

    public TransactionData(String transactionDate, String transactionPlace, String productName, String productPrice, String paymentMode, long transactionID) {
        this.transactionDate = transactionDate;
        this.transactionPlace = transactionPlace;
        this.productName = productName;
        this.productPrice = productPrice;
        this.paymentMode = paymentMode;
        this.transactionID = transactionID;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getTransactionPlace() {
        return transactionPlace;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public long getTransactionID() {
        return transactionID;
    }

    @Override
    public String toString() {
        return "TransactionData{" +
                "transactionDate='" + transactionDate + '\'' +
                ", transactionPlace='" + transactionPlace + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                ", transactionID=" + transactionID +
                '}';
    }
}
