            package p000;
            
            public final class IIOiiIi implements OlIIi101 {
                public final int I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;

                public IIOiiIi(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public int getBeginIndex() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public int getEndIndex() {
/* 1 */             return this.I0000Il00O;
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 0:
/* 71 */                    StringBuilder sb = new StringBuilder(IIOiiIi.class.getName());
/* 76 */                    sb.append("[first=");
/* 81 */                    sb.append(this.I00000oOI);
/* 86 */                    sb.append(", fd=");
/* 93 */                    return IIl001iO0Io.I000lI(this.I0000Il00O, "]", sb);
                        case 1:
/* 41 */                    StringBuilder sb2 = new StringBuilder("MutableRange(start=");
/* 46 */                    sb2.append(this.I00000oOI);
/* 51 */                    sb2.append(", end=");
/* 58 */                    return Oi010OO0.I001i1lo1io(sb2, this.I0000Il00O, ')');
                        case 2:
                        default:
/* 6 */                     return super.toString();
                        case 3:
/* 15 */                    StringBuilder sb3 = new StringBuilder("Span{beginIndex=");
/* 20 */                    sb3.append(this.I00000oOI);
/* 25 */                    sb3.append(", endIndex=");
/* 32 */                    return IIl001iO0Io.I000lI(this.I0000Il00O, "}", sb3);
                    }
                }
            }
