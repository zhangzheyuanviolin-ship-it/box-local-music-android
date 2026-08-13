            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class O1Oi10 {
                public static void I00000oIO(Object obj, Object obj2) {
/* 1 */             O1OOlii0 o1OOlii0 = (O1OOlii0) obj;
/* 3 */             if (obj2 != null) {
/* 41 */                OIiilo1Ool0o.I00000oIO();
/* 89 */                return;
                    }
/* 9 */             if (o1OOlii0.isEmpty()) {
/* 26 */                return;
                    }
/* 16 */            Iterator it = o1OOlii0.entrySet().iterator();
/* 24 */            if (it.hasNext()) {
/* 31 */                Map.Entry entry = (Map.Entry) it.next();
/* 33 */                entry.getKey();
/* 36 */                entry.getValue();
/* 40 */                throw null;
                    }
                }

                public static O1OOlii0 I00000oOI(Object obj, Object obj2) {
/* 1 */             O1OOlii0 o1OOlii0I0000Il00O = (O1OOlii0) obj;
/* 3 */             O1OOlii0 o1OOlii0 = (O1OOlii0) obj2;
/* 9 */             if (!o1OOlii0.isEmpty()) {
/* 13 */                if (!o1OOlii0I0000Il00O.I00iOIl) {
/* 15 */                    o1OOlii0I0000Il00O = o1OOlii0I0000Il00O.I0000Il00O();
                        }
/* 19 */                o1OOlii0I0000Il00O.I00000oOI();
/* 26 */                if (!o1OOlii0.isEmpty()) {
/* 28 */                    o1OOlii0I0000Il00O.putAll(o1OOlii0);
                        }
                    }
/* 89 */            return o1OOlii0I0000Il00O;
                }
            }
