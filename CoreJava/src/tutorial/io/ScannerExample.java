package tutorial.io;

import java.io.File;
import java.util.Scanner;
/*
    Create the employee structure
    Create a file with comma separated...
    file : employeelist.txt
    12,peter,st1,st2,zip
    13,peter,st1,st2,zip
    14,peter,st1,st2,zip
    15,peter,st1,st2,zip
    16,peter,st1,st2,zip

    read the file , and tokenize the content and create an employee object and store the content in it..

 */
public class ScannerExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("/Users/jrout/Development/Github/batch31/CoreJava/src/tutorial/Employee.txt"));
        // Employee emp = null;
        // Employee []employees = new Employee[10];
        while (scanner.hasNext()) {
            String eachLine = scanner.nextLine();
            String[] split = eachLine.split(",");
            // emp = new Employee();
            // emp.setId(split[0]);
            // employees[0] = emp;
            System.out.println(split[0]);
        }
    }
}
