public class Main1 {

    public static void main(String[] args) {

        int numarZile = 10;
        int numarZileDinLuna = numarZile * 3;
        System.out.println(numarZileDinLuna);


        int y = 3 + 6 * --numarZile;
        System.out.println(y);//int y = 3+6*(numarZile - 1)
        int y2 = 3 + 6 * numarZile--;
        System.out.println(y2);
        int y3 = 3 + 6 * ++numarZile;
        System.out.println(y3);


        //Boolean
        boolean areMasina = true;
        System.out.println(!areMasina);

        if (areMasina) {
            System.out.println("Am pornit");
        }

        System.out.println("************************************");

        int numarDeOre = 100;
        System.out.println(--numarDeOre);
        System.out.println(numarDeOre--);
        System.out.println(--numarDeOre);

        /* ctrl + / pentru comentarii */
//        int numarIntreg = 1.54658;


        System.out.println(2 > 3);

        System.out.println(2 < numarDeOre && numarDeOre < 3);
        System.out.println(2 < numarDeOre || numarDeOre < 3);



    }
}

