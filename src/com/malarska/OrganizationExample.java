package com.malarska;

public class OrganizationExample {
    public static void main(String[] args) {
        Organisation<Employee> organisation = new Organisation<>();
        organisation.addParticipant(new Employee("Adam", "Programmer"));
        organisation.addParticipant(new Employee("Maciek", "Ingeneer"));
        organisation.addParticipant(new Employee("Wojtek", "CEO"));
        organisation.addParticipant(new Contractor("Bogdan", "Programme"));
        organisation.printAllParticipants();
    }
}
