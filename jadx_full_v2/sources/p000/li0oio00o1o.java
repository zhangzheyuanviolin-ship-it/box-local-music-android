            package p000;

            import java.io.EOFException;
            
            public abstract class li0oio00o1o {
                public static final String I00000oIO(III1oo00i1li iII1oo00i1li, long j) throws EOFException {
/* 5 */             if (j == 0) {
/* 7 */                 return "";
                    }
/* 10 */            Oii1O1l oii1O1l = iII1oo00i1li.I00iOIl;
/* 12 */            if (oii1O1l == null) {
/* 57 */                I000II.I001IO000("Unreacheable");
/* 60 */                return null;
                    }
/* 21 */            if (oii1O1l.I00000oIO() < j) {
/* 44 */                byte[] bArrI00000oOI = lOO1Ill.I00000oOI(iII1oo00i1li, (int) j);
/* 50 */                return liIilo01o.I00000oIO(bArrI00000oOI, 0, bArrI00000oOI.length);
                    }
/* 23 */            byte[] bArr = oii1O1l.I00000oIO;
/* 25 */            int i = oii1O1l.I00000oOI;
/* 35 */            String strI00000oIO = liIilo01o.I00000oIO(bArr, i, Math.min(oii1O1l.I0000Il00O, ((int) j) + i));
/* 39 */            iII1oo00i1li.skip(j);
/* 42 */            return strI00000oIO;
                }
            }
