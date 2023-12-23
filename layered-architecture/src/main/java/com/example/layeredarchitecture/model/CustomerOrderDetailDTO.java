package com.example.layeredarchitecture.model;

public class CustomerOrderDetailDTO {

    private String orderId;
    private  String customerName;
    private String date;
    private String total;

    public CustomerOrderDetailDTO() {
    }

    public CustomerOrderDetailDTO(String orderId, String customerName, String date, String total) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.date = date;
        this.total = total;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "CustomerOrderDetailDTO{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", date='" + date + '\'' +
                ", total='" + total + '\'' +
                '}';
    }
}
