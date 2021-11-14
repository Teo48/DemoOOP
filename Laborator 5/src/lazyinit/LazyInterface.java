package lazyinit;

public interface LazyInterface {
	static int init() {
		return 10;
	}

	int a = init();
}
