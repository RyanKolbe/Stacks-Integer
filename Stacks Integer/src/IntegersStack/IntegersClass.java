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
public class IntegersClass {

    private int[] data;
    private int top;

    public IntegersClass() {
        data = new int[5];
        top = -1;
    }

    public void push(int value) {
        top++;
        data[top] = value;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int peek() {
        return data[top];
    }

    public int pop() {
        int value = data[top];
        top--;
        return value;
    }
}
