package WispTypes;

public class ConnectPacket {
    public byte[] payload;
    public byte port;
    public StreamType type;
    public String hostname;

    public ConnectPacket(byte[] payload2, byte port2, StreamType type2, String hostname2) {
        this.payload = payload2;
        this.port = port2;
        this.type = type2;
        this.hostname = hostname2;
    }
}
