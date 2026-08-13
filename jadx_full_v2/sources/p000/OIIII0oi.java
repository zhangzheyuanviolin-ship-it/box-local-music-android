            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOIIII0oi;", "LO1oooooIio;", "LOIIIi0lOoOl;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OIIII0oi extends O1oooooIio {
                public OII1lIlol I00000oIO;
                public OIIII0oOo1o I00000oOI;

                @Override
                public final O1ooOo I000II() {
/* 7 */             return new OIIIi0lOoOl(this.I00000oIO, this.I00000oOI);
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             OIIIi0lOoOl oIIIi0lOoOl = (OIIIi0lOoOl) o1ooOo;
/* 3 */             OII1lIlol oII1lIlol = this.I00000oIO;
/* 5 */             OIIII0oOo1o oIIII0oOo1o = this.I00000oOI;
/* 7 */             oIIIi0lOoOl.I00o0iI0io1 = oII1lIlol;
/* 9 */             OIIII0oOo1o oIIII0oOo1o2 = oIIIi0lOoOl.I00o0l1o1o0;
/* 14 */            if (oIIII0oOo1o2.I00000oIO == oIIIi0lOoOl) {
/* 16 */                oIIII0oOo1o2.I00000oIO = null;
/* 18 */                oIIII0oOo1o2.I0000O = null;
/* 22 */                oIIII0oOo1o2.I0000Il00O = iO001lollO1l.I00000oIO;
                    }
/* 24 */            if (oIIII0oOo1o == null) {
/* 28 */                oIIII0oOo1o = new OIIII0oOo1o();
/* 31 */                oIIIi0lOoOl.I00o0l1o1o0 = oIIII0oOo1o;
                    } else if (oIIII0oOo1o != oIIII0oOo1o2) {
/* 36 */                oIIIi0lOoOl.I00o0l1o1o0 = oIIII0oOo1o;
                    } else {
/* 39 */                oIIII0oOo1o = oIIII0oOo1o2;
                    }
/* 42 */            if (oIIIi0lOoOl.I00lll10) {
/* 44 */                oIIII0oOo1o.I00000oIO = oIIIi0lOoOl;
/* 46 */                oIIII0oOo1o.I00000oOI = null;
/* 48 */                oIIIi0lOoOl.I00o101lO = null;
/* 54 */                IlIi0Il ilIi0Il = new IlIi0Il(26);
/* 57 */                ilIi0Il.I00iiI = oIIIi0lOoOl;
/* 59 */                VarHandle.storeStoreFence();
/* 62 */                oIIII0oOo1o.I0000Il00O = ilIi0Il;
/* 68 */                oIIII0oOo1o.I0000O = oIIIi0lOoOl.I00ooiO1I();
                    }
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof OIIII0oi)) {
/* 3 */                 return false;
                    }
/* 7 */             OIIII0oi oIIII0oi = (OIIII0oi) obj;
                    return O0000Ioio00.I0000O(oIIII0oi.I00000oIO, this.I00000oIO) && O0000Ioio00.I0000O(oIIII0oi.I00000oOI, this.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             OIIII0oOo1o oIIII0oOo1o = this.I00000oOI;
/* 19 */            return iHashCode + (oIIII0oOo1o != null ? oIIII0oOo1o.hashCode() : 0);
                }
            }
