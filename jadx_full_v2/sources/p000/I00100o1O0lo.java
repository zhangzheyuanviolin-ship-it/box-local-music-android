            package p000;

            import com.google.mlkit.genai.prompt.Candidate;
            import com.google.mlkit.genai.prompt.GenerateContentResponse;
            import java.util.Iterator;
            import java.util.Map;
            import kotlin.jvm.functions.Function3;
            
            public final class I00100o1O0lo implements IlOil1iooOO0 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public I00100o1O0lo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00000oIO(IooiIloo0i iooiIloo0i, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    OI10oO0Io1 oI10oO0Io1;
                    Iterator it;
                    IooiIloo0i iooiIloo0i2;
/* 3 */             IooiOoO1I1iO iooiOoO1I1iO = (IooiOoO1I1iO) this.I00ilI0I1;
/* 7 */             IooiOoO1I1iO iooiOoO1I1iO2 = (IooiOoO1I1iO) this.I00iio;
/* 11 */            IooiOoO1I1iO iooiOoO1I1iO3 = (IooiOoO1I1iO) this.I00iiI;
/* 15 */            OI10olol1i oI10olol1i = (OI10olol1i) this.I00iiO;
/* 19 */            if (iOoil1iiIilo instanceof OI10oO0Io1) {
/* 22 */                oI10oO0Io1 = (OI10oO0Io1) iOoil1iiIilo;
/* 24 */                int i = oI10oO0Io1.I00ilO0;
/* 30 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 33 */                    oI10oO0Io1.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 38 */                    oI10oO0Io1 = new OI10oO0Io1(this, iOoil1iiIilo);
                        }
                    }
/* 41 */            Object obj = oI10oO0Io1.I00iio;
/* 43 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 45 */            int i2 = oI10oO0Io1.I00ilO0;
/* 47 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 50 */            if (i2 == 0) {
/* 74 */                lIoii1l01l0i.I00000oOI(obj);
/* 79 */                if (iooiIloo0i instanceof OOIII1oOoolO) {
/* 81 */                    iooiOoO1I1iO3.I00000oIO(iooiIloo0i);
/* 86 */                    oI10olol1i.I0000Il00O.I00000oIO(1, true);
/* 89 */                    return ooiIlOl1iI;
                        }
/* 93 */                if (iooiIloo0i instanceof OOIIIiOOili) {
/* 99 */                    iooiOoO1I1iO3.I00000oOI(((OOIIIiOOili) iooiIloo0i).I00000oIO);
/* 109 */                   oI10olol1i.I0000Il00O.I00000oIO(1, iooiOoO1I1iO3.I00000oIO != null);
/* 112 */                   return ooiIlOl1iI;
                        }
/* 115 */               if (iooiIloo0i instanceof OOIII1l) {
/* 121 */                   iooiOoO1I1iO3.I00000oOI(((OOIII1l) iooiIloo0i).I00000oIO);
/* 131 */                   oI10olol1i.I0000Il00O.I00000oIO(1, iooiOoO1I1iO3.I00000oIO != null);
/* 134 */                   return ooiIlOl1iI;
                        }
/* 138 */               if (iooiIloo0i instanceof IoI1l00l) {
/* 140 */                   iooiOoO1I1iO2.I00000oIO(iooiIloo0i);
/* 145 */                   oI10olol1i.I0000Il00O.I00000oIO(2, true);
/* 148 */                   return ooiIlOl1iI;
                        }
/* 151 */               if (iooiIloo0i instanceof IoI1lIo00o0i) {
/* 157 */                   iooiOoO1I1iO2.I00000oOI(((IoI1lIo00o0i) iooiIloo0i).I00000oIO);
/* 168 */                   oI10olol1i.I0000Il00O.I00000oIO(2, iooiOoO1I1iO2.I00000oIO != null);
/* 171 */                   return ooiIlOl1iI;
                        }
/* 175 */               if (iooiIloo0i instanceof Ili10OO0ii) {
/* 177 */                   iooiOoO1I1iO.I00000oIO(iooiIloo0i);
/* 182 */                   oI10olol1i.I0000Il00O.I00000oIO(4, true);
/* 185 */                   return ooiIlOl1iI;
                        }
/* 188 */               if (iooiIloo0i instanceof Ili10ii1li1) {
/* 194 */                   iooiOoO1I1iO.I00000oOI(((Ili10ii1li1) iooiIloo0i).I00000oIO);
/* 205 */                   oI10olol1i.I0000Il00O.I00000oIO(4, iooiOoO1I1iO.I00000oIO != null);
/* 208 */                   return ooiIlOl1iI;
                        }
/* 213 */               it = oI10olol1i.I00000oOI.I00iiI.iterator();
/* 219 */               iooiIloo0i2 = iooiIloo0i;
                    } else {
/* 52 */                if (i2 != 1) {
/* 69 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 72 */                    return null;
                        }
/* 54 */                it = oI10oO0Io1.I00iiO;
/* 56 */                OI10olol1i oI10olol1i2 = oI10oO0Io1.I00iiI;
/* 58 */                IooiIloo0i iooiIloo0i3 = oI10oO0Io1.I00iOIl;
/* 60 */                lIoii1l01l0i.I00000oOI(obj);
/* 63 */                oI10olol1i = oI10olol1i2;
/* 64 */                iooiIloo0i2 = iooiIloo0i3;
                    }
/* 224 */           while (it.hasNext()) {
/* 236 */               Oli10l oli10l = (Oli10l) ((Map.Entry) it.next()).getKey();
/* 238 */               oI10oO0Io1.I00iOIl = iooiIloo0i2;
/* 240 */               oI10oO0Io1.I00iiI = oI10olol1i;
/* 242 */               oI10oO0Io1.I00iiO = it;
/* 244 */               oI10oO0Io1.I00ilO0 = 1;
/* 246 */               oli10l.getClass();
/* 249 */               Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 251 */               if (ooiIlOl1iI == ii0111o) {
/* 253 */                   return ii0111o;
                        }
                    }
/* 332 */           return ooiIlOl1iI;
                }

                /* JADX WARN: Removed duplicated region for block: B:64:0x00e0  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    String zza;
                    IO10Ol iO10Ol;
/* 1 */             int i = this.I00iOIl;
/* 3 */             boolean z = false;
/* 5 */             boolean z2 = true;
/* 6 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 314 */                   Function3 function3 = (Function3) this.I00ilI0I1;
/* 318 */                   I001i1lo1io i001i1lo1io = (I001i1lo1io) this.I00iiO;
/* 322 */                   OOo0ooi oOo0ooi = (OOo0ooi) this.I00iiI;
/* 332 */                   Candidate candidate = (Candidate) IOOi0Ool1i.I00II0Ol1O0l(((GenerateContentResponse) obj).getCandidates());
/* 334 */                   if (candidate == null || (zza = candidate.getZza()) == null) {
/* 342 */                       zza = "";
                            }
/* 361 */                   oOo0ooi.I00iOIl = oOo0ooi.I00iOIl + zza;
/* 371 */                   if ((candidate != null ? candidate.getZzb() : null) != null) {
/* 384 */                       i001i1lo1io.I00000oOI.add(new I000iOII((String) this.I00iio, true));
/* 398 */                       i001i1lo1io.I00000oOI.add(new I000iOII((String) oOo0ooi.I00iOIl, false));
/* 403 */                       function3.invoke(zza, Boolean.TRUE, null);
                            } else {
/* 409 */                       function3.invoke(zza, Boolean.FALSE, null);
                            }
/* 412 */                   return ooiIlOl1iI;
                        case 1:
/* 204 */                   OOo0ooi oOo0ooi2 = (OOo0ooi) this.I00iiI;
/* 208 */                   if (iOoil1iiIilo instanceof IO10Ol) {
/* 211 */                       iO10Ol = (IO10Ol) iOoil1iiIilo;
/* 213 */                       int i2 = iO10Ol.I00iio;
/* 219 */                       if ((i2 & Integer.MIN_VALUE) != 0) {
/* 222 */                           iO10Ol.I00iio = i2 - Integer.MIN_VALUE;
                                } else {
/* 227 */                           iO10Ol = new IO10Ol(this, iOoil1iiIilo);
                                }
                            }
/* 230 */                   Object obj2 = iO10Ol.I00iiI;
/* 232 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 234 */                   int i3 = iO10Ol.I00iio;
/* 236 */                   if (i3 == 0) {
/* 252 */                       lIoii1l01l0i.I00000oOI(obj2);
/* 257 */                       O010OIi o010OIi = (O010OIi) oOo0ooi2.I00iOIl;
/* 259 */                       if (o010OIi != null) {
/* 268 */                           o010OIi.I000II(new IOI0lo0I("Child of the scoped flow was cancelled"));
/* 271 */                           iO10Ol.I00iOIl = obj;
/* 273 */                           iO10Ol.I00iio = 1;
/* 279 */                           if (o010OIi.I001l0I00(iO10Ol) == ii0111o) {
/* 281 */                               return ii0111o;
                                    }
                                }
                            } else {
/* 238 */                       if (i3 != 1) {
/* 248 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 4 */                             return null;
                                }
/* 240 */                       obj = iO10Ol.I00iOIl;
/* 242 */                       lIoii1l01l0i.I00000oOI(obj2);
                            }
/* 306 */                   oOo0ooi2.I00iOIl = iOi1II01i0.I0000O((Ii0110) this.I00iiO, null, Ii01I10.I00iio, new IO10OOII((IO10i01) this.I00iio, (IlOil1iooOO0) this.I00ilI0I1, obj, null), 1);
/* 308 */                   return ooiIlOl1iI;
                        case 2:
/* 160 */                   boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 166 */                   Oo0IOoOi01 oo0IOoOi01 = (Oo0IOoOi01) this.I00iio;
/* 170 */                   O0oIlOolIO o0oIlOolIO = (O0oIlOolIO) this.I00iiI;
/* 172 */                   if (zBooleanValue && o0oIlOolIO.I00000oOI()) {
/* 194 */                       iioii1oiO01i.I000II((Oo0Oo0) this.I00iiO, o0oIlOolIO, oo0IOoOi01.I000l1(), (IoiiO1O1) this.I00ilI0I1, oo0IOoOi01.I00000oOI);
                            } else {
/* 198 */                       iioii1oiO01i.I0000oI00(o0oIlOolIO);
                            }
/* 201 */                   return ooiIlOl1iI;
                        case 3:
/* 18 */                    IooiIloo0i iooiIloo0i = (IooiIloo0i) obj;
/* 22 */                    OOo0ll111 oOo0ll111 = (OOo0ll111) this.I00iio;
/* 26 */                    OOo0ll111 oOo0ll1112 = (OOo0ll111) this.I00iiO;
/* 30 */                    OOo0ll111 oOo0ll1113 = (OOo0ll111) this.I00iiI;
/* 34 */                    if (iooiIloo0i instanceof OOIII1oOoolO) {
                                oOo0ll1113.I00iOIl++;
                            } else if ((iooiIloo0i instanceof OOIIIiOOili) || (iooiIloo0i instanceof OOIII1l)) {
                                oOo0ll1113.I00iOIl--;
                            } else if (iooiIloo0i instanceof IoI1l00l) {
                                oOo0ll1112.I00iOIl++;
                            } else if (iooiIloo0i instanceof IoI1lIo00o0i) {
                                oOo0ll1112.I00iOIl--;
                            } else if (iooiIloo0i instanceof Ili10OO0ii) {
                                oOo0ll111.I00iOIl++;
                            } else if (iooiIloo0i instanceof Ili10ii1li1) {
                                oOo0ll111.I00iOIl--;
                            }
/* 111 */                   boolean z3 = oOo0ll1113.I00iOIl > 0;
/* 118 */                   boolean z4 = oOo0ll1112.I00iOIl > 0;
/* 125 */                   boolean z5 = oOo0ll111.I00iOIl > 0;
/* 128 */                   Ii1llll ii1llll = (Ii1llll) this.I00ilI0I1;
/* 132 */                   if (ii1llll.I00o0l1o1o0 != z3) {
/* 134 */                       ii1llll.I00o0l1o1o0 = z3;
/* 136 */                       z = true;
                            }
/* 139 */                   if (ii1llll.I00o101lO != z4) {
/* 141 */                       ii1llll.I00o101lO = z4;
/* 143 */                       z = true;
                            }
/* 146 */                   if (ii1llll.I00oI0i != z5) {
/* 148 */                       ii1llll.I00oI0i = z5;
                            } else {
/* 151 */                       z2 = z;
                            }
/* 152 */                   if (z2) {
/* 154 */                       il1ollIO0I.I00000oIO(ii1llll);
                            }
/* 157 */                   return ooiIlOl1iI;
                        default:
/* 13 */                    return I00000oIO((IooiIloo0i) obj, iOoil1iiIilo);
                    }
                }
            }
