package org.fasttrackit;


public class Operation {

public double suma (double a)  // overloading la metoda suma
{
    return suma(a, 10);
}

public double suma ( double a, double b)
{
    return a+b;
}

public double inmultire (double a, double b)
{
    return a*b;
}

public double impartire (double a, double b)
{
    return a/b;
}


//private int geta ()  // pt citirea variabilelor
//{
//    System.out.println("a= ");
//    return ScannerUtils.nextIntAndMoveToNextLine();
//}
//    private int getb ()
//    {
//        System.out.println("b= ");
//        return ScannerUtils.nextIntAndMoveToNextLine();
//    }


}
