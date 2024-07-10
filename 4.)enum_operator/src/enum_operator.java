public class enum_operator { // enum operator is used to sort data
    enum days{sunday,monday,tuesday,wednesday,thursday,friday,saturday}
    public static void main(String[] args) {

        System.out.println("Days=");
        System.out.println(days.sunday.ordinal()+". days="+days.sunday);
        System.out.println(days.monday.ordinal()+". days=monday");
        System.out.println(days.tuesday.ordinal()+". days=tuesday");
        System.out.println(days.wednesday.ordinal()+". days=wednesday");
        System.out.println(days.thursday.ordinal()+". days=thursday");
        System.out.println(days.friday.ordinal()+". days=friday");
        System.out.println(days.saturday+". days=saturday");
        // If we don't write the ordinal to the screen, it will display the day instead of the index.
        //The ordinal() method returns the position of an element in an enum constant
    }
}