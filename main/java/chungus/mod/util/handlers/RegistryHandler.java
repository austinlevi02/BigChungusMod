package chungus.mod.util.handlers;

import chungus.mod.Main;
import chungus.mod.init.EntityInit;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;



@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		//not sure if ill need this yet
	}
	
	public static void preInitRegistries() {
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	
	
}
