package WispPackets;

import java.util.Arrays;

import WispTypes.*;


public class WispFrameParser {
    public static WispFrame main(byte[] data) {
        final ConnectType type = ConnectType.fromByte(data[0]);
        var streamID = data[1];
        var payload = Arrays.copyOfRange(data, 5, data.length);
        return new WispFrame(
            type,
            streamID,
            payload

        );
    }

}