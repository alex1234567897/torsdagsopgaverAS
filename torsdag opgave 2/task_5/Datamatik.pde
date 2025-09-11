void setup(){
 Student Student1 = new Student("Alex", 18, false, " hold: a");
 Student Student2 = new Student("olli", 30, false, " hold: a");
 
 boolean Classmates = isClassmates(Student1, Student2);
 
 println(Student1.Name + Student1.datamatikerTeam);
 println(Student2.Name + Student2.datamatikerTeam);
 
 if(Classmates = true){
   println("and are classmates");
 }else{
   print("and are not classmates");
 }
 
}
boolean isClassmates(Student s1, Student s2) {
  return s1.datamatikerTeam.equals(s2.datamatikerTeam);
}
