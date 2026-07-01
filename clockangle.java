import java.util.*;
public class clockangle {
    public void minutehourangle(double minute,double hour){
        double min_angle = 6*minute;
        double hour_angle = ((hour*30)+(minute*0.5));
        double ang = (hour_angle-min_angle);
        double angle = Math.abs(ang);
        
        if(angle>180){
            angle =360-angle;
        }
        System.out.println(angle);
    }
    public static void main(String[] args) {
        clockangle c = new clockangle();
        c.minutehourangle(3, 5);
    }
    
}
