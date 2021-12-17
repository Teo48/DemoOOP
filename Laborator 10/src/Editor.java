import java.util.LinkedList;

/**
 * Editorul este invokerul nostru.
 * */
public class Editor {
	private LinkedList<Command> history = new LinkedList<>();

	public void editImage(Command command) {
		history.push(command);
		command.execute();
	}

	public void undoEditImage() {
		if (history.isEmpty()) {
			return;
		}

		Command command = history.pop();
		if (command != null) {
			command.undo();
		}
	}
}