            package p000;
            
            public final class Iiio0Ii implements OOiIoli {
                public static final Object I0000Il00O = new Object();
                public volatile OOiIoli I00000oIO;
                public volatile Object I00000oOI;

                public static OOiIoli I00000oIO(OOiIoli oOiIoli) {
/* 3 */             if (oOiIoli instanceof Iiio0Ii) {
/* 5 */                 return oOiIoli;
                    }
/* 8 */             Iiio0Ii iiio0Ii = new Iiio0Ii();
/* 13 */            iiio0Ii.I00000oOI = I0000Il00O;
/* 15 */            iiio0Ii.I00000oIO = oOiIoli;
/* 29 */            return iiio0Ii;
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
/* 8 */                 obj = this.I00000oOI;
/* 10 */                if (obj == obj3) {
/* 14 */                    obj = this.I00000oIO.get();
/* 18 */                    Object obj4 = this.I00000oOI;
/* 20 */                    if (obj4 != obj3 && obj4 != obj) {
/* 57 */                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                            }
/* 58 */                    this.I00000oOI = obj;
/* 61 */                    this.I00000oIO = null;
                        }
                    }
/* 67 */            return obj;
                }
            }
