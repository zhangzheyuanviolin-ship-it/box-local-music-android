            package p000;

            import android.view.ViewTreeObserver;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            public final class Oii00o1ll {
                public OiOoi0I0o0i I00000oIO;
                public I0o1iIoolIi I00000oOI;
                public IlOIll0o11Ii I0000Il00O;
                public OIilII I0000O;
                public boolean I0000oI00;
                public OIIII0oOo1o I0001Ioi1lo;
                public OiOoIO1 I000II;
                public OiOo1I1o0ilI I000O01llI0;
                public boolean I000OOo1O;
                public int I000OiO;
                public OiOiliiO I000iOII;
                public OiOol0il0il I000l1;
                public OIoO1Ol I000lI;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(long j, IOoilo iOoilo) throws Throwable {
                    OiOoii00iI0O oiOoii00iI0O;
                    Oii00o1ll oii00o1ll;
                    Throwable th;
                    OOo0o0oO oOo0o0oO;
/* 3 */             if (iOoilo instanceof OiOoii00iI0O) {
/* 6 */                 oiOoii00iI0O = (OiOoii00iI0O) iOoilo;
/* 8 */                 int i = oiOoii00iI0O.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oiOoii00iI0O.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oiOoii00iI0O = new OiOoii00iI0O(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = oiOoii00iI0O.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oiOoii00iI0O.I00iio;
/* 33 */            if (i2 != 0) {
/* 35 */                if (i2 != 1) {
/* 50 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 53 */                    return null;
                        }
/* 37 */                oOo0o0oO = oiOoii00iI0O.I00iOIl;
                        try {
/* 39 */                    lIoii1l01l0i.I00000oOI(obj);
/* 42 */                    oii00o1ll = this;
/* 89 */                    oii00o1ll.I000OOo1O = false;
/* 93 */                    return OooIOilolOo.I00000oIO(oOo0o0oO.I00iOIl);
                        } catch (Throwable th2) {
/* 45 */                    th = th2;
/* 46 */                    oii00o1ll = this;
/* 104 */                   oii00o1ll.I000OOo1O = false;
/* 106 */                   throw th;
                        }
                    }
/* 55 */            lIoii1l01l0i.I00000oOI(obj);
/* 60 */            OOo0o0oO oOo0o0oO2 = new OOo0o0oO();
/* 63 */            oOo0o0oO2.I00iOIl = j;
/* 65 */            this.I000OOo1O = true;
                    try {
/* 67 */                OI110lo oI110lo = OI110lo.I00iOIl;
/* 72 */                oii00o1ll = this;
                        try {
/* 74 */                    OO1Iool1ol oO1Iool1ol = new OO1Iool1ol(oii00o1ll, oOo0o0oO2, j, (IOoil1iiIilo) null);
/* 77 */                    oiOoii00iI0O.I00iOIl = oOo0o0oO2;
/* 79 */                    oiOoii00iI0O.I00iio = 1;
/* 85 */                    if (oii00o1ll.I000II(oI110lo, oO1Iool1ol, oiOoii00iI0O) == ii0111o) {
/* 87 */                        return ii0111o;
                            }
/* 88 */                    oOo0o0oO = oOo0o0oO2;
/* 89 */                    oii00o1ll.I000OOo1O = false;
/* 93 */                    return OooIOilolOo.I00000oIO(oOo0o0oO.I00iOIl);
                        } catch (Throwable th3) {
/* 98 */                    th = th3;
/* 99 */                    th = th;
/* 104 */                   oii00o1ll.I000OOo1O = false;
/* 106 */                   throw th;
                        }
                    } catch (Throwable th4) {
/* 101 */               th = th4;
/* 102 */               oii00o1ll = this;
                    }
                }

                public final boolean I00000oOI() {
                    I0o1iIoolIi i0o1iIoolIi;
                    return this.I00000oIO.I0000O() || this.I00000oIO.I00000oOI() || ((i0o1iIoolIi = this.I00000oOI) != null && i0o1iIoolIi.I0000oI00());
                }

                /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(long j, boolean z, Oll0io oll0io) {
/* 1 */             if (z) {
/* 3 */                 IlOIll0o11Ii ilOIll0o11Ii = this.I0000Il00O;
/* 5 */                 OiOlO0o11 oiOlO0o11 = OiOlllI10.I00000oIO;
/* 9 */                 if (!(ilOIll0o11Ii instanceof Ii1oIilI)) {
/* 20 */                    long jI00000oOI = OooIOilolOo.I00000oOI(j, 0.0f, 0.0f, this.I0000O == OIilII.I00iiI ? 1 : 2);
/* 30 */                    OiOoo1 oiOoo1 = new OiOoo1(this, null);
/* 33 */                    I0o1iIoolIi i0o1iIoolIi = this.I00000oOI;
/* 35 */                    if (i0o1iIoolIi == null || !I00000oOI()) {
/* 56 */                        Object objInvoke = oiOoo1.invoke(OooIOilolOo.I00000oIO(jI00000oOI), oll0io);
/* 62 */                        if (objInvoke == Ii0111o.I00iOIl) {
/* 64 */                            return objInvoke;
                                }
                            } else {
/* 43 */                        Object objI00000oOI = i0o1iIoolIi.I00000oOI(jI00000oOI, oiOoo1, oll0io);
/* 49 */                        if (objI00000oOI == Ii0111o.I00iOIl) {
/* 51 */                            return objI00000oOI;
                                }
                            }
                        }
                    }
/* 65 */            return OoiIlOl1iI.I00000oIO;
                }

                public final long I0000O(OiOiliiO oiOiliiO, long j, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 5 */             OIIIi0lOoOl oIIIi0lOoOl = this.I0001Ioi1lo.I00000oIO;
/* 15 */            OIIIi0lOoOl oIIIi0lOoOlI010l1ol111 = oIIIi0lOoOl != null ? oIIIi0lOoOl.I010l1ol111() : null;
/* 28 */            long jI00IoIO0lI = oIIIi0lOoOlI010l1ol111 != null ? oIIIi0lOoOlI010l1ol111.I00IoIO0lI(i, j) : 0L;
/* 29 */            long jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(j, jI00IoIO0lI);
/* 67 */            long jI0001Ioi1lo2 = I0001Ioi1lo(I000OOo1O(oiOiliiO.I00000oIO(I000O01llI0(I0001Ioi1lo(this.I0000O == OIilII.I00iiI ? OIOlIiiioi.I00000oOI(jI0001Ioi1lo, 0.0f, 1) : OIOlIiiioi.I00000oOI(jI0001Ioi1lo, 0.0f, 2))))));
/* 71 */            OiOoIO1 oiOoIO1 = this.I000II;
/* 75 */            if (oiOoIO1.I00lll10) {
/* 84 */                ViewTreeObserver viewTreeObserver = ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(oiOoIO1)).getViewTreeObserver();
                        try {
/* 88 */                    Method declaredMethod = I0lio1O01i01.I01OOIlI;
/* 90 */                    if (declaredMethod == null) {
/* 98 */                        declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
/* 102 */                       declaredMethod.setAccessible(true);
/* 105 */                       I0lio1O01i01.I01OOIlI = declaredMethod;
                            }
/* 107 */                   declaredMethod.invoke(viewTreeObserver, null);
                        } catch (Exception unused) {
                        }
                    }
/* 110 */           long jI0001Ioi1lo3 = OIOlIiiioi.I0001Ioi1lo(jI0001Ioi1lo, jI0001Ioi1lo2);
/* 116 */           OIIIi0lOoOl oIIIi0lOoOl2 = this.I0001Ioi1lo.I00000oIO;
/* 120 */           OIIIi0lOoOl oIIIi0lOoOlI010l1ol1112 = oIIIi0lOoOl2 != null ? oIIIi0lOoOl2.I010l1ol111() : null;
/* 137 */           return OIOlIiiioi.I000II(OIOlIiiioi.I000II(jI00IoIO0lI, jI0001Ioi1lo2), oIIIi0lOoOlI010l1ol1112 != null ? oIIIi0lOoOlI010l1ol1112.I00ioIO(i, jI0001Ioi1lo2, jI0001Ioi1lo3) : 0L);
                }

                public final float I0000oI00(float f) {
                    return this.I0000oI00 ? f * (-1.0f) : f;
                }

                public final long I0001Ioi1lo(long j) {
                    return this.I0000oI00 ? OIOlIiiioi.I000O01llI0(-1.0f, j) : j;
                }

                public final Object I000II(OI110lo oI110lo, IlliIl1l11O illiIl1l11O, IOoilo iOoilo) {
/* 11 */            Object objI0000Il00O = this.I00000oIO.I0000Il00O(oI110lo, new OO11OilO(this, illiIl1l11O, null, 11), iOoilo);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                public final float I000O01llI0(long j) {
/* 12 */            return Float.intBitsToFloat((int) (this.I0000O == OIilII.I00iiI ? j >> 32 : j & 4294967295L));
                }

                public final long I000OOo1O(float f) {
/* 4 */             if (f == 0.0f) {
/* 6 */                 return 0L;
                    }
/* 20 */            if (this.I0000O == OIilII.I00iiI) {
/* 34 */                return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
                    }
/* 48 */            return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                }

                public final float I000OiO(long j) {
/* 7 */             int i = (int) (4294967295L & j);
/* 19 */            int i2 = (int) (j >> 32);
/* 34 */            double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
/* 43 */            OIilII oIilII = this.I0000O;
/* 46 */            if (dAtan2 >= 0.7853981633974483d) {
/* 50 */                if (oIilII == OIilII.I00iOIl) {
/* 52 */                    return Float.intBitsToFloat(i);
                        }
/* 45 */                return 0.0f;
                    }
/* 60 */            if (oIilII == OIilII.I00iiI) {
/* 62 */                return Float.intBitsToFloat(i2);
                    }
/* 45 */            return 0.0f;
                }
            }
