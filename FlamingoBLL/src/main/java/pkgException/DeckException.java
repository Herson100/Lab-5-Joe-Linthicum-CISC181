package pkgException;

import pkgCore.Deck;

public class DeckException extends Exception {

	private Deck c;

	public DeckException(Deck c) {
		super();
		this.c = c;
	}

	protected Deck getD() {
		return c;
	}
	
}
