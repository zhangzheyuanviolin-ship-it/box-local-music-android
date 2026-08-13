            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            
/* 39 */    public final class OoI1iOioli {
                public final IlI1o11l0 I00000oIO;
                public final Ol0oo1IioO I00000oOI;
                public final IO100o1 I0000Il00O;
                public final OiO0oIloO1oI I0000O;
                public final boolean I0000oI00;
                public final Map I0001Ioi1lo;

                public OoI1iOioli(IlI1o11l0 ilI1o11l0, Ol0oo1IioO ol0oo1IioO, IO100o1 iO100o1, OiO0oIloO1oI oiO0oIloO1oI, LinkedHashMap linkedHashMap, int i) {
/* 37 */            this((i & 1) != 0 ? null : ilI1o11l0, (i & 2) != 0 ? null : ol0oo1IioO, (i & 4) != 0 ? null : iO100o1, (i & 8) != 0 ? null : oiO0oIloO1oI, (i & 32) == 0, (i & 64) != 0 ? Il011I1OiO0I.I00iOIl : linkedHashMap);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OoI1iOioli)) {
/* 7 */                 return false;
                    }
/* 11 */            OoI1iOioli ooI1iOioli = (OoI1iOioli) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ooI1iOioli.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ooI1iOioli.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, ooI1iOioli.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, ooI1iOioli.I0000O) && this.I0000oI00 == ooI1iOioli.I0000oI00 && O0000Ioio00.I0000O(this.I0001Ioi1lo, ooI1iOioli.I0001Ioi1lo);
                }

                public final int hashCode() {
/* 2 */             IlI1o11l0 ilI1o11l0 = this.I00000oIO;
/* 14 */            int iHashCode = (ilI1o11l0 == null ? 0 : ilI1o11l0.hashCode()) * 31;
/* 15 */            Ol0oo1IioO ol0oo1IioO = this.I00000oOI;
/* 26 */            int iHashCode2 = (iHashCode + (ol0oo1IioO == null ? 0 : ol0oo1IioO.hashCode())) * 31;
/* 27 */            IO100o1 iO100o1 = this.I0000Il00O;
/* 38 */            int iHashCode3 = (iHashCode2 + (iO100o1 == null ? 0 : iO100o1.hashCode())) * 31;
/* 39 */            OiO0oIloO1oI oiO0oIloO1oI = this.I0000O;
/* 63 */            return this.I0001Ioi1lo.hashCode() + Oi010OO0.I000OOo1O((iHashCode3 + (oiO0oIloO1oI != null ? oiO0oIloO1oI.hashCode() : 0)) * 961, 31, this.I0000oI00);
                }

                public final String toString() {
/* 68 */            return "TransitionData(fade=" + this.I00000oIO + ", slide=" + this.I00000oOI + ", changeSize=" + this.I0000Il00O + ", scale=" + this.I0000O + ", veil=null, hold=" + this.I0000oI00 + ", effectsMap=" + this.I0001Ioi1lo + ")";
                }

/* 40 */        public OoI1iOioli(IlI1o11l0 ilI1o11l0, Ol0oo1IioO ol0oo1IioO, IO100o1 iO100o1, OiO0oIloO1oI oiO0oIloO1oI, boolean z, Map map) {
/* 42 */            this.I00000oIO = ilI1o11l0;
/* 43 */            this.I00000oOI = ol0oo1IioO;
/* 44 */            this.I0000Il00O = iO100o1;
/* 45 */            this.I0000O = oiO0oIloO1oI;
/* 46 */            this.I0000oI00 = z;
/* 47 */            this.I0001Ioi1lo = map;
                }
            }
