package com.msb.bean;

/**
 * Created by 17081290 on 2020/11/3.
 */
public class Person {
    private int id;
    private String name;
    private Integer age;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;

    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public Person(int id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("Age");
    }

    public Person(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        System.out.println("gender");
    }

    public Person(){

    }

    public Person(int id, String name, Integer age, String gender) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.gender = gender;

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
