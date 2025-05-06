public class Converitore {
    public int StringToInt(String str){ // ci serve perchè dobbiamo trasfomare l'input dal file da String a int
        int charInt = Integer.valueOf(str);
        return charInt;
    }
    
    public String IntToBinary(int number){ // perchè dobbiamo prendere i bit meno significativi
        String bin = Integer.toBinaryString(number);
        return bin;
    }
    
    public int BinaryToInt(String binario ){ 
        int number = Integer.parseInt(binario, 2);
        return number;
    }

    public char IntToChar(int number) {
        char carattere = (char)number;
        return carattere;
    }

}