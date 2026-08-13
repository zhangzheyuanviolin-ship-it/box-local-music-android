            package p000;

            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOllOl1iIo0oI;", "LO1oooooIio;", "LOllOlOI;", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OllOl1iIo0oI extends O1oooooIio {
                public Function1 I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             Function1 function1 = this.I00000oIO;
/* 7 */             OllOlOI ollOlOI = new OllOlOI(iO1OO0i0i.I00000oIO);
/* 10 */            ollOlOI.I00oI0i = function1;
/* 20 */            return ollOlOI;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             OllOlOI ollOlOI = (OllOlOI) o1ooOo;
/* 3 */             Function1 function1 = this.I00000oIO;
/* 7 */             if (ollOlOI.I00oI0i != function1) {
/* 9 */                 ollOlOI.I00oI0i = function1;
/* 11 */                i00lIlOOll0 i00lilooll0 = ollOlOI.I00oII;
/* 13 */                if (i00lilooll0 != null) {
/* 19 */                    i00O0OOIlOO i00o0ooiloo = (i00O0OOIlOO) function1.invoke(i00lilooll0);
/* 27 */                    if (O0000Ioio00.I0000O(i00o0ooiloo, ollOlOI.I00o101lO)) {
/* 77 */                        return;
                            }
/* 29 */                    ollOlOI.I00o101lO = i00o0ooiloo;
/* 31 */                    ollOlOI.I010l1ol111();
                        }
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof OllOl1iIo0oI) && this.I00000oIO == ((OllOl1iIo0oI) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }
