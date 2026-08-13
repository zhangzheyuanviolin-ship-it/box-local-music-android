            package p000;

            import java.io.IOException;
            import java.util.Collections;
            import java.util.EnumMap;
            import java.util.Map;
            
            public final class ilO1liIO extends IOOOI0 {
                public static final Map I0000O;
                public final iOliO0I I0000Il00O;

                static {
/* 5 */             EnumMap enumMap = new EnumMap(iOliO0I.class);
/* 15 */            for (iOliO0I iolio0i : iOliO0I.values()) {
/* 21 */                ilO1liIO[] ilo1liioArr = new ilO1liIO[10];
/* 24 */                for (int i = 0; i < 10; i++) {
/* 33 */                    ilo1liioArr[i] = new ilO1liIO(i, iolio0i, iOloO1.I0000oI00);
                        }
/* 38 */                enumMap.put((EnumMap) iolio0i, (iOliO0I) ilo1liioArr);
                    }
/* 48 */            I0000O = Collections.unmodifiableMap(enumMap);
                }

                public ilO1liIO(int i, iOliO0I iolio0i, iOloO1 ioloo1) {
/* 1 */             super(ioloo1, i);
/* 6 */             lio00OOillO.I00000oIO("format char", iolio0i);
/* 9 */             this.I0000Il00O = iolio0i;
/* 15 */            if (ioloo1.I00000oOI()) {
/* 98 */                return;
                    }
/* 17 */            int i2 = iolio0i.I00iOIl;
/* 28 */            i2 = ioloo1.I0000Il00O() ? i2 & 65503 : i2;
/* 33 */            StringBuilder sb = new StringBuilder("%");
/* 36 */            ioloo1.I00000oIO(sb);
/* 40 */            sb.append((char) i2);
                }

                @Override
                public final void I00O0o1oo(iOlI10l ioli10l, Object obj) throws IOException {
/* 7 */             ioli10l.I000oI1ioi(obj, this.I0000Il00O, (iOloO1) this.I00000oOI);
                }
            }
