/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem.xmlhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author beso_
 */
@XmlRootElement(name = "restaurant")
@XmlType(propOrder = {"users", "tables", "dishes"})
public class Restaurant {

    private ListUsers users;
    private ListTables tables;
    private ListDishes dishes;

    public ListDishes getDishes() {
        return dishes;
    }

    public void setDishes(ListDishes dishes) {
        this.dishes = dishes;
    }

    public ListUsers getUsers() {
        return users;
    }

    public ListTables getTables() {
        return tables;
    }

    public void setTables(ListTables tables) {
        this.tables = tables;
    }

    public void setUsers(ListUsers users) {
        this.users = users;
    }

    public void marshal(String filename) {
        try {
            JAXBContext jaxbc = JAXBContext.newInstance(Restaurant.class);
            Marshaller marsh = jaxbc.createMarshaller();
            OutputStream os = new FileOutputStream(filename);
            marsh.marshal(this, os);
        } catch (FileNotFoundException | JAXBException e) {
            JOptionPane.showMessageDialog(null, "Cannot Save to File");
        }

    }

    public Restaurant unMarshal(String filename) throws FileNotFoundException {
        File xmlFile = new File(filename);
        try {
            JAXBContext jaxbc = JAXBContext.newInstance(Restaurant.class);
            Unmarshaller unmarsh = jaxbc.createUnmarshaller();
            Restaurant res = (Restaurant) unmarsh.unmarshal(xmlFile);
            return res;
        } catch (JAXBException e) {
            JOptionPane.showMessageDialog(null, "Cannot Load Data");
        }
        return null;

    }

}
