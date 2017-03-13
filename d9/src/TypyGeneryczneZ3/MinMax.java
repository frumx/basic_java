package TypyGeneryczneZ3;

public class MinMax<T> {
	private T min;
	private T max;

	public MinMax(T min, T max) {
		super();
		this.min = min;
		this.max = max;
	}

	public T getMin() {
		return min;
	}

	public T getMax() {
		return max;
	}

}
