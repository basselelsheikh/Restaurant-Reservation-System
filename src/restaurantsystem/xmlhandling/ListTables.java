/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem.xmlhandling;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author beso_
 */
@XmlRootElement(name="tables")
public class ListTables {

    private ArrayList<TableXml> listtable = new ArrayList<>();
    @XmlElement(name="table")
    public ArrayList<TableXml> getListtable() {
        return listtable;
    }

    public void setListtable(ArrayList<TableXml> listtable) {
        this.listtable = listtable;
    }

}
