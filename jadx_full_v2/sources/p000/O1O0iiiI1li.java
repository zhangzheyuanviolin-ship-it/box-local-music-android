            package p000;
            
            public final class O1O0iiiI1li {
                public O1O00IIOio1l I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public O1O0lOI I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 56 */                return true;
                    }
/* 6 */             if (!(obj instanceof O1O0iiiI1li)) {
/* 54 */                return false;
                    }
/* 9 */             O1O0iiiI1li o1O0iiiI1li = (O1O0iiiI1li) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o1O0iiiI1li.I00000oIO) && Iil1010O.I0000Il00O(this.I00000oOI, o1O0iiiI1li.I00000oOI) && Iil1010O.I0000Il00O(this.I0000Il00O, o1O0iiiI1li.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, o1O0iiiI1li.I0000O);
                }

                public final int hashCode() {
/* 1 */             O1O00IIOio1l o1O00IIOio1l = this.I00000oIO;
/* 23 */            int iI0000O = OooioIOo1.I0000O(OooioIOo1.I0000O((o1O00IIOio1l == null ? 0 : o1O00IIOio1l.hashCode()) * 31, 31, this.I00000oOI), 31, this.I0000Il00O);
/* 27 */            O1O0lOI o1O0lOI = this.I0000O;
/* 36 */            return iI0000O + (o1O0lOI != null ? o1O0lOI.hashCode() : 0);
                }

                public final String toString() {
/* 56 */            return "MTMathViewState(displayList=" + this.I00000oIO + ", calculatedWidth=" + Iil1010O.I0000O(this.I00000oOI) + ", calculatedHeight=" + Iil1010O.I0000O(this.I0000Il00O) + ", parseError=" + this.I0000O + ")";
                }
            }
