            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Iio1o1I implements IlOOi0 {
                public float I00iOIl;
                public float I00iiI;

                public IlOIloII11i I00000oIO(float f) {
/* 1 */             double dI0000Il00O = I0000Il00O(f);
/* 5 */             double d = IlOIoO11li.I00000oIO;
/* 10 */            double d2 = d - 1.0d;
/* 27 */            float fExp = (float) (Math.exp((d / d2) * dI0000Il00O) * this.I00iOIl * this.I00iiI);
/* 39 */            long jExp = (long) (Math.exp(dI0000Il00O / d2) * 1000.0d);
/* 40 */            IlOIloII11i ilOIloII11i = new IlOIloII11i();
/* 43 */            ilOIloII11i.I00000oIO = f;
/* 45 */            ilOIloII11i.I00000oOI = fExp;
/* 47 */            ilOIloII11i.I0000Il00O = jExp;
/* 49 */            VarHandle.storeStoreFence();
/* 186 */           return ilOIloII11i;
                }

                @Override
                public float I00000oOI() {
/* 1 */             return this.I00iOIl;
                }

                public double I0000Il00O(float f) {
/* 1 */             float[] fArr = I0oI1I0IO01.I00000oIO;
/* 19 */            return Math.log((Math.abs(f) * 0.35f) / (this.I00iOIl * this.I00iiI));
                }

                @Override
                public float I000o00OoI0I(float f, long j) {
/* 18 */            return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.I00iiI));
                }

                @Override
                public float I000oI1ioi(float f, float f2, long j) {
/* 5 */             float f3 = this.I00iiI;
/* 23 */            return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
                }

                @Override
                public long I001IIilI0O(float f) {
/* 24 */            return ((long) ((((float) Math.log(this.I00iOIl / Math.abs(f))) * 1000.0f) / this.I00iiI)) * 1000000;
                }

                @Override
                public float I001lllioOl(float f, float f2) {
/* 9 */             if (Math.abs(f2) <= this.I00iOIl) {
/* 11 */                return f;
                    }
/* 18 */            double dLog = Math.log(Math.abs(r1 / f2));
/* 22 */            float f3 = this.I00iiI;
/* 45 */            return ((f2 / f3) * ((float) Math.exp((f3 * ((dLog / f3) * 1000.0d)) / 1000.0d))) + (f - (f2 / f3));
                }
            }
