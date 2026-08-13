            package p000;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOloOl0l;", "LO1oooooIio;", "LOloOoi;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class OloOl0l extends O1oooooIio {
                public I1111OO10i I00000oIO;
                public Oo0lloOiiIOI I00000oOI;
                public IliO0o11i01 I0000Il00O;
                public Function1 I0000O;
                public int I0000oI00;
                public boolean I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public List I000OOo1O;
                public Function1 I000OiO;
                public IOOioI10Il1 I000iOII;
                public I1ili1lI0O I000l1;
                public Function1 I000lI;

                @Override
                public final O1ooOo I000II() {
/* 30 */            return new OloOoi(this.I00000oIO, this.I00000oOI, this.I0000Il00O, this.I0000O, this.I0000oI00, this.I0001Ioi1lo, this.I000II, this.I000O01llI0, this.I000OOo1O, this.I000OiO, null, this.I000iOII, this.I000l1, this.I000lI);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000O01llI0(O1ooOo o1ooOo) {
                    boolean z;
/* 2 */             OloOoi oloOoi = (OloOoi) o1ooOo;
/* 4 */             IOOioI10Il1 iOOioI10Il1 = this.I000iOII;
/* 6 */             Oo0lloOiiIOI oo0lloOiiIOI = this.I00000oOI;
/* 10 */            boolean zI0000O = O0000Ioio00.I0000O(iOOioI10Il1, oloOoi.I00oliIiO01i);
/* 14 */            oloOoi.I00oliIiO01i = iOOioI10Il1;
/* 16 */            if (zI0000O) {
/* 18 */                Oo0lloOiiIOI oo0lloOiiIOI2 = oloOoi.I00o0l1o1o0;
/* 20 */                if (oo0lloOiiIOI == oo0lloOiiIOI2) {
/* 33 */                    oo0lloOiiIOI.getClass();
                        } else if (oo0lloOiiIOI.I00000oIO.I0000Il00O(oo0lloOiiIOI2.I00000oIO)) {
                        }
/* 36 */                z = false;
                    } else {
/* 38 */                z = true;
                    }
/* 76 */            oloOoi.I010l1O(z, oloOoi.I01101IOlO(this.I00000oIO), oloOoi.I010oio1OO0(this.I00000oOI, this.I000OOo1O, this.I000O01llI0, this.I000II, this.I0001Ioi1lo, this.I0000Il00O, this.I0000oI00, this.I000l1), oloOoi.I010o0o0oO(this.I0000O, this.I000OiO, null, this.I000lI));
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 117 */               return true;
                    }
/* 7 */             if (!(obj instanceof OloOl0l)) {
/* 119 */               return false;
                    }
/* 13 */            OloOl0l oloOl0l = (OloOl0l) obj;
                    return O0000Ioio00.I0000O(this.I000iOII, oloOl0l.I000iOII) && O0000Ioio00.I0000O(this.I00000oIO, oloOl0l.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oloOl0l.I00000oOI) && O0000Ioio00.I0000O(this.I000OOo1O, oloOl0l.I000OOo1O) && O0000Ioio00.I0000O(this.I0000Il00O, oloOl0l.I0000Il00O) && this.I0000O == oloOl0l.I0000O && this.I000lI == oloOl0l.I000lI && this.I0000oI00 == oloOl0l.I0000oI00 && this.I0001Ioi1lo == oloOl0l.I0001Ioi1lo && this.I000II == oloOl0l.I000II && this.I000O01llI0 == oloOl0l.I000O01llI0 && this.I000OiO == oloOl0l.I000OiO;
                }

                public final int hashCode() {
/* 23 */            int iHashCode = (this.I0000Il00O.hashCode() + Oi010OO0.I000OiO(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31)) * 31;
/* 24 */            Function1 function1 = this.I0000O;
/* 56 */            int iI000OOo1O = (((Oi010OO0.I000OOo1O(IIl001iO0Io.I0000O(this.I0000oI00, (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.I0001Ioi1lo) + this.I000II) * 31) + this.I000O01llI0) * 31;
/* 57 */            List list = this.I000OOo1O;
/* 68 */            int iHashCode2 = (iI000OOo1O + (list != null ? list.hashCode() : 0)) * 31;
/* 69 */            Function1 function12 = this.I000OiO;
/* 80 */            int iHashCode3 = (iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 961;
/* 82 */            IOOioI10Il1 iOOioI10Il1 = this.I000iOII;
/* 93 */            int iHashCode4 = (iHashCode3 + (iOOioI10Il1 != null ? iOOioI10Il1.hashCode() : 0)) * 31;
/* 94 */            Function1 function13 = this.I000lI;
/* 102 */           return iHashCode4 + (function13 != null ? function13.hashCode() : 0);
                }
            }
