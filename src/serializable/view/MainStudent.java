package serializable.view;

import serializable.controller.StudentController;
import serializable.model.Student;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        System.out.println("mời ban nhập vào thông tin student");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Id");
        int id = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("name");
        String name = scanner1.nextLine();
        System.out.println("Age");
        int age = scanner1.nextInt();
        System.out.println("email");
        String email = scanner1.nextLine();
        Student student = new Student(id, name, age, email);
        StudentController.add(student);


    }
}
