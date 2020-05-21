package chungus.mod.util.handlers;

import chungus.mod.entity.EntityChungus;
import chungus.mod.entity.render.RenderChungus;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenders() {
		
		RenderingRegistry.registerEntityRenderingHandler(EntityChungus.class, new IRenderFactory<EntityChungus>()
		{
			@Override
			public Render<? super EntityChungus> createRenderFor(RenderManager manager){
				return new RenderChungus(manager);
			}	
		});	
	}
}
