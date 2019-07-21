package ru.whitebite.examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.whitebite.examplemod.proxy.CommonProxy;

@Mod(modid = "tut")
public class TestMod {
  public static final String MODID = "tut";
  public static final String VERSION = "1.0";

  @SidedProxy(clientSide = "ru.whitebite.examplemod.CommonProxy", serverSide = "ru.whitebite.examplemod.CommonProxy")
  public static CommonProxy proxy;


  @EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
    proxy.preInit(event);
  }

  @EventHandler
  public void init(FMLInitializationEvent event)
  {
    proxy.init(event);
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event)
  {
    proxy.postInit(event);
  }
}
