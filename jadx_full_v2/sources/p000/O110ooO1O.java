            package p000;

            import java.util.List;
            
/* 11 */    public final class O110ooO1O {
                public final int I00000oIO;
                public final int I00000oOI;
                public final List I0000Il00O;
                public final List I0000O;

                public O110ooO1O(int i, int i2, List list, List list2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = list;
/* 10 */            this.I0000O = list2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O110ooO1O)) {
/* 7 */                 return false;
                    }
/* 11 */            O110ooO1O o110ooO1O = (O110ooO1O) obj;
                    return this.I00000oIO == o110ooO1O.I00000oIO && this.I00000oOI == o110ooO1O.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, o110ooO1O.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, o110ooO1O.I0000O);
                }

                public final int hashCode() {
/* 28 */            return this.I0000O.hashCode() + IIl001iO0Io.I0000oI00(IIl001iO0Io.I0000O(this.I00000oOI, Integer.hashCode(this.I00000oIO) * 31, 31), 31, this.I0000Il00O);
                }

                public final String toString() {
/* 11 */            StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("LiveOverlay(srcW=", this.I00000oIO, ", srcH=", this.I00000oOI, ", faces=");
/* 17 */            sbI0010I0i.append(this.I0000Il00O);
/* 22 */            sbI0010I0i.append(", meshes=");
/* 27 */            sbI0010I0i.append(this.I0000O);
/* 32 */            sbI0010I0i.append(")");
/* 35 */            return sbI0010I0i.toString();
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 12 */        public O110ooO1O(int i, int i2) {
                    Il01100l il01100l = Il01100l.I00iOIl;
/* 13 */            this(i, i2, il01100l, il01100l);
                }
            }
