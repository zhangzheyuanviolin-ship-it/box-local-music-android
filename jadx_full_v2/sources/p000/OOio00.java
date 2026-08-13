            package p000;

            import java.util.List;
            
/* 11 */    public final class OOio00 {
                public final long I00000oIO;
                public final boolean I00000oOI;
                public final String I0000Il00O;
                public final List I0000O;

                public OOio00(long j, boolean z, String str, List list) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = z;
/* 8 */             this.I0000Il00O = str;
/* 10 */            this.I0000O = list;
                }

                public static OOio00 I00000oIO(OOio00 oOio00, String str, List list, int i) {
/* 1 */             long j = oOio00.I00000oIO;
/* 3 */             boolean z = oOio00.I00000oOI;
/* 7 */             if ((i & 4) != 0) {
/* 9 */                 str = oOio00.I0000Il00O;
                    }
/* 11 */            String str2 = str;
/* 14 */            if ((i & 8) != 0) {
/* 16 */                list = oOio00.I0000O;
                    }
/* 21 */            return new OOio00(j, z, str2, list);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 50 */                return true;
                    }
/* 6 */             if (!(obj instanceof OOio00)) {
/* 48 */                return false;
                    }
/* 9 */             OOio00 oOio00 = (OOio00) obj;
                    return this.I00000oIO == oOio00.I00000oIO && this.I00000oOI == oOio00.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, oOio00.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oOio00.I0000O);
                }

                public final int hashCode() {
/* 28 */            return this.I0000O.hashCode() + Oi010OO0.I000O01llI0(Oi010OO0.I000OOo1O(Long.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O);
                }

                public final String toString() {
/* 48 */            return "RagChatMessage(id=" + this.I00000oIO + ", isUser=" + this.I00000oOI + ", text=" + this.I0000Il00O + ", sources=" + this.I0000O + ")";
                }

/* 12 */        public OOio00(boolean z, String str, long j) {
/* 14 */            this(j, z, str, Il01100l.I00iOIl);
                }
            }
