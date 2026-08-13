            package p000;

            import java.util.Iterator;
            import java.util.List;
            
            public final class Io1Iil10 {
                public final String I00000oIO;
                public final List I00000oOI;

                public Io1Iil10(String str, List list) {
                    Object next;
                    String str2;
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = list;
/* 10 */            Iterator it = list.iterator();
                    while (true) {
/* 18 */                if (!it.hasNext()) {
/* 38 */                    next = null;
                            break;
                        } else {
/* 20 */                    next = it.next();
/* 35 */                    if (O0000Ioio00.I0000O(((Io1IilIliiI) next).I00000oIO, "q")) {
                                break;
                            }
                        }
                    }
/* 39 */            Io1IilIliiI io1IilIliiI = (Io1IilIliiI) next;
/* 41 */            if (io1IilIliiI == null || (str2 = io1IilIliiI.I00000oOI) == null) {
/* 89 */                return;
                    }
/* 47 */            OlOoll1I0.I0001Ioi1lo(str2);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Io1Iil10)) {
/* 7 */                 return false;
                    }
/* 11 */            Io1Iil10 io1Iil10 = (Io1Iil10) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, io1Iil10.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, io1Iil10.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "HeaderValue(value=" + this.I00000oIO + ", params=" + this.I00000oOI + ')';
                }
            }
