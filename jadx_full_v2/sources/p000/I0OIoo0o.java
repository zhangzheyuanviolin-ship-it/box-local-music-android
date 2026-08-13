            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Arrays;
            import java.util.Iterator;
            
            public final class I0OIoo0o implements I0OIilIIo0 {
                public IOO000ilo I00000oIO;
                public iolOOiI I00000oOI;
                public iolOOiI I0000Il00O;

                @Override
                public final byte[] I00000oIO(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             iolOOiI iolooii = this.I00000oOI;
/* 7 */             OOIiiiO oOIiiiO = (OOIiiiO) this.I00000oIO.I00iiO;
                    try {
/* 9 */                 byte[] bArr3 = oOIiiiO.I0000Il00O;
/* 32 */                byte[] bArrI00000oIO = iOiiIOilI1.I00000oIO(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((I0OIilIIo0) oOIiiiO.I00000oOI).I00000oIO(bArr, bArr2));
/* 36 */                int i = oOIiiiO.I0001Ioi1lo;
/* 38 */                int length = bArr.length;
/* 39 */                iolooii.getClass();
/* 42 */                return bArrI00000oIO;
                    } catch (GeneralSecurityException e) {
/* 44 */                iolooii.getClass();
/* 89 */                throw e;
                    }
                }

                @Override
                public final byte[] I00000oOI(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             IOO000ilo iOO000ilo = this.I00000oIO;
/* 3 */             iolOOiI iolooii = this.I0000Il00O;
/* 7 */             if (bArr.length > 5) {
/* 9 */                 byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
/* 14 */                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
/* 22 */                Iterator it = iOO000ilo.I001i1lo1io(bArrCopyOf).iterator();
/* 30 */                while (it.hasNext()) {
                            try {
/* 42 */                        byte[] bArrI00000oOI = ((I0OIilIIo0) ((OOIiiiO) it.next()).I00000oOI).I00000oOI(bArrCopyOfRange, bArr2);
/* 46 */                        iolooii.getClass();
/* 49 */                        return bArrI00000oOI;
                            } catch (GeneralSecurityException e) {
/* 67 */                        I0OO01.I00000oIO.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                            }
                        }
                    }
/* 77 */            Iterator it2 = iOO000ilo.I001i1lo1io(iIIl1o1Iiol.I00000oIO).iterator();
/* 85 */            while (it2.hasNext()) {
                        try {
/* 97 */                    byte[] bArrI00000oOI2 = ((I0OIilIIo0) ((OOIiiiO) it2.next()).I00000oOI).I00000oOI(bArr, bArr2);
/* 101 */                   iolooii.getClass();
/* 104 */                   return bArrI00000oOI2;
                        } catch (GeneralSecurityException unused) {
                        }
                    }
/* 105 */           iolooii.getClass();
/* 110 */           IioIoO10iOiI.I000oI1ioi("decryption failed");
/* 113 */           return null;
                }
            }
