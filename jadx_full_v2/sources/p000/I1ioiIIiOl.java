            package p000;

            import android.content.Context;
            
            public final class I1ioiIIiOl extends Ii0O0olil1o {
                public Context I00000oIO;
                public IOO0l0i0Oo I00000oOI;
                public IOO0l0i0Oo I0000Il00O;
                public String I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof Ii0O0olil1o) {
/* 14 */                I1ioiIIiOl i1ioiIIiOl = (I1ioiIIiOl) ((Ii0O0olil1o) obj);
/* 22 */                if (this.I00000oIO.equals(i1ioiIIiOl.I00000oIO) && this.I00000oOI.equals(i1ioiIIiOl.I00000oOI) && this.I0000Il00O.equals(i1ioiIIiOl.I0000Il00O) && this.I0000O.equals(i1ioiIIiOl.I0000O)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 34 */            return this.I0000O.hashCode() ^ ((((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003) ^ this.I0000Il00O.hashCode()) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", wallClock=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", monotonicClock=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", backendName=");
/* 42 */            return IIl001iO0Io.I00100l0(sb, this.I0000O, "}");
                }
            }
