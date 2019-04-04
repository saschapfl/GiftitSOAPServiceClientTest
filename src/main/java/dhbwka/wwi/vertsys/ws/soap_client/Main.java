/*
 * Copyright © 2018 Dennis Schulmeister-Zimolong
 *
 * E-Mail: dhbw@windows3.de
 * Webseite: https://www.wpvs.de/
 *
 * Dieser Quellcode ist lizenziert unter einer
 * Creative Commons Namensnennung 4.0 International Lizenz.
 */
package dhbwka.wwi.vertsys.ws.soap_client;

import dhbwka.wwi.vertsys.javaee.giftit.soap.GiftIt;
import dhbwka.wwi.vertsys.javaee.giftit.soap.GiftStatus;
import dhbwka.wwi.vertsys.javaee.giftit.soap.GiftGiftit;
import dhbwka.wwi.vertsys.javaee.giftit.soap.CategoryGiftit;
import dhbwka.wwi.vertsys.javaee.giftit.soap.GiftItService;
import dhbwka.wwi.vertsys.javaee.giftit.soap.InvalidCredentialsException_Exception;
import dhbwka.wwi.vertsys.javaee.giftit.soap.UserAlreadyExistsException_Exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Mini-Beispiel zum Aufruf eines SOAP-Webservices. Damit das funktioniert, muss
 * im Hintergrund das Projekt "SOAP_Server_Beispiel" ausgeführt werden.
 */
public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InvalidCredentialsException_Exception, IOException, UserAlreadyExistsException_Exception {
        // Stub-Objekt zum entfernten Aufruf erstellen
        GiftItService service = new GiftItService();
        GiftIt giftWs = service.getGiftItPort();

        // Benutzerdaten einlesen
        System.out.println("Registrierungsdaten:");
        System.out.println("Vorname: ");
        String firstName = in.readLine();
        System.out.println("Nachname: ");
        String lastName = in.readLine();
        System.out.println("Benutzername: ");
        String userName = in.readLine();
        System.out.println("Passwort: ");
        String password = in.readLine();

        try {
            String status = giftWs.signup(userName, password, firstName, lastName);

            //Wenn status OK --> go!
            if (status.equals("OK")) {

                // Webservice-Operation "findAll" aufrufen
                List<GiftGiftit> allGifts = giftWs.findallgifts(userName, password);
                // Abgerufenes Ergebnis anzeigen
                System.out.println("========================");
                System.out.println("Die große SOAP-Geschenkideenliste");
                System.out.println("========================");
                System.out.println();

                for (GiftGiftit gift : allGifts) {
                    System.out.println("Text:         " + gift.getLongText());
                    System.out.println("Kategorie: " + gift.getCategory());
                    System.out.println("Ersteller:         " + gift.getOwner());
                    System.out.println();
                }

                System.out.print("Zu welchem User möchten Sie Geschenke sehen?");
                String userToSearch = in.readLine();

                List<GiftGiftit> filteredGifts = giftWs.findByUsername(userName, password, userToSearch);
                System.out.println("========================");
                System.out.println("Viktorias Geschenke");
                System.out.println("========================");
                System.out.println();

                for (GiftGiftit gift : filteredGifts) {
                    System.out.println("Text:         " + gift.getLongText());
                    System.out.println("Kategorie: " + gift.getCategory());
                    System.out.println("Ersteller:         " + gift.getOwner());
                    System.out.println();
                }

                System.out.print("Kategorie: ");
                String category = in.readLine();
                System.out.print("Geschenkstatus: ");
                String status_gift = in.readLine();
                System.out.print("Suchbegriff: ");
                String search = in.readLine();
            }
        } catch (InvalidCredentialsException_Exception ice) {
            System.out.println("Ungültige Benutzerdaten!");
        } catch (UserAlreadyExistsException_Exception uae) {
            System.out.println("Der Username ist bereits vorhanden");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage().getClass());
        }

    }
}
