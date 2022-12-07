import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Day01 extends Day {

	@Override
	public String runPartOne() throws IOException {
		String input = readInput("day01_test.txt");
		String[] elves = input.split("\r\n\r\n");
		ArrayList<String[]> foodDoses = new ArrayList<>();
		HashMap<Integer, Integer> mainFood = new HashMap();

		for (int i = 0; i < elves.length; i++) {
			foodDoses.add(elves[i].split("\r\n"));
		}
		int finalFood;
		for (int y = 0; y < foodDoses.size(); y++) {
			finalFood = 0;
			for (int i = 0; i < foodDoses.get(y).length; i++) {
				int food = Integer.parseInt(foodDoses.get(y)[i]);
				finalFood += food;
			}
			mainFood.put(y, finalFood);
		}
		//for (int i = 0; i < mainFood.size(); i++) {
		//	System.out.println(mainFood.get(i));
		//}
		int sizeCheck = 0;
		for (int i = 0; i < mainFood.size(); i++) {
			if (mainFood.get(i) > sizeCheck) {
				sizeCheck = mainFood.get(i);
			}
		}

		return Integer.toString(sizeCheck);
	}

	@Override
	public String runPartTwo() throws IOException {
		String input = readInput("day01_test.txt");
		String[] elves = input.split("\r\n\r\n");
		ArrayList<String[]> foodDoses = new ArrayList<>();
		HashMap<Integer, Integer> mainFood = new HashMap();

		for (int i = 0; i < elves.length; i++) {
			foodDoses.add(elves[i].split("\r\n"));
		}
		int finalFood;
		for (int y = 0; y < foodDoses.size(); y++) {
			finalFood = 0;
			for (int i = 0; i < foodDoses.get(y).length; i++) {
				int food = Integer.parseInt(foodDoses.get(y)[i]);
				finalFood += food;
			}
			mainFood.put(y, finalFood);
		}
		//for (int i = 0; i < mainFood.size(); i++) {
		//	System.out.println(mainFood.get(i));
		//}
		int sizeCheck = 0;
		int sizeCheck1 = 0;
		int sizeCheck2 = 0;
		int controlSmall;
		int controlBig;
		for (int i = 0; i < mainFood.size(); i++) {
			if (mainFood.get(i) > sizeCheck) {
				sizeCheck = mainFood.get(i);
			}
			if (sizeCheck > sizeCheck1) {
				controlSmall = sizeCheck1;
				controlBig = sizeCheck;
				sizeCheck1 = controlBig;
				sizeCheck = controlSmall;

			}
			if (sizeCheck1 > sizeCheck2) {
				controlSmall = sizeCheck2;
				controlBig = sizeCheck1;
				sizeCheck1 = controlSmall;
				sizeCheck2 = controlBig;

			}
		}
		int bigOne = sizeCheck1 + sizeCheck2 + sizeCheck;

		return Integer.toString(bigOne);
	}
}
