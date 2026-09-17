package cs.vsu.ru.g_13_1.frolov_i_a.groupCanc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        linkList mystack = new linkList();
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.push(50);
        mystack.printList();
        mystack.cancel(3);
        mystack.printList();
    }
}