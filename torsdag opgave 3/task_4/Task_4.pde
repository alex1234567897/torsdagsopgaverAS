Circle[] circles;

void setup() {
  size(600, 400);

  // 🔹 4.i + 4.j: Create array for 10 Circles and instantiate each with unique positions
  circles = new Circle[10];

  for (int i = 0; i < circles.length; i++) {
    float x = random(width);   // random x position
    float y = random(height);  // random y position
    circles[i] = new Circle(x, y);  // instantiate and add to array
  }
}
void draw() {
  background(240);

  // 🔹 4.l: Call move on each Circle using a for-each loop
  for (Circle c : circles) {
    float dx = random(-2, 2);  // random movement in x
    float dy = random(-2, 2);  // random movement in y
    c.move(dx, dy);             // move and display the circle
  }
}
