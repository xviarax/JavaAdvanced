package CompanyRoster;

public class Employee {
    // mandatory = задължителни
    private String name;

    public double getSalary() {
        return salary;
    }

    private double salary;
    private String position;
    private String department;
    // optional
    private String email;
    private int age;

    public Employee(String name, double salary, String position, String department){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }
    public Employee(String name, double salary, String position, String department, String email, int age){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

  public Employee(String name, double salary, String position, String department, String email){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
    }
    public Employee(String name, double salary, String position, String department,int age){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
    }
        @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(name + " ").append(String.format("%.2f",salary) + " ");
        if (email!= null){
            sb.append(email + " ");
        } else {
            sb.append("n/a ");
        }

        if (age == 0){
            sb.append("-1");
        } else {
            sb.append(age);
        }
        return sb.toString();
        }


}
