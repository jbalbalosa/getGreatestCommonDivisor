public class Main {
    public static void main(String[] args) {
        System.out.println("getGreatestCommonDivisor Method!");

        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }

        while (second != 0) {
            int remainder = first % second;
            first = second;
            second = remainder;
        }

        return first;
    }
}