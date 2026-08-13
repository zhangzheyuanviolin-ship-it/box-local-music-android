            package p000;
            
            public final class IoI1Ilo implements IlliIl1l11O {
                public final int I00iOIl;
                public IoI1O1i1[] I00iiI;

                public IoI1Ilo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    float fI00000oIO;
/* 1 */             int i = this.I00iOIl;
/* 3 */             IoI1O1i1[] ioI1O1i1Arr = this.I00iiI;
/* 5 */             OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 9 */             float fFloatValue = ((Float) obj2).floatValue();
                    switch (i) {
                        case 0:
/* 27 */                    fI00000oIO = lO00Ilo.I00000oIO(oO11o0IO, false, ioI1O1i1Arr, fFloatValue);
                            break;
                        default:
/* 17 */                    fI00000oIO = lO00Ilo.I00000oIO(oO11o0IO, true, ioI1O1i1Arr, fFloatValue);
                            break;
                    }
/* 21 */            return Float.valueOf(fI00000oIO);
                }
            }
