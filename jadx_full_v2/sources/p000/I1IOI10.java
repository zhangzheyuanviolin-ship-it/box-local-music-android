            package p000;

            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LI1IOI10;", "LO1oooooIio;", "LIOolo0o1oiII;", "LOiioloI0I0oO;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class I1IOI10 extends O1oooooIio implements OiioloI0I0oO {
                public boolean I00000oIO;
                public Function1 I00000oOI;

                @Override
                public final OiioiIIlooo I0001Ioi1lo() {
/* 3 */             OiioiIIlooo oiioiIIlooo = new OiioiIIlooo();
/* 8 */             oiioiIIlooo.I00iiO = this.I00000oIO;
/* 12 */            this.I00000oOI.invoke(oiioiIIlooo);
/* 20 */            return oiioiIIlooo;
                }

                @Override
                public final O1ooOo I000II() {
/* 8 */             return new IOolo0o1oiII(this.I00000oIO, false, this.I00000oOI);
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             IOolo0o1oiII iOolo0o1oiII = (IOolo0o1oiII) o1ooOo;
/* 5 */             iOolo0o1oiII.I00o0iI0io1 = this.I00000oIO;
/* 9 */             iOolo0o1oiII.I00o101lO = this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 26 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1IOI10)) {
/* 24 */                return false;
                    }
/* 11 */            I1IOI10 i1ioi10 = (I1IOI10) obj;
                    return this.I00000oIO == i1ioi10.I00000oIO && this.I00000oOI == i1ioi10.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (Boolean.hashCode(this.I00000oIO) * 31);
                }
            }
