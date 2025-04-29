package ect;

public class cloneEx implements Cloneable {
    String name;

    public cloneEx(String name) {
        this.name = name;
    }
    public String toString(){
        return name;
    }
    public static void main(String[] args) {
        cloneEx c1 =new cloneEx("박진웅");
        cloneEx c2= c1;
        System.out.println(c1);
        System.out.println(c2);
        c2.name="윤영주";
        System.out.println(c1);
        System.out.println(c2);
        c1.clone(c2);


    }

    private void clone(cloneEx c2) {

    }

}
