package odevler.bolum03;

public class Q16 {
    /*
     * 3.16 (Rastgele nokta)
     *
     * Bir dikdörtgen içinde kalacak şekilde rastgele nokta üreten bir program yazınız.
     * Bu dikdörtgenin merkezi (0, 0) noktası, genişliği 100 ve yüksekliği 200 olsun.
     */
    public static void main(String[] args) {
        // Dikdörtgenin merkezi (0,0) noktasi, genisligi 100 ve yüksekligi 200 oldugundan dolayı x koordinati: -50 ile 50 arasinda, y koordinati: -100 ile 100 arasında degerler alırsa rastgele üretilen nokta dikdortgen icinde kalır
        int x = (int) (Math.random() * 100) - 50;
        int y = (int) (Math.random() * 200) - 100;
        System.out.println("Rastgele nokta: " + "(" + x + ", " + y + ")");
    }

}
