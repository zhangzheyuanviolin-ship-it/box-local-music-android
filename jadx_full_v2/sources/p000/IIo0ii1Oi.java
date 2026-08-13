            package p000;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            public final class IIo0ii1Oi implements IoolOI {
                public Object I00000oIO;
                public LinkedHashMap I00000oOI;
                public HashSet I0000Il00O;
                public IIiOiI0il I0000O;
                public IIiOOI I0000oI00;
                public IIlOoolol0ll I0001Ioi1lo;

                @Override
                public final void I00000oIO(List list) {
                    HashSet hashSet;
/* 3 */             HashMap map = new HashMap();
                    synchronized (this.I00000oIO) {
/* 11 */                hashSet = new HashSet(list);
/* 20 */                hashSet.removeAll(this.I00000oOI.keySet());
                    }
                    try {
/* 24 */                Iterator it = hashSet.iterator();
/* 32 */                while (it.hasNext()) {
/* 38 */                    String str = (String) it.next();
/* 46 */                    map.put(str, this.I0001Ioi1lo.I000OiO(str));
                        }
                        synchronized (this.I00000oIO) {
                            try {
/* 61 */                        HashSet hashSet2 = new HashSet(this.I00000oOI.keySet());
/* 64 */                        hashSet2.removeAll(list);
/* 69 */                        ArrayList arrayList = new ArrayList();
/* 72 */                        Iterator it2 = hashSet2.iterator();
/* 80 */                        while (it2.hasNext()) {
/* 96 */                            arrayList.add((IIllOo0) this.I00000oOI.get((String) it2.next()));
                                }
/* 104 */                       LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 109 */                       Iterator it3 = ((ArrayList) list).iterator();
/* 117 */                       while (it3.hasNext()) {
/* 123 */                           String str2 = (String) it3.next();
/* 131 */                           if (this.I00000oOI.containsKey(str2)) {
/* 141 */                               linkedHashMap.put(str2, (IIllOo0) this.I00000oOI.get(str2));
                                    } else {
/* 151 */                               linkedHashMap.put(str2, (IIllOo0) map.get(str2));
                                    }
                                }
/* 157 */                       this.I00000oOI.clear();
/* 162 */                       this.I00000oOI.putAll(linkedHashMap);
/* 165 */                       Iterator it4 = arrayList.iterator();
/* 173 */                       while (it4.hasNext()) {
/* 179 */                           IIllOo0 iIllOo0 = (IIllOo0) it4.next();
/* 181 */                           if (iIllOo0 != null) {
/* 183 */                               iIllOo0.I00100l0();
                                    }
                                }
                            } catch (Throwable th) {
/* 190 */                       throw th;
                            }
                        }
                    } catch (IIoII01 e) {
/* 199 */               throw new IIoIIIiillO("Failed to create CameraInternal", e);
                    }
                }

                public final IIllOo0 I00000oOI(String str) {
                    IIllOo0 iIllOo0;
                    synchronized (this.I00000oIO) {
                        try {
/* 12 */                    iIllOo0 = (IIllOo0) this.I00000oOI.get(str);
/* 14 */                    if (iIllOo0 == null) {
/* 37 */                        throw new IllegalArgumentException("Invalid camera: " + str);
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 17 */            return iIllOo0;
                }

                public final LinkedHashSet I0000Il00O() {
                    LinkedHashSet linkedHashSet;
                    synchronized (this.I00000oIO) {
/* 12 */                linkedHashSet = new LinkedHashSet(this.I00000oOI.values());
                    }
/* 16 */            return linkedHashSet;
                }

                public final void I0000O(IIlOoolol0ll iIlOoolol0ll) {
/* 1 */             this.I0001Ioi1lo = iIlOoolol0ll;
                    synchronized (this.I00000oIO) {
                        try {
/* 18 */                    for (String str : iIlOoolol0ll.I000OOo1O()) {
/* 29 */                        l11I11lO.I0000O(3, "CameraRepository");
/* 42 */                        IIllOo0 iIllOo0 = (IIllOo0) this.I00000oOI.put(str, iIlOoolol0ll.I000OiO(str));
/* 44 */                        if (iIllOo0 != null) {
/* 46 */                            iIllOo0.I00000oIO();
                                }
                            }
                        } catch (IIoII01 e) {
/* 61 */                    throw new IolIoOoi11(e);
                        }
                    }
                }
            }
