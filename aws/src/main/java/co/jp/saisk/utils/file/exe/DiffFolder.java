package co.jp.saisk.utils.file.exe;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class DiffFolder {

	public static void main(String[] args) {
		try {
			String propFileName = "prop.properties";
			if (args.length>0) {
				propFileName = args[0];
			}
			
			
			Properties prop = new Properties();
			prop.load(new FileInputStream(propFileName));
			String fromBrach = prop.getProperty("fromBrach");
			String toBrach = prop.getProperty("toBrach");
			System.out.println(fromBrach);
			System.out.println(toBrach);
			
			File folder1 = new File(fromBrach);
			File folder2 = new File(toBrach);
			
			
			List<String> files1 = listFiles(folder1);
			List<String> files2 = listFiles(folder2);	
			
			List<String> differentFilesDel = files1.stream().filter(f->!files2.contains(f)).collect(Collectors.toList());
			differentFilesDel.forEach(str -> System.out.println("add\t" + str));
			List<String> differentFilesAdd = files2.stream().filter(f->!files1.contains(f)).collect(Collectors.toList());
			differentFilesAdd.forEach(str -> System.out.println("del\t" + str));

			for(String file : files1) {
				
				File file1 = new File(folder1.getAbsolutePath() + File.separator + file);
				File file2 = new File(folder1.getAbsolutePath() + File.separator + file);

				try {
					if(files2.contains(file)&& !Files.readAllLines(file1.toPath()).equals(Files.readAllLines(file2.toPath()))) {
						System.out.println("upt\t" + file);
					}
				} catch (Exception e) {
					System.out.println(file1.toPath());
					System.out.println(file2.toPath());
					e.printStackTrace();
				}
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static List<String> listFiles(File folder) throws IOException {
		
		return Files.walk(folder.toPath())
				.filter(Files::isRegularFile)
				.filter(f->!f.toString().contains(".get"))
				.filter(f->f.toString().contains("\\bin\\"))
				.filter(f->f.toString().contains(".gradle"))
				.map(path->folder.toPath().relativize(path).toString())
				.collect(Collectors.toList());
	}
}

