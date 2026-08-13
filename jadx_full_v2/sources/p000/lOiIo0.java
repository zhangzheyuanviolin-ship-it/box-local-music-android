            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lOiIo0 {
                public static final Object I00000oIO(float f, float f2, float f3, I110IiI0o1Il i110IiI0o1Il, IlliIl1l11O illiIl1l11O, Oll0io oll0io) {
/* 1 */             OoIoOiiO1 ooIoOiiO1 = Ooo0ii.I00000oIO;
/* 5 */             Float f4 = new Float(f);
/* 10 */            Float f5 = new Float(f2);
/* 24 */            I110ooool i110oooolI0000Il00O = (I110ooool) ooIoOiiO1.I00000oIO.invoke(new Float(f3));
/* 26 */            if (i110oooolI0000Il00O == null) {
/* 36 */                i110oooolI0000Il00O = ((I110ooool) ooIoOiiO1.I00000oIO.invoke(f4)).I0000Il00O();
                    }
/* 40 */            I110ooool i110ooool = i110oooolI0000Il00O;
/* 45 */            OloIIOlO oloIIOlO = new OloIIOlO(i110IiI0o1Il, ooIoOiiO1, f4, f5, i110ooool);
/* 52 */            I110IiI1I1 i110IiI1I1 = new I110IiI1I1(ooIoOiiO1, f4, i110ooool, 56);
/* 60 */            OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(9);
/* 63 */            oiOi011iI1ol.I00iiI = illiIl1l11O;
/* 65 */            oiOi011iI1ol.I00iiO = ooIoOiiO1;
/* 67 */            VarHandle.storeStoreFence();
/* 72 */            Object objI00000oOI = I00000oOI(i110IiI1I1, oloIIOlO, Long.MIN_VALUE, oiOi011iI1ol, oll0io);
/* 76 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 78 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 80 */            if (objI00000oOI != ii0111o) {
/* 83 */                objI00000oOI = ooiIlOl1iI;
                    }
                    return objI00000oOI == ii0111o ? objI00000oOI : ooiIlOl1iI;
                }

                /* JADX WARN: Removed duplicated region for block: B:65:0x0190  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x019d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(I110IiI1I1 i110IiI1I1, I10ooi i10ooi, long j, Function1 function1, IOoilo iOoilo) throws Throwable {
                    Oll0Oi1 oll0Oi1;
                    OOo0ooi oOo0ooi;
                    I110IiI1I1 i110IiI1I12;
                    OOo0ooi oOo0ooi2;
                    I10ooi i10ooi2;
                    Function1 function12;
                    Object objI00000oIO;
                    I110IIooo i110IIooo;
                    I110IIooo i110IIooo2;
                    Object objI00000oIO2;
/* 9 */             o0llIi o0llii = o0llIi.I00iio;
/* 13 */            if (iOoilo instanceof Oll0Oi1) {
/* 16 */                oll0Oi1 = (Oll0Oi1) iOoilo;
/* 18 */                int i = oll0Oi1.I00ilO0;
/* 24 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 27 */                    oll0Oi1.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 33 */                    oll0Oi1 = new Oll0Oi1(iOoilo);
                        }
                    }
/* 29 */            Oll0Oi1 oll0Oi12 = oll0Oi1;
/* 37 */            Object obj = oll0Oi12.I00ilI0I1;
/* 39 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 41 */            int i2 = oll0Oi12.I00ilO0;
/* 43 */            int i3 = 10;
/* 46 */            int i4 = 1;
/* 47 */            if (i2 == 0) {
/* 76 */                lIoii1l01l0i.I00000oOI(obj);
/* 81 */                Object objI000II = i10ooi.I000II(0L);
/* 85 */                I110ooool i110oooolI0000O = i10ooi.I0000O(0L);
/* 91 */                oOo0ooi = new OOo0ooi();
/* 98 */                if (j == Long.MIN_VALUE) {
                            try {
/* 104 */                       float fI000O01llI0 = I000O01llI0(oll0Oi12.getContext());
/* 110 */                       Oll0OOI10o1i oll0OOI10o1i = new Oll0OOI10o1i();
/* 113 */                       oll0OOI10o1i.I00iOIl = oOo0ooi;
/* 115 */                       oll0OOI10o1i.I00iiI = objI000II;
/* 117 */                       oll0OOI10o1i.I00iiO = i10ooi;
/* 119 */                       oll0OOI10o1i.I00iio = i110oooolI0000O;
/* 121 */                       oll0OOI10o1i.I00ilI0I1 = i110IiI1I1;
/* 123 */                       oll0OOI10o1i.I00ilO0 = fI000O01llI0;
/* 125 */                       oll0OOI10o1i.I00io1l = function1;
/* 127 */                       VarHandle.storeStoreFence();
/* 130 */                       oll0Oi12.I00iOIl = i110IiI1I1;
/* 132 */                       oll0Oi12.I00iiI = i10ooi;
/* 134 */                       oll0Oi12.I00iiO = function1;
/* 136 */                       oll0Oi12.I00iio = oOo0ooi;
/* 138 */                       oll0Oi12.I00ilO0 = 1;
/* 144 */                       if (!i10ooi.I00000oIO()) {
/* 177 */                           II0O1i0I1 iI0O1i0I1 = new II0O1i0I1(i3);
/* 180 */                           iI0O1i0I1.I00iiI = oll0OOI10o1i;
/* 182 */                           VarHandle.storeStoreFence();
/* 193 */                           objI00000oIO = l1i0lii.I00000oIO(oll0Oi12.getContext()).I00000oIO(oll0Oi12, iI0O1i0I1);
                                } else {
/* 154 */                           if (oll0Oi12.getContext().I00lli11(o0llii) != null) {
/* 174 */                               throw new ClassCastException();
                                    }
/* 164 */                           objI00000oIO = l1i0lii.I00000oIO(oll0Oi12.getContext()).I00000oIO(oll0Oi12, oll0OOI10o1i);
                                }
/* 197 */                       if (objI00000oIO != ii0111o) {
/* 201 */                           i10ooi2 = i10ooi;
/* 202 */                           i110IiI1I12 = i110IiI1I1;
/* 203 */                           function12 = function1;
                                }
                            } catch (CancellationException e) {
/* 208 */                       e = e;
/* 205 */                       i110IiI1I12 = i110IiI1I1;
/* 397 */                       i110IIooo = (I110IIooo) oOo0ooi.I00iOIl;
/* 399 */                       if (i110IIooo != null) {
/* 405 */                           i110IIooo.I000OOo1O.setValue(Boolean.FALSE);
                                }
/* 410 */                       i110IIooo2 = (I110IIooo) oOo0ooi.I00iOIl;
/* 412 */                       if (i110IIooo2 != null && i110IIooo2.I000II == i110IiI1I12.I00iio) {
/* 423 */                           i110IiI1I12.I00ilO0 = false;
                                }
/* 2230 */                      throw e;
                            }
                        } else {
                            try {
/* 212 */                       OoIoOiiO1 ooIoOiiO1I0000Il00O = i10ooi.I0000Il00O();
/* 216 */                       Object objI000O01llI0 = i10ooi.I000O01llI0();
                                try {
/* 222 */                           OiilOO10IOl oiilOO10IOl = new OiilOO10IOl(1);
/* 225 */                           oiilOO10IOl.I00iiI = i110IiI1I1;
/* 227 */                           VarHandle.storeStoreFence();
/* 238 */                           I110IIooo i110IIooo3 = new I110IIooo(objI000II, ooIoOiiO1I0000Il00O, i110oooolI0000O, j, objI000O01llI0, j, oiilOO10IOl);
/* 250 */                           oOo0ooi2 = oOo0ooi;
                                    try {
/* 253 */                               I000II(i110IIooo3, j, I000O01llI0(oll0Oi12.getContext()), i10ooi, i110IiI1I1, function1);
/* 256 */                               oOo0ooi2.I00iOIl = i110IIooo3;
/* 258 */                               i110IiI1I12 = i110IiI1I1;
/* 260 */                               i10ooi2 = i10ooi;
/* 262 */                               function12 = function1;
/* 264 */                               oOo0ooi = oOo0ooi2;
                                    } catch (CancellationException e2) {
/* 382 */                               e = e2;
/* 383 */                               i110IiI1I12 = i110IiI1I1;
/* 385 */                               oOo0ooi = oOo0ooi2;
/* 397 */                               i110IIooo = (I110IIooo) oOo0ooi.I00iOIl;
/* 399 */                               if (i110IIooo != null) {
                                        }
/* 410 */                               i110IIooo2 = (I110IIooo) oOo0ooi.I00iOIl;
/* 412 */                               if (i110IIooo2 != null) {
                                        }
/* 2230 */                              throw e;
                                    }
                                } catch (CancellationException e3) {
/* 392 */                           e = e3;
/* 393 */                           oOo0ooi2 = oOo0ooi;
                                }
                            } catch (CancellationException e4) {
/* 387 */                       e = e4;
/* 389 */                       i110IiI1I12 = i110IiI1I1;
                            }
                        }
/* 378 */               return ii0111o;
                    }
/* 49 */            if (i2 != 1 && i2 != 2) {
/* 71 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 74 */                return null;
                    }
/* 53 */            oOo0ooi = oll0Oi12.I00iio;
/* 55 */            function12 = oll0Oi12.I00iiO;
/* 57 */            i10ooi2 = oll0Oi12.I00iiI;
/* 59 */            i110IiI1I12 = oll0Oi12.I00iOIl;
                    try {
/* 61 */                lIoii1l01l0i.I00000oOI(obj);
                    } catch (CancellationException e5) {
/* 66 */                e = e5;
/* 397 */               i110IIooo = (I110IIooo) oOo0ooi.I00iOIl;
/* 399 */               if (i110IIooo != null) {
                        }
/* 410 */               i110IIooo2 = (I110IIooo) oOo0ooi.I00iOIl;
/* 412 */               if (i110IIooo2 != null) {
/* 423 */                   i110IiI1I12.I00ilO0 = false;
                        }
/* 2230 */              throw e;
                    }
/* 281 */           while (((Boolean) ((I110IIooo) oOo0ooi.I00iOIl).I000OOo1O.getValue()).booleanValue()) {
/* 287 */               float fI000O01llI02 = I000O01llI0(oll0Oi12.getContext());
/* 293 */               II11o10OOl0 iI11o10OOl0 = new II11o10OOl0(i4);
/* 296 */               iI11o10OOl0.I00iiO = oOo0ooi;
/* 298 */               iI11o10OOl0.I00iiI = fI000O01llI02;
/* 300 */               iI11o10OOl0.I00iio = i10ooi2;
/* 302 */               iI11o10OOl0.I00ilI0I1 = i110IiI1I12;
/* 304 */               iI11o10OOl0.I00ilO0 = function12;
/* 306 */               VarHandle.storeStoreFence();
/* 309 */               oll0Oi12.I00iOIl = i110IiI1I12;
/* 311 */               oll0Oi12.I00iiI = i10ooi2;
/* 313 */               oll0Oi12.I00iiO = function12;
/* 315 */               oll0Oi12.I00iio = oOo0ooi;
/* 317 */               oll0Oi12.I00ilO0 = 2;
/* 323 */               if (!i10ooi2.I00000oIO()) {
/* 356 */                   II0O1i0I1 iI0O1i0I12 = new II0O1i0I1(i3);
/* 359 */                   iI0O1i0I12.I00iiI = iI11o10OOl0;
/* 361 */                   VarHandle.storeStoreFence();
/* 372 */                   objI00000oIO2 = l1i0lii.I00000oIO(oll0Oi12.getContext()).I00000oIO(oll0Oi12, iI0O1i0I12);
                        } else {
/* 333 */                   if (oll0Oi12.getContext().I00lli11(o0llii) != null) {
/* 353 */                       throw new ClassCastException();
                            }
/* 343 */                   objI00000oIO2 = l1i0lii.I00000oIO(oll0Oi12.getContext()).I00000oIO(oll0Oi12, iI11o10OOl0);
                        }
/* 376 */               if (objI00000oIO2 == ii0111o) {
/* 378 */                   return ii0111o;
                        }
                    }
/* 379 */           return OoiIlOl1iI.I00000oIO;
                }

                public static Object I0000Il00O(float f, float f2, I110IiI0o1Il i110IiI0o1Il, IlliIl1l11O illiIl1l11O, Oll0io oll0io, int i) {
/* 3 */             if ((i & 8) != 0) {
/* 8 */                 i110IiI0o1Il = iOO01lio0.I0000Il00O(0.0f, 0.0f, null, 7);
                    }
/* 18 */            return I00000oIO(f, f2, 0.0f, i110IiI0o1Il, illiIl1l11O, oll0io);
                }

                public static final Object I0000O(I110IiI1I1 i110IiI1I1, Ii1OoIll0 ii1OoIll0, boolean z, Function1 function1, IOoilo iOoilo) throws Throwable {
/* 3 */             Object value = i110IiI1I1.I00iiI.getValue();
/* 7 */             I110ooool i110ooool = i110IiI1I1.I00iiO;
/* 9 */             OoIoOiiO1 ooIoOiiO1 = i110IiI1I1.I00iOIl;
/* 15 */            IlOOi0 ilOOi0 = ii1OoIll0.I00000oIO;
/* 17 */            OooI1011O1 oooI1011O1 = new OooI1011O1();
/* 20 */            oooI1011O1.I00000oIO = ilOOi0;
/* 26 */            oooI1011O1.I0000oI00 = ilOOi0.I00000oOI();
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            I0Oi1Il1oi i0Oi1Il1oi = new I0Oi1Il1oi();
/* 34 */            i0Oi1Il1oi.I00000oOI = oooI1011O1;
/* 36 */            i0Oi1Il1oi.I0000Il00O = ooIoOiiO1;
/* 38 */            i0Oi1Il1oi.I0000O = value;
/* 46 */            I110ooool i110ooool2 = (I110ooool) ooIoOiiO1.I00000oIO.invoke(value);
/* 48 */            i0Oi1Il1oi.I0000oI00 = i110ooool2;
/* 54 */            i0Oi1Il1oi.I0001Ioi1lo = iOO0I0o1i0Il.I00000oIO(i110ooool);
/* 56 */            Function1 function12 = ooIoOiiO1.I00000oOI;
/* 58 */            I110ooool i110oooolI0000Il00O = oooI1011O1.I0000O;
/* 60 */            if (i110oooolI0000Il00O == null) {
/* 62 */                i110oooolI0000Il00O = i110ooool2.I0000Il00O();
/* 66 */                oooI1011O1.I0000O = i110oooolI0000Il00O;
                    }
/* 68 */            int iI00000oOI = i110oooolI0000Il00O.I00000oOI();
/* 73 */            int i = 0;
                    while (true) {
/* 74 */                I110ooool i110ooool3 = oooI1011O1.I0000O;
/* 79 */                if (i >= iI00000oOI) {
/* 107 */                   if (i110ooool3 == null) {
/* 224 */                       O0000Ioio00.I000OOo1O("targetVector");
/* 399 */                       throw null;
                            }
/* 113 */                   i0Oi1Il1oi.I000O01llI0 = function12.invoke(i110ooool3);
/* 115 */                   I110ooool i110oooolI0000Il00O2 = oooI1011O1.I0000Il00O;
/* 117 */                   if (i110oooolI0000Il00O2 == null) {
/* 119 */                       i110oooolI0000Il00O2 = i110ooool2.I0000Il00O();
/* 123 */                       oooI1011O1.I0000Il00O = i110oooolI0000Il00O2;
                            }
/* 125 */                   int iI00000oOI2 = i110oooolI0000Il00O2.I00000oOI();
/* 129 */                   long jMax = 0;
/* 132 */                   for (int i2 = 0; i2 < iI00000oOI2; i2++) {
/* 134 */                       IlOOi0 ilOOi02 = oooI1011O1.I00000oIO;
/* 136 */                       i110ooool2.getClass();
/* 147 */                       jMax = Math.max(jMax, ilOOi02.I001IIilI0O(i110ooool.I00000oIO(i2)));
                            }
/* 154 */                   i0Oi1Il1oi.I00000oIO = jMax;
/* 164 */                   I110ooool i110oooolI00000oIO = iOO0I0o1i0Il.I00000oIO(oooI1011O1.I00000oIO(jMax, (I110ooool) i0Oi1Il1oi.I0000oI00, i110ooool));
/* 168 */                   i0Oi1Il1oi.I000II = i110oooolI00000oIO;
/* 170 */                   int iI00000oOI3 = i110oooolI00000oIO.I00000oOI();
/* 174 */                   for (int i3 = 0; i3 < iI00000oOI3; i3++) {
/* 178 */                       I110ooool i110ooool4 = (I110ooool) i0Oi1Il1oi.I000II;
/* 180 */                       float fI00000oIO = i110ooool4.I00000oIO(i3);
/* 184 */                       float f = oooI1011O1.I0000oI00;
/* 191 */                       i110ooool4.I0000oI00(i3, lIiioliIlo.I00000oOI(fI00000oIO, -f, f));
                            }
/* 197 */                   VarHandle.storeStoreFence();
/* 212 */                   Object objI00000oOI = I00000oOI(i110IiI1I1, i0Oi1Il1oi, z ? i110IiI1I1.I00iio : Long.MIN_VALUE, function1, iOoilo);
                            return objI00000oOI == Ii0111o.I00iOIl ? objI00000oOI : OoiIlOl1iI.I00000oIO;
                        }
/* 81 */                if (i110ooool3 == null) {
/* 103 */                   O0000Ioio00.I000OOo1O("targetVector");
/* 106 */                   throw null;
                        }
/* 97 */                i110ooool3.I0000oI00(i, oooI1011O1.I00000oIO.I001lllioOl(i110ooool2.I00000oIO(i), i110ooool.I00000oIO(i)));
/* 100 */               i++;
                    }
                }

                public static final Object I0000oI00(I110IiI1I1 i110IiI1I1, Float f, I110IiI0o1Il i110IiI0o1Il, boolean z, Function1 function1, IOoilo iOoilo) throws Throwable {
/* 26 */            Object objI00000oOI = I00000oOI(i110IiI1I1, new OloIIOlO(i110IiI0o1Il, i110IiI1I1.I00iOIl, i110IiI1I1.I00iiI.getValue(), f, i110IiI1I1.I00iiO), z ? i110IiI1I1.I00iio : Long.MIN_VALUE, function1, iOoilo);
                    return objI00000oOI == Ii0111o.I00iOIl ? objI00000oOI : OoiIlOl1iI.I00000oIO;
                }

                public static Object I0001Ioi1lo(I110IiI1I1 i110IiI1I1, Float f, OlIOiI1iI1 olIOiI1iI1, boolean z, Function1 function1, IOoilo iOoilo, int i) {
/* 3 */             if ((i & 2) != 0) {
/* 8 */                 olIOiI1iI1 = iOO01lio0.I0000Il00O(0.0f, 0.0f, null, 7);
                    }
/* 12 */            OlIOiI1iI1 olIOiI1iI12 = olIOiI1iI1;
/* 15 */            if ((i & 8) != 0) {
/* 21 */                function1 = new OiioI1Io0o(17);
                    }
/* 29 */            return I0000oI00(i110IiI1I1, f, olIOiI1iI12, z, function1, iOoilo);
                }

                public static final void I000II(I110IIooo i110IIooo, long j, float f, I10ooi i10ooi, I110IiI1I1 i110IiI1I1, Function1 function1) {
/* 17 */            long jI00000oOI = f == 0.0f ? i10ooi.I00000oOI() : (long) ((j - i110IIooo.I0000Il00O) / f);
/* 18 */            i110IIooo.I000II = j;
/* 26 */            i110IIooo.I0000oI00.setValue(i10ooi.I000II(jI00000oOI));
/* 33 */            i110IIooo.I0001Ioi1lo = i10ooi.I0000O(jI00000oOI);
/* 39 */            if (i10ooi.I0000oI00(jI00000oOI)) {
/* 43 */                i110IIooo.I000O01llI0 = i110IIooo.I000II;
/* 49 */                i110IIooo.I000OOo1O.setValue(Boolean.FALSE);
                    }
/* 52 */            I000OOo1O(i110IIooo, i110IiI1I1);
/* 55 */            function1.invoke(i110IIooo);
                }

                public static final float I000O01llI0(Ii00l101O ii00l101O) {
/* 7 */             OI01II0li oI01II0li = (OI01II0li) ii00l101O.I00lli11(lolIo0.I00ilO0);
/* 16 */            float fI00OOll1 = oI01II0li != null ? oI01II0li.I00OOll1() : 1.0f;
/* 21 */            if (fI00OOll1 >= 0.0f) {
/* 23 */                return fI00OOll1;
                    }
/* 26 */            OO1olIl.I00000oOI("negative scale factor");
/* 29 */            return fI00OOll1;
                }

                public static final void I000OOo1O(I110IIooo i110IIooo, I110IiI1I1 i110IiI1I1) {
/* 9 */             i110IiI1I1.I00iiI.setValue(i110IIooo.I0000oI00.getValue());
/* 12 */            I110ooool i110ooool = i110IiI1I1.I00iiO;
/* 14 */            I110ooool i110ooool2 = i110IIooo.I0001Ioi1lo;
/* 16 */            int iI00000oOI = i110ooool.I00000oOI();
/* 21 */            for (int i = 0; i < iI00000oOI; i++) {
/* 27 */                i110ooool.I0000oI00(i, i110ooool2.I00000oIO(i));
                    }
/* 35 */            i110IiI1I1.I00ilI0I1 = i110IIooo.I000O01llI0;
/* 39 */            i110IiI1I1.I00iio = i110IIooo.I000II;
/* 53 */            i110IiI1I1.I00ilO0 = ((Boolean) i110IIooo.I000OOo1O.getValue()).booleanValue();
                }
            }
