void setup() {
  methodOne(); 
  methodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void methodOne(){
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 10;
  
  if (i > max){
    String output = "i is greater than "+max+".";     
     println(output);
    }
   // rykkede println(output) herfra ind i "if"
}

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/
void methodTwo() 
{
  int weekDay = 0; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
  
  if (weekDay < 5){
    weekend = false;
  }
  else{
    weekend = true;
  }
  
  // Print the name of the weekday here: 
  switch(weekDay){
    case 0:
    println("monday");
    break;
    case 1:
    println("tuesday");
    break;
    case 2:
    println("wensday");
    break;
    case 3:
    println("thursday");
    break;
    case 4:
    println("friday");
    case 5:
    println("saturday");
    break;
    case 6:
    println("sunday");
    break;
  }   
    
  // Print if it is weekend here:
  if(weekend == true){
    println("is weekend");
  }
  else{
    println("is not weekend");
  }
}
