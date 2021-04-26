package us.magicaldreams.annualpassport2021.Override;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import us.magicaldreams.annualpassport2021.Backpack.Backpack;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("A.P. 2021 is Online!");

        Bukkit.getPluginManager().registerEvents(new onLoad(this), this);
        Bukkit.getPluginManager().registerEvents(new OpenAP(this), this);
        Bukkit.getPluginManager().registerEvents(new APMove(this), this);
        Bukkit.getPluginManager().registerEvents(new PlayerCloseInv(), this);

        getCommand("backpack").setExecutor(new Backpack(this));
    }



    @Override
    public void onDisable() {
        System.out.println("A.P. 2021 has Shutdown!"); System.out.println("A.P.: Did you remember to save the config.yml file?");
    }
}
