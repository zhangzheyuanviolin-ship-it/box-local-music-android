            package p000;

            import java.util.List;
            
            public final class Oo0iiO1 {
                public final I1111OO10i I00000oIO;
                public final Oo0lloOiiIOI I00000oOI;
                public final List I0000Il00O;
                public final int I0000O;
                public final boolean I0000oI00;
                public final int I0001Ioi1lo;
                public final IiIooOOOI I000II;
                public final O0iOOoiioO I000O01llI0;
                public final IliO0o11i01 I000OOo1O;
                public final long I000OiO;

                public Oo0iiO1(I1111OO10i i1111OO10i, Oo0lloOiiIOI oo0lloOiiIOI, List list, int i, boolean z, int i2, IiIooOOOI iiIooOOOI, O0iOOoiioO o0iOOoiioO, IliO0o11i01 iliO0o11i01, long j) {
/* 4 */             this.I00000oIO = i1111OO10i;
/* 6 */             this.I00000oOI = oo0lloOiiIOI;
/* 8 */             this.I0000Il00O = list;
/* 10 */            this.I0000O = i;
/* 12 */            this.I0000oI00 = z;
/* 14 */            this.I0001Ioi1lo = i2;
/* 16 */            this.I000II = iiIooOOOI;
/* 18 */            this.I000O01llI0 = o0iOOoiioO;
/* 20 */            this.I000OOo1O = iliO0o11i01;
/* 22 */            this.I000OiO = j;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 106 */               return true;
                    }
/* 7 */             if (!(obj instanceof Oo0iiO1)) {
/* 108 */               return false;
                    }
/* 11 */            Oo0iiO1 oo0iiO1 = (Oo0iiO1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oo0iiO1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oo0iiO1.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oo0iiO1.I0000Il00O) && this.I0000O == oo0iiO1.I0000O && this.I0000oI00 == oo0iiO1.I0000oI00 && this.I0001Ioi1lo == oo0iiO1.I0001Ioi1lo && O0000Ioio00.I0000O(this.I000II, oo0iiO1.I000II) && this.I000O01llI0 == oo0iiO1.I000O01llI0 && O0000Ioio00.I0000O(this.I000OOo1O, oo0iiO1.I000OOo1O) && IOo0oO11ll1O.I0000O(this.I000OiO, oo0iiO1.I000OiO);
                }

                public final int hashCode() {
/* 68 */            return Long.hashCode(this.I000OiO) + ((this.I000OOo1O.hashCode() + ((this.I000O01llI0.hashCode() + ((this.I000II.hashCode() + IIl001iO0Io.I0000O(this.I0001Ioi1lo, Oi010OO0.I000OOo1O((IIl001iO0Io.I0000oI00(Oi010OO0.I000OiO(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31), 31, this.I0000Il00O) + this.I0000O) * 31, 31, this.I0000oI00), 31)) * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 116 */           return "TextLayoutInput(text=" + ((Object) this.I00000oIO) + ", style=" + this.I00000oOI + ", placeholders=" + this.I0000Il00O + ", maxLines=" + this.I0000O + ", softWrap=" + this.I0000oI00 + ", overflow=" + lOliIoOili.I00000oIO(this.I0001Ioi1lo) + ", density=" + this.I000II + ", layoutDirection=" + this.I000O01llI0 + ", fontFamilyResolver=" + this.I000OOo1O + ", constraints=" + IOo0oO11ll1O.I000lI(this.I000OiO) + ")";
                }
            }
