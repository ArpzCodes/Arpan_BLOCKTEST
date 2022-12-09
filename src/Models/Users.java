package Models;
import java.util.ArrayList;
public class Users {
    int userId;
    String fName;
    String lName;
    String email;
    ArrayList<Orders>Orders;

    public Users(int userId, String fName, String lName, String email, ArrayList<Models.Orders> orders) {
        this.userId = userId;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        Orders = orders;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Models.Orders> getOrders() {
        return Orders;
    }

    public void setOrders(ArrayList<Models.Orders> orders) {
        Orders = orders;
    }
}
