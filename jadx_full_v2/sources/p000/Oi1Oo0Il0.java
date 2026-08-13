            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
/* 40 */    public final class Oi1Oo0Il0 {
                public static final Oi1Oo0Il0 I000OOo1O = new Oi1Oo0Il0(null, null, null, null, 255);
                public final Oo0o1OiIo I00000oIO;
                public final IlliIl1l11O I00000oOI;
                public final O10l1oIi0o I0000Il00O;
                public final II0olO0oi1O I0000O;
                public final IOOIiI1o I0000oI00;
                public final Olo0loOlIO I0001Ioi1lo;
                public final IolIlOIliII I000II;
                public final Oi1Oioi1oIO I000O01llI0;

                public Oi1Oo0Il0(Oo0o1OiIo oo0o1OiIo, IOOIiI1o iOOIiI1o, Olo0loOlIO olo0loOlIO, Oi1Oioi1oIO oi1Oioi1oIO, int i) {
/* 38 */            this((i & 1) != 0 ? null : oo0o1OiIo, null, null, null, (i & 16) != 0 ? null : iOOIiI1o, (i & 32) != 0 ? null : olo0loOlIO, null, (i & Barcode.FORMAT_ITF) != 0 ? null : oi1Oioi1oIO);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oi1Oo0Il0)) {
/* 7 */                 return false;
                    }
/* 11 */            Oi1Oo0Il0 oi1Oo0Il0 = (Oi1Oo0Il0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oi1Oo0Il0.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oi1Oo0Il0.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oi1Oo0Il0.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oi1Oo0Il0.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, oi1Oo0Il0.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, oi1Oo0Il0.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, oi1Oo0Il0.I000II) && O0000Ioio00.I0000O(this.I000O01llI0, oi1Oo0Il0.I000O01llI0);
                }

                public final int hashCode() {
/* 2 */             Oo0o1OiIo oo0o1OiIo = this.I00000oIO;
/* 14 */            int iHashCode = (oo0o1OiIo == null ? 0 : Long.hashCode(oo0o1OiIo.I00000oIO)) * 31;
/* 16 */            IlliIl1l11O illiIl1l11O = this.I00000oOI;
/* 27 */            int iHashCode2 = (iHashCode + (illiIl1l11O == null ? 0 : illiIl1l11O.hashCode())) * 31;
/* 29 */            O10l1oIi0o o10l1oIi0o = this.I0000Il00O;
/* 40 */            int iHashCode3 = (iHashCode2 + (o10l1oIi0o == null ? 0 : o10l1oIi0o.hashCode())) * 31;
/* 42 */            II0olO0oi1O iI0olO0oi1O = this.I0000O;
/* 53 */            int iHashCode4 = (iHashCode3 + (iI0olO0oi1O == null ? 0 : iI0olO0oi1O.hashCode())) * 31;
/* 55 */            IOOIiI1o iOOIiI1o = this.I0000oI00;
/* 66 */            int iHashCode5 = (iHashCode4 + (iOOIiI1o == null ? 0 : iOOIiI1o.hashCode())) * 31;
/* 68 */            Olo0loOlIO olo0loOlIO = this.I0001Ioi1lo;
/* 79 */            int iHashCode6 = (iHashCode5 + (olo0loOlIO == null ? 0 : olo0loOlIO.hashCode())) * 31;
/* 81 */            IolIlOIliII iolIlOIliII = this.I000II;
/* 92 */            int iHashCode7 = (iHashCode6 + (iolIlOIliII == null ? 0 : iolIlOIliII.hashCode())) * 31;
/* 94 */            Oi1Oioi1oIO oi1Oioi1oIO = this.I000O01llI0;
/* 103 */           return iHashCode7 + (oi1Oioi1oIO != null ? oi1Oioi1oIO.hashCode() : 0);
                }

                public final String toString() {
/* 88 */            return "RichTextStyle(paragraphSpacing=" + this.I00000oIO + ", headingStyle=" + this.I00000oOI + ", listStyle=" + this.I0000Il00O + ", blockQuoteGutter=" + this.I0000O + ", codeBlockStyle=" + this.I0000oI00 + ", tableStyle=" + this.I0001Ioi1lo + ", infoPanelStyle=" + this.I000II + ", stringStyle=" + this.I000O01llI0 + ")";
                }

/* 41 */        public Oi1Oo0Il0(Oo0o1OiIo oo0o1OiIo, IlliIl1l11O illiIl1l11O, O10l1oIi0o o10l1oIi0o, II0olO0oi1O iI0olO0oi1O, IOOIiI1o iOOIiI1o, Olo0loOlIO olo0loOlIO, IolIlOIliII iolIlOIliII, Oi1Oioi1oIO oi1Oioi1oIO) {
/* 43 */            this.I00000oIO = oo0o1OiIo;
/* 44 */            this.I00000oOI = illiIl1l11O;
/* 45 */            this.I0000Il00O = o10l1oIi0o;
/* 46 */            this.I0000O = iI0olO0oi1O;
/* 47 */            this.I0000oI00 = iOOIiI1o;
/* 48 */            this.I0001Ioi1lo = olo0loOlIO;
/* 49 */            this.I000II = iolIlOIliII;
/* 50 */            this.I000O01llI0 = oi1Oioi1oIO;
                }
            }
