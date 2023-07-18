package org.example;

public class PeopleClass  implements Comparable<PeopleClass>{
    String name;
    String city;
    Integer age;

    public PeopleClass(String name, String city, Integer age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public int compareTo(PeopleClass o) {
        return this.getAge()-o.getAge();
        //                                                                                                                                                                                                                     return o.getAge()-this.getAge();
    }
}
