package org.assignment.tlt;

class PersonalInfo {
    String name, middlename, lastname;

    PersonalInfo(String name, String middlename, String lastname) {
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
    }
}

class Q_092_ProfessionalInfo extends PersonalInfo {
    int id;
    String des;
    int salary;
    String skillset;

    Q_092_ProfessionalInfo(String name, String middlename, String lastname, int id, String des, int salary, String skillset) {
        super(name, middlename, lastname);
        this.id = id;
        this.des = des;
        this.salary = salary;
        this.skillset = skillset;
    }

    void show() {
        System.out.println("Name: " + name + " " + middlename + " " + lastname);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + des);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Skillset: " + skillset);
    }

    public static void main(String[] args) {
        Q_092_ProfessionalInfo info = new Q_092_ProfessionalInfo("Prajwal", "S.", "Majgaonkar", 101, "Software Engineer", 60000, "Java, React, SQL");
        info.show();
    }
}
