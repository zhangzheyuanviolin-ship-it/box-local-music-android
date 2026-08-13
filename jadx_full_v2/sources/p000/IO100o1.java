            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class IO100o1 {
                public final I0iolI1I11l1 I00000oIO;
                public final Function1 I00000oOI;
                public final IlIoO1ilo1 I0000Il00O;
                public final boolean I0000O;

                public IO100o1(I0iolI1I11l1 i0iolI1I11l1, Function1 function1, IlIoO1ilo1 ilIoO1ilo1, boolean z) {
/* 4 */             this.I00000oIO = i0iolI1I11l1;
/* 6 */             this.I00000oOI = function1;
/* 8 */             this.I0000Il00O = ilIoO1ilo1;
/* 10 */            this.I0000O = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IO100o1)) {
/* 7 */                 return false;
                    }
/* 11 */            IO100o1 iO100o1 = (IO100o1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iO100o1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iO100o1.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iO100o1.I0000Il00O) && this.I0000O == iO100o1.I0000O;
                }

                public final int hashCode() {
/* 33 */            return Boolean.hashCode(this.I0000O) + ((this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 48 */            return "ChangeSize(alignment=" + this.I00000oIO + ", size=" + this.I00000oOI + ", animationSpec=" + this.I0000Il00O + ", clip=" + this.I0000O + ")";
                }
            }
