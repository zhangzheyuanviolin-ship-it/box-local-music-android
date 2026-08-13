            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class lIiioliIlo {
                public static double I00000oIO(double d, double d2, double d3) {
/* 3 */             if (d2 <= d3) {
                        return d < d2 ? d2 : d > d3 ? d3 : d;
                    }
/* 98 */            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
                }

                public static float I00000oOI(float f, float f2, float f3) {
/* 3 */             if (f2 <= f3) {
                        return f < f2 ? f2 : f > f3 ? f3 : f;
                    }
/* 98 */            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
                }

                public static int I0000Il00O(int i, int i2, int i3) {
/* 1 */             if (i2 <= i3) {
                        return i < i2 ? i2 : i > i3 ? i3 : i;
                    }
/* 98 */            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
                }

                public static long I0000O(long j, long j2, long j3) {
/* 3 */             if (j2 <= j3) {
                        return j < j2 ? j2 : j > j3 ? j3 : j;
                    }
/* 22 */            StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
/* 26 */            sbI001iOo1i0O.append(j2);
/* 31 */            sbI001iOo1i0O.append('.');
/* 98 */            throw new IllegalArgumentException(sbI001iOo1i0O.toString());
                }

                public static Comparable I0000oI00(Float f, IOO1O00oI iOO1O00oI) {
/* 1 */             float f2 = iOO1O00oI.I00000oOI;
/* 3 */             float f3 = iOO1O00oI.I00000oIO;
/* 7 */             if (f3 <= f2) {
                        return (!IOO1O00oI.I00000oOI(f, Float.valueOf(f3)) || IOO1O00oI.I00000oOI(Float.valueOf(f3), f)) ? (!IOO1O00oI.I00000oOI(Float.valueOf(f2), f) || IOO1O00oI.I00000oOI(f, Float.valueOf(f2))) ? f : Float.valueOf(f2) : Float.valueOf(f3);
                    }
/* 106 */           throw new IllegalArgumentException("Cannot coerce value to an empty range: " + iOO1O00oI + '.');
                }

                public static IOO1O00oI I0001Ioi1lo(float f, float f2) {
/* 3 */             IOO1O00oI iOO1O00oI = new IOO1O00oI();
/* 6 */             iOO1O00oI.I00000oIO = f;
/* 8 */             iOO1O00oI.I00000oOI = f2;
/* 10 */            VarHandle.storeStoreFence();
/* 37 */            return iOO1O00oI;
                }

                public static IooO0oO00I I000II(IooO11l iooO11l, int i) {
/* 5 */             boolean z = i > 0;
/* 6 */             Integer numValueOf = Integer.valueOf(i);
/* 10 */            if (!z) {
/* 106 */               throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
                    }
/* 12 */            int i2 = iooO11l.I00iOIl;
/* 14 */            int i3 = iooO11l.I00iiI;
/* 18 */            if (iooO11l.I00iiO <= 0) {
/* 21 */                i = -i;
                    }
/* 24 */            return new IooO0oO00I(i2, i3, i);
                }

                public static IooO11l I000O01llI0(int i, int i2) {
/* 3 */             if (i2 > Integer.MIN_VALUE) {
/* 14 */                return new IooO11l(i, i2 - 1, 1);
                    }
/* 5 */             IooO11l iooO11l = IooO11l.I00iio;
/* 7 */             return IooO11l.I00iio;
                }
            }
