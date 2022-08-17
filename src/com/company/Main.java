package com.company;

public class Main {

    public static void main(String[] args) {
	 LinkedList linkedList = new LinkedList();
     linkedList.add(1);
     linkedList.add(2);
     linkedList.add(3);
     linkedList.add(0,100);
     linkedList.contains(3);
     System.out.println(linkedList.contains(3));
     System.out.println(linkedList.indexOf(100));
	 System.out.println(linkedList);
    }
}
