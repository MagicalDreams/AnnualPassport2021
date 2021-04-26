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
			config.options().header("Author: developer_nono\nAll configuration data will be stored here!");
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