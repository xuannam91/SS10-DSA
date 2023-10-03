import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> lists = new ArrayList<>();
//        lists.add ("Ha noi");
//        lists.add ("HCM");
//        lists.add ("da nang");
//        System.out.println(lists);
//
//        lists.set(1, "Phu tho");
//        System.out.println(lists);
//          xoá theo tên
//        lists.remove("Phu tho");
//        System.out.println(lists);
////        xoa 1 phần tử
//        lists.remove(1);
//        System.out.println(lists);
////        độ dài
//        lists.size();
////        xoa tất cả
//        lists.clear();
//
        LinkedList<String> linkerList = new LinkedList<>();
        linkerList.add("nam");
        linkerList.add("uy");
        linkerList.add("minh");

        System.out.println(linkerList);
        linkerList.addFirst("khánh");
        linkerList.addLast("Linh");
        System.out.println(linkerList);

//        Xoá phần tử đầu
        linkerList.removeFirst();
        linkerList.pollFirst();
//        Xoá phần tử cuối
        linkerList.removeLast();
        linkerList.pollLast();
    }
}