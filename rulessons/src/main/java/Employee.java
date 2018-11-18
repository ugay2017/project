public class Employee extends Person {

    private int empId;

    public Employee(String name, String gender, int id) {
        super(name, gender);
        this.empId = id;
    }

    public void work() {
      if(empId == 0) {
          System.out.println("Not work");
      }else {
          System.out.println("Work");
      }
    }

    public static void main(String[] args) {
       Person student = new Employee("Andre","Male",1);
        Person employee = new Employee("Andre","Male",0);


    student.work();
    employee.work();
    }
}
