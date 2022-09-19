public class Main
{

    public static void main(String[] args)
    {
        int TOTAL_STUDENTS = 10;
        String[] names = new String[TOTAL_STUDENTS];
        String[] toys = {"Car", "Truck", "doll"};


        names [0] = "Mickey";
        names [1] = "joe";
        names [2] = "Doug";
        names [3] = "john";

        for (int s = 0; s < names.length; s++) {
            System.out.println(s + " " + names[s]);
        }
        for (String t:toys) {
            System.out.println("Toy: " + t);
        }
        int[] primes = {1,2,3,5,7,11};
        for (int s = 0; s < primes.length; s++)
        {
            System.out.println(s + " " + primes[s]);
        }

        int sum = 0;
        double average = 0;

        for (int p : primes)
        {
            sum +=p; //sum = sum + p
        }
        average = (double) sum / primes.length;
        System.out.println("Average is " + average);



}
}
