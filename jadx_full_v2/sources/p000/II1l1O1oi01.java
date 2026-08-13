            package p000;
            
            public final class II1l1O1oi01 {
                public final I1O1ioi1ll0O I00000oIO;
                public final boolean I00000oOI;
                public final String I0000Il00O;
                public final String I0000O;
                public final boolean I0000oI00;

                public II1l1O1oi01(I1O1ioi1ll0O i1O1ioi1ll0O, boolean z, String str, String str2, boolean z2) {
/* 4 */             this.I00000oIO = i1O1ioi1ll0O;
/* 6 */             this.I00000oOI = z;
/* 8 */             this.I0000Il00O = str;
/* 10 */            this.I0000O = str2;
/* 12 */            this.I0000oI00 = z2;
                }

                public static II1l1O1oi01 I00000oIO(II1l1O1oi01 iI1l1O1oi01, I1O1ioi1ll0O i1O1ioi1ll0O, boolean z, String str, String str2, boolean z2, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 i1O1ioi1ll0O = iI1l1O1oi01.I00000oIO;
                    }
/* 7 */             I1O1ioi1ll0O i1O1ioi1ll0O2 = i1O1ioi1ll0O;
/* 10 */            if ((i & 2) != 0) {
/* 12 */                z = iI1l1O1oi01.I00000oOI;
                    }
/* 14 */            boolean z3 = z;
/* 17 */            if ((i & 4) != 0) {
/* 19 */                str = iI1l1O1oi01.I0000Il00O;
                    }
/* 21 */            String str3 = str;
/* 24 */            if ((i & 8) != 0) {
/* 26 */                str2 = iI1l1O1oi01.I0000O;
                    }
/* 28 */            String str4 = str2;
/* 31 */            if ((i & 16) != 0) {
/* 33 */                z2 = iI1l1O1oi01.I0000oI00;
                    }
/* 36 */            iI1l1O1oi01.getClass();
/* 41 */            return new II1l1O1oi01(i1O1ioi1ll0O2, z3, str3, str4, z2);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 55 */                return true;
                    }
/* 6 */             if (!(obj instanceof II1l1O1oi01)) {
/* 53 */                return false;
                    }
/* 9 */             II1l1O1oi01 iI1l1O1oi01 = (II1l1O1oi01) obj;
                    return this.I00000oIO == iI1l1O1oi01.I00000oIO && this.I00000oOI == iI1l1O1oi01.I00000oOI && this.I0000Il00O.equals(iI1l1O1oi01.I0000Il00O) && this.I0000O.equals(iI1l1O1oi01.I0000O) && this.I0000oI00 == iI1l1O1oi01.I0000oI00;
                }

                public final int hashCode() {
/* 34 */            return Boolean.hashCode(this.I0000oI00) + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000OOo1O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31, this.I0000O);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("BoxAssistUiState(mode=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", enginesReady=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", status=");
/* 36 */            IIl001iO0Io.I001lIiIIo1O(sb, this.I0000Il00O, ", lastAnnouncement=", this.I0000O, ", busy=");
/* 43 */            return IIlIOloOOO.I0010o(sb, this.I0000oI00, ")");
                }
            }
