package odevler.bolum03;

public class Q24 {
    /*
     * 3.24 (Oyun: Bir Kart Seçin)
     *
     * 52 karttan oluşan bir desteden bir kart seçmeyi simüle eden bir program yazınız.
     * Program, kartın sırasını (As, 2, 3, 4, 5, 6, 7, 8, 9, 10, Vale, Kız, Papaz) ve kartın
     * türünü (Kupa, Karo, Maça, Sinek) ekrana göstermelidir.
     *
     * Örneğin:
     * "The card you picked is Jack of Hearts" şeklinde bir çıktı alınmalıdır.
     *
     * İpuçları:
     * - 52 kartlık bir destede her kartın kendine has bir sırası (rank) ve türü (suit) vardır.
     * - Bir kartın sırasını belirlemek için 1 ile 13 arasında rastgele bir sayı üretilebilir:
     *   (As = 1, 2 = 2, ..., Vale = 11, Kız = 12, Papaz = 13).
     * - Kartın türünü belirlemek için 0 ile 3 arasında rastgele bir sayı üretilebilir:
     *   (Sinek = 0, Karo = 1, Kupa = 2, Maça = 3).
     *
     * Örnek Girdi ve Çıktılar:
     *
     * Girdi: Yok (kart rastgele seçilir)
     * Çıktı: The card you picked is Jack of Hearts
     */
    public static void main(String[] args) {
        // Kart sırası (1-13) ve kart türü (0-4) için rastgele sayılar üretelim
        int rank = (int) (Math.random() * 13) + 1;
        int suit = (int) (Math.random() * 4);

        String rankName = "";
        String suitName = "";

        // Kart sırasına göre kartın adını belirleyelim:
        switch(rank){
            case 1:
                rankName = "Ace";
                break;
            case 2:
                rankName = "2";
                break;
            case 3:
                rankName = "3";
                break;
            case 4:
                rankName = "4";
                break;
            case 5:
                rankName = "5";
                break;
            case 6:
                rankName = "6";
                break;
            case 7:
                rankName = "7";
                break;
            case 8:
                rankName = "8";
                break;
            case 9:
                rankName = "9";
                break;
            case 10:
                rankName = "10";
                break;
            case 11:
                rankName = "Jack";
                break;
            case 12:
                rankName = "Queen";
                break;
            case 13:
                rankName = "King";
                break;
        }

        // Kart türüne göre kartın adını belirleyelim:
        switch(suit){
            case 0:
                suitName = "Clubs";
                break;
            case 1:
                suitName = "Diamonds";
                break;
            case 2:
                suitName = "Hearts";
                break;
            case 3:
                suitName = "Spades";
                break;
        }

        // Kartın adını ekrana yazdıralım:
        System.out.println("The card you picked is " + rankName + " of " + suitName);
    }
}
