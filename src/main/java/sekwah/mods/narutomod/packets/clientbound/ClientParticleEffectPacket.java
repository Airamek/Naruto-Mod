package sekwah.mods.narutomod.packets.clientbound;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import sekwah.mods.narutomod.packets.ClientPacketHandler;
import sekwah.mods.narutomod.packets.NarutoMessage;

public class ClientParticleEffectPacket extends NarutoMessage implements IMessageHandler<ClientParticleEffectPacket, IMessage> {
    public ClientParticleEffectPacket(byte[] payload) {
        this.packet = payload;
        this.packetLength = payload.length;
    }

    public ClientParticleEffectPacket() {
    }

    public IMessage onMessage(ClientParticleEffectPacket message, MessageContext ctx) {
        ClientPacketHandler.handleParticleEffect(message.packet);
        return null;
    }
}