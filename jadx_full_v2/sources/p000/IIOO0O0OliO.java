            package p000;

            import java.io.IOException;
            
            public final class IIOO0O0OliO extends Ii11iIi {
                public final int I000OiO() throws IOException {
/* 1 */             int iI0001Ioi1lo = I0001Ioi1lo();
/* 6 */             if (iI0001Ioi1lo >= 1 && iI0001Ioi1lo <= 4) {
/* 11 */                return iI0001Ioi1lo;
                    }
/* 18 */            StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Illegal (< 1 or > 4) offSize value ", iI0001Ioi1lo, " in CFF font at position ");
/* 25 */            sbI00100o1O0lo.append(this.I0000Il00O - 1);
/* 113 */           throw new IOException(sbI00100o1O0lo.toString());
                }
            }
