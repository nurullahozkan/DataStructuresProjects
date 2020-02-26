/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders5_lab;

import java.util.Objects;

/**
 *
 * @author Nurullah
 */
public class Human {
        public String ad;
    public int yas;

    public Human(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Human["  + ad + "," + yas + ']';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.ad);
        hash = 53 * hash + this.yas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Human other = (Human) obj;
        if (this.yas != other.yas) {
            return false;
        }
        if (!Objects.equals(this.ad, other.ad)) {
            return false;
        }
        return true;
    }
}
