            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class lI0ioliI0l {
                public static final lI0ioliI0l I0000Il00O;
                public lOI1I000IoiI I00000oIO;
                public boolean I00000oOI;

                static {
/* 5 */             lOI1I000IoiI loi1i000ioii = new lOI1I000IoiI();
/* 8 */             lI0ioliI0l li0iolii0l = new lI0ioliI0l();
/* 11 */            li0iolii0l.I00000oIO = loi1i000ioii;
/* 13 */            li0iolii0l.I0000Il00O();
/* 16 */            li0iolii0l.I0000Il00O();
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            I0000Il00O = li0iolii0l;
                }

                public final lI0ioliI0l clone() {
/* 3 */             lI0ioliI0l li0iolii0l = new lI0ioliI0l();
/* 11 */            li0iolii0l.I00000oIO = new lOI1I000IoiI();
/* 13 */            lOI1I000IoiI loi1i000ioii = this.I00000oIO;
/* 18 */            if (loi1i000ioii.I00iiI > 0) {
/* 62 */                loi1i000ioii.I0000Il00O(0).I00iOIl.getClass();
/* 65 */                OIiilo1Ool0o.I00000oIO();
/* 17 */                return null;
                    }
/* 24 */            Iterator it = loi1i000ioii.I00000oIO().iterator();
/* 32 */            if (!it.hasNext()) {
/* 34 */                return li0iolii0l;
                    }
/* 39 */            Map.Entry entry = (Map.Entry) it.next();
/* 45 */            if (entry.getKey() != null) {
/* 47 */                OIiilo1Ool0o.I00000oIO();
/* 17 */                return null;
                    }
/* 51 */            entry.getValue();
/* 54 */            throw null;
                }

                public final Iterator I00000oOI() {
/* 1 */             lOI1I000IoiI loi1i000ioii = this.I00000oIO;
                    return loi1i000ioii.isEmpty() ? Collections.emptyIterator() : ((I1IlioI1o1I) loi1i000ioii.entrySet()).iterator();
                }

                public final void I0000Il00O() {
/* 1 */             lOI1I000IoiI loi1i000ioii = this.I00000oIO;
/* 5 */             if (this.I00000oOI) {
/* 7 */                 return;
                    }
/* 8 */             int i = loi1i000ioii.I00iiI;
/* 12 */            for (int i2 = 0; i2 < i; i2++) {
/* 18 */                Object obj = loi1i000ioii.I0000Il00O(i2).I00iiI;
/* 22 */                if (obj instanceof lIIOO0oi1o) {
/* 24 */                    lIIOO0oi1o liioo0oi1o = (lIIOO0oi1o) obj;
/* 26 */                    liioo0oi1o.getClass();
/* 39 */                    lO1Ilo0lloiO.I0000Il00O.I00000oIO(liioo0oi1o.getClass()).I00000oIO(liioo0oi1o);
/* 42 */                    liioo0oi1o.I0000O();
                        }
                    }
/* 50 */            if (!loi1i000ioii.I00iio) {
/* 54 */                if (loi1i000ioii.I00iiI > 0) {
/* 94 */                    loi1i000ioii.I0000Il00O(0).I00iOIl.getClass();
/* 97 */                    OIiilo1Ool0o.I00000oIO();
/* 100 */                   return;
                        } else {
/* 60 */                    Iterator it = loi1i000ioii.I00000oIO().iterator();
/* 68 */                    if (it.hasNext()) {
/* 81 */                        ((Map.Entry) it.next()).getKey().getClass();
/* 84 */                        OIiilo1Ool0o.I00000oIO();
/* 87 */                        return;
                            }
                        }
                    }
/* 104 */           if (!loi1i000ioii.I00iio) {
/* 123 */               loi1i000ioii.I00iiO = loi1i000ioii.I00iiO.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(loi1i000ioii.I00iiO);
/* 142 */               loi1i000ioii.I00ilO0 = loi1i000ioii.I00ilO0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(loi1i000ioii.I00ilO0);
/* 144 */               loi1i000ioii.I00iio = true;
                    }
/* 146 */           this.I00000oOI = true;
                }

                public final void I0000O() {
/* 1 */             lOI1I000IoiI loi1i000ioii = this.I00000oIO;
/* 5 */             if (loi1i000ioii.I00iiI > 0) {
/* 48 */                loi1i000ioii.I0000Il00O(0).getKey().getClass();
/* 51 */                OIiilo1Ool0o.I00000oIO();
/* 55 */                return;
                    }
/* 11 */            Iterator it = loi1i000ioii.I00000oIO().iterator();
/* 19 */            if (it.hasNext()) {
/* 32 */                ((Map.Entry) it.next()).getKey().getClass();
/* 35 */                OIiilo1Ool0o.I00000oIO();
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof lI0ioliI0l) {
/* 17 */                return this.I00000oIO.equals(((lI0ioliI0l) obj).I00000oIO);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }
