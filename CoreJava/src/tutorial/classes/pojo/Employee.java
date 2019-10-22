package tutorial.classes.pojo;

public class Employee {
    private int age;
    private String name;
    private String designation;
    private String department;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 0) {
            this.age = 18;
        }else {
            this.age = age;
        }
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void setName(String nameX) {
        name = nameX;
    }

    public String getName(){
        return name;
    }

    public void printInfo(){
        System.out.println("Age = "+ age);
        System.out.println("name = "+ name);
        System.out.println("Desig = "+ designation);
        System.out.println("Dept = "+ department);
    }

    /*public void workingHours(){
        if(this.department.equals("Computers")){
            if(this.designation.equals("Developer")) {
                System.out.println("9:00 am to 7:00 pm");
            }else {
                System.out.println("10:00 am to 4:00 pm");
            }
        }else {
            System.out.println("7:00 am to 4:00 pm");
        }
    }*/
}
