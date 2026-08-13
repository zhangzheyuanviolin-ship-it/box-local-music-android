            package p000;

            import java.io.Serializable;
            
            public final class Oliil01 implements OliiillO, Serializable {
                public transient Object I00iOIl;
                public OliiillO I00iiI;
                public volatile transient boolean I00iiO;
                public transient Object I00iio;

                @Override
                public final Object get() {
/* 3 */             if (!this.I00iiO) {
                        synchronized (this.I00iOIl) {
                            try {
/* 10 */                        if (!this.I00iiO) {
/* 14 */                            Object obj = this.I00iiI.get();
/* 18 */                            this.I00iio = obj;
/* 21 */                            this.I00iiO = true;
/* 24 */                            return obj;
                                }
                            } finally {
                            }
                        }
                    }
/* 31 */            return this.I00iio;
                }

                public final String toString() {
                    Object obj;
/* 5 */             StringBuilder sb = new StringBuilder("Suppliers.memoize(");
/* 10 */            if (this.I00iiO) {
/* 29 */                obj = "<supplier that returned " + this.I00iio + ">";
                    } else {
/* 34 */                obj = this.I00iiI;
                    }
/* 36 */            sb.append(obj);
/* 41 */            sb.append(")");
/* 44 */            return sb.toString();
                }
            }
