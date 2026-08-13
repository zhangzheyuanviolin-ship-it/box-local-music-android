            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iOO01lio0 {
                public static IolIOIloiI00 I00000oIO(Iio1i00IOI iio1i00IOI, Oi010oI oi010oI, int i) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 oi010oI = Oi010oI.I00iOIl;
                    }
/* 9 */             IolIOIloiI00 iolIOIloiI00 = new IolIOIloiI00();
/* 12 */            iolIOIloiI00.I00000oIO = iio1i00IOI;
/* 14 */            iolIOIloiI00.I00000oOI = oi010oI;
/* 18 */            if (iio1i00IOI instanceof OoIoO0I0oOI) {
/* 20 */                OoIoO0I0oOI ooIoO0I0oOI = (OoIoO0I0oOI) iio1i00IOI;
/* 24 */                if (ooIoO0I0oOI.I00000oIO != 0 || ooIoO0I0oOI.I00000oOI != 0) {
/* 30 */                    VarHandle.storeStoreFence();
/* 33 */                    return iolIOIloiI00;
                        }
                    } else if (iio1i00IOI instanceof Ol1il11IO0oo) {
/* 42 */                if (((Ol1il11IO0oo) iio1i00IOI).I00000oIO != 0) {
/* 44 */                    VarHandle.storeStoreFence();
/* 47 */                    return iolIOIloiI00;
                        }
                    } else {
/* 50 */                if (!(iio1i00IOI instanceof O0OO1il1o0)) {
/* 71 */                    VarHandle.storeStoreFence();
/* 98 */                    return iolIOIloiI00;
                        }
/* 58 */                if (((O0OO1il1o0) iio1i00IOI).I00000oIO.I00000oIO != 0) {
/* 60 */                    VarHandle.storeStoreFence();
/* 63 */                    return iolIOIloiI00;
                        }
                    }
/* 66 */            I000II.I000iOII("Animation to be infinitely repeated cannot have a 0-duration");
/* 69 */            return null;
                }

                public static Ol1il11IO0oo I00000oOI() {
/* 4 */             return new Ol1il11IO0oo(0);
                }

                public static OlIOiI1iI1 I0000Il00O(float f, float f2, Object obj, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 f = 1.0f;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                f2 = 1500.0f;
                    }
/* 16 */            if ((i & 4) != 0) {
/* 18 */                obj = null;
                    }
/* 21 */            return new OlIOiI1iI1(f, f2, obj);
                }

                public static OoIoO0I0oOI I0000O(int i, int i2, IioIllI11l0I iioIllI11l0I) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 i = 300;
                    }
/* 13 */            int i3 = (i2 & 2) != 0 ? 0 : 90;
/* 17 */            if ((i2 & 4) != 0) {
/* 19 */                iioIllI11l0I = IioO00o.I00000oIO;
                    }
/* 23 */            return new OoIoO0I0oOI(i, i3, iioIllI11l0I);
                }
            }
