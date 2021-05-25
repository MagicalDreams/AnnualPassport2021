package us.magicaldreams.annualpassport2021.Override;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;
import us.magicaldreams.annualpassport2021.Backpack.BackPackListener;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;
import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    public BackPackListener bpl = new BackPackListener(this);
    public HashMap<UUID, Inventory> inventories = new HashMap<UUID, Inventory>();
    public FileConfiguration config;
    Logger log;

    @Override
    public void onEnable() {
        System.out.println("A.P. 2021 is Online!");

        log = this.getLogger();
        config = this.getConfig();
        config.options().copyDefaults();
        if(!new File(this.getDataFolder(), "config.yml").exists())
            this.saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new onLoad(this), this);
        Bukkit.getPluginManager().registerEvents(new OpenAP(this), this);
        Bukkit.getPluginManager().registerEvents(new APMove(this), this);
        Bukkit.getPluginManager().registerEvents(new BackPackListener(this), this);

    }



    @Override
    public void onDisable() {
        System.out.println("A.P. 2021 has Shutdown!"); System.out.println("A.P.: Did you remember to save the config.yml file?");
    }
}
