package oldherd.lang.words;

public class Word {
	//设置单词时需要整套的设置,因为我们认为单词的词义不应该被随时更改
	protected String naturalWord;
	protected String meaning;
	boolean isInited;
	
	{
		isInited = false;
		naturalWord = new String();
		meaning = new String();
	}
	
	public Word() {
	}
	public Word(String naturalWord, String meaning) {
		this.set(naturalWord, meaning);
	}
	public String getWord() {
		if(isInited)
			return this.naturalWord;
		//Else Exception
		return null;
	}
	public String getMeaning() {
		if(isInited)
			return this.meaning;
		//Else Exception
		return null;
	}
	public void set(String naturalWord, String meaning) {
		this.isInited = true;
		this.naturalWord = naturalWord;
		this.meaning = meaning;
	}
}
