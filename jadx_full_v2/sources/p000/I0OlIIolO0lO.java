            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Arrays;
            import javax.crypto.AEADBadTagException;
            import javax.crypto.BadPaddingException;
            import javax.crypto.Cipher;
            import javax.crypto.IllegalBlockSizeException;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            
            public final class I0OlIIolO0lO implements I0OIilIIo0 {
                public static final I0OiiiO I0000oI00 = new I0OiiiO(1);
                public static final I0OiiiO I0001Ioi1lo = new I0OiiiO(2);
                public byte[] I00000oIO;
                public byte[] I00000oOI;
                public SecretKeySpec I0000Il00O;
                public int I0000O;

                public static byte[] I0000Il00O(byte[] bArr) {
/* 3 */             byte[] bArr2 = new byte[16];
/* 6 */             int i = 0;
/* 9 */             while (i < 15) {
/* 15 */                int i2 = i + 1;
/* 27 */                bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7)) & 255);
/* 29 */                i = i2;
                    }
/* 43 */            bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
/* 49 */            return bArr2;
                }

                public static byte[] I0000oI00(byte[] bArr, byte[] bArr2) {
/* 1 */             int length = bArr.length;
/* 2 */             byte[] bArr3 = new byte[length];
/* 5 */             for (int i = 0; i < length; i++) {
/* 13 */                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
                    }
/* 89 */            return bArr3;
                }

                @Override
                public final byte[] I00000oIO(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 5 */             SecretKeySpec secretKeySpec = this.I0000Il00O;
/* 7 */             int length = bArr.length;
/* 8 */             int i = this.I0000O;
/* 14 */            if (length > 2147483631 - i) {
/* 130 */               IioIoO10iOiI.I000oI1ioi("plaintext too long");
/* 133 */               return null;
                    }
/* 21 */            byte[] bArr3 = new byte[bArr.length + i + 16];
/* 23 */            byte[] bArrI00000oIO = OOl1iO0l.I00000oIO(i);
/* 28 */            System.arraycopy(bArrI00000oIO, 0, bArr3, 0, i);
/* 37 */            Cipher cipher = (Cipher) I0000oI00.get();
/* 40 */            cipher.init(1, secretKeySpec);
/* 46 */            byte[] bArrI0000O = I0000O(cipher, 0, bArrI00000oIO, 0, bArrI00000oIO.length);
/* 56 */            byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
/* 63 */            byte[] bArrI0000O2 = I0000O(cipher, 1, bArr4, 0, bArr4.length);
/* 76 */            Cipher cipher2 = (Cipher) I0001Ioi1lo.get();
/* 83 */            cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrI0000O));
/* 92 */            cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.I0000O);
/* 103 */           byte[] bArrI0000O3 = I0000O(cipher, 2, bArr3, this.I0000O, bArr.length);
/* 108 */           int length2 = bArr.length + i;
/* 109 */           for (int i2 = 0; i2 < 16; i2++) {
/* 122 */               bArr3[length2 + i2] = (byte) ((bArrI0000O2[i2] ^ bArrI0000O[i2]) ^ bArrI0000O3[i2]);
                    }
/* 95 */            return bArr3;
                }

                @Override
                public final byte[] I00000oOI(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             SecretKeySpec secretKeySpec = this.I0000Il00O;
/* 3 */             int length = bArr.length;
/* 4 */             int i = this.I0000O;
                    int i2 = (length - i) - 16;
/* 11 */            if (i2 < 0) {
/* 117 */               IioIoO10iOiI.I000oI1ioi("ciphertext too short");
/* 120 */               return null;
                    }
/* 19 */            Cipher cipher = (Cipher) I0000oI00.get();
/* 22 */            cipher.init(1, secretKeySpec);
/* 31 */            byte[] bArrI0000O = I0000O(cipher, 0, bArr, 0, this.I0000O);
/* 42 */            byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
/* 48 */            byte[] bArrI0000O2 = I0000O(cipher, 1, bArr3, 0, bArr3.length);
/* 57 */            byte[] bArrI0000O3 = I0000O(cipher, 2, bArr, this.I0000O, i2);
/* 62 */            int length2 = bArr.length - 16;
/* 63 */            byte b = 0;
/* 64 */            for (int i3 = 0; i3 < 16; i3++) {
/* 80 */                b = (byte) (b | (((bArr[length2 + i3] ^ bArrI0000O2[i3]) ^ bArrI0000O[i3]) ^ bArrI0000O3[i3]));
                    }
/* 84 */            if (b != 0) {
/* 114 */               throw new AEADBadTagException("tag mismatch");
                    }
/* 92 */            Cipher cipher2 = (Cipher) I0001Ioi1lo.get();
/* 99 */            cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrI0000O));
/* 102 */           return cipher2.doFinal(bArr, i, i2);
                }

                public final byte[] I0000O(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
                    byte[] bArrCopyOf;
/* 1 */             byte[] bArr2 = this.I00000oIO;
/* 5 */             byte[] bArr3 = new byte[16];
/* 10 */            bArr3[15] = (byte) i;
/* 12 */            if (i3 == 0) {
/* 18 */                return cipher.doFinal(I0000oI00(bArr3, bArr2));
                    }
/* 23 */            byte[] bArrDoFinal = cipher.doFinal(bArr3);
/* 28 */            int i4 = 0;
/* 31 */            while (i3 - i4 > 16) {
/* 34 */                for (int i5 = 0; i5 < 16; i5++) {
/* 45 */                    bArrDoFinal[i5] = (byte) (bArrDoFinal[i5] ^ bArr[(i2 + i4) + i5]);
                        }
/* 50 */                bArrDoFinal = cipher.doFinal(bArrDoFinal);
/* 54 */                i4 += 16;
                    }
/* 59 */            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
/* 64 */            if (bArrCopyOfRange.length == 16) {
/* 66 */                bArrCopyOf = I0000oI00(bArrCopyOfRange, bArr2);
                    } else {
/* 73 */                bArrCopyOf = Arrays.copyOf(this.I00000oOI, 16);
/* 78 */                for (int i6 = 0; i6 < bArrCopyOfRange.length; i6++) {
/* 86 */                    bArrCopyOf[i6] = (byte) (bArrCopyOf[i6] ^ bArrCopyOfRange[i6]);
                        }
/* 98 */                bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
                    }
/* 104 */           return cipher.doFinal(I0000oI00(bArrDoFinal, bArrCopyOf));
                }
            }
