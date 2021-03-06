package com.yzd.machinelearninginaction.demo.t1;

import java.util.ArrayList;

public class HorseColicML{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility = new Utility();
		
		// build trainingset
		System.out.println("Training System....");
		ArrayList<Horse> trainingSet = utility.readHorseColicfile("t1/Outputfiles/horseTrain.txt");
		ArrayList<Variable> variableSets = Horse.getAllVar();
		Tree tree = new Tree();
		
		Node decisionTree = tree.buildTree(trainingSet, variableSets);
		utility.printNode(decisionTree);
		
		// testing DT
		System.out.println("\tTesting System (trainingSet)....");
		utility.testTree(trainingSet, decisionTree);
		
		System.out.println();
		System.out.println("\tTesting System (testSet)....");
		ArrayList<Horse> testSet = utility.readHorseColicfile("t1/Outputfiles/horseTest.txt");
		utility.testTree(testSet, decisionTree);
		

	}
}
