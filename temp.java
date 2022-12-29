import java.util.Scanner;
public class temp {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the air temperature :");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("The weather is suitable for skiing.");

        } else if (heat < 25) {
            if (heat <= 15) {
                System.out.println("Great weather to go to the movies.");
            }if (heat < 25) {
                    System.out.println("Great weather for a picnic.");
                }

            } else {
                System.out.println("What are you waiting for, let's go swimming.");
            }

        }
    }
// hepsini else if yaptığımda, kesişimdeki derecelerde 2 etkinliği önermiyor.
//koşullu && ile yazdığımda sadece üsttekini gördüğü için yine 2 etkinliği önermiyor.
//tek ifle yazdığımda kesişim veriyor bu sefer 16 derece yazınca çıktı alamıyorum.
//başka yöntem bilen varsa söylesin lütfen.


