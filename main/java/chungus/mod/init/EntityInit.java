package chungus.mod.init;

import chungus.mod.Main;
import chungus.mod.entity.EntityChungus;
import chungus.mod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraft.util.ResourceLocation;

public class EntityInit {
	
	public static void registerEntities() {
		registerentity("Big Chungus", EntityChungus.class, Reference.ENTITY_CHUNGUS, 50, 5000273, 14208719);
	}
	
	private static void registerentity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance , range, 1, true, color1, color2);
	}
}
