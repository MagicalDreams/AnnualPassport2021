package us.magicaldreams.annualpassport2021.Override;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("A.P. 2021 is Online!");

        Bukkit.getPluginManager().registerEvents(new onLoad(this), this);
        Bukkit.getPluginManager().registerEvents(new OpenAP(this), this);
        Bukkit.getPluginManager().registerEvents(new APMove(this), this);
        Bukkit.getPluginManager().registerEvents(new settings(this), this);




    }



    @Override
    public void onDisable() {
        System.out.println("A.P. 2021 has Shutdown!");
    }
}
