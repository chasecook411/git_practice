public class Sum
{
  public static void main(String args[])
  {
    int n = 100;
    int sum = 0;
    for(int i = 0; i < n; i++)
    {
      sum += i;
    }
    System.out.println("Sum: " + sum);
    // merging 
    for(int i = sum; i >=0; i--) {
      sum -= i;
    }
  }
}
