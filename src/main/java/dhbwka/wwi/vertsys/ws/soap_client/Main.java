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
import java.util.List;

/**
 * Mini-Beispiel zum Aufruf eines SOAP-Webservices. Damit das funktioniert, muss
 * im Hintergrund das Projekt "SOAP_Server_Beispiel" ausgeführt werden.
 */
public class Main {

    public static void main(String[] args) throws InvalidCredentialsException_Exception {
        // Stub-Objekt zum entfernten Aufruf erstellen
        GiftItService service = new GiftItService();
        GiftIt giftWs = service.getGiftItPort();

        // Webservice-Operation "findAll" aufrufen
        try {
            List<GiftGiftit> allGifts = giftWs.findallgifts("viktoria", "viktoria");
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
        } catch (InvalidCredentialsException_Exception ice) {
            System.out.println("Ungültige Benutzerdaten!");
        }

        List<GiftGiftit> filteredGifts = giftWs.findByUsername("viktoria", "viktoria");
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
    }
}
