package org.practice;

/**
 * Program : Desktop Search (File or Folder)
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DeskTopSearch {

	public List<File> search(List<File> outputList,String topFolderName, String searchOption, String searchPattern, long startTime, Integer timeout){
		
		File file = new File(topFolderName);
		if(file.exists()){
			File[] allFiles = file.listFiles();
			if(allFiles != null && allFiles.length > 0) {
				for (File tempFile : allFiles) {
					switch(isTimeOver(startTime, timeout)){
						case 0:
							System.out.println("Timeout.. Program exits..");
							break;
						case 1: 
							switch (searchOption) {
							case "BOTH":
								addMatchedFileNameToList(outputList,tempFile,searchPattern);
								search(outputList, tempFile.getPath(), searchOption, searchPattern, startTime, timeout);
								break;
							case "FILE":
								if(!tempFile.isDirectory())
									addMatchedFileNameToList(outputList,tempFile,searchPattern);
								search(outputList, tempFile.getPath(), searchOption, searchPattern, startTime, timeout);
								break;
							case "FOLDER":
								if(tempFile.isDirectory())
									addMatchedFileNameToList(outputList,tempFile,searchPattern);
								search(outputList, tempFile.getPath(), searchOption, searchPattern, startTime, timeout);
								break;
							default:  
								System.out.println("-------------INVALID SEARCH OPTION-------------");
                           		break;
							}
							break;
					}
				}
			}
		}
		
		return outputList;
	}
	
	private void addMatchedFileNameToList(List<File> outputList, File tempFile, String searchPattern) {
		if(tempFile.getName().contains(searchPattern))
			outputList.add(tempFile);
	}

	private int isTimeOver(Long startTime, Integer timeout) {
		Long currentTime = System.currentTimeMillis();
		if(currentTime >= startTime+timeout)
			return 0;
		else
			return 1;
	}

	public static void main(String[] args) {
		List<File> outputSearchResult = new ArrayList<>();
		DeskTopSearch outputSearch = new DeskTopSearch();
		Long startTime = System.currentTimeMillis();
		outputSearchResult = outputSearch.search(outputSearchResult, "H:", "BOTH", "Nov26", startTime, 1000000);
		
		if(outputSearchResult.size() > 0){
			System.out.println("Output search result below : ");
			for (File file : outputSearchResult) {
				System.out.println(file.getPath());
			}
		} else
			System.out.println("File not found");
		
		Long endTime = System.currentTimeMillis();
		System.out.println("Time Taken (in secs) : " + (endTime - startTime)/1000);
		System.out.println("End of File search");
	}

}
