            package p000;

            import androidx.work.impl.model.WorkSpec;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class IIilO0 implements IlOil1iooOO0 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public IIilO0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:87:0x018b  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) throws Exception {
                    IlOlolIo ilOlolIo;
/* 3 */             IOoil1iiIilo iOoil1iiIilo2 = null;
/* 5 */             int i = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 628 */                   String str = ((IIllI0o) obj).I00000oIO;
/* 630 */                   OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 640 */                   if (O0000Ioio00.I0000O(str, (String) this.I00iiI)) {
/* 642 */                       IIllI0o.I0000Il00O(str);
/* 651 */                       Iterator it = ((IIilllloil1) this.I00iiO).I00iiI.iterator();
/* 659 */                       while (it.hasNext()) {
/* 667 */                           ((IOi10loi) it.next()).I00O10llo(ooiIlOl1iI);
                                }
                            }
/* 671 */                   return ooiIlOl1iI;
                        case 1:
/* 465 */                   IIo0l10O01O0 iIo0l10O01O0 = (IIo0l10O01O0) obj;
/* 469 */                   if (iIo0l10O01O0 instanceof IIo0olOi0li) {
/* 477 */                       IO0Il0o1OI iO0Il0o1OI = (IO0Il0o1OI) ((OOo0ooi) this.I00iiI).I00iOIl;
/* 481 */                       IIlOl1oOlo1o iIlOl1oOlo1o = ((IIo0olOi0li) iIo0l10O01O0).I00000oIO;
                                synchronized (iO0Il0o1OI.I000OiO) {
/* 486 */                           IO0I10o iO0I10o = iO0Il0o1OI.I00111O;
/* 490 */                           if (iO0I10o != IO0I10o.I00iio && iO0I10o != IO0I10o.I00ilI0I1) {
/* 497 */                               iO0Il0o1OI.I00100l0 = iIlOl1oOlo1o;
/* 506 */                               iOi1II01i0.I0000O(iO0Il0o1OI.I000O01llI0, null, null, new IO0II0ilO(iO0Il0o1OI, iOoil1iiIilo2, i), 3);
                                    }
                                }
                            } else if (iIo0l10O01O0 instanceof IIo0oOllO) {
/* 528 */                       ((IO0Il0o1OI) ((OOo0ooi) this.I00iiI).I00iOIl).I000iOII();
                            } else if (iIo0l10O01O0 instanceof IIo0oOi01o1) {
/* 544 */                       ((IO0Il0o1OI) ((OOo0ooi) this.I00iiI).I00iOIl).I000iOII();
/* 549 */                       IIioIlI0 iIioIlI0 = (IIioIlI0) this.I00iiO;
/* 551 */                       IIo0oOi01o1 iIo0oOi01o1 = (IIo0oOi01o1) iIo0l10O01O0;
                                synchronized (iIioIlI0.I000oI1ioi) {
                                    try {
/* 560 */                               if (!iIioIlI0.I0000Il00O()) {
/* 564 */                                   IIlOloloOil iIlOloloOil = iIo0oOi01o1.I000OOo1O;
/* 566 */                                   if (iIlOloloOil != null) {
/* 568 */                                       iIioIlI0.I0010o = iIlOloloOil;
/* 570 */                                       int i2 = iIlOloloOil.I00000oIO;
/* 573 */                                       if (i2 == 6 || i2 == 1 || i2 == 2) {
/* 584 */                                           iIioIlI0.I00100o1O0lo = IIlOIi0oI1Io.I0000Il00O;
/* 586 */                                           iIioIlI0.toString();
                                                } else {
/* 595 */                                           iIioIlI0.I00100o1O0lo = IIlOIi0oI1Io.I0000O;
/* 597 */                                           iIioIlI0.toString();
/* 604 */                                           IIlOloloOil.I00000oOI(iIo0oOi01o1.I000OOo1O.I00000oIO);
                                                }
                                            } else {
/* 610 */                                       iIioIlI0.I00100o1O0lo = IIlOIi0oI1Io.I0001Ioi1lo;
                                            }
/* 614 */                                   iIioIlI0.I0000oI00.I000II();
/* 617 */                                   iIioIlI0.I000II();
                                        }
                                    } catch (Throwable th) {
/* 622 */                               throw th;
                                    }
                                }
                            }
/* 623 */                   return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 379 */                   if (iOoil1iiIilo instanceof IlOlolIo) {
/* 382 */                       ilOlolIo = (IlOlolIo) iOoil1iiIilo;
/* 384 */                       int i3 = ilOlolIo.I00iiI;
/* 390 */                       if ((i3 & Integer.MIN_VALUE) != 0) {
/* 393 */                           ilOlolIo.I00iiI = i3 - Integer.MIN_VALUE;
                                } else {
/* 398 */                           ilOlolIo = new IlOlolIo(this, iOoil1iiIilo);
                                }
                            }
/* 401 */                   Object objInvoke = ilOlolIo.I00iOIl;
/* 403 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 405 */                   int i4 = ilOlolIo.I00iiI;
/* 407 */                   if (i4 == 0) {
/* 423 */                       lIoii1l01l0i.I00000oOI(objInvoke);
/* 428 */                       IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iiI;
/* 430 */                       ilOlolIo.I00iio = obj;
/* 432 */                       ilOlolIo.I00iiI = 1;
/* 434 */                       objInvoke = illiIl1l11O.invoke(obj, ilOlolIo);
/* 438 */                       if (objInvoke == ii0111o) {
/* 440 */                           return ii0111o;
                                }
                            } else {
/* 409 */                       if (i4 != 1) {
/* 419 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 3 */                             return null;
                                }
/* 411 */                       obj = ilOlolIo.I00iio;
/* 413 */                       lIoii1l01l0i.I00000oOI(objInvoke);
                            }
/* 448 */                   if (!((Boolean) objInvoke).booleanValue()) {
/* 450 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 457 */                   ((OOo0ooi) this.I00iiO).I00iOIl = obj;
/* 464 */                   throw new I00i0ilIl0i(this);
                        case 3:
/* 331 */                   IooiIloo0i iooiIloo0i = (IooiIloo0i) obj;
/* 335 */                   ArrayList arrayList = (ArrayList) this.I00iiI;
/* 339 */                   if (iooiIloo0i instanceof Ili10OO0ii) {
/* 341 */                       arrayList.add(iooiIloo0i);
                            } else if (iooiIloo0i instanceof Ili10ii1li1) {
/* 353 */                       arrayList.remove(((Ili10ii1li1) iooiIloo0i).I00000oIO);
                            }
                            boolean z = !arrayList.isEmpty();
/* 363 */                   Iol1I0loo0 iol1I0loo0 = (Iol1I0loo0) this.I00iiO;
/* 367 */                   if (z != iol1I0loo0.I00oO101o) {
/* 369 */                       iol1I0loo0.I00oO101o = z;
/* 371 */                       iol1I0loo0.I010o0o0oO();
                            }
/* 374 */                   return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 206 */                   IooiIloo0i iooiIloo0i2 = (IooiIloo0i) obj;
/* 210 */                   O1001o o1001o = (O1001o) this.I00iiO;
/* 214 */                   OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) this.I00iiI;
/* 218 */                   if ((iooiIloo0i2 instanceof IoI1l00l) || (iooiIloo0i2 instanceof Ili10OO0ii) || (iooiIloo0i2 instanceof OOIII1oOoolO)) {
/* 277 */                       oI0oiiIO0.I00000oOI(iooiIloo0i2);
                            } else if (iooiIloo0i2 instanceof IoI1lIo00o0i) {
/* 237 */                       oI0oiiIO0.I000iOII(((IoI1lIo00o0i) iooiIloo0i2).I00000oIO);
                            } else if (iooiIloo0i2 instanceof Ili10ii1li1) {
/* 249 */                       oI0oiiIO0.I000iOII(((Ili10ii1li1) iooiIloo0i2).I00000oIO);
                            } else if (iooiIloo0i2 instanceof OOIIIiOOili) {
/* 261 */                       oI0oiiIO0.I000iOII(((OOIIIiOOili) iooiIloo0i2).I00000oIO);
                            } else if (iooiIloo0i2 instanceof OOIII1l) {
/* 273 */                       oI0oiiIO0.I000iOII(((OOIII1l) iooiIloo0i2).I00000oIO);
                            }
/* 280 */                   Object[] objArr = oI0oiiIO0.I00000oIO;
/* 282 */                   int i5 = oI0oiiIO0.I00000oOI;
/* 284 */                   int i6 = 0;
/* 285 */                   while (i < i5) {
/* 289 */                       IooiIloo0i iooiIloo0i3 = (IooiIloo0i) objArr[i];
/* 293 */                       if (iooiIloo0i3 instanceof IoI1l00l) {
/* 295 */                           o1001o.getClass();
/* 298 */                           i6 |= 2;
                                } else if (iooiIloo0i3 instanceof Ili10OO0ii) {
/* 305 */                           o1001o.getClass();
/* 308 */                           i6 |= 1;
                                } else if (iooiIloo0i3 instanceof OOIII1oOoolO) {
/* 315 */                           o1001o.getClass();
/* 318 */                           i6 |= 4;
                                }
/* 320 */                       i++;
                            }
/* 325 */                   o1001o.I00000oOI.I000O01llI0(i6);
/* 328 */                   return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 191 */                   ((OI10i0Il) this.I00iiI).setValue(Boolean.TRUE);
/* 200 */                   ((OIooO1iiliI) this.I00iiO).I000O01llI0(((I1lloOo) obj).I0000Il00O);
/* 203 */                   return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 86 */                    long j = ((OIOlIiiioi) obj).I00000oIO;
/* 88 */                    OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 93 */                    I10i01 i10i01 = (I10i01) this.I00iiI;
/* 116 */                   if ((((OIOlIiiioi) i10i01.I0000O()).I00000oIO & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((OIOlIiiioi) i10i01.I0000O()).I00000oIO & 4294967295L)) == Float.intBitsToFloat((int) (4294967295L & j))) {
/* 173 */                       Object objI0001Ioi1lo = i10i01.I0001Ioi1lo(iOoil1iiIilo, OIOlIiiioi.I00000oIO(j));
                                return objI0001Ioi1lo == Ii0111o.I00iOIl ? objI0001Ioi1lo : ooiIlOl1iI2;
                            }
/* 165 */                   iOi1II01i0.I0000O((Ii0110) this.I00iiO, null, null, new I10I1l(i10i01, j, (IOoil1iiIilo) null, 3), 3);
/* 182 */                   return ooiIlOl1iI2;
                        case 7:
/* 26 */                    IooiIloo0i iooiIloo0i4 = (IooiIloo0i) obj;
/* 30 */                    OOo0ll111 oOo0ll111 = (OOo0ll111) this.I00iiI;
/* 34 */                    if (iooiIloo0i4 instanceof OOIII1oOoolO) {
                                oOo0ll111.I00iOIl++;
                            } else if ((iooiIloo0i4 instanceof OOIIIiOOili) || (iooiIloo0i4 instanceof OOIII1l)) {
                                oOo0ll111.I00iOIl--;
                            }
/* 65 */                    boolean z2 = oOo0ll111.I00iOIl > 0;
/* 70 */                    Oo10o0lI00O oo10o0lI00O = (Oo10o0lI00O) this.I00iiO;
/* 74 */                    if (oo10o0lI00O.I00oI0i != z2) {
/* 76 */                        oo10o0lI00O.I00oI0i = z2;
/* 78 */                        l0o11Oi.I00000oOI(oo10o0lI00O);
                            }
/* 81 */                    return OoiIlOl1iI.I00000oIO;
                        default:
/* 20 */                    ((OIOollli) this.I00iiI).I00000oIO((WorkSpec) this.I00iiO, (IOo100ol1lIo) obj);
/* 23 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
