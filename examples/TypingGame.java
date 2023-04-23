package examples;

import java.util.ArrayList;
import java.util.Random;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TypingGame {
	private ArrayList<String> adjectiveList;
    private ArrayList<String> nounList;
    private ArrayList<String> colorList;
    private ArrayList<String> countryList;
    private ArrayList<String> nameList;
    private ArrayList<String> animalList;
    private ArrayList<String> timeList;
    private ArrayList<String> verbList;
    private ArrayList<String> fruitList;
    private ArrayList<String> alreadyUsed = new ArrayList<String>();
    private Random myRandom;
    private String path = "src/data";
    
	public TypingGame() {
		initializeWords();
		myRandom = new Random();
	}
	
	private void initializeWords() {
		adjectiveList= readIt(path+"/adjective.txt"); 
        nounList = readIt(path+"/noun.txt");
        colorList = readIt(path+"/color.txt");
        countryList = readIt(path+"/country.txt");
        nameList = readIt(path+"/name.txt");      
        animalList = readIt(path+"/animal.txt");
        timeList = readIt(path+"/timeframe.txt");
        verbList = readIt(path+"/verb.txt");
        fruitList = readIt(path+"/fruit.txt");
	}
	public static void main(String[] args) {
		new TypingGame(); 
	}
}
