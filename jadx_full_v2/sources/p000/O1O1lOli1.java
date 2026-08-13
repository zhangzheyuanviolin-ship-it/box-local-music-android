            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Arrays;
            import java.util.Iterator;
            
            public final class O1O1lOli1 implements O1O1I111l {
                public IOO000ilo I00000oIO;
                public iolOOiI I00000oOI;
                public iolOOiI I0000Il00O;

                @Override
                public final void I00000oIO(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             IOO000ilo iOO000ilo = this.I00000oIO;
/* 3 */             iolOOiI iolooii = this.I0000Il00O;
/* 7 */             if (bArr.length <= 5) {
/* 134 */               iolooii.getClass();
/* 139 */               IioIoO10iOiI.I000oI1ioi("tag too short");
/* 551 */               return;
                    }
/* 9 */             byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
/* 14 */            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
/* 30 */            for (OOIiiiO oOIiiiO : iOO000ilo.I001i1lo1io(bArrCopyOf)) {
                        try {
/* 64 */                    ((O1O1I111l) oOIiiiO.I00000oOI).I00000oIO(bArrCopyOfRange, oOIiiiO.I0000oI00.equals(OIl1lli.LEGACY) ? iOiiIOilI1.I00000oIO(bArr2, O1O1lioo.I00000oOI) : bArr2);
/* 67 */                    iolooii.getClass();
/* 124 */                   return;
                        } catch (GeneralSecurityException e) {
/* 88 */                    O1O1lioo.I00000oIO.info("tag prefix matches a key, but cannot verify: " + e);
                        }
                    }
/* 98 */            Iterator it = iOO000ilo.I001i1lo1io(iIIl1o1Iiol.I00000oIO).iterator();
/* 106 */           while (it.hasNext()) {
                        try {
/* 118 */                   ((O1O1I111l) ((OOIiiiO) it.next()).I00000oOI).I00000oIO(bArr, bArr2);
/* 121 */                   iolooii.getClass();
/* 124 */                   return;
                        } catch (GeneralSecurityException unused) {
                        }
                    }
/* 125 */           iolooii.getClass();
/* 130 */           IioIoO10iOiI.I000oI1ioi("invalid MAC");
                }

                @Override
                public final byte[] I00000oOI(byte[] bArr) throws GeneralSecurityException {
/* 1 */             iolOOiI iolooii = this.I00000oOI;
/* 7 */             OOIiiiO oOIiiiO = (OOIiiiO) this.I00000oIO.I00iiO;
/* 17 */            if (oOIiiiO.I0000oI00.equals(OIl1lli.LEGACY)) {
/* 25 */                bArr = iOiiIOilI1.I00000oIO(bArr, O1O1lioo.I00000oOI);
                    }
                    try {
/* 29 */                byte[] bArr2 = oOIiiiO.I0000Il00O;
/* 52 */                byte[] bArrI00000oIO = iOiiIOilI1.I00000oIO(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((O1O1I111l) oOIiiiO.I00000oOI).I00000oOI(bArr));
/* 56 */                int i = oOIiiiO.I0001Ioi1lo;
/* 58 */                iolooii.getClass();
/* 61 */                return bArrI00000oIO;
                    } catch (GeneralSecurityException e) {
/* 63 */                iolooii.getClass();
/* 186 */               throw e;
                    }
                }
            }
