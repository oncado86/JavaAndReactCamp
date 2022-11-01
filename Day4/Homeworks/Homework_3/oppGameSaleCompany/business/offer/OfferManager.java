package Homeworks.Homework_3.oppGameSaleCompany.business.offer;

import Homeworks.Homework_3.oppGameSaleCompany.core.logger.ILogger;
import Homeworks.Homework_3.oppGameSaleCompany.dataAccess.offer.IOfferDataAccess;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Game;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Offer;
import Homeworks.Homework_3.oppGameSaleCompany.fakeData.fakeData;

/**
 * Kampanya bilgileri yöneticisi.
 * IOfferService uygular
 */
public class OfferManager implements IOfferService {

    private IOfferDataAccess offerDataAccess;
    private ILogger[] loggers;

    /**
     * Parametrelerle kampanya yöneticisi oluşturur
     * 
     * @param offerDataAccess -> kampanya veri erişim servisi
     * @param loggler         -> -> işlemleri loglayacak olan servisler (ILogger
     *                        interface)
     */
    public OfferManager(IOfferDataAccess offerDataAccess, ILogger... consoleLogger) {
        this.offerDataAccess = offerDataAccess;
        this.loggers = consoleLogger;
    }

    /**
     * Verilen oyun için kampanya olup olmadığını kontrol eder
     * 
     * @param game -> kampanya yapılacak oyun (Game sınıfı)
     * @return boolean -> var / yok
     */
    private boolean isOurOffer(Game game) {
        for (Offer o : fakeData.getOffers().values()) {
            if (o.getGame().getName().equals(game.getName()))
                return true;
        }
        return false;
    }

    /**
     * Sistemdeki kampanyalara bakarak, verilen kampanyaya bir id oluşturur.
     * 
     * @param offer -> kampanya (Offer sınıfı)
     */
    private void createID(Offer offer) {
        int oid = 0;
        for (Integer number : fakeData.getOffers().keySet()) {
            if (number == oid) {
                oid++;
            } else
                break;
        }
        offer.setId(oid);
    }

    /**
     * Verilern oyun için, verilen indirim oranı kadar indirim uygulayarak indirim
     * sonrası fiyatı hesaplar
     * 
     * @param game     -> kampanya yapılacak oyun (Game sınıfı)
     * @param discount -> kampanya indirim oranı (double)
     * @return indirimli fiyat (double)
     */
    private double calculateDiscountPrice(Game game, double discount) {
        return game.getPrice() - (game.getPrice() * (discount / 100));
    }

    @Override
    public void add(Game game, double discount) {
        double priceAfterDiscount = calculateDiscountPrice(game, discount);
        Offer tempOf = new Offer(game, game.getPrice(), priceAfterDiscount);
        if (!isOurOffer(game)) {
            createID(tempOf);
            offerDataAccess.add(tempOf);
            for (ILogger iLogger : loggers) {
                iLogger.log("Added offer: %s, new price: %,.2f".formatted(game.getName(), priceAfterDiscount));
            }
        } else
            System.out.println("This offer to %s already exists!".formatted(game.getName()));
    }

    @Override
    public void remove(Game game) {
        int oid = 0;
        if (isOurOffer(game)) {
            for (Offer o : fakeData.getOffers().values()) {
                if (o.getGame().getName().equals(game.getName())) {
                    oid = o.getId();
                    break;
                }
            }
            offerDataAccess.remove(fakeData.getOffers().get(oid));
            for (ILogger iLogger : loggers) {
                iLogger.log("Removed offer: %s".formatted(game.getName()));
            }
        } else
            System.out.println("This offer not exists for %s".formatted(game.getName()));

    }

    @Override
    public void update(Game game, double discount) {
        remove(game);
        add(game, discount);
    }

    @Override
    public void toList() {
        for (Offer offer : fakeData.getOffers().values()) {
            System.out.println("%d) Game: %s , Price: %,.2f ₺, Discounted Price: %,.2f".formatted(
                    offer.getId() + 1, offer.getGame().getName(), offer.getPrice(), offer.getDiscountedPrice()));
        }
    }
}
