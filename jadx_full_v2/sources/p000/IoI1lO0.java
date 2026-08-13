            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIoI1lO0;", "LO1oooooIio;", "LIoII1II0;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class IoI1lO0 extends O1oooooIio {
                public OI0lOIiOIOOo I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I00000oIO;
/* 5 */             IoII1II0 ioII1II0 = new IoII1II0();
/* 8 */             ioII1II0.I00o0iI0io1 = oI0lOIiOIOOo;
/* 20 */            return ioII1II0;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             IoII1II0 ioII1II0 = (IoII1II0) o1ooOo;
/* 3 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I00000oIO;
/* 11 */            if (O0000Ioio00.I0000O(ioII1II0.I00o0iI0io1, oI0lOIiOIOOo)) {
/* 29 */                return;
                    }
/* 13 */            ioII1II0.I010lI0oi();
/* 16 */            ioII1II0.I00o0iI0io1 = oI0lOIiOIOOo;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof IoI1lO0) && O0000Ioio00.I0000O(((IoI1lO0) obj).I00000oIO, this.I00000oIO);
                }

                public final int hashCode() {
/* 7 */             return this.I00000oIO.hashCode() * 31;
                }
            }
