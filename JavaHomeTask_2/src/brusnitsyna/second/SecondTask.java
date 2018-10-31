package brusnitsyna.second;

public class SecondTask {
	public static void main(String[] args) {
		try {
			Notepad notes = new Notepad();
			notes.addNote();
			notes.addNote();
			notes.printAllNotes();
			notes.changeNote();
			notes.printAllNotes();
			notes.removeNote();
			notes.printAllNotes();
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
