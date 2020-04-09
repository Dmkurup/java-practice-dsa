package com.codewithmosh;

import java.util.LinkedList;

public class HashTable {

    private class Entry{
        private int key;
        private String value;

        private Entry(int key,String value){
            this.key=key;
            this.value=value;
        }
    }

    private LinkedList<Entry>[]entries = new LinkedList[5];

    public void put(int key,String value) {
        Entry entry = getEntry( key );
        if (entry != null) {
            entry.value = value;
            return;
        }
        getOrCreateBucket( key ).add( new Entry( key, value ) );
    }

//        int index = hash(key);
//
//        if(entries[index]==null)
//            entries[index]=new LinkedList<>(  );
//
//        for(Entry entry :entries[index]){
//            if(entry.key==key) {
//                entry.value = value;
//                return;
//            }
//        }
//        entries[index].addLast( new Entry(key,value) );
//    }


    public String get(int key) {
        Entry entry = getEntry( key );

        return entry == null ? null : entry.value;
    }
//      int index = hash(key);
//      if(entries[index]!=null) {
//          for (Entry entry : entries[index]) {
//              if (entry.key == key)
//                  return entry.value;
//          }
//      }
//      return null;

 //   }

    public void remove(int key) {
        Entry entry = getEntry(key);
        if (entry == null)
            throw new IllegalStateException();
        getBucket(key).remove(entry);
    }

    public Entry getEntry(int key) {
        LinkedList<Entry> bucket = getBucket( key );
        if (bucket != null) {
            for (Entry entry :bucket) {
                if (entry.key == key)
                    return entry;
            }
        }
        return null;
    }



//        int index=hash(key);
//        if(entries[index]!=null){
//            for(Entry entry:entries[index]){
//                if(entry.key==key)
//                    entries[index].remove(entry);
//                throw new IllegalStateException(  );
//            }
//        }
//        throw new IllegalStateException(  );
//    }

    private LinkedList<Entry> getBucket(int key){
        return entries[hash(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key){
        int index = hash(key);
        if(entries[index]==null)
            entries[index]=new LinkedList<>(  );
        return entries[index];
    }

    private int hash(int key){
        return key%(entries.length);
    }


}
