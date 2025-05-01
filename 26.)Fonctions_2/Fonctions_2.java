public class Fonctions_2 {   // değişken değeri ile işlem yapmak
    static int s1 = 4;
    static void RefFonk(int s1) {  // referans ile işlem yaparsak bellekteki değeri değiştirmiş oluruz
        Fonctions_2.s1 = 8;  // referans ile atama yapmak için sınıf ismi yazılır
    }
    static void DegFonk(int s1) {  // değeri ile işlam yaparsak birşey değişmez
        s1 = 8;  // s1 sadece bu fonksiyonun içerisindeyken 8 dir
    }
    public static void main(String[] args) {
        System.out.print("değeri ile işlem yaparsak = ");
        DegFonk(s1);
        System.out.println("s1= " + s1);

        System.out.print("referansı ile işlem yaparsak = ");
        RefFonk(s1);
        System.out.println("s1= " + s1);


        System.out.println("s1= " + s1);
    }
    // yani değeri ile işlem yapılırken o işlem sadece fonksiyonun içinde geçerli olur referansta ise artık değerler değişir
}