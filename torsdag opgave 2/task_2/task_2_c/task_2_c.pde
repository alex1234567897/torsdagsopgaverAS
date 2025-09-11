void setup(){
  String mesage = "hello World";
  String result = makeUppercase(mesage);
  println(result);
}

String makeUppercase(String text) {
  return text.toUpperCase();
}
