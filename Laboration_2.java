import java.util.Scanner;

/*
 * Program som läser in en mening och ett tecken, och sedan:
 *  - Kontrollerar att meningen inte är tom och att tecknet är exakt ett tecken långt
 *  - Räknar det totala antalet tecken i meningen
 *  - Räknar hur många gånger det angivna tecknet förekommer
 *  - Bestämmer index för första och sista förekomsten av tecknet
*/
    
public class CharacterAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Läs in en mening
        System.out.print("Skriv en mening: ");
        String mening = scanner.nextLine();

        // Kontrollera att meningen inte är tom
        if (mening.isEmpty()) {
            System.out.println("Fel: Meningen får inte vara tom.");
            System.out.println("Programmet avslutas.");
            scanner.close();
            return;
        }

        // Läs in ett tecken
        System.out.print("Ange ett tecken: ");
        String teckenInput = scanner.nextLine();

        // Kontrollera att precis ett tecken angivits
        if (teckenInput.length() != 1) {
            System.out.println("Fel: Du måste ange exakt ett tecken.");
            System.out.println("Programmet avslutas.");
            scanner.close();
            return;
        }

        // Konvertera sträng till char
        char tecken = teckenInput.charAt(0);

        // Beräkna totala antalet tecken i meningen
        int totalLength = mening.length();

        // Variabler för statistik
        int count = 0;
        int firstIndex = -1;
        int lastIndex = -1;

        // Loopar igenom varje position i meningen
        for (int i = 0; i < totalLength; i++) {
            if (mening.charAt(i) == tecken) {
                count++;
                if (firstIndex == -1) {
                    firstIndex = i;  // Spara första förekomst
                }
                lastIndex = i;   // Upd sista förekomst
            }
        }

        // Print res
        System.out.println("Totalt antal tecken: " + totalLength);
        System.out.println("Tecknet '" + tecken + "' förekommer " + count + " gånger.");

        if (count > 0) {
            System.out.println("Första förekomst på index: " + firstIndex);
            System.out.println("Senaste förekomst på index: " + lastIndex);
        } else {
            System.out.println("Tecknet förekommer inte i meningen.");
        }

        System.out.println("Programmet avslutas.");
        scanner.close();
    }
}
