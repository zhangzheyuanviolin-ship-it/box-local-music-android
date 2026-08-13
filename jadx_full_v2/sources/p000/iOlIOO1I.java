            package p000;

            import java.nio.ByteBuffer;
            import java.nio.CharBuffer;
            import java.nio.charset.CharacterCodingException;
            import java.nio.charset.CharsetEncoder;
            
            public abstract class iOlIOO1I {
                public static final byte[] I00000oIO(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2) throws CharacterCodingException {
/* 3 */             if (charSequence instanceof String) {
/* 5 */                 if (i == 0) {
/* 8 */                     String str = (String) charSequence;
/* 14 */                    if (i2 == str.length()) {
/* 20 */                        return str.getBytes(charsetEncoder.charset());
                            }
                        }
/* 35 */                return ((String) charSequence).substring(i, i2).getBytes(charsetEncoder.charset());
                    }
/* 44 */            ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i, i2));
/* 52 */            byte[] bArr = null;
/* 53 */            if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
/* 61 */                byte[] bArrArray = byteBufferEncode.array();
/* 70 */                if (bArrArray.length == byteBufferEncode.remaining()) {
/* 72 */                    bArr = bArrArray;
                        }
                    }
/* 73 */            if (bArr != null) {
/* 483 */               return bArr;
                    }
/* 79 */            byte[] bArr2 = new byte[byteBufferEncode.remaining()];
/* 81 */            byteBufferEncode.get(bArr2);
/* 84 */            return bArr2;
                }
            }
