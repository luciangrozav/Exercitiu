package org.fasttrackit;


public class App 
{
    public static void main( String[] args )

    {
        System.out.println( "Overloading" );

        Operation operation = new Operation();

        System.out.println(operation.suma(2));
        System.out.println(operation.inmultire(55, 10));
        System.out.println(operation.impartire(10, 2));

    }



}
