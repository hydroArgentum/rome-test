package com.rome.test;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        RomeClass newFeed;
        try {
            newFeed = new RomeClass();

            newFeed.printAttribute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
