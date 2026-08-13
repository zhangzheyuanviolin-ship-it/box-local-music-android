            package p000;
            
            public final class Oliil11I1iO implements OliiillO {
                public static final OIiilo1Ool0o I00iio = new OIiilo1Ool0o(22);
                public Object I00iOIl;
                public volatile OliiillO I00iiI;
                public Object I00iiO;

                @Override
                public final Object get() {
/* 1 */             OliiillO oliiillO = this.I00iiI;
/* 3 */             OIiilo1Ool0o oIiilo1Ool0o = I00iio;
/* 5 */             if (oliiillO != oIiilo1Ool0o) {
                        synchronized (this.I00iOIl) {
                            try {
/* 12 */                        if (this.I00iiI != oIiilo1Ool0o) {
/* 16 */                            Object obj = this.I00iiI.get();
/* 20 */                            this.I00iiO = obj;
/* 22 */                            this.I00iiI = oIiilo1Ool0o;
/* 25 */                            return obj;
                                }
                            } finally {
                            }
                        }
                    }
/* 32 */            return this.I00iiO;
                }

                public final String toString() {
/* 1 */             Object obj = this.I00iiI;
/* 7 */             StringBuilder sb = new StringBuilder("Suppliers.memoize(");
/* 12 */            if (obj == I00iio) {
/* 31 */                obj = "<supplier that returned " + this.I00iiO + ">";
                    }
/* 35 */            sb.append(obj);
/* 40 */            sb.append(")");
/* 43 */            return sb.toString();
                }
            }
