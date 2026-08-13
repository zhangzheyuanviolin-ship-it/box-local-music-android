            package p000;
            
            @Oili0O
            public final class Ioli0o implements Oi0OO01oi {
                public static final Ioli0i0o Companion = new Ioli0i0o();
                public String I00000oIO;
                public OillO0l I00000oOI;
                public IoioIli11o I0000Il00O;
                public String I0000O;
                public O01ioO1o0i11 I0000oI00;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ioli0o)) {
/* 7 */                 return false;
                    }
/* 11 */            Ioli0o ioli0o = (Ioli0o) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ioli0o.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ioli0o.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, ioli0o.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, ioli0o.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, ioli0o.I0000oI00);
                }

                public final int hashCode() {
/* 25 */            int iHashCode = (this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31;
/* 27 */            String str = this.I0000O;
/* 39 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 41 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000oI00;
/* 52 */            return iHashCode2 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 58 */            return "InitializeResult(protocolVersion=" + this.I00000oIO + ", capabilities=" + this.I00000oOI + ", serverInfo=" + this.I0000Il00O + ", instructions=" + this.I0000O + ", meta=" + this.I0000oI00 + ")";
                }
            }
