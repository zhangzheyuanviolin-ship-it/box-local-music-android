            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OooOo1 implements O0iOliloIli {
                public Oo0I110i I00000oIO;
                public int I00000oOI;
                public OoI0llll I0000Il00O;
                public IllOOo00lI I0000O;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 13 */            OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0oO11ll1O.I0000Il00O(j, 0, 0, 0, Integer.MAX_VALUE, 7));
/* 23 */            int iMin = Math.min(oO1I0001000iI001lllioOl.I00iiI, IOo0oO11ll1O.I000OOo1O(j));
/* 27 */            int i = oO1I0001000iI001lllioOl.I00iOIl;
/* 32 */            II0oo1oO1 iI0oo1oO1 = new II0oo1oO1(3);
/* 35 */            iI0oo1oO1.I00iio = this;
/* 37 */            iI0oo1oO1.I00iiO = oO1I0001000iI001lllioOl;
/* 39 */            iI0oo1oO1.I00iiI = iMin;
/* 41 */            VarHandle.storeStoreFence();
/* 46 */            return o1iOIoOiO0.I001i1lo1io(i, iMin, Il011I1OiO0I.I00iOIl, iI0oo1oO1);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 48 */                return true;
                    }
/* 7 */             if (obj instanceof OooOo1) {
/* 10 */                OooOo1 oooOo1 = (OooOo1) obj;
/* 16 */                if (this.I00000oIO == oooOo1.I00000oIO && this.I00000oOI == oooOo1.I00000oOI && this.I0000Il00O.equals(oooOo1.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oooOo1.I0000O)) {
/* 48 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 30 */            return this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + IIl001iO0Io.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31)) * 31);
                }

                public final String toString() {
/* 48 */            return "VerticalScrollLayoutModifier(scrollerPosition=" + this.I00000oIO + ", cursorOffset=" + this.I00000oOI + ", transformedText=" + this.I0000Il00O + ", textLayoutResultProvider=" + this.I0000O + ")";
                }
            }
