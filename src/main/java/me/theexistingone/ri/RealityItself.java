package me.theexistingone.ri;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import me.theexistingone.ri.proxy.CommonProxy;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class RealityItself
{
    private static Logger log;

    @SidedProxy(serverSide=Reference.COMMON, clientSide=Reference.CLIENT)
    CommonProxy proxy;
    
    @
    RealityItself ri;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        log = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        log.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}