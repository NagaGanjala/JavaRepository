package random.number.genration;

import java.util.concurrent.ThreadLocalRandom;

public class RandomTest3
{
    public static void main(String[] args)
    {
        //Generating random integers using ThreadLocalRandom class
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random Integers : "+ThreadLocalRandom.current().nextInt());
        }
        System.out.println("-----------------------------");
        //Generating random doubles using ThreadLocalRandom class
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random Doubles : "+ThreadLocalRandom.current().nextDouble());
        }
        System.out.println("-----------------------------");
        //Generating random booleans using ThreadLocalRandom class
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random booleans : "+ThreadLocalRandom.current().nextBoolean());
        }
    }
}