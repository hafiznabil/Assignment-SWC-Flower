/**
 * program description: LabWork Flower
 *
 * programmer: MUHAMMAD HAFIZ NABIL BIN ZAINI
 * Date: 19 February 2024
 */
import java.util.Scanner;

public class Flower
{
    // instance variables - replace the example below with your own
    private String name;
    private String color;
    private double price;
    private int quantity;
    
    // Normal constructor with parameter
    public Flower(String name, String color, double price, int quantity ){
    this.name = name;
    this.color = color;
    this.price = price;
    this.quantity = quantity;
    }
    
    //Constructor without parameter
    public Flower(){
        this.name = "";
        this.color = "";
        this.price = 10;
        this.quantity = 20;
    }
    
    //retrievers (accessors / getters) for each data member
    public String getName(){
        return name;
    }
    
    public String getColor(){
        return color;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    //Mutators (setters) that sets all data members
    public void setName(String name) {
        this.name = name;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setPrice(double price) {
        this.price= price;
    }
    
    public void setQuantity(int quantity) {
        this.quantity= quantity;
    }
    
     @Override
    public String toString() {
        return "Flower Details:\n" +
                "Name ='" + name + "\n" +
                "Color =" + color + "\n" +
                "Price =" + price + "\n" +
                "Quantity =" + quantity;
    }
    
    //display flower name, color, price and quantity
    public static void main(String[] args) {
        Flower lavender = new Flower("Lavender", "Purple", 15.00, 30);
        System.out.println(lavender);//Display flower details using toString()
}
}
