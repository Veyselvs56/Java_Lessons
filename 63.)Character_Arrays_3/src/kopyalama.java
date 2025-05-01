public class kopyalama {  // dizideki karakteri kopyalayan program
    public static void main(String[] args) {
        String B,C;
        char [] A={'H','A','N','Z','A','R'};

        B=String.copyValueOf(A,0,4);  //a nın 0. elemanından başlıyarak 4 adet karakteri kopyalar
        System.out.println(B);
        C=String.valueOf(A,0,3);     // valueof ta kullanılabilir
        System.out.println(C);


        /*  KARAKTER SINIF METOTLARI

           * isAlphabetic(k)    == Metot, k bir alfabetik karakter ise true, değilse false değerini üretir.
                                   Örneğin; System.out.print (Character.isAlphabetic('A')); komut satırı true sonucunu verir.
           * isLetter(k)        == Metot, k bir harf ise true. değilse false değerini üretir.
                                   Örneğin; System. out.println( Character.isLetter('a')); komut satırı true sonucunu verir.
           * isDigit (k)        == Metot, k bir sayı ise true, değilse false değerini üretir. Örneğin;
                                   System. out.println( Character.isDigit('a')); komut satırı false sonucunu verir.
           * isSpaceChar        == Metot, k bir boşluk karakteri ise true, değilse false değerini üretir. Örneğin;
                                   System.out.print (Character.isSpaceChar()); komut satırı true sonucunu verir.
           * isWitespace(k)     == Metot, k bir White space karakteri (\t, \n. Ir gibi) ise true, değilse false değerini üretir.
           * isLowerCase (k)    == Metot, k küçük bir harf ise true, değilse false değerini üretir. Örneğin;
                                   System.out.println( Character.isLowerCase ('a')); komut satırı true sonucunu verir.
           * isUpperCase (k)    == Metot, k büyük bir harf ise true, değilse false değerini üretir. Örneğin;
                                   System.out.println( Character.isLowerCase ('a')); komut satırı false sonucunu verir.
           * isLetterOrDigit(k) == Metot, k bir harf veya sayı ise true, değilse false değerini üretir. Örneğin;
                                   System.out.println(Character.isLetterOrDigit('a')); komut satırı true sonucunu verir.
           * toLowerCase(k)     == k'yı küçük harfe dönüştürür. Örneğin; System.out.println( Character.toLowerCase('A'));
                                    komut satırı a sonucunu verir.
           * toUpperCase (k)    == K'yı büyük harfe dönüştürür. Örneğin; System.out.println( Character.toUpperCase('a'));
                                   komut satırı A sonucunu verir.
           * hashCode (k)       == k'nın hash kodunu döndürür. Örneğin; System.out.println (Character.hashCode('a'));
                                   komut satını 97 sonucunu verir.
           hashCode() metodu her nesne için ona özgü bir tamsayı üretir. Tek bir karakter için ise ascıı tablosundaki karşılığı verir.
         */
    }
}
