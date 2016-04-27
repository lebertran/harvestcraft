/*    */ package com.pam.harvestcraft.gui;
/*    */ 
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public class MarketData
/*    */ {
/*    */   ItemStack item;
/*    */   ItemStack currency;
/*    */   int price;
/*    */   
/*    */   public MarketData(ItemStack item, ItemStack currency, int price)
/*    */   {
/* 13 */     this.item = item;
/* 14 */     this.currency = currency;
/* 15 */     this.price = price;
/*    */   }
/*    */   
/*    */   public ItemStack getItem()
/*    */   {
/* 20 */     return this.item;
/*    */   }
/*    */   
/*    */   public ItemStack getCurrency()
/*    */   {
/* 25 */     return this.currency;
/*    */   }
/*    */   
/*    */   public int getPrice()
/*    */   {
/* 30 */     return this.price;
/*    */   }
/*    */ }


/* Location:              C:\Users\Modding\Desktop\Pam's HarvestCraft 1.7.10k.deobf.jar!\com\pam\harvestcraft\MarketData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */