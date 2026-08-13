            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.security.GeneralSecurityException;
            import java.security.spec.AlgorithmParameterSpec;
            import javax.crypto.Cipher;
            import javax.crypto.spec.GCMParameterSpec;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            
            public final class I0i01110lolO implements I0OIilIIo0 {
                public static final I0OiiiO I00000oOI = new I0OiiiO(3);
                public SecretKeySpec I00000oIO;

                public static AlgorithmParameterSpec I0000Il00O(int i, byte[] bArr) throws GeneralSecurityException, ClassNotFoundException {
                    try {
/* 4 */                 Class.forName("javax.crypto.spec.GCMParameterSpec");
/* 11 */                return new GCMParameterSpec(Barcode.FORMAT_ITF, bArr, 0, i);
                    } catch (ClassNotFoundException unused) {
/* 27 */                if ("The Android Project".equals(System.getProperty("java.vendor"))) {
/* 31 */                    return new IvParameterSpec(bArr, 0, i);
                        }
/* 37 */                IioIoO10iOiI.I000oI1ioi("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
/* 40 */                return null;
                    }
                }

                @Override
                public final byte[] I00000oIO(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
/* 5 */             if (bArr.length > 2147483619) {
/* 95 */                IioIoO10iOiI.I000oI1ioi("plaintext too long");
/* 98 */                return null;
                    }
/* 10 */            byte[] bArr3 = new byte[bArr.length + 28];
/* 14 */            byte[] bArrI00000oIO = OOl1iO0l.I00000oIO(12);
/* 19 */            System.arraycopy(bArrI00000oIO, 0, bArr3, 0, 12);
/* 23 */            AlgorithmParameterSpec algorithmParameterSpecI0000Il00O = I0000Il00O(bArrI00000oIO.length, bArrI00000oIO);
/* 27 */            I0OiiiO i0OiiiO = I00000oOI;
/* 38 */            ((Cipher) i0OiiiO.get()).init(1, this.I00000oIO, algorithmParameterSpecI0000Il00O);
/* 41 */            if (bArr2 != null && bArr2.length != 0) {
/* 52 */                ((Cipher) i0OiiiO.get()).updateAAD(bArr2);
                    }
/* 67 */            int iDoFinal = ((Cipher) i0OiiiO.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
/* 74 */            if (iDoFinal == bArr.length + 16) {
/* 76 */                return bArr3;
                    }
/* 92 */            throw new GeneralSecurityException(IIlIOloOOO.I00100l0("encryption failed; GCM tag must be 16 bytes, but got only ", iDoFinal - bArr.length, " bytes"));
                }

                @Override
                public final byte[] I00000oOI(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
/* 4 */             if (bArr.length < 28) {
/* 55 */                IioIoO10iOiI.I000oI1ioi("ciphertext too short");
/* 58 */                return null;
                    }
/* 8 */             AlgorithmParameterSpec algorithmParameterSpecI0000Il00O = I0000Il00O(12, bArr);
/* 12 */            I0OiiiO i0OiiiO = I00000oOI;
/* 23 */            ((Cipher) i0OiiiO.get()).init(2, this.I00000oIO, algorithmParameterSpecI0000Il00O);
/* 26 */            if (bArr2 != null && bArr2.length != 0) {
/* 37 */                ((Cipher) i0OiiiO.get()).updateAAD(bArr2);
                    }
/* 48 */            return ((Cipher) i0OiiiO.get()).doFinal(bArr, 12, bArr.length - 12);
                }
            }
