import java.util.Arrays;
import java.util.Objects;

public class MyArrayList <T>{
    private int size;

    private T[]elementData=(T[]) new Object[10];
    /*i did not do any constructures(Initial capacity, etc.) because in daily use
    this constructures useless. Just i have gaven default capacity as in original ArrayList(10). */



    //this method is increase the size to 1
    private T[] grow(){
        return Arrays.copyOf(elementData,size+1);
    }
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public int indexOf(Object o){
        for(int i=0;i<size;i++){
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }
    public boolean contains(Object o){
        return indexOf(o)>=0;
    }

    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    public T get(int index){
        Objects.checkIndex(index,size);
        return elementData[index];
    }

    public void set(int index,T element){
        Objects.checkIndex(index,size);
        elementData[index]=element;
    }

    private void add(T element,T[]elementData, int index){
        if(index== elementData.length)
            elementData=grow();
        elementData[index]=element;
        size++;
    }
    public void add(T element){
        add(element,elementData,size);
    }
    public void add(int index,T element){
        Objects.checkIndex(index,elementData.length);
        if(elementData.length-1==index){
            elementData=grow();
        }
        System.arraycopy(elementData,index,elementData,index+1,size-index);
        elementData[index]=element;
        size++;
    }

    public void remove(int index){
        Objects.checkIndex(index,elementData.length);
        System.arraycopy(elementData,index+1,elementData,index,size-index);
        size--;
    }
    public String toString(){
        return Arrays.toString(toArray());
    }

}
