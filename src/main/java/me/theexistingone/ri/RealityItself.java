package me.theexistingone.ri;

import org.apache.logging.log4j.Logger;

import me.theexistingone.ri.proxy.CommonProxy;
import me.theexistingone.ri.util.Reference;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class RealityItself
{
    private static Logger log;

    @SidedProxy(serverSide=Reference.COMMON, clientSide=Reference.CLIENT)
    public static CommonProxy proxy;
    
    @Instance
    public static RealityItself instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        log = event.getModLog();
        log.info("Logger created");
        log.warn("Reality itself is currently in a beta state and is highly unstable");
        log.warn("This may corrupt files or cause issues. Please create a backup of your world before running this mod");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        log.info("Initializing all the codes");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // some example code
        log.info("Post Initalizing all the codes");
    }
}
