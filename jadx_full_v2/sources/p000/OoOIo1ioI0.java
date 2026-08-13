            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public final class OoOIo1ioI0 {
                public final LinkedHashMap I00000oIO;

                public OoOIo1ioI0(LinkedHashMap linkedHashMap) {
/* 4 */             this.I00000oIO = linkedHashMap;
                }

                public final OoOIo1ioI0 I00000oIO() {
/* 3 */             LinkedHashMap linkedHashMap = this.I00000oIO;
/* 13 */            LinkedHashMap linkedHashMap2 = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(linkedHashMap.size()));
/* 30 */            for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 38 */                Object key = entry.getKey();
/* 46 */                O00olOO0 o00olOO0 = (O00olOO0) entry.getValue();
/* 60 */                linkedHashMap2.put(key, new O00olOO0(o00olOO0.I00000oIO, o00olOO0.I00000oOI, o00olOO0.I0000Il00O, true));
                    }
/* 66 */            return new OoOIo1ioI0(linkedHashMap2);
                }
            }
