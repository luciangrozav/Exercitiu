package org.fasttrackit.utils;

import java.util.Scanner;

public class ScannerUtils {

  static Scanner scanner = new Scanner(System.in);

  public static int nextIntAndMoveToNextLine ()
  {
      int integer = scanner.nextInt();
      scanner.nextLine();
      return integer;
  }


}
