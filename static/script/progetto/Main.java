public class Main {
    public static void main(String[] args) {
        Decode dec = new Decode(args[0]);
        dec.findMsg();
        System.out.println("Il messaggio è : " + dec.getMsg());
    }
}