/**
 * Image reprezinta receiverul
 * */
public class Image {
	private int blurStrength;
	private int length;
	private int width;

	public Image(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getBlurStrength() {
		return blurStrength;
	}

	public void setBlurStrength(int blurStrength) {
		this.blurStrength = blurStrength;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void printImageSize() {
		System.out.println("Image size: " + length + "x" + width);
	}

	public void printBlurStrength() {
		System.out.println("BlurStrength value: " + blurStrength);
	}
}