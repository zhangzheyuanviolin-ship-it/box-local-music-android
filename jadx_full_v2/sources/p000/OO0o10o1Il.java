            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class OO0o10o1Il extends I01Io001O {
                public final int I00iOIl;
                public final OO0lo1Ooo I00iiI;

                public OO0o10o1Il(int i, OO0lo1Ooo oO0lo1Ooo) {
/* 1 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = oO0lo1Ooo;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OO0lo1Ooo oO0lo1Ooo = this.I00iiI;
                    switch (i) {
                    }
/* 8 */             return oO0lo1Ooo.I00ilO0;
                }

                @Override
                public final boolean add(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 19 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final void clear() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OO0lo1Ooo oO0lo1Ooo = this.I00iiI;
                    switch (i) {
                        case 0:
/* 12 */                    oO0lo1Ooo.clear();
                            break;
                        default:
/* 8 */                     oO0lo1Ooo.clear();
                            break;
                    }
                }

                @Override
                public final boolean contains(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 15 */                    if (obj instanceof Map.Entry) {
/* 18 */                        Map.Entry entry = (Map.Entry) obj;
/* 20 */                        Object key = entry.getKey();
/* 24 */                        OO0lo1Ooo oO0lo1Ooo = this.I00iiI;
/* 26 */                        Object obj2 = oO0lo1Ooo.get(key);
/* 30 */                        if (obj2 != null) {
/* 36 */                            return obj2.equals(entry.getValue());
                                }
/* 45 */                        if (entry.getValue() == null && oO0lo1Ooo.containsKey(entry.getKey())) {
/* 57 */                            return true;
                                }
                            }
/* 59 */                    return false;
                        default:
/* 8 */                     return this.I00iiI.containsKey(obj);
                    }
                }

                @Override
                public final Iterator iterator() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             OO0lo1Ooo oO0lo1Ooo = this.I00iiI;
/* 7 */             int i2 = 0;
                    switch (i) {
                        case 0:
/* 34 */                    OO0o1ooIIi oO0o1ooIIi = new OO0o1ooIIi(0);
/* 37 */                    OoIiOIo0i010[] ooIiOIo0i010Arr = new OoIiOIo0i010[8];
/* 39 */                    while (i2 < 8) {
/* 43 */                        OoIil1ll1I ooIil1ll1I = new OoIil1ll1I(1);
/* 46 */                        ooIil1ll1I.I00ilI0I1 = oO0o1ooIIi;
/* 48 */                        VarHandle.storeStoreFence();
/* 51 */                        ooIiOIo0i010Arr[i2] = ooIil1ll1I;
/* 53 */                        i2++;
                            }
/* 61 */                    oO0o1ooIIi.I00iiI = new OO0o0oOIIii(oO0lo1Ooo, ooIiOIo0i010Arr);
/* 63 */                    VarHandle.storeStoreFence();
/* 66 */                    return oO0o1ooIIi;
                        default:
/* 14 */                    OoIiOIo0i010[] ooIiOIo0i010Arr2 = new OoIiOIo0i010[8];
/* 16 */                    while (i2 < 8) {
/* 23 */                        ooIiOIo0i010Arr2[i2] = new OoIiio1(1);
/* 25 */                        i2++;
                            }
/* 28 */                    return new OO0oI01(oO0lo1Ooo, ooIiOIo0i010Arr2);
                    }
                }

                @Override
                public final boolean remove(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 22 */                    if (!(obj instanceof Map.Entry)) {
/* 3 */                         return false;
                            }
/* 25 */                    Map.Entry entry = (Map.Entry) obj;
/* 37 */                    return this.I00iiI.remove(entry.getKey(), entry.getValue());
                        default:
/* 7 */                     OO0lo1Ooo oO0lo1Ooo = this.I00iiI;
/* 13 */                    if (!oO0lo1Ooo.containsKey(obj)) {
/* 3 */                         return false;
                            }
/* 15 */                    oO0lo1Ooo.remove(obj);
/* 18 */                    return true;
                    }
                }
            }
