PImage creeper;
PImage minecraft;
int creeperX = int(random(900));
int creeperX2 = int(random(900));
int creeperY = int(random(600));
int creeperY2 = int(random(600));
void setup() {
  size(900, 600);
  minecraft = loadImage("green.jpg");
  minecraft.resize(900, 600);
  creeper=loadImage("creeper.png");
  creeper.resize(15, 15);
}

void draw() {
  background(minecraft);
  image(creeper, creeperX, creeperY);
  image(creeper, creeperX2, creeperY2);
  noStroke();
  fill(#FA2D6B);

  if (mouseX == 0 && mouseY == 0){
    fill(#2DFA9F);
  }
  if (isWarm(mouseX, creeperX) == true && isWarm(mouseY, creeperY) == true) {
    fill(#E1FA2D);
  }
   if (isNear(mouseX, creeperX) == true && isNear(mouseY, creeperY) == true){
    fill(#2DFA9F);
  }
  if (isWarm(mouseX, creeperX2) == true && isWarm(mouseY, creeperY2) == true) {
    fill(#E1FA2D);
  }
   if (isNear(mouseX, creeperX2) == true && isNear(mouseY, creeperY2) == true){
    fill(#2DFA9F);
  }
  ellipse(mouseX, mouseY, 35, 35);
  
  if (mousePressed && abs((mouseX - creeperX)) <= 10 && abs((mouseY - creeperY)) <= 10) {
    print("You found a creeper! ");
  }
  if (mousePressed && abs((mouseX - creeperX2)) <= 10 && abs((mouseY - creeperY2)) <= 10) {
    print("You found a creeper! ");
  }
}
  boolean isNear(int a, int b) {
    if (abs(a-b) < 10)
      return true;
    else
      return false;
  }
   boolean isWarm(int a, int b) {
    if (abs(a-b) < 40)
      return true;
    else
      return false;
  }