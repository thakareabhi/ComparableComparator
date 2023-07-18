package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorImplementer {

    static Comparator<PeopleClass> nameComparator=new Comparator<PeopleClass>(){
        @Override
        public int compare(PeopleClass o1, PeopleClass o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static void main(String[] args){

        ArrayList<PeopleClass> peopleList=new ArrayList<>();
        PeopleClass p1=new PeopleClass("Abhinav","Nagpur",23);
        PeopleClass p2=new PeopleClass("Aniket","Pune",20);
        PeopleClass p3=new PeopleClass("Abhishek","Mumbai",29);
        peopleList.add(p1);
        peopleList.add(p2);
        peopleList.add(p3);

        Collections.sort(peopleList,nameComparator);

        peopleList.forEach(p->System.out.println(p.getAge()+" "+p.getCity()+" "+p.getName()));
    }
}
