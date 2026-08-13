            package p000;
            
            @Oili0O
            public final class IOIoIi11i0ll {
                public static final IOIo10oi11 Companion = new IOIo10oi11();
                public O01ioO1o0i11 I00000oIO;
                public IOIoIIO I00000oOI;
                public O01ioO1o0i11 I0000Il00O;
                public O01ioO1o0i11 I0000O;

                static {
/* 8 */             OllO00oiil ollO00oiil = O01oO1I1O.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IOIoIi11i0ll)) {
/* 7 */                 return false;
                    }
/* 11 */            IOIoIi11i0ll iOIoIi11i0ll = (IOIoIi11i0ll) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iOIoIi11i0ll.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iOIoIi11i0ll.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iOIoIi11i0ll.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, iOIoIi11i0ll.I0000O);
                }

                public final int hashCode() {
/* 1 */             O01ioO1o0i11 o01ioO1o0i11 = this.I00000oIO;
/* 14 */            int iHashCode = (o01ioO1o0i11 == null ? 0 : o01ioO1o0i11.I00iOIl.hashCode()) * 31;
/* 16 */            IOIoIIO iOIoIIO = this.I00000oOI;
/* 27 */            int iHashCode2 = (iHashCode + (iOIoIIO == null ? 0 : iOIoIIO.hashCode())) * 31;
/* 29 */            O01ioO1o0i11 o01ioO1o0i112 = this.I0000Il00O;
/* 42 */            int iHashCode3 = (iHashCode2 + (o01ioO1o0i112 == null ? 0 : o01ioO1o0i112.I00iOIl.hashCode())) * 31;
/* 44 */            O01ioO1o0i11 o01ioO1o0i113 = this.I0000O;
/* 55 */            return iHashCode3 + (o01ioO1o0i113 != null ? o01ioO1o0i113.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 48 */            return "ClientCapabilities(sampling=" + this.I00000oIO + ", roots=" + this.I00000oOI + ", elicitation=" + this.I0000Il00O + ", experimental=" + this.I0000O + ")";
                }
            }
