            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iO1oO0lio {
                /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(I01O1lIi i01O1lIi, IOoilo iOoilo) throws Throwable {
                    I0000Il00O i0000Il00O;
                    I01O1lIi i01O1lIi2;
                    OOo0ooi oOo0ooi;
                    Throwable th;
                    O0oiO0ilooli o0oiO0ilooli;
                    O0oiO0ilooli o0oiO0ilooli2;
/* 3 */             if (iOoilo instanceof I0000Il00O) {
/* 6 */                 i0000Il00O = (I0000Il00O) iOoilo;
/* 8 */                 int i = i0000Il00O.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    i0000Il00O.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i0000Il00O = new I0000Il00O(iOoilo);
                        }
                    }
/* 25 */            Object obj = i0000Il00O.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = i0000Il00O.I00iio;
/* 31 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 34 */            if (i2 == 0) {
/* 55 */                lIoii1l01l0i.I00000oOI(obj);
/* 68 */                if (!i01O1lIi.I00ol1().I00000oIO(O0oOi0I.I00iio)) {
/* 73 */                    OOo0ooi oOo0ooi2 = new OOo0ooi();
                            try {
/* 76 */                        i0000Il00O.I00iOIl = i01O1lIi;
/* 78 */                        i0000Il00O.I00iiI = oOo0ooi2;
/* 80 */                        i0000Il00O.I00iio = 1;
/* 88 */                        IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(i0000Il00O));
/* 91 */                        iIoOoIol0Io0.I00111O();
/* 97 */                        I0000O i0000o = new I0000O(0);
/* 100 */                       i0000o.I00iiI = iIoOoIol0Io0;
/* 102 */                       VarHandle.storeStoreFence();
/* 105 */                       oOo0ooi2.I00iOIl = i0000o;
/* 107 */                       i01O1lIi.I00li1OI(i0000o);
/* 114 */                       if (iIoOoIol0Io0.I0010I0i() == ii0111o) {
/* 116 */                           return ii0111o;
                                }
/* 117 */                       i01O1lIi2 = i01O1lIi;
/* 118 */                       oOo0ooi = oOo0ooi2;
/* 121 */                       o0oiO0ilooli2 = (O0oiO0ilooli) oOo0ooi.I00iOIl;
/* 123 */                       if (o0oiO0ilooli2 != null) {
                                }
                            } catch (Throwable th2) {
/* 131 */                       i01O1lIi2 = i01O1lIi;
/* 132 */                       oOo0ooi = oOo0ooi2;
/* 133 */                       th = th2;
/* 136 */                       o0oiO0ilooli = (O0oiO0ilooli) oOo0ooi.I00iOIl;
/* 138 */                       if (o0oiO0ilooli != null) {
/* 140 */                           i01O1lIi2.I00ooIo0(o0oiO0ilooli);
                                }
/* 332 */                       throw th;
                            }
                        }
                    } else {
/* 36 */                if (i2 != 1) {
/* 50 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 53 */                    return null;
                        }
/* 38 */                oOo0ooi = i0000Il00O.I00iiI;
/* 40 */                i01O1lIi2 = i0000Il00O.I00iOIl;
                        try {
/* 42 */                    lIoii1l01l0i.I00000oOI(obj);
/* 121 */                   o0oiO0ilooli2 = (O0oiO0ilooli) oOo0ooi.I00iOIl;
/* 123 */                   if (o0oiO0ilooli2 != null) {
/* 125 */                       i01O1lIi2.I00ooIo0(o0oiO0ilooli2);
                            }
                        } catch (Throwable th3) {
/* 46 */                    th = th3;
/* 136 */                   o0oiO0ilooli = (O0oiO0ilooli) oOo0ooi.I00iOIl;
/* 138 */                   if (o0oiO0ilooli != null) {
                            }
/* 332 */                   throw th;
                        }
                    }
/* 128 */           return ooiIlOl1iI;
                }
            }
