            package p000;

            import java.util.concurrent.TimeUnit;
            
            public abstract class iOOOI0OI {
                public static I1Ool00ioI I00000oIO() throws InterruptedException {
/* 1 */             O1I1OO o1i1oo = I1Ool00ioI.I000O01llI0;
/* 8 */             I1Ool00ioI i1Ool00ioI = ((I1Ool00ioI[]) o1i1oo.I00iiO)[1];
/* 11 */            if (i1Ool00ioI == null) {
/* 13 */                long jNanoTime = System.nanoTime();
/* 23 */                I1Ool00ioI.I000iOII.await(I1Ool00ioI.I000l1, TimeUnit.MILLISECONDS);
/* 32 */                if (((I1Ool00ioI[]) o1i1oo.I00iiO)[1] != null || System.nanoTime() - jNanoTime < I1Ool00ioI.I000lI) {
/* 10 */                    return null;
                        }
/* 45 */                return I1Ool00ioI.I000OOo1O;
                    }
/* 55 */            long jNanoTime2 = i1Ool00ioI.I000II - System.nanoTime();
/* 60 */            if (jNanoTime2 > 0) {
/* 66 */                I1Ool00ioI.I000iOII.await(jNanoTime2, TimeUnit.NANOSECONDS);
/* 10 */                return null;
                    }
/* 70 */            o1i1oo.I0010o(i1Ool00ioI);
/* 74 */            i1Ool00ioI.I0000oI00 = 2;
/* 113 */           return i1Ool00ioI;
                }

                public static void I00000oOI(I1Ool00ioI i1Ool00ioI, long j, boolean z) {
/* 4 */             if (I1Ool00ioI.I000OOo1O == null) {
/* 11 */                I1Ool00ioI.I000OOo1O = new I1Ool00ioI();
/* 17 */                I1OoI100 i1OoI100 = new I1OoI100("Okio Watchdog");
/* 20 */                i1OoI100.setDaemon(true);
/* 23 */                i1OoI100.start();
                    }
/* 26 */            long jNanoTime = System.nanoTime();
/* 34 */            if (j != 0 && z) {
/* 48 */                i1Ool00ioI.I000II = Math.min(j, i1Ool00ioI.I0000Il00O() - jNanoTime) + jNanoTime;
                    } else if (j != 0) {
/* 54 */                i1Ool00ioI.I000II = jNanoTime + j;
                    } else {
/* 57 */                if (!z) {
/* 104 */                   OoOil11Ol1o.I0000Il00O();
/* 215 */                   return;
                        }
/* 63 */                i1Ool00ioI.I000II = i1Ool00ioI.I0000Il00O();
                    }
/* 65 */            O1I1OO o1i1oo = I1Ool00ioI.I000O01llI0;
/* 69 */            int i = o1i1oo.I00iiI + 1;
/* 70 */            o1i1oo.I00iiI = i;
/* 74 */            I1Ool00ioI[] i1Ool00ioIArr = (I1Ool00ioI[]) o1i1oo.I00iiO;
/* 77 */            if (i == i1Ool00ioIArr.length) {
/* 81 */                I1Ool00ioI[] i1Ool00ioIArr2 = new I1Ool00ioI[i * 2];
/* 86 */                I1IoiO1l.I000oI1ioi(i1Ool00ioIArr, 0, i1Ool00ioIArr2, 0, 14);
/* 89 */                o1i1oo.I00iiO = i1Ool00ioIArr2;
                    }
/* 91 */            o1i1oo.I000iOII(i, i1Ool00ioI);
/* 96 */            if (i1Ool00ioI.I0001Ioi1lo == 1) {
/* 100 */               I1Ool00ioI.I000iOII.signal();
                    }
                }
            }
