package com.xlccc.cc.homework;

/**
 * This is the interface you must implement to complete the assignment.
 * <p>
 * The interface defines the functionality required by a very simple
 * linked list for storing Strings in sorted lexicographic order.
 * Rather than providing an iterator (like the linked list in the Java API),
 * this simple linked list just provides direct access to the individual
 * nodes in the list.
 * <p>
 * This linked list also differs from the one in the Java API in
 * that it does not allow for duplicates of items to be stored. Instead,
 * a counter is associated with each node that gives the number
 * of copies of the item at that node.
 * <p>
 * It is part of COMPX201-20X Assignment 2.
 * This interface should not be modified in any way.
 *
 * @author Andrea Zanibellato
 * @date Oct 2020
 */
interface StringList {

    /**
     * This method inserts an item into the list at the correct position.
     * <p>
     * If the item doesn't exist add it in with a count of 1. If it does
     * exist add 1 to the count.
     *
     * @param s the item to add
     */
    void insert(String s);


    /**
     * This deletes an item from the list. If the item does not exist the
     * function should simply exit and not throw an exception or crash.
     * <p>
     * If the item exists and the count is > 1 then the count should
     * go down by one, otherwise the node should be deleted.
     *
     * @param s the String (i.e. item) to delete
     */
    void delete(String s);


    /**
     * Returns the count of the given String if the String is present in a node of the list,
     * or returns 0 if the String is not present.
     *
     * @param s the String that we are looking for
     * @return the count of the given String or 0 if the String is not in the list
     */
    int findCount(String s);


    /**
     * Obtain the first node in the linked list.
     *
     * @return the first node or null if list is empty
     */
    SNode firstNode();
}
