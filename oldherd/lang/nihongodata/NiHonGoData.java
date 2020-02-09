import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.nio.file.Paths;
import java.io.*;
import oldherd.lang.words.nihongo.NiHonGo;

class NiHonGoDataLoader{
    private ArrayList<NiHonGo> words;
    private int numberOfWords;
    NiHonGoDataLoader() {
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
            words.add(new NiHonGo(naturalWord, meaning, pronounce));
            ++numberOfWords;
        }
    }
    public int size() {
        return this.numberOfWords;
	}
    public NiHonGo genWord(int index) {
        return words.get(index);
    }
    public boolean hasWord() {
        return this.numberOfWords > 0;
    }
}

public class NiHonGoData {
	private NiHonGoDataLoader data;
	public NiHonGoData() {
		data = new NiHonGoDataLoader();
    }
	public void load() throws IOException {
		data.load("niHonGoData.in");
	}
	public void load(String[] fileNames) throws IOException {
		for(String fileName : fileNames)
			data.load(fileName);
	}
	public NiHonGo[] genWords(int numberOfNeeds) {
        if(!data.hasWord()) {
            //Exeption ...
            return null;
        }
        NiHonGo[] words = new NiHonGo[numberOfNeeds];
        Random idGen = new Random();
        for(int i = 0; i < numberOfNeeds; ++i) {
            words[i] = data.genWord(idGen.nextInt(data.size()));
        }
        return words;
	}
}
