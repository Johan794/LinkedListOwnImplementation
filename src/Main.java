public class Main {
	
	public static void main(String[] args) {
		
		OwnLinkedList<Integer> list = new OwnLinkedList<>();
		list.add(1);
		list.add(5);
		
		for(int i=1;i<list.getSize();i++) {
			System.out.println(list.getNode(i).getValue());
		}
	}
	
	
}
