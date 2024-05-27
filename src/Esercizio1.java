import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Esercizio1 {
    public static Logger logger = LoggerFactory.getLogger(Esercizio1.class);

    public static void main(String[] args) {

        int[] arrayEs1 = new int[5];

        for (int i = 0; i < arrayEs1.length; i++) {
            Random r = new Random();
            arrayEs1[i] = r.nextInt(1, 10);
        }

        logger.info("arrayEs1: {}", arrayEs1);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                logger.info("Inserisci la posizione dell'array da modificare (0 per uscire): ");
                int num = Integer.parseInt(scanner.nextLine());
                if (num < 0 || num > arrayEs1.length) {
                    logger.warn("Posizione non valida");
                    continue;
                }
                if (num == 0) {
                    break;
                }
                logger.info("Inserisci il nuovo valore: ");
                int val = Integer.parseInt(scanner.nextLine());
                if (val <= 0 || val > 10) {
                    logger.warn("Valore non valido, inserisci un numero compreso tra 1 e 10");
                    continue;
                }
                arrayEs1[num - 1] = val;
                logger.info("arrayEs1: {}", arrayEs1);
            } catch (NumberFormatException e) {
                logger.warn("Input non valido, inserisci un numero");
            }
        }
    }
}