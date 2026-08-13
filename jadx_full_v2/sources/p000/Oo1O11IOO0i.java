            package p000;

            import java.util.List;
            
            @Oili0O
            public final class Oo1O11IOO0i {
                public static final Oo1O1110iI Companion = new Oo1O1110iI();
                public static final O0ioIllo0i1[] I000OOo1O = {null, null, null, null, null, null, l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new OlOiIoII(11)), null};
                public String I00000oIO;
                public Oo1Oioo I00000oOI;
                public String I0000Il00O;
                public Oo1Oioo I0000O;
                public String I0000oI00;
                public Oo1O1iOII I0001Ioi1lo;
                public List I000II;
                public O01ioO1o0i11 I000O01llI0;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oo1O11IOO0i)) {
/* 7 */                 return false;
                    }
/* 11 */            Oo1O11IOO0i oo1O11IOO0i = (Oo1O11IOO0i) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oo1O11IOO0i.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oo1O11IOO0i.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oo1O11IOO0i.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oo1O11IOO0i.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, oo1O11IOO0i.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, oo1O11IOO0i.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, oo1O11IOO0i.I000II) && O0000Ioio00.I0000O(this.I000O01llI0, oo1O11IOO0i.I000O01llI0);
                }

                public final int hashCode() {
/* 16 */            int iHashCode = (this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31;
/* 18 */            String str = this.I0000Il00O;
/* 30 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 32 */            Oo1Oioo oo1Oioo = this.I0000O;
/* 43 */            int iHashCode3 = (iHashCode2 + (oo1Oioo == null ? 0 : oo1Oioo.hashCode())) * 31;
/* 45 */            String str2 = this.I0000oI00;
/* 56 */            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 58 */            Oo1O1iOII oo1O1iOII = this.I0001Ioi1lo;
/* 69 */            int iHashCode5 = (iHashCode4 + (oo1O1iOII == null ? 0 : oo1O1iOII.hashCode())) * 31;
/* 71 */            List list = this.I000II;
/* 82 */            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
/* 84 */            O01ioO1o0i11 o01ioO1o0i11 = this.I000O01llI0;
/* 95 */            return iHashCode6 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 88 */            return "Tool(name=" + this.I00000oIO + ", inputSchema=" + this.I00000oOI + ", description=" + this.I0000Il00O + ", outputSchema=" + this.I0000O + ", title=" + this.I0000oI00 + ", annotations=" + this.I0001Ioi1lo + ", icons=" + this.I000II + ", meta=" + this.I000O01llI0 + ")";
                }
            }
