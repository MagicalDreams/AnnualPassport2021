package us.magicaldreams.annualpassport2021.Config;
import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public class FileManager {
	
	static FileManager instance = new FileManager();
        //Make a new file
	FileConfiguration config;
	File cfile;
	
	public static FileManager getInstance() {
		return instance;
	}
	
        //Setup the files
	public void setup(Plugin p) {
                //The name of the file
		cfile = new File(p.getDataFolder(), "config.yml");
		config = YamlConfiguration.loadConfiguration(cfile);

		if(!(cfile.exists())){
			config.set("message", "&4&lA Cool Message");
			config.options().header("Author: developer_nono\nAll configuration data will be stored here!\n#  db              88888888ba        ad888888b,     ,a8888a,     ad888888b,      88\n" +
					"#  d88b             88      \"8b      d8\"     \"88   ,8P\"'  `\"Y8,  d8\"     \"88    ,d88\n" +
					"#  d8'`8b            88      ,8P              a8P  ,8P        Y8,         a8P  888888\n" +
					"#  d8'  `8b           88aaaaaa8P'           ,d8P\"   88          88      ,d8P\"       88\n" +
					"#  d8YaaaaY8b          88\"\"\"\"\"\"'           a8P\"      88          88    a8P\"          88\n" +
					"#  d8\"\"\"\"\"\"\"\"8b         88                a8P'        `8b        d8'  a8P'            88\n" +
					"#  d8'        `8b   888  88  888          d8\"           `8ba,  ,ad8'  d8\"              88\n" +
					"#  d8'          `8b  888  88  888          88888888888     \"Y8888P\"    88888888888      88\n" +
					"\n" +
					"\n" +
					"# MagicalDreams - AnnualPassport Plugin - Main Config\n" +
					"# Copyright (C) 2012-2021 MagicalDreams.US - ALL RIGHTS RESERVED\n" +
					"# MagicalDreams Confidential - DO NOT SHARE");
			try{
				config.save(cfile);
			} catch(IOException e){
				Bukkit.getConsoleSender().sendMessage("ERROR: Couldn't create config.yml!");
			}
		}
		
	}
	
        //Use this to do like fm.getData().getStringList();
	public FileConfiguration getConfig() {
		return config;
	}
        //Save the file
	public void saveConfig() throws IOException {
		config.save(cfile);
	}
        //Reload the file
	public void reloadConfig() {
		config = YamlConfiguration.loadConfiguration(cfile);
	}
	
}