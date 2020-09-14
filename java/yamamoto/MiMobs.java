package yamamoto;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid = "MiMobs", name = "MiMobs", version = "beta1.0")
public class MiMobs {

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	}

	@EventHandler
	public void preInit(FMLInitializationEvent event) {
		GameRegistry.addRecipe(new ItemStack(Items.diamond),
				"XXX",
				"XYY",
				"XYY",
				'X', Blocks.cobblestone,
				'Y', Blocks.dirt
				);
	}

	@EventHandler
	public void preInit(FMLPostInitializationEvent event) {

	}

}
