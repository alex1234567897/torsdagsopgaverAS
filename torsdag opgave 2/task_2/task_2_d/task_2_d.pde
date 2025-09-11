void setup(){
   println(Big("Hello"));
   println(Big("flower"));
}
  

boolean Big(String text) {
  if (text.length() == 0) {
    return false; 
  }
  char firstChar = text.charAt(0);         
  return Character.isUpperCase(firstChar);
}
