package us.magicaldreams.annualpassport2021.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

public class PlayerUI {
    public static void applyPlayerUI(Player player) {

        Inventory PlayerGUI = Bukkit.createInventory(null, 27, ChatColor.BLUE + "Player Settings");

        ItemStack BSG = new ItemStack((Material.BLUE_STAINED_GLASS_PANE));
        ItemMeta BSGMeta = BSG.getItemMeta();
        BSGMeta.setDisplayName(" ");
        BSG.setItemMeta(BSGMeta);

        ItemStack GSG = new ItemStack((Material.GREEN_STAINED_GLASS_PANE));
        ItemMeta GSGMeta = GSG.getItemMeta();
        GSGMeta.setDisplayName(" ");
        GSG.setItemMeta(GSGMeta);

        ItemStack audioS = new ItemStack(Material.JUKEBOX);
        ItemMeta audioSMeta = audioS.getItemMeta();
        audioSMeta.setDisplayName(ChatColor.GOLD + "Connect To Audio Server: /audio");
        audioS.setItemMeta(audioSMeta);

        ItemStack report = new ItemStack(Material.BOOK);
        ItemMeta reportMeta = report.getItemMeta();
        reportMeta.setDisplayName(ChatColor.GOLD + "Report / Issue");
        report.setItemMeta(reportMeta);

        ItemStack skull = new ItemStack(Material.PLAYER_HEAD, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setOwner(player.getName());
        skullMeta.setDisplayName(ChatColor.YELLOW + player.getName() + "'s Settings");
        skull.setItemMeta(skullMeta);

        ItemStack back = new ItemStack(Material.PAPER);
        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.GREEN + "<-- Back");
        back.setItemMeta(backMeta);

        ItemStack rp = new ItemStack(Material.CHEST);
        ItemMeta rpMeta = rp.getItemMeta();
        rpMeta.setDisplayName(ChatColor.GOLD + "Resource Pack");
        rp.setItemMeta(rpMeta);

        ItemStack vis = new ItemStack(Material.SCUTE);
        ItemMeta visMeta = vis.getItemMeta();
        visMeta.setDisplayName(ChatColor.GOLD + "Player Visablilty");
        vis.setItemMeta(visMeta);

        ItemStack msg = new ItemStack(Material.ACACIA_SIGN);
        ItemMeta msgMeta = msg.getItemMeta();
        msgMeta.setDisplayName(ChatColor.GOLD + "Toggle Messages/ScoreBoard");
        msg.setItemMeta(msgMeta);

        ItemStack time = new ItemStack(Material.SUNFLOWER);
        ItemMeta timeMeta = time.getItemMeta();
        timeMeta.setDisplayName(ChatColor.GOLD + "Change Time");
        time.setItemMeta(timeMeta);

        PlayerGUI.setItem(0, BSG);
        PlayerGUI.setItem(1, BSG);
        PlayerGUI.setItem(2, BSG);
        PlayerGUI.setItem(3, BSG);
        PlayerGUI.setItem(4, skull);
        PlayerGUI.setItem(5, BSG);
        PlayerGUI.setItem(6, BSG);
        PlayerGUI.setItem(7, BSG);
        PlayerGUI.setItem(8, BSG);
        PlayerGUI.setItem(9, GSG);
        PlayerGUI.setItem(10, GSG);
        PlayerGUI.setItem(11, time);
        PlayerGUI.setItem(12, msg);
        PlayerGUI.setItem(13, report);
        PlayerGUI.setItem(14, rp);
        PlayerGUI.setItem(15, vis);
        PlayerGUI.setItem(16, GSG);
        PlayerGUI.setItem(17, back);
        PlayerGUI.setItem(18, BSG);
        PlayerGUI.setItem(19, BSG);
        PlayerGUI.setItem(20, BSG);
        PlayerGUI.setItem(21, BSG);
        PlayerGUI.setItem(22, audioS);
        PlayerGUI.setItem(23, BSG);
        PlayerGUI.setItem(24, BSG);
        PlayerGUI.setItem(25, BSG);
        PlayerGUI.setItem(26, BSG);

        player.openInventory(PlayerGUI);

    }


}