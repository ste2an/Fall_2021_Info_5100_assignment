package assignment4.question1;

import java.util.ArrayList;

public class LinkedList{
    private ArrayList<Integer> arrayList;

    public LinkedList() {
        this.arrayList = new ArrayList<>();
    }

    public LinkedList(int ele) {
        this.arrayList = new ArrayList<>();

    }

    public void add(int ele){
        synchronized (LinkedList.class){
            arrayList.add(ele);
        }
    }

    public int get(int idx){
        synchronized (LinkedList.class){
            return arrayList.get(idx);
        }
    }

    public void addAtPosition(int index, int ele){
        synchronized (LinkedList.class){
            arrayList.add(index, ele);
        }
    }

    public void removeAtPosition(int index){
        synchronized (LinkedList.class){
           // int idx = arrayList.indexOf(ele);
            arrayList.remove(index);
        }
    }

    public int getFirst(){
        if(size() == 0){
            throw new ArrayIndexOutOfBoundsException("LinkedList has no elements");
        }
        synchronized (LinkedList.class){
            int i = arrayList.get(0);
            return i;
        }
    }

    public int getLast(){
        if(size() == 0){
            throw new ArrayIndexOutOfBoundsException("LinkedList has no elements");
        }

        synchronized (LinkedList.class){
            int i = arrayList.get(size() - 1);
            return i;
        }
    }

    public int size(){
        synchronized (LinkedList.class){
            return arrayList.size();
        }
    }

}
