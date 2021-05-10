/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegersStack;

/**
 *
 * @author Ryan Kolbe
 */
public class IntegersStackMain {

    public static void main(String[] args) {
        
        IntegersClass integers = new IntegersClass();

        integers.push(1);
        System.out.println("Element pushed: " + integers.peek());

        integers.push(2);
        System.out.println("Element pushed: " + integers.peek());

        integers.push(3);
        System.out.println("Element pushed: " + integers.peek());

        integers.push(4);
        System.out.println("Element pushed: " + integers.peek());

        System.out.println("Element popped: " + integers.pop());
        System.out.println("Element popped: " + integers.pop());
        System.out.println("Element popped: " + integers.pop());

        System.out.println("Element peeked: " + integers.peek());
    }
}