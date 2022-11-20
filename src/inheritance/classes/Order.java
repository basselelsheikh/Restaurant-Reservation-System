/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.classes;

/**
 *
 * @author beso_
 */
public class Order {
    
    private Dish dish;
    private int quantity;
    private double price_per_dish;

    public Order() {
    }

    public Order(Dish dish, int quantity, double price) {
        this.dish = dish;
        this.quantity = quantity;
        this.price_per_dish = price;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice_per_dish() {
        return price_per_dish;
    }

    public void setPrice_per_dish(double price_per_dish) {
        this.price_per_dish = price_per_dish;
    }

    @Override
    public String toString() {
        return quantity + "x "+ dish +", "+ "price per dish: $" +  price_per_dish;
    }
    public String infoWithoutPrice() {
        return quantity + "x "+ dish;
    }
}






