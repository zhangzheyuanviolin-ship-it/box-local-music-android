            package p000;
            
            @Oili0O
            public final class IolOlli implements Oi0O0llI {
                public static final IolOIO0o Companion = new IolOIO0o();
                public String I00000oIO;
                public IOIoIi11i0ll I00000oOI;
                public IoioIli11o I0000Il00O;
                public O01ioO1o0i11 I0000O;

                /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
                    boolean zEquals;
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IolOlli)) {
/* 7 */                 return false;
                    }
/* 11 */            IolOlli iolOlli = (IolOlli) obj;
/* 21 */            if (!O0000Ioio00.I0000O(this.I00000oIO, iolOlli.I00000oIO) || !O0000Ioio00.I0000O(this.I00000oOI, iolOlli.I00000oOI) || !O0000Ioio00.I0000O(this.I0000Il00O, iolOlli.I0000Il00O)) {
/* 7 */                 return false;
                    }
/* 46 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000O;
/* 48 */            O01ioO1o0i11 o01ioO1o0i112 = iolOlli.I0000O;
/* 50 */            if (o01ioO1o0i11 == null) {
/* 56 */                zEquals = o01ioO1o0i112 == null;
                    } else if (o01ioO1o0i112 != null) {
/* 61 */                zEquals = o01ioO1o0i11.equals(o01ioO1o0i112);
                    }
                    return zEquals;
                }

                public final int hashCode() {
/* 25 */            int iHashCode = (this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31;
/* 27 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000O;
/* 39 */            return iHashCode + (o01ioO1o0i11 == null ? 0 : o01ioO1o0i11.I00iOIl.hashCode());
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             IOIoIi11i0ll iOIoIi11i0ll = this.I00000oOI;
/* 5 */             IoioIli11o ioioIli11o = this.I0000Il00O;
/* 7 */             O01ioO1o0i11 o01ioO1o0i11 = this.I0000O;
/* 57 */            return "InitializeRequestParams(protocolVersion=" + str + ", capabilities=" + iOIoIi11i0ll + ", clientInfo=" + ioioIli11o + ", meta=" + (o01ioO1o0i11 == null ? "null" : Oi0IiIoo.I00000oOI(o01ioO1o0i11)) + ")";
                }
            }
