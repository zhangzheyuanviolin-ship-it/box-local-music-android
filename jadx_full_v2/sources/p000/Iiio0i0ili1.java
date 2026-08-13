            package p000;
            
            public final class Iiio0i0ili1 implements OOiO01IO {
                public static final Object I0000Il00O = new Object();
                public volatile OOiO01IO I00000oIO;
                public volatile Object I00000oOI;

                public static OOiO01IO I00000oIO(OOiO01IO oOiO01IO) {
/* 3 */             if (oOiO01IO instanceof Iiio0i0ili1) {
/* 5 */                 return oOiO01IO;
                    }
/* 8 */             Iiio0i0ili1 iiio0i0ili1 = new Iiio0i0ili1();
/* 13 */            iiio0i0ili1.I00000oOI = I0000Il00O;
/* 15 */            iiio0i0ili1.I00000oIO = oOiO01IO;
/* 29 */            return iiio0i0ili1;
                }

                @Override
                public final Object get() {
                    Object obj;
/* 1 */             Object obj2 = this.I00000oOI;
/* 3 */             Object obj3 = I0000Il00O;
/* 5 */             if (obj2 != obj3) {
/* 110 */               return obj2;
                    }
                    synchronized (this) {
                        try {
/* 8 */                     obj = this.I00000oOI;
/* 10 */                    if (obj == obj3) {
/* 14 */                        obj = this.I00000oIO.get();
/* 18 */                        Object obj4 = this.I00000oOI;
/* 20 */                        if (obj4 != obj3 && obj4 != obj) {
/* 57 */                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                                }
/* 58 */                        this.I00000oOI = obj;
/* 61 */                        this.I00000oIO = null;
                            }
                        } catch (Throwable th) {
/* 69 */                    throw th;
                        }
                    }
/* 67 */            return obj;
                }
            }
