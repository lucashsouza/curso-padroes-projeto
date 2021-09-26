package br.com.cod3r.composite.folders;

import br.com.cod3r.composite.folders.model.File;
import br.com.cod3r.composite.folders.model.FileSystemItem;
import br.com.cod3r.composite.folders.model.Folder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		FileSystemItem file1 = new File("File1.txt");
		FileSystemItem file2 = new File("File2.txt");
		FileSystemItem file3 = new File("File3.txt");
		FileSystemItem file4 = new File("File4.txt");
		FileSystemItem folder1 = new Folder("folder1", Arrays.asList(file1));
		FileSystemItem folder2 = new Folder("folder2", Arrays.asList(file2, folder1));

		FileSystemItem mainFolder = new Folder("mainFolder", Arrays.asList(folder2, file3, file4));
		mainFolder.print("");

		System.out.println("--------------");
		String dir = System.getProperty("user.dir");
		FileSystemItem fromDisk = createCompositeFromFile(new java.io.File(dir + java.io.File.separator + "src"));
		fromDisk.print(">");
	}

	public static FileSystemItem createCompositeFromFile(java.io.File file) {

		if (!file.isDirectory()) {
			return new File(file.getName());
		}

		List<FileSystemItem> childs = new ArrayList<>();
		java.io.File[] files = file.listFiles();

		for (java.io.File javaFile: files) {
			childs.add(createCompositeFromFile(javaFile));
		}

		return new Folder(file.getName(), childs);
	}
}
