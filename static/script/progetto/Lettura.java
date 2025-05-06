import java.io.*;
import java.util.Scanner;

public class Lettura {
  private FileReader file;
  private Scanner in;

  Lettura(String pathFile) {
    try {
      file = new FileReader(pathFile);// inizializza il file
      in = new Scanner(file);// inizializza il scanner tramite l'oggetto file(per leggere il file abbiamo
      // bisogno dello scanner)

    } catch (IOException e) {
      System.out.println("Errore:  Impossibile aprire il file");// Gestisce l'errore nel file
    }
  }

  public String ReadLine() {
    String charInt = in.nextLine(); // Prendo il contenuto presente dentro il file e lo inserisco nella variaile
                                // CharInt
    return charInt;
  }

  public void closeFile() {
    in.close(); // Chiusura de file
  }

  public boolean isFinished() {
    return in.hasNext();
  }

}
