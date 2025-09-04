size(500,500);
background(255);

int count = 0;
while(count < 80){
  float x = random(width);
  float y = random(height);
  float r = random(1, 200);
  
  fill(random(255), random(255), random(255));
  ellipse(x,y,r,r);
  
  count++;
}
