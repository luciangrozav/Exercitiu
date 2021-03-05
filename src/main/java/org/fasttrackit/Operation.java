package org.fasttrackit;


import org.fasttrackit.utils.ScannerUtils;

public class Operation {

int nr1, sum=0;
    public void logica () {


        System.out.println("Numar= ");
        nr1 = ScannerUtils.nextIntAndMoveToNextLine();
        for (int i = nr1; i <= 100 ; i++)
            sum += i;
        System.out.println("Suma= " + sum);
        System.out.println("Media= " + sum/(100-nr1));
    }
    public void stea() {
        int i, j, nr = 50;
        for (i = 0; i < nr; i++) {
            System.out.println(" ");
        for(j=0; j< nr -i; j++)
            System.out.print("*");
        }
    }
//
//        System.out.println("Numar2= ");
//        nr2 = ScannerUtils.nextIntAndMoveToNextLine();
//        if(nr1<nr2)
//        {for (int i = nr1; i <= nr2; i++)
//            System.out.println(i);}
//        if (nr2<nr1)
//        {for (int i = nr2; i <= nr1; i++)
//            System.out.println(i);}
//        if (nr1==nr2)
//            System.out.println(nr1);

//public double suma (double a)  // overloading la metoda suma
//{
//    return suma(a, 10);
//}
//
//public double suma ( double a, double b)
//{
//    return a+b;
//}
//
//public double inmultire (double a, double b)
//{
//    return a*b;
//}
//
//public double impartire (double a, double b)
//{
//    return a/b;
//}


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
