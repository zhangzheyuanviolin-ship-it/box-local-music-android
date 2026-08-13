            package p000;

            import java.util.Map;
            
            public final class IO0iioo1 implements Map.Entry, O0IloIo {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public O0IlIoi I00iio;

                public IO0iioo1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public boolean equals(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 13 */                    if (obj instanceof Map.Entry) {
/* 20 */                        Map.Entry entry = (Map.Entry) obj;
/* 30 */                        if (((String) this.I00iiO).equals(entry.getKey()) && this.I00iiI.equals(entry.getValue())) {
/* 44 */                            return true;
                                }
                            }
/* 46 */                    return false;
                        default:
/* 6 */                     return super.equals(obj);
                    }
                }

                @Override
                public final Object getKey() {
                    switch (this.I00iOIl) {
                        case 0:
/* 11 */                    return (String) this.I00iiO;
                        default:
/* 6 */                     return this.I00iiI;
                    }
                }

                @Override
                public final Object getValue() {
                    switch (this.I00iOIl) {
                        case 0:
/* 9 */                     return this.I00iiI;
                        default:
/* 6 */                     return this.I00iiO;
                    }
                }

                @Override
                public int hashCode() {
                    switch (this.I00iOIl) {
                        case 0:
/* 25 */                    return this.I00iiI.hashCode() ^ ((String) this.I00iiO).hashCode();
                        default:
/* 6 */                     return super.hashCode();
                    }
                }

                @Override
                public final Object setValue(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 37 */                    Object obj2 = this.I00iiI;
/* 39 */                    this.I00iiI = obj;
/* 43 */                    IO0l0Il0lO0 iO0l0Il0lO0 = (IO0l0Il0lO0) this.I00iio;
/* 49 */                    int iI00000oIO = iO0l0Il0lO0.I00000oIO((String) this.I00iiO);
/* 53 */                    if (iI00000oIO >= 0) {
/* 57 */                        iO0l0Il0lO0.I00iiI[iI00000oIO] = obj;
                            }
/* 59 */                    return obj2;
                        default:
/* 8 */                     OlO1010i1l olO1010i1l = (OlO1010i1l) this.I00iio;
/* 10 */                    Ol1o1llOII ol1o1llOII = olO1010i1l.I00iOIl;
/* 20 */                    if (ol1o1llOII.I0000Il00O().I0000O != olO1010i1l.I00iiO) {
/* 32 */                        I000II.I001IIilI0O();
/* 35 */                        return null;
                            }
/* 22 */                    Object obj3 = this.I00iiO;
/* 26 */                    ol1o1llOII.put(this.I00iiI, obj);
/* 29 */                    this.I00iiO = obj;
/* 36 */                    return obj3;
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 30 */                    return ((String) this.I00iiO) + '=' + this.I00iiI;
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
