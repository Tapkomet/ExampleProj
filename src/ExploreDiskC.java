import java.io.File;


public class ExploreDiskC {

	public static void main(String[] args) {
		File folder = new File("C:/");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
			System.out.println(file.getName());
		}

	}

}
