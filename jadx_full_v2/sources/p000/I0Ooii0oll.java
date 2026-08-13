            package p000;

            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.InvalidKeyException;
            import java.security.NoSuchAlgorithmException;
            import java.security.ProviderException;
            import java.security.spec.AlgorithmParameterSpec;
            import java.util.Arrays;
            import javax.crypto.AEADBadTagException;
            import javax.crypto.Cipher;
            import javax.crypto.NoSuchPaddingException;
            import javax.crypto.SecretKey;
            import javax.crypto.spec.GCMParameterSpec;
            
            public final class I0Ooii0oll implements I0OIilIIo0 {
                public final int I00000oIO;
                public Object I00000oOI;

                public I0Ooii0oll(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final byte[] I00000oIO(byte[] bArr, byte[] bArr2) {
                    switch (this.I00000oIO) {
                        case 0:
/* 92 */                    byte[] bArrI00000oIO = OOl1iO0l.I00000oIO(12);
/* 98 */                    Ioo01l1iOOiI ioo01l1iOOiI = (Ioo01l1iOOiI) this.I00000oOI;
/* 100 */                   boolean z = ioo01l1iOOiI.I00000oOI;
/* 104 */                   if (bArrI00000oIO.length != 12) {
/* 211 */                       IioIoO10iOiI.I000oI1ioi("iv is wrong size");
/* 103 */                       return null;
                            }
/* 110 */                   if (bArr.length > 2147483619) {
/* 205 */                       IioIoO10iOiI.I000oI1ioi("plaintext too long");
/* 103 */                       return null;
                            }
/* 121 */                   byte[] bArr3 = new byte[z ? bArr.length + 28 : bArr.length + 16];
/* 124 */                   if (z) {
/* 126 */                       System.arraycopy(bArrI00000oIO, 0, bArr3, 0, 12);
                            }
/* 129 */                   AlgorithmParameterSpec algorithmParameterSpecI00000oIO = Ioo01l1iOOiI.I00000oIO(bArrI00000oIO);
/* 133 */                   I0OiiiO i0OiiiO = Ioo01l1iOOiI.I0000Il00O;
/* 144 */                   ((Cipher) i0OiiiO.get()).init(1, ioo01l1iOOiI.I00000oIO, algorithmParameterSpecI00000oIO);
/* 147 */                   if (bArr2 != null && bArr2.length != 0) {
/* 158 */                       ((Cipher) i0OiiiO.get()).updateAAD(bArr2);
                            }
/* 176 */                   int iDoFinal = ((Cipher) i0OiiiO.get()).doFinal(bArr, 0, bArr.length, bArr3, z ? 12 : 0);
/* 183 */                   if (iDoFinal == bArr.length + 16) {
/* 185 */                       return bArr3;
                            }
/* 202 */                   throw new GeneralSecurityException(IIlIOloOOO.I00100l0("encryption failed; GCM tag must be 16 bytes, but got only ", iDoFinal - bArr.length, " bytes"));
                        case 1:
                            try {
/* 62 */                        return I0000O(bArr, bArr2);
                            } catch (GeneralSecurityException | ProviderException e) {
/* 72 */                        Log.w("I0Ooii0oll", "encountered a potentially transient KeyStore error, will wait and retry", e);
                                try {
/* 84 */                            Thread.sleep((int) (Math.random() * 100.0d));
                                } catch (InterruptedException unused) {
                                }
/* 87 */                        return this.I0000O(bArr, bArr2);
                            }
                        case 2:
/* 39 */                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
/* 43 */                    byte[] bArrI00000oIO2 = OOl1iO0l.I00000oIO(12);
/* 47 */                    byteBufferAllocate.put(bArrI00000oIO2);
/* 54 */                    ((Ioo0ilOlI) this.I00000oOI).I000OiO(byteBufferAllocate, bArrI00000oIO2, bArr, bArr2);
/* 57 */                    return byteBufferAllocate.array();
                        default:
/* 11 */                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
/* 17 */                    byte[] bArrI00000oIO3 = OOl1iO0l.I00000oIO(24);
/* 21 */                    byteBufferAllocate2.put(bArrI00000oIO3);
/* 28 */                    ((Ioo0ilOlI) this.I00000oOI).I000OiO(byteBufferAllocate2, bArrI00000oIO3, bArr, bArr2);
/* 31 */                    return byteBufferAllocate2.array();
                    }
                }

                @Override
                public final byte[] I00000oOI(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, InterruptedException {
                    switch (this.I00000oIO) {
                        case 0:
/* 108 */                   byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
/* 114 */                   Ioo01l1iOOiI ioo01l1iOOiI = (Ioo01l1iOOiI) this.I00000oOI;
/* 116 */                   boolean z = ioo01l1iOOiI.I00000oOI;
/* 119 */                   if (bArrCopyOf.length != 12) {
/* 209 */                       IioIoO10iOiI.I000oI1ioi("iv is wrong size");
/* 9 */                         return null;
                            }
/* 127 */                   if (bArr.length < (z ? 28 : 16)) {
/* 203 */                       IioIoO10iOiI.I000oI1ioi("ciphertext too short");
/* 9 */                         return null;
                            }
/* 130 */                   if (z && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
/* 149 */                       IioIoO10iOiI.I000oI1ioi("iv does not match prepended iv");
/* 9 */                         return null;
                            }
/* 153 */                   AlgorithmParameterSpec algorithmParameterSpecI00000oIO = Ioo01l1iOOiI.I00000oIO(bArrCopyOf);
/* 157 */                   I0OiiiO i0OiiiO = Ioo01l1iOOiI.I0000Il00O;
/* 168 */                   ((Cipher) i0OiiiO.get()).init(2, ioo01l1iOOiI.I00000oIO, algorithmParameterSpecI00000oIO);
/* 171 */                   if (bArr2 != null && bArr2.length != 0) {
/* 182 */                       ((Cipher) i0OiiiO.get()).updateAAD(bArr2);
                            }
/* 185 */                   int i = z ? 12 : 0;
/* 188 */                   int length = bArr.length;
/* 189 */                   if (z) {
/* 191 */                       length -= 12;
                            }
/* 198 */                   return ((Cipher) i0OiiiO.get()).doFinal(bArr, i, length);
                        case 1:
/* 70 */                    if (bArr.length < 28) {
/* 104 */                       IioIoO10iOiI.I000oI1ioi("ciphertext too short");
/* 9 */                         return null;
                            }
                            try {
/* 72 */                        return I0000Il00O(bArr, bArr2);
                            } catch (AEADBadTagException e) {
/* 103 */                       throw e;
                            } catch (GeneralSecurityException | ProviderException e2) {
/* 82 */                        Log.w("I0Ooii0oll", "encountered a potentially transient KeyStore error, will wait and retry", e2);
                                try {
/* 94 */                            Thread.sleep((int) (Math.random() * 100.0d));
                                } catch (InterruptedException unused) {
                                }
/* 97 */                        return I0000Il00O(bArr, bArr2);
                            }
                        case 2:
/* 44 */                    if (bArr.length >= 28) {
/* 60 */                        return ((Ioo0ilOlI) this.I00000oOI).I000OOo1O(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
                            }
/* 65 */                    IioIoO10iOiI.I000oI1ioi("ciphertext too short");
/* 9 */                     return null;
                        default:
/* 16 */                    if (bArr.length >= 40) {
/* 34 */                        return ((Ioo0ilOlI) this.I00000oOI).I000OOo1O(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
                            }
/* 39 */                    IioIoO10iOiI.I000oI1ioi("ciphertext too short");
/* 9 */                     return null;
                    }
                }

                public byte[] I0000Il00O(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
/* 8 */             GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(Barcode.FORMAT_ITF, bArr, 0, 12);
/* 13 */            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
/* 22 */            cipher.init(2, (SecretKey) this.I00000oOI, gCMParameterSpec);
/* 25 */            cipher.updateAAD(bArr2);
/* 30 */            return cipher.doFinal(bArr, 12, bArr.length - 12);
                }

                public byte[] I0000O(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 5 */             if (bArr.length > 2147483619) {
/* 50 */                IioIoO10iOiI.I000oI1ioi("plaintext too long");
/* 53 */                return null;
                    }
/* 10 */            byte[] bArr3 = new byte[bArr.length + 28];
/* 14 */            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
/* 23 */            cipher.init(1, (SecretKey) this.I00000oOI);
/* 26 */            cipher.updateAAD(bArr2);
/* 34 */            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
/* 44 */            System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
/* 47 */            return bArr3;
                }
            }
