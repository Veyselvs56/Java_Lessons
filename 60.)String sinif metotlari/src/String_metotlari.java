public class String_metotlari {
     //STRİNG SINIFINA AİT METOTLAR

    /*
     * s.charAt(p)              == s'nin p. pozisyonundaki karakterini geri döndürür. İlk karakterin pozisyonu O'dır.
     * s.codepointAt(p)         ==  s'nin p. indisli karakterinin Unicode kod karşılığını döndürür.
     * s.codepointBefore(p)     == s'nin(p-1). indisli karakterinin Unicode kod karşılığını döndürür.
     * s.toCharArray();         == Stringi karakter dizisine dönüştür  Örneğin char[]k=s.toCharArray(); gibi
     * s.substring (p)          ==  s'nin p. pozisyonundan/indisinden başlayarak en sonuna kadarki tüm karakterlerini alır.
     * s.substring (p,n)        == s'nin p. pozisyonundan/indisinden başlayarak n. karaktere kadarki (n dahil) karakterlerini alır.
     * s.replace("a","b")       == s içindeki tüm a karakterlerini, b karakterine dönüştürür. replace() yerine replaceAll fonksiyonu da tercih edilebilir.
     * s.replaceFirst("a", "b") == replace fonksiyonuna benzer. replaceFirst() fonksiyonu sadece ilk karakteri değiştirir.
     * s.equals(t) /            ==  s ile t'yi karşılaştırır. Her iki string değişkenin içeriği karakter aynı ise true değilse false
       s.equalsIgnoreCase(t)        sonucunu üretir. eğer karşılaştırma yaparken büyük-küçük harf duyarlılığını istemiyorsak equals
                                    yerine equalsIgnoreCase() komutu kullanmamız gerekir.
     * s.compareTo(t) /         ==  s ile t'yi karşılaştırır. Eğer s<t ise negatif, s==t ise 0, s>t ise pozitif bir değer döndürür.
       s.compareToIgnoreCase(t)     Eğer karşılaştırma yaparken büyük - küçük harf duyarlılığını istemiyorsak
                                    compareTo yerine compareToIgnoreCase() komutunu kullanmamız gerekir.
     * copyValueof(s,t,n)       == s'nin t. indisli elemanınından başlayarak n adet karakteri kopyalar.
     * s.length()               ==  s'nin karakter uzunluğunu verir
     * s.toLowerCase()          == s'yi küçük harfe dönüştürür.
     * s.toUpperCase()          == s'yi büyük harfe dönüştürür.
     * s. trim()                == s'nin başındaki ve sonundaki boşluk ve "tab" karakterlerini kaldırır.
     * s.indexOf("c")           == s içerisinde c'yi baştan arar, bulursa baştan pozisyonunu/sirasını bulamazsa-1 sonucunu döndürür.
     * s.lastIndexOf("c")       == s içerisinde c'yi sondan arar, bulursa sondan pozisyonunu/sırasını bulamazsa-1 sonucunu döndürür.
     * s.startsWith(t)          == s'nin t ile başlayıp başlamadığını kontrol eder. Örneğin "Merhaba Java".startsWith("Me")
                                   satırı true değerini döndürür."Merhaba Java".startsWith("me") satır: false değerini döndürür.
     * s.endsWith(t)            == s'nin t ile bitip bitmediğini kontrol eder. Örneğin "Merhaba Java".endsWith("v") satırı false değerini
                                   döndürür. "Merhaba Java".endsWith("a") satırı true değerini döndürür
     * s.contains(s1)           == s'nin içerisinde s1 string'ini arar. s içerisinde s1 varsa true değilse false değerini döndürür.
     * s.split("[ayraçlar]")    == s içerisinde belirtilen ayraç karakterleri dikkate alınarak metin parçalanır/ayrıştırılır.
                                   Örneğin;String [] klm = "Java, C-C++".split("[.,-");
                                   ifadesi ile "Java","C" ve "C++" string'lerinden oluşan yeni bir klm dizisi oluşur.
     * s.matches(s1)            == Fonksiyon, string ifadenin istenilen bir string ile eşleşip eşleşmediğini kontrol eder.equals ile
                                   aynı işleve sahip olsa da daha güçlü bir fonksiyondur.Çünkü sadece stringleri karşılaştırma da değil
                                   aynı zamanda pattern eşleştirmesinde de kullanılabilir.
     * s1.concat(s2)            == s1 ile s2 yi birleştirerek yeni bir string oluşturur.Örneğin String s3=s1.concat (s2); gibi.
                                   Bu ifade ile String s3=s1+s2; ifadesi aynı işleve sahiptir.
     * VetiTipi.valueof(s)      == s'yi belirten nesnesel veri tipe dönüştürür. Örneğin ;'Double.valueOf("0123456");'
                                   komut satırı double tipte 123456.0 sonucunu döndürür
    */


   //    bu yazılan fonksiyonların hepesi örneklenecek




    public static void main(String[] args ){





    }
}
