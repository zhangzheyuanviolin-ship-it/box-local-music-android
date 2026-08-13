            package p000;

            import java.io.IOException;
            import java.util.Collections;
            import java.util.EnumMap;
            import java.util.Map;
            
            public final class i1Oool extends IOOOI0 {
                public static final Map I0000O;
                public final o10lIo101o I0000Il00O;

                static {
/* 5 */             EnumMap enumMap = new EnumMap(o10lIo101o.class);
/* 15 */            for (o10lIo101o o10lio101o : o10lIo101o.values()) {
/* 21 */                i1Oool[] i1ooolArr = new i1Oool[10];
/* 24 */                for (int i = 0; i < 10; i++) {
/* 33 */                    i1ooolArr[i] = new i1Oool(i, o10lio101o, o10o1Oo.I0000oI00);
                        }
/* 38 */                enumMap.put((EnumMap) o10lio101o, (o10lIo101o) i1ooolArr);
                    }
/* 48 */            I0000O = Collections.unmodifiableMap(enumMap);
                }

                public i1Oool(int i, o10lIo101o o10lio101o, o10o1Oo o10o1oo) {
/* 1 */             super(o10o1oo, i);
/* 6 */             liOOo1l1O.I00000oIO("format char", o10lio101o);
/* 9 */             this.I0000Il00O = o10lio101o;
/* 15 */            if (o10o1oo.I00000oIO()) {
/* 98 */                return;
                    }
/* 17 */            int i2 = o10lio101o.I00iOIl;
/* 28 */            i2 = o10o1oo.I0000Il00O() ? i2 & 65503 : i2;
/* 33 */            StringBuilder sb = new StringBuilder("%");
/* 36 */            o10o1oo.I0000O(sb);
/* 40 */            sb.append((char) i2);
                }

                @Override
                public final void I00O10llo(iOlI10l ioli10l, Object obj) throws IOException {
/* 7 */             ioli10l.I000o00OoI0I(obj, this.I0000Il00O, (o10o1Oo) this.I00000oOI);
                }
            }
