package exercise2;

public class MyDList<E>
{

	private MyNode<E> head;
	private MyNode<E> tail;
	private int size;
        
        public MyDList(){
            this.size = 0;
            this.head = null;
            this.tail = null;            
        }
        
        public boolean isEmpty(){
            return size == 0;
        }
        
        public int size(){
            return this.size;
        }
        
        public MyNode<E> getHead(){
            return head;
            
        }
        
        
        
        public void addFirst(E item){
            MyNode<E> newNode = new MyNode<>(item, null, null);
            if(isEmpty()){
                head = newNode;
                tail = newNode;
            }
            else{
                newNode.setNext(head);
                head.setPrev(newNode);
                head = newNode;
            }
            size += 1;
            
            
        }
        
        
        public void addLast(E item){
            MyNode<E> newNode = new MyNode<>(item, null, null);
            if(isEmpty()){
                head = newNode;
                tail = newNode;
            }
            else{
                newNode.setPrev(tail);
                tail.setNext(newNode);
                tail = newNode;
            }
            size += 1;
        }
        
        
        public E removeFirst(){
            
            
            if(isEmpty()){
                return null;
            }
            E currentElement = head.getElement();
            
            if(head.equals(tail)){
                head = null;
                tail = null;
            }
            
            else{
                head = head.getNext();
                head.setPrev(null);
            }
            size -= 1;
            return currentElement;
        }
        
        
        public E removeLast(){
            if(isEmpty()){
                return null;
            }
            
            E currentElement = tail.getElement();
            if (head.equals(tail)){
                head = null;
                tail = null;
            }
            else{
                tail = tail.getPrev();
                tail.setNext(null);
            }
            size -=1;
            return currentElement;
            
        }
}
