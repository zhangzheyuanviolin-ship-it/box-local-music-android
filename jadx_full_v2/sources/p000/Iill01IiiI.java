            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"LIill01IiiI;", "T", "LO1oooooIio;", "LIill0oiIl0Io;", "material3"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class Iill01IiiI<T> extends O1oooooIio {
                public I0l1OOl1l10 I00000oIO;
                public IlliIl1l11O I00000oOI;
                public OIilII I0000Il00O;

                @Override
                public final O1ooOo I000II() {
/* 3 */             I0l1OOl1l10 i0l1OOl1l10 = this.I00000oIO;
/* 5 */             IlliIl1l11O illiIl1l11O = this.I00000oOI;
/* 7 */             OIilII oIilII = this.I0000Il00O;
/* 9 */             Iill0oiIl0Io iill0oiIl0Io = new Iill0oiIl0Io();
/* 12 */            iill0oiIl0Io.I00o0iI0io1 = i0l1OOl1l10;
/* 14 */            iill0oiIl0Io.I00o0l1o1o0 = illiIl1l11O;
/* 16 */            iill0oiIl0Io.I00o101lO = oIilII;
/* 20 */            return iill0oiIl0Io;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             Iill0oiIl0Io iill0oiIl0Io = (Iill0oiIl0Io) o1ooOo;
/* 3 */             I0l1OOl1l10 i0l1OOl1l10 = this.I00000oIO;
/* 5 */             IlliIl1l11O illiIl1l11O = this.I00000oOI;
/* 7 */             OIilII oIilII = this.I0000Il00O;
/* 11 */            boolean zI0000O = O0000Ioio00.I0000O(iill0oiIl0Io.I00o0iI0io1, i0l1OOl1l10);
/* 15 */            iill0oiIl0Io.I00o0iI0io1 = i0l1OOl1l10;
/* 17 */            iill0oiIl0Io.I00o0l1o1o0 = illiIl1l11O;
/* 19 */            iill0oiIl0Io.I00o101lO = oIilII;
/* 21 */            if (zI0000O) {
/* 29 */                return;
                    }
/* 24 */            iill0oiIl0Io.I00oI0i = false;
/* 26 */            l0o11Oi.I00000oOI(iill0oiIl0Io);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Iill01IiiI)) {
/* 7 */                 return false;
                    }
/* 13 */            Iill01IiiI iill01IiiI = (Iill01IiiI) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iill01IiiI.I00000oIO) && this.I00000oOI == iill01IiiI.I00000oOI && this.I0000Il00O == iill01IiiI.I0000Il00O;
                }

                public final int hashCode() {
/* 24 */            return this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31);
                }
            }
