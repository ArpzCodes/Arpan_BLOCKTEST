import Models.Items;
import Models.Orders;
import Models.Users;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my tshirt store. My throat is sore.");
        Items item1 = new Items("Tshirt",494949,"Luca Faloni",19000,true );
        Items item2 = new Items("Tshirt",495050,"Asket",29000,true );
        Items item3 = new Items("Tshirt",496060,"Ralph Lauren",39000,false );



        ArrayList<Items> tshirts = new ArrayList<Items>();
        tshirts.add(item1);
        tshirts.add(item2);
        tshirts.add(item3);

        ArrayList<Orders> ordersMonday = new ArrayList<Orders>();
        Orders order1 = new Orders(112,"Monday", "Arpan",3,tshirts);
        Orders order2 = new Orders(122,"Monday", "Acharya",32,tshirts);
        ordersMonday.add(order1);
        ordersMonday.add(order2);

        Users user1 = new Users(11,"Arpan","Acharya","arpanacharya@gmail.com",ordersMonday);


//        !!!!!!!!!!!!!!!!!! QUESTION NO. 2 !!!!!!!!!!!!!!!!
        item1.tshirtMethod();
    }
}
