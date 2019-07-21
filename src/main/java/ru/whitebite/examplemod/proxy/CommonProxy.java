package ru.whitebite.examplemod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.whitebite.examplemod.item.ItemsRegister;

public class CommonProxy {
  public void preInit(FMLPreInitializationEvent event){
    ItemsRegister.register();
  }

  public void init(FMLInitializationEvent event){

  }

  public void postInit(FMLPostInitializationEvent event){

  }
}
