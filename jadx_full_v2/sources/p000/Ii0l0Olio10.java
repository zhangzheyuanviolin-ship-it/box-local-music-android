            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Ii0l0Olio10 {
                public final O1ol100o0O I00000oIO;
                public final float I00000oOI;
                public final Function1 I0000Il00O;
                public final Function1 I0000O;
                public final Function1 I0000oI00;
                public final String I0001Ioi1lo;

                public Ii0l0Olio10(O1ol100o0O o1ol100o0O, float f, Function1 function1, Function1 function12, Function1 function13, String str) {
/* 4 */             this.I00000oIO = o1ol100o0O;
/* 6 */             this.I00000oOI = f;
/* 8 */             this.I0000Il00O = function1;
/* 10 */            this.I0000O = function12;
/* 12 */            this.I0000oI00 = function13;
/* 14 */            this.I0001Ioi1lo = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 78 */                return true;
                    }
/* 6 */             if (!(obj instanceof Ii0l0Olio10)) {
/* 76 */                return false;
                    }
/* 9 */             Ii0l0Olio10 ii0l0Olio10 = (Ii0l0Olio10) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ii0l0Olio10.I00000oIO) && Iil1010O.I0000Il00O(this.I00000oOI, ii0l0Olio10.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, ii0l0Olio10.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, ii0l0Olio10.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, ii0l0Olio10.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, ii0l0Olio10.I0001Ioi1lo);
                }

                public final int hashCode() {
/* 39 */            int iHashCode = (this.I0000oI00.hashCode() + ((this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + OooioIOo1.I0000O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI)) * 31)) * 31)) * 31;
/* 40 */            String str = this.I0001Ioi1lo;
/* 50 */            return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
/* 72 */            return "CustomTaskData(modelManagerViewModel=" + this.I00000oIO + ", bottomPadding=" + Iil1010O.I0000O(this.I00000oOI) + ", setAppBarControlsDisabled=" + this.I0000Il00O + ", setTopBarVisible=" + this.I0000O + ", setCustomNavigateUpCallback=" + this.I0000oI00 + ", conversationId=" + this.I0001Ioi1lo + ")";
                }
            }
