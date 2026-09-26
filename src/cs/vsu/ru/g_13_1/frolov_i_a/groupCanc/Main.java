package cs.vsu.ru.g_13_1.frolov_i_a.groupCanc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        linkList mystack = new linkList();
//        assert mystack.size == 0: "ошибка, начальный размер стэка должен быть равен 0";
//        assert mystack.Head == null: "ошибка, голова в новом пустом стэке должна быть null";
//        System.out.println("тест 1 пройден");
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
//        assert mystack.size == 4: "ошибка размера стэка";
//        assert mystack.Head.value == 40: "ошибка значения головы";
//        System.out.println("тест 2 пройден");
        mystack.push(50);
        mystack.printList();
        mystack.cancel(3);
        mystack.printList();
//        assert mystack.size == 2: "ошибка размера стэка";
//        assert mystack.Head.value == 20: "ошибка значения головы";
//        System.out.println("тест 3 пройден");
        mystack.cancel(100);
//        assert mystack.size == 0: "ошибка размера стэка";
//        assert mystack.Head == null: "ошибка значения головы";
//        System.out.println("тест 4 пройден");
        mystack.printList();
    }
}