public class nums 
{
  public static void main(String[] args)
  {
    if (args.length == 2 && isNumeric(args[0]) && isNumeric(args[1]))
    {
      System.out.println(args[0] + " + " + args[1] + " = <3 ");
    }
    else
    {
      System.out.println("Exception - program needs 2 numbers!");
    }

  }

  public static boolean isNumeric(String str)
  {
    return str.matches("-?\\d+(\\.\\d+)?");  
  }
}

