public class Employee extends Person{

    public Employee(String employeeName) {
        super (employeeName);
    }

    public int getAge() {
        return this.age;
    }

    public void sayHello() {
        System.out.println("Welcome to BigUppsCorp - Peace Kings and Queens!");
    }

    public void doWork() {
        System.out.println("work, work, work");
    }

    public static void main(String[] args) {

        Person unEmployedDez = new Person("Subject Dez");
        unEmployedDez.sayHello();
        System.out.println();
        Employee dez = new Employee("King Dez");
        dez.sayHello();
        System.out.println();
        System.out.println("dez.name = " + dez.getName());

        dez.doWork();

    }
}
