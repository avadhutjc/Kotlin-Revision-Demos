package com.ajc.kotlin_revision_demos;

import kotlin.jvm.JvmStatic;
// https://github.com/avadhutjc/Kotlin_Practice.git
//https://github.com/avadhutjc/Kotlin_Practice.git

public class Java {//

    public static void main(String[] args) {
        String str = "avadhtu";
        System.out.println(str);

        //Utils.INSTANCE.doSomething();
        //Utils.doSomething();

        //com.ajc.kotlin_revision_demos.DoNothing.Utils.INSTANCE.doSomething();
        DoNothing.Utils.doSomething();

        DoNothing.Utils.INSTANCE.cool();

        //System.out.println(11>>1);
    }
}