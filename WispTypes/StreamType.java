package WispTypes;

public enum StreamType {
    TCP(1),
    UDP(2);

    private byte type;

    StreamType(int inttype){
        this.type = (byte)inttype;
    }

    public byte getType(){
        return type;
    }

    public static StreamType fromByte(byte x) {
        switch(x) {
        case 1:
            return TCP;
        case 2:
            return UDP;
        }
        return null;
    }
}