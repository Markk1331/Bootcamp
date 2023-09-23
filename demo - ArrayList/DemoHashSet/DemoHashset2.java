package DemoHashSet;

import java.util.HashSet;

import DemoHashMap.Book;

public class DemoHashset2 {
  public static void main(String[] args) {
    HashSet<Byte> bytes = new HashSet<>();
    bytes.add(bytes(4));
   boolean added10 = bytes.add(bytes(10));
   boolean isAdded4 = bytes.add(bytes(4));

//Wrapper class use equals method
   HashSet<Byte> bytes2 = new HashSet<>();
   bytes.add(bytes(4));
   bytes.add(bytes(10));
   System.out.println(bytes.equals(bytes2));

   boolean isRemoved = bytes.remove(bytes(10)); //true
      HashSet<Book> books = new HashSet<>();
    System.out.println(books.add(new Book("eric")));

  }

  public static Byte bytes(int num){
    return Byte.valueOf((byte) num);
  }
}
