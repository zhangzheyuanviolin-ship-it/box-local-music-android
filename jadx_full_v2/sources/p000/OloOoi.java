            package p000;

            import android.os.Trace;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class OloOoi extends O1ooOo implements O0iOoioOoI, Iillo1il11l, OiiooOl {
                public I1111OO10i I00o0iI0io1;
                public Oo0lloOiiIOI I00o0l1o1o0;
                public IliO0o11i01 I00o101lO;
                public Function1 I00oI0i;
                public int I00oII;
                public boolean I00oIiI10;
                public int I00oO101o;
                public int I00oOio10iI1;
                public List I00ol1;
                public Function1 I00olI;
                public OiiiOo1IOlI I00oli;
                public IOOioI10Il1 I00oliIiO01i;
                public I1ili1lI0O I00oo1iO0ll;
                public Function1 I00ooIo0;
                public Map I00ooiO1I;
                public OI0Oi1llo1i I00oooO;
                public OloOloOO1 I0100i;
                public OloOoIO1OOo I0100o111I;

                public OloOoi(I1111OO10i i1111OO10i, Oo0lloOiiIOI oo0lloOiiIOI, IliO0o11i01 iliO0o11i01, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, OiiiOo1IOlI oiiiOo1IOlI, IOOioI10Il1 iOOioI10Il1, I1ili1lI0O i1ili1lI0O, Function1 function13) {
/* 4 */             this.I00o0iI0io1 = i1111OO10i;
/* 6 */             this.I00o0l1o1o0 = oo0lloOiiIOI;
/* 8 */             this.I00o101lO = iliO0o11i01;
/* 10 */            this.I00oI0i = function1;
/* 12 */            this.I00oII = i;
/* 14 */            this.I00oIiI10 = z;
/* 16 */            this.I00oO101o = i2;
/* 18 */            this.I00oOio10iI1 = i3;
/* 20 */            this.I00ol1 = list;
/* 22 */            this.I00olI = function12;
/* 24 */            this.I00oli = oiiiOo1IOlI;
/* 26 */            this.I00oliIiO01i = iOOioI10Il1;
/* 28 */            this.I00oo1iO0ll = i1ili1lI0O;
/* 30 */            this.I00ooIo0 = function13;
                }

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 3 */             Trace.beginSection("TextAnnotatedStringNode:measure");
                    try {
/* 6 */                 OI0Oi1llo1i oI0Oi1llo1iI010lI0oi = I010lI0oi(o1iOIoOiO0);
/* 14 */                boolean zI0000Il00O = oI0Oi1llo1iI010lI0oi.I0000Il00O(j, o1iOIoOiO0.getLayoutDirection());
/* 18 */                Oo0iil0o0oI oo0iil0o0oI = oI0Oi1llo1iI010lI0oi.I000oI1ioi;
/* 20 */                if (oo0iil0o0oI == null) {
/* 162 */                   throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + oI0Oi1llo1iI010lI0oi);
                        }
/* 22 */                long j2 = oo0iil0o0oI.I0000Il00O;
/* 28 */                oo0iil0o0oI.I00000oOI.I00000oIO.I0000O();
/* 31 */                if (zI0000Il00O) {
/* 33 */                    l0o11Oi.I00000oIO(this);
/* 36 */                    Function1 function1 = this.I00oI0i;
/* 38 */                    if (function1 != null) {
/* 40 */                        function1.invoke(oo0iil0o0oI);
                            }
/* 43 */                    OiiiOo1IOlI oiiiOo1IOlI = this.I00oli;
/* 45 */                    if (oiiiOo1IOlI != null) {
/* 47 */                        oiiiOo1IOlI.I0000Il00O(oo0iil0o0oI);
                            }
/* 50 */                    Map linkedHashMap = this.I00ooiO1I;
/* 52 */                    if (linkedHashMap == null) {
/* 57 */                        linkedHashMap = new LinkedHashMap(2);
                            }
/* 72 */                    linkedHashMap.put(I0l00ioI.I00000oIO, Integer.valueOf(Math.round(oo0iil0o0oI.I0000O)));
/* 87 */                    linkedHashMap.put(I0l00ioI.I00000oOI, Integer.valueOf(Math.round(oo0iil0o0oI.I0000oI00)));
/* 90 */                    this.I00ooiO1I = linkedHashMap;
                        }
/* 92 */                Function1 function12 = this.I00olI;
/* 94 */                if (function12 != null) {
/* 98 */                    function12.invoke(oo0iil0o0oI.I0001Ioi1lo);
                        }
/* 105 */               int i = (int) (j2 >> 32);
/* 112 */               int i2 = (int) (j2 & 4294967295L);
/* 117 */               OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(iio0lo1i.I00000oOI(i, i, i2, i2));
/* 121 */               Map map = this.I00ooiO1I;
/* 127 */               I0li0o i0li0o = new I0li0o(13);
/* 130 */               i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 132 */               VarHandle.storeStoreFence();
/* 135 */               return o1iOIoOiO0.I001i1lo1io(i, i2, map, i0li0o);
                    } finally {
/* 164 */               Trace.endSection();
                    }
                }

                @Override
                public final int I0001Ioi1lo(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 17 */            return lOiooi0lII0.I00000oIO(I010lI0oi(o1IiO0l).I0000oI00(o1IiO0l.getLayoutDirection()).I000l1());
                }

                @Override
                public final int I00Ol10(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 9 */             return I010lI0oi(o1IiO0l).I00000oIO(i, o1IiO0l.getLayoutDirection());
                }

                @Override
                public final int I00iOIl(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 9 */             return I010lI0oi(o1IiO0l).I00000oIO(i, o1IiO0l.getLayoutDirection());
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
                /* JADX WARN: Type inference failed for: r18v1 */
                /* JADX WARN: Type inference failed for: r18v2, types: [IIolOo] */
                /* JADX WARN: Type inference failed for: r18v6 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00l0I0l0lO1(O0iiliOio o0iiliOio) throws Throwable {
                    long j;
                    ?? r18;
                    OlooIOI0O olooIOI0O;
                    OioOII0oI oioOII0oI;
                    Iilloo0IOoIo iilloo0IOoIo;
                    III11l1I iII11l1II0000Il00O;
                    IIolOo iIolOo;
                    List list;
                    OiiOlI0I oiiOlI0I;
                    IOO000ilo iOO000ilo;
                    long j2;
                    Oo0iil0o0oI oo0iil0o0oI;
/* 5 */             IIolilIo iIolilIo = o0iiliOio.I00iOIl;
/* 9 */             if (this.I00lll10) {
/* 13 */                OiiiOo1IOlI oiiiOo1IOlI = this.I00oli;
/* 24 */                if (oiiiOo1IOlI == null || (oiiOlI0I = (OiiOlI0I) oiiiOo1IOlI.I00000oOI.I00000oIO().I0000oI00(oiiiOo1IOlI.I00000oIO)) == null) {
/* 223 */                   j = 4294967295L;
                        } else {
/* 43 */                    OiiOOli oiiOOli = oiiOlI0I.I00000oOI;
/* 45 */                    OiiOOli oiiOOli2 = oiiOlI0I.I00000oIO;
/* 47 */                    boolean z = oiiOlI0I.I0000Il00O;
/* 54 */                    int i = !z ? oiiOOli2.I00000oOI : oiiOOli.I00000oOI;
/* 61 */                    int i2 = !z ? oiiOOli.I00000oOI : oiiOOli2.I00000oOI;
/* 63 */                    if (i != i2) {
/* 66 */                        OI0i1o0iOo0 oI0i1o0iOo0 = oiiiOo1IOlI.I0000oI00;
/* 86 */                        int iI00000oOI = (oI0i1o0iOo0 == null || (oo0iil0o0oI = (Oo0iil0o0oI) oI0i1o0iOo0.I0000Il00O.invoke()) == null) ? 0 : oI0i1o0iOo0.I00000oOI(oo0iil0o0oI);
/* 87 */                        if (i > iI00000oOI) {
/* 89 */                            i = iI00000oOI;
                                }
/* 90 */                        if (i2 > iI00000oOI) {
/* 92 */                            i2 = iI00000oOI;
                                }
/* 97 */                        Oo0iil0o0oI oo0iil0o0oI2 = (Oo0iil0o0oI) oiiiOo1IOlI.I0000O.I00iiO;
/* 106 */                       I0ol0lI i0ol0lII000OiO = oo0iil0o0oI2 != null ? oo0iil0o0oI2.I000OiO(i, i2) : null;
/* 107 */                       if (i0ol0lII000OiO != null) {
/* 115 */                           Oo0iil0o0oI oo0iil0o0oI3 = (Oo0iil0o0oI) oiiiOo1IOlI.I0000O.I00iiO;
/* 117 */                           if (oo0iil0o0oI3 == null || oo0iil0o0oI3.I00000oIO.I0001Ioi1lo == 3 || !oo0iil0o0oI3.I0000oI00()) {
/* 210 */                               j = 4294967295L;
/* 219 */                               IilloIOOO0i.I00Io1lO(o0iiliOio, i0ol0lII000OiO, oiiiOo1IOlI.I0000Il00O, null, 60);
                                    } else {
/* 138 */                               float fIntBitsToFloat = Float.intBitsToFloat((int) (iIolilIo.I0000oI00() >> 32));
/* 148 */                               float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iIolilIo.I0000oI00() & 4294967295L));
/* 152 */                               IOO000ilo iOO000ilo2 = iIolilIo.I00iiI;
/* 154 */                               long jI001iOo1i0O = iOO000ilo2.I001iOo1i0O();
/* 162 */                               iOO000ilo2.I0010o().I000II();
                                        try {
/* 171 */                                   r18 = 1;
/* 173 */                                   ((IIOOoll) iOO000ilo2.I00iiI).I00IlilI0i0i(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
/* 177 */                                   iOO000ilo = iOO000ilo2;
                                            try {
/* 186 */                                       j = 4294967295L;
/* 187 */                                       j2 = jI001iOo1i0O;
                                                try {
/* 190 */                                           IilloIOOO0i.I00Io1lO(o0iiliOio, i0ol0lII000OiO, oiiiOo1IOlI.I0000Il00O, null, 60);
/* 193 */                                           IIlIOloOOO.I001IO000(iOO000ilo, j2);
                                                } catch (Throwable th) {
/* 197 */                                           th = th;
/* 205 */                                           IIlIOloOOO.I001IO000(iOO000ilo, j2);
/* 208 */                                           throw th;
                                                }
                                            } catch (Throwable th2) {
/* 199 */                                       th = th2;
/* 200 */                                       j2 = jI001iOo1i0O;
/* 205 */                                       IIlIOloOOO.I001IO000(iOO000ilo, j2);
/* 208 */                                       throw th;
                                            }
                                        } catch (Throwable th3) {
/* 202 */                                   th = th3;
/* 203 */                                   iOO000ilo = iOO000ilo2;
                                        }
                                    }
                                }
                            }
                        }
/* 226 */               IIolOo iIolOoI0010o = iIolilIo.I00iiI.I0010o();
/* 230 */               OI0Oi1llo1i oI0Oi1llo1iI010lI0oi = I010lI0oi(o0iiliOio);
/* 234 */               Oo0iil0o0oI oo0iil0o0oI4 = oI0Oi1llo1iI010lI0oi.I000oI1ioi;
/* 236 */               if (oo0iil0o0oI4 == null) {
/* 449 */                   IoOOl0iOl1io.I000OOo1O("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ", oI0Oi1llo1iI010lI0oi);
/* 1261 */                  return;
                        }
/* 238 */               OI0OIIiOi oI0OIIiOi = oo0iil0o0oI4.I00000oOI;
/* 254 */               boolean z2 = oo0iil0o0oI4.I0000oI00() && this.I00oII != 3;
/* 255 */               if (z2) {
/* 257 */                   long j3 = oo0iil0o0oI4.I0000Il00O;
/* 283 */                   OOo0IO oOo0IOI00000oIO = lIl0looO.I00000oIO(0L, (Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & j)) & j));
/* 287 */                   iIolOoI0010o.I000II();
/* 290 */                   IIolOo.I00100o1O0lo(iIolOoI0010o, oOo0IOI00000oIO);
                        }
                        try {
/* 293 */                   Oo0lloOiiIOI oo0lloOiiIOI = this.I00o0l1o1o0;
/* 295 */                   OlIIi1oIIOlo olIIi1oIIOlo = oo0lloOiiIOI.I00000oIO;
/* 297 */                   OlooIOI0O olooIOI0O2 = olIIi1oIIOlo.I000lI;
/* 299 */                   if (olooIOI0O2 == null) {
/* 301 */                       olooIOI0O2 = OlooIOI0O.I00000oOI;
                            }
/* 303 */                   olooIOI0O = olooIOI0O2;
/* 311 */                   OioOII0oI oioOII0oI2 = olIIi1oIIOlo.I000o00OoI0I;
/* 313 */                   if (oioOII0oI2 == null) {
/* 315 */                       oioOII0oI2 = OioOII0oI.I0000O;
                            }
/* 317 */                   oioOII0oI = oioOII0oI2;
/* 319 */                   Iilloo0IOoIo iilloo0IOoIo2 = olIIi1oIIOlo.I00100l0;
/* 321 */                   if (iilloo0IOoIo2 == null) {
/* 323 */                       iilloo0IOoIo2 = IlIl1I110o0I.I00000oIO;
                            }
/* 325 */                   iilloo0IOoIo = iilloo0IOoIo2;
/* 327 */                   iII11l1II0000Il00O = oo0lloOiiIOI.I0000Il00O();
                        } catch (Throwable th4) {
/* 306 */                   th = th4;
/* 307 */                   r18 = iIolOoI0010o;
                        }
                        try {
/* 331 */                   if (iII11l1II0000Il00O != null) {
/* 343 */                       iIolOo = iIolOoI0010o;
/* 347 */                       iOIliilOOIIo.I00000oIO(oI0OIIiOi, iIolOo, iII11l1II0000Il00O, this.I00o0l1o1o0.I00000oIO.I00000oIO.I0000Il00O(), oioOII0oI, olooIOI0O, iilloo0IOoIo);
                            } else {
/* 353 */                       iIolOo = iIolOoI0010o;
/* 357 */                       IOOioI10Il1 iOOioI10Il1 = this.I00oliIiO01i;
/* 366 */                       long jI00000oIO = iOOioI10Il1 != null ? iOOioI10Il1.I00000oIO() : IOOiio0i.I000o00OoI0I;
/* 372 */                       if (jI00000oIO == 16) {
/* 394 */                           jI00000oIO = this.I00o0l1o1o0.I0000O() != 16 ? this.I00o0l1o1o0.I0000O() : IOOiio0i.I00000oOI;
                                }
/* 399 */                       OI0OIIiOi.I000OiO(oI0OIIiOi, iIolOo, jI00000oIO, oioOII0oI, olooIOI0O, iilloo0IOoIo, 32);
                            }
/* 402 */                   if (z2) {
/* 404 */                       iIolOo.I00100l0();
                            }
/* 407 */                   OloOoIO1OOo oloOoIO1OOo = this.I0100o111I;
/* 422 */                   if (((oloOoIO1OOo == null || !oloOoIO1OOo.I0000Il00O) ? lOioiI.I00000oIO(this.I00o0iI0io1) : false) || !((list = this.I00ol1) == null || list.isEmpty())) {
/* 437 */                       o0iiliOio.I00000oOI();
                            }
                        } catch (Throwable th5) {
/* 351 */                   th = th5;
/* 441 */                   if (z2) {
/* 443 */                       r18.I00100l0();
                            }
/* 446 */                   throw th;
                        }
                    }
                }

                @Override
                public final int I00li1OI(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 17 */            return lOiooi0lII0.I00000oIO(I010lI0oi(o1IiO0l).I0000oI00(o1IiO0l.getLayoutDirection()).I000II());
                }

                @Override
                public final void I00oOio10iI1(Oil0O0I oil0O0I) {
/* 1 */             OloOloOO1 oloOloOO1 = this.I0100i;
/* 3 */             if (oloOloOO1 == null) {
/* 8 */                 oloOloOO1 = new OloOloOO1(0);
/* 11 */                oloOloOO1.I00iiI = this;
/* 13 */                VarHandle.storeStoreFence();
/* 16 */                this.I0100i = oloOloOO1;
                    }
/* 18 */            I1111OO10i i1111OO10i = this.I00o0iI0io1;
/* 20 */            O0O00I1Ili[] o0O00I1IliArr = Oil0Io.I00000oIO;
/* 28 */            oil0O0I.I00000oOI(Oil0I1O.I001lloI, Collections.singletonList(i1111OO10i));
/* 31 */            OloOoIO1OOo oloOoIO1OOo = this.I0100o111I;
/* 33 */            if (oloOoIO1OOo != null) {
/* 35 */                I1111OO10i i1111OO10i2 = oloOoIO1OOo.I00000oOI;
/* 37 */                Oil0IoooOio oil0IoooOio = Oil0I1O.I00II0Ol1O0l;
/* 39 */                O0O00I1Ili[] o0O00I1IliArr2 = Oil0Io.I00000oIO;
/* 43 */                O0O00I1Ili o0O00I1Ili = o0O00I1IliArr2[16];
/* 45 */                oil0IoooOio.getClass();
/* 48 */                oil0O0I.I00000oOI(oil0IoooOio, i1111OO10i2);
/* 51 */                boolean z = oloOoIO1OOo.I0000Il00O;
/* 53 */                Oil0IoooOio oil0IoooOio2 = Oil0I1O.I00II0oii1o;
/* 57 */                O0O00I1Ili o0O00I1Ili2 = o0O00I1IliArr2[17];
/* 59 */                Boolean boolValueOf = Boolean.valueOf(z);
/* 63 */                oil0IoooOio2.getClass();
/* 66 */                oil0O0I.I00000oOI(oil0IoooOio2, boolValueOf);
                    }
/* 72 */            OloOloOO1 oloOloOO12 = new OloOloOO1(1);
/* 75 */            oloOloOO12.I00iiI = this;
/* 77 */            VarHandle.storeStoreFence();
/* 88 */            oil0O0I.I00000oOI(Oiioi1IoIIli.I000l1, new I01lOOlO0o(null, oloOloOO12));
/* 94 */            OloOloOO1 oloOloOO13 = new OloOloOO1(2);
/* 97 */            oloOloOO13.I00iiI = this;
/* 99 */            VarHandle.storeStoreFence();
/* 109 */           oil0O0I.I00000oOI(Oiioi1IoIIli.I000lI, new I01lOOlO0o(null, oloOloOO13));
/* 115 */           OlOi0iollo olOi0iollo = new OlOi0iollo(4);
/* 118 */           olOi0iollo.I00iiI = this;
/* 120 */           VarHandle.storeStoreFence();
/* 130 */           oil0O0I.I00000oOI(Oiioi1IoIIli.I000o00OoI0I, new I01lOOlO0o(null, olOi0iollo));
/* 133 */           Oil0Io.I00000oIO(oil0O0I, oloOloOO1);
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }

                public final void I010l1O(boolean z, boolean z2, boolean z3, boolean z4) {
/* 1 */             if (z2 || z3 || z4) {
/* 7 */                 OI0Oi1llo1i oI0Oi1llo1iI010l1ol111 = I010l1ol111();
/* 11 */                I1111OO10i i1111OO10i = this.I00o0iI0io1;
/* 13 */                Oo0lloOiiIOI oo0lloOiiIOI = this.I00o0l1o1o0;
/* 15 */                IliO0o11i01 iliO0o11i01 = this.I00o101lO;
/* 17 */                int i = this.I00oII;
/* 19 */                boolean z5 = this.I00oIiI10;
/* 21 */                int i2 = this.I00oO101o;
/* 23 */                int i3 = this.I00oOio10iI1;
/* 25 */                List list = this.I00ol1;
/* 27 */                I1ili1lI0O i1ili1lI0O = this.I00oo1iO0ll;
/* 29 */                oI0Oi1llo1iI010l1ol111.I00000oIO = i1111OO10i;
/* 31 */                oI0Oi1llo1iI010l1ol111.I0001Ioi1lo(oo0lloOiiIOI);
/* 34 */                oI0Oi1llo1iI010l1ol111.I00000oOI = iliO0o11i01;
/* 36 */                oI0Oi1llo1iI010l1ol111.I0000Il00O = i;
/* 38 */                oI0Oi1llo1iI010l1ol111.I0000O = z5;
/* 40 */                oI0Oi1llo1iI010l1ol111.I0000oI00 = i2;
/* 42 */                oI0Oi1llo1iI010l1ol111.I0001Ioi1lo = i3;
/* 44 */                oI0Oi1llo1iI010l1ol111.I000II = list;
/* 46 */                oI0Oi1llo1iI010l1ol111.I000O01llI0 = i1ili1lI0O;
/* 55 */                oI0Oi1llo1iI010l1ol111.I0010o = (oI0Oi1llo1iI010l1ol111.I0010o << 2) | 2;
/* 58 */                oI0Oi1llo1iI010l1ol111.I000lI = null;
/* 60 */                oI0Oi1llo1iI010l1ol111.I000oI1ioi = null;
/* 63 */                oI0Oi1llo1iI010l1ol111.I00100o1O0lo = -1;
/* 65 */                oI0Oi1llo1iI010l1ol111.I00100l0 = -1;
/* 67 */                oI0Oi1llo1iI010l1ol111.I0010I0i = null;
                    }
/* 71 */            if (this.I00lll10) {
/* 74 */                if (z2 || (z && this.I0100i != null)) {
/* 82 */                    lO1OiIiIo0oi.I00000oOI(this);
                        }
/* 85 */                if (z2 || z3 || z4) {
/* 91 */                    l0o11Oi.I00000oOI(this);
/* 94 */                    il1ollIO0I.I00000oIO(this);
                        }
/* 97 */                if (z) {
/* 99 */                    il1ollIO0I.I00000oIO(this);
                        }
                    }
                }

                public final OI0Oi1llo1i I010l1ol111() {
/* 1 */             OI0Oi1llo1i oI0Oi1llo1i = this.I00oooO;
/* 3 */             if (oI0Oi1llo1i != null) {
/* 55 */                return oI0Oi1llo1i;
                    }
/* 25 */            OI0Oi1llo1i oI0Oi1llo1i2 = new OI0Oi1llo1i(this.I00o0iI0io1, this.I00o0l1o1o0, this.I00o101lO, this.I00oII, this.I00oIiI10, this.I00oO101o, this.I00oOio10iI1, this.I00ol1, this.I00oo1iO0ll);
/* 28 */            this.I00oooO = oI0Oi1llo1i2;
/* 30 */            return oI0Oi1llo1i2;
                }

                public final OI0Oi1llo1i I010lI0oi(IiIooOOOI iiIooOOOI) {
                    OI0Oi1llo1i oI0Oi1llo1i;
/* 1 */             OloOoIO1OOo oloOoIO1OOo = this.I0100o111I;
/* 3 */             if (oloOoIO1OOo != null && oloOoIO1OOo.I0000Il00O && (oI0Oi1llo1i = oloOoIO1OOo.I0000O) != null) {
/* 13 */                oI0Oi1llo1i.I0000O(iiIooOOOI);
/* 16 */                return oI0Oi1llo1i;
                    }
/* 17 */            OI0Oi1llo1i oI0Oi1llo1iI010l1ol111 = I010l1ol111();
/* 21 */            oI0Oi1llo1iI010l1ol111.I0000O(iiIooOOOI);
/* 29 */            return oI0Oi1llo1iI010l1ol111;
                }

                public final boolean I010o0o0oO(Function1 function1, Function1 function12, OiiiOo1IOlI oiiiOo1IOlI, Function1 function13) {
                    boolean z;
/* 4 */             if (this.I00oI0i != function1) {
/* 6 */                 this.I00oI0i = function1;
/* 8 */                 z = true;
                    } else {
/* 10 */                z = false;
                    }
/* 13 */            if (this.I00olI != function12) {
/* 15 */                this.I00olI = function12;
/* 17 */                z = true;
                    }
/* 24 */            if (!O0000Ioio00.I0000O(this.I00oli, oiiiOo1IOlI)) {
/* 26 */                this.I00oli = oiiiOo1IOlI;
/* 28 */                z = true;
                    }
/* 31 */            if (this.I00ooIo0 == function13) {
/* 204 */               return z;
                    }
/* 33 */            this.I00ooIo0 = function13;
/* 3 */             return true;
                }

                public final boolean I010oio1OO0(Oo0lloOiiIOI oo0lloOiiIOI, List list, int i, int i2, boolean z, IliO0o11i01 iliO0o11i01, int i3, I1ili1lI0O i1ili1lI0O) {
                    boolean z2 = !this.I00o0l1o1o0.I0000oI00(oo0lloOiiIOI);
/* 9 */             this.I00o0l1o1o0 = oo0lloOiiIOI;
/* 17 */            if (!O0000Ioio00.I0000O(this.I00ol1, list)) {
/* 19 */                this.I00ol1 = list;
/* 21 */                z2 = true;
                    }
/* 24 */            if (this.I00oOio10iI1 != i) {
/* 26 */                this.I00oOio10iI1 = i;
/* 28 */                z2 = true;
                    }
/* 31 */            if (this.I00oO101o != i2) {
/* 33 */                this.I00oO101o = i2;
/* 35 */                z2 = true;
                    }
/* 38 */            if (this.I00oIiI10 != z) {
/* 40 */                this.I00oIiI10 = z;
/* 42 */                z2 = true;
                    }
/* 49 */            if (!O0000Ioio00.I0000O(this.I00o101lO, iliO0o11i01)) {
/* 51 */                this.I00o101lO = iliO0o11i01;
/* 53 */                z2 = true;
                    }
/* 56 */            if (this.I00oII != i3) {
/* 59 */                this.I00oII = i3;
/* 61 */                z2 = true;
                    }
/* 68 */            if (O0000Ioio00.I0000O(this.I00oo1iO0ll, i1ili1lI0O)) {
/* 1750 */              return z2;
                    }
/* 70 */            this.I00oo1iO0ll = i1ili1lI0O;
/* 7 */             return true;
                }

                public final boolean I01101IOlO(I1111OO10i i1111OO10i) {
/* 7 */             boolean zI0000O = O0000Ioio00.I0000O(this.I00o0iI0io1.I00iiI, i1111OO10i.I00iiI);
/* 28 */            boolean z = (zI0000O && O0000Ioio00.I0000O(this.I00o0iI0io1.I00iOIl, i1111OO10i.I00iOIl)) ? false : true;
/* 29 */            if (z) {
/* 31 */                this.I00o0iI0io1 = i1111OO10i;
                    }
/* 33 */            if (!zI0000O) {
/* 36 */                this.I0100o111I = null;
                    }
/* 77 */            return z;
                }
            }
