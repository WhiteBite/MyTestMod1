package ru.whitebite.examplemod.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemsRegister
{
  public static Item KEY = new ItemKey("key");

  public static void register()
  {
    setRegister(KEY);
  }

  @SideOnly(Side.CLIENT)
  public static void registerRender()
  {
    setRender(KEY);
  }

  private static void setRegister(Item item)
  {
    ForgeRegistries.ITEMS.register(item);
  }

  @SideOnly(Side.CLIENT)
  private static void setRender(Item item)
  {

  }
}
