            package p000;

            import android.util.Log;
            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.math.BigInteger;
            import java.nio.CharBuffer;
            import java.nio.charset.Charset;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.InvalidKeyException;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.text.Normalizer;
            import java.util.Arrays;
            import javax.crypto.BadPaddingException;
            import javax.crypto.Cipher;
            import javax.crypto.IllegalBlockSizeException;
            import javax.crypto.NoSuchPaddingException;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            
/* 4 */     public final class OlIlo1 extends Oii0OIIO {
                public static final byte[] I000iOII = {40, -65, 78, 94, 78, 117, -118, 65, 100, 0, 78, 86, -1, -6, 1, 8, 46, 46, 0, -74, -48, 104, 62, Byte.MIN_VALUE, 47, 12, -87, -2, 100, 83, 105, 122};
                public static final String[] I000l1 = {"SHA-256", "SHA-384", "SHA-512"};

                public OlIlo1(OlIlo0iio0 olIlo0iio0) {
/* 49 */            throw null;
                }

                public static byte[] I000OOo1O(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i, byte[] bArr6, int i2, int i3, boolean z, boolean z2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
                    byte[] bArrI000iOII;
/* 4 */             if (i2 == 6 || i2 == 5) {
/* 111 */               if (z2) {
/* 113 */                   if (bArr4 == null) {
/* 134 */                       IioIoO10iOiI.I000OOo1O("/Encrypt/OE entry is missing");
/* 106 */                       return null;
                            }
/* 115 */                   byte[] bArr7 = new byte[8];
/* 117 */                   System.arraycopy(bArr2, 40, bArr7, 0, 8);
/* 127 */                   bArrI000iOII = i2 == 5 ? I000iOII(bArr, bArr7, bArr3) : I000OiO(bArr, bArr7, bArr3);
                        } else {
/* 138 */                   if (bArr5 == null) {
/* 200 */                       IioIoO10iOiI.I000OOo1O("/Encrypt/UE entry is missing");
/* 106 */                       return null;
                            }
/* 140 */                   byte[] bArr8 = new byte[8];
/* 142 */                   System.arraycopy(bArr3, 40, bArr8, 0, 8);
/* 152 */                   bArrI000iOII = i2 == 5 ? I000iOII(bArr, bArr8, null) : I000OiO(bArr, bArr8, null);
/* 156 */                   bArr4 = bArr5;
                        }
                        try {
/* 159 */                   Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
/* 180 */                   cipher.init(2, new SecretKeySpec(bArrI000iOII, "AES"), new IvParameterSpec(new byte[16]));
/* 183 */                   return cipher.doFinal(bArr4);
                        } catch (GeneralSecurityException e) {
/* 189 */                   I000o00OoI0I();
/* 197 */                   throw new IOException(e);
                        }
                    }
/* 11 */            byte[] bArr9 = new byte[32];
/* 14 */            int iMin = Math.min(bArr.length, 32);
/* 18 */            System.arraycopy(bArr, 0, bArr9, 0, iMin);
/* 25 */            System.arraycopy(I000iOII, 0, bArr9, iMin, 32 - iMin);
/* 28 */            MessageDigest messageDigestI00000oIO = l1O0OOOl1.I00000oIO();
/* 32 */            messageDigestI00000oIO.update(bArr9);
/* 35 */            messageDigestI00000oIO.update(bArr2);
/* 39 */            messageDigestI00000oIO.update((byte) i);
/* 45 */            messageDigestI00000oIO.update((byte) (i >>> 8));
/* 51 */            messageDigestI00000oIO.update((byte) (i >>> 16));
/* 57 */            messageDigestI00000oIO.update((byte) (i >>> 24));
/* 60 */            messageDigestI00000oIO.update(bArr6);
/* 64 */            if (i2 == 4 && !z) {
/* 73 */                messageDigestI00000oIO.update(new byte[]{-1, -1, -1, -1});
                    }
/* 76 */            byte[] bArrDigest = messageDigestI00000oIO.digest();
/* 81 */            if (i2 == 3 || i2 == 4) {
/* 88 */                for (int i4 = 0; i4 < 50; i4++) {
/* 90 */                    messageDigestI00000oIO.update(bArrDigest, 0, i3);
/* 93 */                    bArrDigest = messageDigestI00000oIO.digest();
                        }
                    }
/* 100 */           byte[] bArr10 = new byte[i3];
/* 102 */           System.arraycopy(bArrDigest, 0, bArr10, 0, i3);
/* 105 */           return bArr10;
                }

                public static byte[] I000OiO(byte[] bArr, byte[] bArr2, byte[] bArr3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
/* 1 */             byte[] bArrDoFinal = null;
/* 5 */             if (bArr3 == null) {
/* 7 */                 bArr3 = new byte[0];
                    } else {
/* 11 */                if (bArr3.length < 48) {
/* 238 */                   IioIoO10iOiI.I000OOo1O("Bad U length");
/* 1 */                     return null;
                        }
/* 14 */                if (bArr3.length > 48) {
/* 16 */                    byte[] bArr4 = new byte[48];
/* 18 */                    System.arraycopy(bArr3, 0, bArr4, 0, 48);
/* 21 */                    bArr3 = bArr4;
                        }
                    }
/* 25 */            if (bArr.length > 127) {
/* 28 */                byte[] bArr5 = new byte[127];
/* 30 */                System.arraycopy(bArr, 0, bArr5, 0, 127);
/* 33 */                bArr = bArr5;
                    }
/* 39 */            byte[] bArr6 = new byte[bArr.length + bArr2.length + bArr3.length];
/* 42 */            System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
/* 47 */            System.arraycopy(bArr2, 0, bArr6, bArr.length, bArr2.length);
/* 54 */            System.arraycopy(bArr3, 0, bArr6, bArr.length + bArr2.length, bArr3.length);
                    try {
                        try {
/* 63 */                    byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr6);
/* 67 */                    int i = 0;
                            while (true) {
/* 71 */                        if (i >= 64 && (bArrDoFinal[bArrDoFinal.length - 1] & 255) <= i - 32) {
                                    break;
                                }
/* 111 */                       byte[] bArr7 = bArr3.length >= 48 ? new byte[(bArr.length + bArrDigest.length + 48) * 64] : new byte[(bArr.length + bArrDigest.length) * 64];
/* 114 */                       int length = 0;
/* 115 */                       for (int i2 = 0; i2 < 64; i2++) {
/* 118 */                           System.arraycopy(bArr, 0, bArr7, length, bArr.length);
/* 122 */                           int length2 = length + bArr.length;
/* 124 */                           System.arraycopy(bArrDigest, 0, bArr7, length2, bArrDigest.length);
/* 128 */                           length = length2 + bArrDigest.length;
/* 130 */                           if (bArr3.length >= 48) {
/* 132 */                               System.arraycopy(bArr3, 0, bArr7, length, 48);
/* 135 */                               length += 48;
                                    }
                                }
/* 142 */                       byte[] bArr8 = new byte[16];
/* 144 */                       byte[] bArr9 = new byte[16];
/* 146 */                       System.arraycopy(bArrDigest, 0, bArr8, 0, 16);
/* 149 */                       System.arraycopy(bArrDigest, 16, bArr9, 0, 16);
/* 154 */                       Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
/* 170 */                       cipher.init(1, new SecretKeySpec(bArr8, "AES"), new IvParameterSpec(bArr9));
/* 173 */                       bArrDoFinal = cipher.doFinal(bArr7);
/* 177 */                       byte[] bArr10 = new byte[16];
/* 179 */                       System.arraycopy(bArrDoFinal, 0, bArr10, 0, 16);
/* 210 */                       bArrDigest = MessageDigest.getInstance(I000l1[new BigInteger(1, bArr10).mod(new BigInteger("3")).intValue()]).digest(bArrDoFinal);
/* 214 */                       i++;
                            }
/* 87 */                    if (bArrDigest.length <= 32) {
/* 95 */                        return bArrDigest;
                            }
/* 89 */                    byte[] bArr11 = new byte[32];
/* 91 */                    System.arraycopy(bArrDigest, 0, bArr11, 0, 32);
/* 94 */                    return bArr11;
                        } catch (NoSuchAlgorithmException e) {
/* 226 */                   throw new RuntimeException(e);
                        }
                    } catch (GeneralSecurityException e2) {
/* 227 */               I000o00OoI0I();
/* 235 */               throw new IOException(e2);
                    }
                }

                public static byte[] I000iOII(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchAlgorithmException {
                    try {
/* 3 */                 MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 7 */                 messageDigest.update(bArr);
/* 10 */                messageDigest.update(bArr2);
                        return bArr3 == null ? messageDigest.digest() : messageDigest.digest(bArr3);
                    } catch (NoSuchAlgorithmException e) {
/* 26 */                IioIoO10iOiI.I000lI(e);
/* 29 */                return null;
                    }
                }

                public static void I000o00OoI0I() {
                    try {
/* 10 */                if (Cipher.getMaxAllowedKeyLength("AES") != Integer.MAX_VALUE) {
/* 16 */                    Log.w("PdfBox-Android", "JCE unlimited strength jurisdiction policy files are not installed");
                        }
                    } catch (NoSuchAlgorithmException unused) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:334:0x03ee  */
                /* JADX WARN: Removed duplicated region for block: B:339:0x03fc  */
                /* JADX WARN: Removed duplicated region for block: B:343:0x0421  */
                /* JADX WARN: Removed duplicated region for block: B:345:0x0425  */
                /* JADX WARN: Removed duplicated region for block: B:348:0x0438  */
                /* JADX WARN: Removed duplicated region for block: B:355:0x0459  */
                /* JADX WARN: Removed duplicated region for block: B:385:0x04d3  */
                /* JADX WARN: Removed duplicated region for block: B:393:0x053c A[Catch: GeneralSecurityException -> 0x05c6, TryCatch #0 {GeneralSecurityException -> 0x05c6, blocks: (B:391:0x051f, B:393:0x053c, B:395:0x0540, B:397:0x054a, B:399:0x0550, B:404:0x0560, B:406:0x057c, B:408:0x05b2, B:413:0x05c0, B:411:0x05ba, B:403:0x055a), top: B:424:0x051f }] */
                /* JADX WARN: Removed duplicated region for block: B:394:0x053f  */
                /* JADX WARN: Removed duplicated region for block: B:403:0x055a A[Catch: GeneralSecurityException -> 0x05c6, TryCatch #0 {GeneralSecurityException -> 0x05c6, blocks: (B:391:0x051f, B:393:0x053c, B:395:0x0540, B:397:0x054a, B:399:0x0550, B:404:0x0560, B:406:0x057c, B:408:0x05b2, B:413:0x05c0, B:411:0x05ba, B:403:0x055a), top: B:424:0x051f }] */
                /* JADX WARN: Removed duplicated region for block: B:406:0x057c A[Catch: GeneralSecurityException -> 0x05c6, TryCatch #0 {GeneralSecurityException -> 0x05c6, blocks: (B:391:0x051f, B:393:0x053c, B:395:0x0540, B:397:0x054a, B:399:0x0550, B:404:0x0560, B:406:0x057c, B:408:0x05b2, B:413:0x05c0, B:411:0x05ba, B:403:0x055a), top: B:424:0x051f }] */
                /* JADX WARN: Removed duplicated region for block: B:420:0x05d8  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0140  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x015d  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x016c  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000O01llI0(OIliiIOOiI1l oIliiIOOiI1l, IIOoIilO iIOoIilO, il0ilo0 il0ilo0Var) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
                    OIlOo0I1lIl oIlOo0I1lIlI0000oI00;
                    int i;
                    int i2;
                    byte[] bArr;
                    boolean zI000iOII;
                    byte[] bArr2;
                    char c;
                    byte[] bArr3;
                    int i3;
                    byte[] bArr4;
                    int i4;
                    Charset charset;
                    byte[] bArr5;
                    byte[] bytes;
                    byte[] bArr6;
                    byte[] bArr7;
                    byte[] bArr8;
                    int i5;
                    int i6;
                    boolean zEquals;
                    int i7;
                    char c2;
                    char c3;
                    char c4;
                    int i8;
                    char c5;
                    int i9;
                    byte[] bArrDoFinal;
                    int i10;
/* 11 */            if (!(il0ilo0Var instanceof OlIl1l)) {
/* 1505 */              IioIoO10iOiI.I000OOo1O("Decryption material is not compatible with the document");
/* 2160 */              return;
                    }
/* 13 */            int iI000OiO = oIliiIOOiI1l.I000OiO();
/* 20 */            IIOoi0ooOoO iIOoi0ooOoO = (IIOoi0ooOoO) oIliiIOOiI1l.I00iiI;
/* 23 */            if (iI000OiO >= 4) {
/* 31 */                IIi0I0I0o iIi0I0I0o = (IIi0I0I0o) iIOoi0ooOoO.I00oII(IIi0I0I0o.I0IOIo0);
/* 33 */                if (iIi0I0I0o == null) {
/* 35 */                    iIi0I0I0o = IIi0I0I0o.I01io11il;
                        }
/* 37 */                this.I000O01llI0 = iIi0I0I0o;
/* 45 */                IIi0I0I0o iIi0I0I0o2 = (IIi0I0I0o) iIOoi0ooOoO.I00oII(IIi0I0I0o.I0IOio);
/* 47 */                if (iIi0I0I0o2 == null) {
/* 49 */                    iIi0I0I0o2 = IIi0I0I0o.I01io11il;
                        }
/* 51 */                this.I000OOo1O = iIi0I0I0o2;
                    }
/* 57 */            this.I0000O = oIliiIOOiI1l.I000iOII();
/* 61 */            String strNormalize = ((OlIl1l) il0ilo0Var).I00000oIO;
/* 63 */            if (strNormalize == null) {
/* 65 */                strNormalize = "";
                    }
/* 71 */            int iI00oooO = iIOoi0ooOoO.I00oooO(IIi0I0I0o.I0I10lio10, null, 0);
/* 77 */            int iI00oooO2 = iIOoi0ooOoO.I00oooO(IIi0I0I0o.I0I1lll0O0, null, 0);
/* 97 */            int iI000II = oIliiIOOiI1l.I000OiO() == 1 ? 5 : oIliiIOOiI1l.I000II() / 8;
                    try {
/* 108 */               if ((oIliiIOOiI1l.I000OiO() == 4 || oIliiIOOiI1l.I000OiO() == 5) && (oIlOo0I1lIlI0000oI00 = oIliiIOOiI1l.I0000oI00(IIi0I0I0o.I0IO1io0I)) != null) {
/* 137 */                   IIi0I0I0o iIi0I0I0o3 = (IIi0I0I0o) oIlOo0I1lIlI0000oI00.I00iiI.I00oII(IIi0I0I0o.I010i10l);
/* 145 */                   i = 8;
/* 149 */                   if (IIi0I0I0o.I00io1l.equals(iIi0I0I0o3)) {
/* 151 */                       this.I0001Ioi1lo = true;
/* 161 */                       if (!iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I01o00iOi) || (iI000II = oIliiIOOiI1l.I000II() / 8) >= 16) {
/* 192 */                           iI000II = 16;
                                } else {
/* 188 */                           Log.w("PdfBox-Android", "Using " + iI000II + " bytes key length instead of 16 in AESV2 encryption?!");
                                }
                            }
/* 200 */                   if (IIi0I0I0o.I00ioIO.equals(iIi0I0I0o3)) {
/* 202 */                       this.I0001Ioi1lo = true;
/* 212 */                       if (!iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I01o00iOi) || (iI000II = oIliiIOOiI1l.I000II() / 8) >= 32) {
/* 244 */                           i2 = 32;
                                } else {
/* 239 */                           Log.w("PdfBox-Android", "Using " + iI000II + " bytes key length instead of 32 in AESV3 encryption?!");
                                }
                            }
/* 265 */                   bArr = (iIOoIilO != null || iIOoIilO.I00iOIl.size() < 1) ? new byte[0] : ((IIi0l1) iIOoIilO.I00lll10(0)).I00iOIl;
/* 268 */                   zI000iOII = oIliiIOOiI1l.I000iOII();
/* 278 */                   IIi0l1 iIi0l1 = (IIi0l1) iIOoi0ooOoO.I00oII(IIi0I0I0o.I0Il0IoIIOll);
/* 286 */                   byte[] bArr9 = iIi0l1 == null ? iIi0l1.I00iOIl : null;
/* 293 */                   IIi0l1 iIi0l12 = (IIi0l1) iIOoi0ooOoO.I00oII(IIi0I0I0o.I0I0Oi);
/* 300 */                   bArr2 = iIi0l12 == null ? iIi0l12.I00iOIl : null;
/* 301 */                   Charset charset2 = IO1IIilll1I.I0000O;
/* 304 */                   if (iI00oooO2 != 6 || iI00oooO2 == 5) {
/* 321 */                       Charset charset3 = IO1IIilll1I.I0001Ioi1lo;
/* 329 */                       IIi0l1 iIi0l13 = (IIi0l1) iIOoi0ooOoO.I00oII(IIi0I0I0o.I0Il0o1i00);
/* 338 */                       byte[] bArr10 = iIi0l13 == null ? iIi0l13.I00iOIl : null;
/* 335 */                       c = ' ';
/* 346 */                       IIi0l1 iIi0l14 = (IIi0l1) iIOoi0ooOoO.I00oII(IIi0I0I0o.I0I0o01l);
/* 353 */                       bArr3 = iIi0l14 == null ? iIi0l14.I00iOIl : null;
/* 356 */                       i3 = i;
/* 358 */                       bArr4 = bArr10;
/* 360 */                       i4 = 4;
/* 362 */                       charset = charset3;
                            } else {
/* 309 */                       c = ' ';
/* 311 */                       i3 = i;
/* 313 */                       bArr3 = null;
/* 315 */                       bArr4 = null;
/* 317 */                       charset = charset2;
/* 318 */                       i4 = 4;
                            }
/* 363 */                   if (iI00oooO2 != 6) {
/* 365 */                       char[] charArray = strNormalize.toCharArray();
/* 374 */                       for (int i11 = 0; i11 < strNormalize.length(); i11++) {
/* 384 */                           if (lO0Ioi0I.I00000oIO(strNormalize.charAt(i11))) {
/* 386 */                               charArray[i11] = c;
                                    }
                                }
/* 392 */                       int i12 = 0;
/* 399 */                       for (int i13 = 0; i13 < strNormalize.length(); i13++) {
/* 401 */                           char c6 = charArray[i13];
/* 405 */                           if (c6 != 173 && c6 != 847 && c6 != 6150 && c6 != 6155 && c6 != 6156 && c6 != 6157 && c6 != 8203 && c6 != 8204 && c6 != 8205 && c6 != 8288 && ((65024 > c6 || c6 > 65039) && c6 != 65279)) {
/* 459 */                               charArray[i12] = c6;
/* 457 */                               i12++;
                                    }
                                }
/* 473 */                       strNormalize = Normalizer.normalize(CharBuffer.wrap(charArray, 0, i12), Normalizer.Form.NFKC);
/* 477 */                       int iCharCount = 0;
/* 478 */                       boolean z = false;
/* 479 */                       boolean z2 = false;
/* 480 */                       boolean z3 = false;
/* 485 */                       while (iCharCount < strNormalize.length()) {
/* 487 */                           int iCodePointAt = strNormalize.codePointAt(iCharCount);
/* 491 */                           char c7 = (char) iCodePointAt;
/* 496 */                           if (!lO0Ioi0I.I00000oIO(c7)) {
/* 498 */                               byte[] bArr11 = bArr9;
/* 500 */                               if ((c7 < 0 || c7 > 31) && c7 != 127 && ((128 > iCodePointAt || iCodePointAt > 159) && iCodePointAt != 1757 && iCodePointAt != 1807 && iCodePointAt != 6158 && iCodePointAt != 8204 && iCodePointAt != 8205 && iCodePointAt != 8232 && iCodePointAt != 8233 && iCodePointAt != 8288 && iCodePointAt != 8289 && iCodePointAt != 8290 && iCodePointAt != 8291 && ((8298 > iCodePointAt || iCodePointAt > 8303) && iCodePointAt != 65279 && ((65529 > iCodePointAt || iCodePointAt > 65532) && ((119155 > iCodePointAt || iCodePointAt > 119162) && ((57344 > iCodePointAt || iCodePointAt > 63743) && ((983040 > iCodePointAt || iCodePointAt > 1048573) && ((1048576 > iCodePointAt || iCodePointAt > 1114109) && ((64976 > iCodePointAt || iCodePointAt > 65007) && ((65534 > iCodePointAt || iCodePointAt > 65535) && ((131070 > iCodePointAt || iCodePointAt > 131071) && ((196606 > iCodePointAt || iCodePointAt > 196607) && ((262142 > iCodePointAt || iCodePointAt > 262143) && ((327678 > iCodePointAt || iCodePointAt > 327679) && ((393214 > iCodePointAt || iCodePointAt > 393215) && ((458750 > iCodePointAt || iCodePointAt > 458751) && ((524286 > iCodePointAt || iCodePointAt > 524287) && ((589822 > iCodePointAt || iCodePointAt > 589823) && ((655358 > iCodePointAt || iCodePointAt > 655359) && ((720894 > iCodePointAt || iCodePointAt > 720895) && ((786430 > iCodePointAt || iCodePointAt > 786431) && ((851966 > iCodePointAt || iCodePointAt > 851967) && ((917502 > iCodePointAt || iCodePointAt > 917503) && ((983038 > iCodePointAt || iCodePointAt > 983039) && ((1048574 > iCodePointAt || iCodePointAt > 1048575) && ((1114110 > iCodePointAt || iCodePointAt > 1114111) && ((55296 > iCodePointAt || iCodePointAt > 57343) && iCodePointAt != 65529 && iCodePointAt != 65530 && iCodePointAt != 65531 && iCodePointAt != 65532 && iCodePointAt != 65533 && ((12272 > iCodePointAt || iCodePointAt > 12283) && iCodePointAt != 832 && iCodePointAt != 833 && iCodePointAt != 8206 && iCodePointAt != 8207 && iCodePointAt != 8234 && iCodePointAt != 8235 && iCodePointAt != 8236 && iCodePointAt != 8237 && iCodePointAt != 8238 && iCodePointAt != 8298 && iCodePointAt != 8299 && iCodePointAt != 8300 && iCodePointAt != 8301 && iCodePointAt != 8302 && iCodePointAt != 8303 && iCodePointAt != 917505 && (917536 > iCodePointAt || iCodePointAt > 917631))))))))))))))))))))))))))))) {
/* 918 */                                   byte directionality = Character.getDirectionality(iCodePointAt);
/* 933 */                                   boolean z4 = directionality == 1 || directionality == 2;
/* 935 */                                   z |= z4;
/* 942 */                                   z2 |= directionality == 0;
/* 950 */                                   z3 |= iCharCount == 0 && z4;
/* 955 */                                   iCharCount += Character.charCount(iCodePointAt);
/* 956 */                                   if (z3 && iCharCount >= strNormalize.length() && !z4) {
/* 969 */                                       I000II.I000iOII("First character is RandALCat, but last character is not");
/* 972 */                                       return;
                                            }
/* 973 */                                   bArr9 = bArr11;
                                        }
                                    }
/* 987 */                           I000II.I000iOII(IIl001iO0Io.I000l1(iCodePointAt, iCharCount, "Prohibited character ", " at position "));
/* 990 */                           return;
                                }
/* 991 */                       bArr5 = bArr9;
/* 994 */                       if (z && z2) {
/* 1001 */                          I000II.I000iOII("Contains both RandALCat characters and LCat characters");
/* 1004 */                          return;
                                }
                            } else {
/* 1007 */                      bArr5 = bArr9;
                            }
/* 1005 */                  String str = strNormalize;
/* 1011 */                  bytes = str.getBytes(charset);
/* 1016 */                  if (iI00oooO2 != 6 || iI00oooO2 == 5) {
/* 1021 */                      bArr6 = bArr2;
/* 1022 */                      bArr7 = bArr;
/* 1024 */                      bArr8 = bArr5;
/* 1056 */                      if (bytes.length > 127) {
/* 1058 */                          i5 = 0;
                                } else {
/* 1062 */                          byte[] bArr12 = new byte[127];
/* 1064 */                          i5 = 0;
/* 1065 */                          System.arraycopy(bytes, 0, bArr12, 0, 127);
/* 1068 */                          bytes = bArr12;
                                }
/* 1059 */                      int i14 = c;
/* 1070 */                      byte[] bArr13 = new byte[i14];
/* 1074 */                      byte[] bArr14 = new byte[i3];
/* 1079 */                      if (bArr6.length >= 40) {
/* 1499 */                          IioIoO10iOiI.I000OOo1O("Owner password is too short");
/* 1502 */                          return;
                                }
/* 1081 */                      System.arraycopy(bArr6, i5, bArr13, i5, i14);
/* 1084 */                      i6 = 8;
/* 1086 */                      System.arraycopy(bArr6, i14, bArr14, i5, 8);
/* 1101 */                      zEquals = Arrays.equals(iI00oooO2 == 5 ? I000iOII(bytes, bArr14, bArr8) : I000OiO(bytes, bArr14, bArr8), bArr13);
                            } else {
/* 1029 */                      bArr6 = bArr2;
/* 1030 */                      byte[] bArrI000l1 = I000l1(bytes, bArr6, iI00oooO2, i2);
/* 1039 */                      byte[] bArr15 = bArr5;
/* 1043 */                      zEquals = I000lI(bArrI000l1, bArr15, bArr6, iI00oooO, bArr, iI00oooO2, i2, zI000iOII);
/* 1047 */                      bArr8 = bArr15;
/* 1048 */                      bArr7 = bArr;
/* 1050 */                      i6 = i3;
                            }
/* 1112 */                  if (zEquals) {
/* 1236 */                      i7 = i6;
/* 1247 */                      c2 = '\t';
/* 1249 */                      byte[] bArr16 = bArr8;
/* 1251 */                      c3 = '\n';
/* 1253 */                      c4 = 11;
/* 1255 */                      byte[] bArr17 = bArr6;
/* 1256 */                      i8 = iI00oooO;
/* 1267 */                      if (!I000lI(str.getBytes(charset), bArr16, bArr17, i8, bArr7, iI00oooO2, i2, zI000iOII)) {
/* 1496 */                          throw new IOO1IOl1O10("Cannot decrypt PDF, the password is incorrect");
                                }
/* 1271 */                      Il1IIl1 il1IIl1 = new Il1IIl1();
/* 1274 */                      il1IIl1.I00000oIO = i8;
/* 1276 */                      il1IIl1.I00000oOI = true;
/* 1278 */                      this.I000II = il1IIl1;
/* 1288 */                      c5 = 1;
/* 1295 */                      i9 = 5;
/* 1301 */                      this.I00000oOI = I000OOo1O(str.getBytes(charset), bArr17, bArr16, bArr3, bArr4, i8, bArr7, iI00oooO2, i2, zI000iOII, false);
                            } else {
/* 1116 */                      Il1IIl1 il1IIl12 = new Il1IIl1();
/* 1120 */                      il1IIl12.I00000oOI = false;
/* 1123 */                      il1IIl12.I00000oIO = -4;
/* 1125 */                      il1IIl12.I00000oIO(11);
/* 1130 */                      if (!il1IIl12.I00000oOI) {
/* 1133 */                          il1IIl12.I00000oIO(5);
                                }
/* 1138 */                      if (!il1IIl12.I00000oOI) {
/* 1140 */                          il1IIl12.I00000oIO(10);
                                }
/* 1145 */                      if (!il1IIl12.I00000oOI) {
/* 1147 */                          il1IIl12.I00000oIO(9);
                                }
/* 1152 */                      if (!il1IIl12.I00000oOI) {
/* 1156 */                          il1IIl12.I00000oIO(i4);
                                }
/* 1161 */                      if (!il1IIl12.I00000oOI) {
/* 1164 */                          il1IIl12.I00000oIO(6);
                                }
/* 1169 */                      if (!il1IIl12.I00000oOI) {
/* 1171 */                          il1IIl12.I00000oIO(3);
                                }
/* 1176 */                      if (!il1IIl12.I00000oOI) {
/* 1180 */                          il1IIl12.I00000oIO(12);
                                }
/* 1183 */                      this.I000II = il1IIl12;
/* 1186 */                      i9 = 5;
/* 1209 */                      i7 = i6;
/* 1221 */                      this.I00000oOI = I000OOo1O((iI00oooO2 == 6 || iI00oooO2 == 5) ? str.getBytes(charset) : I000l1(str.getBytes(charset), bArr6, iI00oooO2, i2), bArr6, bArr8, bArr3, bArr4, iI00oooO, bArr7, iI00oooO2, i2, zI000iOII, true);
/* 1225 */                      c2 = '\t';
/* 1227 */                      c5 = 1;
/* 1228 */                      c3 = '\n';
/* 1230 */                      c4 = 11;
/* 1232 */                      i8 = iI00oooO;
                            }
/* 1304 */                  if (iI00oooO2 != 6 || iI00oooO2 == i9) {
/* 1314 */                      Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
/* 1328 */                      cipher.init(2, new SecretKeySpec(this.I00000oOI, "AES"));
/* 1337 */                      IIi0l1 iIi0l15 = (IIi0l1) iIOoi0ooOoO.I00oII(IIi0I0I0o.I0I1ii0i);
/* 1345 */                      bArrDoFinal = cipher.doFinal(iIi0l15 == null ? iIi0l15.I00iOIl : null);
/* 1353 */                      if (bArrDoFinal[c2] == 97 || bArrDoFinal[c3] != 100 || bArrDoFinal[c4] != 98) {
/* 1373 */                          Log.w("PdfBox-Android", "Verification of permissions failed (constant)");
                                }
/* 1402 */                      i10 = ((bArrDoFinal[c5] & 255) << 8) | (bArrDoFinal[0] & 255) | ((bArrDoFinal[2] & 255) << 16) | ((bArrDoFinal[3] & 255) << 24);
/* 1403 */                      if (i10 != i8) {
/* 1454 */                          Log.w("PdfBox-Android", "Verification of permissions failed (" + String.format("%08X", Integer.valueOf(i10)) + " != " + String.format("%08X", Integer.valueOf(i8)) + ")");
                                }
/* 1457 */                      if ((zI000iOII || bArrDoFinal[i7] == 84) && (zI000iOII || bArrDoFinal[i7] == 70)) {
/* 1478 */                          return;
                                }
/* 1475 */                      Log.w("PdfBox-Android", "Verification of permissions failed (EncryptMetadata)");
/* 1478 */                      return;
                            }
/* 1478 */                  return;
                        }
/* 117 */               i = 8;
/* 1314 */              Cipher cipher2 = Cipher.getInstance("AES/ECB/NoPadding");
/* 1328 */              cipher2.init(2, new SecretKeySpec(this.I00000oOI, "AES"));
/* 1337 */              IIi0l1 iIi0l152 = (IIi0l1) iIOoi0ooOoO.I00oII(IIi0I0I0o.I0I1ii0i);
/* 1345 */              bArrDoFinal = cipher2.doFinal(iIi0l152 == null ? iIi0l152.I00iOIl : null);
/* 1353 */              if (bArrDoFinal[c2] == 97) {
/* 1373 */                  Log.w("PdfBox-Android", "Verification of permissions failed (constant)");
                        }
/* 1402 */              i10 = ((bArrDoFinal[c5] & 255) << 8) | (bArrDoFinal[0] & 255) | ((bArrDoFinal[2] & 255) << 16) | ((bArrDoFinal[3] & 255) << 24);
/* 1403 */              if (i10 != i8) {
                        }
/* 1457 */              if (zI000iOII) {
/* 1478 */                  return;
                        } else {
/* 1478 */                  return;
                        }
/* 1475 */              Log.w("PdfBox-Android", "Verification of permissions failed (EncryptMetadata)");
/* 1478 */              return;
                    } catch (GeneralSecurityException e) {
/* 1480 */              I000o00OoI0I();
/* 1488 */              throw new IOException(e);
                    }
/* 242 */           i2 = iI000II;
/* 265 */           bArr = (iIOoIilO != null || iIOoIilO.I00iOIl.size() < 1) ? new byte[0] : ((IIi0l1) iIOoIilO.I00lll10(0)).I00iOIl;
/* 268 */           zI000iOII = oIliiIOOiI1l.I000iOII();
/* 278 */           IIi0l1 iIi0l16 = (IIi0l1) iIOoi0ooOoO.I00oII(IIi0I0I0o.I0Il0IoIIOll);
/* 286 */           if (iIi0l16 == null) {
                    }
/* 293 */           IIi0l1 iIi0l122 = (IIi0l1) iIOoi0ooOoO.I00oII(IIi0I0I0o.I0I0Oi);
/* 300 */           if (iIi0l122 == null) {
                    }
/* 301 */           Charset charset22 = IO1IIilll1I.I0000O;
/* 304 */           if (iI00oooO2 != 6) {
/* 321 */               Charset charset32 = IO1IIilll1I.I0001Ioi1lo;
/* 329 */               IIi0l1 iIi0l132 = (IIi0l1) iIOoi0ooOoO.I00oII(IIi0I0I0o.I0Il0o1i00);
/* 338 */               if (iIi0l132 == null) {
                        }
/* 335 */               c = ' ';
/* 346 */               IIi0l1 iIi0l142 = (IIi0l1) iIOoi0ooOoO.I00oII(IIi0I0I0o.I0I0o01l);
/* 353 */               bArr3 = iIi0l142 == null ? iIi0l142.I00iOIl : null;
/* 356 */               i3 = i;
/* 358 */               bArr4 = bArr10;
/* 360 */               i4 = 4;
/* 362 */               charset = charset32;
                    }
/* 363 */           if (iI00oooO2 != 6) {
                    }
/* 1005 */          String str2 = strNormalize;
/* 1011 */          bytes = str2.getBytes(charset);
/* 1016 */          if (iI00oooO2 != 6) {
/* 1021 */              bArr6 = bArr2;
/* 1022 */              bArr7 = bArr;
/* 1024 */              bArr8 = bArr5;
/* 1056 */              if (bytes.length > 127) {
                        }
/* 1059 */              int i142 = c;
/* 1070 */              byte[] bArr132 = new byte[i142];
/* 1074 */              byte[] bArr142 = new byte[i3];
/* 1079 */              if (bArr6.length >= 40) {
                        }
                    }
/* 1112 */          if (zEquals) {
                    }
/* 1304 */          if (iI00oooO2 != 6) {
                    }
                }

                public final byte[] I000l1(byte[] bArr, byte[] bArr2, int i, int i2) throws IOException {
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 6 */             MessageDigest messageDigestI00000oIO = l1O0OOOl1.I00000oIO();
/* 12 */            byte[] bArr3 = new byte[32];
/* 15 */            int iMin = Math.min(bArr.length, 32);
/* 20 */            System.arraycopy(bArr, 0, bArr3, 0, iMin);
/* 27 */            System.arraycopy(I000iOII, 0, bArr3, iMin, 32 - iMin);
/* 30 */            byte[] bArrDigest = messageDigestI00000oIO.digest(bArr3);
/* 36 */            if (i == 3 || i == 4) {
/* 43 */                for (int i3 = 0; i3 < 50; i3++) {
/* 45 */                    messageDigestI00000oIO.update(bArrDigest, 0, i2);
/* 48 */                    bArrDigest = messageDigestI00000oIO.digest();
                        }
                    }
/* 55 */            byte[] bArr4 = new byte[i2];
/* 57 */            System.arraycopy(bArrDigest, 0, bArr4, 0, i2);
/* 61 */            if (i == 2) {
/* 63 */                I0001Ioi1lo(bArr4, bArr2, byteArrayOutputStream);
                    } else if (i == 3 || i == 4) {
/* 71 */                byte[] bArr5 = new byte[i2];
/* 74 */                byte[] byteArray = new byte[bArr2.length];
/* 77 */                System.arraycopy(bArr2, 0, byteArray, 0, bArr2.length);
/* 82 */                for (int i4 = 19; i4 >= 0; i4--) {
/* 84 */                    System.arraycopy(bArr4, 0, bArr5, 0, i2);
/* 88 */                    for (int i5 = 0; i5 < i2; i5++) {
/* 95 */                        bArr5[i5] = (byte) (bArr5[i5] ^ ((byte) i4));
                            }
/* 100 */                   byteArrayOutputStream.reset();
/* 103 */                   I0001Ioi1lo(bArr5, byteArray, byteArrayOutputStream);
/* 106 */                   byteArray = byteArrayOutputStream.toByteArray();
                        }
                    }
/* 113 */           return byteArrayOutputStream.toByteArray();
                }

                public final boolean I000lI(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, int i2, int i3, boolean z) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
/* 3 */             byte[] bArr5 = bArr;
/* 15 */            if (i2 != 2 && i2 != 3 && i2 != 4) {
/* 22 */                if (i2 != 5 && i2 != 6) {
/* 34 */                    IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(i2, "Unknown Encryption Revision "));
/* 9 */                     return false;
                        }
/* 41 */                if (bArr5.length > 127) {
/* 44 */                    byte[] bArr6 = new byte[127];
/* 46 */                    System.arraycopy(bArr5, 0, bArr6, 0, 127);
/* 49 */                    bArr5 = bArr6;
                        }
/* 50 */                byte[] bArr7 = new byte[32];
/* 54 */                byte[] bArr8 = new byte[8];
/* 56 */                System.arraycopy(bArr2, 0, bArr7, 0, 32);
/* 59 */                System.arraycopy(bArr2, 32, bArr8, 0, 8);
/* 74 */                return Arrays.equals(i2 == 5 ? I000iOII(bArr5, bArr8, null) : I000OiO(bArr5, bArr8, null), bArr7);
                    }
/* 81 */            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 103 */           byte[] bArrI000OOo1O = I000OOo1O(bArr5, bArr3, null, null, null, i, bArr4, i2, i3, z, true);
/* 109 */           byte[] bArr9 = I000iOII;
/* 111 */           if (i2 == 2) {
/* 113 */               I0001Ioi1lo(bArrI000OOo1O, bArr9, byteArrayOutputStream);
                    } else if (i2 == 3 || i2 == 4) {
/* 122 */               MessageDigest messageDigestI00000oIO = l1O0OOOl1.I00000oIO();
/* 126 */               messageDigestI00000oIO.update(bArr9);
/* 131 */               messageDigestI00000oIO.update(bArr4);
/* 138 */               byteArrayOutputStream.write(messageDigestI00000oIO.digest());
/* 141 */               int length = bArrI000OOo1O.length;
/* 142 */               byte[] bArr10 = new byte[length];
/* 147 */               for (int i4 = 0; i4 < 20; i4++) {
/* 150 */                   System.arraycopy(bArrI000OOo1O, 0, bArr10, 0, length);
/* 154 */                   for (int i5 = 0; i5 < length; i5++) {
/* 160 */                       bArr10[i5] = (byte) (bArr10[i5] ^ i4);
                            }
/* 171 */                   ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
/* 174 */                   byteArrayOutputStream.reset();
/* 177 */                   I0000oI00(bArr10, byteArrayInputStream, byteArrayOutputStream);
                        }
/* 185 */               byte[] bArr11 = new byte[32];
/* 192 */               System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr11, 0, 16);
/* 195 */               System.arraycopy(bArr9, 0, bArr11, 16, 16);
/* 198 */               byteArrayOutputStream.reset();
/* 201 */               byteArrayOutputStream.write(bArr11);
                    }
/* 204 */           byte[] byteArray = byteArrayOutputStream.toByteArray();
                    return i2 == 2 ? Arrays.equals(bArr2, byteArray) : Arrays.equals(Arrays.copyOf(bArr2, 16), Arrays.copyOf(byteArray, 16));
                }

/* 5 */         public OlIlo1() {
                }
            }
