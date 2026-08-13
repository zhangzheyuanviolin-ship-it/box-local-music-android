            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOiol1l;", "LO1oooooIio;", "LOiol1OoI;", "animation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class Oiol1l extends O1oooooIio {
                public OiolIO0Il I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             OiolIO0Il oiolIO0Il = this.I00000oIO;
/* 5 */             Oiol1OoI oiol1OoI = new Oiol1OoI();
/* 8 */             oiol1OoI.I00oII = oiolIO0Il;
/* 10 */            OOiIii oOiIii = Oiol1l10l.I00000oIO;
/* 14 */            Ol0OOi1 ol0OOi1 = new Ol0OOi1();
/* 17 */            ol0OOi1.I00000oIO = oOiIii;
/* 20 */            OIooliIO0 oIooliIO0I00000oIO = lOO00IiI0li.I00000oIO(null);
/* 24 */            ol0OOi1.I00000oOI = oIooliIO0I00000oIO;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            oIooliIO0I00000oIO.setValue(oiolIO0Il);
/* 32 */            oiol1OoI.I00oIiI10 = ol0OOi1;
/* 34 */            VarHandle.storeStoreFence();
/* 55 */            return oiol1OoI;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             Oiol1OoI oiol1OoI = (Oiol1OoI) o1ooOo;
/* 3 */             OiolIO0Il oiolIO0Il = this.I00000oIO;
/* 11 */            if (O0000Ioio00.I0000O(oiolIO0Il, oiol1OoI.I00oII)) {
/* 77 */                return;
                    }
/* 19 */            oiol1OoI.I00oII.I00iOIl.setValue(Boolean.FALSE);
/* 22 */            oiol1OoI.I00oII = oiolIO0Il;
/* 32 */            oiolIO0Il.I00iOIl.setValue(Boolean.valueOf(oiol1OoI.I00lll10));
/* 37 */            if (oiol1OoI.I00lll10) {
/* 39 */                oiol1OoI.I010oio1OO0();
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof Oiol1l) && O0000Ioio00.I0000O(this.I00000oIO, ((Oiol1l) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 18 */            return "SharedBoundsNodeElement(sharedElementState=" + this.I00000oIO + ")";
                }
            }
