


public class OwnLinkedList <T extends Comparable<T>>{
    private Node<T> first;
    private Node<T> last;
    private int size;

    public OwnLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if(first == null){
            first = newNode;
            last = first;
            size++;
        }else if(first.getNext()==null){
        	size++;
        	if(first.compareTo(newNode.getValue())>=0) {
        		first.setNext(newNode);
        		last= newNode;
        	}else{
        		last=first;
        		first=newNode;
        		first.setNext(last);
        		
        	}
        }else{
        	int i=1;
        	Node<T> temp=first;
        	boolean pos = false;
        	while(i<=size && temp.compareTo(newNode.getValue())<=0) {
        		i++;
        		temp = temp.getNext();	
        	}	
        	temp.setNext(temp);
        	temp = newNode;	
        }
    }



    public Node<T> getLast() {
        return last;
    }



    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public Node<T> getNode(int index){
        if(index>size){
            return null;
        }else {
            int i = 1;
            Node<T> node = first;
            boolean post = false;
            while (i<=index && !post){
            	if(i==index) {
            		post=true;
            	}else {
            		node = node.getNext();
            		i++;
            	}
            }
            return node;
        }
    }

    public int search(Node<T> node){
       int position = 0;
       //Node<T> temp = first;
       if(node.equals(first)){
           position= 1;
       }else if(node.equals(last)){
           position = size;
       } else {
           boolean out = false;
           Node<T> temp = first.getNext();
           position++;
           while (position<=size && !out){
               position++;
               if(node.equals(temp)){
                   out = true;
               }else{
                   temp = temp.getNext();
               }

           }
       }
       return position;
    }

    public void removeAll() {
    	first = null;
    	last = null;
    	size = 0;
    }
    

}
