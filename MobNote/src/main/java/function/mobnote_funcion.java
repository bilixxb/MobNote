package function;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;


public class mobnote_funcion implements Listener {
    @EventHandler
    public void PlayerInteractEvent(PlayerInteractEvent note){
        if(note.hasBlock() && !(note.isBlockInHand()) && note.getClickedBlock().getType() == Material.NOTE_BLOCK){
            Location location = note.getClickedBlock().getLocation();
        location.setY(location.getY()+1);
        if(location.getBlock().getType() == Material.CREEPER_HEAD){
            location.getWorld().playSound(location, Sound.ENTITY_CREEPER_PRIMED,1,1);
        }
        if(location.getBlock().getType() == Material.SKELETON_SKULL){
            location.getWorld().playSound(location,Sound.ENTITY_SKELETON_AMBIENT,1,1);
        }
        if(location.getBlock().getType() == Material.PLAYER_HEAD){
            location.getWorld().playSound(location,Sound.ENTITY_PLAYER_HURT,1,1);
        }
        if(location.getBlock().getType() == Material.ZOMBIE_HEAD){
            location.getWorld().playSound(location,Sound.ENTITY_ZOMBIE_AMBIENT,1,1);
        }
        if(location.getBlock().getType() == Material.DRAGON_HEAD){
            location.getWorld().playSound(location,Sound.ENTITY_ENDER_DRAGON_AMBIENT,1,1);
        }
        if(location.getBlock().getType() == Material.WITHER_SKELETON_SKULL){
            location.getWorld().playSound(location,Sound.ENTITY_WITHER_SKELETON_AMBIENT,1,1);
        }
        }
    }
    public void r(String s){
        Bukkit.getConsoleSender().sendMessage(s);
    }
}
