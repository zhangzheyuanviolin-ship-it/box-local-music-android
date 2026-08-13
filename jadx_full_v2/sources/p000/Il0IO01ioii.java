            package p000;

            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            import java.util.Arrays;
            
            public final class Il0IO01ioii implements I0OIilIIo0 {
                public I0OillIOOOIl I00000oIO;
                public O1O1I111l I00000oOI;
                public int I0000Il00O;

                @Override
                public final byte[] I00000oIO(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             I0OillIOOOIl i0OillIOOOIl = this.I00000oIO;
/* 3 */             i0OillIOOOIl.getClass();
/* 6 */             int length = bArr.length;
/* 7 */             int i = i0OillIOOOIl.I00000oOI;
/* 12 */            int i2 = Integer.MAX_VALUE - i;
/* 13 */            if (length > i2) {
/* 551 */               throw new GeneralSecurityException(Oi010OO0.I000oI1ioi(i2, "plaintext length can not exceed "));
                    }
/* 17 */            byte[] bArr3 = new byte[bArr.length + i];
/* 19 */            byte[] bArrI00000oIO = OOl1iO0l.I00000oIO(i);
/* 24 */            System.arraycopy(bArrI00000oIO, 0, bArr3, 0, i);
/* 33 */            i0OillIOOOIl.I00000oIO(bArr, 0, bArr.length, bArr3, i0OillIOOOIl.I00000oOI, bArrI00000oIO, true);
/* 36 */            if (bArr2 == null) {
/* 38 */                bArr2 = new byte[0];
                    }
/* 81 */            return iOiiIOilI1.I00000oIO(bArr3, this.I00000oOI.I00000oOI(iOiiIOilI1.I00000oIO(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
                }

                @Override
                public final byte[] I00000oOI(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             int length = bArr.length;
/* 2 */             int i = this.I0000Il00O;
/* 7 */             if (length < i) {
/* 97 */                IioIoO10iOiI.I000oI1ioi("ciphertext too short");
/* 4 */                 return null;
                    }
/* 12 */            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
/* 19 */            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
/* 23 */            if (bArr2 == null) {
/* 25 */                bArr2 = new byte[0];
                    }
/* 60 */            this.I00000oOI.I00000oIO(bArrCopyOfRange2, iOiiIOilI1.I00000oIO(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
/* 63 */            I0OillIOOOIl i0OillIOOOIl = this.I00000oIO;
/* 65 */            i0OillIOOOIl.getClass();
/* 68 */            int length2 = bArrCopyOfRange.length;
/* 69 */            int i2 = i0OillIOOOIl.I00000oOI;
/* 71 */            if (length2 < i2) {
/* 93 */                IioIoO10iOiI.I000oI1ioi("ciphertext too short");
/* 4 */                 return null;
                    }
/* 73 */            byte[] bArr3 = new byte[i2];
/* 75 */            System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i2);
/* 78 */            int length3 = bArrCopyOfRange.length;
/* 79 */            int i3 = i0OillIOOOIl.I00000oOI;
/* 82 */            byte[] bArr4 = new byte[length3 - i3];
/* 89 */            i0OillIOOOIl.I00000oIO(bArrCopyOfRange, i3, bArrCopyOfRange.length - i3, bArr4, 0, bArr3, false);
/* 92 */            return bArr4;
                }
            }
