            package p000;
            
            public final class Oiil0Ol1 {
                public final Io11Oll I00000oIO;
                public final long I00000oOI;
                public final OiiioO1O1i1l I0000Il00O;
                public final boolean I0000O;

                public Oiil0Ol1(Io11Oll io11Oll, long j, OiiioO1O1i1l oiiioO1O1i1l, boolean z) {
/* 4 */             this.I00000oIO = io11Oll;
/* 6 */             this.I00000oOI = j;
/* 8 */             this.I0000Il00O = oiiioO1O1i1l;
/* 10 */            this.I0000O = z;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 44 */                return true;
                    }
/* 6 */             if (!(obj instanceof Oiil0Ol1)) {
/* 42 */                return false;
                    }
/* 9 */             Oiil0Ol1 oiil0Ol1 = (Oiil0Ol1) obj;
                    return this.I00000oIO == oiil0Ol1.I00000oIO && OIOlIiiioi.I0000O(this.I00000oOI, oiil0Ol1.I00000oOI) && this.I0000Il00O == oiil0Ol1.I0000Il00O && this.I0000O == oiil0Ol1.I0000O;
                }

                public final int hashCode() {
/* 30 */            return Boolean.hashCode(this.I0000O) + ((this.I0000Il00O.hashCode() + IIlIOloOOO.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31)) * 31);
                }

                public final String toString() {
/* 52 */            return "SelectionHandleInfo(handle=" + this.I00000oIO + ", position=" + OIOlIiiioi.I000OOo1O(this.I00000oOI) + ", anchor=" + this.I0000Il00O + ", visible=" + this.I0000O + ")";
                }
            }
