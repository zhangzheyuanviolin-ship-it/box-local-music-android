            package p000;

            import android.graphics.Bitmap;
            import android.view.View;
            import com.google.ai.edge.litertlm.Message;
            import java.lang.invoke.VarHandle;
            
            public final class I0oOII1l implements IlOil1iooOO0 {
                public final int I00iOIl;
                public Object I00iiI;

                public I0oOII1l(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    Object objEmit;
                    Object objI000II;
                    Object value;
                    Object value2;
                    O1o0lio o1o0lio;
                    String str;
                    switch (this.I00iOIl) {
                        case 0:
/* 454 */                   IoloOio0I ioloOio0I = (IoloOio0I) this.I00iiI;
/* 464 */                   ioloOio0I.I00IoIO0lI().startStylusHandwriting((View) ioloOio0I.I00iiI);
/* 467 */                   return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 436 */                   Object objI0001Ioi1lo = ((I10i01) this.I00iiI).I0001Ioi1lo(iOoil1iiIilo, new Float(I1loOI10.I00000oIO.I00000oIO(((I1lloOo) obj).I0000Il00O)));
                            return objI0001Ioi1lo == Ii0111o.I00iOIl ? objI0001Ioi1lo : OoiIlOl1iI.I00000oIO;
                        case 2:
/* 369 */                   IIo1i101Il1 iIo1i101Il1 = (IIo1i101Il1) obj;
/* 373 */                   IIioo1 iIioo1 = (IIioo1) this.I00iiI;
/* 375 */                   OlO0OIIl1 olO0OIIl1 = iIioo1.I00ilO0;
/* 377 */                   OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 381 */                   if (iIo1i101Il1 instanceof IIo1Ill1I) {
/* 383 */                       olO0OIIl1.emit(iIo1i101Il1, iOoil1iiIilo);
/* 386 */                       Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 414 */                       return ooiIlOl1iI;
                            }
/* 391 */                   if (!(iIo1i101Il1 instanceof IIo1O0l)) {
                                return ((iIo1i101Il1 instanceof IIo1O0) && (objEmit = iIioo1.I00ioIO.emit(ooiIlOl1iI, iOoil1iiIilo)) == Ii0111o.I00iOIl) ? objEmit : ooiIlOl1iI;
                            }
/* 393 */                   olO0OIIl1.emit(iIo1i101Il1, iOoil1iiIilo);
/* 396 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 414 */                   return ooiIlOl1iI;
                        case 3:
/* 341 */                   OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 345 */                   Ii1OIIlOi ii1OIIlOi = (Ii1OIIlOi) this.I00iiI;
                            return ((ii1OIIlOi.I000O01llI0.I00000oOI() instanceof IlIo0ol0) || (objI000II = ii1OIIlOi.I000II(true, iOoil1iiIilo)) != Ii0111o.I00iOIl) ? ooiIlOl1iI2 : objI000II;
                        case 4:
/* 255 */                   OlIiOi0Oo olIiOi0Oo = (OlIiOi0Oo) obj;
/* 257 */                   Bitmap bitmap = olIiOi0Oo.I0000Il00O;
/* 263 */                   OlO0OIIl1 olO0OIIl12 = ((IoiIII) this.I00iiI).I00000oOI;
/* 265 */                   if (bitmap != null) {
/* 272 */                       IoiII1lloI ioiII1lloI = (IoiII1lloI) olO0OIIl12.getValue();
/* 274 */                       int i = olIiOi0Oo.I00000oOI;
/* 297 */                       olO0OIIl12.I000lI(null, IoiII1lloI.I00000oIO(ioiII1lloI, null, null, 0, 0.0f, null, false, i, i, olIiOi0Oo.I0000Il00O, null, false, 0.0f, false, 7711));
                            } else {
/* 331 */                       olO0OIIl12.I000lI(null, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl12.getValue(), null, null, 0, 0.0f, null, false, olIiOi0Oo.I00000oIO, olIiOi0Oo.I00000oOI, null, null, false, 0.0f, false, 7999));
                            }
/* 334 */                   return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 222 */                   if (!((Boolean) obj).booleanValue()) {
/* 228 */                       OlO0OIIl1 olO0OIIl13 = ((O1i1O1I) this.I00iiI).I0000O;
/* 248 */                       do {
/* 230 */                           value = olO0OIIl13.getValue();
/* 248 */                       } while (!olO0OIIl13.I000iOII(value, O1i1IIoO1IIl.I00000oIO((O1i1IIoO1IIl) value, Il01100l.I00iOIl, false, null, 4)));
                            }
/* 250 */                   return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 149 */                   O1o10Iiio o1o10Iiio = (O1o10Iiio) this.I00iiI;
/* 151 */                   o1o10Iiio.I000OOo1O(false);
/* 154 */                   String string = ((Message) obj).toString();
/* 158 */                   OlO0OIIl1 olO0OIIl14 = o1o10Iiio.I0000Il00O;
/* 209 */                   do {
/* 160 */                       value2 = olO0OIIl14.getValue();
/* 172 */                       o1o0lio = (O1o0lio) olO0OIIl14.getValue();
/* 180 */                       str = ((O1o0lio) olO0OIIl14.getValue()).I0000O;
/* 187 */                       new StringBuilder(str).append(string);
/* 209 */                   } while (!olO0OIIl14.I000iOII(value2, O1o0lio.I00000oIO(o1o0lio, false, false, null, str.concat(string), null, false, 55)));
/* 211 */                   return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 137 */                   ((OI01Ilio) this.I00iiI).I00iiO.I000O01llI0(((Number) obj).floatValue());
/* 140 */                   return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 75 */                    IooiIloo0i iooiIloo0i = (IooiIloo0i) obj;
/* 79 */                    OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00iiI;
/* 83 */                    if ((iooiIloo0i instanceof OOIII1oOoolO) || (iooiIloo0i instanceof Ili10OO0ii)) {
/* 117 */                       oIooi1iOiOol.I000O01llI0(oIooi1iOiOol.I000II() + 1);
                            } else if ((iooiIloo0i instanceof OOIIIiOOili) || (iooiIloo0i instanceof Ili10ii1li1) || (iooiIloo0i instanceof OOIII1l)) {
/* 108 */                       oIooi1iOiOol.I000O01llI0(oIooi1iOiOol.I000II() - 1);
                            }
/* 120 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 15 */                    IIo0l10O01O0 iIo0l10O01O0 = (IIo0l10O01O0) obj;
/* 19 */                    OoooIIOo10 ooooIIOo10 = (OoooIIOo10) this.I00iiI;
                            synchronized (ooooIIOo10.I0000oI00) {
                                try {
/* 26 */                            if (iIo0l10O01O0 instanceof IIo0olOi0li) {
/* 34 */                                I0lIi00oO i0lIi00oO = (I0lIi00oO) ((IIo0olOi0li) iIo0l10O01O0).I00000oIO;
/* 36 */                                OooloiI0 oooloiI0 = new OooloiI0();
/* 39 */                                oooloiI0.I00iOIl = i0lIi00oO;
/* 46 */                                oooloiI0.I00iiI = new Object();
/* 48 */                                VarHandle.storeStoreFence();
/* 51 */                                ooooIIOo10.I000II = oooloiI0;
/* 58 */                                ooooIIOo10.I00000oOI(new IIo0olOi0li(oooloiI0));
                                    } else {
/* 64 */                                ooooIIOo10.I00000oOI(iIo0l10O01O0);
                                    }
                                } catch (Throwable th) {
/* 72 */                            throw th;
                                }
                            }
/* 68 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
