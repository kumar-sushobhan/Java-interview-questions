package com.sushobhan.readCSV;

public record TransactionData(String transactionDate, String transactionPlace, String productName, String productPrice,
                              String paymentMode, long transactionID) {

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
