package com.kodilla;

public class StringCollection {
    private Element collectionHead;
    private int size;

    public StringCollection() {
        collectionHead = null;
        size = 0;
    }

    public String getElement(int n) {
        if (n >= size)
            throw new ArrayIndexOutOfBoundsException();

        Element currentElement = collectionHead;

        for (int i = size - 1; i > n; i--) {
            currentElement = currentElement.getPrev();
        }
        return currentElement.getValue();
    }

    public void addElement(String s) {
        Element newElement = new Element(s);
        if (collectionHead != null) {
            collectionHead.setNext(newElement);
            newElement.setPrev(collectionHead);
        }
        collectionHead = newElement;
        ++size;
    }

    public boolean removeElement(String s) {
        Element currentElement = collectionHead;
        while (currentElement != null) {
            if (currentElement.getValue().equals(s)) {
                if (currentElement.getPrev() != null)
                    currentElement.getPrev().setNext(currentElement.getNext());
                if (currentElement.getNext() != null)
                    currentElement.getNext().setPrev(currentElement.getPrev());
                if (currentElement == collectionHead)
                    collectionHead = currentElement.getPrev();
                --size;
                return true;
            }
            currentElement = currentElement.getPrev();
        }
        return false;
    }
}
