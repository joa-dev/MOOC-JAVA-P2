
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joa-dev
 */
public class Employees {

    List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
                .forEach(person -> list.add(person));
    }

    public void print() {
        list.stream()
                .forEach(emp -> System.out.println(emp.toString()));
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (education == person.getEducation()) {
                System.out.println(person.toString());
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (education == iterator.next().getEducation()) {
                iterator.remove();
            }
        }
    }
}
