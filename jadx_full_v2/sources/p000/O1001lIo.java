            package p000;
            
            public final class O1001lIo implements OlIIi101 {
                public final O1001oo I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;

                public O1001lIo(O1001oo o1001oo, int i, int i2) {
/* 4 */             this.I00000oIO = o1001oo;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = i2;
                }

                @Override
                public final int getBeginIndex() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final int getEndIndex() {
/* 1 */             return this.I0000Il00O;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Link{type=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", beginIndex=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", endIndex=");
/* 32 */            return IIl001iO0Io.I000lI(this.I0000Il00O, "}", sb);
                }
            }
