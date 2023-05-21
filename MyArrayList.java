import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList< T extends Comparable<T>>{
    private T[]items;
    private int capacity =10;
    private int size;




    public void add(T elem){
        if (size==capacity){
            T[]a=(T[]) Array.newInstance(elem.getClass(),capacity);
            System.arraycopy(items,0,a,0,size);
            items=a;
            capacity*=2;

        }
        items[size++]=elem;
    }

    public MyArrayList(T[]a){
        this.items= Arrays.copyOf(a,a.length);
        capacity=size=a.length;

    }

    public MyArrayList(Class<T>dataTybe){
        items=(T[]) Array.newInstance(dataTybe,capacity);
    }
    public MyArrayList(Class<T>dataTybe,int capacity){
        items=(T[]) Array.newInstance(dataTybe,capacity);
        this.capacity=capacity;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "items=" + Arrays.toString(items) +
                ", capacity=" + capacity +
                ", size=" + size +
                '}';
    }

    public MyArrayList(){
        items=(T[])new Object[capacity];

    }
    public MyArrayList(int capacity){
        items=(T[])new Object[capacity];
        this.capacity=capacity;
    }

    public T[] getItems() {
        return items;
    }

    public void setItems(T[] items) {
        this.items = items;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}