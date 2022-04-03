package queue;

import list.StringLinkedList;

public class StringQueue {

    StringLinkedList list = new StringLinkedList();

//    TODO napisać testy

    public void insert(String item){
        list.add(item);
    }

    public String remove(){
        String item = list.get(0);
        list.remove(0);
        return item;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }
}
