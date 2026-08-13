            package p000;

            import java.util.List;
            
            public final class OlO011Oo {
                public final I0OIi10lO0iO I00000oIO;
                public final I0i10OI0o I00000oOI;
                public final I1lilIOI0Il I0000Il00O;
                public final IlOI0loiiI I0000O;
                public final List I0000oI00;
                public final List I0001Ioi1lo;
                public final List I000II;
                public final Boolean I000O01llI0;
                public final Boolean I000OOo1O;
                public final Boolean I000OiO;

                public OlO011Oo(I0OIi10lO0iO i0OIi10lO0iO, I0i10OI0o i0i10OI0o, I1lilIOI0Il i1lilIOI0Il, IlOI0loiiI ilOI0loiiI, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3) {
/* 4 */             this.I00000oIO = i0OIi10lO0iO;
/* 6 */             this.I00000oOI = i0i10OI0o;
/* 8 */             this.I0000Il00O = i1lilIOI0Il;
/* 10 */            this.I0000O = ilOI0loiiI;
/* 12 */            this.I0000oI00 = list;
/* 14 */            this.I0001Ioi1lo = list2;
/* 16 */            this.I000II = list3;
/* 18 */            this.I000O01llI0 = bool;
/* 20 */            this.I000OOo1O = bool2;
/* 22 */            this.I000OiO = bool3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OlO011Oo)) {
/* 7 */                 return false;
                    }
/* 11 */            OlO011Oo olO011Oo = (OlO011Oo) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, olO011Oo.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, olO011Oo.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, olO011Oo.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, olO011Oo.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, olO011Oo.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, olO011Oo.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, olO011Oo.I000II) && O0000Ioio00.I0000O(this.I000O01llI0, olO011Oo.I000O01llI0) && O0000Ioio00.I0000O(this.I000OOo1O, olO011Oo.I000OOo1O) && O0000Ioio00.I0000O(this.I000OiO, olO011Oo.I000OiO);
                }

                public final int hashCode() {
/* 2 */             I0OIi10lO0iO i0OIi10lO0iO = this.I00000oIO;
/* 14 */            int iHashCode = (i0OIi10lO0iO == null ? 0 : Integer.hashCode(i0OIi10lO0iO.I00000oIO)) * 31;
/* 16 */            I0i10OI0o i0i10OI0o = this.I00000oOI;
/* 29 */            int iHashCode2 = (iHashCode + (i0i10OI0o == null ? 0 : Integer.hashCode(i0i10OI0o.I00000oIO))) * 31;
/* 31 */            I1lilIOI0Il i1lilIOI0Il = this.I0000Il00O;
/* 44 */            int iHashCode3 = (iHashCode2 + (i1lilIOI0Il == null ? 0 : Integer.hashCode(i1lilIOI0Il.I00000oIO))) * 31;
/* 46 */            IlOI0loiiI ilOI0loiiI = this.I0000O;
/* 59 */            int iHashCode4 = (iHashCode3 + (ilOI0loiiI == null ? 0 : Integer.hashCode(ilOI0loiiI.I00000oIO))) * 31;
/* 61 */            List list = this.I0000oI00;
/* 72 */            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
/* 74 */            List list2 = this.I0001Ioi1lo;
/* 85 */            int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
/* 87 */            List list3 = this.I000II;
/* 98 */            int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
/* 100 */           Boolean bool = this.I000O01llI0;
/* 111 */           int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
/* 113 */           Boolean bool2 = this.I000OOo1O;
/* 124 */           int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
/* 126 */           Boolean bool3 = this.I000OiO;
/* 135 */           return iHashCode9 + (bool3 != null ? bool3.hashCode() : 0);
                }

                public final String toString() {
/* 108 */           return "State3A(aeMode=" + this.I00000oIO + ", afMode=" + this.I00000oOI + ", awbMode=" + this.I0000Il00O + ", flashMode=" + this.I0000O + ", aeRegions=" + this.I0000oI00 + ", afRegions=" + this.I0001Ioi1lo + ", awbRegions=" + this.I000II + ", aeLock=" + this.I000O01llI0 + ", afLock=" + this.I000OOo1O + ", awbLock=" + this.I000OiO + ')';
                }
            }
