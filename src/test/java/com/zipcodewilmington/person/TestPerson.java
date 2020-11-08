package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        String expectedJob = "";
        Integer expectedCars = Integer.MAX_VALUE;;
        Integer expectedIphone = Integer.MAX_VALUE;;
        Integer expectedAndroid = Integer.MAX_VALUE;
        Integer expectedWeight = Integer.MAX_VALUE;;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        String actualJob = person.getJob();
        Integer actualCars = person.getCars();
        Integer actualIphone = person.getIphone();;
        Integer actualAndroid = person.getAndroid();
        Integer actualWeight = person.getWeight();;

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedJob, actualJob);
        Assert.assertEquals(expectedCars, actualCars);
        Assert.assertEquals(expectedIphone, actualIphone);
        Assert.assertEquals(expectedAndroid, actualAndroid);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetJob() {
        // Given
        Person person = new Person();
        String expected = "Carpenter";

        // When
        person.setJob(expected);
        String actual = person.getJob();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetCars() {
        // Given
        Person person = new Person();
        Integer expected = 2;

        // When
        person.setCars(expected);

        // Then
        Integer actual = person.getCars();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetIphone() {
        // Given
        Person person = new Person();
        int expected = 1;

        // When
        person.setIphone(expected);

        // Then
        int actual = person.getIphone();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAndroid() {
        // Given
        Person person = new Person();
        int expected = 5;

        // When
        person.setAndroid(expected);

        // Then
        int actual = person.getAndroid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetParent() {
        // Given
        Person person = new Person();
        int expected = 5;

        // When
        person.setWeight(expected);

        // Then
       int actual = person.getWeight();
        Assert.assertEquals(expected , actual);
    }
}
