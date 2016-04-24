/*      */ package com.pam.harvestcraft.item;
/*      */ 
/*      */ import net.minecraft.init.Blocks;
/*      */ import net.minecraft.init.Items;
/*      */ import net.minecraft.item.ItemStack;
/*      */ import net.minecraftforge.oredict.OreDictionary;
/*      */ 
/*      */ 
/*      */ public class PamFoodOreDictionaryRegistry
/*      */ {
/*      */   public static void getRegistry()
/*      */   {
/*   13 */     OreDictionary.registerOre("listAllveggie", Items.carrot);
/*   14 */     OreDictionary.registerOre("listAllveggie", Items.potato);
/*   15 */     OreDictionary.registerOre("listAllveggie", Blocks.pumpkin);
/*      */     
/*   17 */     OreDictionary.registerOre("cropCarrot", Items.carrot);
/*   18 */     OreDictionary.registerOre("cropPotato", Items.potato);
/*   19 */     OreDictionary.registerOre("cropPumpkin", Blocks.pumpkin);
/*      */     
/*   21 */     OreDictionary.registerOre("listAllseed", Items.wheat_seeds);
/*   22 */     OreDictionary.registerOre("listAllseed", Items.pumpkin_seeds);
/*   23 */     OreDictionary.registerOre("listAllseed", Items.melon_seeds);
/*      */     
/*   25 */     OreDictionary.registerOre("listAllgrain", Items.wheat);
/*      */     
/*   27 */     OreDictionary.registerOre("flourEqualswheat", Items.wheat);
/*   28 */     OreDictionary.registerOre("flourEqualswheat", ItemRegistry.flourItem);
/*      */     
/*   30 */     OreDictionary.registerOre("listAllmushroom", Blocks.red_mushroom);
/*   31 */     OreDictionary.registerOre("listAllmushroom", Blocks.brown_mushroom);
/*   32 */     OreDictionary.registerOre("listAllmushroom", ItemRegistry.whitemushroomItem);
/*      */     
/*   34 */     OreDictionary.registerOre("cropApple", Items.apple);
/*   35 */     OreDictionary.registerOre("listAllfruit", Items.apple);
/*      */     
/*   37 */     OreDictionary.registerOre("listAllmeatraw", Items.beef);
/*   38 */     OreDictionary.registerOre("listAllmeatraw", Items.chicken);
/*   39 */     OreDictionary.registerOre("listAllmeatraw", Items.porkchop);
/*   40 */     OreDictionary.registerOre("listAllmeatraw", Items.mutton);
/*   41 */     OreDictionary.registerOre("listAllmeatraw", ItemRegistry.turkeyrawItem);
/*   42 */     OreDictionary.registerOre("listAllmeatraw", Items.rabbit);
/*   43 */     OreDictionary.registerOre("listAllmeatraw", ItemRegistry.venisonrawItem);
/*   44 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*      */ 
/*   47 */       OreDictionary.registerOre("listAllmeatraw", ItemRegistry.firmtofuItem);
/*      */     }
/*      */     
/*   50 */     OreDictionary.registerOre("listAllmeatcooked", Items.cooked_beef);
/*   51 */     OreDictionary.registerOre("listAllmeatcooked", Items.cooked_chicken);
/*   52 */     OreDictionary.registerOre("listAllmeatcooked", Items.cooked_porkchop);
/*   53 */     OreDictionary.registerOre("listAllmeatcooked", Items.cooked_mutton);
/*   54 */     OreDictionary.registerOre("listAllmeatcooked", ItemRegistry.turkeycookedItem);
/*   55 */     OreDictionary.registerOre("listAllmeatcooked", Items.cooked_rabbit);
/*   56 */     OreDictionary.registerOre("listAllmeatcooked", ItemRegistry.venisoncookedItem);
/*   57 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*      */ 
/*   60 */       OreDictionary.registerOre("listAllmeatcooked", ItemRegistry.firmtofuItem);
/*      */     }
/*      */     
/*   63 */     OreDictionary.registerOre("listAllfishraw", Items.fish);
/*   64 */     OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.fish, 1, 1));
/*   65 */     OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.fish, 1, 2));
/*   66 */     OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.fish, 1, 3));
/*   67 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.calamarirawItem);
/*   68 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.firmtofuItem);
/*   69 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.anchovyrawItem);
/*   70 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.bassrawItem);
/*   71 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.carprawItem);
/*   72 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.catfishrawItem);
/*   73 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.charrrawItem);
/*   74 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.crayfishrawItem);
/*   75 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.eelrawItem);
/*   76 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.grouperrawItem);
/*   77 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.herringrawItem);
/*   78 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.mudfishrawItem);
/*   79 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.octopusrawItem);
/*   80 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.perchrawItem);
/*   81 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.scalloprawItem);
/*   82 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.shrimprawItem);
/*   83 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.snailrawItem);
/*   84 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.snapperrawItem);
/*   85 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.tilapiarawItem);
/*   86 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.troutrawItem);
/*   87 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.tunarawItem);
/*   88 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.walleyerawItem);
/*   89 */     OreDictionary.registerOre("listAllfishraw", ItemRegistry.greenheartfishItem);
/*      */     
/*   91 */     OreDictionary.registerOre("listAllfishcooked", Items.cooked_fish);
/*   92 */     OreDictionary.registerOre("listAllfishcooked", new ItemStack(Items.cooked_fish, 1, 1));
/*   93 */     OreDictionary.registerOre("listAllfishcooked", ItemRegistry.calamaricookedItem);
/*      */     
/*   95 */     OreDictionary.registerOre("salmonRaw", new ItemStack(Items.fish, 1));
/*      */     
/*   97 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*   99 */       OreDictionary.registerOre("listAllfishcooked", ItemRegistry.firmtofuItem);
/*      */     }
/*      */     
/*  102 */     OreDictionary.registerOre("listAllegg", Items.egg);
/*  103 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  105 */       OreDictionary.registerOre("listAllegg", ItemRegistry.firmtofuItem);
/*      */     }
/*      */     
/*  108 */     OreDictionary.registerOre("listAllchickenraw", Items.chicken);
/*  109 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  111 */       OreDictionary.registerOre("listAllchickenraw", ItemRegistry.firmtofuItem);
/*      */     }
/*  113 */     OreDictionary.registerOre("listAllchickencooked", Items.cooked_chicken);
/*  114 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  116 */       OreDictionary.registerOre("listAllchickencooked", ItemRegistry.firmtofuItem);
/*      */     }
/*      */     
/*  119 */     OreDictionary.registerOre("listAllporkraw", Items.porkchop);
/*  120 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  122 */       OreDictionary.registerOre("listAllporkraw", ItemRegistry.firmtofuItem);
/*      */     }
/*  124 */     OreDictionary.registerOre("listAllporkcooked", Items.cooked_porkchop);
/*  125 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  127 */       OreDictionary.registerOre("listAllporkcooked", ItemRegistry.firmtofuItem);
/*      */     }
/*      */     
/*  130 */     OreDictionary.registerOre("listAllbeefraw", Items.beef);
/*  131 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  133 */       OreDictionary.registerOre("listAllbeefraw", ItemRegistry.firmtofuItem);
/*      */     }
/*  135 */     OreDictionary.registerOre("listAllbeefcooked", Items.cooked_beef);
/*  136 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  138 */       OreDictionary.registerOre("listAllbeefcooked", ItemRegistry.firmtofuItem);
/*      */     }
/*      */     
/*  141 */     OreDictionary.registerOre("listAllmuttonraw", Items.mutton);
/*  142 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  144 */       OreDictionary.registerOre("listAllmuttonraw", ItemRegistry.firmtofuItem);
/*      */     }
/*  146 */     OreDictionary.registerOre("listAllmuttoncooked", Items.cooked_mutton);
/*  147 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  149 */       OreDictionary.registerOre("listAllmuttoncooked", ItemRegistry.firmtofuItem);
/*      */     }
/*      */     
/*  152 */     OreDictionary.registerOre("listAllturkeyraw", ItemRegistry.turkeyrawItem);
/*  153 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  155 */       OreDictionary.registerOre("listAllturkeyraw", ItemRegistry.firmtofuItem);
/*      */     }
/*  157 */     OreDictionary.registerOre("listAllturkeycooked", ItemRegistry.turkeycookedItem);
/*  158 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  160 */       OreDictionary.registerOre("listAllturkeycooked", ItemRegistry.firmtofuItem);
/*      */     }
/*      */     
/*  163 */     OreDictionary.registerOre("listAllrabbitraw", Items.rabbit);
/*  164 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  166 */       OreDictionary.registerOre("listAllrabbitraw", ItemRegistry.firmtofuItem);
/*      */     }
/*  168 */     OreDictionary.registerOre("listAllrabbitcooked", Items.cooked_rabbit);
/*  169 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  171 */       OreDictionary.registerOre("listAllrabbitcooked", ItemRegistry.firmtofuItem);
/*      */     }
/*      */     
/*  174 */     OreDictionary.registerOre("listAllvenisonraw", ItemRegistry.venisonrawItem);
/*  175 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  177 */       OreDictionary.registerOre("listAllvenisonraw", ItemRegistry.firmtofuItem);
/*      */     }
/*  179 */     OreDictionary.registerOre("listAllvenisoncooked", ItemRegistry.venisoncookedItem);
/*  180 */     if (ItemRegistry.enabletofuasmeatinRecipes)
/*      */     {
/*  182 */       OreDictionary.registerOre("listAllvenisoncooked", ItemRegistry.firmtofuItem);
/*      */     }
/*      */     
/*  185 */     if (ItemRegistry.enabletofuasmilkinRecipes)
/*      */     {
/*  187 */       OreDictionary.registerOre("listAllheavycream", ItemRegistry.silkentofuItem);
/*      */     }
/*  189 */     OreDictionary.registerOre("listAllheavycream", ItemRegistry.heavycreamItem);
/*      */     
/*  191 */     if (ItemRegistry.enabletofuasmilkinRecipes)
/*      */     {
/*  193 */       OreDictionary.registerOre("listAllicecream", ItemRegistry.silkentofuItem);
/*      */     }
/*  195 */     OreDictionary.registerOre("listAllicecream", ItemRegistry.icecreamItem);
/*      */     
/*  197 */     if (ItemRegistry.enablelistAllwatervanillawaterbucket)
/*      */     {
/*  199 */       OreDictionary.registerOre("listAllwater", Items.water_bucket);
/*      */     }
/*      */     
/*  202 */     if (ItemRegistry.enablelistAllwaterfreshwater)
/*      */     {
/*  204 */       OreDictionary.registerOre("listAllwater", ItemRegistry.freshwaterItem);
/*      */     }
/*      */     
/*  207 */     OreDictionary.registerOre("listAllmilk", Items.milk_bucket);
/*  208 */     OreDictionary.registerOre("listAllmilk", ItemRegistry.freshmilkItem);
/*  209 */     if (ItemRegistry.enabletofuasmilkinRecipes)
/*      */     {
/*  211 */       OreDictionary.registerOre("listAllmilk", ItemRegistry.soymilkItem);
/*      */     }
/*      */     
/*  214 */     OreDictionary.registerOre("listAllsugar", Items.sugar);
/*  215 */     OreDictionary.registerOre("listAllsugar", ItemRegistry.honeyItem);
/*      */     
/*  217 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.asparagusItem);
/*  218 */     OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.asparagusItem);
/*  219 */     OreDictionary.registerOre("cropAsparagus", ItemRegistry.asparagusItem);
/*  220 */     OreDictionary.registerOre("seedAsparagus", ItemRegistry.asparagusseedItem);
/*  221 */     OreDictionary.registerOre("listAllseed", ItemRegistry.asparagusseedItem);
/*  222 */     OreDictionary.registerOre("foodGrilledasparagus", ItemRegistry.grilledasparagusItem);
/*  223 */     OreDictionary.registerOre("listAllgrain", ItemRegistry.barleyItem);
/*  224 */     OreDictionary.registerOre("cropBarley", ItemRegistry.barleyItem);
/*  225 */     OreDictionary.registerOre("seedBarley", ItemRegistry.barleyseedItem);
/*  226 */     OreDictionary.registerOre("listAllseed", ItemRegistry.barleyseedItem);
/*  227 */     OreDictionary.registerOre("cropBean", ItemRegistry.beanItem);
/*  228 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.beanItem);
/*  229 */     OreDictionary.registerOre("seedBean", ItemRegistry.beanseedItem);
/*  230 */     OreDictionary.registerOre("listAllseed", ItemRegistry.beanseedItem);
/*  231 */     OreDictionary.registerOre("cropBeet", ItemRegistry.beetItem);
/*  232 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.beetItem);
/*  233 */     OreDictionary.registerOre("seedBeet", ItemRegistry.beetseedItem);
/*  234 */     OreDictionary.registerOre("listAllseed", ItemRegistry.beetseedItem);
/*  235 */     OreDictionary.registerOre("cropBroccoli", ItemRegistry.broccoliItem);
/*  236 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.broccoliItem);
/*  237 */     OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.broccoliItem);
/*  238 */     OreDictionary.registerOre("seedBroccoli", ItemRegistry.broccoliseedItem);
/*  239 */     OreDictionary.registerOre("listAllseed", ItemRegistry.broccoliseedItem);
/*  240 */     OreDictionary.registerOre("cropCauliflower", ItemRegistry.cauliflowerItem);
/*  241 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.cauliflowerItem);
/*  242 */     OreDictionary.registerOre("seedCauliflower", ItemRegistry.cauliflowerseedItem);
/*  243 */     OreDictionary.registerOre("listAllseed", ItemRegistry.cauliflowerseedItem);
/*  244 */     OreDictionary.registerOre("cropCelery", ItemRegistry.celeryItem);
/*  245 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.celeryItem);
/*  246 */     OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.celeryItem);
/*  247 */     OreDictionary.registerOre("seedCelery", ItemRegistry.celeryseedItem);
/*  248 */     OreDictionary.registerOre("listAllseed", ItemRegistry.celeryseedItem);
/*  249 */     OreDictionary.registerOre("listAllberry", ItemRegistry.cranberryItem);
/*  250 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.cranberryItem);
/*  251 */     OreDictionary.registerOre("cropCranberry", ItemRegistry.cranberryItem);
/*  252 */     OreDictionary.registerOre("seedCranberry", ItemRegistry.cranberryseedItem);
/*  253 */     OreDictionary.registerOre("listAllseed", ItemRegistry.cranberryseedItem);
/*  254 */     OreDictionary.registerOre("cropGarlic", ItemRegistry.garlicItem);
/*  255 */     OreDictionary.registerOre("listAllherb", ItemRegistry.garlicItem);
/*  256 */     OreDictionary.registerOre("seedGarlic", ItemRegistry.garlicseedItem);
/*  257 */     OreDictionary.registerOre("listAllseed", ItemRegistry.garlicseedItem);
/*  258 */     OreDictionary.registerOre("cropGinger", ItemRegistry.gingerItem);
/*  259 */     OreDictionary.registerOre("listAllspice", ItemRegistry.gingerItem);
/*  260 */     OreDictionary.registerOre("seedGinger", ItemRegistry.gingerseedItem);
/*  261 */     OreDictionary.registerOre("listAllseed", ItemRegistry.gingerseedItem);
/*  262 */     OreDictionary.registerOre("cropLeek", ItemRegistry.leekItem);
/*  263 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.leekItem);
/*  264 */     OreDictionary.registerOre("seedLeek", ItemRegistry.leekseedItem);
/*  265 */     OreDictionary.registerOre("listAllseed", ItemRegistry.leekseedItem);
/*  266 */     OreDictionary.registerOre("cropLettuce", ItemRegistry.lettuceItem);
/*  267 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.lettuceItem);
/*  268 */     OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.lettuceItem);
/*  269 */     OreDictionary.registerOre("seedLettuce", ItemRegistry.lettuceseedItem);
/*  270 */     OreDictionary.registerOre("listAllseed", ItemRegistry.lettuceseedItem);
/*  271 */     OreDictionary.registerOre("cropOats", ItemRegistry.oatsItem);
/*  272 */     OreDictionary.registerOre("listAllgrain", ItemRegistry.oatsItem);
/*  273 */     OreDictionary.registerOre("seedOats", ItemRegistry.oatsseedItem);
/*  274 */     OreDictionary.registerOre("listAllseed", ItemRegistry.oatsseedItem);
/*  275 */     OreDictionary.registerOre("cropOnion", ItemRegistry.onionItem);
/*  276 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.onionItem);
/*  277 */     OreDictionary.registerOre("seedOnion", ItemRegistry.onionseedItem);
/*  278 */     OreDictionary.registerOre("listAllseed", ItemRegistry.onionseedItem);
/*  279 */     OreDictionary.registerOre("cropParsnip", ItemRegistry.parsnipItem);
/*  280 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.parsnipItem);
/*  281 */     OreDictionary.registerOre("listAllrootveggie", ItemRegistry.parsnipItem);
/*  282 */     OreDictionary.registerOre("seedParsnip", ItemRegistry.parsnipseedItem);
/*  283 */     OreDictionary.registerOre("listAllseed", ItemRegistry.parsnipseedItem);
/*  284 */     OreDictionary.registerOre("listAllnut", ItemRegistry.peanutItem);
/*  285 */     OreDictionary.registerOre("cropPeanut", ItemRegistry.peanutItem);
/*  286 */     OreDictionary.registerOre("seedPeanut", ItemRegistry.peanutseedItem);
/*  287 */     OreDictionary.registerOre("listAllseed", ItemRegistry.peanutseedItem);
/*  288 */     OreDictionary.registerOre("cropPineapple", ItemRegistry.pineappleItem);
/*  289 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.pineappleItem);
/*  290 */     OreDictionary.registerOre("seedPineapple", ItemRegistry.pineappleseedItem);
/*  291 */     OreDictionary.registerOre("listAllseed", ItemRegistry.pineappleseedItem);
/*  292 */     OreDictionary.registerOre("cropRadish", ItemRegistry.radishItem);
/*  293 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.radishItem);
/*  294 */     OreDictionary.registerOre("listAllrootveggie", ItemRegistry.radishItem);
/*  295 */     OreDictionary.registerOre("seedRadish", ItemRegistry.radishseedItem);
/*  296 */     OreDictionary.registerOre("listAllseed", ItemRegistry.radishseedItem);
/*  297 */     OreDictionary.registerOre("cropRice", ItemRegistry.riceItem);
/*  298 */     OreDictionary.registerOre("seedRice", ItemRegistry.riceseedItem);
/*  299 */     OreDictionary.registerOre("foodRicecake", ItemRegistry.ricecakeItem);
/*  300 */     OreDictionary.registerOre("cropRutabaga", ItemRegistry.rutabagaItem);
/*  301 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.rutabagaItem);
/*  302 */     OreDictionary.registerOre("listAllrootveggie", ItemRegistry.rutabagaItem);
/*  303 */     OreDictionary.registerOre("seedRutabaga", ItemRegistry.rutabagaseedItem);
/*  304 */     OreDictionary.registerOre("cropRye", ItemRegistry.ryeItem);
/*  305 */     OreDictionary.registerOre("listAllgrain", ItemRegistry.ryeItem);
/*  306 */     OreDictionary.registerOre("seedRye", ItemRegistry.ryeseedItem);
/*  307 */     OreDictionary.registerOre("listAllseed", ItemRegistry.ryeseedItem);
/*  308 */     OreDictionary.registerOre("cropScallion", ItemRegistry.scallionItem);
/*  309 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.scallionItem);
/*  310 */     OreDictionary.registerOre("seedScallion", ItemRegistry.scallionseedItem);
/*  311 */     OreDictionary.registerOre("listAllseed", ItemRegistry.scallionseedItem);
/*  312 */     OreDictionary.registerOre("cropSoybean", ItemRegistry.soybeanItem);
/*  313 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.soybeanItem);
/*  314 */     OreDictionary.registerOre("seedSoybean", ItemRegistry.soybeanseedItem);
/*  315 */     OreDictionary.registerOre("listAllseed", ItemRegistry.soybeanseedItem);
/*  316 */     OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.spiceleafItem);
/*  317 */     OreDictionary.registerOre("listAllspice", ItemRegistry.spiceleafItem);
/*  318 */     OreDictionary.registerOre("cropSpiceleaf", ItemRegistry.spiceleafItem);
/*  319 */     OreDictionary.registerOre("seedSpiceleaf", ItemRegistry.spiceleafseedItem);
/*  320 */     OreDictionary.registerOre("listAllseed", ItemRegistry.spiceleafseedItem);
/*  321 */     OreDictionary.registerOre("listAllseed", ItemRegistry.sunflowerseedsItem);
/*  322 */     OreDictionary.registerOre("cropSunflower", ItemRegistry.sunflowerseedsItem);
/*  323 */     OreDictionary.registerOre("cropSweetpotato", ItemRegistry.sweetpotatoItem);
/*  324 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.sweetpotatoItem);
/*  325 */     OreDictionary.registerOre("listAllrootveggie", ItemRegistry.sweetpotatoItem);
/*  326 */     OreDictionary.registerOre("seedSweetpotato", ItemRegistry.sweetpotatoseedItem);
/*  327 */     OreDictionary.registerOre("listAllseed", ItemRegistry.sweetpotatoseedItem);
/*  328 */     OreDictionary.registerOre("cropTea", ItemRegistry.tealeafItem);
/*  329 */     OreDictionary.registerOre("seedTea", ItemRegistry.teaseedItem);
/*  330 */     OreDictionary.registerOre("listAllseed", ItemRegistry.teaseedItem);
/*  331 */     OreDictionary.registerOre("foodTea", ItemRegistry.teaItem);
/*  332 */     OreDictionary.registerOre("cropTurnip", ItemRegistry.turnipItem);
/*  333 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.turnipItem);
/*  334 */     OreDictionary.registerOre("listAllrootveggie", ItemRegistry.turnipItem);
/*  335 */     OreDictionary.registerOre("seedTurnip", ItemRegistry.turnipseedItem);
/*  336 */     OreDictionary.registerOre("listAllseed", ItemRegistry.turnipseedItem);
/*  337 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.whitemushroomItem);
/*  338 */     OreDictionary.registerOre("listAllmushroom", ItemRegistry.whitemushroomItem);
/*  339 */     OreDictionary.registerOre("cropWhitemushroom", ItemRegistry.whitemushroomItem);
/*  340 */     OreDictionary.registerOre("seedWhitemushroom", ItemRegistry.whitemushroomseedItem);
/*  341 */     OreDictionary.registerOre("listAllseed", ItemRegistry.whitemushroomseedItem);
/*      */     
/*  343 */     OreDictionary.registerOre("cropArtichoke", ItemRegistry.artichokeItem);
/*  344 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.artichokeItem);
/*  345 */     OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.artichokeItem);
/*  346 */     OreDictionary.registerOre("seedArtichoke", ItemRegistry.artichokeseedItem);
/*  347 */     OreDictionary.registerOre("cropBellpepper", ItemRegistry.bellpepperItem);
/*  348 */     OreDictionary.registerOre("listAllpepper", ItemRegistry.bellpepperItem);
/*  349 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.bellpepperItem);
/*  350 */     OreDictionary.registerOre("seedBellpepper", ItemRegistry.bellpepperseedItem);
/*  351 */     OreDictionary.registerOre("listAllseed", ItemRegistry.bellpepperseedItem);
/*  352 */     OreDictionary.registerOre("listAllberry", ItemRegistry.blackberryItem);
/*  353 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.blackberryItem);
/*  354 */     OreDictionary.registerOre("cropBlackberry", ItemRegistry.blackberryItem);
/*  355 */     OreDictionary.registerOre("seedBlackberry", ItemRegistry.blackberryseedItem);
/*  356 */     OreDictionary.registerOre("listAllseed", ItemRegistry.blackberryseedItem);
/*  357 */     OreDictionary.registerOre("listAllberry", ItemRegistry.blueberryItem);
/*  358 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.blueberryItem);
/*  359 */     OreDictionary.registerOre("cropBlueberry", ItemRegistry.blueberryItem);
/*  360 */     OreDictionary.registerOre("seedBlueberry", ItemRegistry.blueberryseedItem);
/*  361 */     OreDictionary.registerOre("listAllseed", ItemRegistry.blueberryseedItem);
/*  362 */     OreDictionary.registerOre("cropBrusselsprout", ItemRegistry.brusselsproutItem);
/*  363 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.brusselsproutItem);
/*  364 */     OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.brusselsproutItem);
/*  365 */     OreDictionary.registerOre("seedBrusselsprout", ItemRegistry.brusselsproutseedItem);
/*  366 */     OreDictionary.registerOre("cropCabbage", ItemRegistry.cabbageItem);
/*  367 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.cabbageItem);
/*  368 */     OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.cabbageItem);
/*  369 */     OreDictionary.registerOre("seedCabbage", ItemRegistry.cabbageseedItem);
/*  370 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.cactusfruitItem);
/*  371 */     OreDictionary.registerOre("cropCactusfruit", ItemRegistry.cactusfruitItem);
/*  372 */     OreDictionary.registerOre("seedCactusfruit", ItemRegistry.cactusfruitseedItem);
/*  373 */     OreDictionary.registerOre("listAllseed", ItemRegistry.cactusfruitseedItem);
/*  374 */     OreDictionary.registerOre("cropCantaloupe", ItemRegistry.cantaloupeItem);
/*  375 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.cantaloupeItem);
/*  376 */     OreDictionary.registerOre("seedCantaloupe", ItemRegistry.cantaloupeseedItem);
/*  377 */     OreDictionary.registerOre("listAllseed", ItemRegistry.cantaloupeseedItem);
/*  378 */     OreDictionary.registerOre("cropChilipepper", ItemRegistry.chilipepperItem);
/*  379 */     OreDictionary.registerOre("listAllpepper", ItemRegistry.chilipepperItem);
/*  380 */     OreDictionary.registerOre("seedChilipepper", ItemRegistry.chilipepperseedItem);
/*  381 */     OreDictionary.registerOre("listAllseed", ItemRegistry.chilipepperseedItem);
/*  382 */     OreDictionary.registerOre("cropCoffee", ItemRegistry.coffeebeanItem);
/*  383 */     OreDictionary.registerOre("seedCoffee", ItemRegistry.coffeeseedItem);
/*  384 */     OreDictionary.registerOre("listAllseed", ItemRegistry.coffeeseedItem);
/*  385 */     OreDictionary.registerOre("foodCoffee", ItemRegistry.coffeeItem);
/*  386 */     OreDictionary.registerOre("cropCorn", ItemRegistry.cornItem);
/*  387 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.cornItem);
/*  388 */     OreDictionary.registerOre("seedCorn", ItemRegistry.cornseedItem);
/*  389 */     OreDictionary.registerOre("listAllseed", ItemRegistry.cornseedItem);
/*  390 */     OreDictionary.registerOre("cropCucumber", ItemRegistry.cucumberItem);
/*  391 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.cucumberItem);
/*  392 */     OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.cucumberItem);
/*  393 */     OreDictionary.registerOre("seedCucumber", ItemRegistry.cucumberseedItem);
/*  394 */     OreDictionary.registerOre("listAllseed", ItemRegistry.cucumberseedItem);
/*  395 */     OreDictionary.registerOre("cropEggplant", ItemRegistry.eggplantItem);
/*  396 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.eggplantItem);
/*  397 */     OreDictionary.registerOre("seedEggplant", ItemRegistry.eggplantseedItem);
/*  398 */     OreDictionary.registerOre("listAllseed", ItemRegistry.eggplantseedItem);
/*  399 */     OreDictionary.registerOre("foodGrilledeggplant", ItemRegistry.grilledeggplantItem);
/*  400 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.grapeItem);
/*  401 */     OreDictionary.registerOre("cropGrape", ItemRegistry.grapeItem);
/*  402 */     OreDictionary.registerOre("seedGrape", ItemRegistry.grapeseedItem);
/*  403 */     OreDictionary.registerOre("listAllseed", ItemRegistry.grapeseedItem);
/*  404 */     OreDictionary.registerOre("foodRaisins", ItemRegistry.raisinsItem);
/*  405 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.kiwiItem);
/*  406 */     OreDictionary.registerOre("cropKiwi", ItemRegistry.kiwiItem);
/*  407 */     OreDictionary.registerOre("seedKiwi", ItemRegistry.kiwiseedItem);
/*  408 */     OreDictionary.registerOre("listAllseed", ItemRegistry.kiwiseedItem);
/*  409 */     OreDictionary.registerOre("cropMustard", ItemRegistry.mustardseedsItem);
/*  410 */     OreDictionary.registerOre("listAllspice", ItemRegistry.mustardseedsItem);
/*  411 */     OreDictionary.registerOre("seedMustard", ItemRegistry.mustardseedItem);
/*  412 */     OreDictionary.registerOre("listAllseed", ItemRegistry.mustardseedItem);
/*  413 */     OreDictionary.registerOre("cropOkra", ItemRegistry.okraItem);
/*  414 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.okraItem);
/*  415 */     OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.okraItem);
/*  416 */     OreDictionary.registerOre("seedOkra", ItemRegistry.okraseedItem);
/*  417 */     OreDictionary.registerOre("cropPeas", ItemRegistry.peasItem);
/*  418 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.peasItem);
/*  419 */     OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.peasItem);
/*  420 */     OreDictionary.registerOre("seedPeas", ItemRegistry.peasseedItem);
/*  421 */     OreDictionary.registerOre("listAllseed", ItemRegistry.peasseedItem);
/*  422 */     OreDictionary.registerOre("listAllberry", ItemRegistry.raspberryItem);
/*  423 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.raspberryItem);
/*  424 */     OreDictionary.registerOre("cropRaspberry", ItemRegistry.raspberryItem);
/*  425 */     OreDictionary.registerOre("seedRaspberry", ItemRegistry.raspberryseedItem);
/*  426 */     OreDictionary.registerOre("listAllseed", ItemRegistry.raspberryseedItem);
/*  427 */     OreDictionary.registerOre("cropRhubarb", ItemRegistry.rhubarbItem);
/*  428 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.rhubarbItem);
/*  429 */     OreDictionary.registerOre("seedRhubarb", ItemRegistry.rhubarbseedItem);
/*  430 */     OreDictionary.registerOre("listAllseed", ItemRegistry.rhubarbseedItem);
/*  431 */     OreDictionary.registerOre("cropSeaweed", ItemRegistry.seaweedItem);
/*  432 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.seaweedItem);
/*  433 */     OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.seaweedItem);
/*  434 */     OreDictionary.registerOre("seedSeaweed", ItemRegistry.seaweedseedItem);
/*  435 */     OreDictionary.registerOre("listAllseed", ItemRegistry.seaweedseedItem);
/*  436 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.strawberryItem);
/*  437 */     OreDictionary.registerOre("listAllberry", ItemRegistry.strawberryItem);
/*  438 */     OreDictionary.registerOre("cropStrawberry", ItemRegistry.strawberryItem);
/*  439 */     OreDictionary.registerOre("seedStrawberry", ItemRegistry.strawberryseedItem);
/*  440 */     OreDictionary.registerOre("listAllseed", ItemRegistry.strawberryseedItem);
/*  441 */     OreDictionary.registerOre("cropTomato", ItemRegistry.tomatoItem);
/*  442 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.tomatoItem);
/*  443 */     OreDictionary.registerOre("seedTomato", ItemRegistry.tomatoseedItem);
/*  444 */     OreDictionary.registerOre("listAllseed", ItemRegistry.tomatoseedItem);
/*  445 */     OreDictionary.registerOre("cropWintersquash", ItemRegistry.wintersquashItem);
/*  446 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.wintersquashItem);
/*  447 */     OreDictionary.registerOre("seedWintersquash", ItemRegistry.wintersquashseedItem);
/*  448 */     OreDictionary.registerOre("listAllseed", ItemRegistry.wintersquashseedItem);
/*  449 */     OreDictionary.registerOre("cropZucchini", ItemRegistry.zucchiniItem);
/*  450 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.zucchiniItem);
/*  451 */     OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.zucchiniItem);
/*  452 */     OreDictionary.registerOre("seedZucchini", ItemRegistry.zucchiniseedItem);
/*  453 */     OreDictionary.registerOre("listAllseed", ItemRegistry.zucchiniseedItem);
/*  454 */     OreDictionary.registerOre("cropBambooshoot", ItemRegistry.bambooshootItem);
/*  455 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.bambooshootItem);
/*  456 */     OreDictionary.registerOre("seedBambooshoot", ItemRegistry.bambooshootseedItem);
/*  457 */     OreDictionary.registerOre("listAllseed", ItemRegistry.bambooshootseedItem);
/*  458 */     OreDictionary.registerOre("cropSpinach", ItemRegistry.spinachItem);
/*  459 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.spinachItem);
/*  460 */     OreDictionary.registerOre("listAllgreenveggie", ItemRegistry.spinachItem);
/*  461 */     OreDictionary.registerOre("seedSpinach", ItemRegistry.spinachseedItem);
/*  462 */     OreDictionary.registerOre("listAllseed", ItemRegistry.spinachseedItem);
/*      */     
/*  464 */     OreDictionary.registerOre("cropCurryleaf", ItemRegistry.curryleafItem);
/*  465 */     OreDictionary.registerOre("listAllspice", ItemRegistry.currypowderItem);
/*  466 */     OreDictionary.registerOre("seedCurryleaf", ItemRegistry.curryleafseedItem);
/*  467 */     OreDictionary.registerOre("listAllseed", ItemRegistry.curryleafseedItem);
/*      */     
/*  469 */     OreDictionary.registerOre("cropSesame", ItemRegistry.sesameseedsItem);
/*  470 */     OreDictionary.registerOre("seedSesameseed", ItemRegistry.sesameseedsseedItem);
/*  471 */     OreDictionary.registerOre("listAllseed", ItemRegistry.sesameseedsseedItem);
/*      */     
/*  473 */     OreDictionary.registerOre("cropWaterchestnut", ItemRegistry.waterchestnutItem);
/*  474 */     OreDictionary.registerOre("listAllveggie", ItemRegistry.waterchestnutItem);
/*  475 */     OreDictionary.registerOre("seedWaterchestnut", ItemRegistry.waterchestnutseedItem);
/*  476 */     OreDictionary.registerOre("listAllseed", ItemRegistry.waterchestnutseedItem);
/*      */     
/*  478 */     OreDictionary.registerOre("cropAvocado", ItemRegistry.avocadoItem);
/*  479 */     OreDictionary.registerOre("cropBanana", ItemRegistry.bananaItem);
/*  480 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.bananaItem);
/*  481 */     OreDictionary.registerOre("cropCherry", ItemRegistry.cherryItem);
/*  482 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.cherryItem);
/*  483 */     OreDictionary.registerOre("cropCinnamon", ItemRegistry.cinnamonItem);
/*  484 */     OreDictionary.registerOre("cropCoconut", ItemRegistry.coconutItem);
/*  485 */     OreDictionary.registerOre("foodToastedcoconut", ItemRegistry.toastedcoconutItem);
/*  486 */     OreDictionary.registerOre("cropDragonfruit", ItemRegistry.dragonfruitItem);
/*  487 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.dragonfruitItem);
/*  488 */     OreDictionary.registerOre("cropLemon", ItemRegistry.lemonItem);
/*  489 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.lemonItem);
/*  490 */     OreDictionary.registerOre("listAllcitrus", ItemRegistry.lemonItem);
/*  491 */     OreDictionary.registerOre("cropLime", ItemRegistry.limeItem);
/*  492 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.limeItem);
/*  493 */     OreDictionary.registerOre("listAllcitrus", ItemRegistry.limeItem);
/*  494 */     OreDictionary.registerOre("cropMango", ItemRegistry.mangoItem);
/*  495 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.mangoItem);
/*  496 */     OreDictionary.registerOre("cropNutmeg", ItemRegistry.nutmegItem);
/*  497 */     OreDictionary.registerOre("cropOlive", ItemRegistry.oliveItem);
/*  498 */     OreDictionary.registerOre("cropOrange", ItemRegistry.orangeItem);
/*  499 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.orangeItem);
/*  500 */     OreDictionary.registerOre("listAllcitrus", ItemRegistry.orangeItem);
/*  501 */     OreDictionary.registerOre("cropPapaya", ItemRegistry.papayaItem);
/*  502 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.papayaItem);
/*  503 */     OreDictionary.registerOre("cropPeach", ItemRegistry.peachItem);
/*  504 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.peachItem);
/*  505 */     OreDictionary.registerOre("cropPear", ItemRegistry.pearItem);
/*  506 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.pearItem);
/*  507 */     OreDictionary.registerOre("cropPeppercorn", ItemRegistry.peppercornItem);
/*  508 */     OreDictionary.registerOre("cropPlum", ItemRegistry.plumItem);
/*  509 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.plumItem);
/*  510 */     OreDictionary.registerOre("cropPomegranate", ItemRegistry.pomegranateItem);
/*  511 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.pomegranateItem);
/*  512 */     OreDictionary.registerOre("cropStarfruit", ItemRegistry.starfruitItem);
/*  513 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.starfruitItem);
/*  514 */     OreDictionary.registerOre("cropVanillabean", ItemRegistry.vanillabeanItem);
/*  515 */     OreDictionary.registerOre("foodVanilla", ItemRegistry.vanillaItem);
/*  516 */     OreDictionary.registerOre("cropWalnut", ItemRegistry.walnutItem);
/*  517 */     OreDictionary.registerOre("listAllnut", ItemRegistry.walnutItem);
/*  518 */     OreDictionary.registerOre("cropGooseberry", ItemRegistry.gooseberryItem);
/*  519 */     OreDictionary.registerOre("listAllberry", ItemRegistry.gooseberryItem);
/*  520 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.gooseberryItem);
/*      */     
/*  522 */     OreDictionary.registerOre("cropAlmond", ItemRegistry.almondItem);
/*  523 */     OreDictionary.registerOre("listAllnut", ItemRegistry.almondItem);
/*  524 */     OreDictionary.registerOre("cropApricot", ItemRegistry.apricotItem);
/*  525 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.apricotItem);
/*  526 */     OreDictionary.registerOre("cropCashew", ItemRegistry.cashewItem);
/*  527 */     OreDictionary.registerOre("listAllnut", ItemRegistry.cashewItem);
/*  528 */     OreDictionary.registerOre("cropChestnut", ItemRegistry.chestnutItem);
/*  529 */     OreDictionary.registerOre("listAllnut", ItemRegistry.chestnutItem);
/*  530 */     OreDictionary.registerOre("cropDate", ItemRegistry.dateItem);
/*  531 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.dateItem);
/*  532 */     OreDictionary.registerOre("cropDurian", ItemRegistry.durianItem);
/*  533 */     OreDictionary.registerOre("cropFig", ItemRegistry.figItem);
/*  534 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.figItem);
/*  535 */     OreDictionary.registerOre("cropGrapefruit", ItemRegistry.grapefruitItem);
/*  536 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.grapefruitItem);
/*  537 */     OreDictionary.registerOre("listAllcitrus", ItemRegistry.grapefruitItem);
/*  538 */     OreDictionary.registerOre("cropMaplesyrup", ItemRegistry.maplesyrupItem);
/*  539 */     OreDictionary.registerOre("cropPecan", ItemRegistry.pecanItem);
/*  540 */     OreDictionary.registerOre("listAllnut", ItemRegistry.pecanItem);
/*  541 */     OreDictionary.registerOre("cropPersimmon", ItemRegistry.persimmonItem);
/*  542 */     OreDictionary.registerOre("listAllfruit", ItemRegistry.persimmonItem);
/*  543 */     OreDictionary.registerOre("cropPistachio", ItemRegistry.pistachioItem);
/*  544 */     OreDictionary.registerOre("listAllnut", ItemRegistry.pistachioItem);
/*      */     
/*  546 */     OreDictionary.registerOre("foodSalt", ItemRegistry.saltItem);
/*  547 */     OreDictionary.registerOre("foodFlour", ItemRegistry.flourItem);
/*  548 */     OreDictionary.registerOre("foodDough", ItemRegistry.doughItem);
/*  549 */     OreDictionary.registerOre("foodToast", ItemRegistry.toastItem);
/*  550 */     OreDictionary.registerOre("foodPasta", ItemRegistry.pastaItem);
/*  551 */     OreDictionary.registerOre("foodHeavycream", ItemRegistry.heavycreamItem);
/*  552 */     OreDictionary.registerOre("foodButter", ItemRegistry.butterItem);
/*  553 */     OreDictionary.registerOre("foodCheese", ItemRegistry.cheeseItem);
/*  554 */     OreDictionary.registerOre("foodIcecream", ItemRegistry.icecreamItem);
/*  555 */     OreDictionary.registerOre("foodGrilledcheese", ItemRegistry.grilledcheeseItem);
/*  556 */     OreDictionary.registerOre("foodApplesauce", ItemRegistry.applesauceItem);
/*  557 */     OreDictionary.registerOre("foodApplejuice", ItemRegistry.applejuiceItem);
/*  558 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.applejuiceItem);
/*  559 */     OreDictionary.registerOre("foodApplepie", ItemRegistry.applepieItem);
/*  560 */     OreDictionary.registerOre("foodCaramelapple", ItemRegistry.caramelappleItem);
/*  561 */     OreDictionary.registerOre("foodPumpkinbread", ItemRegistry.pumpkinbreadItem);
/*  562 */     OreDictionary.registerOre("foodRoastedpumpkinseeds", ItemRegistry.roastedpumpkinseedsItem);
/*  563 */     OreDictionary.registerOre("foodPumpkinsoup", ItemRegistry.pumpkinsoupItem);
/*  564 */     OreDictionary.registerOre("foodMelonjuice", ItemRegistry.melonjuiceItem);
/*  565 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.melonjuiceItem);
/*  566 */     OreDictionary.registerOre("foodMelonsmoothie", ItemRegistry.melonsmoothieItem);
/*  567 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.melonsmoothieItem);
/*  568 */     OreDictionary.registerOre("foodCarrotjuice", ItemRegistry.carrotjuiceItem);
/*  569 */     OreDictionary.registerOre("foodCarrotcake", ItemRegistry.carrotcakeItem);
/*  570 */     OreDictionary.registerOre("foodCarrotsoup", ItemRegistry.carrotsoupItem);
/*  571 */     OreDictionary.registerOre("foodGlazedcarrots", ItemRegistry.glazedcarrotsItem);
/*  572 */     OreDictionary.registerOre("foodButteredpotato", ItemRegistry.butteredpotatoItem);
/*  573 */     OreDictionary.registerOre("foodLoadedbakedpotato", ItemRegistry.loadedbakedpotatoItem);
/*  574 */     OreDictionary.registerOre("foodMashedpotatoes", ItemRegistry.mashedpotatoesItem);
/*  575 */     OreDictionary.registerOre("foodPotatosalad", ItemRegistry.potatosaladItem);
/*  576 */     OreDictionary.registerOre("foodPotatosoup", ItemRegistry.potatosoupItem);
/*  577 */     OreDictionary.registerOre("foodFries", ItemRegistry.friesItem);
/*  578 */     OreDictionary.registerOre("foodGrilledmushroom", ItemRegistry.grilledmushroomItem);
/*  579 */     OreDictionary.registerOre("foodStuffedmushroom", ItemRegistry.stuffedmushroomItem);
/*  580 */     OreDictionary.registerOre("foodChickensandwich", ItemRegistry.chickensandwichItem);
/*  581 */     OreDictionary.registerOre("foodChickennoodlesoup", ItemRegistry.chickennoodlesoupItem);
/*  582 */     OreDictionary.registerOre("foodChickenpotpie", ItemRegistry.chickenpotpieItem);
/*  583 */     OreDictionary.registerOre("foodBreadedporkchop", ItemRegistry.breadedporkchopItem);
/*  584 */     OreDictionary.registerOre("foodHotdog", ItemRegistry.hotdogItem);
/*  585 */     OreDictionary.registerOre("foodBakedham", ItemRegistry.bakedhamItem);
/*  586 */     OreDictionary.registerOre("foodHamburger", ItemRegistry.hamburgerItem);
/*  587 */     OreDictionary.registerOre("foodCheeseburger", ItemRegistry.cheeseburgerItem);
/*  588 */     OreDictionary.registerOre("foodBaconcheeseburger", ItemRegistry.baconcheeseburgerItem);
/*  589 */     OreDictionary.registerOre("foodPotroast", ItemRegistry.potroastItem);
/*  590 */     OreDictionary.registerOre("foodFishsandwich", ItemRegistry.fishsandwichItem);
/*  591 */     OreDictionary.registerOre("foodFishsticks", ItemRegistry.fishsticksItem);
/*  592 */     OreDictionary.registerOre("foodFishandchips", ItemRegistry.fishandchipsItem);
/*  593 */     OreDictionary.registerOre("foodMayo", ItemRegistry.mayoItem);
/*  594 */     OreDictionary.registerOre("foodFriedegg", ItemRegistry.friedeggItem);
/*  595 */     OreDictionary.registerOre("foodScrambledegg", ItemRegistry.scrambledeggItem);
/*  596 */     OreDictionary.registerOre("foodBoiledegg", ItemRegistry.boiledeggItem);
/*  597 */     OreDictionary.registerOre("foodEggsalad", ItemRegistry.eggsaladItem);
/*  598 */     OreDictionary.registerOre("foodCaramel", ItemRegistry.caramelItem);
/*  599 */     OreDictionary.registerOre("foodTaffy", ItemRegistry.taffyItem);
/*  600 */     OreDictionary.registerOre("foodSpidereyesoup", ItemRegistry.spidereyesoupItem);
/*  601 */     OreDictionary.registerOre("foodZombiejerky", ItemRegistry.zombiejerkyItem);
/*  602 */     OreDictionary.registerOre("foodCocoapowder", ItemRegistry.cocoapowderItem);
/*  603 */     OreDictionary.registerOre("foodChocolatebar", ItemRegistry.chocolatebarItem);
/*  604 */     OreDictionary.registerOre("foodHotchocolate", ItemRegistry.hotchocolateItem);
/*  605 */     OreDictionary.registerOre("foodChocolateicecream", ItemRegistry.chocolateicecreamItem);
/*  606 */     OreDictionary.registerOre("foodVegetablesoup", ItemRegistry.vegetablesoupItem);
/*  607 */     OreDictionary.registerOre("foodStock", ItemRegistry.stockItem);
/*  608 */     OreDictionary.registerOre("foodFruitsalad", ItemRegistry.fruitsaladItem);
/*      */     
/*  610 */     OreDictionary.registerOre("foodSpagetti", ItemRegistry.spagettiItem);
/*  611 */     OreDictionary.registerOre("foodSpagettiandmeatballs", ItemRegistry.spagettiandmeatballsItem);
/*  612 */     OreDictionary.registerOre("foodTomatosoup", ItemRegistry.tomatosoupItem);
/*  613 */     OreDictionary.registerOre("foodKetchup", ItemRegistry.ketchupItem);
/*  614 */     OreDictionary.registerOre("foodChickenparmasan", ItemRegistry.chickenparmasanItem);
/*  615 */     OreDictionary.registerOre("foodPizza", ItemRegistry.pizzaItem);
/*      */     
/*  617 */     OreDictionary.registerOre("foodSpringsalad", ItemRegistry.springsaladItem);
/*  618 */     OreDictionary.registerOre("foodPorklettucewrap", ItemRegistry.porklettucewrapItem);
/*  619 */     OreDictionary.registerOre("foodFishlettucewrap", ItemRegistry.fishlettucewrapItem);
/*  620 */     OreDictionary.registerOre("foodBlt", ItemRegistry.bltItem);
/*  621 */     OreDictionary.registerOre("foodLeafychickensandwich", ItemRegistry.leafychickensandwichItem);
/*  622 */     OreDictionary.registerOre("foodLeafyfishsandwich", ItemRegistry.leafyfishsandwichItem);
/*  623 */     OreDictionary.registerOre("foodDeluxecheeseburger", ItemRegistry.deluxecheeseburgerItem);
/*  624 */     OreDictionary.registerOre("foodDelightedmeal", ItemRegistry.delightedmealItem);
/*      */     
/*  626 */     OreDictionary.registerOre("foodOnionsoup", ItemRegistry.onionsoupItem);
/*  627 */     OreDictionary.registerOre("foodPotatocakes", ItemRegistry.potatocakesItem);
/*  628 */     OreDictionary.registerOre("foodHash", ItemRegistry.hashItem);
/*  629 */     OreDictionary.registerOre("foodBraisedonions", ItemRegistry.braisedonionsItem);
/*  630 */     OreDictionary.registerOre("foodHeartyBreakfast", ItemRegistry.heartybreakfastItem);
/*      */     
/*  632 */     OreDictionary.registerOre("foodCornonthecob", ItemRegistry.cornonthecobItem);
/*  633 */     OreDictionary.registerOre("foodCornmeal", ItemRegistry.cornmealItem);
/*  634 */     OreDictionary.registerOre("foodCornbread", ItemRegistry.cornbreadItem);
/*  635 */     OreDictionary.registerOre("foodTortilla", ItemRegistry.tortillaItem);
/*  636 */     OreDictionary.registerOre("foodNachoes", ItemRegistry.nachoesItem);
/*  637 */     OreDictionary.registerOre("foodTaco", ItemRegistry.tacoItem);
/*  638 */     OreDictionary.registerOre("foodFishtaco", ItemRegistry.fishtacoItem);
/*  639 */     OreDictionary.registerOre("foodCreamedcorn", ItemRegistry.creamedcornItem);
/*      */     
/*  641 */     OreDictionary.registerOre("foodStrawberrysmoothie", ItemRegistry.strawberrysmoothieItem);
/*  642 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.strawberrysmoothieItem);
/*  643 */     OreDictionary.registerOre("foodStrawberrypie", ItemRegistry.strawberrypieItem);
/*  644 */     OreDictionary.registerOre("foodStrawberrysalad", ItemRegistry.strawberrysaladItem);
/*  645 */     OreDictionary.registerOre("foodStrawberryjuice", ItemRegistry.strawberryjuiceItem);
/*  646 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.strawberryjuiceItem);
/*  647 */     OreDictionary.registerOre("foodChocolatestrawberry", ItemRegistry.chocolatestrawberryItem);
/*      */     
/*  649 */     OreDictionary.registerOre("foodPeanutbutter", ItemRegistry.peanutbutterItem);
/*  650 */     OreDictionary.registerOre("listAllnutbutter", ItemRegistry.peanutbutterItem);
/*  651 */     OreDictionary.registerOre("foodTrailmix", ItemRegistry.trailmixItem);
/*  652 */     OreDictionary.registerOre("foodPbandj", ItemRegistry.pbandjItem);
/*  653 */     OreDictionary.registerOre("foodPeanutbuttercookies", ItemRegistry.peanutbuttercookiesItem);
/*      */     
/*  655 */     OreDictionary.registerOre("foodGrapejuice", ItemRegistry.grapejuiceItem);
/*  656 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.grapejuiceItem);
/*  657 */     OreDictionary.registerOre("foodVinegar", ItemRegistry.vinegarItem);
/*  658 */     OreDictionary.registerOre("foodGrapejelly", ItemRegistry.grapejellyItem);
/*  659 */     OreDictionary.registerOre("foodGrapesalad", ItemRegistry.grapesaladItem);
/*  660 */     OreDictionary.registerOre("foodRaisincookies", ItemRegistry.raisincookiesItem);
/*      */     
/*  662 */     OreDictionary.registerOre("foodPickles", ItemRegistry.picklesItem);
/*  663 */     OreDictionary.registerOre("foodCucumbersalad", ItemRegistry.cucumbersaladItem);
/*  664 */     OreDictionary.registerOre("foodCucumbersoup", ItemRegistry.cucumbersoupItem);
/*  665 */     OreDictionary.registerOre("foodVegetarianlettucewrap", ItemRegistry.vegetarianlettucewrapItem);
/*  666 */     OreDictionary.registerOre("foodMarinatedcucumbers", ItemRegistry.marinatedcucumbersItem);
/*      */     
/*  668 */     OreDictionary.registerOre("foodRicesoup", ItemRegistry.ricesoupItem);
/*  669 */     OreDictionary.registerOre("foodFriedrice", ItemRegistry.friedriceItem);
/*  670 */     OreDictionary.registerOre("foodMushroomrisotto", ItemRegistry.mushroomrisottoItem);
/*  671 */     OreDictionary.registerOre("foodCurry", ItemRegistry.curryItem);
/*  672 */     OreDictionary.registerOre("foodRainbowcurry", ItemRegistry.rainbowcurryItem);
/*      */     
/*  674 */     OreDictionary.registerOre("foodRefriedbeans", ItemRegistry.refriedbeansItem);
/*  675 */     OreDictionary.registerOre("foodBakedbeans", ItemRegistry.bakedbeansItem);
/*  676 */     OreDictionary.registerOre("foodBeansandrice", ItemRegistry.beansandriceItem);
/*  677 */     OreDictionary.registerOre("foodChili", ItemRegistry.chiliItem);
/*  678 */     OreDictionary.registerOre("foodBeanburrito", ItemRegistry.beanburritoItem);
/*      */     
/*  680 */     OreDictionary.registerOre("foodStuffedpepper", ItemRegistry.stuffedpepperItem);
/*  681 */     OreDictionary.registerOre("foodVeggiestirfry", ItemRegistry.veggiestirfryItem);
/*  682 */     OreDictionary.registerOre("foodGrilledskewers", ItemRegistry.grilledskewersItem);
/*  683 */     OreDictionary.registerOre("foodSupremepizza", ItemRegistry.supremepizzaItem);
/*  684 */     OreDictionary.registerOre("foodOmelet", ItemRegistry.omeletItem);
/*      */     
/*  686 */     OreDictionary.registerOre("foodHotwings", ItemRegistry.hotwingsItem);
/*  687 */     OreDictionary.registerOre("foodChilipoppers", ItemRegistry.chilipoppersItem);
/*  688 */     OreDictionary.registerOre("foodExtremechili", ItemRegistry.extremechiliItem);
/*  689 */     OreDictionary.registerOre("foodChilichocolate", ItemRegistry.chilichocolateItem);
/*      */     
/*  691 */     OreDictionary.registerOre("foodLemonaide", ItemRegistry.lemonaideItem);
/*  692 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.lemonaideItem);
/*  693 */     OreDictionary.registerOre("foodLemonbar", ItemRegistry.lemonbarItem);
/*  694 */     OreDictionary.registerOre("foodFishdinner", ItemRegistry.fishdinnerItem);
/*  695 */     OreDictionary.registerOre("foodLemonsmoothie", ItemRegistry.lemonsmoothieItem);
/*  696 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.lemonsmoothieItem);
/*  697 */     OreDictionary.registerOre("foodLemonmeringue", ItemRegistry.lemonmeringueItem);
/*  698 */     OreDictionary.registerOre("foodCandiedlemon", ItemRegistry.candiedlemonItem);
/*  699 */     OreDictionary.registerOre("foodLemonchicken", ItemRegistry.lemonchickenItem);
/*      */     
/*  701 */     OreDictionary.registerOre("foodBlueberrysmoothie", ItemRegistry.blueberrysmoothieItem);
/*  702 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.blueberrysmoothieItem);
/*  703 */     OreDictionary.registerOre("foodBlueberrypie", ItemRegistry.blueberrypieItem);
/*  704 */     OreDictionary.registerOre("foodBlueberrymuffin", ItemRegistry.blueberrymuffinItem);
/*  705 */     OreDictionary.registerOre("foodBlueberryjuice", ItemRegistry.blueberryjuiceItem);
/*  706 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.blueberryjuiceItem);
/*  707 */     OreDictionary.registerOre("foodPancakes", ItemRegistry.pancakesItem);
/*  708 */     OreDictionary.registerOre("foodBlueberrypancakes", ItemRegistry.blueberrypancakesItem);
/*      */     
/*  710 */     OreDictionary.registerOre("foodCherryjuice", ItemRegistry.cherryjuiceItem);
/*  711 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.cherryjuiceItem);
/*  712 */     OreDictionary.registerOre("foodCherrypie", ItemRegistry.cherrypieItem);
/*  713 */     OreDictionary.registerOre("foodChocolatecherry", ItemRegistry.chocolatecherryItem);
/*  714 */     OreDictionary.registerOre("foodCherrysmoothie", ItemRegistry.cherrysmoothieItem);
/*  715 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.cherrysmoothieItem);
/*  716 */     OreDictionary.registerOre("foodCheesecake", ItemRegistry.cheesecakeItem);
/*  717 */     OreDictionary.registerOre("foodCherrycheesecake", ItemRegistry.cherrycheesecakeItem);
/*      */     
/*  719 */     OreDictionary.registerOre("foodStuffedeggplant", ItemRegistry.stuffedeggplantItem);
/*  720 */     OreDictionary.registerOre("foodEggplantparm", ItemRegistry.eggplantparmItem);
/*      */     
/*  722 */     OreDictionary.registerOre("foodRaspberryicedtea", ItemRegistry.raspberryicedteaItem);
/*  723 */     OreDictionary.registerOre("foodChaitea", ItemRegistry.chaiteaItem);
/*      */     
/*  725 */     OreDictionary.registerOre("foodEspresso", ItemRegistry.espressoItem);
/*  726 */     OreDictionary.registerOre("foodCoffeeconleche", ItemRegistry.coffeeconlecheItem);
/*  727 */     OreDictionary.registerOre("foodMochaicecream", ItemRegistry.mochaicecreamItem);
/*      */     
/*  729 */     OreDictionary.registerOre("foodPickledbeets", ItemRegistry.pickledbeetsItem);
/*  730 */     OreDictionary.registerOre("foodBeetsalad", ItemRegistry.beetsaladItem);
/*  731 */     OreDictionary.registerOre("foodBeetsoup", ItemRegistry.beetsoupItem);
/*  732 */     OreDictionary.registerOre("foodBakedbeets", ItemRegistry.bakedbeetsItem);
/*      */     
/*  734 */     OreDictionary.registerOre("foodBroccolimac", ItemRegistry.broccolimacItem);
/*  735 */     OreDictionary.registerOre("foodBroccolindip", ItemRegistry.broccolindipItem);
/*  736 */     OreDictionary.registerOre("foodCreamedbroccolisoup", ItemRegistry.creamedbroccolisoupItem);
/*      */     
/*  738 */     OreDictionary.registerOre("foodSweetpotatopie", ItemRegistry.sweetpotatopieItem);
/*  739 */     OreDictionary.registerOre("foodCandiedsweetpotatoes", ItemRegistry.candiedsweetpotatoesItem);
/*  740 */     OreDictionary.registerOre("foodMashedsweetpotatoes", ItemRegistry.mashedsweetpotatoesItem);
/*      */     
/*  742 */     OreDictionary.registerOre("foodSteamedpeas", ItemRegistry.steamedpeasItem);
/*  743 */     OreDictionary.registerOre("foodSplitpeasoup", ItemRegistry.splitpeasoupItem);
/*      */     
/*  745 */     OreDictionary.registerOre("foodPineappleupsidedowncake", ItemRegistry.pineappleupsidedowncakeItem);
/*  746 */     OreDictionary.registerOre("foodPineappleham", ItemRegistry.pineapplehamItem);
/*  747 */     OreDictionary.registerOre("foodPineappleyogurt", ItemRegistry.pineappleyogurtItem);
/*      */     
/*  749 */     OreDictionary.registerOre("foodTurnipsoup", ItemRegistry.turnipsoupItem);
/*  750 */     OreDictionary.registerOre("foodRoastedrootveggiemedley", ItemRegistry.roastedrootveggiemedleyItem);
/*  751 */     OreDictionary.registerOre("foodBakedturnips", ItemRegistry.bakedturnipsItem);
/*      */     
/*  753 */     OreDictionary.registerOre("foodGingerbread", ItemRegistry.gingerbreadItem);
/*  754 */     OreDictionary.registerOre("foodGingersnaps", ItemRegistry.gingersnapsItem);
/*  755 */     OreDictionary.registerOre("foodCandiedginger", ItemRegistry.candiedgingerItem);
/*      */     
/*  757 */     OreDictionary.registerOre("foodMustard", ItemRegistry.mustardItem);
/*  758 */     OreDictionary.registerOre("foodSoftpretzelandmustard", ItemRegistry.softpretzelandmustardItem);
/*  759 */     OreDictionary.registerOre("foodSpicymustardpork", ItemRegistry.spicymustardporkItem);
/*  760 */     OreDictionary.registerOre("foodSpicygreens", ItemRegistry.spicygreensItem);
/*      */     
/*  762 */     OreDictionary.registerOre("foodGarlicbread", ItemRegistry.garlicbreadItem);
/*  763 */     OreDictionary.registerOre("foodGarlicmashedpotatoes", ItemRegistry.garlicmashedpotatoesItem);
/*  764 */     OreDictionary.registerOre("foodGarlicchicken", ItemRegistry.garlicchickenItem);
/*      */     
/*  766 */     OreDictionary.registerOre("foodSummerradishsalad", ItemRegistry.summerradishsaladItem);
/*  767 */     OreDictionary.registerOre("foodSummersquashwithradish", ItemRegistry.summersquashwithradishItem);
/*      */     
/*  769 */     OreDictionary.registerOre("foodCeleryandpeanutbutter", ItemRegistry.celeryandpeanutbutterItem);
/*  770 */     OreDictionary.registerOre("foodChickencelerycasserole", ItemRegistry.chickencelerycasseroleItem);
/*  771 */     OreDictionary.registerOre("foodPeasandcelery", ItemRegistry.peasandceleryItem);
/*  772 */     OreDictionary.registerOre("foodCelerysoup", ItemRegistry.celerysoupItem);
/*      */     
/*  774 */     OreDictionary.registerOre("foodZucchinibread", ItemRegistry.zucchinibreadItem);
/*  775 */     OreDictionary.registerOre("foodZucchinifries", ItemRegistry.zucchinifriesItem);
/*  776 */     OreDictionary.registerOre("foodZestyzucchini", ItemRegistry.zestyzucchiniItem);
/*  777 */     OreDictionary.registerOre("foodZucchinibake", ItemRegistry.zucchinibakeItem);
/*      */     
/*  779 */     OreDictionary.registerOre("foodAsparagusquiche", ItemRegistry.asparagusquicheItem);
/*  780 */     OreDictionary.registerOre("foodAsparagussoup", ItemRegistry.asparagussoupItem);
/*      */     
/*  782 */     OreDictionary.registerOre("foodWalnutraisinbread", ItemRegistry.walnutraisinbreadItem);
/*  783 */     OreDictionary.registerOre("foodCandiedwalnuts", ItemRegistry.candiedwalnutsItem);
/*  784 */     OreDictionary.registerOre("foodBrownie", ItemRegistry.brownieItem);
/*      */     
/*  786 */     OreDictionary.registerOre("foodPapayajuice", ItemRegistry.papayajuiceItem);
/*  787 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.papayajuiceItem);
/*  788 */     OreDictionary.registerOre("foodPapayasmoothie", ItemRegistry.papayasmoothieItem);
/*  789 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.papayasmoothieItem);
/*  790 */     OreDictionary.registerOre("foodPapayayogurt", ItemRegistry.papayayogurtItem);
/*      */     
/*  792 */     OreDictionary.registerOre("foodStarfruitjuice", ItemRegistry.starfruitjuiceItem);
/*  793 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.starfruitjuiceItem);
/*  794 */     OreDictionary.registerOre("foodStarfruitsmoothie", ItemRegistry.starfruitsmoothieItem);
/*  795 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.starfruitsmoothieItem);
/*  796 */     OreDictionary.registerOre("foodStarfruityogurt", ItemRegistry.starfruityogurtItem);
/*      */     
/*  798 */     OreDictionary.registerOre("foodGuacamole", ItemRegistry.guacamoleItem);
/*  799 */     OreDictionary.registerOre("foodCreamofavocadosoup", ItemRegistry.creamofavocadosoupItem);
/*  800 */     OreDictionary.registerOre("foodAvocadoburrito", ItemRegistry.avocadoburritoItem);
/*      */     
/*  802 */     OreDictionary.registerOre("foodPoachedpear", ItemRegistry.poachedpearItem);
/*  803 */     OreDictionary.registerOre("foodFruitcrumble", ItemRegistry.fruitcrumbleItem);
/*  804 */     OreDictionary.registerOre("foodPearyogurt", ItemRegistry.pearyogurtItem);
/*  805 */     OreDictionary.registerOre("foodPlumyogurt", ItemRegistry.plumyogurtItem);
/*      */     
/*  807 */     OreDictionary.registerOre("foodBananasplit", ItemRegistry.bananasplitItem);
/*  808 */     OreDictionary.registerOre("foodBanananutbread", ItemRegistry.banananutbreadItem);
/*  809 */     OreDictionary.registerOre("foodBananasmoothie", ItemRegistry.bananasmoothieItem);
/*  810 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.bananasmoothieItem);
/*  811 */     OreDictionary.registerOre("foodBananayogurt", ItemRegistry.bananayogurtItem);
/*      */     
/*  813 */     OreDictionary.registerOre("foodCoconutmilk", ItemRegistry.coconutmilkItem);
/*  814 */     OreDictionary.registerOre("foodChickencurry", ItemRegistry.chickencurryItem);
/*  815 */     OreDictionary.registerOre("foodCoconutshrimp", ItemRegistry.coconutshrimpItem);
/*  816 */     OreDictionary.registerOre("foodCoconutyogurt", ItemRegistry.coconutyogurtItem);
/*      */     
/*  818 */     OreDictionary.registerOre("foodOrangejuice", ItemRegistry.orangejuiceItem);
/*  819 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.orangejuiceItem);
/*  820 */     OreDictionary.registerOre("foodOrangechicken", ItemRegistry.orangechickenItem);
/*  821 */     OreDictionary.registerOre("foodOrangesmoothie", ItemRegistry.orangesmoothieItem);
/*  822 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.orangesmoothieItem);
/*  823 */     OreDictionary.registerOre("foodOrangeyogurt", ItemRegistry.orangeyogurtItem);
/*      */     
/*  825 */     OreDictionary.registerOre("foodPeachjuice", ItemRegistry.peachjuiceItem);
/*  826 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.peachjuiceItem);
/*  827 */     OreDictionary.registerOre("foodPeachcobbler", ItemRegistry.peachcobblerItem);
/*  828 */     OreDictionary.registerOre("foodPeachsmoothie", ItemRegistry.peachsmoothieItem);
/*  829 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.peachsmoothieItem);
/*  830 */     OreDictionary.registerOre("foodPeachyogurt", ItemRegistry.peachyogurtItem);
/*      */     
/*  832 */     OreDictionary.registerOre("foodLimejuice", ItemRegistry.limejuiceItem);
/*  833 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.limejuiceItem);
/*  834 */     OreDictionary.registerOre("foodKeylimepie", ItemRegistry.keylimepieItem);
/*  835 */     OreDictionary.registerOre("foodLimesmoothie", ItemRegistry.limesmoothieItem);
/*  836 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.limesmoothieItem);
/*  837 */     OreDictionary.registerOre("foodLimeyogurt", ItemRegistry.limeyogurtItem);
/*      */     
/*  839 */     OreDictionary.registerOre("foodMangojuice", ItemRegistry.mangojuiceItem);
/*  840 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.mangojuiceItem);
/*  841 */     OreDictionary.registerOre("foodMangosmoothie", ItemRegistry.mangosmoothieItem);
/*  842 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.mangosmoothieItem);
/*  843 */     OreDictionary.registerOre("foodMangoyogurt", ItemRegistry.mangoyogurtItem);
/*      */     
/*  845 */     OreDictionary.registerOre("foodPomegranatejuice", ItemRegistry.pomegranatejuiceItem);
/*  846 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.pomegranatejuiceItem);
/*  847 */     OreDictionary.registerOre("foodPomegranatesmoothie", ItemRegistry.pomegranatesmoothieItem);
/*  848 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.pomegranatesmoothieItem);
/*  849 */     OreDictionary.registerOre("foodPomegranateyogurt", ItemRegistry.pomegranateyogurtItem);
/*      */     
/*  851 */     OreDictionary.registerOre("foodVanillayogurt", ItemRegistry.vanillayogurtItem);
/*      */     
/*  853 */     OreDictionary.registerOre("foodCinnamonroll", ItemRegistry.cinnamonrollItem);
/*  854 */     OreDictionary.registerOre("foodFrenchtoast", ItemRegistry.frenchtoastItem);
/*      */     
/*  856 */     OreDictionary.registerOre("foodMarshmellows", ItemRegistry.marshmellowsItem);
/*  857 */     OreDictionary.registerOre("foodDonut", ItemRegistry.donutItem);
/*  858 */     OreDictionary.registerOre("foodChocolatedonut", ItemRegistry.chocolatedonutItem);
/*  859 */     OreDictionary.registerOre("foodPowdereddonut", ItemRegistry.powdereddonutItem);
/*  860 */     OreDictionary.registerOre("foodJellydonut", ItemRegistry.jellydonutItem);
/*  861 */     OreDictionary.registerOre("foodFrosteddonut", ItemRegistry.frosteddonutItem);
/*      */     
/*  863 */     OreDictionary.registerOre("foodCactussoup", ItemRegistry.cactussoupItem);
/*  864 */     OreDictionary.registerOre("foodWaffles", ItemRegistry.wafflesItem);
/*  865 */     OreDictionary.registerOre("foodSeedsoup", ItemRegistry.seedsoupItem);
/*  866 */     OreDictionary.registerOre("foodSoftpretzel", ItemRegistry.softpretzelItem);
/*  867 */     OreDictionary.registerOre("foodJellybeans", ItemRegistry.jellybeansItem);
/*  868 */     OreDictionary.registerOre("foodBiscuit", ItemRegistry.biscuitItem);
/*      */     
/*  870 */     OreDictionary.registerOre("foodCreamcookie", ItemRegistry.creamcookieItem);
/*  871 */     OreDictionary.registerOre("foodJaffa", ItemRegistry.jaffaItem);
/*  872 */     OreDictionary.registerOre("foodFriedchicken", ItemRegistry.friedchickenItem);
/*  873 */     OreDictionary.registerOre("foodChocolatesprinklecake", ItemRegistry.chocolatesprinklecakeItem);
/*  874 */     OreDictionary.registerOre("foodRedvelvetcake", ItemRegistry.redvelvetcakeItem);
/*  875 */     OreDictionary.registerOre("foodFootlong", ItemRegistry.footlongItem);
/*      */     
/*  877 */     OreDictionary.registerOre("foodBlueberryyogurt", ItemRegistry.blueberryyogurtItem);
/*  878 */     OreDictionary.registerOre("foodLemonyogurt", ItemRegistry.lemonyogurtItem);
/*  879 */     OreDictionary.registerOre("foodCherryyogurt", ItemRegistry.cherryyogurtItem);
/*  880 */     OreDictionary.registerOre("foodStrawberryyogurt", ItemRegistry.strawberryyogurtItem);
/*  881 */     OreDictionary.registerOre("foodGrapeyogurt", ItemRegistry.grapeyogurtItem);
/*  882 */     OreDictionary.registerOre("foodChocolateyogurt", ItemRegistry.chocolateyogurtItem);
/*      */     
/*  884 */     OreDictionary.registerOre("foodBlackberryjuice", ItemRegistry.blackberryjuiceItem);
/*  885 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.blackberryjuiceItem);
/*  886 */     OreDictionary.registerOre("foodBlackberrycobbler", ItemRegistry.blackberrycobblerItem);
/*  887 */     OreDictionary.registerOre("foodBlackberrysmoothie", ItemRegistry.blackberrysmoothieItem);
/*  888 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.blackberrysmoothieItem);
/*  889 */     OreDictionary.registerOre("foodBlackberryyogurt", ItemRegistry.blackberryyogurtItem);
/*  890 */     OreDictionary.registerOre("foodChocolatemilk", ItemRegistry.chocolatemilkItem);
/*  891 */     OreDictionary.registerOre("foodPumpkinyogurt", ItemRegistry.pumpkinyogurtItem);
/*      */     
/*  893 */     OreDictionary.registerOre("foodRaspberryjuice", ItemRegistry.raspberryjuiceItem);
/*  894 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.raspberryjuiceItem);
/*  895 */     OreDictionary.registerOre("foodRaspberrypie", ItemRegistry.raspberrypieItem);
/*  896 */     OreDictionary.registerOre("foodRaspberrysmoothie", ItemRegistry.raspberrysmoothieItem);
/*  897 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.raspberrysmoothieItem);
/*  898 */     OreDictionary.registerOre("foodRaspberryyogurt", ItemRegistry.raspberryyogurtItem);
/*  899 */     OreDictionary.registerOre("foodCinnamonsugardonut", ItemRegistry.cinnamonsugardonutItem);
/*  900 */     OreDictionary.registerOre("foodMelonyogurt", ItemRegistry.melonyogurtItem);
/*      */     
/*  902 */     OreDictionary.registerOre("foodKiwijuice", ItemRegistry.kiwijuiceItem);
/*  903 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.kiwijuiceItem);
/*  904 */     OreDictionary.registerOre("foodKiwismoothie", ItemRegistry.kiwismoothieItem);
/*  905 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.kiwismoothieItem);
/*  906 */     OreDictionary.registerOre("foodKiwiyogurt", ItemRegistry.kiwiyogurtItem);
/*  907 */     OreDictionary.registerOre("foodPlainyogurt", ItemRegistry.plainyogurtItem);
/*  908 */     OreDictionary.registerOre("foodAppleyogurt", ItemRegistry.appleyogurtItem);
/*      */     
/*  910 */     OreDictionary.registerOre("foodSaltedsunflowerseeds", ItemRegistry.saltedsunflowerseedsItem);
/*  911 */     OreDictionary.registerOre("foodSunflowerwheatrolls", ItemRegistry.sunflowerwheatrollsItem);
/*  912 */     OreDictionary.registerOre("foodSunflowerbroccolisalad", ItemRegistry.sunflowerbroccolisaladItem);
/*      */     
/*  914 */     OreDictionary.registerOre("foodCranberryjuice", ItemRegistry.cranberryjuiceItem);
/*  915 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.cranberryjuiceItem);
/*  916 */     OreDictionary.registerOre("foodCranberrysauce", ItemRegistry.cranberrysauceItem);
/*  917 */     OreDictionary.registerOre("foodCranberrybar", ItemRegistry.cranberrybarItem);
/*      */     
/*  919 */     OreDictionary.registerOre("foodPeppermint", ItemRegistry.peppermintItem);
/*      */     
/*  921 */     OreDictionary.registerOre("foodCactusfruitjuice", ItemRegistry.cactusfruitjuiceItem);
/*  922 */     OreDictionary.registerOre("listAlljuice", ItemRegistry.cactusfruitjuiceItem);
/*      */     
/*  924 */     OreDictionary.registerOre("foodBlackpepper", ItemRegistry.blackpepperItem);
/*  925 */     OreDictionary.registerOre("foodGroundcinnamon", ItemRegistry.groundcinnamonItem);
/*  926 */     OreDictionary.registerOre("foodGroundnutmeg", ItemRegistry.groundnutmegItem);
/*  927 */     OreDictionary.registerOre("foodOliveoil", ItemRegistry.oliveoilItem);
/*      */     
/*  929 */     OreDictionary.registerOre("foodBaklava", ItemRegistry.baklavaItem);
/*  930 */     OreDictionary.registerOre("foodGummybears", ItemRegistry.gummybearsItem);
/*  931 */     OreDictionary.registerOre("foodBaconmushroomburger", ItemRegistry.baconmushroomburgerItem);
/*  932 */     OreDictionary.registerOre("foodFruitpunch", ItemRegistry.fruitpunchItem);
/*  933 */     OreDictionary.registerOre("foodMeatystew", ItemRegistry.meatystewItem);
/*  934 */     OreDictionary.registerOre("foodMixedsalad", ItemRegistry.mixedsaladItem);
/*  935 */     OreDictionary.registerOre("foodPinacolada", ItemRegistry.pinacoladaItem);
/*  936 */     OreDictionary.registerOre("foodSaladdressing", ItemRegistry.saladdressingItem);
/*  937 */     OreDictionary.registerOre("foodShepherdspie", ItemRegistry.shepardspieItem);
/*  938 */     OreDictionary.registerOre("foodEggnog", ItemRegistry.eggnogItem);
/*  939 */     OreDictionary.registerOre("foodCustard", ItemRegistry.custardItem);
/*  940 */     OreDictionary.registerOre("foodSushi", ItemRegistry.sushiItem);
/*  941 */     OreDictionary.registerOre("foodGardensoup", ItemRegistry.gardensoupItem);
/*      */     
/*  943 */     OreDictionary.registerOre("foodMuttonraw", Items.mutton);
/*  944 */    OreDictionary.registerOre("foodMuttoncooked", Items.cooked_mutton);
				//OreDictionary.registerOre("foodMuttonraw", ItemRegistry.muttonrawItem);
				// OreDictionary.registerOre("foodMuttoncooked", ItemRegistry.muttoncookedItem);
/*  945 */     OreDictionary.registerOre("foodCalamariraw", ItemRegistry.calamarirawItem);
/*  946 */     OreDictionary.registerOre("foodCalamaricooked", ItemRegistry.calamaricookedItem);
/*      */     
/*  948 */     OreDictionary.registerOre("foodApplejelly", ItemRegistry.applejellyItem);
/*  949 */     OreDictionary.registerOre("foodApplejellysandwich", ItemRegistry.applejellysandwichItem);
/*  950 */     OreDictionary.registerOre("foodBlackberryjelly", ItemRegistry.blackberryjellyItem);
/*  951 */     OreDictionary.registerOre("foodBlackberryjellysandwich", ItemRegistry.blackberryjellysandwichItem);
/*  952 */     OreDictionary.registerOre("foodBlueberryjelly", ItemRegistry.blueberryjellyItem);
/*  953 */     OreDictionary.registerOre("foodBlueberryjellysandwich", ItemRegistry.blueberryjellysandwichItem);
/*  954 */     OreDictionary.registerOre("foodCherryjelly", ItemRegistry.cherryjellyItem);
/*  955 */     OreDictionary.registerOre("foodCherryjellysandwich", ItemRegistry.cherryjellysandwichItem);
/*  956 */     OreDictionary.registerOre("foodCranberryjelly", ItemRegistry.cranberryjellyItem);
/*  957 */     OreDictionary.registerOre("foodCranberryjellysandwich", ItemRegistry.cranberryjellysandwichItem);
/*  958 */     OreDictionary.registerOre("foodKiwijelly", ItemRegistry.kiwijellyItem);
/*  959 */     OreDictionary.registerOre("foodKiwijellysandwich", ItemRegistry.kiwijellysandwichItem);
/*  960 */     OreDictionary.registerOre("foodLemonjelly", ItemRegistry.lemonjellyItem);
/*  961 */     OreDictionary.registerOre("foodLemonjellysandwich", ItemRegistry.lemonjellysandwichItem);
/*  962 */     OreDictionary.registerOre("foodLimejelly", ItemRegistry.limejellyItem);
/*  963 */     OreDictionary.registerOre("foodLimejellysandwich", ItemRegistry.limejellysandwichItem);
/*  964 */     OreDictionary.registerOre("foodMangojelly", ItemRegistry.mangojellyItem);
/*  965 */     OreDictionary.registerOre("foodMangojellysandwich", ItemRegistry.mangojellysandwichItem);
/*  966 */     OreDictionary.registerOre("foodOrangejelly", ItemRegistry.orangejellyItem);
/*  967 */     OreDictionary.registerOre("foodOrangejellysandwich", ItemRegistry.orangejellysandwichItem);
/*  968 */     OreDictionary.registerOre("foodPapayajelly", ItemRegistry.papayajellyItem);
/*  969 */     OreDictionary.registerOre("foodPapayajellysandwich", ItemRegistry.papayajellysandwichItem);
/*  970 */     OreDictionary.registerOre("foodPeachjelly", ItemRegistry.peachjellyItem);
/*  971 */     OreDictionary.registerOre("foodPeachjellysandwich", ItemRegistry.peachjellysandwichItem);
/*  972 */     OreDictionary.registerOre("foodPomegranatejelly", ItemRegistry.pomegranatejellyItem);
/*  973 */     OreDictionary.registerOre("foodPomegranatejellysandwich", ItemRegistry.pomegranatejellysandwichItem);
/*  974 */     OreDictionary.registerOre("foodRaspberryjelly", ItemRegistry.raspberryjellyItem);
/*  975 */     OreDictionary.registerOre("foodRaspberryjellysandwich", ItemRegistry.raspberryjellysandwichItem);
/*  976 */     OreDictionary.registerOre("foodStarfruitjelly", ItemRegistry.starfruitjellyItem);
/*  977 */     OreDictionary.registerOre("foodStarfruitjellysandwich", ItemRegistry.starfruitjellysandwichItem);
/*  978 */     OreDictionary.registerOre("foodStrawberryjelly", ItemRegistry.strawberryjellyItem);
/*  979 */     OreDictionary.registerOre("foodStrawberryjellysandwich", ItemRegistry.strawberryjellysandwichItem);
/*  980 */     OreDictionary.registerOre("foodWatermelonjelly", ItemRegistry.watermelonjellyItem);
/*  981 */     OreDictionary.registerOre("foodWatermelonjellysandwich", ItemRegistry.watermelonjellysandwichItem);
/*      */     
/*  983 */     OreDictionary.registerOre("foodBubblywater", ItemRegistry.bubblywaterItem);
/*  984 */     OreDictionary.registerOre("foodCherrysoda", ItemRegistry.cherrysodaItem);
/*  985 */     OreDictionary.registerOre("foodColasoda", ItemRegistry.colasodaItem);
/*  986 */     OreDictionary.registerOre("foodGingersoda", ItemRegistry.gingersodaItem);
/*  987 */     OreDictionary.registerOre("foodGrapesoda", ItemRegistry.grapesodaItem);
/*  988 */     OreDictionary.registerOre("foodLemonlimesoda", ItemRegistry.lemonlimesodaItem);
/*  989 */     OreDictionary.registerOre("foodOrangesoda", ItemRegistry.orangesodaItem);
/*  990 */     OreDictionary.registerOre("foodRootbeersoda", ItemRegistry.rootbeersodaItem);
/*  991 */     OreDictionary.registerOre("foodStrawberrysoda", ItemRegistry.strawberrysodaItem);
/*      */     
/*  993 */     OreDictionary.registerOre("foodCaramelicecream", ItemRegistry.caramelicecreamItem);
/*  994 */     OreDictionary.registerOre("foodMintchocolatechipicecream", ItemRegistry.mintchocolatechipicemcreamItem);
/*  995 */     OreDictionary.registerOre("foodStrawberryicecream", ItemRegistry.strawberryicecreamItem);
/*  996 */     OreDictionary.registerOre("foodVanillaicecream", ItemRegistry.vanillaicecreamItem);
/*      */     
/*  998 */     OreDictionary.registerOre("cropEdibleroot", ItemRegistry.ediblerootItem);
/*      */     
/* 1000 */     OreDictionary.registerOre("foodGingerchicken", ItemRegistry.gingerchickenItem);
/*      */     
/* 1002 */     OreDictionary.registerOre("foodOldworldveggiesoup", ItemRegistry.oldworldveggiesoupItem);
/* 1003 */     OreDictionary.registerOre("foodSpicebun", ItemRegistry.spicebunItem);
/* 1004 */     OreDictionary.registerOre("foodGingeredrhubarbtart", ItemRegistry.gingeredrhubarbtartItem);
/* 1005 */     OreDictionary.registerOre("foodLambbarleysoup", ItemRegistry.lambbarleysoupItem);
/* 1006 */     OreDictionary.registerOre("foodHoneylemonlamb", ItemRegistry.honeylemonlambItem);
/* 1007 */     OreDictionary.registerOre("foodPumpkinoatscones", ItemRegistry.pumpkinoatsconesItem);
/* 1008 */     OreDictionary.registerOre("foodBeefjerky", ItemRegistry.beefjerkyItem);
/* 1009 */     OreDictionary.registerOre("foodPlumjuice", ItemRegistry.plumjuiceItem);
/* 1010 */     OreDictionary.registerOre("foodPearjuice", ItemRegistry.pearjuiceItem);
/* 1011 */     OreDictionary.registerOre("foodOvenroastedcauliflower", ItemRegistry.ovenroastedcauliflowerItem);
/* 1012 */     OreDictionary.registerOre("foodLeekbaconsoup", ItemRegistry.leekbaconsoupItem);
/* 1013 */     OreDictionary.registerOre("foodHerbbutterparsnips", ItemRegistry.herbbutterparsnipsItem);
/* 1014 */     OreDictionary.registerOre("foodScallionbakedpotato", ItemRegistry.scallionbakedpotatoItem);
/* 1015 */     OreDictionary.registerOre("foodSoymilk", ItemRegistry.soymilkItem);
/* 1016 */     OreDictionary.registerOre("foodFirmtofu", ItemRegistry.firmtofuItem);
/* 1017 */     OreDictionary.registerOre("foodSilkentofu", ItemRegistry.silkentofuItem);
/*      */     
/* 1019 */     OreDictionary.registerOre("foodBamboosteamedrice", ItemRegistry.bamboosteamedriceItem);
/* 1020 */     OreDictionary.registerOre("foodRoastedchestnut", ItemRegistry.roastedchestnutItem);
/* 1021 */     OreDictionary.registerOre("foodSweetpotatosouffle", ItemRegistry.sweetpotatosouffleItem);
/* 1022 */     OreDictionary.registerOre("foodCashewchicken", ItemRegistry.cashewchickenItem);
/* 1023 */     OreDictionary.registerOre("foodApricotjuice", ItemRegistry.apricotjuiceItem);
/* 1024 */     OreDictionary.registerOre("foodApricotyogurt", ItemRegistry.apricotyogurtItem);
/* 1025 */     OreDictionary.registerOre("foodApricotglazedpork", ItemRegistry.apricotglazedporkItem);
/* 1026 */     OreDictionary.registerOre("foodApricotjelly", ItemRegistry.apricotjellyItem);
/* 1027 */     OreDictionary.registerOre("foodApricotjellysandwich", ItemRegistry.apricotjellysandwichItem);
/* 1028 */     OreDictionary.registerOre("foodApricotsmoothie", ItemRegistry.apricotsmoothieItem);
/* 1029 */     OreDictionary.registerOre("foodFigbar", ItemRegistry.figbarItem);
/* 1030 */     OreDictionary.registerOre("foodFigjelly", ItemRegistry.figjellyItem);
/* 1031 */     OreDictionary.registerOre("foodFigjellysandwich", ItemRegistry.figjellysandwichItem);
/* 1032 */     OreDictionary.registerOre("foodFigsmoothie", ItemRegistry.figsmoothieItem);
/* 1033 */     OreDictionary.registerOre("foodFigyogurt", ItemRegistry.figyogurtItem);
/* 1034 */     OreDictionary.registerOre("foodFigjuice", ItemRegistry.figjuiceItem);
/* 1035 */     OreDictionary.registerOre("foodGrapefruitjuice", ItemRegistry.grapefruitjuiceItem);
/* 1036 */     OreDictionary.registerOre("foodGrapefruitjelly", ItemRegistry.grapefruitjellyItem);
/* 1037 */     OreDictionary.registerOre("foodGrapefruitjellysandwich", ItemRegistry.grapefruitjellysandwichItem);
/* 1038 */     OreDictionary.registerOre("foodGrapefruitjellysmoothie", ItemRegistry.grapefruitsmoothieItem);
/* 1039 */     OreDictionary.registerOre("foodGrapefruityogurt", ItemRegistry.grapefruityogurtItem);
/* 1040 */     OreDictionary.registerOre("foodGrapefruitsoda", ItemRegistry.grapefruitsodaItem);
/* 1041 */     OreDictionary.registerOre("foodCitrussalad", ItemRegistry.citrussaladItem);
/* 1042 */     OreDictionary.registerOre("foodPecanpie", ItemRegistry.pecanpieItem);
/* 1043 */     OreDictionary.registerOre("foodPralines", ItemRegistry.pralinesItem);
/* 1044 */     OreDictionary.registerOre("foodPersimmonjuice", ItemRegistry.persimmonjuiceItem);
/* 1045 */     OreDictionary.registerOre("foodPersimmonyogurt", ItemRegistry.persimmonyogurtItem);
/* 1046 */     OreDictionary.registerOre("foodPersimmonsmoothie", ItemRegistry.persimmonsmoothieItem);
/* 1047 */     OreDictionary.registerOre("foodPersimmonjelly", ItemRegistry.persimmonjellyItem);
/* 1048 */     OreDictionary.registerOre("foodPersimmonjellysanwich", ItemRegistry.persimmonjellysandwichItem);
/* 1049 */     OreDictionary.registerOre("foodPistachiobakedsalmon", ItemRegistry.pistachiobakedsalmonItem);
/* 1050 */     OreDictionary.registerOre("foodBaconwrappeddates", ItemRegistry.baconwrappeddatesItem);
/* 1051 */     OreDictionary.registerOre("foodDatenutbread", ItemRegistry.datenutbreadItem);
/* 1052 */     OreDictionary.registerOre("foodMaplesyruppancakes", ItemRegistry.maplesyruppancakesItem);
/* 1053 */     OreDictionary.registerOre("foodMaplesyrupwaffles", ItemRegistry.maplesyrupwafflesItem);
/* 1054 */     OreDictionary.registerOre("foodMaplesausage", ItemRegistry.maplesausageItem);
/* 1055 */     OreDictionary.registerOre("foodMapleoatmeal", ItemRegistry.mapleoatmealItem);
/* 1056 */     OreDictionary.registerOre("foodPeachesandcreamoatmeal", ItemRegistry.peachesandcreamoatmealItem);
/* 1057 */     OreDictionary.registerOre("foodCinnamonappleoatmeal", ItemRegistry.cinnamonappleoatmealItem);
/* 1058 */     OreDictionary.registerOre("foodMaplecandiedbacon", ItemRegistry.maplecandiedbaconItem);
/* 1059 */     OreDictionary.registerOre("foodToastsandwich", ItemRegistry.toastsandwichItem);
/* 1060 */     OreDictionary.registerOre("foodPotatoandcheesepirogi", ItemRegistry.potatoandcheesepirogiItem);
/* 1061 */     OreDictionary.registerOre("foodZeppole", ItemRegistry.zeppoleItem);
/* 1062 */     OreDictionary.registerOre("foodSausageinbread", ItemRegistry.sausageinbreadItem);
/* 1063 */     OreDictionary.registerOre("foodChocolatecaramelfudge", ItemRegistry.chocolatecaramelfudgeItem);
/* 1064 */     OreDictionary.registerOre("foodLavendershortbread", ItemRegistry.lavendershortbreadItem);
/* 1065 */     OreDictionary.registerOre("foodBeefwellington", ItemRegistry.beefwellingtonItem);
/* 1066 */     OreDictionary.registerOre("foodEpicbacon", ItemRegistry.epicbaconItem);
/* 1067 */     OreDictionary.registerOre("foodManjuu", ItemRegistry.manjuuItem);
/*      */     
/* 1069 */     OreDictionary.registerOre("foodChickengumbo", ItemRegistry.chickengumboItem);
/* 1070 */     OreDictionary.registerOre("foodGeneraltsochicken", ItemRegistry.generaltsochickenItem);
/* 1071 */     OreDictionary.registerOre("foodCaliforniaroll", ItemRegistry.californiarollItem);
/* 1072 */     OreDictionary.registerOre("foodFutomaki", ItemRegistry.futomakiItem);
/* 1073 */     OreDictionary.registerOre("foodBeansontoast", ItemRegistry.beansontoastItem);
/* 1074 */     OreDictionary.registerOre("foodVegemite", ItemRegistry.vegemiteItem);
/* 1075 */     OreDictionary.registerOre("foodHoneycombchocolatebar", ItemRegistry.honeycombchocolatebarItem);
/* 1076 */     OreDictionary.registerOre("foodCherrycoconutchocolatebar", ItemRegistry.cherrycoconutchocolatebarItem);
/* 1077 */     OreDictionary.registerOre("foodFairybread", ItemRegistry.fairybreadItem);
/* 1078 */     OreDictionary.registerOre("foodLamington", ItemRegistry.lamingtonItem);
/* 1079 */     OreDictionary.registerOre("foodTimtam", ItemRegistry.timtamItem);
/* 1080 */     OreDictionary.registerOre("foodMeatpie", ItemRegistry.meatpieItem);
/* 1081 */     OreDictionary.registerOre("foodChikoroll", ItemRegistry.chikorollItem);
/* 1082 */     OreDictionary.registerOre("foodDamper", ItemRegistry.damperItem);
/* 1083 */     OreDictionary.registerOre("foodBeetburger", ItemRegistry.beetburgerItem);
/* 1084 */     OreDictionary.registerOre("foodPavlova", ItemRegistry.pavlovaItem);
/* 1085 */     OreDictionary.registerOre("foodGherkin", ItemRegistry.gherkinItem);
/* 1086 */     OreDictionary.registerOre("foodMcpam", ItemRegistry.mcpamItem);
/*      */     
/* 1088 */     OreDictionary.registerOre("foodCeasarsalad", ItemRegistry.ceasarsaladItem);
/* 1089 */     OreDictionary.registerOre("foodChaoscookie", ItemRegistry.chaoscookieItem);
/* 1090 */     OreDictionary.registerOre("foodChocolatecookie", ItemRegistry.chocolatebaconItem);
/* 1091 */     OreDictionary.registerOre("foodLambkebab", ItemRegistry.lambkebabItem);
/* 1092 */     OreDictionary.registerOre("foodNutella", ItemRegistry.nutellaItem);
/* 1093 */     OreDictionary.registerOre("foodSnickersbar", ItemRegistry.snickersbarItem);
/* 1094 */     OreDictionary.registerOre("foodSpinachpie", ItemRegistry.spinachpieItem);
/* 1095 */     OreDictionary.registerOre("foodSteamedspinach", ItemRegistry.steamedspinachItem);
/* 1096 */     OreDictionary.registerOre("foodVegemiteontoast", ItemRegistry.vegemiteontoastItem);
/*      */     
/* 1098 */     OreDictionary.registerOre("foodSalmonraw", new ItemStack(Items.fish, 1, 1));
/* 1099 */     OreDictionary.registerOre("foodAnchovyraw", ItemRegistry.anchovyrawItem);
/* 1100 */     OreDictionary.registerOre("foodBassraw", ItemRegistry.bassrawItem);
/* 1101 */     OreDictionary.registerOre("foodCarpraw", ItemRegistry.carprawItem);
/* 1102 */     OreDictionary.registerOre("foodCatfishraw", ItemRegistry.catfishrawItem);
/* 1103 */     OreDictionary.registerOre("foodCharrraw", ItemRegistry.charrrawItem);
/* 1104 */     OreDictionary.registerOre("foodClamraw", ItemRegistry.clamrawItem);
/* 1105 */     OreDictionary.registerOre("foodCrabraw", ItemRegistry.crabrawItem);
/* 1106 */     OreDictionary.registerOre("foodCrayfishraw", ItemRegistry.crayfishrawItem);
/* 1107 */     OreDictionary.registerOre("foodEelraw", ItemRegistry.eelrawItem);
/* 1108 */     OreDictionary.registerOre("foodFrograw", ItemRegistry.frograwItem);
/* 1109 */     OreDictionary.registerOre("foodGrouperraw", ItemRegistry.grouperrawItem);
/* 1110 */     OreDictionary.registerOre("foodHerringraw", ItemRegistry.herringrawItem);
/* 1111 */     OreDictionary.registerOre("foodJellyfishraw", ItemRegistry.jellyfishrawItem);
/* 1112 */     OreDictionary.registerOre("foodMudfishraw", ItemRegistry.mudfishrawItem);
/* 1113 */     OreDictionary.registerOre("foodOctopusraw", ItemRegistry.octopusrawItem);
/* 1114 */     OreDictionary.registerOre("foodPerchraw", ItemRegistry.perchrawItem);
/* 1115 */     OreDictionary.registerOre("foodScallopraw", ItemRegistry.scalloprawItem);
/* 1116 */     OreDictionary.registerOre("foodShrimpraw", ItemRegistry.shrimprawItem);
/* 1117 */     OreDictionary.registerOre("foodSnailraw", ItemRegistry.snailrawItem);
/* 1118 */     OreDictionary.registerOre("foodSnapperraw", ItemRegistry.snapperrawItem);
/* 1119 */     OreDictionary.registerOre("foodTilapiaraw", ItemRegistry.tilapiarawItem);
/* 1120 */     OreDictionary.registerOre("foodTroutraw", ItemRegistry.troutrawItem);
/* 1121 */     OreDictionary.registerOre("foodTunaraw", ItemRegistry.tunarawItem);
/* 1122 */     OreDictionary.registerOre("foodTurtleraw", ItemRegistry.turtlerawItem);
/* 1123 */     OreDictionary.registerOre("foodWalleyraw", ItemRegistry.walleyerawItem);
/*      */     
/*      */ 
/* 1126 */     OreDictionary.registerOre("foodHolidaycake", ItemRegistry.holidaycakeItem);
/*      */     
/* 1128 */     OreDictionary.registerOre("foodClamcooked", ItemRegistry.clamcookedItem);
/* 1129 */     OreDictionary.registerOre("foodCrabcooked", ItemRegistry.crabcookedItem);
/* 1130 */     OreDictionary.registerOre("foodCrayfishcooked", ItemRegistry.crayfishcookedItem);
/* 1131 */     OreDictionary.registerOre("foodFrogcooked", ItemRegistry.frogcookedItem);
/* 1132 */     OreDictionary.registerOre("foodOctopuscooked", ItemRegistry.octopuscookedItem);
/* 1133 */     OreDictionary.registerOre("foodScallopcooked", ItemRegistry.scallopcookedItem);
/* 1134 */     OreDictionary.registerOre("foodShrimpcooked", ItemRegistry.shrimpcookedItem);
/* 1135 */     OreDictionary.registerOre("foodSnailcooked", ItemRegistry.snailcookedItem);
/* 1136 */     OreDictionary.registerOre("foodTurtlecooked", ItemRegistry.turtlecookedItem);
/*      */     
/* 1138 */     OreDictionary.registerOre("foodApplecider", ItemRegistry.appleciderItem);
/* 1139 */     OreDictionary.registerOre("foodBangersandmash", ItemRegistry.bangersandmashItem);
/* 1140 */     OreDictionary.registerOre("foodBatteredsausage", ItemRegistry.batteredsausageItem);
/* 1141 */     OreDictionary.registerOre("foodBatter", ItemRegistry.batterItem);
/* 1142 */     OreDictionary.registerOre("foodchorizo", ItemRegistry.chorizoItem);
/* 1143 */     OreDictionary.registerOre("foodColeslaw", ItemRegistry.coleslawItem);
/* 1144 */     OreDictionary.registerOre("foodEnergydrink", ItemRegistry.energydrinkItem);
/* 1145 */     OreDictionary.registerOre("foodFriedonions", ItemRegistry.friedonionsItem);
/* 1146 */     OreDictionary.registerOre("foodMeatfeastpizza", ItemRegistry.meatfeastpizzaItem);
/* 1147 */     OreDictionary.registerOre("foodMincepie", ItemRegistry.mincepieItem);
/* 1148 */     OreDictionary.registerOre("foodOnionhamburger", ItemRegistry.onionhamburgerItem);
/* 1149 */     OreDictionary.registerOre("foodPepperoni", ItemRegistry.pepperoniItem);
/* 1150 */     OreDictionary.registerOre("foodPickledonions", ItemRegistry.pickledonionsItem);
/* 1151 */     OreDictionary.registerOre("foodPorksausage", ItemRegistry.porksausageItem);
/* 1152 */     OreDictionary.registerOre("foodRaspberrytrifle", ItemRegistry.raspberrytrifleItem);
/*      */     
/* 1154 */     OreDictionary.registerOre("foodTurkeyraw", ItemRegistry.turkeyrawItem);
/* 1155 */     OreDictionary.registerOre("foodTurkeycooked", ItemRegistry.turkeycookedItem);
/* 1156 */     OreDictionary.registerOre("foodRabbitraw", Items.rabbit);
/* 1157 */     OreDictionary.registerOre("foodRabbitcooked", Items.cooked_rabbit);
/* 1156 */     //OreDictionary.registerOre("foodRabbitraw", ItemRegistry.rabbitrawItem);
/* 1157 */     //OreDictionary.registerOre("foodRabbitcooked", ItemRegistry.rabbitcookedItem);
/* 1158 */     OreDictionary.registerOre("foodVenisonraw", ItemRegistry.venisonrawItem);
/* 1159 */     OreDictionary.registerOre("foodVenisoncooked", ItemRegistry.venisoncookedItem);
/*      */     
/* 1161 */     OreDictionary.registerOre("foodStrawberrymilkshake", ItemRegistry.strawberrymilkshakeItem);
/* 1162 */     OreDictionary.registerOre("foodChocolatemilkshake", ItemRegistry.chocolatemilkshakeItem);
/* 1163 */     OreDictionary.registerOre("foodBananamilkshake", ItemRegistry.bananamilkshakeItem);
/* 1164 */     OreDictionary.registerOre("foodCornflakes", ItemRegistry.cornflakesItem);
/* 1165 */     OreDictionary.registerOre("foodColeslawburger", ItemRegistry.coleslawburgerItem);
/* 1166 */     OreDictionary.registerOre("foodRoastchicken", ItemRegistry.roastchickenItem);
/* 1167 */     OreDictionary.registerOre("foodRoastpotatoes", ItemRegistry.roastpotatoesItem);
/* 1168 */     OreDictionary.registerOre("foodSundayroast", ItemRegistry.sundayroastItem);
/* 1169 */     OreDictionary.registerOre("foodBbqpulledpork", ItemRegistry.bbqpulledporkItem);
/* 1170 */     OreDictionary.registerOre("foodLambwithmintsauce", ItemRegistry.lambwithmintsauceItem);
/* 1171 */     OreDictionary.registerOre("foodSteakandchips", ItemRegistry.steakandchipsItem);
/*      */     
/* 1173 */     OreDictionary.registerOre("foodCherryicecream", ItemRegistry.cherryicecreamItem);
/* 1174 */     OreDictionary.registerOre("foodPistachioicecream", ItemRegistry.pistachioicecreamItem);
/* 1175 */     OreDictionary.registerOre("foodNeapolitanicecream", ItemRegistry.neapolitanicecreamItem);
/* 1176 */     OreDictionary.registerOre("foodSpumoniicecream", ItemRegistry.spumoniicecreamItem);
/*      */     
/* 1178 */     OreDictionary.registerOre("foodAlmondbutter", ItemRegistry.almondbutterItem);
/* 1179 */     OreDictionary.registerOre("foodCashewbutter", ItemRegistry.cashewbutterItem);
/* 1180 */     OreDictionary.registerOre("foodChestnutbutter", ItemRegistry.chestnutbutterItem);
/* 1181 */     OreDictionary.registerOre("foodCornishpasty", ItemRegistry.cornishpastyItem);
/* 1182 */     OreDictionary.registerOre("foodCottagepie", ItemRegistry.cottagepieItem);
/* 1183 */     OreDictionary.registerOre("foodCroissant", ItemRegistry.croissantItem);
/* 1184 */     OreDictionary.registerOre("foodCurrypowder", ItemRegistry.currypowderItem);
/* 1185 */     OreDictionary.registerOre("listAllspice", ItemRegistry.currypowderItem);
/* 1186 */     OreDictionary.registerOre("foodDimsum", ItemRegistry.dimsumItem);
/* 1187 */     OreDictionary.registerOre("foodFriedpecanokra", ItemRegistry.friedpecanokraItem);
/* 1188 */     OreDictionary.registerOre("foodGooseberryjelly", ItemRegistry.gooseberryjellyItem);
/* 1189 */     OreDictionary.registerOre("foodGooseberryjellysandwich", ItemRegistry.gooseberryjellysandwichItem);
/* 1190 */     OreDictionary.registerOre("foodGooseberrymilkeshake", ItemRegistry.gooseberrymilkshakeItem);
/* 1191 */     OreDictionary.registerOre("foodGooseberrypie", ItemRegistry.gooseberrypieItem);
/* 1192 */     OreDictionary.registerOre("foodGooseberrysmoothie", ItemRegistry.gooseberrysmoothieItem);
/* 1193 */     OreDictionary.registerOre("listAllsmoothie", ItemRegistry.gooseberrysmoothieItem);
/* 1194 */     OreDictionary.registerOre("foodGooseberryyogurt", ItemRegistry.gooseberryyogurtItem);
/* 1195 */     OreDictionary.registerOre("foodGreenheartfish", ItemRegistry.greenheartfishItem);
/* 1196 */     OreDictionary.registerOre("foodHamsweetpicklesandwich", ItemRegistry.hamsweetpicklesandwichItem);
/* 1197 */     OreDictionary.registerOre("foodHushpuppies", ItemRegistry.hushpuppiesItem);
/* 1198 */     OreDictionary.registerOre("foodKimchi", ItemRegistry.kimchiItem);
/* 1199 */     OreDictionary.registerOre("foodMochi", ItemRegistry.mochiItem);
/* 1200 */     OreDictionary.registerOre("foodMuseli", ItemRegistry.museliItem);
/* 1201 */     OreDictionary.registerOre("foodNaan", ItemRegistry.naanItem);
/* 1202 */     OreDictionary.registerOre("foodOkrachips", ItemRegistry.okrachipsItem);
/* 1203 */     OreDictionary.registerOre("foodOkracreole", ItemRegistry.okracreoleItem);
/* 1204 */     OreDictionary.registerOre("foodPistachiobutter", ItemRegistry.pistachiobutterItem);
/* 1205 */     OreDictionary.registerOre("foodPloughmanslunch", ItemRegistry.ploughmanslunchItem);
/* 1206 */     OreDictionary.registerOre("foodPorklomein", ItemRegistry.porklomeinItem);
/* 1207 */     OreDictionary.registerOre("foodSalmonpatties", ItemRegistry.salmonpattiesItem);
/* 1208 */     OreDictionary.registerOre("foodSausage", ItemRegistry.sausageItem);
/* 1209 */     OreDictionary.registerOre("foodSausageroll", ItemRegistry.sausagerollItem);
/* 1210 */     OreDictionary.registerOre("foodSesameball", ItemRegistry.sesameballItem);
/* 1211 */     OreDictionary.registerOre("foodSesamesnaps", ItemRegistry.sesamesnapsItem);
/* 1212 */     OreDictionary.registerOre("foodShrimpokrahushpuppies", ItemRegistry.shrimpokrahushpuppiesItem);
/* 1213 */     OreDictionary.registerOre("foodSoysauce", ItemRegistry.soysauceItem);
/* 1214 */     OreDictionary.registerOre("foodSweetpickle", ItemRegistry.sweetpickleItem);
/* 1215 */     OreDictionary.registerOre("foodVeggiestrips", ItemRegistry.veggiestripsItem);
/* 1216 */     OreDictionary.registerOre("foodVindaloo", ItemRegistry.vindalooItem);
/*      */     
/* 1218 */     OreDictionary.registerOre("listAllnutbutter", ItemRegistry.almondbutterItem);
/* 1219 */     OreDictionary.registerOre("listAllnutbutter", ItemRegistry.cashewbutterItem);
/* 1220 */     OreDictionary.registerOre("listAllnutbutter", ItemRegistry.chestnutbutterItem);
/* 1221 */     OreDictionary.registerOre("listAllnutbutter", ItemRegistry.pistachiobutterItem);

OreDictionary.registerOre("foodApplesmoothie", ItemRegistry.applesmoothieItem);
OreDictionary.registerOre("foodCheeseontoast", ItemRegistry.cheeseontoastItem);
OreDictionary.registerOre("foodChocolateroll", ItemRegistry.chocolaterollItem);
OreDictionary.registerOre("foodCoconutcream", ItemRegistry.coconutcreamItem);
OreDictionary.registerOre("foodCoconutsmoothie", ItemRegistry.coconutsmoothieItem);
OreDictionary.registerOre("foodCracker", ItemRegistry.crackerItem);
OreDictionary.registerOre("foodCranberrysmoothie", ItemRegistry.cranberrysmoothieItem);
OreDictionary.registerOre("foodCranberryyogurt", ItemRegistry.cranberryyogurtItem);
OreDictionary.registerOre("foodDeluxechickencurry", ItemRegistry.deluxechickencurryItem);
OreDictionary.registerOre("foodGarammasala", ItemRegistry.garammasalaItem);
OreDictionary.registerOre("foodGrapesmoothie", ItemRegistry.grapesmoothieItem);
OreDictionary.registerOre("foodGravy", ItemRegistry.gravyItem);
OreDictionary.registerOre("foodHoneysandwich", ItemRegistry.honeysandwichItem);
OreDictionary.registerOre("foodJamroll", ItemRegistry.jamrollItem);
OreDictionary.registerOre("foodMangochutney", ItemRegistry.mangochutneyItem);
OreDictionary.registerOre("foodMarzipan", ItemRegistry.marzipanItem);
OreDictionary.registerOre("foodPaneer", ItemRegistry.paneerItem);
OreDictionary.registerOre("foodPaneertikkamasala", ItemRegistry.paneertikkamasalaItem);
OreDictionary.registerOre("foodPeaandhamsoup", ItemRegistry.peaandhamsoupItem);
OreDictionary.registerOre("foodPearjelly", ItemRegistry.pearjellyItem);
OreDictionary.registerOre("foodPearjellysandwich", ItemRegistry.pearjellysandwichItem);
OreDictionary.registerOre("foodPearsmoothie", ItemRegistry.pearsmoothieItem);
OreDictionary.registerOre("foodPlumjelly", ItemRegistry.plumjellyItem);
OreDictionary.registerOre("foodPlumjellysandwich", ItemRegistry.plumjellysandwichItem);
OreDictionary.registerOre("foodPlumsmoothie", ItemRegistry.plumsmoothieItem);
OreDictionary.registerOre("foodPotatoandleeksoup", ItemRegistry.potatoandleeksoupItem);
OreDictionary.registerOre("foodToadinthehole", ItemRegistry.toadintheholeItem);
OreDictionary.registerOre("foodTunapotato", ItemRegistry.tunapotatoItem);
OreDictionary.registerOre("foodYorkshirepudding", ItemRegistry.yorkshirepuddingItem);


/*      */   }
/*      */ }


/* Location:              C:\Users\Modding\Desktop\Pam's HarvestCraft 1.7.10k.deobf.jar!\com\pam\HarvestCraft\PamFoodOreDictionaryRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */