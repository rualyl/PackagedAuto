package thelm.packagedauto.network.packet;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import thelm.packagedauto.container.ContainerEncoder;
import thelm.packagedauto.network.ISelfHandleMessage;

public class PacketSaveRecipeList implements ISelfHandleMessage<IMessage> {

	public PacketSaveRecipeList() {}

	@Override
	public void toBytes(ByteBuf buf) {}

	@Override
	public void fromBytes(ByteBuf buf) {}

	@Override
	public IMessage onMessage(MessageContext ctx) {
		EntityPlayerMP player = ctx.getServerHandler().player;
		WorldServer world = player.getServerWorld();
		world.addScheduledTask(()->{
			if(player.openContainer instanceof ContainerEncoder) {
				ContainerEncoder container = (ContainerEncoder)player.openContainer;
				container.tile.saveRecipeList();
			}
		});
		return null;
	}
}
