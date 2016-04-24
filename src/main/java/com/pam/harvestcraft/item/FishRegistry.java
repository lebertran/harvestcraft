/*     */ package com.pam.harvestcraft.item;
/*     */ 
/*     */ import java.lang.reflect.Field;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import net.minecraft.entity.projectile.EntityFishHook;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.WeightedRandomFishable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FishRegistry
/*     */ {
/*     */   public static void registerItems()
/*     */   {
/*  19 */     if (ItemRegistry.enableharvestcraftfish)
/*     */     {
/*  21 */       registerLoot(new ItemStack(ItemRegistry.seaweedItem, 1, 0), 10);
/*  22 */       registerNormal(new ItemStack(ItemRegistry.anchovyrawItem, 1, 0), 25);
/*  23 */       registerNormal(new ItemStack(ItemRegistry.bassrawItem, 1, 0), 25);
/*  24 */       registerNormal(new ItemStack(ItemRegistry.carprawItem, 1, 0), 25);
/*  25 */       registerNormal(new ItemStack(ItemRegistry.catfishrawItem, 1, 0), 25);
/*  26 */       registerNormal(new ItemStack(ItemRegistry.charrrawItem, 1, 0), 25);
/*  27 */       registerNormal(new ItemStack(ItemRegistry.eelrawItem, 1, 0), 25);
/*  28 */       registerNormal(new ItemStack(ItemRegistry.grouperrawItem, 1, 0), 25);
/*  29 */       registerNormal(new ItemStack(ItemRegistry.herringrawItem, 1, 0), 25);
/*  30 */       registerNormal(new ItemStack(ItemRegistry.jellyfishrawItem, 1, 0), 25);
/*  31 */       registerNormal(new ItemStack(ItemRegistry.mudfishrawItem, 1, 0), 25);
/*  32 */       registerNormal(new ItemStack(ItemRegistry.octopusrawItem, 1, 0), 25);
/*  33 */       registerNormal(new ItemStack(ItemRegistry.perchrawItem, 1, 0), 25);
/*  34 */       registerNormal(new ItemStack(ItemRegistry.snapperrawItem, 1, 0), 25);
/*  35 */       registerNormal(new ItemStack(ItemRegistry.tilapiarawItem, 1, 0), 25);
/*  36 */       registerNormal(new ItemStack(ItemRegistry.troutrawItem, 1, 0), 25);
/*  37 */       registerNormal(new ItemStack(ItemRegistry.tunarawItem, 1, 0), 25);
/*  38 */       registerNormal(new ItemStack(ItemRegistry.walleyerawItem, 1, 0), 25);
/*  39 */       registerNormal(new ItemStack(ItemRegistry.greenheartfishItem, 1, 0), 25);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void registerNormal(ItemStack item, int weight)
/*     */   {
/*     */     try
/*     */     {
/*  55 */       Field field = EntityFishHook.class.getDeclaredField("field_146036_f");
/*  56 */       List list = new ArrayList(getStaticFinalList(field));
/*  57 */       list.add(new WeightedRandomFishable(item, weight));
/*  58 */       setStaticFinalList(EntityFishHook.class.getDeclaredField("field_146036_f"), list);
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/*  62 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void registerLoot(ItemStack loot, int weight)
/*     */   {
/*     */     try
/*     */     {
/*  78 */       Field field = EntityFishHook.class.getDeclaredField("field_146039_d");
/*  79 */       List list = new ArrayList(getStaticFinalList(field));
/*  80 */       list.add(new WeightedRandomFishable(loot, weight));
/*  81 */       setStaticFinalList(EntityFishHook.class.getDeclaredField("field_146039_d"), list);
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/*  85 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void registerRare(ItemStack rare, int weight)
/*     */   {
/*     */     try
/*     */     {
/* 101 */       Field field = EntityFishHook.class.getDeclaredField("field_146041_e");
/* 102 */       List list = new ArrayList(getStaticFinalList(field));
/* 103 */       list.add(new WeightedRandomFishable(rare, weight));
/* 104 */       setStaticFinalList(EntityFishHook.class.getDeclaredField("field_146041_e"), list);
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 108 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private static List getStaticFinalList(Field field)
/*     */     throws Exception
/*     */   {
/* 117 */     field.setAccessible(true);
/* 118 */     Field modifiers = Field.class.getDeclaredField("modifiers");
/* 119 */     modifiers.setAccessible(true);
/* 120 */     modifiers.setInt(field, field.getModifiers() & 0xFFFFFFEF);
/* 121 */     return (List)field.get(field);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private static void setStaticFinalList(Field field, Object object)
/*     */     throws Exception
/*     */   {
/* 129 */     field.setAccessible(true);
/* 130 */     Field modifiers = Field.class.getDeclaredField("modifiers");
/* 131 */     modifiers.setAccessible(true);
/* 132 */     modifiers.setInt(field, field.getModifiers() & 0xFFFFFFEF);
/* 133 */     field.set(null, object);
/*     */   }
/*     */ }


/* Location:              C:\Users\Modding\Desktop\Pam's HarvestCraft 1.7.10k.deobf.jar!\com\pam\harvestcraft\FishRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */