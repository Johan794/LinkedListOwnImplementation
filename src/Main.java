public class Main {
	
	public static void main(String[] args) {
		OwnLinkedList<Integer> list = new OwnLinkedList<>();
		list.add(1);
		System.out.println(list.getNode(1).getValue());
		list.add(5);
		System.out.println(list.getNode(2).getValue());
		list.add(3);
		System.out.println(list.getNode(3).getValue());
	}
	
	
}
