            package p000;
            
            public final class OI1O0o0 {
                public final boolean I00000oIO;
                public final String I00000oOI;

                public OI1O0o0(String str, boolean z) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OI1O0o0)) {
/* 7 */                 return false;
                    }
/* 11 */            OI1O0o0 oI1O0o0 = (OI1O0o0) obj;
                    return this.I00000oIO == oI1O0o0.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, oI1O0o0.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (Boolean.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "NanoChatMsg(isUser=" + this.I00000oIO + ", text=" + this.I00000oOI + ")";
                }
            }
