            package p000;

            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            
            public final class O1oIo0iI00 {
                public final ModelDownloadStatusType I00000oIO;
                public final long I00000oOI;
                public final long I0000Il00O;
                public final String I0000O;
                public final long I0000oI00;
                public final long I0001Ioi1lo;

                public O1oIo0iI00(ModelDownloadStatusType modelDownloadStatusType, long j, long j2, String str, long j3, long j4, int i) {
/* 5 */             j = (i & 2) != 0 ? 0L : j;
/* 10 */            j2 = (i & 4) != 0 ? 0L : j2;
/* 17 */            str = (i & 8) != 0 ? "" : str;
/* 21 */            j3 = (i & 16) != 0 ? 0L : j3;
/* 26 */            j4 = (i & 32) != 0 ? 0L : j4;
/* 32 */            this.I00000oIO = modelDownloadStatusType;
/* 34 */            this.I00000oOI = j;
/* 36 */            this.I0000Il00O = j2;
/* 38 */            this.I0000O = str;
/* 40 */            this.I0000oI00 = j3;
/* 42 */            this.I0001Ioi1lo = j4;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 66 */                return true;
                    }
/* 6 */             if (!(obj instanceof O1oIo0iI00)) {
/* 64 */                return false;
                    }
/* 9 */             O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) obj;
                    return this.I00000oIO == o1oIo0iI00.I00000oIO && this.I00000oOI == o1oIo0iI00.I00000oOI && this.I0000Il00O == o1oIo0iI00.I0000Il00O && this.I0000O.equals(o1oIo0iI00.I0000O) && this.I0000oI00 == o1oIo0iI00.I0000oI00 && this.I0001Ioi1lo == o1oIo0iI00.I0001Ioi1lo;
                }

                public final int hashCode() {
/* 40 */            return Long.hashCode(this.I0001Ioi1lo) + IIlIOloOOO.I0000O(this.I0000oI00, Oi010OO0.I000O01llI0(IIlIOloOOO.I0000O(this.I0000Il00O, IIlIOloOOO.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31), 31), 31, this.I0000O), 31);
                }

                public final String toString() {
/* 68 */            return "ModelDownloadStatus(status=" + this.I00000oIO + ", totalBytes=" + this.I00000oOI + ", receivedBytes=" + this.I0000Il00O + ", errorMessage=" + this.I0000O + ", bytesPerSecond=" + this.I0000oI00 + ", remainingMs=" + this.I0001Ioi1lo + ")";
                }
            }
