package co.jp.saisk.utils.file.exe;

import java.awt.Desktop;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MoveFiles {

	
	private static final String SOURCE_FOLDER = "sourceFolder_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	
	
	public static void main(String[] args) {
		try {
			
			List<String> filepaths = Files.readAllLines(Paths.get("sourcelist.txt"));
			List<String> repofilepaths = Files.readAllLines(Paths.get("repositorylist.txt"));
			
			File newFolder = new File(SOURCE_FOLDER);
			newFolder.mkdirs();
			
			for(String filepath : filepaths) {
				Path source = Paths.get(filepath);
				File f = new File(filepath);
				
				if (filepath.contains("bin") || filepath.endsWith(".class")) {
					continue;
				}
				
				String key = checkRepoFolder(filepath,repofilepaths);
				if (key.length()!=0) {
					String p = f.getParent().substring(filepath.indexOf(key));
					File sub = new File(newFolder.getAbsolutePath() + File.separator + p);
					sub.mkdirs();
					String filename = filepath.substring(filepath.indexOf(key) );
					
					String toFile = newFolder.getAbsolutePath() + File.separator + filename;
					Path dest = Paths.get(toFile);
					System.out.println(File.separator + filename);
					Files.copy(source, dest,StandardCopyOption.REPLACE_EXISTING);
				}
				
			}
			Desktop.getDesktop().open(newFolder);
			
		} catch (Exception e) {
			System.out.println("ng");
			e.printStackTrace();
		}
		System.out.println("copy ok ver2024.03.12");
	}


	private static String checkRepoFolder(String filepath, List<String> repofilepaths) {
		for (String str : repofilepaths) {
			if (filepath.contains(str)) {
				return str;
			}
		}
		return "";
	}
}
