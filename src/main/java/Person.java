public class Person {
    String name = "No name";


//    public Person() {
//    }

    public Person(String nm) {
        name = nm;
    }
}

class Employee extends Person {
    String empID = "0000";

    public Employee(String id) {
        super("");
        empID = id;
    }
}

 class Test {
    public static void main(String args[]) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }
}
