            package p000;

            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.GenAiException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Objects;
            
            public final class o0oi0ioiO {
                public i1IoO0OlII I00000oIO;
                public List I00000oOI;
                public LinkedHashMap I0000Il00O;

                /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
                
                    if (r11 != r1) goto L18;
                 */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0096 -> B:32:0x00b5). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ae -> B:31:0x00af). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object I00000oIO(o0oi0ioiO o0oi0ioio, IOoil1iiIilo iOoil1iiIilo) {
                    o0o01Oooo o0o01oooo;
                    Iterator it;
                    Collection collection;
                    o0oi0ioiO o0oi0ioio2;
                    int i;
/* 3 */             if (iOoil1iiIilo instanceof o0o01Oooo) {
/* 6 */                 o0o01oooo = (o0o01Oooo) iOoil1iiIilo;
/* 8 */                 int i2 = o0o01oooo.I00io1l;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    o0o01oooo.I00io1l = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o0o01oooo = new o0o01Oooo(o0oi0ioio, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object objI00IOO = o0o01oooo.I00ilI0I1;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = o0o01oooo.I00io1l;
/* 34 */            if (i3 == 0) {
/* 72 */                lIoii1l01l0i.I00000oOI(objI00IOO);
/* 75 */                i1IoO0OlII i1ioo0olii = o0oi0ioio.I00000oIO;
/* 77 */                o0o01oooo.I00ioIO = o0oi0ioio;
/* 79 */                o0o01oooo.I00io1l = 1;
/* 81 */                objI00IOO = iOil1lO10l.I00IOO(i1ioo0olii, o0o01oooo);
                    } else if (i3 == 1) {
/* 66 */                o0oi0ioio = o0o01oooo.I00ioIO;
/* 68 */                lIoii1l01l0i.I00000oOI(objI00IOO);
                    } else {
/* 38 */                if (i3 != 2) {
/* 61 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 64 */                    return null;
                        }
/* 40 */                i = o0o01oooo.I00iio;
/* 42 */                collection = o0o01oooo.I00iiO;
/* 46 */                it = o0o01oooo.I00iiI;
/* 48 */                Collection collection2 = o0o01oooo.I00iOIl;
/* 52 */                o0oi0ioio2 = o0o01oooo.I00ioIO;
/* 54 */                lIoii1l01l0i.I00000oOI(objI00IOO);
/* 178 */               int iIntValue = ((Number) objI00IOO).intValue();
/* 187 */               collection.add(new Integer(iIntValue));
/* 190 */               collection = collection2;
/* 129 */               if (!it.hasNext()) {
/* 135 */                   iOil1lO10l ioil1lo10l = (iOil1lO10l) it.next();
/* 149 */                   if (!O0000Ioio00.I0000O(o0oi0ioio2.I0000Il00O.get(ioil1lo10l), Boolean.TRUE)) {
/* 154 */                       o0o01oooo.I00ioIO = o0oi0ioio2;
/* 157 */                       Collection collection3 = collection;
/* 159 */                       o0o01oooo.I00iOIl = collection3;
/* 161 */                       o0o01oooo.I00iiI = it;
/* 163 */                       o0o01oooo.I00iiO = collection3;
/* 165 */                       o0o01oooo.I00iio = i;
/* 167 */                       o0o01oooo.I00io1l = 2;
/* 169 */                       objI00IOO = ioil1lo10l.I00OIl(o0o01oooo);
/* 173 */                       if (objI00IOO != ii0111o) {
/* 175 */                           collection2 = collection;
/* 178 */                           int iIntValue2 = ((Number) objI00IOO).intValue();
/* 187 */                           collection.add(new Integer(iIntValue2));
/* 190 */                           collection = collection2;
/* 129 */                           if (!it.hasNext()) {
                                    }
                                }
/* 332 */                       return ii0111o;
                            }
/* 151 */                   collection2 = collection;
/* 152 */                   iIntValue2 = 0;
/* 187 */                   collection.add(new Integer(iIntValue2));
/* 190 */                   collection = collection2;
/* 129 */                   if (!it.hasNext()) {
/* 192 */                       List list = (List) collection;
/* 194 */                       if (i != 1) {
/* 196 */                           List list2 = list;
/* 198 */                           boolean z = list2 instanceof Collection;
/* 200 */                           if (!z || !list2.isEmpty()) {
/* 212 */                               Iterator it2 = list2.iterator();
/* 220 */                               while (it2.hasNext()) {
/* 232 */                                   if (((Number) it2.next()).intValue() == 1) {
                                            }
                                        }
                                    }
/* 235 */                           if (i != 2) {
/* 237 */                               if (!z || !list2.isEmpty()) {
/* 249 */                                   Iterator it3 = list2.iterator();
/* 257 */                                   while (it3.hasNext()) {
/* 269 */                                       if (((Number) it3.next()).intValue() == 2) {
                                                }
                                            }
                                        }
/* 275 */                               return new Integer(3);
                                    }
/* 281 */                           return new Integer(2);
                                }
/* 287 */                       return new Integer(1);
                            }
                        }
                    }
/* 89 */            int iIntValue3 = ((Number) objI00IOO).intValue();
/* 93 */            if (iIntValue3 == 0) {
/* 97 */                return new Integer(0);
                    }
/* 101 */           List list3 = o0oi0ioio.I00000oOI;
/* 113 */           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list3, 10));
/* 116 */           it = list3.iterator();
/* 122 */           collection = arrayList;
/* 123 */           o0oi0ioio2 = o0oi0ioio;
/* 124 */           i = iIntValue3;
/* 129 */           if (!it.hasNext()) {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r3v0, types: [OoiIlOl1iI, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(iOil1lO10l ioil1lo10l, DownloadCallback downloadCallback, boolean z, IOi10loi iOi10loi, IllOOo00lI illOOo00lI, IOoilo iOoilo) throws Throwable {
                    o0oO1lo o0oo1lo;
/* 3 */             if (iOoilo instanceof o0oO1lo) {
/* 6 */                 o0oo1lo = (o0oO1lo) iOoilo;
/* 8 */                 int i = o0oo1lo.I00io1l;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o0oo1lo.I00io1l = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o0oo1lo = new o0oO1lo(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = o0oo1lo.I00ilI0I1;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o0oo1lo.I00io1l;
/* 31 */            ?? r3 = OoiIlOl1iI.I00000oIO;
                    try {
/* 34 */                if (i2 == 0) {
/* 59 */                    lIoii1l01l0i.I00000oOI(obj);
/* 64 */                    o0oOOOIlO o0ooooilo = new o0oOOOIlO();
/* 67 */                    o0ooooilo.I00000oIO = z;
/* 69 */                    o0ooooilo.I00000oOI = downloadCallback;
/* 71 */                    o0ooooilo.I0000Il00O = iOi10loi;
/* 73 */                    o0ooooilo.I0000O = this;
/* 75 */                    o0ooooilo.I0000oI00 = ioil1lo10l;
/* 77 */                    o0ooooilo.I0001Ioi1lo = illOOo00lI;
/* 79 */                    VarHandle.storeStoreFence();
/* 82 */                    o0oo1lo.I00iOIl = ioil1lo10l;
/* 84 */                    o0oo1lo.I00iiI = downloadCallback;
/* 86 */                    o0oo1lo.I00iiO = iOi10loi;
/* 88 */                    o0oo1lo.I00iio = illOOo00lI;
/* 90 */                    o0oo1lo.I00io1l = 1;
/* 92 */                    ioil1lo10l.getClass();
/* 95 */                    ListenableFuture listenableFutureI00000oIO = ioil1lo10l.I00000oIO();
/* 102 */                   iOiOl0Oi0 ioiol0oi0 = new iOiOl0Oi0(0);
/* 105 */                   ioiol0oi0.I00000oOI = ioil1lo10l;
/* 107 */                   ioiol0oi0.I0000Il00O = o0ooooilo;
/* 109 */                   VarHandle.storeStoreFence();
/* 126 */                   ?? I00000oIO = l10o1ollO.I00000oIO(ioil1lo10l.I0000Il00O(ll0li01oO0li.I0000Il00O(listenableFutureI00000oIO, ioiol0oi0, ioil1lo10l.I00iOIl.I00iOIl), Iioi0lilII.I00l0OO0IO), o0oo1lo);
                            this = I00000oIO;
/* 130 */                   if (I00000oIO != ii0111o) {
/* 133 */                       this = r3;
                            }
/* 134 */                   if (this == ii0111o) {
/* 136 */                       return ii0111o;
                            }
                        } else {
/* 36 */                    if (i2 != 1) {
/* 54 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 57 */                        return null;
                            }
/* 38 */                    illOOo00lI = o0oo1lo.I00iio;
/* 40 */                    iOi10loi = o0oo1lo.I00iiO;
/* 42 */                    downloadCallback = o0oo1lo.I00iiI;
/* 44 */                    ioil1lo10l = o0oo1lo.I00iOIl;
/* 46 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
                    } catch (GenAiException e) {
/* 137 */               this.I0000Il00O(ioil1lo10l, e, downloadCallback);
/* 140 */               if (iOi10loi != null) {
/* 142 */                   iOi10loi.I00iIO(e);
                        }
/* 145 */               illOOo00lI.invoke();
                    }
/* 685 */           return r3;
                }

                public final void I0000Il00O(iOil1lO10l ioil1lo10l, GenAiException genAiException, DownloadCallback downloadCallback) {
/* 5 */             this.I0000Il00O.put(ioil1lo10l, Boolean.TRUE);
/* 20 */            new StringBuilder(String.valueOf(ioil1lo10l).length() + 28);
/* 23 */            Objects.toString(ioil1lo10l);
/* 38 */            Log.w("DownloadManager", "Failed to download feature: ".concat(String.valueOf(ioil1lo10l)), genAiException);
/* 47 */            if (O0000Ioio00.I0000O(ioil1lo10l, this.I00000oIO)) {
/* 49 */                downloadCallback.onDownloadFailed(genAiException);
                    }
                }
            }
