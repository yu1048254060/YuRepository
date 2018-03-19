package com.bc;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopyArrList {
    public  void test(){
        List<Integer> list= Arrays.asList(new Integer []{2,6});
        CopyOnWriteArrayList<Integer> cplist=new CopyOnWriteArrayList<Integer>(list);
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        executorService.execute(new ReadThread(cplist));
        executorService.execute(new WriteThread(cplist));
        executorService.execute(new WriteThread(cplist));
        executorService.execute(new WriteThread(cplist));
        executorService.execute(new ReadThread(cplist));
        executorService.execute(new WriteThread(cplist));
        executorService.execute(new ReadThread(cplist));
        executorService.execute(new WriteThread(cplist));
        System.out.println(cplist.size());

    }
    public static void main(String[] args) {
        new   CopyArrList().test();

    }
}
