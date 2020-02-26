/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders5;

import java.util.Objects;

/**
 *
 * @author Nurullah
 */
public class Human {
    
    private String nameSurname;
    private int age;

    public Human(String nameSurname, int age) {
        this.nameSurname = nameSurname;
        this.age = age;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " Human{" + nameSurname + " ,"+ age + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nameSurname);
        hash = 53 * hash + this.age;
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
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.nameSurname, other.nameSurname)) {
            return false;
        }
        return true;
    }
}
