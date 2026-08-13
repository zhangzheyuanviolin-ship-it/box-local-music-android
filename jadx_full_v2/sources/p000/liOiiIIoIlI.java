            package p000;
            
            public abstract class liOiiIIoIlI {
                public static final i1lIOIOlI I00000oIO(Object obj, Object obj2) {
/* 1 */             i1lIOIOlI i1lioioli = (i1lIOIOlI) obj;
/* 3 */             i1lIOIOlI i1lioioli2 = (i1lIOIOlI) obj2;
/* 9 */             if (!i1lioioli2.isEmpty()) {
/* 13 */                if (!i1lioioli.I00iOIl) {
/* 19 */                    if (i1lioioli.isEmpty()) {
/* 23 */                        i1lioioli = new i1lIOIOlI();
                            } else {
/* 29 */                        i1lIOIOlI i1lioioli3 = new i1lIOIOlI(i1lioioli);
/* 33 */                        i1lioioli3.I00iOIl = true;
/* 35 */                        i1lioioli = i1lioioli3;
                            }
                        }
/* 36 */                i1lioioli.I00000oIO();
/* 43 */                if (!i1lioioli2.isEmpty()) {
/* 45 */                    i1lioioli.putAll(i1lioioli2);
                        }
                    }
/* 106 */           return i1lioioli;
                }
            }
