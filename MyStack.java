package com.discretestructures;

import java.util.ArrayList;

public class MyStack {
	// This class contains the stack operations like push, pop,peek.
	// The stack is constructed using elements of he array list.

	static ArrayList<String> arr = new ArrayList<String>();
	static int top = -1;

	// PUSH Operation
	public String push(String pushval) throws StackException {
		int size = Test.getSize();
		if (top < size - 1) {
			top++;
			arr.add(top, pushval);

			System.out
					.println("The element" + pushval + " is pushed to Stack ");
			printElements();
			System.out.println();
			// A StackException Class handles Exception if any
		} else {
			throw (new StackException());

		}
		return pushval;

	}

	// POP Operation
	public static String pop() {

		if (top >= 0) {
			System.out.println("The top element" + arr.get(top)
					+ " is Popped out");
			top--;
		} else {
			System.out.println("No elements in stack");
		}
		return arr.get(top + 1);
	}

	// Peek Operation
	public static String getTopElement() throws StackException {
		return arr.get(top);
	}

	public void printElements() {
		if (top >= 0) {
			System.out.println("Contents of stack are:");
			for (int i = 0; i <= top; i++) {
				System.out.println(arr.get(i));
			}

		}
	}

}
