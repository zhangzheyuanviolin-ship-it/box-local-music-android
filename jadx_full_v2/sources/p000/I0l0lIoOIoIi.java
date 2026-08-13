            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import kotlin.jvm.functions.Function1;
            
            public abstract class I0l0lIoOIoIi {
                public static final I01OoIoio00O I00000oIO = new I01OoIoio00O(13);
                public static final I01OoIoio00O I00000oOI = new I01OoIoio00O(14);
                public static final Ii1OoIll0 I0000Il00O;

                static {
/* 23 */            lOOlOoll loolooll = new lOOlOoll(8);
/* 28 */            Ii1OoIll0 ii1OoIll0 = new Ii1OoIll0();
/* 31 */            ii1OoIll0.I00000oIO = loolooll;
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            I0000Il00O = ii1OoIll0;
                }

                public static final Ii1loIll001 I00000oIO(Function1 function1) {
/* 3 */             Iill00 iill00 = new Iill00();
/* 11 */            iill00.I00000oIO = new ArrayList();
/* 14 */            float[] fArr = new float[5];
/* 18 */            for (int i = 0; i < 5; i++) {
/* 22 */                fArr[i] = Float.NaN;
                    }
/* 27 */            iill00.I00000oOI = fArr;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            function1.invoke(iill00);
/* 37 */            ArrayList arrayList = iill00.I00000oIO;
/* 39 */            float[] fArr2 = iill00.I00000oOI;
/* 41 */            int size = arrayList.size();
/* 46 */            iOO1il1Ii1oo.I00000oIO(size, fArr2.length);
/* 53 */            return new Ii1loIll001(arrayList, Arrays.copyOfRange(fArr2, 0, size));
                }

                public static O1ooiI111i I00000oOI(O1ooiI111i o1ooiI111i, I0l1OOl1l10 i0l1OOl1l10, OIilII oIilII, boolean z, II1OIl1 iI1OIl1) {
/* 11 */            return o1ooiI111i.I0000O(new I0l0O1oi(i0l1OOl1l10, oIilII, z, null, iI1OIl1));
                }

                public static O1ooiI111i I0000Il00O(O1ooiI111i o1ooiI111i, I0l1OOl1l10 i0l1OOl1l10, boolean z, boolean z2) {
/* 15 */            return o1ooiI111i.I0000O(new I0l0O1oi(i0l1OOl1l10, OIilII.I00iiI, z2, Boolean.valueOf(z), null));
                }

                public static final Ol1iIOI I0000O(I0l1OOl1l10 i0l1OOl1l10, IiIooOOOI iiIooOOOI, Function1 function1, I110IiI0o1Il i110IiI0o1Il) {
/* 4 */             I0l0OlI000O i0l0OlI000O = new I0l0OlI000O(0);
/* 7 */             i0l0OlI000O.I00iiI = iiIooOOOI;
/* 9 */             VarHandle.storeStoreFence();
/* 15 */            IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(4, false);
/* 18 */            ioIlOo1o0IIl.I00iiI = i0l1OOl1l10;
/* 20 */            ioIlOo1o0IIl.I00iiO = function1;
/* 22 */            ioIlOo1o0IIl.I00iio = i0l0OlI000O;
/* 24 */            VarHandle.storeStoreFence();
/* 29 */            Ol1iIOI ol1iIOI = new Ol1iIOI();
/* 32 */            ol1iIOI.I00000oIO = ioIlOo1o0IIl;
/* 36 */            ol1iIOI.I00000oOI = I0000Il00O;
/* 38 */            ol1iIOI.I0000Il00O = i110IiI0o1Il;
/* 42 */            ol1iIOI.I0000O = OiOlllI10.I00000oOI;
/* 44 */            VarHandle.storeStoreFence();
/* 204 */           return ol1iIOI;
                }

                public static final Object I0000oI00(I0l1OOl1l10 i0l1OOl1l10, float f, I0l1I0I0i10I i0l1I0I0i10I, Ii1loIll001 ii1loIll001, Object obj, I110IiI0o1Il i110IiI0o1Il, Oll0io oll0io) {
/* 1 */             float fI0001Ioi1lo = ii1loIll001.I0001Ioi1lo(obj);
/* 7 */             OOo0lO oOo0lO = new OOo0lO();
/* 34 */            oOo0lO.I00iOIl = Float.isNaN(((OIooO1iiliI) i0l1OOl1l10.I000l1).I000II()) ? 0.0f : ((OIooO1iiliI) i0l1OOl1l10.I000l1).I000II();
/* 40 */            if (!Float.isNaN(fI0001Ioi1lo)) {
/* 42 */                float f2 = oOo0lO.I00iOIl;
/* 46 */                if (f2 != fI0001Ioi1lo) {
/* 53 */                    I0l0Oo10O i0l0Oo10O = new I0l0Oo10O(0);
/* 56 */                    i0l0Oo10O.I00iiI = i0l1I0I0i10I;
/* 58 */                    i0l0Oo10O.I00iiO = oOo0lO;
/* 60 */                    VarHandle.storeStoreFence();
/* 67 */                    Object objI00000oIO = lOiIo0.I00000oIO(f2, fI0001Ioi1lo, f, i110IiI0o1Il, i0l0Oo10O, oll0io);
/* 73 */                    if (objI00000oIO == Ii0111o.I00iOIl) {
/* 75 */                        return objI00000oIO;
                            }
                        }
                    }
/* 76 */            return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0001Ioi1lo(I0l1OOl1l10 i0l1OOl1l10, Object obj, float f, I110IiI0o1Il i110IiI0o1Il, Ii1OoIll0 ii1OoIll0, IOoilo iOoilo) throws Throwable {
                    I0l0ioOi0lI0 i0l0ioOi0lI0;
                    float f2;
                    OOo0lO oOo0lO;
/* 3 */             if (iOoilo instanceof I0l0ioOi0lI0) {
/* 6 */                 i0l0ioOi0lI0 = (I0l0ioOi0lI0) iOoilo;
/* 8 */                 int i = i0l0ioOi0lI0.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    i0l0ioOi0lI0.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 23 */                    i0l0ioOi0lI0 = new I0l0ioOi0lI0(iOoilo);
                        }
                    }
/* 19 */            I0l0ioOi0lI0 i0l0ioOi0lI02 = i0l0ioOi0lI0;
/* 27 */            Object obj2 = i0l0ioOi0lI02.I00iiO;
/* 29 */            Object obj3 = Ii0111o.I00iOIl;
/* 31 */            int i2 = i0l0ioOi0lI02.I00iio;
/* 34 */            if (i2 == 0) {
/* 53 */                lIoii1l01l0i.I00000oOI(obj2);
/* 58 */                OOo0lO oOo0lO2 = new OOo0lO();
/* 61 */                oOo0lO2.I00iOIl = f;
/* 70 */                IlliOIilI i0l0ioi11i = new I0l0ioi11i(i0l1OOl1l10, f, i110IiI0o1Il, oOo0lO2, ii1OoIll0, null);
/* 73 */                i0l0ioOi0lI02.I00iiI = oOo0lO2;
/* 75 */                i0l0ioOi0lI02.I00iOIl = f;
/* 77 */                i0l0ioOi0lI02.I00iio = 1;
/* 85 */                if (i0l1OOl1l10.I00000oIO(obj, OI110lo.I00iOIl, i0l0ioi11i, i0l0ioOi0lI02) == obj3) {
/* 87 */                    return obj3;
                        }
/* 88 */                f2 = f;
/* 89 */                oOo0lO = oOo0lO2;
                    } else {
/* 36 */                if (i2 != 1) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                    return null;
                        }
/* 38 */                f2 = i0l0ioOi0lI02.I00iOIl;
/* 40 */                oOo0lO = i0l0ioOi0lI02.I00iiI;
/* 42 */                lIoii1l01l0i.I00000oOI(obj2);
                    }
/* 95 */            return new Float(f2 - oOo0lO.I00iOIl);
                }

                public static Object I000II(I0l1OOl1l10 i0l1OOl1l10, Object obj, float f, I0l0lo i0l0lo) {
                    I110IiI0o1Il i110IiI0o1Il;
                    Ii1OoIll0 ii1OoIll0;
/* 6 */             if (i0l1OOl1l10.I0000O()) {
/* 10 */                i110IiI0o1Il = (I110IiI0o1Il) i0l1OOl1l10.I0000O;
/* 12 */                if (i110IiI0o1Il == null) {
/* 18 */                    O0000Ioio00.I000OOo1O("snapAnimationSpec");
/* 21 */                    throw null;
                        }
                    } else {
/* 22 */                i110IiI0o1Il = I0l0O0O.I00000oIO;
                    }
/* 14 */            I110IiI0o1Il i110IiI0o1Il2 = i110IiI0o1Il;
/* 29 */            if (i0l1OOl1l10.I0000O()) {
/* 33 */                ii1OoIll0 = (Ii1OoIll0) i0l1OOl1l10.I0000oI00;
/* 35 */                if (ii1OoIll0 == null) {
/* 45 */                    O0000Ioio00.I000OOo1O("decayAnimationSpec");
/* 48 */                    throw null;
                        }
                    } else {
/* 49 */                ii1OoIll0 = I0l0O0O.I0000Il00O;
                    }
/* 52 */            return I0001Ioi1lo(i0l1OOl1l10, obj, f, i110IiI0o1Il2, ii1OoIll0, i0l0lo);
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I000O01llI0(Ii1loIll001 ii1loIll001, float f, float f2, Function1 function1, IllOOo00lI illOOo00lI) {
/* 6 */             if (Float.isNaN(f)) {
/* 136 */               I000II.I000iOII("The offset provided to computeTarget must not be NaN.");
/* 5 */                 return null;
                    }
/* 21 */            boolean z = Math.abs(f2) > 0.0f;
/* 30 */            boolean z2 = z && f2 > 0.0f;
/* 31 */            if (!z) {
/* 33 */                return ii1loIll001.I00000oIO(f);
                    }
/* 58 */            if (Math.abs(f2) >= Math.abs(((Number) illOOo00lI.invoke()).floatValue())) {
/* 60 */                return ii1loIll001.I00000oOI(f, z2);
                    }
/* 65 */            Object objI00000oOI = ii1loIll001.I00000oOI(f, false);
/* 69 */            float fI0001Ioi1lo = ii1loIll001.I0001Ioi1lo(objI00000oOI);
/* 73 */            Object objI00000oOI2 = ii1loIll001.I00000oOI(f, true);
/* 77 */            float fI0001Ioi1lo2 = ii1loIll001.I0001Ioi1lo(objI00000oOI2);
/* 101 */           float fAbs = Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(fI0001Ioi1lo - fI0001Ioi1lo2)))).floatValue());
/* 105 */           if (!z2) {
/* 108 */               fI0001Ioi1lo = fI0001Ioi1lo2;
                    }
/* 116 */           boolean z3 = Math.abs(fI0001Ioi1lo - f) >= fAbs;
/* 119 */           if (z3) {
                        return z2 ? objI00000oOI2 : objI00000oOI;
                    }
/* 124 */           if (z3) {
/* 130 */               I000II.I00000oIO();
/* 5 */                 return null;
                    }
/* 126 */           if (z2) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I000OOo1O(IllOOo00lI illOOo00lI, IlliIl1l11O illiIl1l11O, IOoilo iOoilo) throws Throwable {
                    I0l0l0Oo i0l0l0Oo;
/* 3 */             if (iOoilo instanceof I0l0l0Oo) {
/* 6 */                 i0l0l0Oo = (I0l0l0Oo) iOoilo;
/* 8 */                 int i = i0l0l0Oo.I00iiI;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    i0l0l0Oo.I00iiI = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i0l0l0Oo = new I0l0l0Oo(iOoilo);
                        }
                    }
/* 25 */            Object obj = i0l0l0Oo.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = i0l0l0Oo.I00iiI;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
                    try {
/* 33 */                if (i2 == 0) {
/* 47 */                    lIoii1l01l0i.I00000oOI(obj);
/* 53 */                    I00oIiI10 i00oIiI10 = new I00oIiI10(illOOo00lI, illiIl1l11O, iOoil1iiIilo, 5);
/* 56 */                    i0l0l0Oo.I00iiI = 1;
/* 62 */                    if (il001oo1.I0000Il00O(i00oIiI10, i0l0l0Oo) == ii0111o) {
/* 64 */                        return ii0111o;
                            }
                        } else {
/* 35 */                    if (i2 != 1) {
/* 43 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 37 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
                    } catch (I0l0IolO unused) {
                    }
/* 65 */            return OoiIlOl1iI.I00000oIO;
                }
            }
