package chungus.mod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityChungus extends EntityRabbit {

	public EntityChungus(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public EntityRabbit createChild(EntityAgeable ageable) {
		return new EntityChungus(world);
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		return super.getAmbientSound();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return super.getHurtSound(source);
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return super.getDeathSound();
	}
	
	
}
