package ra.btnangcao;

import java.util.Scanner;

public class Student implements StudentService{
    private int studentId;
    private String studentName;
    private String address;
    private String sdt;
    private boolean sex;
    private double mark;

    public Student() {
    }

    public Student(int studentId, String studentName, String address, String sdt, boolean sex, double mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.sdt = sdt;
        this.sex = sex;
        this.mark = mark;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }



    @Override
    public void input(Scanner scanner) {
        System.out.println("Nhập ID");
        this.studentId = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập Tên học viên");
        this.studentName = scanner.nextLine();

        System.out.println("Nhập địa chỉ");
        this.address = scanner.nextLine();

        System.out.println("Nhập số điện thoại");
        this.sdt = scanner.nextLine();

        System.out.println("Nhập giới tính");
        this.sex = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Nhập điểm");
        this.mark = Double.parseDouble(scanner.nextLine());

    }

    @Override
    public void display() {
        System.out.printf("Mã Id: %d - Tên học sinh: %s - Địa chỉ: %s\n", this.studentId, this.studentName, this.address);
        System.out.printf("Sdt: %s - Giới tính: %b - Điểm: %f\n", this.sdt, this.sex, this.mark);
    }


}
