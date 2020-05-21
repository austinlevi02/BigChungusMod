package chungus.mod;

import chungus.mod.proxy.CommonProxy;
import chungus.mod.util.Reference;
import chungus.mod.util.handlers.RegistryHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class Main
{
    public static final String MODID = "chungusmod";
    public static final String NAME = "Chungus Mod";
    public static final String VERSION = "1.12.2";

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.VERSION)
    public static CommonProxy proxy;
    
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
    	RegistryHandler.preInitRegistries();
    }
    @EventHandler
    public static void init(FMLInitializationEvent event) {
    }
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
    }
    
   

}
