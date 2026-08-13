            package p000;
            
/* 29 */    public final class Io1IiiI11 {
                public static final IIOIIi1ilIO I0000O = iOiOoIiiI.I00000oOI(":");
                public static final IIOIIi1ilIO I0000oI00 = iOiOoIiiI.I00000oOI(":status");
                public static final IIOIIi1ilIO I0001Ioi1lo = iOiOoIiiI.I00000oOI(":method");
                public static final IIOIIi1ilIO I000II = iOiOoIiiI.I00000oOI(":path");
                public static final IIOIIi1ilIO I000O01llI0 = iOiOoIiiI.I00000oOI(":scheme");
                public static final IIOIIi1ilIO I000OOo1O = iOiOoIiiI.I00000oOI(":authority");
                public final IIOIIi1ilIO I00000oIO;
                public final IIOIIi1ilIO I00000oOI;
                public final int I0000Il00O;

                public Io1IiiI11(String str, String str2) {
/* 9 */             IIOIIi1ilIO iIOIIi1ilIO = new IIOIIi1ilIO(str.getBytes(IO1IOI.I00000oIO));
/* 12 */            iIOIIi1ilIO.I00iiO = str;
/* 22 */            IIOIIi1ilIO iIOIIi1ilIO2 = new IIOIIi1ilIO(str2.getBytes(IO1IOI.I00000oIO));
/* 25 */            iIOIIi1ilIO2.I00iiO = str2;
/* 27 */            this(iIOIIi1ilIO, iIOIIi1ilIO2);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Io1IiiI11)) {
/* 7 */                 return false;
                    }
/* 11 */            Io1IiiI11 io1IiiI11 = (Io1IiiI11) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, io1IiiI11.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, io1IiiI11.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 26 */            return this.I00000oIO.I000o00OoI0I() + ": " + this.I00000oOI.I000o00OoI0I();
                }

/* 30 */        public Io1IiiI11(IIOIIi1ilIO iIOIIi1ilIO, String str) {
/* 33 */            IIOIIi1ilIO iIOIIi1ilIO2 = new IIOIIi1ilIO(str.getBytes(IO1IOI.I00000oIO));
/* 34 */            iIOIIi1ilIO2.I00iiO = str;
/* 35 */            this(iIOIIi1ilIO, iIOIIi1ilIO2);
                }

/* 35 */        public Io1IiiI11(IIOIIi1ilIO iIOIIi1ilIO, IIOIIi1ilIO iIOIIi1ilIO2) {
/* 37 */            this.I00000oIO = iIOIIi1ilIO;
/* 38 */            this.I00000oOI = iIOIIi1ilIO2;
/* 40 */            this.I0000Il00O = iIOIIi1ilIO2.I00000oOI() + iIOIIi1ilIO.I00000oOI() + 32;
                }
            }
