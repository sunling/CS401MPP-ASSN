package lab7.homework.assignment.prob1.partB;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + salary + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return e.name.equals(name) && e.salary == salary;
    }

//    @Override
//    public int hashCode(){
//        int result = 17;
//        result += 31 * result + name.hashCode();
//        result += 31 * result + salary;
//        return result;
//    }
}
