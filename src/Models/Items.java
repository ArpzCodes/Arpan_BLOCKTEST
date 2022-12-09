package Models;

public class Items {
    String itemName;
    int productId;
    String brand;
    int price;
    Boolean inStock;

    public Items(String itemName, int productId, String brand, int price, Boolean inStock) {
        this.itemName = itemName;
        this.productId = productId;
        this.brand = brand;
        this.price = price;
        this.inStock = inStock;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public void tshirtMethod(){
        System.out.println("Item Name: " + this.itemName);
        System.out.println("Code: " + this.productId);
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
    }
}


