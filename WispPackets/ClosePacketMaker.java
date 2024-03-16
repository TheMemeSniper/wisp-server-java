package WispPackets;

import WispTypes.ConnectType;
import WispTypes.WispFrame;

public class ClosePacketMaker {
        public static byte[] main(WispFrame wispFrame, int reason){
        byte[] initalPacket = new byte[9];
        initalPacket[0] = (byte) ConnectType.fromEnum(ConnectType.CLOSE);
        initalPacket[1] = (byte) wispFrame.streamID;
        initalPacket[5] = (byte) reason;
        return initalPacket;
    }
}
