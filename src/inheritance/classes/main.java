/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.classes;

import java.io.FileNotFoundException;
import static java.lang.Boolean.TRUE;
import javax.xml.bind.JAXBException;
import restaurantsystem.gui.Home;

/**
 *
 * @author beso_
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws JAXBException, FileNotFoundException {

        new Home().setVisible(TRUE);     

    }

}
