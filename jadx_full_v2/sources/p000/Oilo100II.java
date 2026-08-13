            package p000;

            import android.media.MediaCodec;
            import android.util.Log;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public final class Oilo100II implements IllOOo00lI {
                public final int I00iOIl;
                public Oilo101I11l0 I00iiI;

                public Oilo100II(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:97:0x0254, code lost:
                
                    if (p000.l11I11lO.I0000O(3, "CXCP") == false) goto L135;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:98:0x0256, code lost:
                
                    r12.toString();
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 8 */             Oilo101I11l0 oilo101I11l0 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 289 */                   ArrayList arrayList = new ArrayList();
/* 294 */                   ArrayList arrayList2 = new ArrayList();
/* 307 */                   for (Ool10o ool10o : oilo101I11l0.I00000oIO) {
/* 324 */                       arrayList.add(oilo101I11l0.I00000oOI ? ool10o.I00100l0 : ool10o.I00100o1O0lo);
/* 329 */                       arrayList2.add(ool10o.I000OOo1O);
                            }
/* 340 */                   if (!arrayList.isEmpty()) {
/* 343 */                       Iterator it = arrayList.iterator();
/* 351 */                       while (it.hasNext()) {
/* 364 */                           if (((OillooOlI) it.next()).I000II.I0000Il00O == 5) {
/* 370 */                               if (l11I11lO.I0000O(6, "CXCP")) {
/* 374 */                                   Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                        }
                                        break;
                                    }
                                }
                            }
/* 383 */                   LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 386 */                   I1ioiI i1ioiI = OlOOIoOO0OI.I00000oIO;
/* 390 */                   ArrayList arrayList3 = new ArrayList(arrayList2);
/* 393 */                   Iterator it2 = arrayList.iterator();
                            while (true) {
/* 401 */                       if (!it2.hasNext()) {
                                    break;
                                } else {
/* 407 */                           OillooOlI oillooOlI = (OillooOlI) it2.next();
/* 420 */                           if (oillooOlI.I000II.I00000oOI.I00iOIl.containsKey(i1ioiI) && oillooOlI.I00000oOI().size() != 1) {
/* 436 */                               if (l11I11lO.I0000O(6, "CXCP")) {
/* 465 */                                   Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + oillooOlI.I00000oOI().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                            break;
                                        }
                                    } else if (oillooOlI.I000II.I00000oOI.I00iOIl.containsKey(i1ioiI)) {
/* 482 */                               Iterator it3 = arrayList.iterator();
/* 487 */                               int i2 = 0;
/* 492 */                               while (it3.hasNext()) {
/* 498 */                                   OillooOlI oillooOlI2 = (OillooOlI) it3.next();
/* 512 */                                   if (((OolIl0ii1) arrayList3.get(i2)).I0010o() == OolO01iOo0O.I00ilO0) {
/* 527 */                                       lII1OI11o1I.I0000oI00("MeteringRepeating should contain a surface", !oillooOlI2.I00000oOI().isEmpty());
/* 542 */                                       linkedHashMap.put(oillooOlI2.I00000oOI().get(0), 1L);
                                            } else if (oillooOlI2.I000II.I00000oOI.I00iOIl.containsKey(i1ioiI) && !oillooOlI2.I00000oOI().isEmpty()) {
/* 586 */                                       linkedHashMap.put(oillooOlI2.I00000oOI().get(0), oillooOlI2.I000II.I00000oOI.I0000O(i1ioiI));
                                            }
/* 589 */                                   i2++;
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
/* 151 */                   Collection<Ool10o> collection = oilo101I11l0.I00000oIO;
/* 163 */                   ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(collection, 10));
/* 174 */                   for (Ool10o ool10o2 : collection) {
/* 191 */                       arrayList4.add(oilo101I11l0.I00000oOI ? ool10o2.I00100l0 : ool10o2.I00100o1O0lo);
                            }
/* 197 */                   LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 200 */                   Iterator it4 = arrayList4.iterator();
/* 208 */                   while (it4.hasNext()) {
/* 214 */                       OillooOlI oillooOlI3 = (OillooOlI) it4.next();
/* 216 */                       List<IiIO1ol1i1o0> listI00000oOI = oillooOlI3.I00000oOI();
/* 220 */                       IIoo00iOol0 iIoo00iOol0 = oillooOlI3.I000II;
/* 230 */                       for (IiIO1ol1i1o0 iiIO1ol1i1o0 : listI00000oOI) {
/* 238 */                           OIil0iio0 oIil0iio0 = iIoo00iOol0.I00000oOI;
/* 240 */                           I1ioiI i1ioiI2 = IIl0oI.I00l0OO0IO;
/* 248 */                           if (!oIil0iio0.I00iOIl.containsKey(i1ioiI2) || oIil0iio0.I0000O(i1ioiI2) == null) {
/* 282 */                               linkedHashMap2.put(iiIO1ol1i1o0, Long.valueOf(O0000Ioio00.I0000O(iiIO1ol1i1o0.I000OiO, MediaCodec.class) ? 1L : 0L));
                                    } else {
/* 260 */                               linkedHashMap2.put(iiIO1ol1i1o0, oIil0iio0.I0000O(i1ioiI2));
                                    }
                                }
                            }
                            break;
                        case 2:
/* 116 */                   Oilloi0llol1 oilloi0llol1 = new Oilloi0llol1();
/* 129 */                   for (Ool10o ool10o3 : oilo101I11l0.I00000oIO) {
/* 146 */                       oilloi0llol1.I00000oIO(oilo101I11l0.I00000oOI ? ool10o3.I00100l0 : ool10o3.I00100o1O0lo);
                            }
                            break;
                        case 3:
/* 85 */                    OllO00oiil ollO00oiil = oilo101I11l0.I0000oI00;
/* 97 */                    if (((Oilloi0llol1) ollO00oiil.getValue()).I0000Il00O()) {
                                break;
                            } else {
/* 110 */                       I000II.I001IO000("Check failed.");
                                break;
                            }
                        default:
/* 13 */                    OllO00oiil ollO00oiil2 = oilo101I11l0.I0001Ioi1lo;
/* 27 */                    if (((Oilloi0llol1) oilo101I11l0.I0000oI00.getValue()).I0000Il00O()) {
/* 35 */                        I1lIlOi1OI0 i1lIlOi1OI0 = ((OillooOlI) ollO00oiil2.getValue()).I00000oOI;
/* 37 */                        if (i1lIlOi1OI0 != null) {
/* 41 */                            ArrayList arrayList5 = new ArrayList();
/* 56 */                            arrayList5.addAll(((OillooOlI) ollO00oiil2.getValue()).I00000oOI());
/* 61 */                            arrayList5.add(i1lIlOi1OI0.I00000oIO);
/* 64 */                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
/* 68 */                            if (listUnmodifiableList != null) {
                                    }
                                }
                                break;
                            } else {
/* 81 */                        I000II.I001IO000("Check failed.");
                                break;
                            }
                            break;
                    }
/* 5 */             return null;
                }
            }
