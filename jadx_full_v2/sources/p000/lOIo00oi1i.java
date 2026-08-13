            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lOIo00oi1i {
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(OiOiliiO oiOiliiO, float f, I110IiI1I1 i110IiI1I1, Ii1OoIll0 ii1OoIll0, Function1 function1, IOoilo iOoilo) {
                    Ol1iIllOio0 ol1iIllOio0;
                    OOo0lO oOo0lO;
/* 3 */             if (iOoilo instanceof Ol1iIllOio0) {
/* 6 */                 ol1iIllOio0 = (Ol1iIllOio0) iOoilo;
/* 8 */                 int i = ol1iIllOio0.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ol1iIllOio0.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ol1iIllOio0 = new Ol1iIllOio0(iOoilo);
                        }
                    }
/* 25 */            Object obj = ol1iIllOio0.I00iio;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ol1iIllOio0.I00ilI0I1;
/* 32 */            if (i2 == 0) {
/* 53 */                lIoii1l01l0i.I00000oOI(obj);
/* 58 */                OOo0lO oOo0lO2 = new OOo0lO();
/* 74 */                int i3 = 0;
/* 79 */                boolean z = ((Number) i110IiI1I1.I00000oIO()).floatValue() == 0.0f;
/* 83 */                Ol1iIOIIo0 ol1iIOIIo0 = new Ol1iIOIIo0(i3);
/* 86 */                ol1iIOIIo0.I00iiI = f;
/* 88 */                ol1iIOIIo0.I00iiO = oOo0lO2;
/* 90 */                ol1iIOIIo0.I00iio = oiOiliiO;
/* 92 */                ol1iIOIIo0.I00ilI0I1 = function1;
/* 94 */                VarHandle.storeStoreFence();
/* 97 */                ol1iIllOio0.I00iiI = i110IiI1I1;
/* 99 */                ol1iIllOio0.I00iiO = oOo0lO2;
/* 101 */               ol1iIllOio0.I00iOIl = f;
/* 103 */               ol1iIllOio0.I00ilI0I1 = 1;
/* 109 */               if (lOiIo0.I0000O(i110IiI1I1, ii1OoIll0, !z, ol1iIOIIo0, ol1iIllOio0) == ii0111o) {
/* 111 */                   return ii0111o;
                        }
/* 112 */               oOo0lO = oOo0lO2;
                    } else {
/* 34 */                if (i2 != 1) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                    return null;
                        }
/* 36 */                f = ol1iIllOio0.I00iOIl;
/* 38 */                oOo0lO = ol1iIllOio0.I00iiO;
/* 40 */                i110IiI1I1 = ol1iIllOio0.I00iiI;
/* 42 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 123 */           return new I1101l(new Float(f - oOo0lO.I00iOIl), i110IiI1I1);
                }

                public static final void I00000oOI(I110IIooo i110IIooo, OiOiliiO oiOiliiO, Function1 function1, float f) {
                    float fI00000oIO;
                    try {
/* 1 */                 fI00000oIO = oiOiliiO.I00000oIO(f);
                    } catch (CancellationException unused) {
/* 6 */                 i110IIooo.I00000oIO();
/* 9 */                 fI00000oIO = 0.0f;
                    }
/* 14 */            function1.invoke(Float.valueOf(fI00000oIO));
/* 26 */            if (Math.abs(f - fI00000oIO) > 0.5f) {
/* 28 */                i110IIooo.I00000oIO();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000Il00O(OiOiliiO oiOiliiO, float f, float f2, I110IiI1I1 i110IiI1I1, I110IiI0o1Il i110IiI0o1Il, Function1 function1, IOoilo iOoilo) {
                    Ol1iOOI0 ol1iOOI0;
                    OOo0lO oOo0lO;
                    I110IiI1I1 i110IiI1I12;
                    float f3;
/* 3 */             if (iOoilo instanceof Ol1iOOI0) {
/* 6 */                 ol1iOOI0 = (Ol1iOOI0) iOoilo;
/* 8 */                 int i = ol1iOOI0.I00ilO0;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ol1iOOI0.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 23 */                    ol1iOOI0 = new Ol1iOOI0(iOoilo);
                        }
                    }
/* 19 */            Ol1iOOI0 ol1iOOI02 = ol1iOOI0;
/* 27 */            Object obj = ol1iOOI02.I00ilI0I1;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = ol1iOOI02.I00ilO0;
/* 34 */            int i3 = 1;
/* 35 */            if (i2 == 0) {
/* 58 */                lIoii1l01l0i.I00000oOI(obj);
/* 63 */                OOo0lO oOo0lO2 = new OOo0lO();
/* 72 */                float fFloatValue = ((Number) i110IiI1I1.I00000oIO()).floatValue();
/* 79 */                Float f4 = new Float(f);
/* 98 */                boolean z = ((Number) i110IiI1I1.I00000oIO()).floatValue() == 0.0f;
/* 103 */               Ol1iIOIIo0 ol1iIOIIo0 = new Ol1iIOIIo0(i3);
/* 106 */               ol1iIOIIo0.I00iiI = f2;
/* 108 */               ol1iIOIIo0.I00iiO = oOo0lO2;
/* 110 */               ol1iIOIIo0.I00iio = oiOiliiO;
/* 112 */               ol1iIOIIo0.I00ilI0I1 = function1;
/* 114 */               VarHandle.storeStoreFence();
/* 117 */               ol1iOOI02.I00iiO = i110IiI1I1;
/* 119 */               ol1iOOI02.I00iio = oOo0lO2;
/* 121 */               ol1iOOI02.I00iOIl = f;
/* 123 */               ol1iOOI02.I00iiI = fFloatValue;
/* 125 */               ol1iOOI02.I00ilO0 = 1;
/* 133 */               if (lOiIo0.I0000oI00(i110IiI1I1, f4, i110IiI0o1Il, !z, ol1iIOIIo0, ol1iOOI02) == ii0111o) {
/* 135 */                   return ii0111o;
                        }
/* 136 */               oOo0lO = oOo0lO2;
/* 137 */               i110IiI1I12 = i110IiI1I1;
/* 138 */               f3 = fFloatValue;
                    } else {
/* 37 */                if (i2 != 1) {
/* 53 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 56 */                    return null;
                        }
/* 39 */                f3 = ol1iOOI02.I00iiI;
/* 41 */                f = ol1iOOI02.I00iOIl;
/* 43 */                oOo0lO = ol1iOOI02.I00iio;
/* 45 */                i110IiI1I12 = ol1iOOI02.I00iiO;
/* 47 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 169 */           return new I1101l(new Float(f - oOo0lO.I00iOIl), iOO0I0.I00000oOI(i110IiI1I12, 0.0f, I0000O(((Number) i110IiI1I12.I00000oIO()).floatValue(), f3), 29));
                }

                public static final float I0000O(float f, float f2) {
/* 4 */             if (f2 == 0.0f) {
/* 1 */                 return 0.0f;
                    }
                    return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
                }
            }
