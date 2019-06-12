package com.example;
import java.io.*;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Tururu
   * @param someone ENTRADA
   * @return cadena
   */
  public String greet(String someone) {
    
    Process theProcess = null;
    BufferedReader inStream = null;
 
        
      try
      {
          theProcess = Runtime.getRuntime().exec("calc.exe");
      }
      catch(IOException e)
      {
         System.err.println("Error en el método exec()");
         e.printStackTrace();  
      }
    
    
    // llamar a la clase Hello.
    return String.format("Hello, %s!", someone);
  }
}
