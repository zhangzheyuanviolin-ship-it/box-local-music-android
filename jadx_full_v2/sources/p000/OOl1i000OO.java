            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class OOl1i000OO {
                public static final I01Io1ilOIIo I00iOIl;

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    OO1Oi0i11 oO1Oi0i11;
/* 1 */             Integer num = O00OIi1.I00000oIO;
/* 3 */             if (num == null || num.intValue() >= 34) {
/* 34 */                oO1Oi0i11 = new OO1Oi0i11();
                    } else {
/* 16 */                IlII1iiOOO ilII1iiOOO = new IlII1iiOOO();
/* 26 */                ilII1iiOOO.I00iiI = new I0OiiiO(9);
/* 28 */                VarHandle.storeStoreFence();
                        oO1Oi0i11 = ilII1iiOOO;
                    }
/* 37 */            I00iOIl = oO1Oi0i11;
                }

                public abstract long I00000oIO();

                public long I00000oOI() {
/* 1 */             return I0000Il00O();
                }

                public long I0000Il00O() {
                    long jI00000oIO;
                    long j;
/* 19 */            do {
/* 6 */                 jI00000oIO = I00000oIO() >>> 1;
/* 9 */                 j = jI00000oIO % 1000;
/* 19 */            } while ((jI00000oIO - j) + 999 < 0);
/* 29 */            return j;
                }
            }
