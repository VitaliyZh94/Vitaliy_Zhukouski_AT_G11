package homework.day3.basetask;

public class TrainMethodsReturn {

    public int returnNewInt(int num) {
        return num * 3;
    }

    public long returnNewLong(long num) {
        return num - 4;
    }

    public String returnNewChar(char symbol) {
        return "" + symbol + symbol;
    }

    public float returnNewFloat(float num) {
        return num / 2;
    }

    public double returnNewDouble(double num) {
        return num + 8;
    }

    public short returnNewShort(short num) {
        return (short) (num - 1);
    }

    public byte returnNewByte(byte num) {
        return (byte) (num * 2);
    }

    public boolean returnNewBoolean(boolean bool) {
        return !bool;
    }
}

