ArrayList<Integer> intList = new ArrayList<Integer>();
ArrayList<String> stringList = new ArrayList<String>();
ArrayList<Boolean> booleanList = new ArrayList<Boolean>();

void setup(){
 
  // --- Integer List ---
  intList.add(10);
  intList.add(29);
  intList.add(46);
  // --- Integer Sum ---
  int total = SumOfInteger(intList);
  println("sum of intList = " + total);
  // --- average of Integer ---
  float avg = average(intList);
  println("average of integers = " + avg);
  
  
  // --- String List ---
  stringList.add("Hello");
  stringList.add("technoblade");
  stringList.add("i dunno");
  // --- Print String List ---
  printList(stringList);
  
  // --- Boolean List ---
  booleanList.add(true);
  booleanList.add(false);
  booleanList.add(false);
  
}

// --- list of Strings ---
void printList(ArrayList<String> list){
  for(int i = 0; i < list.size(); i++){
  println(stringList.get(i));
  }
}

// --- sum of Integer ---
int SumOfInteger(ArrayList<Integer> list){
  int sum = 0;
  for(int i=0; i< list.size();i++){
    sum += list.get(i);
  }
  return sum;
}

// --- Average of Integer ---
float average(ArrayList<Integer> list){
 if(list.size() == 0){
   return 0;
 }
 int sum = 0;
 for(int i = 0; i < list.size();i++){
   sum += list.get(i);
 }
 return (float) sum / list.size();
}
