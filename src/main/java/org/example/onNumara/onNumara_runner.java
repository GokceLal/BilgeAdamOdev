package org.example.onNumara;

import java.util.*;

public class onNumara_runner {
    public class Main {
        public static void main(String[] args) {

            // Sayılar ve bu sayıların kaç defa üretildiğini saklayacak bir Map oluşturalım
            Map<Integer, Integer> sayiAdetMap = new HashMap<>();
            Random random = new Random();

            // 10,000 adet rastgele sayı üretme döngüsü
            for (int i = 0; i < 10000; i++) {
                int rastgeleSayi = random.nextInt(100) + 1; // 1 ile 100 arasında rastgele bir sayı üretir

                // Rastgele üretilen sayının adetini Map'te artır
                sayiAdetMap.put(rastgeleSayi, sayiAdetMap.getOrDefault(rastgeleSayi, 0) + 1);
            }

            // Elde ettiğimiz sayı/adet eşleşmelerini görelim
            for (Map.Entry<Integer, Integer> entry : sayiAdetMap.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }

            // Yukarıdaki kodun devamı

// Sayı/adet eşleşmelerini liste haline getirme
            List<Integer> sayilarListesi = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : sayiAdetMap.entrySet()) {
                int sayi = entry.getKey();
                int adet = entry.getValue();
                for (int i = 0; i < adet; i++) {
                    sayilarListesi.add(sayi);
                }
            }


// Liste elemanlarını karıştırma
            Collections.shuffle(sayilarListesi);

// Karıştırılmış listenin ilk 10 farklı elemanını alalım
            Set<Integer> sansliNumaralar = new HashSet<>();
            for (int i = 0; i < sayilarListesi.size(); i++) {
                sansliNumaralar.add(sayilarListesi.get(i));
                if (sansliNumaralar.size() == 10) {
                    break;
                }
            }

// Sonuçları yazdırma
            System.out.println("Sanslı 10 Numara:");
            for (int numara : sansliNumaralar) {
                System.out.println(numara);
            }

        }
    }

}



//ChatAI yardım aldım.
