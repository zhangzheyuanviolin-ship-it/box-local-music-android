            package p000;
            
            @Oili0O
            public final class IOiI1i01111i implements Oi0OO01oi {
                public static final IOiI0I1I1II Companion = new IOiI0I1I1II();
                public IOiI1O I00000oIO;
                public O01ioO1o0i11 I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IOiI1i01111i)) {
/* 7 */                 return false;
                    }
/* 11 */            IOiI1i01111i iOiI1i01111i = (IOiI1i01111i) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iOiI1i01111i.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iOiI1i01111i.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             O01ioO1o0i11 o01ioO1o0i11 = this.I00000oOI;
/* 21 */            return iHashCode + (o01ioO1o0i11 == null ? 0 : o01ioO1o0i11.I00iOIl.hashCode());
                }

                public final String toString() {
/* 28 */            return "CompleteResult(completion=" + this.I00000oIO + ", meta=" + this.I00000oOI + ")";
                }
            }
