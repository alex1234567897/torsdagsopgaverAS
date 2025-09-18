void setup(){
 printPartOfWord("elden ring", 5,10); 
 printPartOfWord("lyse og krone", 4, 13); 
 printPartOfWord("Københavns erhvervsakademi", 0,4); 
 printLastFour("Leverpostej");
}

// ----- 2.a ------
void printPartOfWord(String word, int startIndex, int slutIndex){
  String part = word.substring(startIndex, slutIndex);
  println(part);
}

// ----- 2.d ------
void printLastFour(String Word){
 String Part = Word.substring(Word.length()-4, Word.length());
 println(Part);
}
