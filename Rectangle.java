package sk.itsovy.mati.projectfragment;

public class Rectangle {
    private int a;
    private int b;
    private char character;
    private boolean fill;

    public Rectangle(int a, int b, char character, boolean fill) {
        this.a = a;
        this.b = b;
        character = '#';
        fill = false;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public int calcArea(){
        return a*b;
    }
    public int calcPerimeter(){
        return 2*a+2*b;
    }
    public double calcDiagonale(){
        return Math.sqrt(a*a+b*b);
    }
    public void showRectangle(){
        System.out.println();
        for (int r=1; r<=b; r++){
            for (int c=1; c<=a; c++){
                if (r==1 ││ r==b ││ c==1 ││ c==a){
                    System.out.println(character);
                }
                else if (fill){
                System.out.println(character);
            }
                else
                    System.out.print(' ');
        }
            System.out.println();
    }
        public void print(){
            System.out.println(toString());
        }
        
        @Override
        public String toString(){
            return "Rectangle: a= "+a+" , b= "+b;
        }
}
