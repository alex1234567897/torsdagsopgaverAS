//task three
String address = "address";
int a = 10 + 3;
double C= 2/5d;
String D = "guten heute leute";

//task four.
void setup(){
  //første variabler
  println("A string: "+address);
  println("A int: "+a);
  println("A double: "+C);
  println("A String2: "+D);
  
  // nyelige ændret variabler
  String address = "mit hus";
  println("B INT: "+address);
  int a = 5 + 20;
  println("B double: "+a);
  double C = 10/7d;
  println("B String: "+C);
  String D = "godmorgen";
  println("B String2: "+D);
  
  // nyelige tilføjet værdier
  address=address+1;
  println("C String: "+address);
  a++;
  println("C int: "+a);
  C=C--+2;
  println("C Double: "+C);
  D=D+D;
  println("C String2: "+D);
  
  //tæl numeriske varabler op med 1
  a++;
  C++;
  println("D int: "+a);
  println("D double: "+C);
  
  //tæl numeriske variabler med op med 3
  a=a+3;
  C=C+3;;
  println("E int: "+a);
  println("E double: "+C);
  
  //tæl numerisk variabler ned med 1
  a--;
  C--;
  println("F int: "+a);
  println("F double: "+C);
}
