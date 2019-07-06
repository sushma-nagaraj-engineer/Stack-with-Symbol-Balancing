package com.discretestructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Test<AnyType> {
	private static int size;

	public static void main(String[] args) throws StackException {
		MyStack arrlist = new MyStack();
		boolean flag = false;

		Scanner sc = new Scanner(System.in);

		System.out
				.println("Enter the number of symbols that needs to be balanced");
		size = sc.nextInt();

		ArrayList<String> myList = new ArrayList<String>();
		System.out.println("Enter the symbols into the array");

		for (int j = 0; j < size; j++) {
			myList.add(j, sc.next());
		}
		System.out.println("The symbols entered are" + "" + myList);

		

		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i).equals("[") || myList.get(i).equals("(")
					|| myList.get(i).equals("{")) {

				arrlist.push(myList.get(i));

			}
//Here every element pushed is compared with symbol entered from list
			if (myList.get(i).equals("]")) {
				if (MyStack.getTopElement().equals("[")) {
					MyStack.pop();
					flag = true;
					System.out.println("Matching found");
					continue;
				} else {
					flag = false;

					System.out
							.println("Error: Symbol popped is not matching  ");
					break;
				}
			} else if (myList.get(i).equals(")")) {
				if (MyStack.getTopElement().equals("(")) {
					MyStack.pop();
					flag = true;
					System.out.println("Matching found");
					continue;
				} else {
					flag = false;

					System.out
							.println("Error: Symbol popped is not matching  ");
					break;
				}
			} else if (myList.get(i).equals("}")) {
				if (MyStack.getTopElement().equals("{")) {
					System.out.println(MyStack.getTopElement());
					MyStack.pop();
					flag = true;
					System.out.println("Matching found");
					continue;
				} else {
					flag = false;

					System.out
							.println("Error: Symbol popped is not matching   ");
					break;
				}
			}

			sc.close();
		}
		if (flag == true)
			//Valid String if symbols match else invalid
			System.out.println("Valid String");
		else
			System.out.println("Invalid String");
		sc.close();

	}

	public static int getSize() {
		return size;
	}

	public static void setSize(int size) {
		Test.size = size;
	}

}
