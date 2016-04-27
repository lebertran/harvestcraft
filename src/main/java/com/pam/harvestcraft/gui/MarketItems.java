package com.pam.harvestcraft.gui;

import java.util.ArrayList;

import com.pam.harvestcraft.blocks.BlockRegistry;
import com.pam.harvestcraft.item.ItemRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;





public class MarketItems
{
/*  14 */   private static ArrayList<MarketData> items = new ArrayList();
  
  public static void registerItems(MarketData data)
  {
/*  18 */     items.add(data);
  }
  
  public static MarketData getData(int i)
  {
/*  23 */     return (MarketData)items.get(i);
  }
  
  public static int getSize()
  {
/*  28 */     return items.size();
  }
  
  public static void registerItems()
  {
/*  33 */     if (BlockRegistry.marketsellSeeds)
    {
/*  35 */       if (BlockRegistry.marketcurrencySeeds == 0)
      {
/*  37 */         for (int i = 0; i < 60; i++)
        {
/*  39 */           registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.emerald), BlockRegistry.marketseedPrice));
        }
/*  41 */         registerItems(new MarketData(new ItemStack(Items.wheat_seeds), new ItemStack(Items.emerald), BlockRegistry.marketseedPrice));
/*  42 */         registerItems(new MarketData(new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.emerald), BlockRegistry.marketseedPrice));
/*  43 */         registerItems(new MarketData(new ItemStack(Items.melon_seeds), new ItemStack(Items.emerald), BlockRegistry.marketseedPrice));
      }
/*  45 */       if (BlockRegistry.marketcurrencySeeds == 1)
      {
/*  47 */         for (int i = 0; i < 60; i++)
        {
/*  49 */           registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.diamond), BlockRegistry.marketseedPrice));
/*  50 */           registerItems(new MarketData(new ItemStack(Items.wheat_seeds), new ItemStack(Items.diamond), BlockRegistry.marketseedPrice));
/*  51 */           registerItems(new MarketData(new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.diamond), BlockRegistry.marketseedPrice));
/*  52 */           registerItems(new MarketData(new ItemStack(Items.melon_seeds), new ItemStack(Items.diamond), BlockRegistry.marketseedPrice));
        }
      }
/*  55 */       if (BlockRegistry.marketcurrencySeeds == 2)
      {
/*  57 */         for (int i = 0; i < 60; i++)
        {
/*  59 */           registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.gold_ingot), BlockRegistry.marketseedPrice));
/*  60 */           registerItems(new MarketData(new ItemStack(Items.wheat_seeds), new ItemStack(Items.gold_ingot), BlockRegistry.marketseedPrice));
/*  61 */           registerItems(new MarketData(new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.gold_ingot), BlockRegistry.marketseedPrice));
/*  62 */           registerItems(new MarketData(new ItemStack(Items.melon_seeds), new ItemStack(Items.gold_ingot), BlockRegistry.marketseedPrice));
        }
      }
/*  65 */       if (BlockRegistry.marketcurrencySeeds == 3)
      {
/*  67 */         for (int i = 0; i < 60; i++)
        {
/*  69 */           registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.gold_nugget), BlockRegistry.marketseedPrice));
/*  70 */           registerItems(new MarketData(new ItemStack(Items.wheat_seeds), new ItemStack(Items.gold_nugget), BlockRegistry.marketseedPrice));
/*  71 */           registerItems(new MarketData(new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.gold_nugget), BlockRegistry.marketseedPrice));
/*  72 */           registerItems(new MarketData(new ItemStack(Items.melon_seeds), new ItemStack(Items.gold_nugget), BlockRegistry.marketseedPrice));
        }
      }
/*  75 */       if (BlockRegistry.marketcurrencySeeds == 4)
      {
/*  77 */         for (int i = 0; i < 60; i++)
        {
/*  79 */           registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.iron_ingot), BlockRegistry.marketseedPrice));
/*  80 */           registerItems(new MarketData(new ItemStack(Items.wheat_seeds), new ItemStack(Items.iron_ingot), BlockRegistry.marketseedPrice));
/*  81 */           registerItems(new MarketData(new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.iron_ingot), BlockRegistry.marketseedPrice));
/*  82 */           registerItems(new MarketData(new ItemStack(Items.melon_seeds), new ItemStack(Items.iron_ingot), BlockRegistry.marketseedPrice));
        }
      }
/*  85 */       if (BlockRegistry.marketcurrencySeeds == 5)
      {
/*  87 */         for (int i = 0; i < 60; i++)
        {
/*  89 */           registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.wheat_seeds), BlockRegistry.marketseedPrice));
/*  90 */           registerItems(new MarketData(new ItemStack(Items.wheat_seeds), new ItemStack(Items.wheat_seeds), BlockRegistry.marketseedPrice));
/*  91 */           registerItems(new MarketData(new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.wheat_seeds), BlockRegistry.marketseedPrice));
/*  92 */           registerItems(new MarketData(new ItemStack(Items.melon_seeds), new ItemStack(Items.wheat_seeds), BlockRegistry.marketseedPrice));
        }
      }
    }
    
/*  97 */     if (BlockRegistry.marketselltemperateSaplings)
    {
/*  99 */       if (BlockRegistry.marketcurrencytemperateSaplings == 0)
      {
/* 101 */         for (int i = 0; i < 9; i++)
        {
/* 103 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
        }
/* 105 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
/* 106 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
/* 107 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
      }
      
/* 110 */       if (BlockRegistry.marketcurrencytemperateSaplings == 1)
      {
/* 112 */         for (int i = 0; i < 9; i++)
        {
/* 114 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
        }
/* 116 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
/* 117 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
/* 118 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
      }
/* 120 */       if (BlockRegistry.marketcurrencytemperateSaplings == 2)
      {
/* 122 */         for (int i = 0; i < 9; i++)
        {
/* 124 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
        }
/* 126 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
/* 127 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
/* 128 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
      }
/* 130 */       if (BlockRegistry.marketcurrencytemperateSaplings == 3)
      {
/* 132 */         for (int i = 0; i < 9; i++)
        {
/* 134 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
        }
/* 136 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
/* 137 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
/* 138 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
      }
/* 140 */       if (BlockRegistry.marketcurrencytemperateSaplings == 4)
      {
/* 142 */         for (int i = 0; i < 9; i++)
        {
/* 144 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
        }
/* 146 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
/* 147 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
/* 148 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
      }
/* 150 */       if (BlockRegistry.marketcurrencytemperateSaplings == 5)
      {
/* 152 */         for (int i = 0; i < 9; i++)
        {
/* 154 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Blocks.sapling, 1, 0), BlockRegistry.marketsaplingPrice));
        }
/* 156 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Blocks.sapling, 1, 0), BlockRegistry.marketsaplingPrice));
/* 157 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Blocks.sapling, 1, 0), BlockRegistry.marketsaplingPrice));
/* 158 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Blocks.sapling, 1, 0), BlockRegistry.marketsaplingPrice));
      }
/* 160 */       if (BlockRegistry.marketcurrencytemperateSaplings == 6)
      {
/* 162 */         for (int i = 0; i < 9; i++)
        {
/* 164 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
        }
/* 166 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
/* 167 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
/* 168 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
      }
    }
    
/* 172 */     if (BlockRegistry.marketselltropicalSaplings)
    {
/* 174 */       if (BlockRegistry.marketcurrencytropicalSaplings == 0)
      {
/* 176 */         for (int i = 0; i < 24; i++)
        {
/* 178 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
        }
/* 180 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
/* 181 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
/* 182 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
/* 183 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
      }
      
/* 186 */       if (BlockRegistry.marketcurrencytropicalSaplings == 1)
      {
/* 188 */         for (int i = 0; i < 24; i++)
        {
/* 190 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
        }
/* 192 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
/* 193 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
/* 194 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
/* 195 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
      }
/* 197 */       if (BlockRegistry.marketcurrencytropicalSaplings == 2)
      {
/* 199 */         for (int i = 0; i < 24; i++)
        {
/* 201 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
        }
/* 203 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
/* 204 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
/* 205 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
/* 206 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
      }
/* 208 */       if (BlockRegistry.marketcurrencytropicalSaplings == 3)
      {
/* 210 */         for (int i = 0; i < 24; i++)
        {
/* 212 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
        }
/* 214 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
/* 215 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
/* 216 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
/* 217 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
      }
/* 219 */       if (BlockRegistry.marketcurrencytropicalSaplings == 4)
      {
/* 221 */         for (int i = 0; i < 24; i++)
        {
/* 223 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
        }
/* 225 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
/* 226 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
/* 227 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
/* 228 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
      }
/* 230 */       if (BlockRegistry.marketcurrencytropicalSaplings == 5)
      {
/* 232 */         for (int i = 0; i < 24; i++)
        {
/* 234 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Blocks.sapling, 1, 3), BlockRegistry.marketsaplingPrice));
        }
/* 236 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Blocks.sapling, 1, 3), BlockRegistry.marketsaplingPrice));
/* 237 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Blocks.sapling, 1, 3), BlockRegistry.marketsaplingPrice));
/* 238 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Blocks.sapling, 1, 3), BlockRegistry.marketsaplingPrice));
/* 239 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Blocks.sapling, 1, 3), BlockRegistry.marketsaplingPrice));
      }
/* 241 */       if (BlockRegistry.marketcurrencytropicalSaplings == 6)
      {
/* 243 */         for (int i = 0; i < 24; i++)
        {
/* 245 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
        }
/* 247 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
/* 248 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
/* 249 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
/* 250 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
      }
/* 252 */       if (BlockRegistry.marketcurrencytropicalSaplings == 7)
      {
/* 254 */         for (int i = 0; i < 24; i++)
        {
/* 256 */           registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.dye, 1, 3), BlockRegistry.marketsaplingPrice));
        }
/* 258 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.dye, 1, 3), BlockRegistry.marketsaplingPrice));
/* 259 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.dye, 1, 3), BlockRegistry.marketsaplingPrice));
/* 260 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.dye, 1, 3), BlockRegistry.marketsaplingPrice));
/* 261 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.dye, 1, 3), BlockRegistry.marketsaplingPrice));
      }
    }
    

/* 266 */     if (BlockRegistry.marketsellconiferousSaplings)
    {
/* 268 */       if (BlockRegistry.marketcurrencyconiferousSaplings == 0)
      {
/* 270 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
/* 271 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
      }
/* 273 */       if (BlockRegistry.marketcurrencyconiferousSaplings == 1)
      {
/* 275 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
/* 276 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
      }
/* 278 */       if (BlockRegistry.marketcurrencyconiferousSaplings == 2)
      {
/* 280 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
/* 281 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
      }
/* 283 */       if (BlockRegistry.marketcurrencyconiferousSaplings == 3)
      {
/* 285 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
/* 286 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
      }
/* 288 */       if (BlockRegistry.marketcurrencyconiferousSaplings == 4)
      {
/* 290 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
/* 291 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
      }
/* 293 */       if (BlockRegistry.marketcurrencyconiferousSaplings == 5)
      {
/* 295 */         registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Blocks.sapling, 1, 1), BlockRegistry.marketsaplingPrice));
/* 296 */         registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 1), new ItemStack(Blocks.sapling, 1, 1), BlockRegistry.marketsaplingPrice));
      }
    }
    

/* 301 */     if (BlockRegistry.marketsellPig)
    {
/* 303 */       if (BlockRegistry.marketcurrencyPig == 0)
      {
/* 305 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 90), new ItemStack(Items.emerald), BlockRegistry.marketpigPrice));
      }
/* 307 */       if (BlockRegistry.marketcurrencyPig == 1)
      {
/* 309 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 90), new ItemStack(Items.diamond), BlockRegistry.marketpigPrice));
      }
/* 311 */       if (BlockRegistry.marketcurrencyPig == 2)
      {
/* 313 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 90), new ItemStack(Items.gold_ingot), BlockRegistry.marketpigPrice));
      }
/* 315 */       if (BlockRegistry.marketcurrencyPig == 3)
      {
/* 317 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 90), new ItemStack(Items.gold_nugget), BlockRegistry.marketpigPrice));
      }
/* 319 */       if (BlockRegistry.marketcurrencyPig == 4)
      {
/* 321 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 90), new ItemStack(Items.iron_ingot), BlockRegistry.marketpigPrice));
      }
/* 323 */       if (BlockRegistry.marketcurrencyPig == 5)
      {
/* 325 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 90), new ItemStack(Items.egg), BlockRegistry.marketpigPrice));
      }
    }
/* 328 */     if (BlockRegistry.marketsellSheep)
    {
/* 330 */       if (BlockRegistry.marketcurrencySheep == 0)
      {
/* 332 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 91), new ItemStack(Items.emerald), BlockRegistry.marketsheepPrice));
      }
/* 334 */       if (BlockRegistry.marketcurrencySheep == 1)
      {
/* 336 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 91), new ItemStack(Items.diamond), BlockRegistry.marketsheepPrice));
      }
/* 338 */       if (BlockRegistry.marketcurrencySheep == 2)
      {
/* 340 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 91), new ItemStack(Items.gold_ingot), BlockRegistry.marketsheepPrice));
      }
/* 342 */       if (BlockRegistry.marketcurrencySheep == 3)
      {
/* 344 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 91), new ItemStack(Items.gold_nugget), BlockRegistry.marketsheepPrice));
      }
/* 346 */       if (BlockRegistry.marketcurrencySheep == 4)
      {
/* 348 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 91), new ItemStack(Items.iron_ingot), BlockRegistry.marketsheepPrice));
      }
/* 350 */       if (BlockRegistry.marketcurrencySheep == 5)
      {
/* 352 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 91), new ItemStack(Items.egg), BlockRegistry.marketsheepPrice));
      }
    }
/* 355 */     if (BlockRegistry.marketsellCow)
    {
/* 357 */       if (BlockRegistry.marketcurrencyCow == 0)
      {
/* 359 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 92), new ItemStack(Items.emerald), BlockRegistry.marketcowPrice));
      }
/* 361 */       if (BlockRegistry.marketcurrencyCow == 1)
      {
/* 363 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 92), new ItemStack(Items.diamond), BlockRegistry.marketcowPrice));
      }
/* 365 */       if (BlockRegistry.marketcurrencyCow == 2)
      {
/* 367 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 92), new ItemStack(Items.gold_ingot), BlockRegistry.marketcowPrice));
      }
/* 369 */       if (BlockRegistry.marketcurrencyCow == 3)
      {
/* 371 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 92), new ItemStack(Items.gold_nugget), BlockRegistry.marketcowPrice));
      }
/* 373 */       if (BlockRegistry.marketcurrencyCow == 4)
      {
/* 375 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 92), new ItemStack(Items.iron_ingot), BlockRegistry.marketcowPrice));
      }
/* 377 */       if (BlockRegistry.marketcurrencyCow == 5)
      {
/* 379 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 92), new ItemStack(Items.egg), BlockRegistry.marketcowPrice));
      }
    }
/* 382 */     if (BlockRegistry.marketsellChicken)
    {
/* 384 */       if (BlockRegistry.marketcurrencyChicken == 0)
      {
/* 386 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 93), new ItemStack(Items.emerald), BlockRegistry.marketchickenPrice));
      }
/* 388 */       if (BlockRegistry.marketcurrencyChicken == 1)
      {
/* 390 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 93), new ItemStack(Items.diamond), BlockRegistry.marketchickenPrice));
      }
/* 392 */       if (BlockRegistry.marketcurrencyChicken == 2)
      {
/* 394 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 93), new ItemStack(Items.gold_ingot), BlockRegistry.marketchickenPrice));
      }
/* 396 */       if (BlockRegistry.marketcurrencyChicken == 3)
      {
/* 398 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 93), new ItemStack(Items.gold_nugget), BlockRegistry.marketchickenPrice));
      }
/* 400 */       if (BlockRegistry.marketcurrencyChicken == 4)
      {
/* 402 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 93), new ItemStack(Items.iron_ingot), BlockRegistry.marketchickenPrice));
      }
/* 404 */       if (BlockRegistry.marketcurrencyChicken == 5)
      {
/* 406 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 93), new ItemStack(Items.egg), BlockRegistry.marketchickenPrice));
      }
    }
/* 409 */     if (BlockRegistry.marketsellHorse)
    {
/* 411 */       if (BlockRegistry.marketcurrencyHorse == 0)
      {
/* 413 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 100), new ItemStack(Items.emerald), BlockRegistry.markethorsePrice));
      }
/* 415 */       if (BlockRegistry.marketcurrencyHorse == 1)
      {
/* 417 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 100), new ItemStack(Items.diamond), BlockRegistry.markethorsePrice));
      }
/* 419 */       if (BlockRegistry.marketcurrencyHorse == 2)
      {
/* 421 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 100), new ItemStack(Items.gold_ingot), BlockRegistry.markethorsePrice));
      }
/* 423 */       if (BlockRegistry.marketcurrencyHorse == 3)
      {
/* 425 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 100), new ItemStack(Items.gold_nugget), BlockRegistry.markethorsePrice));
      }
/* 427 */       if (BlockRegistry.marketcurrencyHorse == 4)
      {
/* 429 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 100), new ItemStack(Items.iron_ingot), BlockRegistry.markethorsePrice));
      }
/* 431 */       if (BlockRegistry.marketcurrencyHorse == 5)
      {
/* 433 */         registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 100), new ItemStack(Items.egg), BlockRegistry.markethorsePrice));
      }
    }
    
/* 437 */     if (BlockRegistry.marketsellBonemeal)
    {
/* 439 */       if (BlockRegistry.marketcurrencyBonemeal == 0)
      {
/* 441 */         registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.emerald), BlockRegistry.marketbonemealPrice));
      }
/* 443 */       if (BlockRegistry.marketcurrencyBonemeal == 1)
      {
/* 445 */         registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.diamond), BlockRegistry.marketbonemealPrice));
      }
/* 447 */       if (BlockRegistry.marketcurrencyBonemeal == 2)
      {
/* 449 */         registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.gold_ingot), BlockRegistry.marketbonemealPrice));
      }
	if (BlockRegistry.marketcurrencyBonemeal == 3)
      {
	registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.gold_nugget), BlockRegistry.marketbonemealPrice));
      }
	if (BlockRegistry.marketcurrencyBonemeal == 4)
      {
	registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.iron_ingot), BlockRegistry.marketbonemealPrice));
      }
    }
  }
}
