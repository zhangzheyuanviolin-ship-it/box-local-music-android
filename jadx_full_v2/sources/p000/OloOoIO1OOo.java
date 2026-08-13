            package p000;
            
            public final class OloOoIO1OOo {
                public I1111OO10i I00000oIO;
                public I1111OO10i I00000oOI;
                public boolean I0000Il00O;
                public OI0Oi1llo1i I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OloOoIO1OOo)) {
/* 7 */                 return false;
                    }
/* 11 */            OloOoIO1OOo oloOoIO1OOo = (OloOoIO1OOo) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oloOoIO1OOo.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oloOoIO1OOo.I00000oOI) && this.I0000Il00O == oloOoIO1OOo.I0000Il00O && O0000Ioio00.I0000O(this.I0000O, oloOoIO1OOo.I0000O);
                }

                public final int hashCode() {
/* 20 */            int iI000OOo1O = Oi010OO0.I000OOo1O((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31, 31, this.I0000Il00O);
/* 24 */            OI0Oi1llo1i oI0Oi1llo1i = this.I0000O;
/* 34 */            return iI000OOo1O + (oI0Oi1llo1i == null ? 0 : oI0Oi1llo1i.hashCode());
                }

                public final String toString() {
/* 1 */             I1111OO10i i1111OO10i = this.I00000oIO;
/* 3 */             I1111OO10i i1111OO10i2 = this.I00000oOI;
/* 48 */            return "TextSubstitutionValue(original=" + ((Object) i1111OO10i) + ", substitution=" + ((Object) i1111OO10i2) + ", isShowingSubstitution=" + this.I0000Il00O + ", layoutCache=" + this.I0000O + ")";
                }
            }
