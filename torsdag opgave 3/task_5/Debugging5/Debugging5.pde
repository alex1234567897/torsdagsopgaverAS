boolean jobsDone = true;

void setup(){
    if (isJobDone()){
        println("Job's done!"); // added ;
    }
}

boolean isJobDone()
{
    return jobsDone;    
}
