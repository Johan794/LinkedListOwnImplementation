public class Main {
	
	public static void main(String[] args) {
		OwnLinkedList<Integer> list = new OwnLinkedList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(9);


		for (int i = 0; i < list.getSize() ; i++) {
			System.out.println(list.getNode(i).getValue());
		}
	}
	
	
}
