            package p000;

            import java.util.AbstractMap;
            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            
/* 33 */    public class OO0lo1Ooo extends AbstractMap implements Map, O0IloOoIliOO {
                public OO0lili I00iOIl;
                public lOOlOoll I00iiI = new lOOlOoll(13);
                public OoIiIlIo I00iiO;
                public Object I00iio;
                public int I00ilI0I1;
                public int I00ilO0;

                public OO0lo1Ooo(OO0lili oO0lili) {
/* 4 */             this.I00iOIl = oO0lili;
/* 17 */            this.I00iiO = oO0lili.I00iOIl;
/* 21 */            this.I00ilO0 = oO0lili.I00iiI;
                }

                public OO0lili I00000oOI() {
/* 1 */             OoIiIlIo ooIiIlIo = this.I00iiO;
/* 3 */             OO0lili oO0lili = this.I00iOIl;
/* 7 */             if (ooIiIlIo != oO0lili.I00iOIl) {
/* 17 */                this.I00iiI = new lOOlOoll(13);
/* 25 */                oO0lili = new OO0lili(this.I00iiO, this.I00ilO0);
                    }
/* 28 */            this.I00iOIl = oO0lili;
/* 55 */            return oO0lili;
                }

                public OO0lili I00000oOI() {
/* 1 */             return I00000oOI();
                }

                public final void I0000Il00O(int i) {
/* 1 */             this.I00ilO0 = i;
                    this.I00ilI0I1++;
                }

                @Override
                public final void clear() {
/* 3 */             this.I00iiO = OoIiIlIo.I0000oI00;
/* 6 */             I0000Il00O(0);
                }

                @Override
                public boolean containsKey(Object obj) {
/* 12 */            return this.I00iiO.I0000O(obj, obj != null ? obj.hashCode() : 0, 0);
                }

                @Override
                public final Set entrySet() {
/* 4 */             return new OO0o10o1Il(0, this);
                }

                @Override
                public Object get(Object obj) {
/* 12 */            return this.I00iiO.I000II(obj, obj != null ? obj.hashCode() : 0, 0);
                }

                @Override
                public final Set keySet() {
/* 4 */             return new OO0o10o1Il(1, this);
                }

                @Override
                public final Object put(Object obj, Object obj2) {
/* 2 */             this.I00iio = null;
/* 24 */            this.I00iiO = this.I00iiO.I000l1(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
/* 26 */            return this.I00iio;
                }

                @Override
                public final void putAll(Map map) {
/* 3 */             OO0lili oO0liliI00000oOI = null;
/* 10 */            OO0lili oO0lili = map instanceof OO0lili ? (OO0lili) map : null;
/* 11 */            if (oO0lili == null) {
/* 21 */                OO0lo1Ooo oO0lo1Ooo = map instanceof OO0lo1Ooo ? (OO0lo1Ooo) map : null;
/* 22 */                if (oO0lo1Ooo != null) {
/* 24 */                    oO0liliI00000oOI = oO0lo1Ooo.I00000oOI();
                        }
                    } else {
/* 29 */                oO0liliI00000oOI = oO0lili;
                    }
/* 30 */            if (oO0liliI00000oOI == null) {
/* 64 */                super.putAll(map);
/* 77 */                return;
                    }
/* 34 */            IiIoo10 iiIoo10 = new IiIoo10();
/* 38 */            iiIoo10.I00000oIO = 0;
/* 40 */            int i = this.I00ilO0;
/* 50 */            this.I00iiO = this.I00iiO.I000lI(oO0liliI00000oOI.I00iOIl, 0, iiIoo10, this);
/* 57 */            int i2 = (oO0liliI00000oOI.I00iiI + i) - iiIoo10.I00000oIO;
/* 58 */            if (i != i2) {
/* 60 */                I0000Il00O(i2);
                    }
                }

                @Override
                public final boolean remove(Object obj, Object obj2) {
/* 1 */             int i = this.I00ilO0;
/* 18 */            OoIiIlIo ooIiIlIoI000oI1ioi = this.I00iiO.I000oI1ioi(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
/* 22 */            if (ooIiIlIoI000oI1ioi == null) {
/* 24 */                ooIiIlIoI000oI1ioi = OoIiIlIo.I0000oI00;
                    }
/* 26 */            this.I00iiO = ooIiIlIoI000oI1ioi;
                    return i != this.I00ilO0;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00ilO0;
                }

                @Override
                public final Collection values() {
/* 4 */             return new IO0ioo1i0oo(this, 2);
                }

                @Override
/* 34 */        public Object remove(Object obj) {
/* 35 */            this.I00iio = null;
/* 36 */            OoIiIlIo ooIiIlIoI000o00OoI0I = this.I00iiO.I000o00OoI0I(obj != null ? obj.hashCode() : 0, obj, 0, this);
                    if (ooIiIlIoI000o00OoI0I == null) {
                        ooIiIlIoI000o00OoI0I = OoIiIlIo.I0000oI00;
                    }
                    this.I00iiO = ooIiIlIoI000o00OoI0I;
/* 37 */            return this.I00iio;
                }
            }
