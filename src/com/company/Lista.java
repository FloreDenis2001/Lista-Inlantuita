package com.company;

import com.company.model.Masina;

public class Lista {
    private Node head = null;

    public void addStart(Masina masina) {

        if (head == null) {

            head = new Node();
            head.setMasina(masina);
            head.setNext(null);
        } else {

            Node node = new Node();
            node.setMasina(masina);
            node.setNext(head);
            head = node;
        }
    }

    public Node iterator() {
        return this.head;
    }

    //afisarea
    public void afisareLista() {

        Node it = head;
        while (it != null) {
            System.out.println(it.getMasina());
            it = it.getNext();
        }
    }

    public void adaugaSfarsit(Masina masinaadaugata) {
        Node noulNod = new Node();
        Node it = head;
        while (it.getNext() != null) {
            it = it.getNext();
        }
        it.setNext(noulNod);
        noulNod.setNext(null);
        noulNod.setMasina(masinaadaugata);
    }

    //eraseStart
    public void eraseStart() {
        if (head != null) {
            head = head.getNext();
        }
    }

    //adaugarePoz
    public void adaugarePoz(int pozitie, Masina masina) {
        int countpoz = 0;
        Node it = head;
        Node adaugarenod = new Node();
        while (countpoz <= pozitie - 1) {
            it = it.getNext();
            countpoz++;
        }
        adaugarenod.setMasina(masina);
        adaugarenod.setNext(it.getNext());
        it.setNext(adaugarenod);
    }

    //eraseSfarsit

    public void eraseSfarsit() {
        Node it = head;
        while (it.getNext() != null && it.getNext().getNext() != null) {
            it = it.getNext();
        }
        it.setNext(null);

    }

    //erasePozitie
    public void erasePozitie(int position) {

        int count = 1;
        Node it = head;
        Node prev = null;

        try {
            while (count <= position - 1) {
                prev = it;
                it = it.getNext();
                count++;
            }
            prev.setNext(it.getNext());
        }catch (NullPointerException e){
            eraseStart();
        }

    }
}



