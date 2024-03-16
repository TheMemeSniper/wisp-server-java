package dev.kaitlin.wisp.WispPackets;

import java.util.Arrays;

import dev.kaitlin.wisp.WispTypes.*;


public class WispFrameParser {
    public static WispFrame main(byte[] data) {
        final ConnectType type = ConnectType.fromByte(data[0]);
        byte streamID = data[1];
        byte[] payload = Arrays.copyOfRange(data, 5, data.length);
        return new WispFrame(
            type,
            streamID,
            payload

        );
    }

}