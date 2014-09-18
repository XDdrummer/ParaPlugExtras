package com.parapixelmon.xddrummer.paraplug.extras.cmd;

public class SetupCommand implements CommandExecutor {
  
  ParaPlugExtras plugin;
  
  public boolean onCommand(CommandSender s, Command cmd, String lbl, String[] subs){
    if(s instanceof Player){
      Player p = (Player) s;
      if(p.isOp() && p.getGameMode() == GameMode.CREATIVE){
        if(!StatStorage.IsSetup.isSetup){
          
          //TODO : ADD SETUP PROCESS
          
          StatStorage.IsSetup.setSetup(true);
          
        }else{
          p.sendMessage("Plugin is already setup! Is this is a mistake? Do /reset-extras to unlock this command.");
          p.sendMessage("Warning: Unlocking this command when server is already setup may result in data loss!");
        }
      }else{
        p.sendMessage(ChatColor.GRAY + "Must be an opped player in creative mode to use this command!");
      }
    }else{
      XDStrings.log("This command not executable from console. Please log in and try again.");
    }
    
    return false;
  }
  
}
