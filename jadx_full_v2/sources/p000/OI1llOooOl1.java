            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            
/* 11 */    public final class OI1llOooOl1 {
                public final Object I00000oIO;
                public final Object I00000oOI;
                public final Map I0000Il00O;
                public final IOii1l I0000O;

                public OI1llOooOl1(Object obj, Object obj2, Map map, IOii1l iOii1l) {
/* 4 */             this.I00000oIO = obj;
/* 6 */             this.I00000oOI = obj2;
/* 8 */             this.I0000Il00O = map;
/* 10 */            this.I0000O = iOii1l;
                }

                public final void I00000oIO(int i, IloI0lOlll1 iloI0lOlll1) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(295512821);
/* 10 */            if ((i & 6) == 0) {
/* 21 */                i2 = (iloI0lOlll1.I000II(this) ? 4 : 2) | i;
                    } else {
/* 23 */                i2 = i;
                    }
/* 38 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 48 */                this.I0000O.invoke(this.I00000oIO, iloI0lOlll1, 0);
                    } else {
/* 52 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 55 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 59 */            if (oOloioIlI001IO000 != null) {
/* 64 */                I0o0iI i0o0iI = new I0o0iI(5);
/* 67 */                i0o0iI.I00iiO = this;
/* 69 */                i0o0iI.I00iiI = i;
/* 71 */                VarHandle.storeStoreFence();
/* 74 */                oOloioIlI001IO000.I0000O = i0o0iI;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 53 */                return true;
                    }
/* 4 */             if (obj == null || OI1llOooOl1.class != obj.getClass()) {
/* 55 */                return false;
                    }
/* 15 */            OI1llOooOl1 oI1llOooOl1 = (OI1llOooOl1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oI1llOooOl1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oI1llOooOl1.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oI1llOooOl1.I0000Il00O) && this.I0000O == oI1llOooOl1.I0000O;
                }

                public final int hashCode() {
/* 35 */            return (this.I0000O.hashCode() * 31) + (this.I0000Il00O.hashCode() * 31) + (this.I00000oOI.hashCode() * 31) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 48 */            return "NavEntry(key=" + this.I00000oIO + ", contentKey=" + this.I00000oOI + ", metadata=" + this.I0000Il00O + ", content=" + this.I0000O + ')';
                }

/* 12 */        public OI1llOooOl1(OI1llOooOl1 oI1llOooOl1, IOii1l iOii1l) {
/* 13 */            this(oI1llOooOl1.I00000oIO, oI1llOooOl1.I00000oOI, oI1llOooOl1.I0000Il00O, iOii1l);
                }
            }
