package by.gsu.pmslab;

public class Student implements Comparable<Student> {

    private String surname;
    private String name;
    private String patronymic;
    private String dateOfBirth;
    private String address;
    private int phoneNumber;
    private String faculty;
    private int yearsOfStudy;
    private String group;

    public Student() {}

    public Student(String surname, String name, String patronymic, String dateOfBirth, String address,
           int phoneNumber, String faculty, int yearsOfStudy, String group) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.yearsOfStudy = yearsOfStudy;
        this.group = group;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYearsOfStudy() {
        return yearsOfStudy;
    }

    public void setYearsOfStudy(int yearsOfStudy) {
        this.yearsOfStudy = yearsOfStudy;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return surname + ";"
                + name + ";"
                + patronymic + ";"
                + dateOfBirth + ";"
                + address + ";"
                + phoneNumber + ";"
                + faculty + ";"
                + yearsOfStudy + ";"
                + group + ";";
    }

    @Override
    public int compareTo(Student student) {
        return this.group.compareTo(student.group);
    }
}
