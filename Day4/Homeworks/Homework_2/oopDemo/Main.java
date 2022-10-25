package Homeworks.Homework_2.oopDemo;


import java.time.LocalDateTime;

import Homeworks.Homework_2.oopDemo.abstracts.BaseCustomerManager;
import Homeworks.Homework_2.oopDemo.concretes.NeroCustomerManager;
import Homeworks.Homework_2.oopDemo.entities.Customer;

/**
 * Senaryo:
 * Kahve dükkanları için müşteri yönetimi yapan bir sistem geliştirmek istiyoruz.
 * Starbucks ve Nero firmaları için çalışıyoruz.
 * İki firmada müşterilerini veri tabanına kaydetmek istiyor.
 * Starbucks müşterilerini kaydederken, MERNIS (kimlik bilgisi) doğrulması istiyor.
 * Nero müşterilerini kaydederken böyle bir doğrulama istemiyor.
 * Starbucks müşterileri için her kahve alımında yıldız kazandırmak istiyor.
 */
public class Main {
    public static void main(String[] args) {
        BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.save(new Customer(0, "OnCaDo", "OnCaDo", LocalDateTime.of(1985, 12, 21, 10, 10), "123456789"));
        
    }
}
