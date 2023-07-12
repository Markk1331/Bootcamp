
public class Operator {
  public static void main(String[] args) {
    int a = 1;
    a += 1;
    a = a - 2;
    int b = 10 / 5;
    b = b * 3 + 5;
    //System.out.println("a+b=" + a + b);

    //ways of x +1
    int x = 1;
    x = x + 1;
    x++;
    ++x;
    x += 1;
    //System.out.println(x);

    //ways of y -1
    int y =10;
    y = y -1;
    y--;
    --y;
    y -= 1;

    //ways of i +2
    int i = 0;
    i += 2;
    i = i +2;

    int u = 0;
    u -= 3;
    u = u -3;

    int z = 0;
    z *= 2;
    z = z *2;

    int p = 0;
    p = p/3;
    p /= 2;

    int xx = 12;
    xx %= 5;


    int m =3;
    m++;//4
    int preincrement = ++m;//5 <-- +1 first, assign variable later
    //System.out.println(preincrement);
    preincrement = m++; //5 <-- assign variable first, +1 later
    //System.out.println(preincrement);

    //System.out.println(m); //6 <--- from the "later m++"

    int q =2;

    q = q+2;
    System.out.println(q);





  }
}
