package odevler.bolum03;

public class Q04 {
    /*
     * 3.4 (Rastgele ay)
     *
     * 1 ile 12 arasında rastgele bir sayı üreten ve bu sayıya karşılık gelen
     * İngilizce ay ismini (1 – January, 2 – February, …, 12 – December)
     * gösteren bir program yazınız.
     */
    public static void main(String[] args) {

        // 1 ile 12 arasında rastgele bir sayı üretelim
        int randomNumber = (int)(Math.random() * 12) + 1;

        // randomMonth sayısına karşılık gelen ayı tanımlayalım
        String month = "";
        switch (randomNumber){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }
        System.out.println("Random month: " + randomNumber + " - " + month);
    }
}
