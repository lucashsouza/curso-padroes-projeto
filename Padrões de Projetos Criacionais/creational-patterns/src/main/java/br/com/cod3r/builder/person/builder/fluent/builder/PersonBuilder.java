package br.com.cod3r.builder.person.builder.fluent.builder;

import br.com.cod3r.builder.person.builder.fluent.model.Person;

public class PersonBuilder {

    // Mandatory
    private String cpf;
    private String email;

    //Optionals
    private String name;
    private String phone;
    private Integer age;

    public PersonBuilder(String cpf, String email) {
        this.cpf = cpf;
        this.email = email;
    }

    public PersonBuilder andName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder andPhone(String phone){
        this.phone = phone;
        return this;
    }

    public PersonBuilder andAge(Integer age) {
        this.age = age;
        return this;
    }

    public Person getPerson() {
        return new Person(cpf, email, name, phone, age);
    }

}
