package com.vedev.addressbook.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/*
Main class for person
@model - Person
@version 1.0.0
TODO: Add ability to edit contacts and save them
TODO: Add ability to save and fetch data from server
TODO: Store data on server!!!! @main task
 */

public class Person {
    /**
     * Define variables
     *
     * @author Vik Ewoods
     * @version 1.0.0
     */
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty fullName;
    private final StringProperty addressOfPerson;
    private final StringProperty firstTelNumber;
    private final StringProperty secondTelNumber;
    private final StringProperty thirdTelNumber;
    private final StringProperty noteForPerson;

    /**
     * Defualt contructor
     */
    public Person(){
        this(null, null);
    }

    /**
     * Constructor with some initial data
     *
     * @param firstName
     * @param lastName
     * @author Vik Ewoods
     * @version 1.0.0
     */
    public Person(String firstName, String lastName){
        this.firstName       = new SimpleStringProperty(firstName);
        this.lastName        = new SimpleStringProperty(lastName);
        this.fullName        = new SimpleStringProperty(firstName + " " + lastName) ;
        // Default data
        this.addressOfPerson = new SimpleStringProperty("");
        this.firstTelNumber  = new SimpleStringProperty("");
        this.secondTelNumber = new SimpleStringProperty("");
        this.thirdTelNumber  = new SimpleStringProperty("");
        this.noteForPerson   = new SimpleStringProperty("");
    }

    /**
     * Default function to get, set and properties first name of person
     * @return firstName
     */
    public String getFirstName(){
        return firstName.get();
    }

    public void setFirstName(String firstName){
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty(){
        return firstName;
    }

    /**
     * Default function to get, set and properties last name of person
     * @return lastName
     */
    public String getLastName(){
        return lastName.get();
    }

    public void setLastName(String lastName){
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty(){
        return lastName;
    }

    /**
     * Default function to get, set and properties last name of person
     * @return fullName
     */
    public String getFullName(){
        return fullName.get();
    }

    public void setFullName(String fullName){
        this.fullName.set(fullName);
    }

    public StringProperty FullNameProperty(){
        return fullName;
    }

    /**
     * Default function to get, set and properties address of person
     * @return addressOfPerson
     */
    public String getAddressOfPerson(){
        return addressOfPerson.get();
    }

    public void setAddressOfPerson(String addressOfPerson){
        this.addressOfPerson.set(addressOfPerson);
    }

    public StringProperty AddressOfPersonProperty(){
        return addressOfPerson;
    }

    /**
     * Default function to get, set and properties first number of person
     * @return firstTelNumber
     */
    public String getFirstTelNumber(){
        return firstTelNumber.get();
    }

    public void setFirstTelNumber(String firstTelNumber){
        this.firstTelNumber.set(firstTelNumber);
    }

    public StringProperty FirstTelNumberProperty(){
        return firstTelNumber;
    }

    /**
     * Default function to get, set and properties first number of person
     * @return secondTelNumber
     */
    public String getSecondTelNumber(){
        return secondTelNumber.get();
    }

    public void setSecondTelNumber(String secondTelNumber){
        this.secondTelNumber.set(secondTelNumber);
    }

    public StringProperty SecondTelNumberProperty(){
        return secondTelNumber;
    }

    /**
     * Default function to get, set and properties first number of person
     * @return thirdTelNumber
     */
    public String getThirdTelNumber(){
        return thirdTelNumber.get();
    }

    public void setThirdTelNumber(String thirdTelNumber){
        this.thirdTelNumber.set(thirdTelNumber);
    }

    public StringProperty ThirdTelNumberProperty(){
        return thirdTelNumber;
    }

    /**
     * Default function to get, set and properties first number of person
     * @return noteForPerson
     */
    public String getNoteForPerson(){
        return noteForPerson.get();
    }

    public void setNoteForPerson(String noteForPerson){
        this.noteForPerson.set(noteForPerson);
    }

    public StringProperty NoteForPersonProperty(){
        return noteForPerson;
    }
}
