            package p000;
            
            public final class IoiiO1O1 {
                public static final IoiiO1O1 I000II = new IoiiO1O1(false, 0, true, 1, 1, O11oiiOIl0O.I00iiO);
                public final boolean I00000oIO;
                public final int I00000oOI;
                public final boolean I0000Il00O;
                public final int I0000O;
                public final int I0000oI00;
                public final O11oiiOIl0O I0001Ioi1lo;

                public IoiiO1O1(boolean z, int i, boolean z2, int i2, int i3, O11oiiOIl0O o11oiiOIl0O) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = z2;
/* 10 */            this.I0000O = i2;
/* 12 */            this.I0000oI00 = i3;
/* 14 */            this.I0001Ioi1lo = o11oiiOIl0O;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 54 */                return true;
                    }
/* 6 */             if (!(obj instanceof IoiiO1O1)) {
/* 56 */                return false;
                    }
/* 9 */             IoiiO1O1 ioiiO1O1 = (IoiiO1O1) obj;
                    return this.I00000oIO == ioiiO1O1.I00000oIO && this.I00000oOI == ioiiO1O1.I00000oOI && this.I0000Il00O == ioiiO1O1.I0000Il00O && this.I0000O == ioiiO1O1.I0000O && this.I0000oI00 == ioiiO1O1.I0000oI00 && O0000Ioio00.I0000O(this.I0001Ioi1lo, ioiiO1O1.I0001Ioi1lo);
                }

                public final int hashCode() {
/* 44 */            return this.I0001Ioi1lo.I00iOIl.hashCode() + IIl001iO0Io.I0000O(this.I0000oI00, IIl001iO0Io.I0000O(this.I0000O, Oi010OO0.I000OOo1O(IIl001iO0Io.I0000O(this.I00000oOI, Boolean.hashCode(this.I00000oIO) * 31, 31), 31, this.I0000Il00O), 31), 961);
                }

                public final String toString() {
/* 2 */             int i = this.I00000oOI;
/* 107 */           return "ImeOptions(singleLine=" + this.I00000oIO + ", capitalization=" + (i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid") + ", autoCorrect=" + this.I0000Il00O + ", keyboardType=" + O0OO00ooo1i.I00000oIO(this.I0000O) + ", imeAction=" + IoiiIoIo.I00000oOI(this.I0000oI00) + ", platformImeOptions=null, hintLocales=" + this.I0001Ioi1lo + ")";
                }
            }
