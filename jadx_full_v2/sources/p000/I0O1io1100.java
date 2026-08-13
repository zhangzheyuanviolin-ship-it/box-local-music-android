            package p000;
            
            public final class I0O1io1100 {
                public final I0O1io1lOO I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;
                public final IoiOolO1iOo I0000O;

                public I0O1io1100(I0O1io1lOO i0O1io1lOO, int i, int i2, IoiOolO1iOo ioiOolO1iOo) {
/* 4 */             this.I00000oIO = i0O1io1lOO;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = i2;
/* 10 */            this.I0000O = ioiOolO1iOo;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 44 */                return true;
                    }
/* 6 */             if (!(obj instanceof I0O1io1100)) {
/* 42 */                return false;
                    }
/* 9 */             I0O1io1100 i0O1io1100 = (I0O1io1100) obj;
                    return this.I00000oIO == i0O1io1100.I00000oIO && this.I00000oOI == i0O1io1100.I00000oOI && this.I0000Il00O == i0O1io1100.I0000Il00O && this.I0000O.equals(i0O1io1100.I0000O);
                }

                public final int hashCode() {
/* 28 */            return this.I0000O.hashCode() + IIl001iO0Io.I0000O(this.I0000Il00O, IIl001iO0Io.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31), 31);
                }

                public final String toString() {
/* 48 */            return "AddSkillOption(type=" + this.I00000oIO + ", titleResId=" + this.I00000oOI + ", descriptionResId=" + this.I0000Il00O + ", icon=" + this.I0000O + ")";
                }
            }
