public class Prism
{
    private int l;
    private int w;
    private int h;

    public Prism(int l, int w, int h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public Prism(int allSides){
        l = allSides;
        w = allSides;
        h = allSides;
    }

    public Prism(){
        int lolRandom = (int)(Math.random() * 91 + 10);
        l = lolRandom;
        w = lolRandom;
        h = lolRandom;
    }

    public void setW(int newW){
        w = newW;
    }

    public void setL(int newL){
        l = newL;
    }

    public void setH(int newH){
        h = newH;
    }

    public int volume(){
        return l * w * h;
    }

    public int surfaceArea(){
        return 2 *(l * w) + 2 *(l * h) + 2 *(h * w);
    }

    public String toString(){
        return "Length = " + l + "\nWidth = " + w + "\nHeight = " + h;
    }
}

