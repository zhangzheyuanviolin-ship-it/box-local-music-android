            package p000;

            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.security.cert.X509Certificate;
            
            public abstract class iOl1OO {
                public static String I00000oIO(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
/* 5 */             StringBuilder sb = new StringBuilder("sha256/");
/* 12 */            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
/* 16 */            int length = encoded.length;
/* 22 */            iO1oO1OoOoii.I00000oOI(encoded.length, 0L, length);
/* 25 */            int i = 0;
/* 26 */            byte[] bArrI00100l0 = I1IoiO1l.I00100l0(encoded, 0, length);
/* 32 */            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 37 */            messageDigest.update(bArrI00100l0, 0, bArrI00100l0.length);
/* 40 */            byte[] bArrDigest = messageDigest.digest();
/* 44 */            byte[] bArr = I00000oIO.I00000oIO;
/* 53 */            byte[] bArr2 = new byte[((bArrDigest.length + 2) / 3) * 4];
/* 59 */            int length2 = bArrDigest.length - (bArrDigest.length % 3);
/* 60 */            int i2 = 0;
/* 61 */            while (i < length2) {
/* 65 */                byte b = bArrDigest[i];
/* 67 */                int i3 = i + 2;
/* 69 */                byte b2 = bArrDigest[i + 1];
/* 71 */                i += 3;
/* 73 */                byte b3 = bArrDigest[i3];
/* 82 */                bArr2[i2] = bArr[(b & 255) >> 2];
/* 97 */                bArr2[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
/* 99 */                int i4 = i2 + 3;
/* 111 */               bArr2[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
/* 113 */               i2 += 4;
/* 119 */               bArr2[i4] = bArr[b3 & 63];
                    }
/* 123 */           int length3 = bArrDigest.length - length2;
/* 127 */           if (length3 == 1) {
/* 174 */               byte b4 = bArrDigest[i];
/* 184 */               bArr2[i2] = bArr[(b4 & 255) >> 2];
/* 194 */               bArr2[i2 + 1] = bArr[(b4 & 3) << 4];
/* 198 */               bArr2[i2 + 2] = 61;
/* 200 */               bArr2[i2 + 3] = 61;
                    } else if (length3 == 2) {
/* 132 */               int i5 = i + 1;
/* 134 */               byte b5 = bArrDigest[i];
/* 136 */               byte b6 = bArrDigest[i5];
/* 145 */               bArr2[i2] = bArr[(b5 & 255) >> 2];
/* 160 */               bArr2[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
/* 169 */               bArr2[i2 + 2] = bArr[(b6 & 15) << 2];
/* 171 */               bArr2[i2 + 3] = 61;
                    }
/* 209 */           sb.append(new String(bArr2, IO1IOI.I00000oIO));
/* 212 */           return sb.toString();
                }
            }
