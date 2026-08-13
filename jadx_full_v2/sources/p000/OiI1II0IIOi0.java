            package p000;

            import java.net.InetSocketAddress;
            import java.net.Proxy;
            
            public final class OiI1II0IIOi0 {
                public I0OI0o0lO I00000oIO;
                public Proxy I00000oOI;
                public InetSocketAddress I0000Il00O;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OiI1II0IIOi0)) {
/* 39 */                return false;
                    }
/* 5 */             OiI1II0IIOi0 oiI1II0IIOi0 = (OiI1II0IIOi0) obj;
                    return oiI1II0IIOi0.I00000oIO.equals(this.I00000oIO) && oiI1II0IIOi0.I00000oOI.equals(this.I00000oOI) && oiI1II0IIOi0.I0000Il00O.equals(this.I0000Il00O);
                }

                public final int hashCode() {
/* 26 */            return this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + ((this.I00000oIO.hashCode() + 527) * 31)) * 31);
                }

                public final String toString() {
/* 18 */            return "Route{" + this.I0000Il00O + '}';
                }
            }
