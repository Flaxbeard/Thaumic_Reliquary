package flaxbeard.thaumicreliquary;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class TREventHandler {
	@ForgeSubscribe
	public void handlePlayerSpawns(EntityJoinWorldEvent event) {
		if (event.entity instanceof EntityPlayer && !event.entity.worldObj.isRemote) {
			TRPacketHandler.sendOptionalPacket((EntityPlayer) event.entity);
			//Thaumcraft.proxy.researchManager.completeResearch((EntityPlayer) event.entity, "TRELIQUARY");
		}
	}
	
}
