package us.magicaldreams.annualpassport2021.Override;

import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class settings implements Listener {

    private static Main main;

    public settings(Main main){
        this.main = main;
    }

    @EventHandler
    public static void playSound(PlayerInteractEvent e){
        Player p = e.getPlayer();

        ((Player) p).playSound(Objects.requireNonNull(((OfflinePlayer) p).getPlayer()).getLocation(), Sound.BLOCK_NOTE_BLOCK_CHIME, 2.0F, 1.0F);

    }

}
