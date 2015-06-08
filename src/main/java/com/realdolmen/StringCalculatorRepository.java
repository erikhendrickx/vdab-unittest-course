package com.realdolmen;

public interface StringCalculatorRepository {
    Person find(int id);
    void save(Person person);
    void remove(Person person);
}
