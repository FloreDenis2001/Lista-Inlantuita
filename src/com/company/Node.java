package com.company;

import com.company.model.Masina;
public class Node {

    private Node next;
    private Masina masina;



    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Masina getMasina() {
        return masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }
}
