class Pen {
    String color;
    String type;
    public void write(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class ObjectOrientedProgramingSystem {
  public static void main(String[] args) {
    Pen pen1 = new Pen();
    pen1.color = "red";
    pen1.type = "ball pen";


    pen1.write();
  }
}
