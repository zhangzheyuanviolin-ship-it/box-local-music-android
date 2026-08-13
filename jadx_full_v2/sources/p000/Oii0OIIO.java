            package p000;

            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.InvalidKeyException;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.IdentityHashMap;
            import java.util.Map;
            import java.util.Set;
            import javax.crypto.Cipher;
            import javax.crypto.CipherInputStream;
            import javax.crypto.NoSuchPaddingException;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            
            public abstract class Oii0OIIO {
                public static final byte[] I000OiO = {115, 65, 108, 84};
                public short I00000oIO = 40;
                public byte[] I00000oOI;
                public final IoOi0looIo I0000Il00O;
                public boolean I0000O;
                public final Set I0000oI00;
                public boolean I0001Ioi1lo;
                public Il1IIl1 I000II;
                public IIi0I0I0o I000O01llI0;
                public IIi0I0I0o I000OOo1O;

                public Oii0OIIO() {
/* 10 */            IoOi0looIo ioOi0looIo = new IoOi0looIo();
/* 17 */            ioOi0looIo.I00iiO = new int[Barcode.FORMAT_QR_CODE];
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            this.I0000Il00O = ioOi0looIo;
/* 33 */            this.I0000oI00 = Collections.newSetFromMap(new IdentityHashMap());
/* 36 */            this.I000II = null;
                }

                public static boolean I000II(byte[] bArr, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) throws IOException {
/* 1 */             int length = bArr.length;
/* 2 */             while (length > 0) {
/* 6 */                 int i = byteArrayInputStream.read(bArr, bArr.length - length, length);
/* 10 */                if (i < 0) {
                            break;
                        }
/* 13 */                length -= i;
                    }
/* 19 */            if (length == 0) {
/* 21 */                return false;
                    }
/* 24 */            if (length == bArr.length) {
/* 26 */                return true;
                    }
/* 34 */            StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("AES initialization vector not fully read: only ", length, " bytes read instead of ");
/* 39 */            sbI00100o1O0lo.append(bArr.length);
/* 215 */           throw new IOException(sbI00100o1O0lo.toString());
                }

                public final void I00000oIO(IIOoOiOI iIOoOiOI, long j, long j2) {
/* 1 */             boolean z = iIOoOiOI instanceof IIi0l1;
/* 3 */             Set set = this.I0000oI00;
/* 5 */             if (!z) {
/* 113 */               if (iIOoOiOI instanceof IIi0io1lIo) {
/* 119 */                   if (set.contains(iIOoOiOI)) {
/* 215 */                       return;
                            }
/* 122 */                   set.add(iIOoOiOI);
/* 128 */                   I0000Il00O((IIi0io1lIo) iIOoOiOI, j, j2);
/* 131 */                   return;
                        }
/* 134 */               if (iIOoOiOI instanceof IIOoi0ooOoO) {
/* 139 */                   I00000oOI((IIOoi0ooOoO) iIOoOiOI, j, j2);
/* 142 */                   return;
                        }
/* 145 */               if (iIOoOiOI instanceof IIOoIilO) {
/* 147 */                   IIOoIilO iIOoIilO = (IIOoIilO) iIOoOiOI;
/* 156 */                   for (int i = 0; i < iIOoIilO.I00iOIl.size(); i++) {
/* 162 */                       I00000oIO(iIOoIilO.I00l0I0l0lO1(i), j, j2);
                            }
/* 215 */                   return;
                        }
/* 215 */               return;
                    }
/* 11 */            if (set.contains(iIOoOiOI)) {
/* 215 */               return;
                    }
/* 15 */            set.add(iIOoOiOI);
/* 18 */            IIi0l1 iIi0l1 = (IIi0l1) iIOoOiOI;
/* 28 */            if (IIi0I0I0o.I01io11il.equals(this.I000OOo1O)) {
/* 215 */               return;
                    }
/* 36 */            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(iIi0l1.I00iOIl);
/* 41 */            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 47 */                I0000O(j, j2, byteArrayInputStream, byteArrayOutputStream);
/* 60 */                iIi0l1.I00iOIl = (byte[]) byteArrayOutputStream.toByteArray().clone();
                    } catch (IOException e) {
/* 104 */               Log.e("PdfBox-Android", "Failed to decrypt COSString of length " + iIi0l1.I00iOIl.length + " in object " + j + ": " + e.getMessage());
                    }
                }

                public final void I00000oOI(IIOoi0ooOoO iIOoi0ooOoO, long j, long j2) {
                    Oii0OIIO oii0OIIO;
                    long j3;
                    long j4;
/* 7 */             if (iIOoi0ooOoO.I0100i(IIi0I0I0o.I010OIo1l) != null) {
/* 215 */               return;
                    }
/* 13 */            IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoO.I00oII(IIi0I0I0o.I0IilI00l);
/* 56 */            boolean z = IIi0I0I0o.I0IO10oI.equals(iIOoOiOII00oII) || IIi0I0I0o.I01Io000.equals(iIOoOiOII00oII) || ((iIOoi0ooOoO.I00oII(IIi0I0I0o.I011IO1I11OI) instanceof IIi0l1) && (iIOoi0ooOoO.I00oII(IIi0I0I0o.I00ooIo0) instanceof IIOoIilO));
/* 71 */            for (Map.Entry entry : iIOoi0ooOoO.I00iOIl.entrySet()) {
/* 79 */                if (!z || !IIi0I0I0o.I011IO1I11OI.equals(entry.getKey())) {
/* 99 */                    IIOoOiOI iIOoOiOI = (IIOoOiOI) entry.getValue();
/* 103 */                   if ((iIOoOiOI instanceof IIi0l1) || (iIOoOiOI instanceof IIOoIilO) || (iIOoOiOI instanceof IIOoi0ooOoO)) {
/* 113 */                       oii0OIIO = this;
/* 114 */                       j3 = j;
/* 115 */                       j4 = j2;
/* 121 */                       oii0OIIO.I00000oIO(iIOoOiOI, j3, j4);
                            } else {
/* 117 */                       oii0OIIO = this;
/* 118 */                       j3 = j;
/* 119 */                       j4 = j2;
                            }
/* 124 */                   this = oii0OIIO;
/* 125 */                   j = j3;
/* 126 */                   j2 = j4;
                        }
                    }
                }

                public final void I0000Il00O(IIi0io1lIo iIi0io1lIo, long j, long j2) {
/* 9 */             if (IIi0I0I0o.I01io11il.equals(this.I000O01llI0)) {
/* 39 */                return;
                    }
/* 14 */            IIi0I0I0o iIi0I0I0oI00o0iI0io1 = iIi0io1lIo.I00o0iI0io1(IIi0I0I0o.I0IilI00l);
/* 20 */            if ((this.I0000O || !IIi0I0I0o.I01oli0I.equals(iIi0I0I0oI00o0iI0io1)) && !IIi0I0I0o.I0Io0O1i.equals(iIi0I0I0oI00o0iI0io1)) {
/* 48 */                if (IIi0I0I0o.I01oli0I.equals(iIi0I0I0oI00o0iI0io1)) {
/* 50 */                    OOl1ilO oOl1ilOI010lI0oi = iIi0io1lIo.I010lI0oi();
/* 54 */                    int i = 10;
/* 56 */                    byte[] bArr = new byte[10];
/* 58 */                    while (i > 0) {
/* 62 */                        int i2 = oOl1ilOI010lI0oi.read(bArr, 10 - i, i);
/* 66 */                        if (i2 < 0) {
                                    break;
                                } else {
/* 69 */                            i -= i2;
                                }
                            }
/* 71 */                    oOl1ilOI010lI0oi.close();
/* 86 */                    if (Arrays.equals(bArr, "<?xpacket ".getBytes(IO1IIilll1I.I0000O))) {
/* 90 */                        Log.w("PdfBox-Android", "Metadata is not encrypted, but was expected to be");
/* 95 */                        Log.w("PdfBox-Android", "Read PDF specification about EncryptMetadata (default value: true)");
/* 98 */                        return;
                            }
                        }
/* 103 */               I00000oOI(iIi0io1lIo, j, j2);
/* 106 */               OOl1ilO oOl1ilOI010lI0oi2 = iIi0io1lIo.I010lI0oi();
/* 112 */               ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 115 */               io0iolo.I0000Il00O(oOl1ilOI010lI0oi2, byteArrayOutputStream);
/* 127 */               ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
/* 130 */               IIi0OI0 iIi0OI0I010o0o0oO = iIi0io1lIo.I010o0o0oO();
                        try {
                            try {
/* 134 */                       I0000O(j, j2, byteArrayInputStream, iIi0OI0I010o0o0oO);
/* 137 */                       iIi0OI0I010o0o0oO.close();
                            } catch (IOException e) {
/* 187 */                       Log.e("PdfBox-Android", e.getClass().getSimpleName() + " thrown when decrypting object " + j + " " + j2 + " obj");
/* 190 */                       throw e;
                            }
                        } catch (Throwable th) {
/* 191 */                   iIi0OI0I010o0o0oO.close();
/* 215 */                   throw th;
                        }
                    }
                }

                public final void I0000O(long j, long j2, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
/* 16 */            if (this.I0001Ioi1lo && this.I00000oOI.length == 32) {
/* 25 */                byte[] bArr = new byte[16];
/* 31 */                if (I000II(bArr, byteArrayInputStream, outputStream)) {
                            try {
/* 35 */                        byte[] bArr2 = this.I00000oOI;
/* 37 */                        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
/* 51 */                        cipher.init(2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr));
/* 56 */                        CipherInputStream cipherInputStream = new CipherInputStream(byteArrayInputStream, cipher);
                                try {
                                    try {
/* 59 */                                io0iolo.I0000Il00O(cipherInputStream, outputStream);
                                    } finally {
/* 80 */                                cipherInputStream.close();
                                    }
                                } catch (IOException e) {
/* 76 */                            if (!(e.getCause() instanceof GeneralSecurityException)) {
/* 79 */                                throw e;
                                    }
                                }
                            } catch (GeneralSecurityException e2) {
/* 90 */                        throw new IOException(e2);
                            }
                        }
                    } else {
/* 91 */                byte[] bArr3 = this.I00000oOI;
/* 93 */                int length = bArr3.length;
/* 94 */                int i = length + 5;
/* 96 */                byte[] bArr4 = new byte[i];
/* 100 */               System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
/* 109 */               bArr4[length] = (byte) (j & 255);
/* 120 */               bArr4[length + 1] = (byte) ((j >> 8) & 255);
/* 129 */               bArr4[length + 2] = (byte) ((j >> 16) & 255);
/* 137 */               bArr4[length + 3] = (byte) (j2 & 255);
/* 146 */               bArr4[length + 4] = (byte) ((j2 >> 8) & 255);
/* 148 */               MessageDigest messageDigestI00000oIO = l1O0OOOl1.I00000oIO();
/* 152 */               messageDigestI00000oIO.update(bArr4);
/* 157 */               if (this.I0001Ioi1lo) {
/* 161 */                   messageDigestI00000oIO.update(I000OiO);
                        }
/* 164 */               byte[] bArrDigest = messageDigestI00000oIO.digest();
/* 168 */               int iMin = Math.min(i, 16);
/* 172 */               byte[] bArr5 = new byte[iMin];
/* 174 */               System.arraycopy(bArrDigest, 0, bArr5, 0, iMin);
/* 179 */               if (this.I0001Ioi1lo) {
/* 181 */                   byte[] bArr6 = new byte[16];
/* 187 */                   if (I000II(bArr6, byteArrayInputStream, outputStream)) {
                                try {
/* 190 */                           Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
/* 204 */                           cipher2.init(2, new SecretKeySpec(bArr5, "AES"), new IvParameterSpec(bArr6));
/* 209 */                           byte[] bArr7 = new byte[Barcode.FORMAT_QR_CODE];
                                    while (true) {
/* 211 */                               int i2 = byteArrayInputStream.read(bArr7);
/* 216 */                               if (i2 == -1) {
                                            break;
                                        }
/* 218 */                               byte[] bArrUpdate = cipher2.update(bArr7, 0, i2);
/* 222 */                               if (bArrUpdate != null) {
/* 224 */                                   outputStream.write(bArrUpdate);
                                        }
                                    }
/* 232 */                           outputStream.write(cipher2.doFinal());
                                } catch (GeneralSecurityException e3) {
/* 242 */                           throw new IOException(e3);
                                }
                            }
                        } else {
/* 243 */                   I0000oI00(bArr5, byteArrayInputStream, outputStream);
                        }
                    }
/* 246 */           outputStream.flush();
                }

                public final void I0000oI00(byte[] bArr, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) throws IOException {
/* 1 */             IoOi0looIo ioOi0looIo = this.I0000Il00O;
/* 3 */             ioOi0looIo.I00111O(bArr);
/* 8 */             byte[] bArr2 = new byte[Barcode.FORMAT_UPC_E];
                    while (true) {
/* 10 */                int i = byteArrayInputStream.read(bArr2);
/* 15 */                if (i == -1) {
/* 215 */                   return;
                        }
/* 18 */                for (int i2 = 0; i2 < i; i2++) {
/* 22 */                    ioOi0looIo.I001IIilI0O(bArr2[i2], outputStream);
                        }
                    }
                }

                public final void I0001Ioi1lo(byte[] bArr, byte[] bArr2, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
/* 1 */             IoOi0looIo ioOi0looIo = this.I0000Il00O;
/* 3 */             ioOi0looIo.I00111O(bArr);
/* 8 */             for (byte b : bArr2) {
/* 12 */                ioOi0looIo.I001IIilI0O(b, byteArrayOutputStream);
                    }
                }

                public abstract void I000O01llI0(OIliiIOOiI1l oIliiIOOiI1l, IIOoIilO iIOoIilO, il0ilo0 il0ilo0Var);
            }
