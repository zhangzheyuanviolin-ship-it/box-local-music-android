            package p000;
            
            public final class IoiOolO1iOo {
                public static int I000iOII;
                public static final iolOOiI I000l1 = new iolOOiI(12);
                public String I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public float I0000O;
                public float I0000oI00;
                public Ooo1O0II I0001Ioi1lo;
                public long I000II;
                public int I000O01llI0;
                public boolean I000OOo1O;
                public int I000OiO;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 97 */                return true;
                    }
/* 6 */             if (!(obj instanceof IoiOolO1iOo)) {
/* 99 */                return false;
                    }
/* 11 */            IoiOolO1iOo ioiOolO1iOo = (IoiOolO1iOo) obj;
/* 19 */            if (!O0000Ioio00.I0000O(this.I00000oIO, ioiOolO1iOo.I00000oIO) || !Iil1010O.I0000Il00O(this.I00000oOI, ioiOolO1iOo.I00000oOI) || !Iil1010O.I0000Il00O(this.I0000Il00O, ioiOolO1iOo.I0000Il00O) || this.I0000O != ioiOolO1iOo.I0000O || this.I0000oI00 != ioiOolO1iOo.I0000oI00 || !this.I0001Ioi1lo.equals(ioiOolO1iOo.I0001Ioi1lo)) {
/* 99 */                return false;
                    }
/* 71 */            long j = this.I000II;
/* 73 */            long j2 = ioiOolO1iOo.I000II;
/* 75 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(j, j2) && this.I000O01llI0 == ioiOolO1iOo.I000O01llI0 && this.I000OOo1O == ioiOolO1iOo.I000OOo1O;
                }

                public final int hashCode() {
/* 41 */            int iHashCode = (this.I0001Ioi1lo.hashCode() + OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31, this.I0000O), 31, this.I0000oI00)) * 31;
/* 42 */            long j = this.I000II;
/* 44 */            int i = IOOiio0i.I000oI1ioi;
/* 62 */            return Boolean.hashCode(this.I000OOo1O) + IIl001iO0Io.I0000O(this.I000O01llI0, IIlIOloOOO.I0000O(j, iHashCode, 31), 31);
                }
            }
