package chungus.mod.entity.render;

import chungus.mod.entity.EntityChungus;
import chungus.mod.entity.model.ModelChungus;
import chungus.mod.util.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChungus extends RenderLiving<EntityChungus>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/chungus.png");
	
	public RenderChungus(RenderManager manager) {
		super(manager, new ModelChungus(), 0.5F);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityChungus entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityChungus entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}
