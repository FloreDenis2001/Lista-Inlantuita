package com.company.model;

public class Masina implements Comparable {
    private int id;
    private String marca;
    private int an;
    private String culoare;

    public Masina(int id, String name, int an, String culoare) {
        this.id = id;
        this.marca = name;
        this.an = an;
        this.culoare = culoare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        String text = "Marca : " + this.marca + "\n";
        text += "Anul : " + this.an + "\n";
        text += "Culoare : " + this.culoare + "\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        Masina x = (Masina) o;
        return this.getAn() == x.getAn();
    }

    @Override
    public int compareTo(Object o) {
        Masina x=(Masina)o;
        if(this.getAn()>x.getAn()){
            return 1;
        }else if(this.getAn()<x.getAn()){
            return -1;
        }else {
            return 0;
        }
    }
}
