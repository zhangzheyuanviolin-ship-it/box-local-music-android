            package p000;
            
            public final class I1OiI110i {
                public I1Oi1Oi0O I00000oIO;
                public I1Oi1Oi0O I00000oOI;
                public I1Oi1Oi0O I0000Il00O;
                public I1Oi1Oi0O I0000O;
                public I1Oi1Oi0O I0000oI00;

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof I1OiI110i)) {
/* 3 */                 return false;
                    }
/* 9 */             I1OiI110i i1OiI110i = (I1OiI110i) obj;
                    return this.I00000oIO == i1OiI110i.I00000oIO && this.I00000oOI == i1OiI110i.I00000oOI && this.I0000Il00O == i1OiI110i.I0000Il00O && this.I0000O == i1OiI110i.I0000O && this.I0000oI00 == i1OiI110i.I0000oI00;
                }

                public final int hashCode() {
/* 6 */             Object obj = this.I00000oOI;
/* 8 */             if (obj == null) {
/* 10 */                obj = obj;
                    }
/* 15 */            int iHashCode = obj.hashCode() * 11;
/* 17 */            Object obj2 = this.I0000oI00;
/* 29 */            return ((obj2 != null ? obj2 : 0).hashCode() * 7) + iHashCode;
                }
            }
