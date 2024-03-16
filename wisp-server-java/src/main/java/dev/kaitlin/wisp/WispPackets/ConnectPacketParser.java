package dev.kaitlin.wisp.WispPackets;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import dev.kaitlin.wisp.WispTypes.*;

public class ConnectPacketParser {
    public static ConnectPacket main(byte[] payload) {
        final StreamType type = StreamType.fromByte(payload[0]);
        final byte port = payload[1];
        final byte[] byteHostname = Arrays.copyOfRange(payload, 3, payload.length);
        final String hostname = new String(byteHostname, StandardCharsets.UTF_8);
        return new ConnectPacket(payload, port, type, hostname);
    }
}
