public class Loop2{
public static void main(String[] args){


  for(int i =0; i<6;i++){
    for(int j=0; j<3; j++){
      System.out.println("i=" + i + "; j=" +j);
      if(i ==j) {
        System.out.println("going to break");
        break;
      }
    }
  }
  System.out.println(" ");

  for(int i =0; i<6;i++){
    for(int j=0; j<3; j++){
      
      if(i ==j) {
        System.out.println("going to skip");
        continue;
      }
      System.out.println("i=" + i + "; j=" +j);
    }
  }

  String str = "I Love Programming. I love Java.";
  System.out.println(str.length());
for(int i=0; i<str.length(); i++){
  System.out.println("Hello");
}



//             *
//            ***
//           *****
//          *******
//         *********
//          *******
//           *****
//            ***
//             *

int count = 0;
// str.charAt(int)
for(int p=0; p<str.length(); p++){
  if (str.charAt(p) == 'e'){
    count = p;
    System.out.println(count);
    break; // use "break" to only print the first value
}
}

//check if 'y' exists in the string
int counts = 0;
for(int p=0; p<str.length(); p++){
  if(str.charAt(p) == 'e'){
    counts += 1;
  }
}
  if(counts>=3){
    break;
  } //nice to have



  if(counts > 0){
    System.out.println("found. There are " + counts);

  }else if(counts ==0){
    System.out.println("not found");
  }






}
}