            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"LI0l0O1oi;", "T", "LO1oooooIio;", "LI0l10OiIOil;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class I0l0O1oi<T> extends O1oooooIio {
                public final I0l1OOl1l10 I00000oIO;
                public final OIilII I00000oOI;
                public final boolean I0000Il00O;
                public final Boolean I0000O;
                public final II1OIl1 I0000oI00;

                public I0l0O1oi(I0l1OOl1l10 i0l1OOl1l10, OIilII oIilII, boolean z, Boolean bool, II1OIl1 iI1OIl1) {
/* 4 */             this.I00000oIO = i0l1OOl1l10;
/* 6 */             this.I00000oOI = oIilII;
/* 8 */             this.I0000Il00O = z;
/* 10 */            this.I0000O = bool;
/* 12 */            this.I0000oI00 = iI1OIl1;
                }

                @Override
                public final O1ooOo I000II() {
/* 10 */            I0l10OiIOil i0l10OiIOil = new I0l10OiIOil(I0l0lIoOIoIi.I00000oIO, this.I0000Il00O, null, this.I00000oOI);
/* 15 */            i0l10OiIOil.I010OIo1l = this.I00000oIO;
/* 19 */            i0l10OiIOil.I010i10l = this.I0000O;
/* 23 */            i0l10OiIOil.I010iIIOlo = this.I0000oI00;
/* 55 */            return i0l10OiIOil;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
                    boolean z;
                    boolean z2;
/* 2 */             I0l10OiIOil i0l10OiIOil = (I0l10OiIOil) o1ooOo;
/* 4 */             II1OIl1 iI1OIl1 = this.I0000oI00;
/* 6 */             i0l10OiIOil.I010iIIOlo = iI1OIl1;
/* 8 */             I0l1OOl1l10 i0l1OOl1l10 = i0l10OiIOil.I010OIo1l;
/* 10 */            I0l1OOl1l10 i0l1OOl1l102 = this.I00000oIO;
/* 17 */            if (O0000Ioio00.I0000O(i0l1OOl1l10, i0l1OOl1l102)) {
/* 26 */                z = false;
                    } else {
/* 19 */                i0l10OiIOil.I010OIo1l = i0l1OOl1l102;
/* 21 */                i0l10OiIOil.I011olOoO(iI1OIl1);
/* 24 */                z = true;
                    }
/* 27 */            OIilII oIilII = i0l10OiIOil.I00o101lO;
/* 29 */            OIilII oIilII2 = this.I00000oOI;
/* 31 */            if (oIilII != oIilII2) {
/* 33 */                i0l10OiIOil.I00o101lO = oIilII2;
/* 35 */                z = true;
                    }
/* 36 */            Boolean bool = i0l10OiIOil.I010i10l;
/* 38 */            Boolean bool2 = this.I0000O;
/* 44 */            if (O0000Ioio00.I0000O(bool, bool2)) {
/* 50 */                z2 = z;
                    } else {
/* 46 */                i0l10OiIOil.I010i10l = bool2;
/* 48 */                z2 = true;
                    }
/* 56 */            i0l10OiIOil.I011lO1liO1O(i0l10OiIOil.I00oI0i, this.I0000Il00O, null, oIilII2, z2);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 59 */                return true;
                    }
/* 6 */             if (!(obj instanceof I0l0O1oi)) {
/* 57 */                return false;
                    }
/* 9 */             I0l0O1oi i0l0O1oi = (I0l0O1oi) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i0l0O1oi.I00000oIO) && this.I00000oOI == i0l0O1oi.I00000oOI && this.I0000Il00O == i0l0O1oi.I0000Il00O && O0000Ioio00.I0000O(this.I0000O, i0l0O1oi.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, i0l0O1oi.I0000oI00);
                }

                public final int hashCode() {
/* 20 */            int iI000OOo1O = Oi010OO0.I000OOo1O((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31, 31, this.I0000Il00O);
/* 25 */            Boolean bool = this.I0000O;
/* 39 */            int iHashCode = (iI000OOo1O + (bool != null ? bool.hashCode() : 0)) * 923521;
/* 40 */            II1OIl1 iI1OIl1 = this.I0000oI00;
/* 48 */            return iHashCode + (iI1OIl1 != null ? iI1OIl1.hashCode() : 0);
                }
            }
