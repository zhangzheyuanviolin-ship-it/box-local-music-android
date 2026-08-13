            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIo1i0I;", "LO1oooooIio;", "LIo1i110o1iIO;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class Io1i0I extends O1oooooIio {
                public Oo0lloOiiIOI I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;

                @Override
                public final O1ooOo I000II() {
/* 3 */             Oo0lloOiiIOI oo0lloOiiIOI = this.I00000oIO;
/* 5 */             int i = this.I00000oOI;
/* 7 */             int i2 = this.I0000Il00O;
/* 9 */             Io1i110o1iIO io1i110o1iIO = new Io1i110o1iIO();
/* 12 */            io1i110o1iIO.I00o0iI0io1 = oo0lloOiiIOI;
/* 14 */            io1i110o1iIO.I00o0l1o1o0 = i;
/* 16 */            io1i110o1iIO.I00o101lO = i2;
/* 19 */            io1i110o1iIO.I00oII = -1;
/* 21 */            io1i110o1iIO.I00oIiI10 = -1;
/* 55 */            return io1i110o1iIO;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             Io1i110o1iIO io1i110o1iIO = (Io1i110o1iIO) o1ooOo;
/* 3 */             Oo0lloOiiIOI oo0lloOiiIOI = this.I00000oIO;
/* 5 */             int i = this.I00000oOI;
/* 7 */             int i2 = this.I0000Il00O;
/* 15 */            if (O0000Ioio00.I0000O(io1i110o1iIO.I00o0iI0io1, oo0lloOiiIOI) && io1i110o1iIO.I00o0l1o1o0 == i && io1i110o1iIO.I00o101lO == i2) {
/* 26 */                return;
                    }
/* 27 */            io1i110o1iIO.I00o0iI0io1 = oo0lloOiiIOI;
/* 29 */            io1i110o1iIO.I00o0l1o1o0 = i;
/* 31 */            io1i110o1iIO.I00o101lO = i2;
/* 43 */            io1i110o1iIO.I00oO101o = lOlilIi0I.I00000oIO(oo0lloOiiIOI, il0lI1i1olii.I000O01llI0(io1i110o1iIO).I00oo1iO0ll);
/* 46 */            io1i110o1iIO.I00oI0i = true;
/* 48 */            l0o11Oi.I00000oOI(io1i110o1iIO);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 37 */                return true;
                    }
/* 6 */             if (!(obj instanceof Io1i0I)) {
/* 35 */                return false;
                    }
/* 11 */            Io1i0I io1i0I = (Io1i0I) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, io1i0I.I00000oIO) && this.I00000oOI == io1i0I.I00000oOI && this.I0000Il00O == io1i0I.I0000Il00O;
                }

                public final int hashCode() {
/* 16 */            return (((this.I00000oIO.hashCode() * 31) + this.I00000oOI) * 31) + this.I0000Il00O;
                }
            }
