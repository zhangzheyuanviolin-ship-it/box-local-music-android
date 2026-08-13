            package p000;

            import java.util.ArrayList;
            
            public final class Il0Oo11iiO {
                public String I00000oIO;
                public ArrayList I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof Il0Oo11iiO)) {
/* 39 */                return false;
                    }
/* 9 */             Il0Oo11iiO il0Oo11iiO = (Il0Oo11iiO) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, il0Oo11iiO.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, il0Oo11iiO.I00000oOI) && this.I0000Il00O == il0Oo11iiO.I0000Il00O;
                }

                public final int hashCode() {
/* 24 */            return Integer.hashCode(this.I0000Il00O) + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             ArrayList arrayList = this.I00000oOI;
/* 5 */             int i = this.I0000Il00O;
/* 11 */            StringBuilder sb = new StringBuilder("EnrolledPerson(name=");
/* 14 */            sb.append(str);
/* 19 */            sb.append(", thumbnails=");
/* 22 */            sb.append(arrayList);
/* 27 */            sb.append(", sampleCount=");
/* 32 */            return IIl001iO0Io.I000lI(i, ")", sb);
                }
            }
