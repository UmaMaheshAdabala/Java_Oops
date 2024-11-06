package Inheritence;

public class Box {
    int l;
    int w;
    int h;
    Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    Box(int side){
        this.l=side;
        this.h=side;
        this.w=side;
    }
    Box(int l, int w, int h){
        this.l=l;
        this.w=w;
        this.h=h;
    }
}
