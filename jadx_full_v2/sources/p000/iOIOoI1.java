            package p000;
            
            public abstract class iOIOoI1 {
                public static byte[] I00000oIO(byte[] bArr) {
/* 4 */             if (bArr.length != 16) {
/* 57 */                I000II.I000iOII("value must be a block.");
/* 60 */                return null;
                    }
/* 6 */             byte[] bArr2 = new byte[16];
/* 12 */            for (int i = 0; i < 16; i++) {
/* 20 */                byte b = (byte) ((bArr[i] << 1) & 254);
/* 21 */                bArr2[i] = b;
/* 23 */                if (i < 15) {
/* 36 */                    bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
                        }
                    }
/* 52 */            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
/* 54 */            return bArr2;
                }
            }
