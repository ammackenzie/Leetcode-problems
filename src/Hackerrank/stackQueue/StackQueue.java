package Hackerrank.stackQueue;

import java.util.Stack;

public class StackQueue<T> {

    private Stack<T> stack = new Stack<>(), auxStack = new Stack<>();

    public void enqueue(T elem) {
        stack.push(elem);
    }

    public T dequeue() {
        if (auxStack.isEmpty()) {
            if (stack.isEmpty()) {
                System.out.println("Queue underflow");
                return null;
            }
            while (!stack.isEmpty()) {
                auxStack.push(stack.pop());
            }
        }
        return auxStack.pop();
    }

    public T peek() {
        if (auxStack.isEmpty()) {
            if (stack.isEmpty()) {
                System.out.println("Queue underflow");
                return null;
            }
            while (!stack.isEmpty()) {
                auxStack.push(stack.pop());
            }
        }
        return auxStack.peek();
    }

}
