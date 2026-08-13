            package p000;

            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LIOIl01OlIo;", "LO1oooooIio;", "LIOolo0o1oiII;", "LOiioloI0I0oO;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class IOIl01OlIo extends O1oooooIio implements OiioloI0I0oO {
                public Function1 I00000oIO;

                @Override
                public final OiioiIIlooo I0001Ioi1lo() {
/* 3 */             OiioiIIlooo oiioiIIlooo = new OiioiIIlooo();
/* 7 */             oiioiIIlooo.I00iiO = false;
/* 10 */            oiioiIIlooo.I00iio = true;
/* 14 */            this.I00000oIO.invoke(oiioiIIlooo);
/* 20 */            return oiioiIIlooo;
                }

                @Override
                public final O1ooOo I000II() {
/* 7 */             return new IOolo0o1oiII(false, true, this.I00000oIO);
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 5 */             ((IOolo0o1oiII) o1ooOo).I00o101lO = this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof IOIl01OlIo) && this.I00000oIO == ((IOIl01OlIo) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }
