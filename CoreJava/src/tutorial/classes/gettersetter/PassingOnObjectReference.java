package tutorial.classes.gettersetter;

import tutorial.classes.pojo.Employee;

public class PassingOnObjectReference {
    public static void main(String[] args) {
        PassingOnObjectReference getterSetterExample = new PassingOnObjectReference();

        Employee oldEmpRef = new Employee();
        oldEmpRef.setName("Sam");// this
        oldEmpRef.setAge(25);
        oldEmpRef.setDepartment("HR");
        oldEmpRef.setDesignation("Sr. HR");
        System.out.println("Name ="+ oldEmpRef.getName());

        getterSetterExample.changeName(oldEmpRef);
        System.out.println(oldEmpRef.getName());

        String name = "David";
        getterSetterExample.changeData(name);
        System.out.println(name); //

        // Pass by value , pass by Reference
        int age = 10; // premetive
        getterSetterExample.changeAge(age);
        System.out.println(age);
    }

    private void changeAge(int age) {
        age = 20;
        System.out.println("Age after change "+ age);
    }

    public void changeName(Employee employee) {
        employee.setName("Peter");
    }

    public void changeData(String name){
        name = "Test";
    }

/**
 *  // Pass by value , pass by Reference
 *
 *
 */

}
