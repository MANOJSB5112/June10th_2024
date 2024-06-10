package PraciseGit;

public class B {

   public boolean isPrime(int n)
   {
    if (n <= 1)
    {
        return false;
    }
     // Check from 2 to sqrt(n)
     for (int i = 2; i <= Math.sqrt(n); i++)
     {
        if (n % i == 0)
        {
            return false;
        }
     }
     return true;
   }
}
