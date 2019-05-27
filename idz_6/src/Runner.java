import by.gsu.pmslab.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("src/file_in.txt"))) {
            List<Student> students = new ArrayList<>();
            while (scanner.hasNextLine()) {
                students.add(new Student(scanner.next(), scanner.next(), scanner.next(),
                        scanner.next(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next()));
            }
            Collections.sort(students);
            FileWriter writer = new FileWriter("src/file_out.txt");
            for (Student student : students) {
                String surname = student.getSurname();
                String name = student.getName();
                String patronymic = student.getPatronymic();
                String dateOfBirth = student.getDateOfBirth();
                String address = student.getAddress();
                int phoneNumber = student.getPhoneNumber();
                String faculty = student.getFaculty();
                int yearsOfStudy = student.getYearsOfStudy();
                String group = student.getGroup();
                writer.write(surname + " " + name + " " + patronymic + " " + dateOfBirth + " " + address + " "
                        + phoneNumber + " " + faculty + " " + yearsOfStudy + " " + group + " " + System.getProperty("line.separator"));
            }
            writer.close();
            for (Student student : students) {
                if (student.getDateOfBirth().equals("26.11.1998")) {
                    System.out.println(student);
                }
            }
            for (Student student : students) {
                if (student.getGroup().equals("MS-32") && student.getYearsOfStudy() == 3) {
                    System.out.println(student);
                }
            }
            for (Student student : students) {
                if (student.getGroup().equals("MS-32")) {
                    System.out.println(student);
                }
            }
            for (Student student : students) {
                if (student.getFaculty().equals("PIT") ) {
                    System.out.println(student);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}