public class Test {
	public static void main(String [] args) {
		Editor editor = new Editor();
		Image image = new Image(1000, 500);
		BlurCommand blurCommand = new BlurCommand(image, 50);
		ResizeCommand resizeCommand = new ResizeCommand(image, 200, 200);
		image.printBlurStrength();
		image.printImageSize();
		editor.editImage(blurCommand);
		System.out.println("------------------------");
		image.printBlurStrength();
		System.out.println("------------------------");

		editor.editImage(resizeCommand);
		System.out.println("------------------------");
		image.printImageSize();

		System.out.println("------------------------");
		editor.undoEditImage();
		image.printImageSize();
		System.out.println("------------------------");
	}
}
