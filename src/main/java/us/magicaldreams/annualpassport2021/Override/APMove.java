package us.magicaldreams.annualpassport2021.Override;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class APMove implements Listener {
    private static Main main;

    public APMove(Main main) {
        // TODO Auto-generated constructor stub

        this.main = main;
    }


    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent event) {
        Player p = event.getPlayer();

        if (event.getItemDrop().getItemStack().getType() == Material.PAPER) {
            event.setCancelled(true);
            p.sendMessage(ChatColor.RED + "You can't drop the item");
        }

        if(event.getItemDrop().getItemStack().getType() == Material.GRAY_STAINED_GLASS_PANE) {
            event.setCancelled(true);
            p.sendMessage(ChatColor.RED + "You can't drop the item");
        }

        if(event.getItemDrop().getItemStack().getType() == Material.CHEST){
            event.setCancelled(true);
            p.sendMessage(ChatColor.RED + "You can't drop the item");
        }

        if(event.getItemDrop().getItemStack().getType() == Material.ENCHANTED_BOOK){
            event.setCancelled(true);
            p.sendMessage(ChatColor.RED + "You can't drop the item");
        }

        if(event.getItemDrop().getItemStack().getType() == Material.WRITTEN_BOOK){
            event.setCancelled(true);
            p.sendMessage(ChatColor.RED + "You can't drop the item");
        }

        if(event.getItemDrop().getItemStack().getType() == Material.BOOK){
            event.setCancelled(true);
            p.sendMessage(ChatColor.RED + "You can't drop the item");
        }
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onMove8(InventoryClickEvent e){
        ItemStack i = e.getWhoClicked().getInventory().getItem(8);
        if(i != null)
        {
            if(e.getSlot() == 8 && i.getType() == Material.PAPER)
            {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onMove7(InventoryClickEvent e){
        ItemStack i = e.getWhoClicked().getInventory().getItem(7);
        if(i != null)
        {
            if(e.getSlot() == 7 && i.getType() == Material.PAPER)
            {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onMove6(InventoryClickEvent e){
        ItemStack i = e.getWhoClicked().getInventory().getItem(6);
        if(i != null)
        {
            if(e.getSlot() == 6 && i.getType() == Material.PAPER)
            {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onMove5(InventoryClickEvent e){
        ItemStack i = e.getWhoClicked().getInventory().getItem(5);
        if(i != null)
        {
            if(e.getSlot() == 5 && i.getType() == Material.PAPER)
            {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onMove4(InventoryClickEvent e){
        ItemStack i = e.getWhoClicked().getInventory().getItem(4);
        if(i != null)
        {
            if(e.getSlot() == 4 && i.getType() == Material.PAPER)
            {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onMove3(InventoryClickEvent e){
        ItemStack i = e.getWhoClicked().getInventory().getItem(3);
        if(i != null)
        {
            if(e.getSlot() == 3 && i.getType() == Material.PAPER)
            {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onMove2(InventoryClickEvent e){
        ItemStack i = e.getWhoClicked().getInventory().getItem(2);
        if(i != null)
        {
            if(e.getSlot() == 2 && i.getType() == Material.PAPER)
            {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onMove1(InventoryClickEvent e){
        ItemStack i = e.getWhoClicked().getInventory().getItem(1);
        if(i != null)
        {
            if(e.getSlot() == 1 && i.getType() == Material.PAPER)
            {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onMove0(InventoryClickEvent e){
        ItemStack i = e.getWhoClicked().getInventory().getItem(0);
        if(i != null)
        {
            if(e.getSlot() == 0 && i.getType() == Material.PAPER)
            {
                e.setCancelled(true);
            }
        }
    }
}