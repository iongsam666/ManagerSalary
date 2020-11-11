/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tinh_Luong;

/**
 *
 * @author Admin
 */
public class Person {
    private String name;
    private int birthOfDay;
    private int birthOfMonth;
    private int birthOfYear;
    private String address;
    private boolean gender;

    public Person() {
    }

    public Person(String name, int birthOfDay, int birthOfMonth, int birthOfYear, String address, boolean gender) {
        this.name = name;
        this.birthOfDay = birthOfDay;
        this.birthOfMonth = birthOfMonth;
        this.birthOfYear = birthOfYear;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getBirthOfDay()
    {
        return birthOfDay;
    }
    public void setBirthOfDay(int birthOfDay)
    {
        this.birthOfDay = birthOfDay;
    }
    
    public int getBirthOfMonth()
    {
        return birthOfMonth;
    }
    public void setBirthOfMonth(int birthOfMonth)
    {
        this.birthOfMonth = birthOfMonth;
    }
    
    public int getBirthYear()
    {
        return birthOfYear;
    }
    public void setBirthOfYear(int birthOfYear)
    {
        this.birthOfYear = birthOfYear;
    }
    
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public boolean isGender()
    {
        return gender;
    }
    public void setGender(boolean gender)
    {
        this.gender = gender;
    }
    public String getGender()
    {
        return gender?"Male":"Female";
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthDay: " + birthOfDay + " / "+  birthOfMonth + " / " + birthOfYear + ", address=" + address + ", gender=" + this.getGender() + '}';
    }
    
    
}