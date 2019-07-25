/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.slt.cursojava;

/**
 *
 * @author Guilherme
 */
// Testando o wrapper -128 até 127
public class TesteWrappers {

    public static void main(String[] args) {
//    public static Integer valueOf(int i) {
//        if (i >= -128 && i <= IntegerCache.high) {
//            return IntegerCache.cache[i + 128];
//        } else {
//            return new Integer(i);
//        }
//    }

        Integer wrapper1 = Integer.valueOf(127);
        Integer wrapper2 = Integer.valueOf(127);
        Integer wrapper3 = Integer.valueOf(128);
        Integer wrapper4 = Integer.valueOf(128);

        System.out.println(wrapper1 == wrapper2);
        System.out.println(wrapper3 == wrapper4);
    }
}
