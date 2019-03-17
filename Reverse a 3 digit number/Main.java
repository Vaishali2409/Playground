import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int first = num/100;
    int second = (num/10)%10;
    int last  = num%10;
    int reverse = (last*100+second*10+first);
    System.out.println(reverse);
  }
}