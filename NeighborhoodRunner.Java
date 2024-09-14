import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
/*
   * Creates a new MuralPainter and a new PenguinPainter
   */
 MuralPainter popper = new MuralPainter();
 PenguinPainter captain = new PenguinPainter();

    /*
   * Creates a mural of a penguin
   */
   popper.paintBackground("SkyBlue",32);
   captain.outline("black");
   captain.body();
   captain.feetBeakEyes();
 }
}