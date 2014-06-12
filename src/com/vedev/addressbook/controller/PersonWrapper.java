package com.vedev.addressbook.controller;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.vedev.addressbook.model.Person;

/**
 * Helper class to wrap a list of persons. This is used for saving the
 * list of persons to XML.
 *
 * @author Vik Ewoods
 * @version 1.0.0
 * @since 1.0.0
 */
@XmlRootElement(name = "Persons")

public class PersonWrapper {
    private List<Person> persons;

    @XmlElement(name = "Person")
    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
