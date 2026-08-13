            package p000;

            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            
            public final class Ol1o1llOII implements OlO11I0O1l, Map, O0IloOoIliOO {
                public Ol1o0ioII01 I00iOIl;
                public final Ol1lII I00iiI;
                public final Ol1lII I00iiO;
                public final Ol1lII I00iio;

                public Ol1o1llOII() {
/* 4 */             OO0lili oO0lili = OO0lili.I00iiO;
/* 6 */             Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 16 */            Ol1o0ioII01 ol1o0ioII01 = new Ol1o0ioII01(ol1il1o1I000O01llI0.I000II(), oO0lili);
/* 21 */            if (!(ol1il1o1I000O01llI0 instanceof Io0O010)) {
/* 30 */                ol1o0ioII01.I00000oOI = new Ol1o0ioII01(1L, oO0lili);
                    }
/* 32 */            this.I00iOIl = ol1o0ioII01;
/* 40 */            this.I00iiI = new Ol1lII(this, 0);
/* 48 */            this.I00iiO = new Ol1lII(this, 1);
/* 56 */            this.I00iio = new Ol1lII(this, 2);
                }

                public static boolean I00000oIO(Ol1o0ioII01 ol1o0ioII01, int i, OO0lili oO0lili) {
                    boolean z;
                    synchronized (iO100OlI00o.I00000oIO) {
/* 4 */                 int i2 = ol1o0ioII01.I0000O;
/* 6 */                 if (i2 == i) {
/* 8 */                     ol1o0ioII01.I0000Il00O = oO0lili;
/* 10 */                    z = true;
/* 12 */                    ol1o0ioII01.I0000O = i2 + 1;
                        } else {
/* 17 */                    z = false;
                        }
                    }
/* 19 */            return z;
                }

                @Override
                public final OlO1Ol0il0i I00000oOI() {
/* 1 */             return this.I00iOIl;
                }

                public final Ol1o0ioII01 I0000Il00O() {
/* 7 */             return (Ol1o0ioII01) Ol1l1lI1Ili.I0010o(this.I00iOIl, this);
                }

                @Override
                public final void I000OOo1O(OlO1Ol0il0i olO1Ol0il0i) {
/* 3 */             this.I00iOIl = (Ol1o0ioII01) olO1Ol0il0i;
                }

                @Override
                public final void clear() {
                    Ol1il1o1 ol1il1o1I000O01llI0;
/* 9 */             OO0lili oO0lili = ((Ol1o0ioII01) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl)).I0000Il00O;
/* 11 */            OO0lili oO0lili2 = OO0lili.I00iiO;
/* 13 */            if (oO0lili2 != oO0lili) {
/* 15 */                Ol1o0ioII01 ol1o0ioII01 = this.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 20 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 28 */                    Ol1o0ioII01 ol1o0ioII012 = (Ol1o0ioII01) Ol1l1lI1Ili.I001i1O0Ol(ol1o0ioII01, this, ol1il1o1I000O01llI0);
                            synchronized (iO100OlI00o.I00000oIO) {
/* 33 */                        ol1o0ioII012.I0000Il00O = oO0lili2;
                                ol1o0ioII012.I0000O++;
                            }
                        }
/* 43 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
                    }
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 7 */             return I0000Il00O().I0000Il00O.containsKey(obj);
                }

                @Override
                public final boolean containsValue(Object obj) {
/* 7 */             return I0000Il00O().I0000Il00O.containsValue(obj);
                }

                @Override
                public final Set entrySet() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final Object get(Object obj) {
/* 7 */             return I0000Il00O().I0000Il00O.get(obj);
                }

                @Override
                public final boolean isEmpty() {
/* 9 */             return I0000Il00O().I0000Il00O.isEmpty();
                }

                @Override
                public final Set keySet() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final Object put(Object obj, Object obj2) {
                    OO0lili oO0lili;
                    int i;
                    Object objPut;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
/* 58 */            do {
                        synchronized (iO100OlI00o.I00000oIO) {
/* 10 */                    Ol1o0ioII01 ol1o0ioII01 = (Ol1o0ioII01) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl);
/* 12 */                    oO0lili = ol1o0ioII01.I0000Il00O;
/* 14 */                    i = ol1o0ioII01.I0000O;
                        }
/* 17 */                OO0lo1Ooo oO0lo1OooI000O01llI0 = oO0lili.I000O01llI0();
/* 21 */                objPut = oO0lo1OooI000O01llI0.put(obj, obj2);
/* 25 */                OO0lili oO0liliI00000oOI = oO0lo1OooI000O01llI0.I00000oOI();
/* 33 */                if (O0000Ioio00.I0000O(oO0liliI00000oOI, oO0lili)) {
                            break;
                        }
/* 35 */                Ol1o0ioII01 ol1o0ioII012 = this.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 40 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 50 */                    zI00000oIO = I00000oIO((Ol1o0ioII01) Ol1l1lI1Ili.I001i1O0Ol(ol1o0ioII012, this, ol1il1o1I000O01llI0), i, oO0liliI00000oOI);
                        }
/* 55 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
/* 58 */            } while (!zI00000oIO);
/* 64 */            return objPut;
                }

                @Override
                public final void putAll(Map map) {
                    OO0lili oO0lili;
                    int i;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
/* 57 */            do {
                        synchronized (iO100OlI00o.I00000oIO) {
/* 10 */                    Ol1o0ioII01 ol1o0ioII01 = (Ol1o0ioII01) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl);
/* 12 */                    oO0lili = ol1o0ioII01.I0000Il00O;
/* 14 */                    i = ol1o0ioII01.I0000O;
                        }
/* 17 */                OO0lo1Ooo oO0lo1OooI000O01llI0 = oO0lili.I000O01llI0();
/* 21 */                oO0lo1OooI000O01llI0.putAll(map);
/* 24 */                OO0lili oO0liliI00000oOI = oO0lo1OooI000O01llI0.I00000oOI();
/* 32 */                if (O0000Ioio00.I0000O(oO0liliI00000oOI, oO0lili)) {
/* 63 */                    return;
                        }
/* 34 */                Ol1o0ioII01 ol1o0ioII012 = this.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 39 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 49 */                    zI00000oIO = I00000oIO((Ol1o0ioII01) Ol1l1lI1Ili.I001i1O0Ol(ol1o0ioII012, this, ol1il1o1I000O01llI0), i, oO0liliI00000oOI);
                        }
/* 54 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
/* 57 */            } while (!zI00000oIO);
                }

                @Override
                public final Object remove(Object obj) {
                    OO0lili oO0lili;
                    int i;
                    V vRemove;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
/* 58 */            do {
                        synchronized (iO100OlI00o.I00000oIO) {
/* 10 */                    Ol1o0ioII01 ol1o0ioII01 = (Ol1o0ioII01) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl);
/* 12 */                    oO0lili = ol1o0ioII01.I0000Il00O;
/* 14 */                    i = ol1o0ioII01.I0000O;
                        }
/* 17 */                OO0lo1Ooo oO0lo1OooI000O01llI0 = oO0lili.I000O01llI0();
/* 21 */                vRemove = oO0lo1OooI000O01llI0.remove(obj);
/* 25 */                OO0lili oO0liliI00000oOI = oO0lo1OooI000O01llI0.I00000oOI();
/* 33 */                if (O0000Ioio00.I0000O(oO0liliI00000oOI, oO0lili)) {
                            break;
                        }
/* 35 */                Ol1o0ioII01 ol1o0ioII012 = this.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 40 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 50 */                    zI00000oIO = I00000oIO((Ol1o0ioII01) Ol1l1lI1Ili.I001i1O0Ol(ol1o0ioII012, this, ol1il1o1I000O01llI0), i, oO0liliI00000oOI);
                        }
/* 55 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
/* 58 */            } while (!zI00000oIO);
/* 64 */            return vRemove;
                }

                @Override
                public final int size() {
/* 9 */             return I0000Il00O().I0000Il00O.I0000Il00O();
                }

                public final String toString() {
/* 33 */            return "SnapshotStateMap(value=" + ((Ol1o0ioII01) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl)).I0000Il00O + ")@" + hashCode();
                }

                @Override
                public final Collection values() {
/* 1 */             return this.I00iio;
                }
            }
