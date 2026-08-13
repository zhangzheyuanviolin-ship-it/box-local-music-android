            package p000;

            import java.util.ArrayList;
            
            public final class Oi1iloI implements IlOil1iooOO0 {
                public OOo0l0ii10l I00iOIl;
                public I0oo10O I00iiI;
                public ArrayList I00iiO;
                public OOo0ooi I00iio;
                public Ii0110 I00ilI0I1;

                @Override
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) throws InterruptedException {
/* 1 */             Ii0110 ii0110 = this.I00ilI0I1;
/* 3 */             IooiIloo0i iooiIloo0i = (IooiIloo0i) obj;
/* 5 */             OOo0ooi oOo0ooi = this.I00iio;
/* 7 */             I0oo10O i0oo10O = this.I00iiI;
/* 9 */             ArrayList arrayList = this.I00iiO;
/* 11 */            OOo0l0ii10l oOo0l0ii10l = this.I00iOIl;
/* 15 */            if (iooiIloo0i instanceof OOIIOIlIlOIo) {
/* 19 */                if (i0oo10O.I00oII) {
/* 24 */                    i0oo10O.I010l1ol111((OOIIOIlIlOIo) iooiIloo0i);
                        } else {
/* 30 */                    i0oo10O.I00oIiI10.I00000oOI(iooiIloo0i);
                        }
                    }
/* 33 */            boolean z = iooiIloo0i instanceof IoI1l00l;
/* 35 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 38 */            if (z) {
/* 40 */                arrayList.add(iooiIloo0i);
                    } else if (iooiIloo0i instanceof IoI1lIo00o0i) {
/* 53 */                arrayList.remove(((IoI1lIo00o0i) iooiIloo0i).I00000oIO);
                    } else if (iooiIloo0i instanceof Ili10OO0ii) {
/* 61 */                arrayList.add(iooiIloo0i);
/* 65 */                oOo0l0ii10l.I00iOIl = true;
                    } else if (iooiIloo0i instanceof Ili10ii1li1) {
/* 77 */                arrayList.remove(((Ili10ii1li1) iooiIloo0i).I00000oIO);
/* 80 */                int size = arrayList.size();
/* 84 */                int i = 0;
                        while (true) {
/* 85 */                    if (i >= size) {
/* 101 */                       oOo0l0ii10l.I00iOIl = false;
                                break;
                            }
/* 95 */                    if (((IooiIloo0i) arrayList.get(i)) instanceof Ili10OO0ii) {
                                break;
                            }
/* 98 */                    i++;
                        }
                    } else if (iooiIloo0i instanceof IilioOoi1O) {
/* 108 */               arrayList.add(iooiIloo0i);
                    } else {
/* 114 */               if (!(iooiIloo0i instanceof Iilioi)) {
/* 127 */                   if (iooiIloo0i instanceof IilioI1iol) {
/* 134 */                       arrayList.remove(((IilioI1iol) iooiIloo0i).I00000oIO);
                            }
/* 332 */                   return ooiIlOl1iI;
                        }
/* 121 */               arrayList.remove(((Iilioi) iooiIloo0i).I00000oIO);
                    }
/* 141 */           IooiIloo0i iooiIloo0i2 = (IooiIloo0i) IOOi0Ool1i.I00IoIO0lI(arrayList);
/* 143 */           Oi1liO11IlIO oi1liO11IlIOI010l1O = i0oo10O.I010l1O(false);
/* 153 */           if (!O0000Ioio00.I0000O(oOo0ooi.I00iOIl, iooiIloo0i2)) {
/* 158 */               if (iooiIloo0i2 != null) {
/* 160 */                   boolean z2 = iooiIloo0i2 instanceof IoI1l00l;
/* 162 */                   float f = 0.0f;
/* 163 */                   if (z2) {
/* 169 */                       if (oi1liO11IlIOI010l1O.I0001Ioi1lo instanceof Oi1lIOiol) {
/* 171 */                           f = 0.08f;
                                }
                            } else if (iooiIloo0i2 instanceof Ili10OO0ii) {
/* 183 */                       if (oi1liO11IlIOI010l1O.I0000oI00 instanceof Oi1l1OIo) {
/* 185 */                           f = 0.1f;
                                }
                            } else if ((iooiIloo0i2 instanceof IilioOoi1O) && (oi1liO11IlIOI010l1O.I000II instanceof Oi1ioo0lI0)) {
/* 199 */                       f = 0.16f;
                            }
/* 202 */                   OoIoO0I0oOI ooIoO0I0oOI = Oi1iil0I.I00000oIO;
/* 204 */                   if (!z2 && ((iooiIloo0i2 instanceof Ili10OO0ii) || (iooiIloo0i2 instanceof IilioOoi1O))) {
/* 230 */                       ooIoO0I0oOI = new OoIoO0I0oOI(45, IioO00o.I0000O, 2);
                            }
/* 241 */                   iOi1II01i0.I0000O(ii0110, null, null, new OI1l1l(i0oo10O, f, ooIoO0I0oOI, (IOoil1iiIilo) null, 2), 3);
                        } else {
/* 247 */                   IooiIloo0i iooiIloo0i3 = (IooiIloo0i) oOo0ooi.I00iOIl;
/* 249 */                   OoIoO0I0oOI ooIoO0I0oOI2 = Oi1iil0I.I00000oIO;
/* 253 */                   if (!(iooiIloo0i3 instanceof IoI1l00l) && !(iooiIloo0i3 instanceof Ili10OO0ii) && (iooiIloo0i3 instanceof IilioOoi1O)) {
/* 271 */                       ooIoO0I0oOI2 = new OoIoO0I0oOI(150, IioO00o.I0000O, 2);
                            }
/* 281 */                   iOi1II01i0.I0000O(ii0110, null, null, new O1iIlllIoo(i0oo10O, ooIoO0I0oOI2, null, 20), 3);
                        }
/* 286 */               if (iooiIloo0i instanceof Ili10looIi0) {
/* 294 */                   iOi1II01i0.I0000O(ii0110, null, null, new O1iOlO(i0oo10O, (IOoil1iiIilo) null, 6), 3);
                        }
/* 297 */               oOo0ooi.I00iOIl = iooiIloo0i2;
                    }
/* 332 */           return ooiIlOl1iI;
                }
            }
