            package p000;

            import java.security.GeneralSecurityException;
            import javax.crypto.Mac;
            import javax.crypto.spec.SecretKeySpec;
            
            public abstract class iloIiOoiI {
                public static byte[] I00000oIO(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws IllegalStateException, GeneralSecurityException {
/* 9 */             Mac mac = (Mac) Il0O1l0i.I0000Il00O.I00000oIO.I00IO1oi11O(str);
/* 17 */            if (i > mac.getMacLength() * 255) {
/* 98 */                IioIoO10iOiI.I000oI1ioi("size too large");
/* 101 */               return null;
                    }
/* 20 */            if (bArr2.length == 0) {
/* 33 */                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
                    } else {
/* 42 */                mac.init(new SecretKeySpec(bArr2, str));
                    }
/* 49 */            byte[] bArr4 = new byte[i];
/* 56 */            mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
/* 60 */            byte[] bArrDoFinal = new byte[0];
/* 62 */            int i2 = 1;
/* 63 */            int length = 0;
                    while (true) {
/* 64 */                mac.update(bArrDoFinal);
/* 67 */                mac.update(bArr3);
/* 71 */                mac.update((byte) i2);
/* 74 */                bArrDoFinal = mac.doFinal();
/* 80 */                if (bArrDoFinal.length + length >= i) {
/* 92 */                    System.arraycopy(bArrDoFinal, 0, bArr4, length, i - length);
/* 95 */                    return bArr4;
                        }
/* 83 */                System.arraycopy(bArrDoFinal, 0, bArr4, length, bArrDoFinal.length);
/* 87 */                length += bArrDoFinal.length;
/* 88 */                i2++;
                    }
                }
            }
