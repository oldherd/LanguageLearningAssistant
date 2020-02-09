package oldherd.lan.niHonGo;

import oldherd.lan.Word;

public final class NHWord extends Word {
	private String pronounce;
	{
		pronounce = new String();
	}
	
	public NHWord() {
		super();
	}
	public NHWord(String naturalWord, String meaning, String pronounce) {
		super(naturalWord, meaning);
		this.set(naturalWord, meaning, pronounce);
	}
	
	public String getPronounce() {
		return this.pronounce;
	}
	public void set(String naturalWord, String meaning, String pronounce) {
		//Attention to the set of isInited!!!
		super.set(naturalWord, meaning);
		this.pronounce = pronounce;
	}
	
}
