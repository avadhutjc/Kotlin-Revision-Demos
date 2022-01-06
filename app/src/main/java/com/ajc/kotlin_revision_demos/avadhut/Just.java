package com.ajc.kotlin_revision_demos.avadhut;

public class Just {

    int a;
    int b;

    public void CoolSong() {
        System.out.println("Done Cool");
    }

    protected int getA() {
        return a;
    }

}

class Me extends Just {
    @Override
    public void CoolSong() {
        super.CoolSong();
    }

    public static void main(String[] args) {
        Me me = new Me();
        me.CoolSong();
    }

}