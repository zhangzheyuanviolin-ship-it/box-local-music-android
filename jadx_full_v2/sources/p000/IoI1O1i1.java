            package p000;
            
            public final class IoI1O1i1 {
                public final IlliIl1l11O I00000oIO;
                public final int I00000oOI;

                public IoI1O1i1(int i, IlliIl1l11O illiIl1l11O) {
/* 1 */             this.I00000oOI = i;
/* 6 */             this.I00000oIO = illiIl1l11O;
                }

                public final float I00000oIO(float f, O0iOOo0Ii o0iOOo0Ii, O0iOOo0Ii o0iOOo0Ii2) {
                    switch (this.I00000oOI) {
                        case 0:
/* 75 */                    return Float.intBitsToFloat((int) (o0iOOo0Ii2.I00IoIO0lI(o0iOOo0Ii, (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(((int) (o0iOOo0Ii.I000iOII() >> 32)) / 2.0f) << 32)) & 4294967295L));
                        default:
/* 22 */                    float fI000iOII = ((int) (o0iOOo0Ii.I000iOII() & 4294967295L)) / 2.0f;
/* 42 */                    return Float.intBitsToFloat((int) (o0iOOo0Ii2.I00IoIO0lI(o0iOOo0Ii, (Float.floatToRawIntBits(fI000iOII) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
                    }
                }
            }
