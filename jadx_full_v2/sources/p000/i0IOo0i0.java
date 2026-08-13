            package p000;
            
            public final class i0IOo0i0 implements i0Ii0I1ll {
                public static final Object I00iiO = new Object();
                public volatile i0Ii0I1ll I00iOIl;
                public volatile Object I00iiI = I00iiO;

                public i0IOo0i0(i0Ii0I1ll i0ii0i1ll) {
/* 8 */             this.I00iOIl = i0ii0i1ll;
                }

                public static i0IOo0i0 I00000oIO(i0Ii0I1ll i0ii0i1ll) {
                    return i0ii0i1ll instanceof i0IOo0i0 ? (i0IOo0i0) i0ii0i1ll : new i0IOo0i0(i0ii0i1ll);
                }

                @Override
                public final Object I0000Il00O() {
/* 1 */             Object obj = this.I00iiI;
/* 3 */             Object obj2 = I00iiO;
/* 5 */             if (obj != obj2) {
/* 113 */               return obj;
                    }
                    synchronized (this) {
                        try {
/* 10 */                    Object obj3 = this.I00iiI;
/* 12 */                    if (obj3 != obj2) {
/* 68 */                        return obj3;
                            }
/* 16 */                    Object objI0000Il00O = this.I00iOIl.I0000Il00O();
/* 20 */                    Object obj4 = this.I00iiI;
/* 22 */                    if (obj4 != obj2 && obj4 != objI0000Il00O) {
/* 57 */                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objI0000Il00O + ". This is likely due to a circular dependency.");
                            }
/* 60 */                    this.I00iiI = objI0000Il00O;
/* 63 */                    this.I00iOIl = null;
/* 66 */                    return objI0000Il00O;
                        } catch (Throwable th) {
/* 70 */                    throw th;
                        }
                    }
                }
            }
