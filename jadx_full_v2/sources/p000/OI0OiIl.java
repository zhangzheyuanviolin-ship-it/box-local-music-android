            package p000;
            
            public abstract class OI0OiIl {
                public static final long I00000oIO = lOlilO1lOIO.I0000O(14);

                public static final long I00000oIO(long j, long j2) {
/* 5 */             if (!Oo0o1OiIo.I0000oI00(j2)) {
/* 88 */                I000II.I000iOII(IlIi0I0.I000lI("The multiplier must be in em, but was ", Oo0o1OiIo.I0001Ioi1lo(j2), "."));
/* 91 */                return 0L;
                    }
/* 11 */            if (Oo0o1OiIo.I0000oI00(j)) {
/* 70 */                I000II.I001IO000(IlIi0I0.I000lI("Cannot convert Em to Px when style.fontSize is Em (", Oo0o1OiIo.I0001Ioi1lo(j2), "). Please declare the style.fontSize with Sp units instead."));
/* 73 */                return 0L;
                    }
/* 18 */            long j3 = j & 1095216660480L;
/* 24 */            if (j3 != 0) {
/* 41 */                float fI0000O = Oo0o1OiIo.I0000O(j2);
/* 45 */                lOlilO1lOIO.I00000oIO(j);
/* 53 */                return lOlilO1lOIO.I0000oI00(Oo0o1OiIo.I0000O(j) * fI0000O, j3);
                    }
/* 26 */            float fI0000O2 = Oo0o1OiIo.I0000O(j2);
/* 30 */            long j4 = I00000oIO;
/* 32 */            lOlilO1lOIO.I00000oIO(j4);
/* 36 */            return IlIi0I0.I0000O(fI0000O2, j4, 1095216660480L & j4);
                }
            }
