package oldherd.lang.words.nihongo;

import oldherd.lang.words.Word;

public final class NiHonGo extends Word {
	private String pronounce;
	{
		pronounce = new String();
	}
	
	public NiHonGo() {
		super();
	}
	public NiHonGo(String naturalWord, String meaning, String pronounce) {
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
