
public class Decode {
    private Lettura read;
    private Converitore convert;
    private String msg; //messaggio finale
    private static int TERMINATORE = 00000000; // COSTANTE del terminatore(non può essere modificata)
    private static int bitASCII = 8; // COSTANTE dei bit che sono prsenti in un carattere ascii

    Decode(String pathFile) { // costruttore
        read = new Lettura(pathFile); // inizializiamo file con il percorso file della foto
        convert = new Converitore();
        msg = ""; // inizializiamo msg
    }

    private boolean condizione(int ascii_int) { // condizioni : troviamo il TERMINATORE oppure il file lo finiamo di leggere
        return (ascii_int != TERMINATORE) && (read.isFinished());
    }

    private int readBIT() {
        int charInt = TERMINATORE; // lo inizializziamo come il terminatore così se non esegue il for esce dal ciclo tramite "condizione"
        String intBinString = "";
        String charBinString = "";

        for(int i = 0; i < bitASCII; i++) {
            charInt = convert.StringToInt(read.ReadLine());
            intBinString = convert.IntToBinary(charInt);
            charBinString += intBinString.charAt(intBinString.length() - 1);
            // prendiamo il bit meno significativo ovvero il prima letto da destra
        }

        if(condizione(convert.BinaryToInt(charBinString))) msg += convert.IntToChar(convert.BinaryToInt(charBinString));// convertiamo in INT il crattere in binario e poi tramite (char) lo facciamo divenater un carattere e lo mettiamo in msg
        
        return convert.BinaryToInt(charBinString); // restituiamo il charINT per il metodo "condizione"
    }

    private void readVoidBit(int numBit) {
        for(int i = 0; i < numBit; i ++) read.ReadLine();
    }

    private void decodeFile() {
        int charInt;
        do{
            charInt = readBIT();
        } while(condizione(charInt));
    }

    public void findMsg() {
        readVoidBit(4); // per toglire le prime 4 righe, non ci servono
        decodeFile();
        read.closeFile();
    }

    public String getMsg() {
        return msg;
    }
}