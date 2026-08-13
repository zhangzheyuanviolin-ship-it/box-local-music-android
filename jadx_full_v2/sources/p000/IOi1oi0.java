            package p000;
            
            @Oili0O
            public final class IOi1oi0 implements Oi0O0llI {
                public static final IOi1lo Companion = new IOi1lo();
                public IOi1liol0 I00000oIO;
                public OOo11oi0ilIO I00000oOI;
                public IOi1oO0o0 I0000Il00O;
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
/* 8 */             if (!(obj instanceof IOi1oi0)) {
/* 7 */                 return false;
                    }
/* 11 */            IOi1oi0 iOi1oi0 = (IOi1oi0) obj;
/* 21 */            if (!O0000Ioio00.I0000O(this.I00000oIO, iOi1oi0.I00000oIO) || !O0000Ioio00.I0000O(this.I00000oOI, iOi1oi0.I00000oOI) || !O0000Ioio00.I0000O(this.I0000Il00O, iOi1oi0.I0000Il00O)) {
/* 7 */                 return false;
                    }
/* 46 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000O;
/* 48 */            O01ioO1o0i11 o01ioO1o0i112 = iOi1oi0.I0000O;
/* 50 */            if (o01ioO1o0i11 == null) {
/* 56 */                zEquals = o01ioO1o0i112 == null;
                    } else if (o01ioO1o0i112 != null) {
/* 61 */                zEquals = o01ioO1o0i11.equals(o01ioO1o0i112);
                    }
                    return zEquals;
                }

                public final int hashCode() {
/* 16 */            int iHashCode = (this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31;
/* 18 */            IOi1oO0o0 iOi1oO0o0 = this.I0000Il00O;
/* 30 */            int iHashCode2 = (iHashCode + (iOi1oO0o0 == null ? 0 : iOi1oO0o0.hashCode())) * 31;
/* 32 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000O;
/* 43 */            return iHashCode2 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             IOi1liol0 iOi1liol0 = this.I00000oIO;
/* 3 */             OOo11oi0ilIO oOo11oi0ilIO = this.I00000oOI;
/* 5 */             IOi1oO0o0 iOi1oO0o0 = this.I0000Il00O;
/* 7 */             O01ioO1o0i11 o01ioO1o0i11 = this.I0000O;
/* 57 */            return "CompleteRequestParams(argument=" + iOi1liol0 + ", ref=" + oOo11oi0ilIO + ", context=" + iOi1oO0o0 + ", meta=" + (o01ioO1o0i11 == null ? "null" : Oi0IiIoo.I00000oOI(o01ioO1o0i11)) + ")";
                }
            }
