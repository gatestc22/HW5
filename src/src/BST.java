import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class  BST {
    // Integer type is used instead of int so that a null check may be done to see if an array spot
    // is empty
    private Integer [] arr;
    private int size;

    // do not modify
    public BST(){
        arr = new Integer[5];
        size = 0;
    } // my implementation: 2 lines


    /**
     * returns the index of the left child of the node at index parIdx,
     * it does not return the value at that index
     * note: this will not check if the return index is out of bounds
     * eg: getLeftIdx(3) should return 7
     */
    private int getLeftIdx(int parIdx){
        return (arr[parIdx] * 2) + 1;
    } // my implementation: 1 line

    /**
     * returns the index of the right child of the node at index parIdx,
     * it does not return the value at that index
     * note: this will not check if the return index is out of bounds
     * eg: getRightIdx(3) should return 8
     */
    private int getRightIdx(int parIdx){
        return (arr[parIdx] * 2) + 2;
    } // my implementation: 1 line

    /**
     * adds the value to the correct place in the BST
     * @param value : the value to be added
     */
    // IMPLEMENTATION NOTES:
    // this method signature assumes you will implement this iteratively, if you choose to implement it recursively,
    // you will have to add a helper method --- try to implement it iteratively for practice
    // the array might need to grow, if so, it must grow to a new size of (2*arr.length + 1)
    // don't be afraid of using a while(true) loop if you are guaranteed to exit the method inside the loop
    public void add(int value) {
        // TODO: implement this
        // TODO: 14/12 lines (delete 2)
        int i = 0;
        for (i = 0; arr[i] != null;) {
            try {
                i = getLeftIdx(i);
                if (arr[i] > value) i = getRightIdx(i);
            } catch (IndexOutOfBoundsException e) {
                grow();
            }
        }
        Integer[] tempArr = new Integer[arr.length];
        for (int j = 0; j < tempArr.length; j++) {
            if (j == i) {
                tempArr[j] = value;
            } else {
                tempArr[j] = arr[j];
            }
        }
        arr = tempArr;
    }  // my implementation: 12 lines not counting lines with just }

    // IMPLEMENTATION NOTES:
    // this must grow arr to a new size of (2*arr.length + 1)
    private void grow() {
        Integer[] arrTemp = new Integer[(arr.length * 2) + 1];
        for (int i = 0; i < arr.length; i++) {
            arrTemp[i] = arr[i];
        }
        arr = arrTemp;
    } // my implementation: 4 lines not counting lines with just }



    // IMPLEMENTATION NOTES:
    // this should not grow arr if the children of the node at index would be out of bounds
    // for arr  (be sure to check for oob before checking for null - consider a short circuit conditional for this)
    private boolean hasLeftChild(int parIdx) {
        return (this.getLeftIdx(parIdx) > 0);
    } // my implementation: 1 line

    // IMPLEMENTATION NOTES:
    // this should not grow arr if the children of the node at index would be out of bounds
    // for arr  (be sure to check for oob before checking for null - consider a short circuit conditional for this)
    private boolean hasRightChild(int parIdx) {
        return (this.getRightIdx(parIdx) > 0);
    } // my implementation: 1 line


    /**
     * @return true if the node at the index in arr is an external node or false otherwise
     */
    // IMPLEMENTATION NOTES:
    // this should not grow arr if the children of the node at index would be out of bounds
    // consider calling other class methods for this
    public boolean isExternal(int index) {
        // TODO: implement this
        return false; // STUD
    }// my implementation: 1 line

    /**
     * @return false if value is not in the bst or if the tree is empty
     * true if found
     */
    // IMPLEMENTATION NOTES:
    // do not change this method --- implement the recursive helper method
    public boolean search(int value) {
        return searchHelper(value, 0);
    } // leave this one line
    // this one is private, user should not know implementation details
    // this method will have the actual search logic...
    private boolean searchHelper(int value, int idx) {
        // TODO: implement this
        return false; // STUD
    }  // my implementation: 8 lines not counting lines with just }


    /**
     * returns the inOrder list of Integer node values
     * this traversal should give nodes in increasing sorted order
     * (should not be indexes in the list, should be node values)
     */
    // IMPLEMENTATION NOTES: this will be a recursive algorithm
    public ArrayList<Integer> inOrderList(int nodeIndex){
        // TODO: implement this
        return new ArrayList<Integer>(); // STUD
    } // my implementation: 7 lines  not counting lines with just }

    /*********************************************************************
     *
     * Don't change anything below this point
     *
     ********************************************************************/

    // for testing - do not modify
    public int getSize() {
        return size;
    }
    // for testing - do not modify
    public int getCapacity() {
        return arr.length;
    }
    // for testing - do not modify
    public Integer[] getArr() {
        return arr;
    }
}
