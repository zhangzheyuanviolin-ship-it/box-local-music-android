            package p000;
            
            public abstract class lOlII1lolOiO {
                public static final I1111OO10i I00000oIO(Oo0OI01Il oo0OI01Il) {
/* 1 */             I1111OO10i i1111OO10i = oo0OI01Il.I00000oIO;
/* 3 */             long j = oo0OI01Il.I00000oOI;
/* 5 */             i1111OO10i.getClass();
/* 16 */            return i1111OO10i.subSequence(Oo0lI00l.I000II(j), Oo0lI00l.I0001Ioi1lo(j));
                }

                public static final I1111OO10i I00000oOI(Oo0OI01Il oo0OI01Il, int i) {
/* 1 */             I1111OO10i i1111OO10i = oo0OI01Il.I00000oIO;
/* 3 */             I1111OO10i i1111OO10i2 = oo0OI01Il.I00000oIO;
/* 5 */             long j = oo0OI01Il.I00000oOI;
/* 7 */             int iI0001Ioi1lo = Oo0lI00l.I0001Ioi1lo(j);
/* 11 */            int iI0001Ioi1lo2 = Oo0lI00l.I0001Ioi1lo(j);
/* 15 */            int length = iI0001Ioi1lo2 + i;
/* 20 */            if (((i ^ length) & (iI0001Ioi1lo2 ^ length)) < 0) {
/* 24 */                length = i1111OO10i2.I00iiI.length();
                    }
/* 38 */            return i1111OO10i.subSequence(iI0001Ioi1lo, Math.min(length, i1111OO10i2.I00iiI.length()));
                }

                public static final I1111OO10i I0000Il00O(Oo0OI01Il oo0OI01Il, int i) {
/* 1 */             I1111OO10i i1111OO10i = oo0OI01Il.I00000oIO;
/* 3 */             long j = oo0OI01Il.I00000oOI;
/* 5 */             int iI000II = Oo0lI00l.I000II(j);
/* 9 */             int i2 = iI000II - i;
/* 15 */            if (((iI000II ^ i2) & (i ^ iI000II)) < 0) {
/* 17 */                i2 = 0;
                    }
/* 26 */            return i1111OO10i.subSequence(Math.max(0, i2), Oo0lI00l.I000II(j));
                }
            }
