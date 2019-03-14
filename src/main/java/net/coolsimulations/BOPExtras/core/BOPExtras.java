package net.coolsimulations.BOPExtras.core;

import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = BOPExtras.MOD_ID)
public class BOPExtras {
	
	public static final String MOD_ID = "biomesoplentyextras";
	
    public static BOPExtras instance;
    public static CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);
	
	public BOPExtras() {
		
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::loadComplete);
		ExtrasBlocks.init();
		ExtrasItems.init();
	}
	
	private void loadComplete(final FMLLoadCompleteEvent event) // PostRegistrationEven
    {
        proxy.init();
    }

}
