//import processing.*;
import processing.core.PApplet;
public class Tryprocessing extends PApplet {
    int x=0;
    int j=0;
    int r=0;
    int k=0;
    @Override
    public void settings() {
        super.settings();
        size(640,488);
    }

    @Override
    public void draw() {

        ellipse(x,640/6,20,20);
        x++;
        ellipse(j,640*2/6,20,20);
        j=j+2;
        ellipse(r,640*3/6,20,20);
        r=r+3;
        ellipse(k,640*4/6,20,20);
        k=k+4;
    }

    public static void main(String[] args) {
        PApplet.main("Tryprocessing",args); }
}
