package Songs;

public class Song11 {


//        public static void main(String[] args) {
//
//        System.out.println("🎵 Now playing - Dooron Dooron...");
//        System.out.println("Sochu ke milni te bolaanga ki,");
//        System.out.println("Teri taan gallaan’ch…shaayar");
//        System.out.println("Vekhegi mainu te sochegi* kya tu");
//        System.out.println("Mitti da banda main, tu taan pari...");
//        System.out.println("Ishqe di galiyach, khoya e dil ve");
//        System.out.println("Aas lagaaye ik jaaye tu mil ve");
//        System.out.println("Kol tere mainu");
//        System.out.println("aan de soni");
//        System.out.println("karaan* main kitne jatan O soni");
//        System.out.println("Dooron dooron main");
//    }

//    }
//
// class SongLyrics {
//
//    public static void main(String[] args) {
//
//        System.out.println("🎵 Now playing - Dooron Dooron...  ");
//
//        System.out.println("Sochu ke milni te bolaanga ki,");
//        System.out.println("Teri taan gallaan’ch…shaayar");
//        System.out.println("Vekhegi mainu te sochegi* kya tu");
//        System.out.println("Mitti da banda main, tu taan pari...");
//        System.out.println("Ishqe di galiyach, khoya e dil ve");
//        System.out.println("Aas lagaaye ik jaaye tu mil ve");
//        System.out.println("Kol tere mainu");
//        System.out.println("aan de soni");
//        System.out.println("karaan* main kitne jatan O soni");
//        System.out.println("Dooron dooron main");
//    }

    public static void main(String[] args) {

        String[] lyrics = {
                "Sochu ke milni te bolaanga ki,",
                "Teri taan gallaan’ch… shaayar",
                "Vekhegi mainu te sochegi kya tu",
                "Mitti da banda main, tu taan pari...",
                "Ishqe di galiyaan ch khoya e dil ve",
                "Aas lagaaye ik jaaye tu mil ve",
                "Kol tere mainu aan de soni",
                "Karaan main kitne jatan O soni",
                "Dooron dooron main"
        };

        for (int i = 0; i < lyrics.length; i++) {

            if (i == 0) {
                System.out.println("🎵 Now playing - Dooron Dooron...\n");
            }

            System.out.println(lyrics[i]);
        }
    }
}


