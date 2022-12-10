import java.io.IOException;
import java.util.ArrayList;

public class Day02 extends Day {
    @Override
    public String runPartOne() throws IOException {
        String input = readInput("day02.txt");
        String[] kombinations = input.split("\r\n");
        ArrayList<String[]> elements = new ArrayList<>();
        for (String kombination : kombinations) {
            elements.add(kombination.split(" "));
        }
        int points = 0;
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i)[0].equals("A") && elements.get(i)[1].equals("X")) {
                points += 4;
            }
            if (elements.get(i)[0].equals("A") && elements.get(i)[1].equals("Y")) {
                points += 8;
            }
            if (elements.get(i)[0].equals("A") && elements.get(i)[1].equals("Z")) {
                points += 3;
            }
            if (elements.get(i)[0].equals("B") && elements.get(i)[1].equals("X")) {
                points += 1;
            }
            if (elements.get(i)[0].equals("B") && elements.get(i)[1].equals("Y")) {
                points += 5;
            }
            if (elements.get(i)[0].equals("B") && elements.get(i)[1].equals("Z")) {
                points += 9;
            }
            if (elements.get(i)[0].equals("C") && elements.get(i)[1].equals("X")) {
                points += 7;
            }
            if (elements.get(i)[0].equals("C") && elements.get(i)[1].equals("Y")) {
                points += 2;
            }
            if (elements.get(i)[0].equals("C") && elements.get(i)[1].equals("Z")) {
                points += 6;
            }
        }
        return Integer.toString(points);
    }

    @Override
    public String runPartTwo() throws IOException {
        String input = readInput("day02.txt");
        String[] kombinations = input.split("\r\n");
        ArrayList<String[]> elements = new ArrayList<>();
        for (String kombination : kombinations) {
            elements.add(kombination.split(" "));
        }
        for (int i = 0; i < elements.size(); i++) {
            if(elements.get(i)[1].equals("X")){
                elements.get(i)[1] = "lose";
            }if(elements.get(i)[1].equals("Y")){
                elements.get(i)[1] = "draw";
            }if(elements.get(i)[1].equals("Z")){
                elements.get(i)[1] = "win";
            }
        }
        int points = 0;
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i)[0].equals("A") && elements.get(i)[1].equals("lose")) {
                points += 3;
            }
            if (elements.get(i)[0].equals("A") && elements.get(i)[1].equals("draw")) {
                points += 4;
            }
            if (elements.get(i)[0].equals("A") && elements.get(i)[1].equals("win")) {
                points += 8;
            }
            if (elements.get(i)[0].equals("B") && elements.get(i)[1].equals("lose")) {
                points += 1;
            }
            if (elements.get(i)[0].equals("B") && elements.get(i)[1].equals("draw")) {
                points += 5;
            }
            if (elements.get(i)[0].equals("B") && elements.get(i)[1].equals("win")) {
                points += 9;
            }
            if (elements.get(i)[0].equals("C") && elements.get(i)[1].equals("lose")) {
                points += 2;
            }
            if (elements.get(i)[0].equals("C") && elements.get(i)[1].equals("draw")) {
                points += 6;
            }
            if (elements.get(i)[0].equals("C") && elements.get(i)[1].equals("win")) {
                points += 7;
            }
        }
        return Integer.toString(points);
    }

}
