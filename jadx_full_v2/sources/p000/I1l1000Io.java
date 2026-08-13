            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1l1000Io {
                public String I00000oIO;
                public String I00000oOI;

                public static I1l1000Io I00000oIO(String str, String str2) {
/* 3 */             I1l1000Io i1l1000Io = new I1l1000Io();
/* 6 */             i1l1000Io.I00000oIO = str;
/* 8 */             if (str2 == null) {
/* 18 */                IOOlIIilOl0.I000II("Null version");
/* 21 */                return null;
                    }
/* 10 */            i1l1000Io.I00000oOI = str2;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            return i1l1000Io;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1l1000Io) {
/* 10 */                I1l1000Io i1l1000Io = (I1l1000Io) obj;
/* 20 */                if (this.I00000oIO.equals(i1l1000Io.I00000oIO) && this.I00000oOI.equals(i1l1000Io.I00000oOI)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            return this.I00000oOI.hashCode() ^ ((this.I00000oIO.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", version=");
/* 22 */            return IIl001iO0Io.I00100l0(sb, this.I00000oOI, "}");
                }
            }
