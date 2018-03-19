package com.bc;

import java.util.List;

public class WriteThread implements Runnable {
    private List<Integer> list;

    public WriteThread(List<Integer> list) {
        this.list = list;
    }

    public void run() {
        for(Integer ele:list){
            System.out.println("WriteThread"+ele);
        }
    }
}
