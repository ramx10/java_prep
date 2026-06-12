package Day 9.PolyMorphism;

public class WhatsAppNotification extends Notification {

    @Override
    void send() {
        System.out.println("Sending whatsapp notification");
    }
}