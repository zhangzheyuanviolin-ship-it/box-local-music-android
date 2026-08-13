            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class OO0oII00 extends I01OoOi implements Ioio0iiil1 {
                public final int I00iOIl;
                public OO0lili I00iiI;

                public OO0oII00(int i) {
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
/* 20 */                        OO0lili oO0lili = this.I00iiI;
/* 26 */                        Object obj2 = oO0lili.get(entry.getKey());
/* 30 */                        if (obj2 != null) {
/* 36 */                            return obj2.equals(entry.getValue());
                                }
/* 45 */                        if (entry.getValue() == null && oO0lili.containsKey(entry.getKey())) {
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
/* 38 */                    OoIiIlIo ooIiIlIo = this.I00iiI.I00iOIl;
/* 40 */                    OoIiOIo0i010[] ooIiOIo0i010Arr = new OoIiOIo0i010[8];
/* 43 */                    for (int i = 0; i < 8; i++) {
/* 50 */                        ooIiOIo0i010Arr[i] = new OoIiio1(0);
                            }
/* 55 */                    return new OO0oIolO(ooIiIlIo, ooIiOIo0i010Arr);
                        default:
/* 13 */                    OoIiIlIo ooIiIlIo2 = this.I00iiI.I00iOIl;
/* 15 */                    OoIiOIo0i010[] ooIiOIo0i010Arr2 = new OoIiOIo0i010[8];
/* 17 */                    for (int i2 = 0; i2 < 8; i2++) {
/* 25 */                        ooIiOIo0i010Arr2[i2] = new OoIiio1(1);
                            }
/* 30 */                    return new OO0oIolO(ooIiIlIo2, ooIiOIo0i010Arr2);
                    }
                }
            }
