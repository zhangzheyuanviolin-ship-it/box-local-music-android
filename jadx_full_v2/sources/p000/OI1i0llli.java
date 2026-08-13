            package p000;

            import android.os.Bundle;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.Set;
            import java.util.UUID;
            import java.util.concurrent.atomic.AtomicInteger;
            import kotlin.jvm.functions.Function1;
            
            public final class OI1i0llli {
                public OI1o1o1iO1l I00000oIO;
                public Ilo11I I00000oOI;
                public OI1lo1liOO I0000Il00O;
                public Bundle I0000O;
                public Bundle[] I0000oI00;
                public I1Il0loi I0001Ioi1lo;
                public OlO0OIIl1 I000II;
                public OlO0OIIl1 I000O01llI0;
                public OOli1O I000OOo1O;
                public LinkedHashMap I000OiO;
                public LinkedHashMap I000iOII;
                public LinkedHashMap I000l1;
                public LinkedHashMap I000lI;
                public O0oiOi I000o00OoI0I;
                public OI1i0o1Ilo I000oI1ioi;
                public ArrayList I00100l0;
                public O0oOi0I I00100o1O0lo;
                public I01oi1lO0O1o I0010I0i;
                public OII1IlOi0 I0010o;
                public LinkedHashMap I00111O;
                public Function1 I001IIilI0O;
                public O11O0010 I001IO000;
                public LinkedHashMap I001i1O0Ol;
                public int I001i1lo1io;
                public ArrayList I001iOo1i0O;
                public Oiolio I001l0I00;

                public static OI1ilOI1ioo0 I0000O(int i, OI1ilOI1ioo0 oI1ilOI1ioo0, OI1ilOI1ioo0 oI1ilOI1ioo02, boolean z) {
/* 5 */             if (oI1ilOI1ioo0.I00iiI.I00000oOI == i && (oI1ilOI1ioo02 == null || (oI1ilOI1ioo0.equals(oI1ilOI1ioo02) && O0000Ioio00.I0000O(oI1ilOI1ioo0.I00iiO, oI1ilOI1ioo02.I00iiO)))) {
/* 25 */                return oI1ilOI1ioo0;
                    }
/* 34 */            OI1lo1liOO oI1lo1liOO = oI1ilOI1ioo0 instanceof OI1lo1liOO ? (OI1lo1liOO) oI1ilOI1ioo0 : null;
/* 35 */            if (oI1lo1liOO == null) {
/* 37 */                oI1lo1liOO = oI1ilOI1ioo0.I00iiO;
                    }
/* 41 */            return oI1lo1liOO.I00ilO0.I000OOo1O(i, oI1lo1liOO, oI1ilOI1ioo02, z);
                }

                public static void I000o00OoI0I(OI1i0llli oI1i0llli, OI1OloOIO1O oI1OloOIO1O) {
/* 7 */             oI1i0llli.I000lI(oI1OloOIO1O, false, new I1Il0loi());
                }

                public final void I00000oIO(OI1ilOI1ioo0 oI1ilOI1ioo0, Bundle bundle, OI1OloOIO1O oI1OloOIO1O, List list) {
                    I1Il0loi i1Il0loi;
                    Bundle bundle2;
                    OI1OloOIO1O oI1OloOIO1O2;
                    OI1lo1liOO oI1lo1liOO;
                    Object objPrevious;
                    Object objPrevious2;
/* 9 */             OI1o1o1iO1l oI1o1o1iO1l = this.I00000oIO;
/* 11 */            I1Il0loi i1Il0loi2 = this.I0001Ioi1lo;
/* 13 */            OI1ilOI1ioo0 oI1ilOI1ioo02 = oI1OloOIO1O.I00iiI;
/* 18 */            if (!(oI1ilOI1ioo02 instanceof Iii0OliiI)) {
/* 24 */                while (!i1Il0loi2.isEmpty() && (((OI1OloOIO1O) i1Il0loi2.last()).I00iiI instanceof Iii0OliiI) && I000l1(((OI1OloOIO1O) i1Il0loi2.last()).I00iiI.I00iiI.I00000oOI, true, false)) {
                        }
                    }
/* 59 */            I1Il0loi i1Il0loi3 = new I1Il0loi();
/* 64 */            Object obj = null;
/* 66 */            if (oI1ilOI1ioo0 instanceof OI1lo1liOO) {
/* 68 */                OI1ilOI1ioo0 oI1ilOI1ioo03 = oI1ilOI1ioo02;
                        while (true) {
/* 69 */                    OI1lo1liOO oI1lo1liOO2 = oI1ilOI1ioo03.I00iiO;
/* 71 */                    if (oI1lo1liOO2 != null) {
/* 77 */                        ListIterator listIterator = list.listIterator(list.size());
                                while (true) {
/* 85 */                            if (!listIterator.hasPrevious()) {
/* 103 */                               objPrevious2 = null;
                                        break;
                                    } else {
/* 87 */                                objPrevious2 = listIterator.previous();
/* 100 */                               if (O0000Ioio00.I0000O(((OI1OloOIO1O) objPrevious2).I00iiI, oI1lo1liOO2)) {
                                            break;
                                        }
                                    }
                                }
/* 105 */                       OI1OloOIO1O oI1OloOIO1O3 = (OI1OloOIO1O) objPrevious2;
/* 107 */                       if (oI1OloOIO1O3 == null) {
/* 129 */                           i1Il0loi = i1Il0loi3;
/* 132 */                           oI1OloOIO1O3 = new OI1OloOIO1O(oI1o1o1iO1l.I0000Il00O, oI1lo1liOO2, bundle, I000O01llI0(), this.I000oI1ioi, UUID.randomUUID().toString(), null);
/* 138 */                           bundle2 = bundle;
                                } else {
/* 141 */                           i1Il0loi = i1Il0loi3;
/* 142 */                           bundle2 = bundle;
                                }
/* 144 */                       i1Il0loi.addFirst(oI1OloOIO1O3);
/* 151 */                       if (!i1Il0loi2.isEmpty() && ((OI1OloOIO1O) i1Il0loi2.last()).I00iiI == oI1lo1liOO2) {
/* 169 */                           I000o00OoI0I(this, (OI1OloOIO1O) i1Il0loi2.last());
                                }
                            } else {
/* 173 */                       i1Il0loi = i1Il0loi3;
/* 174 */                       bundle2 = bundle;
                            }
/* 176 */                   if (oI1lo1liOO2 == null || oI1lo1liOO2 == oI1ilOI1ioo0) {
                                break;
                            }
/* 181 */                   oI1ilOI1ioo03 = oI1lo1liOO2;
/* 182 */                   i1Il0loi3 = i1Il0loi;
                        }
                    } else {
/* 185 */               i1Il0loi = i1Il0loi3;
/* 186 */               bundle2 = bundle;
                    }
/* 202 */           OI1ilOI1ioo0 oI1ilOI1ioo04 = i1Il0loi.isEmpty() ? oI1ilOI1ioo02 : ((OI1OloOIO1O) i1Il0loi.first()).I00iiI;
/* 204 */           while (oI1ilOI1ioo04 != null && I0000Il00O(oI1ilOI1ioo04.I00iiI.I00000oOI, oI1ilOI1ioo04) != oI1ilOI1ioo04) {
/* 216 */               OI1lo1liOO oI1lo1liOO3 = oI1ilOI1ioo04.I00iiO;
/* 218 */               if (oI1lo1liOO3 != null) {
/* 233 */                   Bundle bundle3 = (bundle2 == null || !bundle2.isEmpty()) ? bundle2 : null;
/* 238 */                   ListIterator listIterator2 = list.listIterator(list.size());
                            while (true) {
/* 246 */                       if (!listIterator2.hasPrevious()) {
/* 264 */                           objPrevious = null;
                                    break;
                                } else {
/* 248 */                           objPrevious = listIterator2.previous();
/* 261 */                           if (O0000Ioio00.I0000O(((OI1OloOIO1O) objPrevious).I00iiI, oI1lo1liOO3)) {
                                        break;
                                    }
                                }
                            }
/* 266 */                   OI1OloOIO1O oI1OloOIO1O4 = (OI1OloOIO1O) objPrevious;
/* 268 */                   if (oI1OloOIO1O4 == null) {
/* 294 */                       oI1lo1liOO = oI1lo1liOO3;
/* 300 */                       oI1OloOIO1O4 = new OI1OloOIO1O(oI1o1o1iO1l.I0000Il00O, oI1lo1liOO, oI1lo1liOO3.I00000oOI(bundle3), I000O01llI0(), this.I000oI1ioi, UUID.randomUUID().toString(), null);
                            } else {
/* 306 */                       oI1lo1liOO = oI1lo1liOO3;
                            }
/* 308 */                   i1Il0loi.addFirst(oI1OloOIO1O4);
                        } else {
/* 312 */                   oI1lo1liOO = oI1lo1liOO3;
                        }
/* 315 */               oI1ilOI1ioo04 = oI1lo1liOO;
                    }
/* 322 */           if (!i1Il0loi.isEmpty()) {
/* 331 */               oI1ilOI1ioo02 = ((OI1OloOIO1O) i1Il0loi.first()).I00iiI;
                    }
/* 337 */           while (!i1Il0loi2.isEmpty() && (((OI1OloOIO1O) i1Il0loi2.last()).I00iiI instanceof OI1lo1liOO)) {
/* 365 */               OlIIioolI olIIioolI = (OlIIioolI) ((OI1lo1liOO) ((OI1OloOIO1O) i1Il0loi2.last()).I00iiI).I00ilO0.I00iio;
/* 369 */               int i = oI1ilOI1ioo02.I00iiI.I00000oOI;
/* 371 */               olIIioolI.getClass();
/* 378 */               if (iO10Oii01l.I00000oIO(olIIioolI, i) != null) {
                            break;
                        } else {
/* 386 */                   I000o00OoI0I(this, (OI1OloOIO1O) i1Il0loi2.last());
                        }
                    }
/* 394 */           OI1OloOIO1O oI1OloOIO1O5 = (OI1OloOIO1O) i1Il0loi2.I000iOII();
/* 396 */           if (oI1OloOIO1O5 == null) {
/* 402 */               oI1OloOIO1O5 = (OI1OloOIO1O) i1Il0loi.I000iOII();
                    }
/* 417 */           if (!O0000Ioio00.I0000O(oI1OloOIO1O5 != null ? oI1OloOIO1O5.I00iiI : null, this.I0000Il00O)) {
/* 423 */               ListIterator listIterator3 = list.listIterator(list.size());
                        while (true) {
/* 431 */                   if (!listIterator3.hasPrevious()) {
                                break;
                            }
/* 433 */                   Object objPrevious3 = listIterator3.previous();
/* 448 */                   if (O0000Ioio00.I0000O(((OI1OloOIO1O) objPrevious3).I00iiI, this.I0000Il00O)) {
/* 450 */                       obj = objPrevious3;
                                break;
                            }
                        }
/* 452 */               OI1OloOIO1O oI1OloOIO1O6 = (OI1OloOIO1O) obj;
/* 454 */               if (oI1OloOIO1O6 == null) {
/* 456 */                   I1O0ol i1O0ol = oI1o1o1iO1l.I0000Il00O;
/* 458 */                   OI1lo1liOO oI1lo1liOO4 = this.I0000Il00O;
/* 481 */                   oI1OloOIO1O2 = new OI1OloOIO1O(i1O0ol, oI1lo1liOO4, oI1lo1liOO4.I00000oOI(bundle2), I000O01llI0(), this.I000oI1ioi, UUID.randomUUID().toString(), null);
                        } else {
/* 485 */                   oI1OloOIO1O2 = oI1OloOIO1O6;
                        }
/* 487 */               i1Il0loi.addFirst(oI1OloOIO1O2);
                    }
/* 490 */           Iterator it = i1Il0loi.iterator();
/* 498 */           while (it.hasNext()) {
/* 504 */               OI1OloOIO1O oI1OloOIO1O7 = (OI1OloOIO1O) it.next();
/* 518 */               Object obj2 = this.I00111O.get(this.I0010o.I00000oOI(oI1OloOIO1O7.I00iiI.I00iOIl));
/* 522 */               if (obj2 == null) {
/* 545 */                   IOOlIIilOl0.I0000oI00(IIl001iO0Io.I00100l0(new StringBuilder("NavigatorBackStack for "), oI1ilOI1ioo0.I00iOIl, " should already be created"));
/* 548 */                   return;
                        }
/* 526 */               ((OI1Ooo) obj2).I00000oIO(oI1OloOIO1O7);
                    }
/* 549 */           i1Il0loi2.addAll(i1Il0loi);
/* 552 */           i1Il0loi2.addLast(oI1OloOIO1O);
/* 559 */           Iterator it2 = IOOi0Ool1i.I00OI1(i1Il0loi, oI1OloOIO1O).iterator();
/* 567 */           while (it2.hasNext()) {
/* 573 */               OI1OloOIO1O oI1OloOIO1O8 = (OI1OloOIO1O) it2.next();
/* 577 */               OI1lo1liOO oI1lo1liOO5 = oI1OloOIO1O8.I00iiI.I00iiO;
/* 579 */               if (oI1lo1liOO5 != null) {
/* 589 */                   I000OiO(oI1OloOIO1O8, I0000oI00(oI1lo1liOO5.I00iiI.I00000oOI));
                        }
                    }
                }

                public final boolean I00000oOI() {
/* 1 */             ArrayList arrayList = this.I001iOo1i0O;
/* 3 */             I1Il0loi i1Il0loi = this.I0001Ioi1lo;
/* 9 */             while (!i1Il0loi.isEmpty() && (((OI1OloOIO1O) i1Il0loi.last()).I00iiI instanceof OI1lo1liOO)) {
/* 29 */                I000o00OoI0I(this, (OI1OloOIO1O) i1Il0loi.last());
                    }
/* 37 */            OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) i1Il0loi.I000o00OoI0I();
/* 39 */            if (oI1OloOIO1O != null) {
/* 41 */                arrayList.add(oI1OloOIO1O);
                    }
                    this.I001i1lo1io++;
/* 50 */            I0010I0i();
                    int i = this.I001i1lo1io - 1;
/* 57 */            this.I001i1lo1io = i;
/* 60 */            if (i == 0) {
/* 64 */                ArrayList arrayList2 = new ArrayList(arrayList);
/* 67 */                arrayList.clear();
/* 70 */                Iterator it = arrayList2.iterator();
/* 79 */                while (it.hasNext()) {
/* 85 */                    OI1OloOIO1O oI1OloOIO1O2 = (OI1OloOIO1O) it.next();
/* 93 */                    Iterator it2 = IOOi0Ool1i.I00iIi0i1o(this.I00100l0).iterator();
/* 101 */                   if (it2.hasNext()) {
/* 113 */                       if (it2.next() != null) {
/* 115 */                           OIiilo1Ool0o.I00000oIO();
/* 59 */                            return false;
                                }
/* 119 */                       OI1ilOI1ioo0 oI1ilOI1ioo0 = oI1OloOIO1O2.I00iiI;
/* 123 */                       oI1OloOIO1O2.I00ioIO.I00000oIO();
/* 126 */                       throw null;
                            }
/* 105 */                   this.I001l0I00.I0001Ioi1lo(oI1OloOIO1O2);
                        }
/* 127 */               OlO0OIIl1 olO0OIIl1 = this.I000II;
/* 131 */               ArrayList arrayList3 = new ArrayList(i1Il0loi);
/* 134 */               olO0OIIl1.getClass();
/* 137 */               olO0OIIl1.I000lI(null, arrayList3);
/* 140 */               OlO0OIIl1 olO0OIIl12 = this.I000O01llI0;
/* 142 */               ArrayList arrayListI000oI1ioi = I000oI1ioi();
/* 146 */               olO0OIIl12.getClass();
/* 149 */               olO0OIIl12.I000lI(null, arrayListI000oI1ioi);
                    }
                    return oI1OloOIO1O != null;
                }

                public final OI1ilOI1ioo0 I0000Il00O(int i, OI1ilOI1ioo0 oI1ilOI1ioo0) {
                    OI1ilOI1ioo0 oI1ilOI1ioo02;
/* 1 */             OI1lo1liOO oI1lo1liOO = this.I0000Il00O;
/* 3 */             if (oI1lo1liOO == null) {
/* 5 */                 return null;
                    }
/* 11 */            if (oI1lo1liOO.I00iiI.I00000oOI == i) {
/* 13 */                if (oI1ilOI1ioo0 == null) {
/* 28 */                    return oI1lo1liOO;
                        }
/* 19 */                if (oI1lo1liOO.equals(oI1ilOI1ioo0) && oI1ilOI1ioo0.I00iiO == null) {
/* 25 */                    return this.I0000Il00O;
                        }
                    }
/* 35 */            OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) this.I0001Ioi1lo.I000o00OoI0I();
/* 37 */            if (oI1OloOIO1O == null || (oI1ilOI1ioo02 = oI1OloOIO1O.I00iiI) == null) {
/* 43 */                oI1ilOI1ioo02 = this.I0000Il00O;
                    }
/* 46 */            return I0000O(i, oI1ilOI1ioo02, oI1ilOI1ioo0, false);
                }

                public final OI1OloOIO1O I0000oI00(int i) {
                    Object objPrevious;
/* 1 */             I1Il0loi i1Il0loi = this.I0001Ioi1lo;
/* 7 */             ListIterator<E> listIterator = i1Il0loi.listIterator(i1Il0loi.size());
                    while (true) {
/* 15 */                if (!listIterator.hasPrevious()) {
/* 33 */                    objPrevious = null;
                            break;
                        }
/* 17 */                objPrevious = listIterator.previous();
/* 30 */                if (((OI1OloOIO1O) objPrevious).I00iiI.I00iiI.I00000oOI == i) {
                            break;
                        }
                    }
/* 34 */            OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) objPrevious;
/* 36 */            if (oI1OloOIO1O != null) {
/* 38 */                return oI1OloOIO1O;
                    }
/* 43 */            StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
/* 51 */            sbI00100o1O0lo.append(I0001Ioi1lo());
/* 77 */            throw new IllegalArgumentException(sbI00100o1O0lo.toString().toString());
                }

                public final OI1ilOI1ioo0 I0001Ioi1lo() {
/* 7 */             OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) this.I0001Ioi1lo.I000o00OoI0I();
/* 9 */             if (oI1OloOIO1O != null) {
/* 11 */                return oI1OloOIO1O.I00iiI;
                    }
/* 14 */            return null;
                }

                public final OI1lo1liOO I000II() {
/* 1 */             OI1lo1liOO oI1lo1liOO = this.I0000Il00O;
/* 3 */             if (oI1lo1liOO != null) {
/* 5 */                 return oI1lo1liOO;
                    }
/* 8 */             I000II.I001IO000("You must call setGraph() before calling getGraph()");
/* 11 */            return null;
                }

                public final O0oOi0I I000O01llI0() {
                    return this.I000o00OoI0I == null ? O0oOi0I.I00iiO : this.I00100o1O0lo;
                }

                public final OI1lo1liOO I000OOo1O() {
                    OI1ilOI1ioo0 oI1ilOI1ioo0;
/* 7 */             OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) this.I0001Ioi1lo.I000o00OoI0I();
/* 9 */             if (oI1OloOIO1O == null || (oI1ilOI1ioo0 = oI1OloOIO1O.I00iiI) == null) {
/* 15 */                oI1ilOI1ioo0 = this.I0000Il00O;
                    }
/* 25 */            OI1lo1liOO oI1lo1liOO = oI1ilOI1ioo0 instanceof OI1lo1liOO ? (OI1lo1liOO) oI1ilOI1ioo0 : null;
                    return oI1lo1liOO == null ? oI1ilOI1ioo0.I00iiO : oI1lo1liOO;
                }

                public final void I000OiO(OI1OloOIO1O oI1OloOIO1O, OI1OloOIO1O oI1OloOIO1O2) {
/* 3 */             this.I000OiO.put(oI1OloOIO1O, oI1OloOIO1O2);
/* 6 */             LinkedHashMap linkedHashMap = this.I000iOII;
/* 12 */            if (linkedHashMap.get(oI1OloOIO1O2) == null) {
/* 16 */                I1Ool1o i1Ool1o = new I1Ool1o();
/* 25 */                i1Ool1o.I00000oIO = new AtomicInteger(0);
/* 27 */                VarHandle.storeStoreFence();
/* 30 */                linkedHashMap.put(oI1OloOIO1O2, i1Ool1o);
                    }
/* 41 */            ((I1Ool1o) linkedHashMap.get(oI1OloOIO1O2)).I00000oIO.incrementAndGet();
                }

                /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x01fa  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x01fe  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000iOII(OI1ilOI1ioo0 oI1ilOI1ioo0, Bundle bundle, OI1oooI oI1oooI) {
                    boolean z;
                    int iNextIndex;
                    OI1ilOI1ioo0 oI1ilOI1ioo02;
                    int iNextIndex2;
                    int i;
/* 15 */            Iterator it = this.I00111O.values().iterator();
/* 24 */            while (it.hasNext()) {
/* 32 */                ((OI1Ooo) it.next()).I0000O = true;
                    }
/* 37 */            OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 57 */            boolean zI000l1 = (oI1oooI == null || (i = oI1oooI.I0000Il00O) == -1) ? false : I000l1(i, oI1oooI.I0000O, oI1oooI.I0000oI00);
/* 58 */            Bundle bundleI00000oOI = oI1ilOI1ioo0.I00000oOI(bundle);
/* 62 */            if (oI1oooI != null && oI1oooI.I00000oOI && this.I000l1.containsKey(Integer.valueOf(oI1ilOI1ioo0.I00iiI.I00000oOI))) {
/* 92 */                oOo0l0ii10l.I00iOIl = I00100l0(oI1ilOI1ioo0.I00iiI.I00000oOI, bundleI00000oOI, oI1oooI);
/* 94 */                z = false;
                    } else if (oI1oooI == null || !oI1oooI.I00000oIO) {
/* 507 */               z = false;
/* 509 */               if (!z) {
/* 534 */                   OI1OloOIO1O oI1OloOIO1O = new OI1OloOIO1O(this.I00000oIO.I0000Il00O, oI1ilOI1ioo0, bundleI00000oOI, I000O01llI0(), this.I000oI1ioi, UUID.randomUUID().toString(), null);
/* 541 */                   OII1Il1IlOO oII1Il1IlOOI00000oOI = this.I0010o.I00000oOI(oI1ilOI1ioo0.I00iOIl);
/* 545 */                   List listSingletonList = Collections.singletonList(oI1OloOIO1O);
/* 553 */                   I0O1IO i0o1io = new I0O1IO(19);
/* 556 */                   i0o1io.I00iiI = oOo0l0ii10l;
/* 558 */                   i0o1io.I00iiO = this;
/* 560 */                   i0o1io.I00iio = oI1ilOI1ioo0;
/* 562 */                   i0o1io.I00ilI0I1 = bundleI00000oOI;
/* 564 */                   VarHandle.storeStoreFence();
/* 567 */                   this.I001IIilI0O = i0o1io;
/* 569 */                   oII1Il1IlOOI00000oOI.I0000O(listSingletonList, oI1oooI);
/* 573 */                   this.I001IIilI0O = null;
                        }
                    } else {
/* 110 */               OI1OloOIO1O oI1OloOIO1O2 = (OI1OloOIO1O) this.I0001Ioi1lo.I000o00OoI0I();
/* 112 */               I1Il0loi i1Il0loi = this.I0001Ioi1lo;
/* 118 */               ListIterator listIterator = i1Il0loi.listIterator(i1Il0loi.I00000oOI());
                        while (true) {
/* 126 */                   if (!listIterator.hasPrevious()) {
/* 143 */                       iNextIndex = -1;
                                break;
                            } else if (((OI1OloOIO1O) listIterator.previous()).I00iiI == oI1ilOI1ioo0) {
/* 138 */                       iNextIndex = listIterator.nextIndex();
                                break;
                            }
                        }
/* 144 */               if (iNextIndex != -1) {
/* 150 */                   if (oI1ilOI1ioo0 instanceof OI1lo1liOO) {
/* 152 */                       int i2 = OI1lo1liOO.I00io1l;
/* 179 */                       List listI000lI = OilO1oiooiII.I000lI(new OoI10o0iO11O(OilO1oiooiII.I000OiO((OI1lo1liOO) oI1ilOI1ioo0, new OI1lOo(2)), new O1o0i0Ol0Oo0(23)));
/* 192 */                       if (this.I0001Ioi1lo.I00iiO - iNextIndex == listI000lI.size()) {
/* 196 */                           I1Il0loi i1Il0loi2 = this.I0001Ioi1lo;
/* 200 */                           List listSubList = i1Il0loi2.subList(iNextIndex, i1Il0loi2.I00iiO);
/* 214 */                           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listSubList, 10));
/* 217 */                           Iterator it2 = listSubList.iterator();
/* 225 */                           while (it2.hasNext()) {
/* 243 */                               arrayList.add(Integer.valueOf(((OI1OloOIO1O) it2.next()).I00iiI.I00iiI.I00000oOI));
                                    }
/* 251 */                           if (arrayList.equals(listI000lI)) {
/* 273 */                               I1Il0loi i1Il0loi3 = new I1Il0loi();
/* 282 */                               while (IOOi1I.I000II(this.I0001Ioi1lo) >= iNextIndex) {
/* 290 */                                   OI1OloOIO1O oI1OloOIO1O3 = (OI1OloOIO1O) IOOii0O10Io0.I00111O(this.I0001Ioi1lo);
/* 292 */                                   I00100o1O0lo(oI1OloOIO1O3);
/* 327 */                                   OI1OloOIO1O oI1OloOIO1O4 = new OI1OloOIO1O(oI1OloOIO1O3.I00iOIl, oI1OloOIO1O3.I00iiI, oI1OloOIO1O3.I00iiI.I00000oOI(bundle), oI1OloOIO1O3.I00iio, oI1OloOIO1O3.I00ilI0I1, oI1OloOIO1O3.I00ilO0, oI1OloOIO1O3.I00io1l);
/* 330 */                                   OI1Oo1II110 oI1Oo1II110 = oI1OloOIO1O4.I00ioIO;
/* 334 */                                   oI1Oo1II110.I0000O = oI1OloOIO1O3.I00iio;
/* 340 */                                   oI1Oo1II110.I000iOII = oI1OloOIO1O3.I00ioIO.I000iOII;
/* 342 */                                   oI1Oo1II110.I00000oOI();
/* 345 */                                   i1Il0loi3.addFirst(oI1OloOIO1O4);
                                        }
/* 351 */                               Iterator it3 = i1Il0loi3.iterator();
/* 359 */                               while (it3.hasNext()) {
/* 365 */                                   OI1OloOIO1O oI1OloOIO1O5 = (OI1OloOIO1O) it3.next();
/* 369 */                                   OI1lo1liOO oI1lo1liOO = oI1OloOIO1O5.I00iiI.I00iiO;
/* 371 */                                   if (oI1lo1liOO != null) {
/* 381 */                                       I000OiO(oI1OloOIO1O5, I0000oI00(oI1lo1liOO.I00iiI.I00000oOI));
                                            }
/* 386 */                                   this.I0001Ioi1lo.addLast(oI1OloOIO1O5);
                                        }
/* 390 */                               Iterator it4 = i1Il0loi3.iterator();
/* 398 */                               while (it4.hasNext()) {
/* 404 */                                   OI1OloOIO1O oI1OloOIO1O6 = (OI1OloOIO1O) it4.next();
/* 412 */                                   OII1Il1IlOO oII1Il1IlOOI00000oOI2 = this.I0010o.I00000oOI(oI1OloOIO1O6.I00iiI.I00iOIl);
/* 416 */                                   OI1ilOI1ioo0 oI1ilOI1ioo03 = oI1OloOIO1O6.I00iiI;
/* 418 */                                   if (oI1ilOI1ioo03 == null) {
/* 421 */                                       oI1ilOI1ioo03 = null;
                                            }
/* 422 */                                   if (oI1ilOI1ioo03 != null) {
/* 425 */                                       oII1Il1IlOOI00000oOI2.I0000Il00O(oI1ilOI1ioo03);
/* 428 */                                       OI1Ooo oI1OooI00000oOI = oII1Il1IlOOI00000oOI2.I00000oOI();
                                                synchronized (oI1OooI00000oOI.I00000oIO) {
                                                    try {
/* 447 */                                               ArrayList arrayList2 = new ArrayList((Collection) oI1OooI00000oOI.I0000oI00.I00iOIl.getValue());
/* 454 */                                               ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
                                                        while (true) {
/* 462 */                                                   if (!listIterator2.hasPrevious()) {
/* 487 */                                                       iNextIndex2 = -1;
                                                                break;
                                                            } else if (O0000Ioio00.I0000O(((OI1OloOIO1O) listIterator2.previous()).I00ilO0, oI1OloOIO1O6.I00ilO0)) {
/* 480 */                                                       iNextIndex2 = listIterator2.nextIndex();
                                                                break;
                                                            }
                                                        }
/* 488 */                                               arrayList2.set(iNextIndex2, oI1OloOIO1O6);
/* 491 */                                               OlO0OIIl1 olO0OIIl1 = oI1OooI00000oOI.I00000oOI;
/* 493 */                                               olO0OIIl1.getClass();
/* 497 */                                               olO0OIIl1.I000lI(null, arrayList2);
                                                    } catch (Throwable th) {
/* 503 */                                               throw th;
                                                    }
                                                }
                                            }
                                        }
/* 504 */                               z = true;
                                    }
                                }
/* 507 */                       z = false;
                            } else if (oI1OloOIO1O2 == null || (oI1ilOI1ioo02 = oI1OloOIO1O2.I00iiI) == null || oI1ilOI1ioo0.I00iiI.I00000oOI != oI1ilOI1ioo02.I00iiI.I00000oOI) {
                            }
/* 509 */                   if (!z) {
                            }
                        }
                    }
/* 577 */           this.I00000oOI.invoke();
/* 588 */           Iterator it5 = this.I00111O.values().iterator();
/* 596 */           while (it5.hasNext()) {
/* 605 */               ((OI1Ooo) it5.next()).I0000O = false;
                    }
/* 608 */           if (zI000l1 || oOo0l0ii10l.I00iOIl || z) {
/* 621 */               I00000oOI();
                    } else {
/* 617 */               I0010I0i();
                    }
                }

                public final boolean I000l1(int i, boolean z, boolean z2) {
                    OI1ilOI1ioo0 oI1ilOI1ioo0;
                    OOo0l0ii10l oOo0l0ii10l;
/* 1 */             I1Il0loi i1Il0loi = this.I0001Ioi1lo;
/* 7 */             int i2 = 0;
/* 8 */             if (i1Il0loi.isEmpty()) {
/* 7 */                 return false;
                    }
/* 13 */            ArrayList arrayList = new ArrayList();
/* 20 */            Iterator it = IOOi0Ool1i.I00OIo(i1Il0loi).iterator();
                    while (true) {
/* 29 */                if (!it.hasNext()) {
/* 63 */                    oI1ilOI1ioo0 = null;
                            break;
                        }
/* 37 */                oI1ilOI1ioo0 = ((OI1OloOIO1O) it.next()).I00iiI;
/* 39 */                OII1IlOi0 oII1IlOi0 = this.I0010o;
/* 41 */                String str = oI1ilOI1ioo0.I00iOIl;
/* 43 */                I11l01l i11l01l = oI1ilOI1ioo0.I00iiI;
/* 45 */                OII1Il1IlOO oII1Il1IlOOI00000oOI = oII1IlOi0.I00000oOI(str);
/* 49 */                if (z || i11l01l.I00000oOI != i) {
/* 55 */                    arrayList.add(oII1Il1IlOOI00000oOI);
                        }
/* 60 */                if (i11l01l.I00000oOI == i) {
                            break;
                        }
                    }
/* 64 */            if (oI1ilOI1ioo0 == null) {
/* 66 */                int i3 = OI1ilOI1ioo0.I00ilI0I1;
/* 97 */                Log.i("NavController", "Ignoring popBackStack to destination " + l1iO11O10.I00000oIO(this.I00000oIO.I0000Il00O, i) + " as it was not found on the current back stack");
/* 7 */                 return false;
                    }
/* 101 */           LinkedHashMap linkedHashMap = this.I000l1;
/* 105 */           OOo0l0ii10l oOo0l0ii10l2 = new OOo0l0ii10l();
/* 110 */           I1Il0loi i1Il0loi2 = new I1Il0loi();
/* 113 */           Iterator it2 = arrayList.iterator();
/* 170 */           do {
/* 121 */               int i4 = 2;
/* 122 */               if (!it2.hasNext()) {
                            break;
                        }
/* 128 */               OII1Il1IlOO oII1Il1IlOO = (OII1Il1IlOO) it2.next();
/* 132 */               oOo0l0ii10l = new OOo0l0ii10l();
/* 141 */               OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) this.I0001Ioi1lo.last();
/* 145 */               O11O0010 o11o0010 = new O11O0010(i4);
/* 148 */               o11o0010.I00iiO = oOo0l0ii10l;
/* 150 */               o11o0010.I00iio = oOo0l0ii10l2;
/* 152 */               o11o0010.I00ilI0I1 = this;
/* 154 */               o11o0010.I00iiI = z2;
/* 156 */               o11o0010.I00ilO0 = i1Il0loi2;
/* 158 */               VarHandle.storeStoreFence();
/* 161 */               this.I001IO000 = o11o0010;
/* 163 */               oII1Il1IlOO.I0000oI00(oI1OloOIO1O, z2);
/* 166 */               this.I001IO000 = null;
/* 170 */           } while (oOo0l0ii10l.I00iOIl);
/* 172 */           if (z2) {
/* 174 */               if (!z) {
/* 183 */                   OilO0iOl oilO0iOlI000OiO = OilO1oiooiII.I000OiO(oI1ilOI1ioo0, new O1o0i0Ol0Oo0(21));
/* 189 */                   OI1i01 oI1i01 = new OI1i01(i2);
/* 192 */                   oI1i01.I00iiI = this;
/* 194 */                   VarHandle.storeStoreFence();
/* 199 */                   IlIl0l ilIl0l = new IlIl0l(2);
/* 202 */                   ilIl0l.I00000oOI = oilO0iOlI000OiO;
/* 204 */                   ilIl0l.I0000Il00O = oI1i01;
/* 206 */                   VarHandle.storeStoreFence();
/* 209 */                   Iterator it3 = ilIl0l.iterator();
                            while (true) {
/* 214 */                       IlIloII10O ilIloII10O = (IlIloII10O) it3;
/* 220 */                       if (!ilIloII10O.hasNext()) {
                                    break;
                                }
/* 232 */                       Integer numValueOf = Integer.valueOf(((OI1ilOI1ioo0) ilIloII10O.next()).I00iiI.I00000oOI);
/* 240 */                       OI1Oo1O oI1Oo1O = (OI1Oo1O) i1Il0loi2.I000iOII();
/* 252 */                       linkedHashMap.put(numValueOf, oI1Oo1O != null ? (String) oI1Oo1O.I00000oIO.I00iiO : null);
                            }
                        }
/* 260 */               if (!i1Il0loi2.isEmpty()) {
/* 268 */                   o00io0IiOOo0 o00io0iiooo0 = ((OI1Oo1O) i1Il0loi2.first()).I00000oIO;
/* 283 */                   OilO0iOl oilO0iOlI000OiO2 = OilO1oiooiII.I000OiO(I0000Il00O(o00io0iiooo0.I00iiI, null), new O1o0i0Ol0Oo0(22));
/* 290 */                   OI1i01 oI1i012 = new OI1i01(1);
/* 293 */                   oI1i012.I00iiI = this;
/* 295 */                   VarHandle.storeStoreFence();
/* 300 */                   IlIl0l ilIl0l2 = new IlIl0l(2);
/* 303 */                   ilIl0l2.I00000oOI = oilO0iOlI000OiO2;
/* 305 */                   ilIl0l2.I0000Il00O = oI1i012;
/* 307 */                   VarHandle.storeStoreFence();
/* 310 */                   Iterator it4 = ilIl0l2.iterator();
                            while (true) {
/* 315 */                       IlIloII10O ilIloII10O2 = (IlIloII10O) it4;
/* 321 */                       if (!ilIloII10O2.hasNext()) {
                                    break;
                                }
/* 341 */                       linkedHashMap.put(Integer.valueOf(((OI1ilOI1ioo0) ilIloII10O2.next()).I00iiI.I00000oOI), (String) o00io0iiooo0.I00iiO);
                            }
/* 357 */                   if (linkedHashMap.values().contains((String) o00io0iiooo0.I00iiO)) {
/* 365 */                       this.I000lI.put((String) o00io0iiooo0.I00iiO, i1Il0loi2);
                            }
                        }
                    }
/* 370 */           this.I00000oOI.invoke();
/* 373 */           return oOo0l0ii10l2.I00iOIl;
                }

                public final void I000lI(OI1OloOIO1O oI1OloOIO1O, boolean z, I1Il0loi i1Il0loi) {
                    OI1i0o1Ilo oI1i0o1Ilo;
                    Oool0l1iOIOl oool0l1iOIOl;
                    OOli1O oOli1O;
                    Set set;
/* 1 */             I1Il0loi i1Il0loi2 = this.I0001Ioi1lo;
/* 7 */             OI1OloOIO1O oI1OloOIO1O2 = (OI1OloOIO1O) i1Il0loi2.last();
/* 13 */            if (!O0000Ioio00.I0000O(oI1OloOIO1O2, oI1OloOIO1O)) {
/* 186 */               StringBuilder sb = new StringBuilder("Attempted to pop ");
/* 191 */               sb.append(oI1OloOIO1O.I00iiI);
/* 194 */               OI1ilOI1ioo0 oI1ilOI1ioo0 = oI1OloOIO1O2.I00iiI;
/* 198 */               sb.append(", which is not the top of the back stack (");
/* 201 */               sb.append(oI1ilOI1ioo0);
/* 206 */               sb.append(')');
/* 408 */               throw new IllegalStateException(sb.toString().toString());
                    }
/* 15 */            IOOii0O10Io0.I00111O(i1Il0loi2);
/* 18 */            OII1IlOi0 oII1IlOi0 = this.I0010o;
/* 20 */            OI1ilOI1ioo0 oI1ilOI1ioo02 = oI1OloOIO1O2.I00iiI;
/* 22 */            String str = oI1OloOIO1O2.I00ilO0;
/* 24 */            OI1Oo1II110 oI1Oo1II110 = oI1OloOIO1O2.I00ioIO;
/* 38 */            OI1Ooo oI1Ooo = (OI1Ooo) this.I00111O.get(oII1IlOi0.I00000oOI(oI1ilOI1ioo02.I00iOIl));
/* 41 */            boolean z2 = true;
/* 42 */            if ((oI1Ooo == null || (oOli1O = oI1Ooo.I0001Ioi1lo) == null || (set = (Set) oOli1O.I00iOIl.getValue()) == null || !set.contains(oI1OloOIO1O2)) && !this.I000iOII.containsKey(oI1OloOIO1O2)) {
/* 74 */                z2 = false;
                    }
/* 77 */            O0oOi0I o0oOi0I = oI1Oo1II110.I000OiO.I00l0I0l0lO1;
/* 79 */            O0oOi0I o0oOi0I2 = O0oOi0I.I00iiO;
/* 85 */            if (o0oOi0I.I00000oIO(o0oOi0I2)) {
/* 87 */                if (z) {
/* 89 */                    oI1OloOIO1O2.I00000oIO(o0oOi0I2);
/* 94 */                    OI1Oo1O oI1Oo1O = new OI1Oo1O();
/* 103 */                   int i = oI1OloOIO1O2.I00iiI.I00iiI.I00000oOI;
/* 106 */                   o00io0IiOOo0 o00io0iiooo0 = new o00io0IiOOo0(3);
/* 109 */                   o00io0iiooo0.I00iiO = str;
/* 111 */                   o00io0iiooo0.I00iiI = i;
/* 117 */                   o00io0iiooo0.I00iio = oI1Oo1II110.I00000oIO();
/* 127 */                   Bundle bundleI00000oIO = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 131 */                   o00io0iiooo0.I00ilI0I1 = bundleI00000oIO;
/* 135 */                   oI1Oo1II110.I000O01llI0.I00ooIo0(bundleI00000oIO);
/* 138 */                   oI1Oo1O.I00000oIO = o00io0iiooo0;
/* 140 */                   VarHandle.storeStoreFence();
/* 143 */                   i1Il0loi.addFirst(oI1Oo1O);
                        }
/* 146 */               if (z2) {
/* 157 */                   oI1OloOIO1O2.I00000oIO(o0oOi0I2);
                        } else {
/* 150 */                   oI1OloOIO1O2.I00000oIO(O0oOi0I.I00iOIl);
/* 153 */                   I00100o1O0lo(oI1OloOIO1O2);
                        }
                    }
/* 160 */           if (z || z2 || (oI1i0o1Ilo = this.I000oI1ioi) == null || (oool0l1iOIOl = (Oool0l1iOIOl) oI1i0o1Ilo.I00000oOI.remove(str)) == null) {
/* 181 */               return;
                    }
/* 178 */           oool0l1iOIOl.I00000oIO();
                }

                public final ArrayList I000oI1ioi() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 14 */            Iterator it = this.I00111O.values().iterator();
/* 22 */            while (it.hasNext()) {
/* 38 */                Iterable iterable = (Iterable) ((OI1Ooo) it.next()).I0001Ioi1lo.I00iOIl.getValue();
/* 42 */                ArrayList arrayList2 = new ArrayList();
/* 53 */                for (Object obj : iterable) {
/* 60 */                    OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) obj;
/* 66 */                    if (!arrayList.contains(oI1OloOIO1O) && !oI1OloOIO1O.I00ioIO.I000iOII.I00000oIO(O0oOi0I.I00iio)) {
/* 80 */                        arrayList2.add(obj);
                            }
                        }
/* 84 */                IOOii0O10Io0.I00100l0(arrayList, arrayList2);
                    }
/* 88 */            I1Il0loi i1Il0loi = this.I0001Ioi1lo;
/* 92 */            ArrayList arrayList3 = new ArrayList();
/* 95 */            Iterator it2 = i1Il0loi.iterator();
/* 103 */           while (it2.hasNext()) {
/* 105 */               Object next = it2.next();
/* 110 */               OI1OloOIO1O oI1OloOIO1O2 = (OI1OloOIO1O) next;
/* 116 */               if (!arrayList.contains(oI1OloOIO1O2) && oI1OloOIO1O2.I00ioIO.I000iOII.I00000oIO(O0oOi0I.I00iio)) {
/* 130 */                   arrayList3.add(next);
                        }
                    }
/* 134 */           IOOii0O10Io0.I00100l0(arrayList, arrayList3);
/* 139 */           ArrayList arrayList4 = new ArrayList();
/* 142 */           Iterator it3 = arrayList.iterator();
/* 150 */           while (it3.hasNext()) {
/* 152 */               Object next2 = it3.next();
/* 163 */               if (!(((OI1OloOIO1O) next2).I00iiI instanceof OI1lo1liOO)) {
/* 165 */                   arrayList4.add(next2);
                        }
                    }
/* 245 */           return arrayList4;
                }

                public final boolean I00100l0(int i, Bundle bundle, OI1oooI oI1oooI) {
                    OI1ilOI1ioo0 oI1ilOI1ioo0I000II;
                    OI1OloOIO1O oI1OloOIO1O;
                    OI1ilOI1ioo0 oI1ilOI1ioo0;
/* 1 */             LinkedHashMap linkedHashMap = this.I000l1;
/* 12 */            if (!linkedHashMap.containsKey(Integer.valueOf(i))) {
/* 11 */                return false;
                    }
/* 23 */            String str = (String) linkedHashMap.get(Integer.valueOf(i));
/* 31 */            Iterator it = linkedHashMap.values().iterator();
/* 40 */            while (it.hasNext()) {
/* 52 */                if (O0000Ioio00.I0000O((String) it.next(), str)) {
/* 54 */                    it.remove();
                        }
                    }
/* 68 */            I1Il0loi i1Il0loi = (I1Il0loi) OoOOI1100oI0.I00000oIO(this.I000lI).remove(str);
/* 72 */            I1O0ol i1O0ol = this.I00000oIO.I0000Il00O;
/* 76 */            ArrayList arrayList = new ArrayList();
/* 85 */            OI1OloOIO1O oI1OloOIO1O2 = (OI1OloOIO1O) this.I0001Ioi1lo.I000o00OoI0I();
/* 87 */            if (oI1OloOIO1O2 == null || (oI1ilOI1ioo0I000II = oI1OloOIO1O2.I00iiI) == null) {
/* 93 */                oI1ilOI1ioo0I000II = I000II();
                    }
/* 98 */            if (i1Il0loi != null) {
/* 100 */               Iterator it2 = i1Il0loi.iterator();
/* 108 */               while (it2.hasNext()) {
/* 114 */                   OI1Oo1O oI1Oo1O = (OI1Oo1O) it2.next();
/* 120 */                   OI1ilOI1ioo0 oI1ilOI1ioo0I0000O = I0000O(oI1Oo1O.I00000oIO.I00iiI, oI1ilOI1ioo0I000II, null, true);
/* 124 */                   if (oI1ilOI1ioo0I0000O == null) {
/* 141 */                       int i2 = OI1ilOI1ioo0.I00ilI0I1;
/* 155 */                       IoOOl0iOl1io.I001IO000("Restore State failed: destination ", l1iO11O10.I00000oIO(i1O0ol, oI1Oo1O.I00000oIO.I00iiI), " cannot be found from the current destination ", oI1ilOI1ioo0I000II);
/* 11 */                        return false;
                            }
/* 136 */                   arrayList.add(oI1Oo1O.I00000oIO(i1O0ol, oI1ilOI1ioo0I0000O, I000O01llI0(), this.I000oI1ioi));
/* 139 */                   oI1ilOI1ioo0I000II = oI1ilOI1ioo0I0000O;
                        }
                    }
/* 161 */           ArrayList arrayList2 = new ArrayList();
/* 166 */           ArrayList arrayList3 = new ArrayList();
/* 169 */           Iterator it3 = arrayList.iterator();
/* 177 */           while (it3.hasNext()) {
/* 179 */               Object next = it3.next();
/* 190 */               if (!(((OI1OloOIO1O) next).I00iiI instanceof OI1lo1liOO)) {
/* 192 */                   arrayList3.add(next);
                        }
                    }
/* 196 */           Iterator it4 = arrayList3.iterator();
/* 204 */           while (it4.hasNext()) {
/* 210 */               OI1OloOIO1O oI1OloOIO1O3 = (OI1OloOIO1O) it4.next();
/* 216 */               List list = (List) IOOi0Ool1i.I00IoIO0lI(arrayList2);
/* 244 */               if (O0000Ioio00.I0000O((list == null || (oI1OloOIO1O = (OI1OloOIO1O) IOOi0Ool1i.I00Io1o110i(list)) == null || (oI1ilOI1ioo0 = oI1OloOIO1O.I00iiI) == null) ? null : oI1ilOI1ioo0.I00iOIl, oI1OloOIO1O3.I00iiI.I00iOIl)) {
/* 248 */                   list.add(oI1OloOIO1O3);
                        } else {
/* 260 */                   arrayList2.add(IOOi1I.I000OiO(oI1OloOIO1O3));
                        }
                    }
/* 266 */           OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 269 */           Iterator it5 = arrayList2.iterator();
/* 277 */           while (it5.hasNext()) {
/* 283 */               List list2 = (List) it5.next();
/* 297 */               OII1Il1IlOO oII1Il1IlOOI00000oOI = this.I0010o.I00000oOI(((OI1OloOIO1O) IOOi0Ool1i.I001lllioOl(list2)).I00iiI.I00iOIl);
/* 303 */               OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 310 */               I0IO1io0I i0IO1io0I = new I0IO1io0I(13);
/* 313 */               i0IO1io0I.I00iiO = oOo0l0ii10l;
/* 315 */               i0IO1io0I.I00iio = arrayList;
/* 317 */               i0IO1io0I.I00ilI0I1 = oOo0ll111;
/* 319 */               i0IO1io0I.I00ilO0 = this;
/* 321 */               i0IO1io0I.I00iiI = bundle;
/* 323 */               VarHandle.storeStoreFence();
/* 326 */               this.I001IIilI0O = i0IO1io0I;
/* 328 */               oII1Il1IlOOI00000oOI.I0000O(list2, oI1oooI);
/* 331 */               this.I001IIilI0O = null;
                    }
/* 334 */           return oOo0l0ii10l.I00iOIl;
                }

                public final void I00100o1O0lo(OI1OloOIO1O oI1OloOIO1O) {
/* 1 */             LinkedHashMap linkedHashMap = this.I000iOII;
/* 9 */             OI1OloOIO1O oI1OloOIO1O2 = (OI1OloOIO1O) this.I000OiO.remove(oI1OloOIO1O);
/* 11 */            if (oI1OloOIO1O2 == null) {
/* 77 */                return;
                    }
/* 18 */            I1Ool1o i1Ool1o = (I1Ool1o) linkedHashMap.get(oI1OloOIO1O2);
/* 33 */            Integer numValueOf = i1Ool1o != null ? Integer.valueOf(i1Ool1o.I00000oIO.decrementAndGet()) : null;
/* 34 */            if (numValueOf != null && numValueOf.intValue() == 0) {
/* 59 */                OI1Ooo oI1Ooo = (OI1Ooo) this.I00111O.get(this.I0010o.I00000oOI(oI1OloOIO1O2.I00iiI.I00iOIl));
/* 61 */                if (oI1Ooo != null) {
/* 63 */                    oI1Ooo.I00000oOI(oI1OloOIO1O2);
                        }
/* 66 */                linkedHashMap.remove(oI1OloOIO1O2);
                    }
                }

                public final void I0010I0i() {
                    I1Ool1o i1Ool1o;
                    OOli1O oOli1O;
                    Set set;
/* 5 */             ArrayList arrayList = new ArrayList(this.I0001Ioi1lo);
/* 12 */            if (arrayList.isEmpty()) {
/* 743 */               return;
                    }
/* 28 */            ArrayList arrayListI000OiO = IOOi1I.I000OiO(((OI1OloOIO1O) IOOi0Ool1i.I00Io1o110i(arrayList)).I00iiI);
/* 34 */            ArrayList arrayList2 = new ArrayList();
/* 43 */            if (IOOi0Ool1i.I00Io1o110i(arrayListI000OiO) instanceof Iii0OliiI) {
/* 49 */                Iterator it = IOOi0Ool1i.I00OIo(arrayList).iterator();
/* 57 */                while (it.hasNext()) {
/* 65 */                    OI1ilOI1ioo0 oI1ilOI1ioo0 = ((OI1OloOIO1O) it.next()).I00iiI;
/* 67 */                    arrayList2.add(oI1ilOI1ioo0);
/* 72 */                    if (!(oI1ilOI1ioo0 instanceof Iii0OliiI) && !(oI1ilOI1ioo0 instanceof OI1lo1liOO)) {
                                break;
                            }
                        }
                    }
/* 80 */            HashMap map = new HashMap();
/* 95 */            for (OI1OloOIO1O oI1OloOIO1O : IOOi0Ool1i.I00OIo(arrayList)) {
/* 105 */               O0oOi0I o0oOi0I = oI1OloOIO1O.I00ioIO.I000iOII;
/* 107 */               OI1ilOI1ioo0 oI1ilOI1ioo02 = oI1OloOIO1O.I00iiI;
/* 113 */               OI1ilOI1ioo0 oI1ilOI1ioo03 = (OI1ilOI1ioo0) IOOi0Ool1i.I00II0Ol1O0l(arrayListI000OiO);
/* 115 */               if (oI1ilOI1ioo03 != null && oI1ilOI1ioo03.I00iiI.I00000oOI == oI1ilOI1ioo02.I00iiI.I00000oOI) {
/* 127 */                   O0oOi0I o0oOi0I2 = O0oOi0I.I00ilI0I1;
/* 129 */                   if (o0oOi0I != o0oOi0I2) {
/* 147 */                       OI1Ooo oI1Ooo = (OI1Ooo) this.I00111O.get(this.I0010o.I00000oOI(oI1OloOIO1O.I00iiI.I00iOIl));
/* 181 */                       if (O0000Ioio00.I0000O((oI1Ooo == null || (oOli1O = oI1Ooo.I0001Ioi1lo) == null || (set = (Set) oOli1O.I00iOIl.getValue()) == null) ? null : Boolean.valueOf(set.contains(oI1OloOIO1O)), Boolean.TRUE) || ((i1Ool1o = (I1Ool1o) this.I000iOII.get(oI1OloOIO1O)) != null && i1Ool1o.I00000oIO.get() == 0)) {
/* 208 */                           map.put(oI1OloOIO1O, O0oOi0I.I00iio);
                                } else {
/* 202 */                           map.put(oI1OloOIO1O, o0oOi0I2);
                                }
                            }
/* 215 */                   OI1ilOI1ioo0 oI1ilOI1ioo04 = (OI1ilOI1ioo0) IOOi0Ool1i.I00II0Ol1O0l(arrayList2);
/* 217 */                   if (oI1ilOI1ioo04 != null && oI1ilOI1ioo04.I00iiI.I00000oOI == oI1ilOI1ioo02.I00iiI.I00000oOI) {
/* 229 */                       IOOii0O10Io0.I0010o(arrayList2);
                            }
/* 232 */                   IOOii0O10Io0.I0010o(arrayListI000OiO);
/* 235 */                   OI1lo1liOO oI1lo1liOO = oI1ilOI1ioo02.I00iiO;
/* 237 */                   if (oI1lo1liOO != null) {
/* 239 */                       arrayListI000OiO.add(oI1lo1liOO);
                            }
                        } else if (arrayList2.isEmpty() || oI1ilOI1ioo02.I00iiI.I00000oOI != ((OI1ilOI1ioo0) IOOi0Ool1i.I001lllioOl(arrayList2)).I00iiI.I00000oOI) {
/* 306 */                   oI1OloOIO1O.I00000oIO(O0oOi0I.I00iiO);
                        } else {
/* 270 */                   OI1ilOI1ioo0 oI1ilOI1ioo05 = (OI1ilOI1ioo0) IOOii0O10Io0.I0010o(arrayList2);
/* 274 */                   if (o0oOi0I == O0oOi0I.I00ilI0I1) {
/* 278 */                       oI1OloOIO1O.I00000oIO(O0oOi0I.I00iio);
                            } else {
/* 282 */                       O0oOi0I o0oOi0I3 = O0oOi0I.I00iio;
/* 284 */                       if (o0oOi0I != o0oOi0I3) {
/* 286 */                           map.put(oI1OloOIO1O, o0oOi0I3);
                                }
                            }
/* 289 */                   OI1lo1liOO oI1lo1liOO2 = oI1ilOI1ioo05.I00iiO;
/* 291 */                   if (oI1lo1liOO2 != null && !arrayList2.contains(oI1lo1liOO2)) {
/* 299 */                       arrayList2.add(oI1lo1liOO2);
                            }
                        }
                    }
/* 311 */           Iterator it2 = arrayList.iterator();
/* 319 */           while (it2.hasNext()) {
/* 325 */               OI1OloOIO1O oI1OloOIO1O2 = (OI1OloOIO1O) it2.next();
/* 331 */               O0oOi0I o0oOi0I4 = (O0oOi0I) map.get(oI1OloOIO1O2);
/* 333 */               if (o0oOi0I4 != null) {
/* 335 */                   oI1OloOIO1O2.I00000oIO(o0oOi0I4);
                        } else {
/* 341 */                   oI1OloOIO1O2.I00ioIO.I00000oOI();
                        }
                    }
                }
            }
