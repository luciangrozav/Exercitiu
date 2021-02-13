package org.fasttrackit;

import org.fasttrackit.utils.ScannerUtils;

public class Operation {

public void suma ()
{
    System.out.println("Calculam a+b: ");
    int a = geta();
    int b = getb();
    System.out.println("a+b= " + (a+b));
    System.out.println("a*b= " + (a*b));
    System.out.println("a/b= "+ (a/b));
}

private int geta ()
{
    System.out.println("a= ");
    return ScannerUtils.nextIntAndMoveToNextLine();
}
    private int getb ()
    {
        System.out.println("b= ");
        return ScannerUtils.nextIntAndMoveToNextLine();
    }


}
