            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            
            public final class Iill00 {
                public ArrayList I00000oIO;
                public float[] I00000oOI;

                public final void I00000oIO(Object obj, float f) {
/* 1 */             ArrayList arrayList = this.I00000oIO;
/* 3 */             arrayList.add(obj);
/* 13 */            if (this.I00000oOI.length < arrayList.size()) {
/* 27 */                this.I00000oOI = Arrays.copyOf(this.I00000oOI, arrayList.size() + 2);
                    }
/* 37 */            this.I00000oOI[arrayList.size() - 1] = f;
                }
            }
