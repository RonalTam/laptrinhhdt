/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12.model;

/**
 *
 * @author lakeh
 */
public class Counter {

    private static int count = 0;

    public Counter() {
        count = count + 1;
    }

    public static int getCount() {
        return count;
    }
    
}
