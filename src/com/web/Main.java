package com.web;

public class Main {
     //Ex 1: Crea una classe Main i fes print de totes les seves variables i funcions
     public static void main(String[] args) {
          MyLinkedList<String> list = new MyLinkedList<>();
          MyLinkedList<String> list2 = new MyLinkedList<>();

          list.addFirst("hola");
          list.addFirst("adeu");
          list.get(0);
          list2.get(0);

          Node<String> node1 = new Node<>("hola",null, null);
          Node<String> node2 = new Node<>("1",node1, null);

          MyLinkedList<Integer> llista3 = new MyLinkedList<>();

          System.out.println("Size: " + llista3.size());
          llista3.addFirst(5);
          System.out.println("Size after adding element: " + llista3.size());
          llista3.set(0, 10);
          System.out.println("Value at index 0: " + llista3.get(0));
          llista3.remove(0);
          System.out.println("Size after removing element: " + llista3.size());


     }

}