            package p000;
            
            public final class Oo0lioo {
                public String I00000oIO;
                public String I00000oOI;
                public boolean I0000Il00O;
                public OIoiOoo0 I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oo0lioo)) {
/* 7 */                 return false;
                    }
/* 11 */            Oo0lioo oo0lioo = (Oo0lioo) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oo0lioo.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oo0lioo.I00000oOI) && this.I0000Il00O == oo0lioo.I0000Il00O && O0000Ioio00.I0000O(this.I0000O, oo0lioo.I0000O);
                }

                public final int hashCode() {
/* 18 */            int iI000OOo1O = Oi010OO0.I000OOo1O(Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31, this.I0000Il00O);
/* 22 */            OIoiOoo0 oIoiOoo0 = this.I0000O;
/* 32 */            return iI000OOo1O + (oIoiOoo0 == null ? 0 : oIoiOoo0.hashCode());
                }

                public final String toString() {
/* 28 */            return "TextSubstitution(layoutCache=" + this.I0000O + ", isShowingSubstitution=" + this.I0000Il00O + ")";
                }
            }
