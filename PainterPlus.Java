import org.code.neighborhood.*;

public class PainterPlus extends Painter {

public void turnRight() {
turnLeft();
turnLeft();
turnLeft();
 }
  

public void takeAllPaint() {
  while (isOnBucket()) {
    takePaint();
  }
 }

public void moveFast() {
while (canMove()) {
  move();
}
  
}

public void paintToEmpty(String color) {
  while (hasPaint()) {
    paint(color);
      move();
  }
}

public void paintDonut(String color) {
  while (hasPaint()) {
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
  }
}
  
// Will paint any line when this method is called as long as it includes what 
  //color and how many spaces to paint.
  
public void paintLine(String color, int size) {
   while (size > 0) {
     paint(color);
     move();
     size--;
   }
 } 

  //Allows the painter to move a lot of spaces without calling the move method multiple times.
  
  public void moveManySpaces () {
    while(canMove("East")){
      move();
    }
    if (canMove("South"))
      turnRight();
    move();
  }

//From MuralPainter--- will allow the painter to reset its position back to the original spawning point.
  
  
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }

  //From MuralPainter --- will allow the painter to turn around,
  //facing the opposite direction is was just facing
  
  public void turnAround() {
    turnLeft();
    turnLeft();
  }
}