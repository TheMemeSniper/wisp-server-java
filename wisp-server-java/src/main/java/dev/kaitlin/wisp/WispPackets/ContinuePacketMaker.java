package dev.kaitlin.wisp.WispPackets;

import dev.kaitlin.wisp.WispTypes.*;

public class ContinuePacketMaker {
    public static byte[] main(WispFrame wispFrame, int queue){
        byte[] initalPacket = new byte[9];
        initalPacket[0] = (byte) ConnectType.fromEnum(ConnectType.CONTINUE);
        initalPacket[1] = (byte) wispFrame.streamID;
        initalPacket[5] = (byte) queue;
        return initalPacket;
    }
}
