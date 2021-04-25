package us.magicaldreams.annualpassport2021.Changeables;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ShowsUI {
    public static void applyShowTimesUI(Player player) {

        List<String> STM = new ArrayList<>();
        STM.add(ChatColor.GREEN + "9:00am-11:00am");

        List<String> STA = new ArrayList<>();
        STA.add(ChatColor.GREEN + "12:00pm-5:00pm");

        List<String> STE = new ArrayList<>();
        STE.add(ChatColor.GREEN + "6:00pm-11:00pm");



        Inventory ShowTimesGUI = Bukkit.createInventory(null, 54, ChatColor.BLUE + "Show Times");

        ItemStack back = new ItemStack(Material.PAPER);
        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.GREEN + "<-- Back");
        back.setItemMeta(backMeta);

        ItemStack Entertianment = new ItemStack((Material.FIREWORK_ROCKET));
        ItemMeta EntertianmentMeta = Entertianment.getItemMeta();
        EntertianmentMeta.setDisplayName(ChatColor.YELLOW + "Entertainment");
        Entertianment.setItemMeta(EntertianmentMeta);

        ItemStack ShowsM = new ItemStack((Material.CLOCK));
        ItemMeta ShowsMMeta = ShowsM.getItemMeta();
        ShowsMMeta.setDisplayName(ChatColor.GREEN + "9:00am-11:00am");
        ShowsM.setItemMeta(ShowsMMeta);
        ShowsMMeta.setLore(STM);

        ItemStack ShowsA = new ItemStack((Material.CLOCK));
        ItemMeta ShowsAMeta = ShowsA.getItemMeta();
        ShowsAMeta.setDisplayName(ChatColor.GREEN + "12:00pm-5:00pm");
        ShowsA.setItemMeta(ShowsAMeta);
        ShowsAMeta.setLore(STA);

        ItemStack ShowsE = new ItemStack((Material.CLOCK));
        ItemMeta ShowsEMeta = ShowsE.getItemMeta();
        ShowsEMeta.setDisplayName(ChatColor.GREEN + "6:00pm-11:00pm");
        ShowsE.setItemMeta(ShowsEMeta);
        ShowsEMeta.setLore(STE);



        ItemStack ShowM1 = new ItemStack((Material.LIGHT_BLUE_DYE));
        ItemMeta ShowM1Meta = ShowM1.getItemMeta();
        ShowM1Meta.setDisplayName(ChatColor.YELLOW + "Ocean Discovery");
        ShowM1.setItemMeta(ShowM1Meta);

        ItemStack ShowM2 = new ItemStack((Material.LIGHT_BLUE_DYE));
        ItemMeta ShowM2Meta = ShowM2.getItemMeta();
        ShowM2Meta.setDisplayName(ChatColor.YELLOW + "Show M 2");
        ShowM2.setItemMeta(ShowM2Meta);

        ItemStack ShowM3 = new ItemStack((Material.LIGHT_BLUE_DYE));
        ItemMeta ShowM3Meta = ShowM1.getItemMeta();
        ShowM3Meta.setDisplayName(ChatColor.YELLOW + "Show M 3");
        ShowM3.setItemMeta(ShowM3Meta);

        ItemStack ShowM4 = new ItemStack((Material.LIGHT_BLUE_DYE));
        ItemMeta ShowM4Meta = ShowM4.getItemMeta();
        ShowM4Meta.setDisplayName(ChatColor.YELLOW + "Show M 4");
        ShowM4.setItemMeta(ShowM4Meta);




        ItemStack ShowA1 = new ItemStack((Material.MAGENTA_DYE));
        ItemMeta ShowA1Meta = ShowA1.getItemMeta();
        ShowA1Meta.setDisplayName(ChatColor.YELLOW + "Show A 1");
        ShowA1.setItemMeta(ShowA1Meta);

        ItemStack ShowA2 = new ItemStack((Material.MAGENTA_DYE));
        ItemMeta ShowA2Meta = ShowA2.getItemMeta();
        ShowA2Meta.setDisplayName(ChatColor.YELLOW + "Ocean Discovery");
        ShowA2.setItemMeta(ShowA2Meta);

        ItemStack ShowA3 = new ItemStack((Material.MAGENTA_DYE));
        ItemMeta ShowA3Meta = ShowA3.getItemMeta();
        ShowA3Meta.setDisplayName(ChatColor.YELLOW + "Show A 3");
        ShowA3.setItemMeta(ShowA3Meta);

        ItemStack ShowA4 = new ItemStack((Material.MAGENTA_DYE));
        ItemMeta ShowA4Meta = ShowA4.getItemMeta();
        ShowA4Meta.setDisplayName(ChatColor.YELLOW + "Show A 4");
        ShowA4.setItemMeta(ShowA4Meta);





        ItemStack ShowE1 = new ItemStack((Material.ORANGE_DYE));
        ItemMeta ShowE1Meta = ShowE1.getItemMeta();
        ShowE1Meta.setDisplayName(ChatColor.YELLOW + "Show E 1");
        ShowE1.setItemMeta(ShowE1Meta);

        ItemStack ShowE2 = new ItemStack((Material.ORANGE_DYE));
        ItemMeta ShowE2Meta = ShowE2.getItemMeta();
        ShowE2Meta.setDisplayName(ChatColor.YELLOW + "Show E 2");
        ShowE2.setItemMeta(ShowE2Meta);

        ItemStack ShowE3 = new ItemStack((Material.ORANGE_DYE));
        ItemMeta ShowE3Meta = ShowE3.getItemMeta();
        ShowE3Meta.setDisplayName(ChatColor.YELLOW + "Ocean Discovery");
        ShowE3.setItemMeta(ShowE3Meta);

        ItemStack ShowE4 = new ItemStack((Material.ORANGE_DYE));
        ItemMeta ShowE4Meta = ShowE4.getItemMeta();
        ShowE4Meta.setDisplayName(ChatColor.YELLOW + "Show E 4");
        ShowE4.setItemMeta(ShowE4Meta);




        ItemStack BSG = new ItemStack((Material.BLUE_STAINED_GLASS_PANE));
        ItemMeta BSGMeta = BSG.getItemMeta();
        BSGMeta.setDisplayName(" ");
        BSG.setItemMeta(BSGMeta);

        ItemStack GSG = new ItemStack((Material.GREEN_STAINED_GLASS_PANE));
        ItemMeta GSGMeta = GSG.getItemMeta();
        GSGMeta.setDisplayName(" ");
        GSG.setItemMeta(GSGMeta);

        ShowTimesGUI.setItem(0, BSG);
        ShowTimesGUI.setItem(1, BSG);
        ShowTimesGUI.setItem(2, BSG);
        ShowTimesGUI.setItem(3, BSG);
        ShowTimesGUI.setItem(4, Entertianment);
        ShowTimesGUI.setItem(5, BSG);
        ShowTimesGUI.setItem(6, BSG);
        ShowTimesGUI.setItem(7, BSG);
        ShowTimesGUI.setItem(8, back);
        ShowTimesGUI.setItem(9, ShowsM);
        ShowTimesGUI.setItem(10, ShowM1);
        // ShowTimesGUI.setItem(11, );
        ShowTimesGUI.setItem(12, ShowM2);
        //  ShowTimesGUI.setItem(13, );
        ShowTimesGUI.setItem(14, ShowM3);
        //  ShowTimesGUI.setItem(15, );
        ShowTimesGUI.setItem(16, ShowM4);
        //  ShowTimesGUI.setItem(17, );
        ShowTimesGUI.setItem(18, GSG);
        ShowTimesGUI.setItem(19, GSG);
        ShowTimesGUI.setItem(20, GSG);
        ShowTimesGUI.setItem(21, GSG);
        ShowTimesGUI.setItem(22, GSG);
        ShowTimesGUI.setItem(23, GSG);
        ShowTimesGUI.setItem(24, GSG);
        ShowTimesGUI.setItem(25, GSG);
        ShowTimesGUI.setItem(26, GSG);
        ShowTimesGUI.setItem(27, ShowsA);
        ShowTimesGUI.setItem(28, ShowA1);
        //  ShowTimesGUI.setItem(29, );
        ShowTimesGUI.setItem(30, ShowA2);
        // ShowTimesGUI.setItem(31, );
        ShowTimesGUI.setItem(32, ShowA3);
        //   ShowTimesGUI.setItem(33, );
        ShowTimesGUI.setItem(34, ShowA4);
        //   ShowTimesGUI.setItem(35, );
        ShowTimesGUI.setItem(36, BSG);
        ShowTimesGUI.setItem(37, BSG);
        ShowTimesGUI.setItem(38, BSG);
        ShowTimesGUI.setItem(39, BSG);
        ShowTimesGUI.setItem(40, BSG);
        ShowTimesGUI.setItem(41, BSG);
        ShowTimesGUI.setItem(42, BSG);
        ShowTimesGUI.setItem(43, BSG);
        ShowTimesGUI.setItem(44, BSG);
        ShowTimesGUI.setItem(45, ShowsE);
        ShowTimesGUI.setItem(46, ShowE1);
        //   ShowTimesGUI.setItem(47, );
        ShowTimesGUI.setItem(48, ShowE2);
        //   ShowTimesGUI.setItem(49, );
        ShowTimesGUI.setItem(50, ShowE3);
        //  ShowTimesGUI.setItem(51, );
        ShowTimesGUI.setItem(52, ShowE4);
        //   ShowTimesGUI.setItem(53, );


        player.openInventory(ShowTimesGUI);



    }
}