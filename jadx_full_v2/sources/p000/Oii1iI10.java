            package p000;

            import java.util.concurrent.atomic.AtomicReference;
            
            public abstract class Oii1iI10 {
                public static final Oii1OOIOo I00000oIO = new Oii1OOIOo(new byte[0], 0, 0, false);
                public static final int I00000oOI;
                public static final AtomicReference[] I0000Il00O;

                static {
/* 23 */            int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
/* 27 */            I00000oOI = iHighestOneBit;
/* 29 */            AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
/* 31 */            for (int i = 0; i < iHighestOneBit; i++) {
/* 38 */                atomicReferenceArr[i] = new AtomicReference();
                    }
/* 43 */            I0000Il00O = atomicReferenceArr;
                }

                public static final void I00000oIO(Oii1OOIOo oii1OOIOo) {
/* 3 */             if (oii1OOIOo.I0001Ioi1lo != null || oii1OOIOo.I000II != null) {
/* 74 */                I000II.I000iOII("Failed requirement.");
/* 186 */               return;
                    }
/* 11 */            if (oii1OOIOo.I0000O) {
/* 44 */                return;
                    }
/* 32 */            AtomicReference atomicReference = I0000Il00O[(int) (Thread.currentThread().getId() & (I00000oOI - 1))];
/* 34 */            Oii1OOIOo oii1OOIOo2 = I00000oIO;
/* 40 */            Oii1OOIOo oii1OOIOo3 = (Oii1OOIOo) atomicReference.getAndSet(oii1OOIOo2);
/* 42 */            if (oii1OOIOo3 == oii1OOIOo2) {
/* 44 */                return;
                    }
/* 51 */            int i = oii1OOIOo3 != null ? oii1OOIOo3.I0000Il00O : 0;
/* 54 */            if (i >= 65536) {
/* 56 */                atomicReference.set(oii1OOIOo3);
/* 59 */                return;
                    }
/* 60 */            oii1OOIOo.I0001Ioi1lo = oii1OOIOo3;
/* 62 */            oii1OOIOo.I00000oOI = 0;
/* 66 */            oii1OOIOo.I0000Il00O = i + 8192;
/* 68 */            atomicReference.set(oii1OOIOo);
                }

                public static final Oii1OOIOo I00000oOI() {
/* 19 */            AtomicReference atomicReference = I0000Il00O[(int) (Thread.currentThread().getId() & (I00000oOI - 1))];
/* 21 */            Oii1OOIOo oii1OOIOo = I00000oIO;
/* 27 */            Oii1OOIOo oii1OOIOo2 = (Oii1OOIOo) atomicReference.getAndSet(oii1OOIOo);
/* 29 */            if (oii1OOIOo2 == oii1OOIOo) {
/* 33 */                return new Oii1OOIOo();
                    }
/* 38 */            if (oii1OOIOo2 == null) {
/* 40 */                atomicReference.set(null);
/* 45 */                return new Oii1OOIOo();
                    }
/* 51 */            atomicReference.set(oii1OOIOo2.I0001Ioi1lo);
/* 54 */            oii1OOIOo2.I0001Ioi1lo = null;
/* 57 */            oii1OOIOo2.I0000Il00O = 0;
/* 113 */           return oii1OOIOo2;
                }
            }
