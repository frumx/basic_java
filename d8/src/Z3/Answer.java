package Z3;

public enum Answer {

	TAK(true), NIE(false), T(true), N(false), YES(true), NO(false), OK(true), SURE(true), NOPE(false);

	private boolean value;

	public boolean isCorrect() {
		return value;
	}

	public String getAnswer() {
		if (isCorrect())
			return "Poprawna odpowiedz";
		else
			return "Niepoprawna odpowiedz";
	}

	Answer(boolean value) {
		this.value = value;
	}

}
