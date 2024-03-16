package dev.kaitlin.wisp.WispPackets;

import dev.kaitlin.wisp.WispTypes.*;

public class DataPacketMaker {
    public static byte[] main(WispFrame wispFrame, byte[] data){
        byte[] initalPacket = new byte[5];
        initalPacket[0] = (byte) ConnectType.fromEnum(ConnectType.DATA);
        initalPacket[1] = (byte) wispFrame.streamID;

        byte[] finalPacket = new byte[initalPacket.length + data.length];

        System.arraycopy(initalPacket, 0, finalPacket, 0, initalPacket.length);
        System.arraycopy(data, 0, finalPacket, 0, data.length);

        return finalPacket;
    }
}
