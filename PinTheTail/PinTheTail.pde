PImage donkey;
PImage tail;
int x;
int y;
boolean isPressed = false;
 import ddf.minim.*;
AudioSample woohooSound;
boolean playSound = true;

void setup () {
 donkey = loadImage("donkey.gif");
 tail = loadImage("tail.png");
 tail.resize(100, 200);
 size(719, 437);

Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("yayy.wav");
}

void draw () {
  rect(0, 0, 20, 20);
  rect(30, 40, 10, 10);
  background(donkey);

  if (dist(0, 0, mouseX, mouseY) > 30) {
    background(255, 255, 255);
  }
   if (isPressed == true) {
      image(tail, x, y);
    } else {
     image(tail, mouseX - 80, mouseY - 10);
    }
   if (mousePressed){
    isPressed = true;
    x = mouseX - 80;
    y = mouseY - 10;
    if ((x+80) >= 30 && (x+80) <= 40 && (y+80) >= 40 && (y+80) >= 50) {
    print("You pinned the tail on the donkey! ");
    if (playSound) {
     woohooSound.trigger();
     playSound = false;
    }
  } else {
    print("nope ");
  }
  }
  
  
}