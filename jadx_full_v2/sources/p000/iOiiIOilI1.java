            package p000;

            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            
            public abstract class iOiiIOilI1 {
                public static byte[] I00000oIO(byte[]... bArr) throws GeneralSecurityException {
/* 4 */             int length = 0;
/* 5 */             for (byte[] bArr2 : bArr) {
/* 14 */                if (length > Integer.MAX_VALUE - bArr2.length) {
/* 23 */                    IioIoO10iOiI.I000oI1ioi("exceeded size limit");
/* 26 */                    return null;
                        }
/* 17 */                length += bArr2.length;
                    }
/* 28 */            byte[] bArr3 = new byte[length];
/* 32 */            int length2 = 0;
/* 33 */            for (byte[] bArr4 : bArr) {
/* 38 */                System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
/* 42 */                length2 += bArr4.length;
                    }
/* 49 */            return bArr3;
                }

                public static final void I00000oOI(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
/* 1 */             if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
/* 43 */                I000II.I000iOII("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
/* 483 */               return;
                    }
/* 22 */            for (int i2 = 0; i2 < i; i2++) {
/* 34 */                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
                    }
                }

                public static final byte[] I0000Il00O(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
/* 1 */             if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
/* 34 */                I000II.I000iOII("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
/* 37 */                return null;
                    }
/* 11 */            byte[] bArr3 = new byte[i3];
/* 14 */            for (int i4 = 0; i4 < i3; i4++) {
/* 26 */                bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
                    }
/* 31 */            return bArr3;
                }

                public static final byte[] I0000O(byte[] bArr, byte[] bArr2) {
/* 3 */             if (bArr.length == bArr2.length) {
/* 7 */                 return I0000Il00O(bArr, 0, bArr2, 0, bArr.length);
                    }
/* 14 */            I000II.I000iOII("The lengths of x and y should match.");
/* 17 */            return null;
                }
            }
