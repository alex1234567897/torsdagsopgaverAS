void setup(){
 Teacher Teacher1 = new Teacher("tine", 64, true);
 Student Student1 = new Student("Alex", 18, false, " hold: a");
 Student Student2 = new Student("olli", 30, false, " hold: a");
 
 println(Teacher1.Name);
 println(Student1.Name + Student1.datamatikerTeam);
 println(Student2.Name + Student2.datamatikerTeam);
}
