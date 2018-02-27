/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSPeriodicTableClasses;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author Miguel
 */
@Root
public class NewDataSet1 {
    @Element
    private Table1 Table;
    
    public Table1 getTable(){
        return Table;
    }
    public void setTable(Table1 Table){
        this.Table = Table;
    }
}
