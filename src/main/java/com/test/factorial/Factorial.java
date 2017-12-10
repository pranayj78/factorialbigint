/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.factorial;

import java.math.BigInteger;

/**
 *
 * @author Pranay
 */
public class Factorial {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    BigInteger bigInt = new BigInteger("455555");
    BigInteger counter = new BigInteger("1");
    BigInteger fact = new BigInteger("1");
    //System.out.println("counter.compareTo(bigInt) " +counter.compareTo(bigInt));
    boolean run = true;
    while(run) {
      fact = fact.multiply(counter);
      counter = counter.add(new BigInteger("1"));
      //System.out.println("counter is " +counter);
      if(counter.compareTo(bigInt) == 1 ) {
        run = false;
      }
    }
    System.out.println("factorial.Factorial.main() " + fact);
  }
  
}
