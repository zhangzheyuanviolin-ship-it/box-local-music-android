            package p000;

            import java.security.GeneralSecurityException;
            import java.security.MessageDigest;
            import java.util.Arrays;
            import java.util.List;
            import javax.crypto.AEADBadTagException;
            import javax.crypto.Cipher;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            
            public final class I0i0lO0 implements IiOoOl0oIOi {
                public static final List I0000Il00O = Arrays.asList(64);
                public static final byte[] I0000O = new byte[16];
                public static final byte[] I0000oI00 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
                public IoIlOo1o0IIl I00000oIO;
                public byte[] I00000oOI;

                @Override
                public final byte[] I00000oIO(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 5 */             if (bArr.length > 2147483631) {
/* 84 */                IioIoO10iOiI.I000oI1ioi("plaintext too long");
/* 87 */                return null;
                    }
/* 17 */            Cipher cipher = (Cipher) Il0O1l0i.I00000oOI.I00000oIO.I00IO1oi11O("AES/CTR/NoPadding");
/* 23 */            byte[] bArrI0000Il00O = I0000Il00O(bArr2, bArr);
/* 31 */            byte[] bArr3 = (byte[]) bArrI0000Il00O.clone();
/* 40 */            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
/* 49 */            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
/* 66 */            cipher.init(1, new SecretKeySpec(this.I00000oOI, "AES"), new IvParameterSpec(bArr3));
/* 77 */            return iOiiIOilI1.I00000oIO(bArrI0000Il00O, cipher.doFinal(bArr));
                }

                @Override
                public final byte[] I00000oOI(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 4 */             if (bArr.length < 16) {
/* 120 */               IioIoO10iOiI.I000oI1ioi("Ciphertext too short.");
/* 123 */               return null;
                    }
/* 16 */            Cipher cipher = (Cipher) Il0O1l0i.I00000oOI.I00000oIO.I00IO1oi11O("AES/CTR/NoPadding");
/* 19 */            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
/* 27 */            byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
/* 36 */            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
/* 45 */            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
/* 62 */            cipher.init(2, new SecretKeySpec(this.I00000oOI, "AES"), new IvParameterSpec(bArr3));
/* 66 */            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
/* 70 */            byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
/* 75 */            if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
/* 93 */                bArrDoFinal = new byte[0];
                    }
/* 107 */           if (MessageDigest.isEqual(bArrCopyOfRange, I0000Il00O(bArr2, bArrDoFinal))) {
/* 109 */               return bArrDoFinal;
                    }
/* 117 */           throw new AEADBadTagException("Integrity check failed.");
                }

                public final byte[] I0000Il00O(byte[]... bArr) throws GeneralSecurityException {
                    byte[] bArrI0000O;
/* 1 */             int length = bArr.length;
/* 2 */             IoIlOo1o0IIl ioIlOo1o0IIl = this.I00000oIO;
/* 6 */             if (length == 0) {
/* 10 */                return ioIlOo1o0IIl.I0000oI00(16, I0000oI00);
                    }
/* 17 */            byte[] bArrI0000oI00 = ioIlOo1o0IIl.I0000oI00(16, I0000O);
/* 26 */            for (int i = 0; i < bArr.length - 1; i++) {
/* 28 */                byte[] bArr2 = bArr[i];
/* 30 */                if (bArr2 == null) {
/* 32 */                    bArr2 = new byte[0];
                        }
/* 42 */                bArrI0000oI00 = iOiiIOilI1.I0000O(iOIOoI1.I00000oIO(bArrI0000oI00), ioIlOo1o0IIl.I0000oI00(16, bArr2));
                    }
/* 52 */            byte[] bArr3 = bArr[bArr.length - 1];
/* 56 */            if (bArr3.length >= 16) {
/* 60 */                if (bArr3.length < bArrI0000oI00.length) {
/* 88 */                    I000II.I000iOII("xorEnd requires a.length >= b.length");
/* 55 */                    return null;
                        }
/* 64 */                int length2 = bArr3.length - bArrI0000oI00.length;
/* 66 */                bArrI0000O = Arrays.copyOf(bArr3, bArr3.length);
/* 71 */                for (int i2 = 0; i2 < bArrI0000oI00.length; i2++) {
/* 73 */                    int i3 = length2 + i2;
/* 81 */                    bArrI0000O[i3] = (byte) (bArrI0000O[i3] ^ bArrI0000oI00[i2]);
                        }
                    } else {
/* 93 */                if (bArr3.length >= 16) {
/* 119 */                   I000II.I000iOII("x must be smaller than a block.");
/* 55 */                    return null;
                        }
/* 95 */                byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
/* 102 */               bArrCopyOf[bArr3.length] = Byte.MIN_VALUE;
/* 108 */               bArrI0000O = iOiiIOilI1.I0000O(bArrCopyOf, iOIOoI1.I00000oIO(bArrI0000oI00));
                    }
/* 112 */           return ioIlOo1o0IIl.I0000oI00(16, bArrI0000O);
                }
            }
