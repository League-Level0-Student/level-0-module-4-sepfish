void setup() {
  size(600, 200);

}

void draw() {
  background(#AFAAAA);
  fill(255, 255, 255);
  ellipse(200, 100, 135, 100);
  ellipse(400, 100, 135, 100);
  fill(0, 0, 0);
  if (mouseX <= 225 && mouseX >= 150 && mouseY <= 125 && mouseY >= 75){
  ellipse(mouseX, mouseY, 50, 50);
  ellipse(mouseX+200, mouseY, 50, 50);
  } else {
  ellipse(200, 100, 50, 50);
  ellipse(400, 100, 50, 50);
  }
}