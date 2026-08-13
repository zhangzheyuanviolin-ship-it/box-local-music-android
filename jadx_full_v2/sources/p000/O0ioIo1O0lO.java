            package p000;
            
            public final class O0ioIo1O0lO implements OOiO0Il {
                public static final Object I0000Il00O = new Object();
                public volatile Object I00000oIO = I0000Il00O;
                public volatile OOiO0Il I00000oOI;

                public O0ioIo1O0lO(OOiO0Il oOiO0Il) {
/* 8 */             this.I00000oOI = oOiO0Il;
                }

                @Override
                public final Object get() {
                    Object obj;
/* 1 */             Object obj2 = this.I00000oIO;
/* 3 */             Object obj3 = I0000Il00O;
/* 5 */             if (obj2 != obj3) {
/* 113 */               return obj2;
                    }
                    synchronized (this) {
                        try {
/* 8 */                     obj = this.I00000oIO;
/* 10 */                    if (obj == obj3) {
/* 14 */                        obj = this.I00000oOI.get();
/* 18 */                        this.I00000oIO = obj;
/* 21 */                        this.I00000oOI = null;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 27 */            return obj;
                }
            }
