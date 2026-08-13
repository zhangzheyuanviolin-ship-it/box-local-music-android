            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LO11l1I;", "LOooioIIoi0O;", "<init>", "()V", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class O11l1I extends OooioIIoi0O {
                public final OlO0OIIl1 I00000oOI;
                public final OOli1O I0000Il00O;

                public O11l1I() {
/* 23 */            OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(new O11l0oi0(false, false, new LinkedHashMap(), (OOOIOO1) OOOIOO1.I00l0I0l0lO1.get(0)));
/* 27 */            this.I00000oOI = olO0OIIl1I00000oIO;
/* 33 */            this.I0000Il00O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
                }

                public final void I0000oI00(boolean z) {
                    while (true) {
/* 1 */                 OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 22 */                boolean z2 = z;
/* 31 */                if (olO0OIIl1.I000iOII(value, O11l0oi0.I00000oIO((O11l0oi0) olO0OIIl1.getValue(), z2, false, null, null, 14))) {
/* 33 */                    return;
                        } else {
/* 34 */                    z = z2;
                        }
                    }
                }

                public final void I0001Ioi1lo(boolean z) {
                    while (true) {
/* 1 */                 OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 22 */                boolean z2 = z;
/* 31 */                if (olO0OIIl1.I000iOII(value, O11l0oi0.I00000oIO((O11l0oi0) olO0OIIl1.getValue(), false, z2, null, null, 13))) {
/* 33 */                    return;
                        } else {
/* 34 */                    z = z2;
                        }
                    }
                }

                public final void I000II(O1oIOiI11o0 o1oIOiI11o0, OOOIOO1 oooioo1, String str) {
                    OlO0OIIl1 olO0OIIl1;
                    Object value;
                    O11l0oi0 o11l0oi0;
                    LinkedHashMap linkedHashMap;
/* 1 */             String str2 = o1oIOiI11o0.I00000oIO;
/* 60 */            do {
/* 3 */                 olO0OIIl1 = this.I00000oOI;
/* 5 */                 value = olO0OIIl1.getValue();
/* 10 */                o11l0oi0 = (O11l0oi0) value;
/* 12 */                Map map = o11l0oi0.I0000Il00O;
/* 18 */                Map map2 = (Map) map.get(str2);
/* 30 */                LinkedHashMap linkedHashMap2 = map2 != null ? new LinkedHashMap(map2) : new LinkedHashMap();
/* 35 */                linkedHashMap2.put(oooioo1.I00iOIl, str);
/* 38 */                LinkedHashMap linkedHashMap3 = linkedHashMap2;
/* 41 */                linkedHashMap = new LinkedHashMap(map);
/* 44 */                linkedHashMap.put(str2, linkedHashMap3);
/* 60 */            } while (!olO0OIIl1.I000iOII(value, O11l0oi0.I00000oIO(o11l0oi0, false, false, linkedHashMap, null, 11)));
                }
            }
