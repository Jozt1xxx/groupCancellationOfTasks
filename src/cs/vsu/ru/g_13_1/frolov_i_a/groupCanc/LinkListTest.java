package cs.vsu.ru.g_13_1.frolov_i_a.groupCanc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LinkListTest {
    @Test
    public void testPushSize(){
        linkList stack = new linkList();
        Assertions.assertEquals(0, stack.size);
        stack.push(10);
        stack.push(20);
        Assertions.assertEquals(2, stack.size);
    }
    @Test
    public void CanelTest(){
        linkList stack = new linkList();
        stack.push(2);
        stack.push(30);
        stack.push(709);
        stack.push(33000);
        stack.push(23553467);
        stack.cancel(3);
        Assertions.assertEquals(2,stack.size);
    }
    @Test
    public void BigCanelTest(){
        linkList stack = new linkList();
        stack.push(121);
        stack.push(122);
        stack.push(123);
        stack.push(124);
        stack.cancel(122334232);
        Assertions.assertEquals(0,stack.size);
    }


}
