package com.bilixxb.mobnote.mobnote;

import function.mobnote_funcion;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Material;



public final class MobNote extends JavaPlugin implements CommandExecutor {
    public void onEnable() {
        // Plugin startup logic
         r("§dMobNote 成功加载！");
        getServer().getPluginManager().registerEvents(new mobnote_funcion(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
   /* @EventHandler
    public void NotePlayEvent(Block block, Instrument instrument, Note note){
        Location location = block.getLocation();
        location.setY(location.getY()+1);
        if(location.getBlock().getType() == Material.CREEPER_HEAD){
            location.getWorld().playSound(location,Sound.ENTITY_CREEPER_PRIMED,1,1);
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
        r("调试用，传递成功");
    }*/

    public void r(String s){
        Bukkit.getConsoleSender().sendMessage(s);
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("mobnote")) {
            if(sender instanceof Player){sender.sendMessage("MobNote插件可以正常使用！");}else{r("MobNote插件可以正常使用！");}
            return true;
        }
        return false;
    }

}


