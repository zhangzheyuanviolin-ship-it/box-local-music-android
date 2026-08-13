            package p000;
            
            public final class Ol0OII1O11l implements OOiIoli {
                public static final Object I0000Il00O = new Object();
                public volatile Ii10lO01Oi I00000oIO;
                public volatile Object I00000oOI;

                @Override
                public final Object get() {
/* 1 */             Object obj = this.I00000oOI;
/* 5 */             if (obj != I0000Il00O) {
/* 55 */                return obj;
                    }
/* 7 */             Ii10lO01Oi ii10lO01Oi = this.I00000oIO;
/* 9 */             if (ii10lO01Oi == null) {
/* 11 */                return this.I00000oOI;
                    }
/* 14 */            Object obj2 = ii10lO01Oi.get();
/* 18 */            this.I00000oOI = obj2;
/* 21 */            this.I00000oIO = null;
/* 55 */            return obj2;
                }
            }
