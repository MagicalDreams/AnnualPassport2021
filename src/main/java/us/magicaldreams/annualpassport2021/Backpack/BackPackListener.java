package us.magicaldreams.annualpassport2021.Backpack;

import org.bukkit.Bukkit;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import us.magicaldreams.annualpassport2021.Override.Main;

import java.util.Objects;
import java.util.UUID;

public class BackPackListener implements Listener {

    public Main plugin;
    public BackPackListener(Main m){
        this.plugin = m;
    }

    @EventHandler
    public void interact(PlayerInteractEvent event){

    }

    @EventHandler
    public void join(PlayerJoinEvent event){
        Player player = event.getPlayer();
        UUID id = player.getUniqueId();
        if(plugin.inventories.containsKey(id)){
            if(plugin.config.get(id.toString())!= null){
                Object i = plugin.config.getList(id.toString() + ".items");
                ItemStack[] contents = null;

            }else{
                plugin.inventories.put(id, Bukkit.createInventory(player, 27, Objects.requireNonNull(plugin.config.getString("Backpack Name"))));
            }
        }
    }

    @EventHandler
    public void leave(PlayerQuitEvent event){
        Player player = event.getPlayer();
        UUID id = player.getUniqueId();
        ItemStack[] contents = player.getInventory().getContents();
        plugin.config.set(id.toString() + ".items", contents);
        plugin.saveConfig();
    }

}
