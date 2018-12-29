package basic;

public class RoomInterfaceMain {
	 
	public static void main(String[] args) {
		
		// You can assign interface reference variable to concrete implementation
		RoomInterface room=new SimpleRoom();
		room.showRoom();
		
		System.out.println("=================");
		
		// You can easily change implementation
		room=new SpecialRoom();
		room.showRoom();
	}
}
