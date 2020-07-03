package com.wu_ming.flattechnologymod;

import com.wu_ming.flattechnologymod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = FlatTechnologyMod.MODID, name = FlatTechnologyMod.NAME, version = FlatTechnologyMod.VERSION, acceptableRemoteVersions = FlatTechnologyMod.acceptedMinecraftVersions)
public class FlatTechnologyMod {
	
	public static final String MODID = "flattechnologymod";
    public static final String NAME = "Flat Technology Mod";
    public static final String VERSION = "1.0.0";
    public static final String acceptedMinecraftVersions = "1.12.2";
    public static final Logger logger = LogManager.getLogger(MODID);
	
	@Mod.Instance(FlatTechnologyMod.MODID)
    public static FlatTechnologyMod instance;

    @SidedProxy(
            clientSide = "com.wu_ming.flatTechnologymod.proxy.ClientProxy",
            serverSide = "com.wu_ming.flatTechnologymod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

}
