package ra.btnangcao;

import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        do {
            System.out.println("=======MENU======");
            System.out.println("1.Thêm mới học sinh");
            System.out.println("2.Sửa học sinh");
            System.out.println("3.Xóa học sinh");
            System.out.println("4.Tìm kiếm học sinh theo studentId");
            System.out.println("5.Sắp xếp theo tên học sinh từ a-z");
            System.out.println("6.In ra danh sách học sinh");
            System.out.println("7.Sắp xếp điểm tăng dần");
            System.out.println("8. Sắp xếp điểm giảm dần");
            System.out.println("9. Thoát");
            System.out.println("Chọn yêu cầu");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    // thêm mới học sinh
                    Student addStudent = new Student();
                    addStudent.input(sc);
                    students.add(addStudent);
                    break;
                case 2:
                    //Sửa học sinh
                    updateStudent();
                    break;
                case 3:
                    // Xoá học sinh
                    removeStudent();
                    break;
                case 4:
                    //Tìm kiếm học sinh theo studentId
                    searchStudent();
                    break;
                case 5:
                    //Sắp xếp theo tên học sinh từ a-z
                    Collections.sort(students, new Comparator<Student>() {
                        @Override
                        public int compare(Student student1, Student student2) {
                            return student1.getStudentName().compareTo(student2.getStudentName());
                        }
                    });
                    break;
                case 6:
                    // In ra danh sách học sinh
                    for (int i = 0; i < students.size(); i++) {
                        students.get(i).display();
                    }
                    break;
                case 7:
                    //Sắp xếp điểm tăng dần
                    Collections.sort(students, new Comparator<Student>() {
                        @Override
                        public int compare(Student student1, Student student2) {
                            return Double.compare(student1.getMark(), student2.getMark());
                        }
                    });
                    break;
                case 8:
                    //Sắp xếp điểm giảm dần
                    Collections.sort(students, new Comparator<Student>() {
                        @Override
                        public int compare(Student student1, Student student2) {
                            return Double.compare(student2.getMark(), student1.getMark());
                        }
                    });
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập từ 1-> 9");
            }
        } while (true);

    }

    // 2.Sửa học sinh
    public static void updateStudent(){
        System.out.println("Nhập Id sinh viên cần sửa");
        int idUpdate = Integer.parseInt(sc.nextLine());
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getStudentId() == idUpdate){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Mã học sinh không tồn tại");
        }else {
            Student updateStudent = students.get(index);

            System.out.println("Nhập Tên học viên");
            updateStudent.setStudentName(sc.nextLine());

            System.out.println("Nhập địa chỉ");
            updateStudent.setAddress(sc.nextLine());

            System.out.println("Nhập số điện thoại");
            updateStudent.setSdt(sc.nextLine());

            System.out.println("Nhập giới tính");
            updateStudent.setSex(Boolean.parseBoolean(sc.nextLine()));

            System.out.println("Nhập điểm");
            updateStudent.setMark(Double.parseDouble(sc.nextLine()));

            students.set(index, updateStudent);
            System.out.println("Bạn đã đổi thông tin thành công");
        }
    }
    // 3. Xoá học sinh
    public static void removeStudent(){
        System.out.println("Nhập Id sinh viên cần xoá");
        int idRemove = Integer.parseInt(sc.nextLine());
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getStudentId() == idRemove){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Mã học sinh cần xoá không tìm thấy");
        }else {
            students.remove(index);
        }
    }
    // Tìm kiếm theo Id
    public static void searchStudent(){
        System.out.println("Nhập Id sinh viên cần tìm kiếm");
        int idSearch = Integer.parseInt(sc.nextLine());
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getStudentId() == idSearch){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Học sinh không tìm thấy");
        }else {
            students.get(index).display();
        }
    }

}
