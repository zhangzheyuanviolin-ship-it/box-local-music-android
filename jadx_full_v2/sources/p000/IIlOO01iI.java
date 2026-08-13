            package p000;

            import android.util.Log;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            
            public final class IIlOO01iI implements IoolOI {
                public IIlOlol0liO I00000oIO;
                public Object I00000oOI;
                public IIo0ii1Oi I0000Il00O;
                public Il01100l I0000O;
                public ArrayList I0000oI00;
                public int I0001Ioi1lo;
                public boolean I000II;

                @Override
                public final void I00000oIO(List list) throws IIoIIIiillO {
/* 3 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 8 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
                    try {
/* 13 */                Set<Set> setI00000oOI = IIlOlol0liO.I00000oOI(this.I00000oIO);
/* 17 */                if (setI00000oOI == null) {
/* 19 */                    setI00000oOI = Il01llIol0.I00iOIl;
                        }
/* 29 */                for (Set set : setI00000oOI) {
/* 38 */                    Set set2 = set;
/* 48 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(set2, 10));
/* 51 */                    Iterator it = set2.iterator();
/* 59 */                    while (it.hasNext()) {
/* 69 */                        arrayList.add(((IIllI0o) it.next()).I00000oIO);
                            }
/* 73 */                    Set setI00iio = IOOi0Ool1i.I00iio(arrayList);
/* 85 */                    if (list.containsAll(setI00iio)) {
/* 129 */                       List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(set);
/* 138 */                       if (listI00iIi0i1o.size() >= 2) {
/* 147 */                           String str = ((IIllI0o) listI00iIi0i1o.get(0)).I00000oIO;
/* 156 */                           String str2 = ((IIllI0o) listI00iIi0i1o.get(1)).I00000oIO;
                                    try {
/* 164 */                               if (iOilO1Ii.I00000oIO(str, this.I00000oIO) && iOilO1Ii.I00000oIO(str2, this.I00000oIO)) {
/* 174 */                                   linkedHashSet.add(set);
/* 181 */                                   if (!linkedHashMap.containsKey(str)) {
/* 188 */                                       linkedHashMap.put(str, new ArrayList());
                                            }
/* 200 */                                   ((List) linkedHashMap.get(str)).add(str2);
/* 207 */                                   if (!linkedHashMap.containsKey(str2)) {
/* 214 */                                       linkedHashMap.put(str2, new ArrayList());
                                            }
/* 223 */                                   ((List) linkedHashMap.get(str2)).add(str);
                                        }
                                    } catch (IolIoOoi11 e) {
/* 234 */                               if (l11I11lO.I0000O(5, "CXCP")) {
/* 267 */                                   Log.w("CXCP", "Skipping incompatible concurrent pair: " + set + " due to " + e.getMessage());
                                        }
                                    }
                                }
                            } else if (l11I11lO.I0000O(5, "CXCP")) {
/* 122 */                       Log.w("CXCP", "Failed to retrieve concurrent camera: " + setI00iio + " from " + list);
                            }
                        }
                        synchronized (this.I00000oOI) {
                        }
                    } catch (Exception e2) {
/* 437 */               throw new IIoIIIiillO("Failed to retrieve concurrent camera id info for camera-pipe.", e2);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [Il01100l] */
                /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v0, types: [IIlOO01iI] */
                public final void I00000oOI(IIo0ii1Oi iIo0ii1Oi) throws IIoIIIiillO {
                    ?? arrayList;
                    synchronized (this.I00000oOI) {
/* 4 */                 this.I0000Il00O = iIo0ii1Oi;
                    }
/* 9 */             ArrayList arrayListI00000oIO = IIlOlol0liO.I00000oIO(this.I00000oIO);
/* 13 */            if (arrayListI00000oIO != null) {
/* 23 */                arrayList = new ArrayList(IOOi1I.I0000O(arrayListI00000oIO, 10));
/* 26 */                Iterator it = arrayListI00000oIO.iterator();
/* 34 */                while (it.hasNext()) {
/* 44 */                    arrayList.add(((IIllI0o) it.next()).I00000oIO);
                        }
                    } else {
/* 48 */                arrayList = Il01100l.I00iOIl;
                    }
/* 50 */            I00000oIO(arrayList);
                }
            }
