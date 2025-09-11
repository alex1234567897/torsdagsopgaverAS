void setup(){
  Divisible(8);
  
}

void Divisible(int Number){
  for(int i = 1; i< 100;i++){
    if(i % Number == 0){
      println(i+ " ");
    }
  }
}
