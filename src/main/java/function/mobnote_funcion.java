package function;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.NotePlayEvent;
import org.bukkit.event.player.PlayerInteractEvent;


public class mobnote_funcion implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerInteractEvent(PlayerInteractEvent note){
        if(note.getClickedBlock() != null && note.getClickedBlock().getType() == Material.NOTE_BLOCK){
        Location location = note.getClickedBlock().getLocation();
        Player player = note.getPlayer();
        location.setY(location.getY()+1);
        if(note.useInteractedBlock()== Event.Result.DENY||note.useItemInHand()==Event.Result.DENY){note.getPlayer().sendMessage("§c你没有权限操作此方块。");return;}
        if(player.isSneaking()){
            return;
        }
        if(player.getGameMode() == GameMode.CREATIVE && note.getAction() == Action.LEFT_CLICK_BLOCK)
        {
            return;
        }
         pd(location);
        }
    }
    @EventHandler(priority=EventPriority.HIGHEST)
    public void NotePlayEvent(NotePlayEvent n){
        Location location =n.getBlock().getLocation();
        location.setX(location.getX()-1);
        if(pd(location)==true){n.setCancelled(true);return;}
        location.setX(location.getX()+2);
        if(pd(location)==true){n.setCancelled(true);return;}
        location.setX(location.getX()-1);
        location.setZ(location.getZ()-1);
        if(pd(location)==true){n.setCancelled(true);return;}
        location.setZ(location.getZ()+2);
        if(pd(location)==true){n.setCancelled(true);return;}
    }
    public boolean pd(Location loca){
        Location location=loca;
        Block block =location.getBlock();
        if(block.getType() == Material.CREEPER_HEAD || block.getType()==Material.CREEPER_WALL_HEAD){
            location.getWorld().playSound(location, Sound.ENTITY_CREEPER_PRIMED,1,1);
            return true;
        }
        if(block.getType() == Material.SKELETON_SKULL|| block.getType()==Material.SKELETON_WALL_SKULL){
            location.getWorld().playSound(location,Sound.ENTITY_SKELETON_AMBIENT,1,1);
            return true;
        }
        if(block.getType() == Material.PLAYER_HEAD|| block.getType()==Material.PLAYER_WALL_HEAD){
            location.getWorld().playSound(location,Sound.ENTITY_PLAYER_HURT,1,1);
            return true;
        }
        if(block.getType() == Material.ZOMBIE_HEAD|| block.getType()==Material.ZOMBIE_WALL_HEAD){
            location.getWorld().playSound(location,Sound.ENTITY_ZOMBIE_AMBIENT,1,1);
            return true;
        }
        if(block.getType() == Material.DRAGON_HEAD|| block.getType()==Material.DRAGON_WALL_HEAD){
            location.getWorld().playSound(location,Sound.ENTITY_ENDER_DRAGON_AMBIENT,1,1);
            return true;
        }
        if(block.getType() == Material.WITHER_SKELETON_SKULL|| block.getType()==Material.WITHER_SKELETON_WALL_SKULL){
            location.getWorld().playSound(location,Sound.ENTITY_WITHER_SKELETON_AMBIENT,1,1);
            return true;
        }
        return false;
    }
}
