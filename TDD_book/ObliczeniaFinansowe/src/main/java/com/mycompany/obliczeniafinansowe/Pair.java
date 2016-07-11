
package com.mycompany.obliczeniafinansowe;

import java.util.Objects;

public class Pair {
    private String from;
    private String to;
    public Pair(String a_from, String a_to){
        from = a_from;
        to = a_to;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Pair){
            Pair objPair = (Pair)obj;
            if (objPair.from.equals(from) && objPair.to.equals(to))
                return true;
        }
        return false;
            
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.from);
        hash = 53 * hash + Objects.hashCode(this.to);
        return hash;
    }
}
