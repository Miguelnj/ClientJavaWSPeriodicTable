/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSPeriodicTableClasses;

import org.simpleframework.xml.Element;

/**
 *
 * @author entrar
 */
public class ElementSymbol {
    @Element
    private String Symbol;
    
    public ElementSymbol(String symbol){
        this.Symbol = symbol;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        this.Symbol = symbol;
    }
    
}
