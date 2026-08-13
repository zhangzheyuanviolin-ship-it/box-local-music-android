            package p000;
            
            public final class OlIIlI extends IooIlO1 {
                public int I00iOIl;
                public OlIIioolI I00iiI;

                @Override
                public final boolean hasNext() {
                    return this.I00iOIl < this.I00iiI.I0000O();
                }

                @Override
                public final int nextInt() {
/* 1 */             OlIIioolI olIIioolI = this.I00iiI;
/* 3 */             int i = this.I00iOIl;
/* 7 */             this.I00iOIl = i + 1;
/* 9 */             return olIIioolI.I00000oOI(i);
                }
            }
