            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOloo0iO;", "LO1oooooIio;", "LOloo0l1lIl;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class Oloo0iO extends O1oooooIio {
                public IIlio101Io I00000oIO;
                public Function1 I00000oOI;
                public Function1 I0000Il00O;
                public Function1 I0000O;

                @Override
                public final O1ooOo I000II() {
/* 3 */             IIlio101Io iIlio101Io = this.I00000oIO;
/* 5 */             Function1 function1 = this.I00000oOI;
/* 7 */             Function1 function12 = this.I0000Il00O;
/* 9 */             Function1 function13 = this.I0000O;
/* 11 */            Oloo0l1lIl oloo0l1lIl = new Oloo0l1lIl();
/* 14 */            oloo0l1lIl.I00o101lO = iIlio101Io;
/* 16 */            oloo0l1lIl.I00oI0i = function1;
/* 18 */            oloo0l1lIl.I00oII = function12;
/* 20 */            oloo0l1lIl.I00oIiI10 = function13;
/* 25 */            OlOi0iollo olOi0iollo = new OlOi0iollo(6);
/* 28 */            olOi0iollo.I00iiI = oloo0l1lIl;
/* 30 */            VarHandle.storeStoreFence();
/* 37 */            oloo0l1lIl.I00oOio10iI1 = Ol1llolil.I00000oOI(olOi0iollo);
/* 41 */            oloo0l1lIl.I00ol1 = OOo0IO.I0000oI00;
/* 43 */            VarHandle.storeStoreFence();
/* 55 */            return oloo0l1lIl;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             Oloo0l1lIl oloo0l1lIl = (Oloo0l1lIl) o1ooOo;
/* 3 */             IIlio101Io iIlio101Io = this.I00000oIO;
/* 8 */             oloo0l1lIl.I00o101lO.I00iiI = null;
/* 10 */            oloo0l1lIl.I00o101lO = iIlio101Io;
/* 12 */            iIlio101Io.I00iiI = oloo0l1lIl;
/* 23 */            iIlio101Io.I00iiO = oloo0l1lIl.I00lll10 ? Oo1i1iO0o0.I00iiO : Oo1i1iO0o0.I00iiI;
/* 27 */            oloo0l1lIl.I00oI0i = this.I00000oOI;
/* 31 */            oloo0l1lIl.I00oII = this.I0000Il00O;
/* 35 */            oloo0l1lIl.I00oIiI10 = this.I0000O;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oloo0iO)) {
/* 7 */                 return false;
                    }
/* 13 */            Oloo0iO oloo0iO = (Oloo0iO) obj;
                    return this.I00000oIO == oloo0iO.I00000oIO && this.I00000oOI == oloo0iO.I00000oOI && this.I0000Il00O == oloo0iO.I0000Il00O && this.I0000O == oloo0iO.I0000O;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             Function1 function1 = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31;
/* 23 */            Function1 function12 = this.I0000Il00O;
/* 40 */            return this.I0000O.hashCode() + ((iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 31);
                }
            }
