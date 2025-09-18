class Circle {
  float xposition;
  float yposition;

  // Constructor with parameters for x and y
  Circle(float x, float y) {
    xposition = x;
    yposition = y;
  }

  // 🔹 4.k move method: adds dx/dy to position and draws the circle
  void move(float dx, float dy) {
    xposition += dx;
    yposition += dy;
    display();  // draw the circle at the new position
  }

  // Draw method
  void display() {
    ellipse(xposition, yposition, 50, 50); // fixed size circle
  }
}
