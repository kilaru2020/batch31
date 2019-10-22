package tutorial.classes.gettersetter;

import tutorial.classes.pojo.Employee;

public class GetterSetterExample {
    public static void main(String[] args) {
        GetterSetterExample getterSetterExample = new GetterSetterExample();

        Employee employee = new Employee();
        employee.setName("Peter");// this
        employee.setAge(30);
        employee.setDepartment("Computers");
        employee.setDesignation("Developer");

        employee.printInfo();

//        employee.workingHours();
        getterSetterExample.workingHours(employee);
    }

    public void workingHours(Employee employee) {
        if(employee.getDepartment().equals("Computers")){
            if(employee.getDesignation().equals("Developer")) {
                System.out.println("9:00 am to 7:00 pm");
            }else {
                System.out.println("10:00 am to 4:00 pm");
            }
        }else {
            System.out.println("7:00 am to 4:00 pm");
        }
    }


}
