            package p000;
            
            public final class I000iOII {
                public final boolean I00000oIO;
                public final String I00000oOI;

                public I000iOII(String str, boolean z) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof I000iOII)) {
/* 28 */                return false;
                    }
/* 9 */             I000iOII i000iOII = (I000iOII) obj;
                    return this.I00000oIO == i000iOII.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, i000iOII.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (Boolean.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "AICoreChatMessage(isUser=" + this.I00000oIO + ", text=" + this.I00000oOI + ")";
                }
            }
