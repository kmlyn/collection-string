package com.kodilla;

public class Main {
    public static void main(String[] args) {
        StringCollection sc = new StringCollection();
        sc.addElement("Dawkins");
        sc.addElement("Russell");
        sc.addElement("Hitchens");
        sc.addElement("Dennett");
        System.out.println(sc.getElement(1));
        sc.removeElement("Dennett");
        System.out.println(sc.getElement(1));
    }
}
