PImage donkey;
PImage tail;
int x;
int y;
void setup () {
 donkey = loadImage("donkey.gif");
 tail = loadImage("tail.png");
 tail.resize(100, 200);
 size(719, 437);
}

void draw () {
  rect(0, 0, 20, 20);
  rect(30, 40, 10, 10);
  background(donkey);
  image(tail, mouseX - 80, mouseY - 10);
  println("X is " + mouseX + " Y is " + mouseY);
  if (dist(0, 0, mouseX, mouseY) > 30) {
  background(255, 255, 255);
  image(tail, mouseX - 80, mouseY - 10);
  if (mousePressed){
    x = mouseX - 80;
    y = mouseY - 10;
    image(tail, x, y);
  }
  }
}