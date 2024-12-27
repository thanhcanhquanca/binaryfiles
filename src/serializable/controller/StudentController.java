package serializable.controller;

import serializable.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentController implements Serializable {
    public static List<Student> students = new ArrayList<>();
    public static List<Student> getStudents(){
        return null;
    }




    public static void add(Student student){
        students.add(student);
        try {
            writeFile(students);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static void writeFile(List<Student> students) throws IOException {
        File file = new File("students.text");

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            fileOutputStream.close();
            objectOutputStream.close();
        }
    }

    public static List<Student> readFile() throws IOException {
        File file = new File("students.text");
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        List<Student> studentsList = new ArrayList<>();
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            objectInputStream = new ObjectInputStream(fileInputStream);
            studentsList = (List<Student>) objectInputStream.readObject();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            objectInputStream.close();
            fileInputStream.close();
        }
        return studentsList;
    }



}
