            package p000;
            
/* 27 */    public abstract class OIoOo11 {
                public I0oiil10Ili I00iOIl;
                public IOOil0 I00iiI;
                public float I00iiO = 1.0f;
                public O0iOOoiioO I00iio = O0iOOoiioO.I00iOIl;

                public abstract void I00000oIO(float f);

                public abstract void I0000Il00O(IOOil0 iOOil0);

                public final void I000II(IilloIOOO0i iilloIOOO0i, long j, float f, IOOil0 iOOil0) {
/* 5 */             if (this.I00iiO != f) {
/* 8 */                 I00000oIO(f);
/* 11 */                this.I00iiO = f;
                    }
/* 19 */            if (!O0000Ioio00.I0000O(this.I00iiI, iOOil0)) {
/* 21 */                I0000Il00O(iOOil0);
/* 24 */                this.I00iiI = iOOil0;
                    }
/* 26 */            O0iOOoiioO layoutDirection = iilloIOOO0i.getLayoutDirection();
/* 32 */            if (this.I00iio != layoutDirection) {
/* 34 */                I0001Ioi1lo(layoutDirection);
/* 37 */                this.I00iio = layoutDirection;
                    }
/* 53 */            int i = (int) (j >> 32);
/* 58 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32)) - Float.intBitsToFloat(i);
/* 75 */            int i2 = (int) (j & 4294967295L);
/* 80 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L)) - Float.intBitsToFloat(i2);
/* 90 */            ((IIOOoll) iilloIOOO0i.I00iiI().I00iiI).I00O0o1oo(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
/* 97 */            if (f > 0.0f) {
                        try {
/* 105 */                   if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
/* 115 */                       I000OiO(iilloIOOO0i);
                            }
                        } finally {
/* 130 */                   ((IIOOoll) iilloIOOO0i.I00iiI().I00iiI).I00O0o1oo(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                        }
                    }
                }

                public abstract long I000OOo1O();

                public abstract void I000OiO(IilloIOOO0i iilloIOOO0i);

/* 28 */        public void I0001Ioi1lo(O0iOOoiioO o0iOOoiioO) {
                }
            }
