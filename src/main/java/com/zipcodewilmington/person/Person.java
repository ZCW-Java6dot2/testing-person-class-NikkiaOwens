package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    private String job;
    private int cars;
    private boolean iphone;
    private boolean android;
    private boolean parent;

    public Person() {
    this.name = "";
    this.age = Integer.MAX_VALUE;
    }




    public Person(int age) {
        this.age = age;

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public void setJob(String job) {
        this.job = job;
    }
    public String getJob() {
        return job;
    }
    public void setCars(int cars) {
        this.cars = cars;
    }
    public int getCars() {
        return cars;
    }
    public void setIphone(boolean iphone) {
        this.iphone = iphone;
    }
    public boolean getIphone(){
        return iphone;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;

    }

    public Integer getAge() {
        return age;
    }

    public void setAndroid(Boolean android) {
        this.android = android;
    }

    public boolean getAndroid() {
        return android;
    }

    public Boolean getParent() {
        return parent;
    }

    public void setParent(boolean parent) {
        this.parent = parent;
    }
}
