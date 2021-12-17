/**
 * Implementarea unei comenzi.
 * 
 * */
public class BlurCommand implements Command {
	private final Image image;
	private int previousBlurStrength;
	private int currentBlurStrength;

	public BlurCommand(Image image, int blurStrength) {
		this.image = image;
		this.currentBlurStrength = blurStrength;
	}

	@Override
	public void execute() {
		previousBlurStrength = image.getBlurStrength();
		image.setBlurStrength(currentBlurStrength);
	}

	@Override
	public void undo() {
		currentBlurStrength = previousBlurStrength;
		previousBlurStrength = image.getBlurStrength();
		image.setBlurStrength(currentBlurStrength);
	}
}
