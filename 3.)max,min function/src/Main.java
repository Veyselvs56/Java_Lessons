public class Main {       // function that finds the largest number among three given numbers
    public static void main(String[] args) {
        int a = 13, b = 21, c = 20;
        System.out.print(Math.max(Math.max(a, b), c));     /*First, we compare two numbers and then compare
        the result with the third number. The max(a, b) and min(a, b) functions find the largest and smallest numbers,
         respectively. */
    }
}