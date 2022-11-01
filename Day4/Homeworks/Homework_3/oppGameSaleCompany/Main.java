package Homeworks.Homework_3.oppGameSaleCompany;

import Homeworks.Homework_3.oppGameSaleCompany.core.ui.screens.WellcomeScreen;

/**
 * @version 1.0
 * @author OnCaDo
 * 
 * @apiNote TR:
 * @apiNote
 *          Bir oyun yazmak istiyorsunuz. Bu yazılım için backend kodlarını JAVA
 *          ile geliştirmeyi planlıyoruz. Yeni üye, satış ve kampanya yönetimi
 *          yapılması isteniyor.
 * 
 * @apiNote
 *          Gereksinimler
 * @apiNote
 *          Oyuncuların sisteme kayıt olabileceği, bilgilerini
 *          güncelleyebileceği, kayıtlarını silebileceği bir ortamı simule
 *          ediniz. Müşteri bilgilerinin doğruluğunu e-devlet sistemlerini
 *          kullanarak doğrulama yapmak istiyoruz. (E-devlet sistemlerinde
 *          doğrulama TcNo, Ad, Soyad, DoğumYılı bilgileriyle yapılır. Bunu
 *          yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)
 * @apiNote
 *          Oyun satışı yapılabilecek satış ortamını simule ediniz.( Yapılan
 *          satışlar oyuncu ile ilişkilendirilmelidir. Oyuncunun parametre
 *          olarak metotta olmasını kastediyorum.)
 * @apiNote
 *          Sisteme yeni kampanya girişi, kampanyanın silinmesi ve
 *          güncellenmesi imkanlarını simule ediniz.
 * @apiNote
 *          Satışlarda kampanya entegrasyonunu simule ediniz.
 * @apiNote
 * @apiNote EN:
 * @apiNote
 *          You want to write a play. We are planning to develop the backend
 *          codes for this software with JAVA. New members, sales and campaign
 *          management are required.
 *
 * @apiNote
 *          Requirements
 * @apiNote
 *          Simulate an environment where players can register to the system,
 *          update their information, and delete their registrations. We want to
 *          verify the accuracy of customer information using e-government
 *          systems. (Verification in e-government systems is done with TcNo,
 *          Name, Surname, Year of Birth. It is enough to simulate the service
 *          that will do this.) (Like logging)
 * @apiNote
 *          Simulate the sales environment where the game can be sold. (The
 *          sales made should be associated with the player. I mean the player
 *          in the method as a parameter.)
 * @apiNote
 *          Simulate the possibilities of entering a new campaign into the
 *          system, deleting and updating the campaign.
 * @apiNote
 *          Simulate campaign integration in sales.
 */
public class Main {
    public static void main(String[] args) {

        WellcomeScreen wellcomeScreen = new WellcomeScreen();
        wellcomeScreen.open();

    }
}
