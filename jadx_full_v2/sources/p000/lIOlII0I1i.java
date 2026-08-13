            package p000;

            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.concurrent.Callable;
            
            public final class lIOlII0I1i implements Callable {
                public boolean I00000oIO;
                public String I00000oOI;
                public l1oliollOo I0000Il00O;

                @Override
                public final Object call() throws NoSuchAlgorithmException {
                    MessageDigest messageDigest;
/* 1 */             boolean z = this.I00000oIO;
/* 3 */             String str = this.I00000oOI;
/* 5 */             l1oliollOo l1oliolloo = this.I0000Il00O;
/* 22 */            String str2 = (z || !li0iOI11O1lI.I00000oOI(str, l1oliolloo, true, false).I00000oOI) ? "not allowed" : "debug cert rejected";
/* 26 */            int i = 0;
                    while (true) {
/* 28 */                if (i >= 2) {
/* 39 */                    messageDigest = null;
                            break;
                        }
                        try {
/* 30 */                    messageDigest = MessageDigest.getInstance("SHA-256");
                        } catch (NoSuchAlgorithmException unused) {
                        }
/* 34 */                if (messageDigest != null) {
                            break;
                        }
/* 36 */                i++;
                    }
/* 40 */            lII0I0I000I.I000II(messageDigest);
/* 45 */            byte[] bArrDigest = messageDigest.digest(l1oliolloo.I000OOo1O);
/* 49 */            int length = bArrDigest.length;
/* 51 */            char[] cArr = new char[length + length];
/* 53 */            int i2 = 0;
/* 55 */            for (byte b : bArrDigest) {
/* 65 */                char[] cArr2 = iIo0Ioi1lIl.I00000oOI;
/* 69 */                cArr[i2] = cArr2[(b & 255) >>> 4];
/* 75 */                cArr[i2 + 1] = cArr2[b & 15];
/* 77 */                i2 += 2;
                    }
/* 90 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O(str2, ": pkg=", str, ", sha256=", new String(cArr));
/* 96 */            sbI00111O.append(", atk=");
/* 99 */            sbI00111O.append(z);
/* 104 */           sbI00111O.append(", ver=12451000.false");
/* 107 */           return sbI00111O.toString();
                }
            }
