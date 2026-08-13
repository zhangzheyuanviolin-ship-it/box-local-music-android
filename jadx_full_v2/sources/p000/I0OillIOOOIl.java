            package p000;

            import java.security.GeneralSecurityException;
            import javax.crypto.Cipher;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            
            public final class I0OillIOOOIl {
                public static final I0OiiiO I0000O = new I0OiiiO(0);
                public SecretKeySpec I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;

                public final void I00000oIO(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
/* 7 */             Cipher cipher = (Cipher) I0000O.get();
/* 11 */            byte[] bArr4 = new byte[this.I0000Il00O];
/* 16 */            System.arraycopy(bArr3, 0, bArr4, 0, this.I00000oOI);
/* 21 */            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
/* 24 */            SecretKeySpec secretKeySpec = this.I00000oIO;
/* 26 */            if (z) {
/* 29 */                cipher.init(1, secretKeySpec, ivParameterSpec);
                    } else {
/* 35 */                cipher.init(2, secretKeySpec, ivParameterSpec);
                    }
/* 43 */            if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
/* 45 */                return;
                    }
/* 48 */            IioIoO10iOiI.I000oI1ioi("stored output's length does not match input's length");
                }
            }
