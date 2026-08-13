            package p000;
            
/* 20 */    public final class Olo0loOlIO {
                public static final Olo0loOlIO I0000oI00 = new Olo0loOlIO(null, 15);
                public final Oo0lloOiiIOI I00000oIO;
                public final Oo0o1OiIo I00000oOI;
                public final IOOiio0i I0000Il00O;
                public final Float I0000O;

                public Olo0loOlIO(IOOiio0i iOOiio0i, int i) {
/* 18 */            this(null, null, (i & 4) != 0 ? null : iOOiio0i, (i & 8) != 0 ? null : Float.valueOf(1.0f));
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Olo0loOlIO)) {
/* 7 */                 return false;
                    }
/* 11 */            Olo0loOlIO olo0loOlIO = (Olo0loOlIO) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, olo0loOlIO.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, olo0loOlIO.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, olo0loOlIO.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, olo0loOlIO.I0000O);
                }

                public final int hashCode() {
/* 2 */             Oo0lloOiiIOI oo0lloOiiIOI = this.I00000oIO;
/* 12 */            int iHashCode = (oo0lloOiiIOI == null ? 0 : oo0lloOiiIOI.hashCode()) * 31;
/* 14 */            Oo0o1OiIo oo0o1OiIo = this.I00000oOI;
/* 27 */            int iHashCode2 = (iHashCode + (oo0o1OiIo == null ? 0 : Long.hashCode(oo0o1OiIo.I00000oIO))) * 31;
/* 29 */            IOOiio0i iOOiio0i = this.I0000Il00O;
/* 42 */            int iHashCode3 = (iHashCode2 + (iOOiio0i == null ? 0 : Long.hashCode(iOOiio0i.I00000oIO))) * 31;
/* 44 */            Float f = this.I0000O;
/* 53 */            return iHashCode3 + (f != null ? f.hashCode() : 0);
                }

                public final String toString() {
/* 48 */            return "TableStyle(headerTextStyle=" + this.I00000oIO + ", cellPadding=" + this.I00000oOI + ", borderColor=" + this.I0000Il00O + ", borderStrokeWidth=" + this.I0000O + ")";
                }

/* 21 */        public Olo0loOlIO(Oo0lloOiiIOI oo0lloOiiIOI, Oo0o1OiIo oo0o1OiIo, IOOiio0i iOOiio0i, Float f) {
/* 23 */            this.I00000oIO = oo0lloOiiIOI;
/* 24 */            this.I00000oOI = oo0o1OiIo;
/* 25 */            this.I0000Il00O = iOOiio0i;
/* 26 */            this.I0000O = f;
                }
            }
