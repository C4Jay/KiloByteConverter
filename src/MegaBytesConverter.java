public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1036);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            int Mega = kiloBytes / 1024;
            int rem = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + Mega + " MB and " + rem + " KB");
        }
    }
    
}
