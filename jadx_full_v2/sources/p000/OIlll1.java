            package p000;

            import java.util.Arrays;
            
            public final class OIlll1 implements IIi0O1OOO1i0 {
                public int I00iOIl;
                public float[] I00iiI;

                @Override
                public final IIOoOiOI I00Io1lO() {
/* 3 */             IIOoIilO iIOoIilO = new IIOoIilO();
/* 8 */             IIOoIilO iIOoIilO2 = new IIOoIilO();
/* 13 */            iIOoIilO2.I00iOIl.clear();
/* 20 */            for (float f : this.I00iiI) {
/* 29 */                iIOoIilO2.I00ioIO(new IIOolo0l(f));
                    }
/* 35 */            iIOoIilO.I00ioIO(iIOoIilO2);
/* 45 */            iIOoIilO.I00ioIO(IIOool.I00o0iI0io1(this.I00iOIl));
/* 113 */           return iIOoIilO;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("PDLineDashPattern{array=");
/* 14 */            sb.append(Arrays.toString(this.I00iiI));
/* 19 */            sb.append(", phase=");
/* 26 */            return IIl001iO0Io.I000lI(this.I00iOIl, "}", sb);
                }
            }
