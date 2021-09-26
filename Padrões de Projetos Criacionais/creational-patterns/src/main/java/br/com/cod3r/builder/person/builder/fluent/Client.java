package br.com.cod3r.builder.person.builder.fluent;

import br.com.cod3r.builder.person.builder.fluent.builder.PersonBuilder;
import br.com.cod3r.builder.person.builder.fluent.model.Person;

public class Client {

    public static void main(String[] args) {
        Person firstPerson = new PersonBuilder("84490770871", "firstperson@email.com")
                .getPerson();
        System.out.println(firstPerson);

        Person secondPerson = new PersonBuilder("40651175852", "secondperson@email.com")
                .andName("Renata")
                .andAge(30)
                .getPerson();
        System.out.println(secondPerson);

        Person thirdPerson = new PersonBuilder("17706709809", "thirdperson@email.com")
                .andName("Sebastião")
                .andAge(71)
                .andPhone("(67) 10934-0735")
                .getPerson();
        System.out.println(thirdPerson);
    }

}
