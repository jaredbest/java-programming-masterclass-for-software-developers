public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else
        {
            int megaBytes = Math.round(kiloBytes /1024);
            int remainingKilobytes = kiloBytes % 1024;

            System.out.println( kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilobytes + " KB" );
        }
    }
}