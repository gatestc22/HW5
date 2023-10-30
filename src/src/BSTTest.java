import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BSTTest {
    @Test
    public void simpleAddAndGrow() {
        BST bst = new BST();
        assertEquals(0, bst.getSize());
        assertEquals(5, bst.getCapacity());
        bst.add(1);
        assertEquals(1, bst.getSize());
        assertEquals(5, bst.getCapacity());
        bst.add(2);
        assertEquals(2, bst.getSize());
        assertEquals(5, bst.getCapacity());
        bst.add(3);
        assertEquals(3, bst.getSize());
        assertEquals(11, bst.getCapacity());
        bst.add(4);
        assertEquals(4, bst.getSize());
        assertEquals(23, bst.getCapacity());
    }
    @Test
    public void searchTest() {
        BST bst = new BST();
        bst.add(50);
        bst.add(20);
        bst.add(10);
        bst.add(30);
        bst.add(60);
        bst.add(80);
        bst.add(70);
        assertTrue(bst.search(50));
        assertTrue(bst.search(20));
        assertTrue(bst.search(10));
        assertTrue(bst.search(30));
        assertTrue(bst.search(60));
        assertTrue(bst.search(80));
        assertTrue(bst.search(70));
        Assertions.assertFalse(bst.search(9));
        Assertions.assertFalse(bst.search(25));
        Assertions.assertFalse(bst.search(100));
    }
    @Test
    public void ordering(){
        BST bst = new BST();
        bst.add(50);
        bst.add(20);
        bst.add(10);
        bst.add(30);
        bst.add(60);
        bst.add(80);
        bst.add(70);
        Integer[] arr = bst.getArr();
        Integer[] expected = {50, 20, 60, 10, 30, null, 80, null, null, null,
                null, null, null,70, null, null, null, null, null, null, null, null, null};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void traversal(){
        BST bst = new BST();
        bst.add(50);
        bst.add(20);
        bst.add(10);
        bst.add(30);
        bst.add(60);
        bst.add(80);
        bst.add(70);
        ArrayList<Integer> inOrder = bst.inOrderList(0);
        ArrayList<Integer> expected = new ArrayList<>(List.of(10,20,30,50,60,70,80));
        assertArrayEquals(expected.toArray(), inOrder.toArray());

    }

}
