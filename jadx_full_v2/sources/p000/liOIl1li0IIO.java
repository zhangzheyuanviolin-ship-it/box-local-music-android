            package p000;
            
            public abstract class liOIl1li0IIO {
                public static final i11l1l0IiI I00000oIO(Object obj, Object obj2) {
/* 1 */             i11l1l0IiI i11l1l0iii = (i11l1l0IiI) obj;
/* 3 */             i11l1l0IiI i11l1l0iii2 = (i11l1l0IiI) obj2;
/* 9 */             if (!i11l1l0iii2.isEmpty()) {
/* 13 */                if (!i11l1l0iii.I00iOIl) {
/* 19 */                    if (i11l1l0iii.isEmpty()) {
/* 23 */                        i11l1l0iii = new i11l1l0IiI();
                            } else {
/* 29 */                        i11l1l0IiI i11l1l0iii3 = new i11l1l0IiI(i11l1l0iii);
/* 33 */                        i11l1l0iii3.I00iOIl = true;
/* 35 */                        i11l1l0iii = i11l1l0iii3;
                            }
                        }
/* 36 */                i11l1l0iii.I00000oIO();
/* 43 */                if (!i11l1l0iii2.isEmpty()) {
/* 45 */                    i11l1l0iii.putAll(i11l1l0iii2);
                        }
                    }
/* 106 */           return i11l1l0iii;
                }
            }
