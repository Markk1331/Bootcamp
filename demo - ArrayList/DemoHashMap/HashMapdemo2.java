package DemoHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapdemo2 {
  public static void main(String[] args) {
    HashMap<Integer, Book> books = new HashMap<>();
    books.put(Integer.valueOf(128), new Book("Eric"));
     books.put(Integer.valueOf(128), new Book("Steve"));
     System.out.println(books.size()); //1

     HashMap<Author, Book> bookMap = new HashMap<>();
     Author author1 = new Author("John",31);
     Author author2 = new Author("John",29);
      bookMap.put(author1, new Book("Book3"));
      bookMap.put(author2, new Book("Book4"));
      System.out.println(bookMap.size()); //1
     //Author unique key? --> implement equals(), hashCode() to return value1 to idetnify by "author's name"

     HashMap<Author, ArrayList<Book>> bookMap2 = new HashMap<>();
     ArrayList<Book> booklist1 = new ArrayList<>();
     booklist1.add(new Book("Book1"));
     booklist1.add(new Book("Book2"));
     ArrayList<Book> booklist2 = new ArrayList<>();
     booklist2.add(new Book("Book3"));
     booklist2.add(new Book("Book4"));

     bookMap2.put(author1, booklist1 );
     bookMap2.put(author2, booklist2 );

    //loop bookmap2, print out all the books from each author

    for(Map.Entry<Author, ArrayList <Book>> author: bookMap2.entrySet()){
      for (Book book: author.getValue())
        System.out.println(author.getKey().name);
    }
//Array list <> cannot contain array or primitive



for (Book book : bookMap2.get(new Author("John",21))){
    System.out.println(book);
}
  }
}
