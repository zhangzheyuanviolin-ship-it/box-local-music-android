            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LI1o00lOi;", "LO1oooooIio;", "LI1o01l;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class I1o00lOi extends O1oooooIio {
                public final long I00000oIO;
                public final III11l1I I00000oOI;
                public final OioOIi1o0I I0000Il00O;

                public I1o00lOi(long j, OioIoiOi oioIoiOi, OioOIi1o0I oioOIi1o0I, int i) {
/* 5 */             j = (i & 1) != 0 ? IOOiio0i.I000o00OoI0I : j;
/* 9 */             oioIoiOi = (i & 2) != 0 ? null : oioIoiOi;
/* 15 */            this.I00000oIO = j;
/* 17 */            this.I00000oOI = oioIoiOi;
/* 19 */            this.I0000Il00O = oioOIi1o0I;
                }

                @Override
                public final O1ooOo I000II() {
/* 3 */             I1o01l i1o01l = new I1o01l();
/* 8 */             i1o01l.I00o0iI0io1 = this.I00000oIO;
/* 12 */            i1o01l.I00o0l1o1o0 = this.I00000oOI;
/* 16 */            i1o01l.I00o101lO = 1.0f;
/* 20 */            i1o01l.I00oI0i = this.I0000Il00O;
/* 27 */            i1o01l.I00oII = 9205357640488583168L;
/* 55 */            return i1o01l;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             I1o01l i1o01l = (I1o01l) o1ooOo;
/* 5 */             i1o01l.I00o0iI0io1 = this.I00000oIO;
/* 9 */             i1o01l.I00o0l1o1o0 = this.I00000oOI;
/* 13 */            i1o01l.I00o101lO = 1.0f;
/* 15 */            OioOIi1o0I oioOIi1o0I = i1o01l.I00oI0i;
/* 17 */            OioOIi1o0I oioOIi1o0I2 = this.I0000Il00O;
/* 23 */            if (!O0000Ioio00.I0000O(oioOIi1o0I, oioOIi1o0I2)) {
/* 25 */                i1o01l.I00oI0i = oioOIi1o0I2;
/* 27 */                lO1OiIiIo0oi.I00000oOI(i1o01l);
                    }
/* 30 */            il1ollIO0I.I00000oIO(i1o01l);
                }

                public final boolean equals(Object obj) {
/* 8 */             I1o00lOi i1o00lOi = obj instanceof I1o00lOi ? (I1o00lOi) obj : null;
/* 9 */             if (i1o00lOi == null) {
/* 46 */                return false;
                    }
/* 12 */            long j = i1o00lOi.I00000oIO;
/* 14 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(this.I00000oIO, j) && O0000Ioio00.I0000O(this.I00000oOI, i1o00lOi.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, i1o00lOi.I0000Il00O);
                }

                public final int hashCode() {
/* 1 */             int i = IOOiio0i.I000oI1ioi;
/* 11 */            int iHashCode = Long.hashCode(this.I00000oIO) * 31;
/* 12 */            III11l1I iII11l1I = this.I00000oOI;
/* 36 */            return this.I0000Il00O.hashCode() + OooioIOo1.I0000O((iHashCode + (iII11l1I != null ? iII11l1I.hashCode() : 0)) * 31, 31, 1.0f);
                }
            }
