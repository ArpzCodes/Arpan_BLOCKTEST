package Models;

import java.util.ArrayList;

public class Orders {
    int orderId;
    String deliveryDay;
    String riderName;
    int noOfitems;
    ArrayList<Items> Items;

    public Orders(int orderId, String deliveryDay, String riderName, int noOfitems, ArrayList<Models.Items> items) {
        this.orderId = orderId;
        this.deliveryDay = deliveryDay;
        this.riderName = riderName;
        this.noOfitems = noOfitems;
        Items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryDay() {
        return deliveryDay;
    }

    public void setDeliveryDay(String deliveryDay) {
        this.deliveryDay = deliveryDay;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public int getNoOfitems() {
        return noOfitems;
    }

    public void setNoOfitems(int noOfitems) {
        this.noOfitems = noOfitems;
    }

    public ArrayList<Models.Items> getItems() {
        return Items;
    }

    public void setItems(ArrayList<Models.Items> items) {
        Items = items;
    }
}
