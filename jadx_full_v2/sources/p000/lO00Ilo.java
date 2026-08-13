            package p000;
            
            public abstract class lO00Ilo {
                /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final float I00000oIO(OO11o0IO oO11o0IO, boolean z, IoI1O1i1[] ioI1O1i1Arr, float f) {
/* 2 */             float f2 = Float.NaN;
/* 6 */             for (IoI1O1i1 ioI1O1i1 : ioI1O1i1Arr) {
/* 10 */                float fI00000oOI = oO11o0IO.I00000oOI(ioI1O1i1);
/* 18 */                if (Float.isNaN(f2)) {
/* 29 */                    f2 = fI00000oOI;
                        } else if (z == (fI00000oOI > f2)) {
                        }
                    }
                    return Float.isNaN(f2) ? f : f2;
                }
            }
