            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.os.Build;
            import android.util.Range;
            import android.util.Size;
            import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
            import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            
            public final class IIoIi00lIii0 implements IIl10IOlll0 {
                public I0Iiil0 I00iOIl;
                public I0Iiil0 I00iiI;
                public OolO0o0O10I I00iiO;
                public IIllII I00iio;
                public ArrayList I00ilI0I1;
                public ArrayList I00ilO0;
                public IIlOO01iI I00io1l;
                public List I00ioIO;
                public Range I00l0I0l0lO1;
                public IIlIi00 I00l0OO0IO;
                public Object I00li1OI;
                public boolean I00ll1;
                public IOlOo1ll1l1 I00lli11;
                public Ool10o I00lll10;
                public OlOO1Io010o I00o0iI0io1;
                public IOlO11lll0l I00o0l1o1o0;
                public IOlO11lll0l I00o101lO;
                public I1I0i0Ilo1Oi I00oI0i;
                public OlOO1i11110 I00oII;

                public static HashMap I000OiO(LinkedHashSet linkedHashSet, Oi0Oooi oi0Oooi) {
/* 3 */             HashMap map = new HashMap();
/* 6 */             Iterator it = linkedHashSet.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                Ool10o ool10o = (Ool10o) it.next();
/* 24 */                map.put(ool10o, ool10o.I000O01llI0);
/* 27 */                HashSet hashSet = null;
/* 35 */                LinkedHashSet linkedHashSet2 = oi0Oooi != null ? (LinkedHashSet) oi0Oooi.I00iiI : null;
/* 36 */                if (linkedHashSet2 != null) {
/* 40 */                    hashSet = new HashSet(linkedHashSet2);
                        }
/* 43 */                ool10o.I000O01llI0 = hashSet;
                    }
/* 106 */           return map;
                }

                public static Matrix I001IO000(Rect rect, Size size) {
/* 18 */            lII1OI11o1I.I00000oIO("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
/* 23 */            RectF rectF = new RectF(rect);
/* 28 */            Matrix matrix = new Matrix();
/* 49 */            matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
/* 52 */            matrix.invert(matrix);
/* 106 */           return matrix;
                }

                public static HashMap I001iOo1i0O(ArrayList arrayList, OolO0o0O10I oolO0o0O10I, OolO0o0O10I oolO0o0O10I2, Range range) {
                    OolIl0ii1 oolIl0ii1I000II;
/* 3 */             HashMap map = new HashMap();
/* 6 */             Iterator it = arrayList.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                Ool10o ool10o = (Ool10o) it.next();
/* 26 */                if (ool10o instanceof OlOO1Io010o) {
/* 29 */                    OlOO1Io010o olOO1Io010o = (OlOO1Io010o) ool10o;
/* 40 */                    OolIl0ii1 oolIl0ii1I000II2 = new IIl0lo1oi(1).I00000oOI().I000II(false, oolO0o0O10I);
/* 44 */                    if (oolIl0ii1I000II2 == null) {
/* 46 */                        oolIl0ii1I000II = null;
                            } else {
/* 48 */                        OI0oiliol10O oI0oiliol10OI000iOII = OI0oiliol10O.I000iOII(oolIl0ii1I000II2);
/* 54 */                        oI0oiliol10OI000iOII.I001IO000(OloIIlI1o10.I00IioO0OiOi);
/* 63 */                        oolIl0ii1I000II = ((IIl0lo1oi) olOO1Io010o.I000l1(oI0oiliol10OI000iOII)).I00100o1O0lo();
                            }
                        } else {
/* 68 */                    oolIl0ii1I000II = ool10o.I000II(false, oolO0o0O10I);
                        }
/* 72 */                OolIl0ii1 oolIl0ii1I000II3 = ool10o.I000II(true, oolO0o0O10I2);
/* 83 */                OI0oiliol10O oI0oiliol10OI000iOII2 = oolIl0ii1I000II3 != null ? OI0oiliol10O.I000iOII(oolIl0ii1I000II3) : OI0oiliol10O.I000OOo1O();
/* 93 */                oI0oiliol10OI000iOII2.I0010I0i(OolIl0ii1.I00Iooi00oi, 0);
/* 102 */               if (!I1lIoOIi.I000O01llI0.equals(range)) {
/* 108 */                   oI0oiliol10OI000iOII2.I000lI(OolIl0ii1.I00O0i0ii, IOlOo0.I00iiI, range);
/* 115 */                   oI0oiliol10OI000iOII2.I0010I0i(OolIl0ii1.I00O0o1oo, Boolean.TRUE);
                        }
/* 122 */               OolIl0ii1 oolIl0ii1I00100o1O0lo = ool10o.I000l1(oI0oiliol10OI000iOII2).I00100o1O0lo();
/* 128 */               IIoIIlol iIoIIlol = new IIoIIlol();
/* 131 */               iIoIIlol.I00000oIO = oolIl0ii1I000II;
/* 133 */               iIoIIlol.I00000oOI = oolIl0ii1I00100o1O0lo;
/* 135 */               map.put(ool10o, iIoIIlol);
                    }
/* 204 */           return map;
                }

                public static void I00II0Ol1O0l(HashMap map) {
                    HashSet hashSet;
/* 13 */            for (Map.Entry entry : map.entrySet()) {
/* 25 */                Ool10o ool10o = (Ool10o) entry.getKey();
/* 31 */                Set set = (Set) entry.getValue();
/* 33 */                if (set != null) {
/* 35 */                    ool10o.getClass();
/* 40 */                    hashSet = new HashSet(set);
                        } else {
/* 44 */                    hashSet = null;
                        }
/* 45 */                ool10o.I000O01llI0 = hashSet;
                    }
                }

                public static ArrayList I00II0oii1o(ArrayList arrayList, List list) {
/* 3 */             ArrayList arrayList2 = new ArrayList(list);
/* 6 */             Iterator it = arrayList.iterator();
/* 14 */            while (it.hasNext()) {
/* 22 */                ((Ool10o) it.next()).getClass();
/* 25 */                Iterator it2 = list.iterator();
/* 33 */                if (it2.hasNext()) {
/* 40 */                    throw IIlIOloOOO.I000lI(it2);
                        }
                    }
/* 106 */           return arrayList2;
                }

                @Override
                public final IIlO1O0lOl I00000oOI() {
/* 3 */             return this.I00iOIl.I00iiO;
                }

                @Override
                public final IIllOioOlolI I0000Il00O() {
/* 3 */             return this.I00iOIl.I00iiI;
                }

                public final void I0000oI00(Collection collection, Oi0Oooi oi0Oooi) {
/* 3 */             Objects.toString(collection);
/* 6 */             Objects.toString(oi0Oooi);
/* 10 */            l11I11lO.I0000O(3, "CameraUseCaseAdapter");
                    synchronized (this.I00li1OI) {
                        try {
/* 16 */                    I0Iiil0 i0Iiil0 = this.I00iOIl;
/* 18 */                    IIlIi00 iIlIi00 = this.I00l0OO0IO;
/* 20 */                    i0Iiil0.I000iOII(iIlIi00);
/* 23 */                    I0Iiil0 i0Iiil02 = this.I00iiI;
/* 25 */                    if (i0Iiil02 != null) {
/* 27 */                        i0Iiil02.I000iOII(iIlIi00);
                            }
/* 34 */                    LinkedHashSet linkedHashSet = new LinkedHashSet(this.I00ilI0I1);
/* 37 */                    linkedHashSet.addAll(collection);
/* 40 */                    HashMap mapI000OiO = I000OiO(linkedHashSet, oi0Oooi);
                            try {
/* 55 */                        I000II(I001IIilI0O(linkedHashSet, this.I00iiI != null));
                            } catch (IllegalArgumentException e) {
/* 63 */                        I00II0Ol1O0l(mapI000OiO);
/* 71 */                        throw new IIoIIOI0l1(e);
                            }
                        } catch (Throwable th) {
/* 106 */                   throw th;
                        }
                    }
                }

                public final void I000II(IIiI0Oo iIiI0Oo) {
/* 3 */             Map map = iIiI0Oo.I000OOo1O.I00000oIO;
/* 5 */             ArrayList arrayList = iIiI0Oo.I00000oOI;
                    synchronized (this.I00li1OI) {
                        try {
/* 10 */                    Iterator it = arrayList.iterator();
/* 18 */                    while (it.hasNext()) {
/* 24 */                        Ool10o ool10o = (Ool10o) it.next();
/* 32 */                        Rect rectI000OOo1O = this.I00iOIl.I00iiI.I00iOIl.I000OOo1O();
/* 40 */                        I1lIoOIi i1lIoOIi = (I1lIoOIi) map.get(ool10o);
/* 42 */                        i1lIoOIi.getClass();
/* 51 */                        ool10o.I001lIiIIo1O(I001IO000(rectI000OOo1O, i1lIoOIi.I00000oIO));
                            }
                        } catch (Throwable th) {
/* 1261 */                  throw th;
                        }
                    }
/* 59 */            List list = this.I00ioIO;
/* 61 */            ArrayList arrayList2 = iIiI0Oo.I00000oOI;
/* 63 */            LinkedHashSet linkedHashSet = iIiI0Oo.I00000oIO;
/* 65 */            ArrayList arrayListI00II0oii1o = I00II0oii1o(arrayList2, list);
/* 71 */            ArrayList arrayList3 = new ArrayList(linkedHashSet);
/* 74 */            arrayList3.removeAll(arrayList2);
/* 77 */            ArrayList arrayListI00II0oii1o2 = I00II0oii1o(arrayList3, arrayListI00II0oii1o);
/* 85 */            if (!arrayListI00II0oii1o2.isEmpty()) {
/* 103 */               l11I11lO.I0000oI00("CameraUseCaseAdapter", "Unused effects: " + arrayListI00II0oii1o2);
                    }
/* 108 */           Iterator it2 = iIiI0Oo.I0000oI00.iterator();
/* 116 */           while (it2.hasNext()) {
/* 126 */               ((Ool10o) it2.next()).I001lloI(this.I00iOIl);
                    }
/* 134 */           this.I00iOIl.I000oI1ioi(iIiI0Oo.I0000oI00);
/* 139 */           if (this.I00iiI != null) {
/* 143 */               Iterator it3 = iIiI0Oo.I0000oI00.iterator();
/* 151 */               while (it3.hasNext()) {
/* 157 */                   Ool10o ool10o2 = (Ool10o) it3.next();
/* 159 */                   I0Iiil0 i0Iiil0 = this.I00iiI;
/* 161 */                   Objects.requireNonNull(i0Iiil0);
/* 164 */                   ool10o2.I001lloI(i0Iiil0);
                        }
/* 168 */               I0Iiil0 i0Iiil02 = this.I00iiI;
/* 170 */               Objects.requireNonNull(i0Iiil02);
/* 175 */               i0Iiil02.I000oI1ioi(iIiI0Oo.I0000oI00);
                    }
/* 184 */           if (iIiI0Oo.I0000oI00.isEmpty()) {
/* 188 */               Iterator it4 = iIiI0Oo.I0000O.iterator();
/* 196 */               while (it4.hasNext()) {
/* 202 */                   Ool10o ool10o3 = (Ool10o) it4.next();
/* 206 */                   Map map2 = iIiI0Oo.I000OOo1O.I00000oIO;
/* 212 */                   if (map2.containsKey(ool10o3)) {
/* 218 */                       I1lIoOIi i1lIoOIi2 = (I1lIoOIi) map2.get(ool10o3);
/* 220 */                       Objects.requireNonNull(i1lIoOIi2);
/* 223 */                       IOlOo1ll1l1 iOlOo1ll1l1 = i1lIoOIi2.I0001Ioi1lo;
/* 225 */                       if (iOlOo1ll1l1 != null) {
/* 227 */                           OillooOlI oillooOlI = ool10o3.I00100l0;
/* 231 */                           OIil0iio0 oIil0iio0 = oillooOlI.I000II.I00000oOI;
/* 233 */                           Objects.requireNonNull(iOlOo1ll1l1);
/* 256 */                           if (iOlOo1ll1l1.I0000Il00O().size() == oillooOlI.I000II.I00000oOI.I0000Il00O().size()) {
/* 271 */                               for (I1ioiI i1ioiI : iOlOo1ll1l1.I0000Il00O()) {
/* 285 */                                   if (!oIil0iio0.I00iOIl.containsKey(i1ioiI) || !Objects.equals(oIil0iio0.I0000O(i1ioiI), iOlOo1ll1l1.I0000O(i1ioiI))) {
                                            }
                                        }
                                    }
/* 305 */                           ool10o3.I000OiO = ool10o3.I001i1lo1io(iOlOo1ll1l1);
/* 309 */                           if (this.I00ll1) {
/* 313 */                               this.I00iOIl.I000OiO(ool10o3);
/* 316 */                               I0Iiil0 i0Iiil03 = this.I00iiI;
/* 318 */                               if (i0Iiil03 != null) {
/* 320 */                                   i0Iiil03.I000OiO(ool10o3);
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 327 */           Iterator it5 = iIiI0Oo.I0000Il00O.iterator();
/* 335 */           while (it5.hasNext()) {
/* 341 */               Ool10o ool10o4 = (Ool10o) it5.next();
/* 349 */               IIoIIlol iIoIIlol = (IIoIIlol) iIiI0Oo.I000O01llI0.get(ool10o4);
/* 351 */               Objects.requireNonNull(iIoIIlol);
/* 354 */               I0Iiil0 i0Iiil04 = this.I00iiI;
/* 356 */               I0Iiil0 i0Iiil05 = this.I00iOIl;
/* 358 */               OolIl0ii1 oolIl0ii1 = iIoIIlol.I00000oIO;
/* 360 */               if (i0Iiil04 != null) {
/* 364 */                   ool10o4.I00000oOI(i0Iiil05, i0Iiil04, oolIl0ii1, iIoIIlol.I00000oOI);
/* 375 */                   I1lIoOIi i1lIoOIi3 = (I1lIoOIi) iIiI0Oo.I000OOo1O.I00000oIO.get(ool10o4);
/* 377 */                   i1lIoOIi3.getClass();
/* 380 */                   OlOO1i0ll0 olOO1i0ll0 = iIiI0Oo.I000OiO;
/* 382 */                   olOO1i0ll0.getClass();
/* 393 */                   ool10o4.I00II0oii1o(i1lIoOIi3, (I1lIoOIi) olOO1i0ll0.I00000oIO.get(ool10o4));
                        } else {
/* 400 */                   ool10o4.I00000oOI(i0Iiil05, null, oolIl0ii1, iIoIIlol.I00000oOI);
/* 411 */                   I1lIoOIi i1lIoOIi4 = (I1lIoOIi) iIiI0Oo.I000OOo1O.I00000oIO.get(ool10o4);
/* 413 */                   i1lIoOIi4.getClass();
/* 416 */                   ool10o4.I00II0oii1o(i1lIoOIi4, null);
                        }
                    }
/* 422 */           if (this.I00ll1) {
/* 428 */               this.I00iOIl.I000o00OoI0I(iIiI0Oo.I0000Il00O);
/* 431 */               I0Iiil0 i0Iiil06 = this.I00iiI;
/* 433 */               if (i0Iiil06 != null) {
/* 437 */                   i0Iiil06.I000o00OoI0I(iIiI0Oo.I0000Il00O);
                        }
                    }
/* 442 */           Iterator it6 = iIiI0Oo.I0000Il00O.iterator();
/* 450 */           while (it6.hasNext()) {
/* 458 */               ((Ool10o) it6.next()).I0010I0i();
                    }
/* 464 */           this.I00ilI0I1.clear();
/* 471 */           this.I00ilI0I1.addAll(iIiI0Oo.I00000oIO);
/* 476 */           this.I00ilO0.clear();
/* 483 */           this.I00ilO0.addAll(iIiI0Oo.I00000oOI);
/* 488 */           this.I00lll10 = iIiI0Oo.I000II;
/* 492 */           this.I00o0iI0io1 = iIiI0Oo.I0001Ioi1lo;
                }

                public final void I00111O() {
                    synchronized (this.I00li1OI) {
                        try {
/* 6 */                     if (!this.I00ll1) {
/* 14 */                        if (!this.I00ilO0.isEmpty()) {
/* 20 */                            this.I00iOIl.I000iOII(this.I00l0OO0IO);
/* 23 */                            I0Iiil0 i0Iiil0 = this.I00iiI;
/* 25 */                            if (i0Iiil0 != null) {
/* 29 */                                i0Iiil0.I000iOII(this.I00l0OO0IO);
                                    }
                                }
/* 39 */                        this.I00iOIl.I000o00OoI0I(this.I00ilO0);
/* 42 */                        I0Iiil0 i0Iiil02 = this.I00iiI;
/* 44 */                        if (i0Iiil02 != null) {
/* 48 */                            i0Iiil02.I000o00OoI0I(this.I00ilO0);
                                }
                                synchronized (this.I00li1OI) {
                                    try {
/* 54 */                                IOlOo1ll1l1 iOlOo1ll1l1 = this.I00lli11;
/* 56 */                                if (iOlOo1ll1l1 != null) {
/* 62 */                                    this.I00iOIl.I00iiO.I0000O(iOlOo1ll1l1);
                                        }
                                    } finally {
                                    }
                                }
/* 71 */                        Iterator it = this.I00ilO0.iterator();
/* 79 */                        while (it.hasNext()) {
/* 87 */                            ((Ool10o) it.next()).I0010I0i();
                                }
/* 92 */                        this.I00ll1 = true;
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:89:0x015f, code lost:
                
                    if (r3 != false) goto L90;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:91:0x0165, code lost:
                
                    return I001IIilI0O(r25, true);
                 */
                /* JADX WARN: Removed duplicated region for block: B:186:0x02dd  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIiI0Oo I001IIilI0O(LinkedHashSet linkedHashSet, boolean z) {
                    int i;
                    OlOO1Io010o olOO1Io010o;
                    boolean z2;
                    boolean z3;
                    Ool10o ool10oI000OiO;
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    OlOO1i0ll0 olOO1i0ll0I000iOII;
                    boolean z4;
                    boolean z5;
                    boolean z6;
/* 5 */             I001lllioOl();
                    synchronized (this.I00li1OI) {
                        try {
/* 20 */                    if (!this.I00ioIO.isEmpty()) {
/* 22 */                        Iterator it = linkedHashSet.iterator();
                                while (true) {
/* 30 */                            if (it.hasNext()) {
/* 36 */                                Ool10o ool10o = (Ool10o) it.next();
/* 40 */                                if (ool10o instanceof Ioi1Io1o) {
/* 43 */                                    OolIl0ii1 oolIl0ii1 = ool10o.I000OOo1O;
/* 45 */                                    I1ioiI i1ioiI = Ioi1iI0IiOl.I00ilO0;
/* 51 */                                    if (oolIl0ii1.I000O01llI0(i1ioiI)) {
/* 57 */                                        Integer num = (Integer) oolIl0ii1.I0000O(i1ioiI);
/* 59 */                                        num.getClass();
/* 66 */                                        if (num.intValue() == 1) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    } else {
/* 69 */                                Iterator it2 = linkedHashSet.iterator();
                                        while (true) {
/* 77 */                                    if (!it2.hasNext()) {
/* 117 */                                       z6 = false;
                                                break;
                                            }
/* 83 */                                    Ool10o ool10o2 = (Ool10o) it2.next();
/* 87 */                                    if (ool10o2 instanceof Ioi1Io1o) {
/* 90 */                                        OolIl0ii1 oolIl0ii12 = ool10o2.I000OOo1O;
/* 92 */                                        I1ioiI i1ioiI2 = Ioi1iI0IiOl.I00ilO0;
/* 98 */                                        if (oolIl0ii12.I000O01llI0(i1ioiI2)) {
/* 104 */                                           Integer num2 = (Integer) oolIl0ii12.I0000O(i1ioiI2);
/* 106 */                                           num2.getClass();
/* 113 */                                           if (num2.intValue() == 2) {
/* 115 */                                               z6 = true;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
/* 118 */                               if (!z6) {
                                        }
                                    }
                                }
/* 128 */                       throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                            }
                        } finally {
                        }
                    }
/* 133 */           if (!z) {
/* 135 */               I001lllioOl();
/* 138 */               I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I00oI0i;
/* 146 */               String strI0001Ioi1lo = this.I00iOIl.I00iiI.I00iOIl.I0001Ioi1lo();
/* 154 */               if (((ImageCaptureFailedForSpecificCombinationQuirk) i1I0i0Ilo1Oi.I00iiI) != null) {
/* 158 */                   HashSet hashSet = ImageCaptureFailedForSpecificCombinationQuirk.I00000oIO;
/* 162 */                   String str = Build.BRAND;
/* 168 */                   if ("oneplus".equalsIgnoreCase(str)) {
                            }
                        } else if (((PreviewGreenTintQuirk) i1I0i0Ilo1Oi.I00iiO) != null) {
/* 238 */                   PreviewGreenTintQuirk.I00000oIO.getClass();
/* 249 */                   if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && strI0001Ioi1lo.equals(OIllioIilO.I01OO1I) && linkedHashSet.size() == 2) {
/* 280 */                       if (!linkedHashSet.isEmpty()) {
/* 284 */                           Iterator it3 = linkedHashSet.iterator();
/* 292 */                           while (it3.hasNext()) {
/* 302 */                               if (((Ool10o) it3.next()) instanceof OOIIOiolI) {
/* 304 */                                   z4 = true;
                                            break;
                                        }
                                    }
                                }
/* 282 */                       z4 = false;
/* 309 */                       if (!linkedHashSet.isEmpty()) {
/* 313 */                           Iterator it4 = linkedHashSet.iterator();
/* 321 */                           while (it4.hasNext()) {
/* 327 */                               Ool10o ool10o3 = (Ool10o) it4.next();
/* 337 */                               if (ool10o3.I000OOo1O.I000O01llI0(OolIl0ii1.I00OIl) && ool10o3.I000OOo1O.I0010o() == OolO01iOo0O.I00iio) {
/* 349 */                                   z5 = true;
                                            break;
                                        }
                                    }
                                }
/* 311 */                       z5 = false;
/* 350 */                       if (z4) {
                                }
                            }
                        }
                    }
                    synchronized (this.I00li1OI) {
                        try {
/* 362 */                   HashSet hashSetI001l0I00 = I001l0I00(linkedHashSet, z);
/* 370 */                   if (hashSetI001l0I00.size() < 2) {
/* 372 */                       I001lllioOl();
                            } else {
/* 382 */                       OlOO1Io010o olOO1Io010o2 = this.I00o0iI0io1;
/* 384 */                       if (olOO1Io010o2 == null || !olOO1Io010o2.I0010o.I00iOIl.equals(hashSetI001l0I00)) {
/* 432 */                           int[] iArr = {1, 2, 4};
/* 438 */                           HashSet hashSet2 = new HashSet();
/* 441 */                           Iterator it5 = hashSetI001l0I00.iterator();
/* 449 */                           loop8: while (it5.hasNext()) {
/* 455 */                               Ool10o ool10o4 = (Ool10o) it5.next();
/* 459 */                               for (int i2 = 0; i2 < 3; i2++) {
/* 461 */                                   int i3 = iArr[i2];
/* 467 */                                   Iterator it6 = ool10o4.I000iOII().iterator();
                                            while (true) {
/* 475 */                                       if (!it6.hasNext()) {
/* 493 */                                           z2 = false;
                                                    break;
                                                }
/* 483 */                                       int iIntValue = ((Integer) it6.next()).intValue();
/* 489 */                                       if ((i3 & iIntValue) == iIntValue) {
/* 491 */                                           z2 = true;
                                                    break;
                                                }
                                            }
/* 494 */                                   if (z2) {
/* 504 */                                       if (!hashSet2.contains(Integer.valueOf(i3))) {
/* 513 */                                           hashSet2.add(Integer.valueOf(i3));
                                                }
                                            }
                                        }
                                    }
/* 531 */                           olOO1Io010o = new OlOO1Io010o(this.I00iOIl, this.I00iiI, this.I00o0l1o1o0, this.I00o101lO, hashSetI001l0I00, this.I00iiO);
                                } else {
/* 396 */                           OlOO1Io010o olOO1Io010o3 = this.I00o0iI0io1;
/* 398 */                           olOO1Io010o3.getClass();
/* 411 */                           HashSet hashSet3 = ((Ool10o) hashSetI001l0I00.iterator().next()).I000O01llI0;
/* 422 */                           olOO1Io010o3.I000O01llI0 = hashSet3 != null ? new HashSet(hashSet3) : null;
/* 424 */                           olOO1Io010o = this.I00o0iI0io1;
/* 426 */                           Objects.requireNonNull(olOO1Io010o);
                                }
                            }
/* 376 */                   olOO1Io010o = null;
                            break loop8;
                        } finally {
                        }
                    }
                    synchronized (this.I00li1OI) {
                        try {
/* 541 */                   ArrayList arrayList3 = new ArrayList(linkedHashSet);
/* 544 */                   if (olOO1Io010o != null) {
/* 546 */                       arrayList3.add(olOO1Io010o);
/* 553 */                       arrayList3.removeAll(olOO1Io010o.I0010o.I00iOIl);
                            }
                            synchronized (this.I00li1OI) {
/* 585 */                       z3 = ((Integer) this.I00l0OO0IO.I00000oOI(IIlIi00.I0001Ioi1lo, 0)).intValue() == 1;
                            }
/* 587 */                   if (z3) {
/* 589 */                       Iterator it7 = arrayList3.iterator();
/* 593 */                       boolean z7 = false;
/* 594 */                       boolean z8 = false;
/* 599 */                       while (it7.hasNext()) {
/* 605 */                           Ool10o ool10o5 = (Ool10o) it7.next();
/* 609 */                           if ((ool10o5 instanceof OOIIOiolI) || (ool10o5 instanceof OlOO1Io010o)) {
/* 622 */                               z8 = true;
                                    } else if (ool10o5 instanceof Ioi1Io1o) {
/* 620 */                               z7 = true;
                                    }
                                }
/* 624 */                       if (!z7 || z8) {
/* 665 */                           Iterator it8 = arrayList3.iterator();
/* 669 */                           boolean z9 = false;
/* 670 */                           boolean z10 = false;
/* 675 */                           while (it8.hasNext()) {
/* 681 */                               Ool10o ool10o6 = (Ool10o) it8.next();
/* 685 */                               if ((ool10o6 instanceof OOIIOiolI) || (ool10o6 instanceof OlOO1Io010o)) {
/* 698 */                                   z9 = true;
                                        } else if (ool10o6 instanceof Ioi1Io1o) {
/* 696 */                                   z10 = true;
                                        }
                                    }
/* 700 */                           if (!z9 || z10) {
/* 734 */                               ool10oI000OiO = null;
                                    } else {
/* 704 */                               Ool10o ool10o7 = this.I00lll10;
/* 708 */                               if (!(ool10o7 instanceof Ioi1Io1o)) {
/* 715 */                                   Oi0Oooi oi0Oooi = new Oi0Oooi(12);
/* 726 */                                   ((OI0oiliol10O) oi0Oooi.I00iiI).I0010I0i(OloIIlI1o10.I00IOO, "ImageCapture-Extra");
/* 729 */                                   ool10oI000OiO = oi0Oooi.I000OiO();
                                        }
                                    }
                                } else {
/* 628 */                           Ool10o ool10o8 = this.I00lll10;
/* 632 */                           if (!(ool10o8 instanceof OOIIOiolI)) {
/* 638 */                               IIl0lo1oi iIl0lo1oi = new IIl0lo1oi(1);
/* 647 */                               iIl0lo1oi.I00iiI.I0010I0i(OloIIlI1o10.I00IOO, "Preview-Extra");
/* 650 */                               OOIIOiolI oOIIOiolII00000oOI = iIl0lo1oi.I00000oOI();
/* 661 */                               oOIIOiolII00000oOI.I00IO1oi11O(new I000II(24));
                                        ool10oI000OiO = oOIIOiolII00000oOI;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
/* 738 */           ArrayList arrayList4 = new ArrayList(linkedHashSet);
/* 741 */           if (ool10oI000OiO != null) {
/* 743 */               arrayList4.add(ool10oI000OiO);
                    }
/* 746 */           if (olOO1Io010o != null) {
/* 748 */               arrayList4.add(olOO1Io010o);
/* 755 */               arrayList4.removeAll(olOO1Io010o.I0010o.I00iOIl);
                    }
/* 760 */           ArrayList arrayList5 = new ArrayList(arrayList4);
/* 765 */           arrayList5.removeAll(this.I00ilO0);
/* 770 */           ArrayList arrayList6 = new ArrayList(arrayList4);
/* 775 */           arrayList6.retainAll(this.I00ilO0);
/* 782 */           ArrayList arrayList7 = new ArrayList(this.I00ilO0);
/* 785 */           arrayList7.removeAll(arrayList4);
/* 804 */           HashMap mapI001iOo1i0O = I001iOo1i0O(arrayList5, (OolO0o0O10I) this.I00l0OO0IO.I00000oOI(IIlIi00.I0000oI00, OolO0o0O10I.I00000oIO), this.I00iiO, this.I00l0I0l0lO1);
/* 808 */           List[] listArr = {arrayList5, arrayList6};
/* 814 */           boolean z11 = false;
/* 815 */           for (i = 0; i < 2; i++) {
/* 819 */               Iterator it9 = listArr[i].iterator();
                        while (true) {
/* 827 */                   if (!it9.hasNext()) {
                                break;
                            }
/* 837 */                   if (((Ool10o) it9.next()).I000O01llI0 != null) {
/* 839 */                       z11 = true;
                                break;
                            }
                        }
/* 840 */               if (z11) {
                            break;
                        }
                    }
/* 842 */           boolean z12 = z11;
                    try {
/* 874 */               OlOO1i0ll0 olOO1i0ll0I000iOII2 = this.I00oII.I000iOII(I001i1lo1io(), this.I00iOIl.I00iiI, arrayList5, arrayList6, this.I00l0OO0IO, this.I00l0I0l0lO1, z12);
/* 880 */               if (this.I00iiI != null) {
/* 882 */                   OlOO1i11110 olOO1i11110 = this.I00oII;
/* 884 */                   int iI001i1lo1io = I001i1lo1io();
/* 888 */                   I0Iiil0 i0Iiil0 = this.I00iiI;
/* 890 */                   Objects.requireNonNull(i0Iiil0);
/* 907 */                   olOO1i0ll0I000iOII = olOO1i11110.I000iOII(iI001i1lo1io, i0Iiil0.I00iiI, arrayList5, arrayList6, this.I00l0OO0IO, this.I00l0I0l0lO1, z12);
/* 911 */                   arrayList = arrayList5;
/* 913 */                   arrayList2 = arrayList6;
                        } else {
/* 918 */                   arrayList = arrayList5;
/* 920 */                   arrayList2 = arrayList6;
/* 922 */                   olOO1i0ll0I000iOII = null;
                        }
/* 925 */               IIiI0Oo iIiI0Oo = new IIiI0Oo();
/* 928 */               iIiI0Oo.I00000oIO = linkedHashSet;
/* 930 */               iIiI0Oo.I00000oOI = arrayList4;
/* 932 */               iIiI0Oo.I0000Il00O = arrayList;
/* 934 */               iIiI0Oo.I0000O = arrayList2;
/* 936 */               iIiI0Oo.I0000oI00 = arrayList7;
/* 938 */               iIiI0Oo.I0001Ioi1lo = olOO1Io010o;
/* 940 */               iIiI0Oo.I000II = ool10oI000OiO;
/* 942 */               iIiI0Oo.I000O01llI0 = mapI001iOo1i0O;
/* 944 */               iIiI0Oo.I000OOo1O = olOO1i0ll0I000iOII2;
/* 946 */               iIiI0Oo.I000OiO = olOO1i0ll0I000iOII;
/* 948 */               VarHandle.storeStoreFence();
/* 951 */               return iIiI0Oo;
                    } catch (IllegalArgumentException e) {
/* 952 */               if (!z) {
/* 954 */                   I001lllioOl();
/* 959 */                   if (this.I00iiI == null) {
/* 961 */                       return I001IIilI0O(linkedHashSet, true);
                            }
                        }
/* 966 */               throw e;
                    }
                }

                public final void I001i1O0Ol() {
                    synchronized (this.I00li1OI) {
                        try {
/* 6 */                     if (this.I00ll1) {
/* 17 */                        this.I00iOIl.I000oI1ioi(new ArrayList(this.I00ilO0));
/* 20 */                        I0Iiil0 i0Iiil0 = this.I00iiI;
/* 22 */                        if (i0Iiil0 != null) {
/* 31 */                            i0Iiil0.I000oI1ioi(new ArrayList(this.I00ilO0));
                                }
                                synchronized (this.I00li1OI) {
/* 42 */                            I0IiOl0 i0IiOl0 = this.I00iOIl.I00iiO;
/* 50 */                            this.I00lli11 = i0IiOl0.I00000oOI.I000OiO();
/* 52 */                            i0IiOl0.I000iOII();
                                }
/* 57 */                        this.I00ll1 = false;
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }

                public final int I001i1lo1io() {
                    int i;
                    synchronized (this.I00li1OI) {
                        try {
/* 4 */                     IIlOO01iI iIlOO01iI = this.I00io1l;
                            synchronized (iIlOO01iI.I00000oOI) {
/* 9 */                         i = iIlOO01iI.I0001Ioi1lo;
                            }
                            return i == 2 ? 1 : 0;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public final HashSet I001l0I00(LinkedHashSet linkedHashSet, boolean z) {
                    int i;
/* 3 */             HashSet hashSet = new HashSet();
                    synchronized (this.I00li1OI) {
/* 11 */                Iterator it = this.I00ioIO.iterator();
/* 19 */                if (it.hasNext()) {
/* 91 */                    if (it.next() == null) {
/* 94 */                        throw null;
                            }
/* 100 */                   throw new ClassCastException();
                        }
/* 25 */                i = z ? 3 : 0;
                    }
/* 27 */            Iterator it2 = linkedHashSet.iterator();
/* 35 */            while (it2.hasNext()) {
/* 41 */                Ool10o ool10o = (Ool10o) it2.next();
/* 49 */                lII1OI11o1I.I00000oIO("Only support one level of sharing for now.", !(ool10o instanceof OlOO1Io010o));
/* 56 */                Iterator it3 = ool10o.I000iOII().iterator();
                        while (true) {
/* 64 */                    if (it3.hasNext()) {
/* 72 */                        int iIntValue = ((Integer) it3.next()).intValue();
/* 78 */                        if ((i & iIntValue) == iIntValue) {
/* 80 */                            hashSet.add(ool10o);
                                    break;
                                }
                            }
                        }
                    }
/* 84 */            return hashSet;
                }

                public final List I001lIiIIo1O() {
                    ArrayList arrayList;
                    synchronized (this.I00li1OI) {
/* 8 */                 arrayList = new ArrayList(this.I00ilI0I1);
                    }
/* 12 */            return arrayList;
                }

                public final void I001lllioOl() {
                    synchronized (this.I00li1OI) {
/* 6 */                 this.I00l0OO0IO.I001IIilI0O();
                    }
                }

                public final void I001lloI(ArrayList arrayList) {
                    synchronized (this.I00li1OI) {
/* 4 */                 Iterator it = arrayList.iterator();
/* 12 */                while (it.hasNext()) {
/* 21 */                    ((Ool10o) it.next()).I000O01llI0 = null;
                        }
/* 28 */                LinkedHashSet linkedHashSet = new LinkedHashSet(this.I00ilI0I1);
/* 31 */                linkedHashSet.removeAll(arrayList);
/* 45 */                I000II(I001IIilI0O(linkedHashSet, this.I00iiI != null));
                    }
                }
            }
