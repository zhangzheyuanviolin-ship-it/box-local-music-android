            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIoI0oolIlI0o;", "LO1oooooIio;", "LIoI10o0o;", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class IoI0oolIlI0o extends O1oooooIio {
                public II0IlloOiO0i I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             II0IlloOiO0i iI0IlloOiO0i = this.I00000oIO;
/* 5 */             IoI10o0o ioI10o0o = new IoI10o0o();
/* 8 */             ioI10o0o.I00o0iI0io1 = iI0IlloOiO0i;
/* 20 */            return ioI10o0o;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 5 */             ((IoI10o0o) o1ooOo).I00o0iI0io1 = this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 12 */            IoI0oolIlI0o ioI0oolIlI0o = obj instanceof IoI0oolIlI0o ? (IoI0oolIlI0o) obj : null;
/* 13 */            if (ioI0oolIlI0o == null) {
/* 15 */                return false;
                    }
/* 21 */            return O0000Ioio00.I0000O(this.I00000oIO, ioI0oolIlI0o.I00000oIO);
                }

                public final int hashCode() {
/* 5 */             return Float.hashCode(this.I00000oIO.I00000oIO);
                }
            }
