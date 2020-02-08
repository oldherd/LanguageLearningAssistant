package oldherd.lan;

public abstract class Word {
	protected String naturalWord;
	public abstract void set();
	public String getWord() {
		return this.naturalWord;
	}
}
