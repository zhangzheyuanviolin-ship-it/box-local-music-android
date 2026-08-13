            package p000;
            
            public final class O0O0o1io {
                public static final O0O0o1io I0000Il00O = new O0O0o1io(null, null);
                public final O0O10O I00000oIO;
                public final O0O01O0o I00000oOI;

                public O0O0o1io(O0O10O o0o10o, O0O01O0o o0O01O0o) {
                    String str;
/* 4 */             this.I00000oIO = o0o10o;
/* 6 */             this.I00000oOI = o0O01O0o;
/* 18 */            if ((o0o10o == null) == (o0O01O0o == null)) {
/* 20 */                return;
                    }
/* 21 */            if (o0o10o == null) {
/* 23 */                str = "Star projection must have no type specified.";
                    } else {
/* 41 */                str = "The projection variance " + o0o10o + " requires type to be specified.";
                    }
/* 45 */            I000II.I0010I0i(str);
/* 89 */            throw null;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O0O0o1io)) {
/* 7 */                 return false;
                    }
/* 11 */            O0O0o1io o0O0o1io = (O0O0o1io) obj;
                    return this.I00000oIO == o0O0o1io.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, o0O0o1io.I00000oOI);
                }

                public final int hashCode() {
/* 2 */             O0O10O o0o10o = this.I00000oIO;
/* 12 */            int iHashCode = (o0o10o == null ? 0 : o0o10o.hashCode()) * 31;
/* 14 */            O0O01O0o o0O01O0o = this.I00000oOI;
/* 23 */            return iHashCode + (o0O01O0o != null ? o0O01O0o.hashCode() : 0);
                }

                public final String toString() {
/* 2 */             O0O10O o0o10o = this.I00000oIO;
/* 14 */            int i = o0o10o == null ? -1 : O0O0lol1i.I00000oIO[o0o10o.ordinal()];
/* 16 */            if (i == -1) {
/* 69 */                return "*";
                    }
/* 19 */            O0O01O0o o0O01O0o = this.I00000oOI;
/* 21 */            if (i == 1) {
/* 64 */                return String.valueOf(o0O01O0o);
                    }
/* 24 */            if (i == 2) {
/* 59 */                return "in " + o0O01O0o;
                    }
/* 27 */            if (i != 3) {
/* 44 */                I000II.I00000oIO();
/* 47 */                return null;
                    }
/* 39 */            return "out " + o0O01O0o;
                }
            }
