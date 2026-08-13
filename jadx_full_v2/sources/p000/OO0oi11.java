            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class OO0oi11 extends I01OoOi {
                public final int I00iOIl;
                public OO0oi0 I00iiI;

                public OO0oi11(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final int I00000oOI() {
                    switch (this.I00iOIl) {
                    }
/* 10 */            return this.I00iiI.I00iiO.I0000Il00O();
                }

                @Override
                public final boolean contains(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    if (obj instanceof Map.Entry) {
/* 20 */                        Map.Entry entry = (Map.Entry) obj;
/* 22 */                        OO0oi0 oO0oi0 = this.I00iiI;
/* 28 */                        Object obj2 = oO0oi0.get(entry.getKey());
/* 32 */                        if (obj2 != null) {
/* 38 */                            return obj2.equals(entry.getValue());
                                }
/* 47 */                        if (entry.getValue() == null) {
/* 59 */                            if (oO0oi0.I00iiO.containsKey(entry.getKey())) {
/* 61 */                                return true;
                                    }
                                }
                            }
/* 63 */                    return false;
                        default:
/* 10 */                    return this.I00iiI.I00iiO.containsKey(obj);
                    }
                }

                @Override
                public final Iterator iterator() {
                    switch (this.I00iOIl) {
                        case 0:
/* 31 */                    OO0oi0 oO0oi0 = this.I00iiI;
/* 34 */                    OO0oiO oO0oiO = new OO0oiO(0);
/* 46 */                    oO0oiO.I00iiI = new OO0oo0lO(oO0oi0.I00iOIl, oO0oi0.I00iiO);
/* 48 */                    VarHandle.storeStoreFence();
/* 51 */                    return oO0oiO;
                        default:
/* 8 */                     OO0oi0 oO0oi02 = this.I00iiI;
/* 11 */                    OO0oiO oO0oiO2 = new OO0oiO(1);
/* 23 */                    oO0oiO2.I00iiI = new OO0oo0lO(oO0oi02.I00iOIl, oO0oi02.I00iiO);
/* 25 */                    VarHandle.storeStoreFence();
/* 28 */                    return oO0oiO2;
                    }
                }
            }
