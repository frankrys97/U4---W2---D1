import exceptions.NumberDivZeroException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Esercizio2 {

    public static Logger logger = LoggerFactory.getLogger(Esercizio2.class);


    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);


            logger.info("Inserisci i km percorsi:");

            int kmPercorsi = Integer.parseInt(scanner.nextLine());

            logger.info("Inserisci i litri consumati:");

            int litriConsumati = Integer.parseInt(scanner.nextLine());

            if (litriConsumati <= 0) {
                throw new NumberDivZeroException();
            }

            double consumoMedio = (double) kmPercorsi / litriConsumati;
            logger.info("Consumo medio: {}", consumoMedio);

            scanner.close();
        } catch (NumberDivZeroException e) {
            logger.warn(e.getMessage());
        } catch (NumberFormatException e) {
            logger.warn("Input non valido, inserisci un numero");
        }


    }
}
