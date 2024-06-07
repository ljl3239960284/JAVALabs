package Homework13;
import java.util.ArrayList;

public class Invoice {
    String address;
    ArrayList<LineItem> itemList;

    public Invoice(){
        itemList = new ArrayList<LineItem>();
    }
    public void setLineItem(LineItem []list){
        for(int i=0;i<list.length;i++){
            itemList.add(list[i]);
        }
    }

    public double getTotal(){
        double total = 0;
        LineItem lineItem;

        for(int i=0;i<itemList.size();i++){
            lineItem = itemList.get(i);
            total = total + lineItem.getSubtotal();
        }
        return total;
    }
}
class LineItem{
    Product product;
    double qty;

    public LineItem(){

    }
    public void addProduct(Product p){
        if(product == null){
            product = p;
            qty = 1;
        }else{
            qty += 1;
        }
    }
    public double getSubtotal(){
        double total = qty * product.price;
        return total;
    }
}
class Product{
    String name;
    double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return name+':'+price;
    }
}
