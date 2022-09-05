import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java_tekrar_sorular {
    public static void main(String[] args) {

        /*Test Data:
    []
    [Java, Python, PHP, C#, C Programming, C++]

        Beklenen Çıktı:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]
    */
            int[] sayialar = {1232, 1134, 2345, 1022};
            Arrays.sort(sayialar);
            System.out.println(Arrays.toString(sayialar));


      /*  21----
        Array deki sayıları tolpayan Java kodunu yazınız.

        array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        Beklenen Çıktı:
        Array toplamı: 55*/
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int toplam = 0;
            for (int each : array
            ) {
                toplam += each;

            }
            System.out.println("arrayin elemanlar toplami=" + toplam);

       /* 22----
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

        Array =  [20, 30, 25, 35, -16, 60, -100 ]

        Beklenen Çıktı:
        Array Sayılarının ortalaması: 7.0
               */
            int[] arrayy = {20, 30, 25, 35, -16, 60, -100};
            double toplamm = 0;
            double elemanSayisi = 0;

            for (double eleman : arrayy
            ) {
                toplamm += eleman;
                elemanSayisi++;
            }
            double ortalama = (toplamm / elemanSayisi);
            System.out.println("toplamm=" + toplamm);
            System.out.println("elemansayisi=" + elemanSayisi);
            System.out.println("Arrayin elemanlarinin ortalamsi=" + ortalama);



/* 23----
        Aşağıdaki grid şeklini yazan Java Kodunu yazınız.
​
        Beklenen Çıktı:
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0 */

            int input = 10;
            for (int i = 0; i < input; i++) {
                for (int j = 0; j < input; j++) {
                    System.out.print("0 ");

                }
                System.out.println(" ");

            }

/*24----
        yazılan değerin array içerisinde arayan Java Kodu yazınız.
        Array: [1551,1223,1443,1267,1789,1023,2020]
        Aranan Değer:2020
        Beklenen Çıktı:True
        Aranan Değer:2010
        Beklenen Çıktı :False*/
            int arananDeger = 2020;
            int[] arrays = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
            Arrays.sort(arrays);
            System.out.println(Arrays.toString(arrays));
            System.out.println(Arrays.binarySearch(arrays, arananDeger));//indexini veriyor
            boolean sonuc = false;
            while (sonuc) {
                for (int item : arrays
                ) {
                    if (arananDeger == arrays[item]) {
                        sonuc = true;
                    }
                    break;
                }
                System.out.println(sonuc);//???/

            }

       /* 25----
        Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

        Array: [12,15,43,23,56,76,78,90,77,43]

        Aranan değer:56

        Beklenen Çıktı:
        56 sayısı arrayin 4. elemanı
   */
            int[] Array = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
            System.out.println(Arrays.binarySearch(Array, 56));



     /*   26-----
                Array i ARRAYLIST e çeviren Java Kodunu yazınız.
                Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

        Beklenen Çıktı:
    [Python, JAVA, PHP, Perl, C#, C++]
*/
            String[] arr1 = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
            System.out.println(Arrays.toString(arr1));

            List<String> yeniList = new ArrayList<>();
            for (int i = 0; i < arr1.length; i++) {
                yeniList.add(arr1[i]);

            }
            System.out.println(yeniList);


        /*27----
        Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

        Array: [1232,2345,5467,678,3454,2312,3451]

   */
            int[] arry1 = {1232, 2345, 5467, 678, 3454, 2312, 3451};
            int n = 2;
            List<Integer> liste = new ArrayList<>();
            for (int eachh : arry1
            ) {
                liste.add(eachh);

            }
            System.out.println(liste);

            List<Integer> maxxListe = new ArrayList<>();


            int sayac = 1;
            while (sayac <= n) {
                int max = liste.get(0);

                for (int i = 0; i < liste.size(); i++) {
                    if ((liste.get(i) > max) && !(maxxListe.contains(liste.get(i)))) {
                        max = liste.get(i);

                    }

                }
                maxxListe.add(max);
                liste.remove(liste.indexOf(max));
                sayac++;
            }
            System.out.println("maximum iki elemn listesi:" + maxxListe);

        /*  28----
      //  Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
​
        Array: []
​
        Beklenen Çıktı:
​
        Tek Sayilar: 5
       // Cift Sayilar: 4*/
            int tekSayisayac = 0;
            int ciftSayisayac = 0;
            int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            for (int eacch : arr3
            ) {
                if (eacch % 2 == 0) {
                    ciftSayisayac++;
                } else if (eacch % 2 == 1) {
                    tekSayisayac++;
                }
            }
            System.out.println("tek sayilarin adedi:" + tekSayisayac);
            System.out.println("cift sayilarin adedi:" + ciftSayisayac);}}
        /*
        29----
        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
       Test Data:
        sentence -> "Java is fun"
        reversed -> "fun is Java
         */

        /*
        30---
            Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.
        Test Data:
        birinci binary number: 100010
        ikinci  binary number: 110010
        Beklenen Çıktı:
        1010100}}
    */




