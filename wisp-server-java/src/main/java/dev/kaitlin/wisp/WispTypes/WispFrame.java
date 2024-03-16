package dev.kaitlin.wisp.WispTypes;

public class WispFrame {
    public ConnectType type;
    public int streamID;
    public byte[] payload; // This might cause problems later! I have no clue how to use the byte data type because my CS teacher won't get off loops!

    public WispFrame(ConnectType type2, byte streamID2, byte[] payload2) { // There is probably an infinitely better way to do this, but I wouldn't know because my CS teacher won't get off loops!
        this.type = type2;
        this.streamID = streamID2;
        this.payload = payload2;
    }
}