public class Main {
    public static void main(String[] args) {

        // ? isimlendirmeler camelCase yapılır.
        // ! Don't repeat yourself!
        String internetSubeButonu = "İnternet Şubesi";
        System.out.println(internetSubeButonu); // Output: İnternet Şubesi

        // Değişiklik yapalım
        internetSubeButonu = "İnternet Şubesine Giriş";
        System.out.println(internetSubeButonu); // Output:İnternet Şubesine Giriş
        // System.out.println(internetSubeButonu);
        // System.out.println(internetSubeButonu);
        // System.out.println(internetSubeButonu);
        // System.out.println(internetSubeButonu);

        // ondalıklı sayılar
        double dolarDun = 18.54;
        double dolarBugun = 18.55;
        // tam sayılar
        int vade = 36;

        boolean dustuMu = false;
        if (dolarBugun < dolarDun) {
            System.out.println("asagıOk.png");
        } else if (dolarBugun > dolarDun) {
            System.out.println("yukariOk.png");
        } else {
            System.out.println("esittirOk.png");
        } // Output: yukariOk.png

        // diziler
        String[] krediler = {
                "Hızlı Kredi",
                "Mutlu Emekli Kredisi",
                "Konut Kredisi",
                "Çiftçi Kredisi",
                "MSB Kredisi",
                "MEB Kredisi"
        };

        // foreach döngüsü
        for (String kredi : krediler) {
            System.out.println(kredi);
        }
        // for döngüsü
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }

        // Değer ve Referans tipler
        // değer tiplerde işlemler değer özelinde yapılır.
        int sayi1 = 10, sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1); // Output: 20

        // referans tiplerde işlemler referans adresi üzerinde yapılır
        int[] sayilar1 = { 1, 2, 3 };
        int[] sayilar2 = { 11, 22, 33 };
        sayilar1 = sayilar2;
        sayilar2[0] = 0;
        System.out.println(sayilar1[0]); // Output: 0

        // Stringler referans tip olasalar da istisnadır ve değer tip gibi çalışır.
        String sehir1 = "Ankara";
        String sehir2 = "İstanbul";
        sehir1 = sehir2;
        sehir2 = "İzmir";
        System.out.println(sehir1); // Output: İstanbul
    }
}
