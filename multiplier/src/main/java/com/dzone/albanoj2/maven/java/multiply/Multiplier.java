package com.dzone.albanoj2.maven.java.multiply;

import com.dzone.albanoj2.maven.java.add.Adder;

public class Multiplier {
    
    private final Adder adder;
    
    public Multiplier(Adder adder) {
        this.adder = adder;
    }

    public long multiply(int a, int b) {
        
        if (a == 0 || b == 0) {
            return 0;
        }
        else {
            int product = 0;
            
            for (int i = 0; i < Math.abs(b); i++) {
                product = adder.add(Math.abs(a), product);
            }
            
            if (oppositeSigns(a, b)) {
                return -product;
            }
            else {
                return product;
            }
        }
    }
    
    private static boolean oppositeSigns(int x, int y) { 
        return (x > 0 && y < 0) || (x < 0 && y > 0);
    } 
}
