            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iOoIoO1I {
                public boolean I00000oIO;
                public int I00000oOI;
                public float I0000Il00O;
                public int I0000O;
                public byte I0000oI00;

                public final I1l1iI1Io I00000oIO() {
/* 5 */             if (this.I0000oI00 != 15) {
/* 9 */                 StringBuilder sb = new StringBuilder();
/* 16 */                if ((this.I0000oI00 & 1) == 0) {
/* 20 */                    sb.append(" logged");
                        }
/* 27 */                if ((this.I0000oI00 & 2) == 0) {
/* 31 */                    sb.append(" stabilityStatus");
                        }
/* 38 */                if ((this.I0000oI00 & 4) == 0) {
/* 42 */                    sb.append(" correctnessScore");
                        }
/* 49 */                if ((this.I0000oI00 & 8) == 0) {
/* 53 */                    sb.append(" runLatencyMs");
                        }
/* 66 */                I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 69 */                return null;
                    }
/* 73 */            boolean z = this.I00000oIO;
/* 75 */            int i = this.I00000oOI;
/* 77 */            float f = this.I0000Il00O;
/* 79 */            int i2 = this.I0000O;
/* 81 */            I1l1iI1Io i1l1iI1Io = new I1l1iI1Io();
/* 84 */            i1l1iI1Io.I00000oIO = z;
/* 86 */            i1l1iI1Io.I00000oOI = i;
/* 88 */            i1l1iI1Io.I0000Il00O = f;
/* 90 */            i1l1iI1Io.I0000O = i2;
/* 92 */            VarHandle.storeStoreFence();
/* 113 */           return i1l1iI1Io;
                }
            }
