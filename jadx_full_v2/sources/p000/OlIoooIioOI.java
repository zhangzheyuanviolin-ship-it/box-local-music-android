            package p000;
            
            public final class OlIoooIioOI implements Ooo1lO01O0 {
                public Ooo1lO01O0 I00iOIl;
                public long I00iiI;

                @Override
                public final boolean I00000oIO() {
/* 3 */             return this.I00iOIl.I00000oIO();
                }

                @Override
                public final long I00000oOI(I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 9 */             return this.I00iOIl.I00000oOI(i110ooool, i110ooool2, i110ooool3) + this.I00iiI;
                }

                @Override
                public final I110ooool I000oI1ioi(long j, I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 1 */             long j2 = this.I00iiI;
                    return j < j2 ? i110ooool3 : this.I00iOIl.I000oI1ioi(j - j2, i110ooool, i110ooool2, i110ooool3);
                }

                @Override
                public final I110ooool I00Io1lO(long j, I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 1 */             long j2 = this.I00iiI;
                    return j < j2 ? i110ooool : this.I00iOIl.I00Io1lO(j - j2, i110ooool, i110ooool2, i110ooool3);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof OlIoooIioOI)) {
/* 3 */                 return false;
                    }
/* 7 */             OlIoooIioOI olIoooIioOI = (OlIoooIioOI) obj;
                    return olIoooIioOI.I00iiI == this.I00iiI && O0000Ioio00.I0000O(olIoooIioOI.I00iOIl, this.I00iOIl);
                }

                public final int hashCode() {
/* 15 */            return Long.hashCode(this.I00iiI) + (this.I00iOIl.hashCode() * 31);
                }
            }
