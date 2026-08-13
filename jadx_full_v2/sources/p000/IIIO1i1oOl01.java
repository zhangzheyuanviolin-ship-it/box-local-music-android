            package p000;

            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            
/* 36 */    public final class IIIO1i1oOl01 extends Il0IIl0OOI {
                public final int I00iiO;

                public IIIO1i1oOl01(IliiI1 iliiI1) {
/* 2 */             this.I00iiO = 1;
/* 21 */            for (IO11iO0l iO11iO0l : Collections.unmodifiableList(iliiI1.I000l1)) {
/* 33 */                I00000oIO(iO11iO0l.I00000oIO, iO11iO0l.I0000Il00O);
                    }
                }

                public static IIIO1i1oOl01 I0000O(I01loIooI i01loIooI) {
/* 5 */             Map mapUnmodifiableMap = Collections.unmodifiableMap((HashMap) i01loIooI.I00000oIO);
/* 12 */            IIIO1i1oOl01 iIIO1i1oOl01 = new IIIO1i1oOl01(1);
/* 27 */            for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
/* 51 */                iIIO1i1oOl01.I00000oIO(((Integer) entry.getKey()).intValue(), (String) entry.getValue());
                    }
/* 186 */           return iIIO1i1oOl01;
                }

                @Override
                public final IIOoOiOI I00Io1lO() {
                    switch (this.I00iiO) {
                        case 0:
/* 15 */                    throw new UnsupportedOperationException("Built-in encodings cannot be serialized");
                        default:
/* 6 */                     return null;
                    }
                }

/* 37 */        public IIIO1i1oOl01(int i) {
/* 38 */            this.I00iiO = i;
                }
            }
