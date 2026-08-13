            package p000;
            
/* 12 */    public final class IioIO1i {
                public final int I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public int I0000O;

                public IioIO1i() {
/* 2 */             this.I00000oIO = 0;
/* 7 */             this.I00000oOI = 0;
/* 9 */             this.I0000Il00O = 0;
/* 11 */            this.I0000O = 0;
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 1:
/* 35 */                    return String.format("RangeRecord[startGlyphID=%d,endGlyphID=%d,startCoverageIndex=%d]", Integer.valueOf(this.I00000oOI), Integer.valueOf(this.I0000Il00O), Integer.valueOf(this.I0000O));
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
