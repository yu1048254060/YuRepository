package com.bc;

import java.util.List;

public class ReadThread implements Runnable

{
    private List<Integer> list;

    public ReadThread(List<Integer> list) {
        this.list = list;
    }

    public void run() {
        for(Integer ele:list)
        System.out.println("ReadThread"+ele);
    }
}
