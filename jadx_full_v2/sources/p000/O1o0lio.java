            package p000;

            import java.util.List;
            
            public final class O1o0lio {
                public final boolean I00000oIO;
                public final boolean I00000oOI;
                public final String I0000Il00O;
                public final String I0000O;
                public final List I0000oI00;
                public final boolean I0001Ioi1lo;

                public O1o0lio(boolean z, boolean z2, String str, String str2, List list, boolean z3) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = z2;
/* 8 */             this.I0000Il00O = str;
/* 10 */            this.I0000O = str2;
/* 12 */            this.I0000oI00 = list;
/* 14 */            this.I0001Ioi1lo = z3;
                }

                public static O1o0lio I00000oIO(O1o0lio o1o0lio, boolean z, boolean z2, String str, String str2, List list, boolean z3, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 z = o1o0lio.I00000oIO;
                    }
/* 7 */             boolean z4 = z;
/* 10 */            if ((i & 2) != 0) {
/* 12 */                z2 = o1o0lio.I00000oOI;
                    }
/* 14 */            boolean z5 = z2;
/* 17 */            if ((i & 4) != 0) {
/* 19 */                str = o1o0lio.I0000Il00O;
                    }
/* 21 */            String str3 = str;
/* 24 */            if ((i & 8) != 0) {
/* 26 */                str2 = o1o0lio.I0000O;
                    }
/* 28 */            String str4 = str2;
/* 31 */            if ((i & 16) != 0) {
/* 33 */                list = o1o0lio.I0000oI00;
                    }
/* 35 */            List list2 = list;
/* 38 */            if ((i & 32) != 0) {
/* 40 */                z3 = o1o0lio.I0001Ioi1lo;
                    }
/* 43 */            o1o0lio.getClass();
/* 48 */            return new O1o0lio(z4, z5, str3, str4, list2, z3);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 66 */                return true;
                    }
/* 6 */             if (!(obj instanceof O1o0lio)) {
/* 64 */                return false;
                    }
/* 9 */             O1o0lio o1o0lio = (O1o0lio) obj;
                    return this.I00000oIO == o1o0lio.I00000oIO && this.I00000oOI == o1o0lio.I00000oOI && this.I0000Il00O.equals(o1o0lio.I0000Il00O) && this.I0000O.equals(o1o0lio.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, o1o0lio.I0000oI00) && this.I0001Ioi1lo == o1o0lio.I0001Ioi1lo;
                }

                public final int hashCode() {
/* 40 */            return Boolean.hashCode(this.I0001Ioi1lo) + IIl001iO0Io.I0000oI00(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000OOo1O(Boolean.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31, this.I0000O), 31, this.I0000oI00);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("MobileActionsUiState(showWelcomeMessage=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", processing=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", userPrompt=");
/* 36 */            IIl001iO0Io.I001lIiIIo1O(sb, this.I0000Il00O, ", modelResponse=", this.I0000O, ", functionCallDetails=");
/* 41 */            sb.append(this.I0000oI00);
/* 46 */            sb.append(", noFunctionRecognized=");
/* 51 */            sb.append(this.I0001Ioi1lo);
/* 56 */            sb.append(")");
/* 59 */            return sb.toString();
                }
            }
