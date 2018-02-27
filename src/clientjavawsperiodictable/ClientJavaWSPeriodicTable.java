package clientjavawsperiodictable;

import WSPeriodicTableClasses.NewDataSet1;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.simpleframework.xml.*;
import org.simpleframework.xml.core.Persister;
/**
 *
 * @author Miguel Navarro 
 */
public class ClientJavaWSPeriodicTable {
    Scanner scanner = new Scanner(System.in);
    int menuOption;
    String eleInput;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClientJavaWSPeriodicTable a = new ClientJavaWSPeriodicTable();
        a.menu();    
    }

    private static String getElementSymbol(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }

    private static String getAtoms() {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }

    private static String getAtomicWeight(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }
    
    private void runElementSymbol(){
        System.out.println("Introduce the name of the element in order to "
                + "get the symbol");
        eleInput = scanner.next();
        
        try {
            Serializer serializer = new Persister();
            String source = getAtomicNumber(eleInput);
            NewDataSet1 NewDataSet = new NewDataSet1();
            serializer.read(NewDataSet,source);
            
            System.out.println("Element Symbol is: " + NewDataSet.getTable().getSymbol());
            
        } catch (Exception ex) {
            System.out.println("EXCEPTION OCURRED");
        }
    }
    
    private void runAtoms(){
        System.out.println("Introduce the name of the element in order to "
                + "get the element name");
        eleInput = scanner.next();
        
        Serializer serializer = new Persister();
        String source = getAtomicNumber(eleInput);
        NewDataSet1 NewDataSet = new NewDataSet1();
        try {
            serializer.read(NewDataSet,source);
        } catch (Exception ex) {
            Logger.getLogger(ClientJavaWSPeriodicTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(NewDataSet.getTable().getElementName());
    }
    private void runAtomicNumber(){
        System.out.println("Introduce the name of the element in order to "
                + "get the Atomic Number");
        eleInput = scanner.next();
        
        Serializer serializer = new Persister();
        String source = getAtomicNumber(eleInput);
        NewDataSet1 NewDataSet = new NewDataSet1();
        try {
            serializer.read(NewDataSet,source);
        } catch (Exception ex) {
            Logger.getLogger(ClientJavaWSPeriodicTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
        System.out.println(NewDataSet.getTable().getAtomicNumber());
    }
    private void runAtomicWeight(){
        System.out.println("Introduce the name of the element in order to "
                + "get the element name");
        eleInput = scanner.next();
        
        Serializer serializer = new Persister();
        String source = getAtomicNumber(eleInput);
        NewDataSet1 NewDataSet = new NewDataSet1();
        try {
            serializer.read(NewDataSet,source);
        } catch (Exception ex) {
            Logger.getLogger(ClientJavaWSPeriodicTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
        System.out.println(NewDataSet.getTable().getAtomicWeight());
    }
    
    private void menu(){
        System.out.println("Type 1 to use the 'getElementSymbol()' "
                + "method.\nType 2 to use the 'getAtoms()' method.\nType 3 to"
                + "use the 'getAtomicNumber' method.\nType 4 to use the "
                + "'getAtomicWeith()' method.");
        
        menuOption = scanner.nextInt();
        switch (menuOption){
            case 1: runElementSymbol();
                break;
            case 2: runAtoms();
                break;
            case 3: runAtomicNumber();
                break;
            case 4: runAtomicWeight();
                break;
            default: System.out.println("Error");
        } 
    }
}
