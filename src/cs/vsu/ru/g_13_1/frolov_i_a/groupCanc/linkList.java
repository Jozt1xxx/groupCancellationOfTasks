package cs.vsu.ru.g_13_1.frolov_i_a.groupCanc;


public class linkList {
    Node Head;
    public void addFirst(int value){
        Node newNode =  new Node(value);
        if(Head == null){
            Head = newNode;
        }else {
            newNode.next = Head;
            Head = newNode;
        }
    }
//    public void addLast(int value){
//        Node newNode =  new Node(value);
//        if(Head == null){
//            Head = newNode;
//        }else{
//            Node curr = Head;
//            while (curr != null){
//                curr = curr.next;
//
//            }
//            curr.next = newNode;
//
//        }
//    }
//    public void removeFirst() {
//        if (Head == null) {
//            return;
//        }
//        } else {
//            Head = Head.next;
//        }
//    }
//    public void removeLast(){
//        if (Head == null) {
//            return;
//        } else if (Head == Tail) {
//            Head = null;
//            Tail = null;
//        }else{
//            Tail = Tail.prev;
//            Tail.next = null;
//        }
//
//    }
//    //задача от ии на поиск элемента
//    public boolean contains(int value){
//        Node curr = Head;
//        for (curr = Head; curr != null ; curr = curr.next) {
//            if(curr.value == value){
//                return true;
//            }
//        }
//        return false;
//    }
//    //задача от ии на вывод списка с конца
//    public void printReverse(){
//        Node curr = Tail;
//        while (curr != null){
//            System.out.print(curr.value + " -> ");
//            curr = curr.prev;
//        }
//        System.out.println("null");
//
//    }
//    //задача от ии на вырез числа
//    public boolean removeByValue(int value) {
//        Node curr = Head;
//
//        for (curr = Head; curr != null; curr = curr.next) {
//            if (curr.value == value) {
//                if (curr == Head) {
//                    removeFirst();
//                } else if (curr == Tail) {
//                    removeLast();
//                } else {
//                    curr.prev.next = curr.next;
//                    curr.next.prev = curr.prev;
//                }
//            }
//
//        }
//        return false;
//    }

    public void printList(){
        Node curr = Head;
        while (curr != null){
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.println("null");

    }

}
