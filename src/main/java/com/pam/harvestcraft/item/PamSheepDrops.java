/*    */ package com.pam.harvestcraft.item;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.passive.EntitySheep;
/*    */ import net.minecraftforge.event.entity.living.LivingDropsEvent;
/*    */ 
/*    */ public class PamSheepDrops
/*    */ {
/*    */   public static double rand;
/*    */   
/*    */   @net.minecraftforge.fml.common.eventhandler.SubscribeEvent
/*    */   public void onEntityDrop(LivingDropsEvent event)
/*    */   {
/* 15 */     if (event.source.getDamageType().equals("player"))
/*    */     {
/* 17 */       rand = Math.random();
/* 18 */       if ((event.entityLiving instanceof EntitySheep))
/*    */       {
/* 20 */         if (rand < 0.5D) {
/* 21 */           event.entityLiving.dropItem(ItemRegistry.muttonrawItem, 1);
/*    */         }
/* 23 */         if (rand < 0.25D) {
/* 24 */           event.entityLiving.dropItem(ItemRegistry.muttonrawItem, 1);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }
