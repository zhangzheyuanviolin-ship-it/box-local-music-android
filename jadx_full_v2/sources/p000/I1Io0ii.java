            package p000;
            
            public final class I1Io0ii extends I011lIilI0lo {
                public int I00iiO;
                public I1Io0li1Ol1I I00iio;

                @Override
                public final void I00000oIO() {
                    int i;
                    Object[] objArr;
/* 16 */            do {
/* 4 */                 i = this.I00iiO + 1;
/* 5 */                 this.I00iiO = i;
/* 9 */                 objArr = this.I00iio.I00iOIl;
/* 12 */                if (i >= objArr.length) {
                            break;
                        }
/* 16 */            } while (objArr[i] == null);
/* 19 */            if (i >= objArr.length) {
/* 22 */                this.I00iOIl = 2;
                    } else {
/* 27 */                this.I00iiI = objArr[i];
/* 29 */                this.I00iOIl = 1;
                    }
                }
            }
