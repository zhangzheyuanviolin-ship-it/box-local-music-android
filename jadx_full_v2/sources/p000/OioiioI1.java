            package p000;

            import android.graphics.Matrix;
            import android.graphics.Path;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class OioiioI1 {
                public float I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public float I0000O;
                public float I0000oI00;
                public final ArrayList I0001Ioi1lo = new ArrayList();
                public final ArrayList I000II = new ArrayList();

                public OioiioI1() {
/* 21 */            I0000O(0.0f, 270.0f, 0.0f);
                }

                public final void I00000oIO(float f) {
/* 1 */             float f2 = this.I0000O;
/* 5 */             if (f2 == f) {
/* 20 */                return;
                    }
/* 13 */            float f3 = ((f - f2) + 360.0f) % 360.0f;
/* 18 */            if (f3 > 180.0f) {
/* 20 */                return;
                    }
/* 23 */            float f4 = this.I00000oOI;
/* 25 */            float f5 = this.I0000Il00O;
/* 27 */            OioiO1oOlO1 oioiO1oOlO1 = new OioiO1oOlO1(f4, f5, f4, f5);
/* 32 */            oioiO1oOlO1.I0001Ioi1lo = this.I0000O;
/* 34 */            oioiO1oOlO1.I000II = f3;
/* 43 */            this.I000II.add(new Oioi1i1IiO(oioiO1oOlO1));
/* 46 */            this.I0000O = f;
                }

                public final void I00000oOI(Matrix matrix, Path path) {
/* 1 */             ArrayList arrayList = this.I0001Ioi1lo;
/* 3 */             int size = arrayList.size();
/* 8 */             for (int i = 0; i < size; i++) {
/* 16 */                ((Oioii11ilO) arrayList.get(i)).I00000oIO(matrix, path);
                    }
                }

                public final void I0000Il00O(float f, float f2) {
/* 3 */             OioiOlI oioiOlI = new OioiOlI();
/* 6 */             oioiOlI.I00000oOI = f;
/* 8 */             oioiOlI.I0000Il00O = f2;
/* 12 */            this.I0001Ioi1lo.add(oioiOlI);
/* 17 */            float f3 = this.I00000oOI;
/* 19 */            float f4 = this.I0000Il00O;
/* 21 */            OioiIoO oioiIoO = new OioiIoO();
/* 24 */            oioiIoO.I00000oIO = oioiOlI;
/* 26 */            oioiIoO.I00000oOI = f3;
/* 28 */            oioiIoO.I0000Il00O = f4;
/* 30 */            VarHandle.storeStoreFence();
/* 39 */            float fI00000oIO = oioiIoO.I00000oIO() + 270.0f;
/* 44 */            float fI00000oIO2 = oioiIoO.I00000oIO() + 270.0f;
/* 45 */            I00000oIO(fI00000oIO);
/* 50 */            this.I000II.add(oioiIoO);
/* 53 */            this.I0000O = fI00000oIO2;
/* 55 */            this.I00000oOI = f;
/* 57 */            this.I0000Il00O = f2;
                }

                public final void I0000O(float f, float f2, float f3) {
/* 1 */             this.I00000oIO = f;
/* 4 */             this.I00000oOI = 0.0f;
/* 6 */             this.I0000Il00O = f;
/* 8 */             this.I0000O = f2;
/* 14 */            this.I0000oI00 = (f2 + f3) % 360.0f;
/* 18 */            this.I0001Ioi1lo.clear();
/* 23 */            this.I000II.clear();
                }
            }
