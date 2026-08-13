            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LII1IOl;", "LO1oooooIio;", "LII1I10I0li;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class II1IOl extends O1oooooIio {
                public float I00000oIO;
                public OlI00IIlOO I00000oOI;
                public OioOIi1o0I I0000Il00O;

                @Override
                public final O1ooOo I000II() {
/* 3 */             float f = this.I00000oIO;
/* 5 */             OlI00IIlOO olI00IIlOO = this.I00000oOI;
/* 7 */             OioOIi1o0I oioOIi1o0I = this.I0000Il00O;
/* 9 */             II1I10I0li iI1I10I0li = new II1I10I0li();
/* 12 */            iI1I10I0li.I00oI0i = f;
/* 14 */            iI1I10I0li.I00oII = olI00IIlOO;
/* 16 */            iI1I10I0li.I00oIiI10 = oioOIi1o0I;
/* 22 */            IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(20);
/* 25 */            iIOIlOoI111.I00iiI = iI1I10I0li;
/* 27 */            VarHandle.storeStoreFence();
/* 37 */            IIi111 iIi111 = new IIi111(new IIi11Illi1I(), iIOIlOoI111);
/* 40 */            iI1I10I0li.I010l1O(iIi111);
/* 43 */            iI1I10I0li.I00oO101o = iIi111;
/* 45 */            VarHandle.storeStoreFence();
/* 55 */            return iI1I10I0li;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             II1I10I0li iI1I10I0li = (II1I10I0li) o1ooOo;
/* 3 */             float f = this.I00000oIO;
/* 5 */             float f2 = iI1I10I0li.I00oI0i;
/* 7 */             IIi111 iIi111 = iI1I10I0li.I00oO101o;
/* 13 */            if (!Iil1010O.I0000Il00O(f2, f)) {
/* 15 */                iI1I10I0li.I00oI0i = f;
/* 17 */                iIi111.I010l1O();
                    }
/* 20 */            OlI00IIlOO olI00IIlOO = this.I00000oOI;
/* 28 */            if (!O0000Ioio00.I0000O(iI1I10I0li.I00oII, olI00IIlOO)) {
/* 30 */                iI1I10I0li.I00oII = olI00IIlOO;
/* 32 */                iIi111.I010l1O();
                    }
/* 35 */            OioOIi1o0I oioOIi1o0I = this.I0000Il00O;
/* 43 */            if (O0000Ioio00.I0000O(iI1I10I0li.I00oIiI10, oioOIi1o0I)) {
/* 77 */                return;
                    }
/* 45 */            iI1I10I0li.I00oIiI10 = oioOIi1o0I;
/* 47 */            iIi111.I010l1O();
/* 50 */            lO1OiIiIo0oi.I00000oOI(iI1I10I0li);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 45 */                return true;
                    }
/* 6 */             if (!(obj instanceof II1IOl)) {
/* 43 */                return false;
                    }
/* 9 */             II1IOl iI1IOl = (II1IOl) obj;
                    return Iil1010O.I0000Il00O(this.I00000oIO, iI1IOl.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iI1IOl.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iI1IOl.I0000Il00O);
                }

                public final int hashCode() {
/* 24 */            return this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (Float.hashCode(this.I00000oIO) * 31)) * 31);
                }

                public final String toString() {
/* 42 */            return "BorderModifierNodeElement(width=" + Iil1010O.I0000O(this.I00000oIO) + ", brush=" + this.I00000oOI + ", shape=" + this.I0000Il00O + ")";
                }
            }
