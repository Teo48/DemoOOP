/**
 * Implementarea unei comenzi.
 *
 * */
public class ResizeCommand implements Command {
	private final Image image;
	private int previousWidth;
	private int previousLength;
	private int currentWidth;
	private int currentLength;

	public ResizeCommand(Image image, int width, int length) {
		this.image = image;
		currentWidth = width;
		currentLength = length;
	}

	@Override
	public void execute() {
		previousWidth = image.getWidth();
		image.setWidth(currentWidth);

		previousLength = image.getLength();
		image.setLength(currentLength);
	}

	@Override
	public void undo() {
		currentWidth = previousWidth;
		previousWidth = image.getWidth();
		image.setWidth(currentWidth);

		currentLength = previousLength;
		previousLength = image.getLength();
		image.setLength(currentLength);
	}
}