package com.xlccc.cc.homework;

/**
 * This class contains the basic node structure for the linked list.
 * It is part of COMPX201-20X Assignment 2
 * This class should not be modified in any way
 *
 * @author Andrea Zanibellato
 * @date Oct 2020
 */
public class SNode {

    // Reference to next node
    private SNode nextNode;

    // The data stored in the node
    private String data;

    // The count of the String stored in the node
    private Integer count;

    /**
     * The default constructor.
     * Initializes count to one.
     */
    public SNode() {
        this.count = 1;
    }

    /**
     * Constructor that builds a node from a given String.
     * Initializes count to one.
     *
     * @param data the data
     */
    public SNode(String data) {
        this.count = 1;
        this.data = data;
        this.nextNode = null;
    }

    /**
     * Returns the current count of the node
     *
     * @return the count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Decrements the count of the node
     */
    public void decrement() {
        this.count--;
    }

    /**
     * Increments the count of the node
     */
    public void increment() {
        this.count++;
    }

    /**
     * Returns the String stored in the node
     *
     * @return The String data
     */
    public String getData() {
        return this.data;
    }

    /**
     * Returns the next node in the linked list
     *
     * @return The next node in the list
     */
    public SNode getNextNode() {
        return this.nextNode;
    }

    /**
     * Changes the next node in the list
     *
     * @param newnext The new value of nextNode
     */
    public void setNext(SNode newnext) {
        this.nextNode = newnext;
    }
}
