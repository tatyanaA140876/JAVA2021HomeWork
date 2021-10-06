package lesson5;

public class HomeWork5 {
        public static void main(String[] args) {
            Person[] persArray = new Person[5];
            persArray[0] = new Person("Ivanov Petr", "Engineer", "ivanov@mail.ru", "895512345",100000,49);
            persArray[1] = new Person("Petrov Ivan", "Developer", "petrov@mail.ru", "895512346",150000,28);
            persArray[2] = new Person("Sidorov Oleg", "Designer", "sidorov@mail.ru", "895512347",60000,45);
            persArray[3] = new Person("Medvedeva Anna", " Stylist", "medvedeva@mail.ru", "895512348",30000,30);
            persArray[4] = new Person("Sokolova Olga", "Secretary", "sokolova@mail.ru", "895512349",25000,25);
            for (Person person : persArray)
                if (person.getAge()>40)
                    System.out.println(person);

        }
}
class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person (String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}

