/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem.xmlhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import inheritance.classes.Customer;

/**
 *
 * @author beso_
 */

@XmlRootElement(name="customers")
public class ListCustomerData {
    private ArrayList <Customer> listcustomer =new ArrayList<>();
    @XmlElement(name="customer")
    public ArrayList <Customer> getListcustomer() {
        return listcustomer;
    }

    public void setListcustomer(ArrayList <Customer> listcustomer) {
        this.listcustomer = listcustomer;
    }
    public void marshal() throws JAXBException, FileNotFoundException {
       try{
            JAXBContext jaxbc = JAXBContext.newInstance(ListCustomerData.class);
            Marshaller marsh = jaxbc.createMarshaller();

            OutputStream os = new FileOutputStream("./customerdata.xml");
            marsh.marshal(this, os);
       }
         catch (FileNotFoundException | JAXBException e) {
            JOptionPane.showMessageDialog(null, "Cannot Save to File");
         }

    }

    public ListCustomerData unMarshal() throws FileNotFoundException {
        File xmlFile = new File("customerdata.xml");
        try {
            JAXBContext jaxbc = JAXBContext.newInstance(ListCustomerData.class);
            Unmarshaller unmarsh = jaxbc.createUnmarshaller();
            ListCustomerData c = (ListCustomerData) unmarsh.unmarshal(xmlFile);
            return c;
        } catch (JAXBException e) {
            JOptionPane.showMessageDialog(null, "Cannot Load Data");
        }
        return null;

    }
    
    
}
