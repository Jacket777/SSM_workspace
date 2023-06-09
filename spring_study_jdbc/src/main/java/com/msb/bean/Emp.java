package com.msb.bean;

/**
 * Created by 17081290 on 2020/11/20.
 */
public class Emp {
    private int empno;
    private String ename;
    private int sal;

    public Emp() {
    }

    public Emp(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }


    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                '}';
    }
}
