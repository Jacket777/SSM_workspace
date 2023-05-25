package com.msb.bean;

/**
 * Created by 17081290 on 2020/12/3.
 */
public class PersonA {
    private int id;
    private String name;
    private Integer age;
    private String gender;


    /**
     * 	当有多个参数个数相同，不同类型的构造器的时候，在配置文件中可以通过type来强制类型
     * @param id
     * @param name
     * @param age
     */
    public PersonA(int id, String name, Integer age) {
        System.out.println("========A=============");
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("Age");
    }


    public PersonA(int id, String name, String gender) {
        System.out.println("========A===A==========");
        this.id = id;
        this.name = name;
        this.gender = gender;
        System.out.println("gengder");
    }

    @Override
    public String toString() {
        return "PersonA{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
