package com.ambev.projetopratico3;

public class Refrigerante extends Produto {
    private boolean comAcucar;

    public boolean isComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }
}