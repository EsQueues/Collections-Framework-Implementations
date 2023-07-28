import java.util.Arrays;
import java.util.Objects;

public class MyLinkedList<E>  {
    private class Node {
      private E value;
      private Node prev;
      private Node next;

        public Node(E value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }
    public int indexOf(E element){
        Node temp=head;
        int curInd=0;
        while(temp!=null){
            if(temp.value==element)
                return curInd;
            curInd++;
            temp=temp.next;
        }
        return -1;
    }
    public boolean contains(E o){
        return indexOf(o)>=0;
    }

    public void add(E element){
        Node l=tail;
        Node newEl=new Node(element,tail,null);
        tail=newEl;
        if(l==null){
            head=newEl;
        }
        else {
            l.next=newEl;
        }
        size++;
    }

   public void remove(int index){
        if(index==0){
            head=head.next;
            size--;
            return;
        }
        Objects.checkIndex(index,size);
        int curInd=0;
        Node temp=head;
        while(temp!=null){
            if(index-1==curInd){
                temp.next=temp.next.next;
                size--;
                return;
            }
            temp=temp.next;
            curInd++;
        }
   }
   public void set(int index,E element){
        Node temp=head;
        int curInd=0;
        while(temp!=null){
            if(curInd==index){
                temp.value=element;
            }
            curInd++;
            temp=temp.next;
        }
   }
    public E get(int index){
        int curInd=0;
        Node temp=head;
        while(temp!=null){
            if(curInd==index){
                return temp.value;
            }
            temp=temp.next;
            curInd++;
        }
        throw new IndexOutOfBoundsException();
    }

    public String toString(){
        Node temp=head;
        E []arr=(E[]) new Object[size];
        int i=0;
        while(temp!=null){
            arr[i]=temp.value;
            temp=temp.next;
            i++;
        }
        return Arrays.toString(arr);
    }
}
