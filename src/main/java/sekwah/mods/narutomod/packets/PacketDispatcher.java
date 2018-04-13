package sekwah.mods.narutomod.packets;

import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraft.entity.player.EntityPlayerMP;
import sekwah.mods.narutomod.NarutoMod;

public class PacketDispatcher {

    public static void sendPacketToServer(NarutoMessage message) {
        NarutoMod.packetNetwork.sendToServer(message);
    }

    public static void sendPacketToPlayer(NarutoMessage message, EntityPlayerMP player) {
        NarutoMod.packetNetwork.sendTo(message, player);
    }

    public static void sendPacketToAll(NarutoMessage message) {
        NarutoMod.packetNetwork.sendToAll(message);
    }

    public static void sendPacketToAllAround(NarutoMessage message, TargetPoint point) {
        NarutoMod.packetNetwork.sendToAllAround(message, point);
    }

}
