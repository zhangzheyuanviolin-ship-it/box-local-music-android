            package p000;
            
            public abstract class liOiOli {
                public static final i1lIOII I00000oIO(Object obj, Object obj2) {
/* 1 */             i1lIOII i1lioii = (i1lIOII) obj;
/* 3 */             i1lIOII i1lioii2 = (i1lIOII) obj2;
/* 9 */             if (!i1lioii2.isEmpty()) {
/* 13 */                if (!i1lioii.I00iOIl) {
/* 19 */                    if (i1lioii.isEmpty()) {
/* 23 */                        i1lioii = new i1lIOII();
                            } else {
/* 29 */                        i1lIOII i1lioii3 = new i1lIOII(i1lioii);
/* 33 */                        i1lioii3.I00iOIl = true;
/* 35 */                        i1lioii = i1lioii3;
                            }
                        }
/* 36 */                i1lioii.I00000oIO();
/* 43 */                if (!i1lioii2.isEmpty()) {
/* 45 */                    i1lioii.putAll(i1lioii2);
                        }
                    }
/* 106 */           return i1lioii;
                }
            }
