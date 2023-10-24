/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;
import javafx.scene.control.CheckBox;
/**
 *
 * @author vguru
 */
public class Book {

    private final String name;
    private final double price;
    public CheckBox select;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
        select = new CheckBox();
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public CheckBox getSelect() {
        return select;
    }

    public void setSelect(CheckBox select) {
        this.select = select;
    }//used to unselect checkbox when you leave customer home screen

}