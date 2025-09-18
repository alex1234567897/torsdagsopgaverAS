boolean jobsDone = true;

void setup(){
 if(isJobDone()){  //added () to isJobDone
  println("Job's done!");   
 }
}

boolean isJobDone(){
    return jobsDone;    
}
