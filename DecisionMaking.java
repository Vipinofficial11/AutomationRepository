public class DecisionMaking {

  public static void main(String[] args) {

    DoWhile();
  }
  //--------------------------------
  public static void simpleIf() {

    int x = 78;

    if (x>70) {
    System.out.println("x is greater");
    }
  }
  //--------------------------------
  public static void IfElse() {

    int x = 40, y=20;

    if (x < y) // false
    {
      System.out.println("y is greater");
    }
    else ///
    {
      System.out.println("x is greater");
    }
  }
  //--------------------------------
  public static void ifElseif() {

    int a = 10, b = 20, c = 30;

    if( a > b && a > c) {
      System.out.println("a is greater"); // not executed
    } else if( b > a && b > c ) {
      System.out.println("b is greater"); // not executed
    } else {
      System.out.println("c is greater");
    }
  }
  //--------------------------------
  public static void nestedIf() {

    int num = 2;
    if (num > 10)
    {
      if (num%2==0)
        System.out.println( num+ " is greater than 10 and even number");
      else
        System.out.println(num+ " is greater than 10 and odd number");
    }

    else
    {
      System.out.println(num+" is smaller than 10");
    }
  }
  //--------------------------------
  public static void simpleSwitch() {
    int num = 5;
    switch(num) {
      case 0 : {
        System.out.println("Sunday");
        break;
      }
      case 1 : {
        System.out.println("Monday");
        break;
      }
      case 2 : {
        System.out.println("Tuesday");
        break;
      }
      case 3 : {
        System.out.println("Wednesday");
        break;
      }
      case 4 : {
        System.out.println("Thursday");
        break;
      }
      case 5 : {
        System.out.println("Friday");
        break;
      }
      case 6 : {
        System.out.println("Saturday");
        break;
      }
      default: {
        System.out.println("Invalid choice");
        break;
      }
    }
  }
//-----------------------------------
  public static void ForLoop() {
    for(int i=1;i<=10;i++) {

      System.out.println(i);
    }
  }
  //--------------------------------
  public static void WhileLoop() {
    int i=1;

     while(i<=10){
      System.out.println(i);
      i++;
    }
  }
  //--------------------------------
  public static void DoWhile() {

    int i=11;
    do{
     // System.out.println(logs);
      i++; // 10
    } while(i<=10); //10


  }

}
