package com.example.potluck.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by student on 6/21/17.
 */
@Entity
public class Signup {

    @Id
    private String name;

    private String food;

    public Signup()
    {


    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Signup{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
