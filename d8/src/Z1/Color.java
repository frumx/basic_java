package Z1;

public enum Color {
	RED(false), WHITE(true), BLUE(true);

	boolean pretty;

	Color(boolean pretty) {
		this.pretty = pretty;
	}
}
