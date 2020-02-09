package oldherd.lan.niHonGo;

import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.io.*;
import oldherd.lan.NHWord;
//import oldherd.lan.DataReader;

class NiHonGoDataReader{
	//private ArrayList<String> naturalWord;
	//private ArrayList<String> pronounce;
	//private ArrayList<String> meaning;
	private ArrayList<NHWord> words;
	private int numberOfWords;
	public NiHonGoDataReader() {
		//naturalWord = new ArrayList<>(100);
		//pronounce = new ArrayList<>(100);
		//meaning = new ArrayList<>(100);
		words = new ArrayList<>(100);
		numberOfWords = 0;
	}
	public void load(String fileName) throws IOException {
		Scanner in = new Scanner(Paths.get(fileName, "UTF-8"));
		while(in.hasNext()) {
			//...Exception
			String naturalWord = in.next();
			String pronounce = in.next();
			String meaning = in.next();
			words.add(NHWord(naturalWord, meaning, pronounce));
			++numberOfWords;
		}
	}
	public int size() {
		return this.numberOfWords;
	}
}

public class NiHonGo {
	private NiHonGoDataReader data;
	public NiHonGo() {
		data = new NiHonGoDataReader();
	}
	public void load() throws IOException {
		data.load("noHonGo.in");
	}
	public void load(String[] fileNames) throws IOException {
		for(String fileName : fileNames)
			data.load(fileName);
	}
	public NHWord[] genWords(int numberOfNeeds) {
		;
	}
}
