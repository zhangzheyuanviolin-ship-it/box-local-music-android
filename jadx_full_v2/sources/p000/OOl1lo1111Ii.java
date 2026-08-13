            package p000;

            import android.util.Base64;
            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import java.util.UUID;
            
            public final class OOl1lo1111Ii {
                public static final byte I00000oIO = Byte.parseByte("01110000", 2);
                public static final byte I00000oOI = Byte.parseByte("00001111", 2);

                public static String I00000oIO() {
/* 1 */             UUID uuidRandomUUID = UUID.randomUUID();
/* 9 */             ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
/* 17 */            byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
/* 24 */            byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
/* 27 */            byte[] bArrArray = byteBufferWrap.array();
/* 32 */            byte b = bArrArray[0];
/* 36 */            bArrArray[16] = b;
/* 45 */            bArrArray[0] = (byte) ((b & I00000oOI) | I00000oIO);
/* 64 */            return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
                }
            }
