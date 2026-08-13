            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class OO0oI10l extends I01OoOi {
                public final int I00iOIl;
                public OO0lO0o I00iiI;

                public OO0oI10l(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final int I00000oOI() {
                    switch (this.I00iOIl) {
                    }
/* 8 */             return this.I00iiI.I00iiI;
                }

                @Override
                public final boolean contains(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 15 */                    if (obj instanceof Map.Entry) {
/* 18 */                        Map.Entry entry = (Map.Entry) obj;
/* 20 */                        OO0lO0o oO0lO0o = this.I00iiI;
/* 26 */                        Object obj2 = oO0lO0o.get(entry.getKey());
/* 30 */                        if (obj2 != null) {
/* 36 */                            return obj2.equals(entry.getValue());
                                }
/* 45 */                        if (entry.getValue() == null && oO0lO0o.containsKey(entry.getKey())) {
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
                    switch (this.I00iOIl) {
                        case 0:
/* 38 */                    OoIi1O0 ooIi1O0 = this.I00iiI.I00iOIl;
/* 40 */                    OoIiOIo0i010[] ooIiOIo0i010Arr = new OoIiOIo0i010[8];
/* 43 */                    for (int i = 0; i < 8; i++) {
/* 50 */                        ooIiOIo0i010Arr[i] = new OoIiiio011l(0);
                            }
/* 55 */                    return new OO0oIl11I01(ooIi1O0, ooIiOIo0i010Arr);
                        default:
/* 13 */                    OoIi1O0 ooIi1O02 = this.I00iiI.I00iOIl;
/* 15 */                    OoIiOIo0i010[] ooIiOIo0i010Arr2 = new OoIiOIo0i010[8];
/* 17 */                    for (int i2 = 0; i2 < 8; i2++) {
/* 25 */                        ooIiOIo0i010Arr2[i2] = new OoIiiio011l(1);
                            }
/* 30 */                    return new OO0oIl11I01(ooIi1O02, ooIiOIo0i010Arr2);
                    }
                }
            }
