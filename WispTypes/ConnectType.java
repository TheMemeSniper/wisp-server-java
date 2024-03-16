package WispTypes;

public enum ConnectType {
    CONNECT(1),
    DATA(2),
    CONTINUE(3),
    CLOSE(4);

    private byte type;

    ConnectType(int inttype){
        this.type = (byte)inttype;
    }

    public byte getType(){
        return type;
    }

    public static int fromEnum(ConnectType x) {
        switch(x) {
            case CONNECT:
                return 1;
            case DATA:
                return 2;
            case CONTINUE:
                return 3;
            case CLOSE:
                return 4;
            }
            return 0;
    }

    public static ConnectType fromByte(byte x) {
        switch(x) {
        case 1:
            return CONNECT;
        case 2:
            return DATA;
        case 3:
            return CONTINUE;
        case 4:
            return CLOSE;
        }
        return null;
    }
}
