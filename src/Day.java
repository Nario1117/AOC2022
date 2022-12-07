import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

abstract public class Day {
	abstract public String runPartOne() throws IOException;
	abstract public String runPartTwo() throws IOException;

	public String readInput(String filename) throws IOException {
		Path filePath = Paths.get("input/" + filename).toAbsolutePath();
		return Files.readString(filePath);
	}
}
