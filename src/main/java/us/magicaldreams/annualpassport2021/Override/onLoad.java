package us.magicaldreams.annualpassport2021.Override;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import us.magicaldreams.annualpassport2021.Backpack.BPInv;
import us.magicaldreams.annualpassport2021.GUI.AnnualPassportUI;

import java.util.ArrayList;
import java.util.Objects;


public class onLoad implements Listener {

    private static Main main;

    public onLoad(Main main){ this.main = main; }

    ItemStack JoinMB;
    ItemMeta JoinMBMeta;
    ItemStack JoinBackpack;
    ItemMeta JoinBackpackMeta;
    ItemStack JoinGlassPane;
    ItemMeta JoinGlassPaneMeta;

    @EventHandler
    public void APJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();

        //Annual Passport

        JoinMB = new ItemStack(Material.PAPER);

        JoinMBMeta = JoinMB.getItemMeta();
        JoinMBMeta.setDisplayName(ChatColor.GREEN + player.getName() + "'s" +   ChatColor.AQUA +" Annual Passport");
        JoinMB.setItemMeta(JoinMBMeta);
        player.getInventory().setItem(8, JoinMB);

        //AutoGraph

        ItemStack JoinAuto = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta JoinAutoMeta = (BookMeta) JoinAuto.getItemMeta();
        JoinAutoMeta.setDisplayName(ChatColor.GREEN + player.getName() + "'s" + ChatColor.AQUA + " Autograph Book");
        JoinAuto.setItemMeta(JoinAutoMeta);
        player.getInventory().setItem(7, JoinAuto);
        //----------BOOK INIT META STUFF------------
        JoinAutoMeta.setAuthor("MagicalDreams");
        JoinAutoMeta.setTitle("Autograph Book");
        ArrayList<String> pages = new ArrayList<String>();


        //Backpack

        JoinBackpack = new ItemStack(Material.CHEST);
        JoinBackpackMeta = JoinBackpack.getItemMeta();
        JoinBackpackMeta.setDisplayName(ChatColor.GREEN + player.getName() + "'s" +   ChatColor.AQUA +  " Backpack");
        JoinBackpack.setItemMeta(JoinBackpackMeta);
        player.getInventory().setItem(6, JoinBackpack);

        //Glass Pane

        JoinGlassPane   = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        JoinGlassPaneMeta = JoinGlassPane.getItemMeta();
        JoinGlassPaneMeta.setDisplayName(ChatColor.GRAY + "Reserved");
        JoinGlassPane.setItemMeta(JoinGlassPaneMeta);
        player.getInventory().setItem(5, JoinGlassPane);


        JoinGlassPane   = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        JoinGlassPaneMeta = JoinGlassPane.getItemMeta();
        JoinGlassPaneMeta.setDisplayName(ChatColor.GRAY + "Reserved");
        JoinGlassPane.setItemMeta(JoinGlassPaneMeta);
        player.getInventory().setItem(4, JoinGlassPane);

    }



    @SuppressWarnings({ "deprecation", "unlikely-arg-type" })
    @EventHandler
    public static void PlayerAP(PlayerInteractEvent e) {
        Action action = e.getAction();
        Player player = (Player) e.getPlayer();
        Player p = e.getPlayer();
        Action item = e.getAction();

        ///SOME STUFF///

        if (p.getItemInHand().getType() == Material.PAPER) {
            if (action.equals(Action.PHYSICAL)) {
                return;
            }
            ((Player) p).playSound(Objects.requireNonNull(((OfflinePlayer) p).getPlayer()).getLocation(), Sound.BLOCK_NOTE_BLOCK_CHIME, 2.0F, 1.0F);

            AnnualPassportUI.applyAnnualPassportUI((Player) player);

        }


    }

    @SuppressWarnings({ "deprecation", "unlikely-arg-type" })
    @EventHandler
    public static void PlayerBP(PlayerInteractEvent e) {
        Action action = e.getAction();
        Player player = (Player) e.getPlayer();
        Player p = e.getPlayer();
        Action item = e.getAction();

        ///SOME STUFF///

        if (p.getItemInHand().getType() == Material.CHEST) {
            if (action.equals(Action.PHYSICAL)) {
                return;
            }

            BPInv.applybpINV((Player) player);

        }


    }


}