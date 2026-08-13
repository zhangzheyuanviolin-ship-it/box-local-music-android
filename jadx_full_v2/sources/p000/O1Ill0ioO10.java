            package p000;

            import io.github.darriousliu.katex.freetype.FreeTypeAndroid;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.List;
            
            public final class O1Ill0ioO10 {
                public float I00000oIO;
                public String I00000oOI;
                public int I0000Il00O;
                public Il1oollOO1iI I0000O;
                public O0i1llII I0000oI00;

                public final float I00000oIO(String str) {
/* 17 */            return I00000oOI(((Number) ((HashMap) this.I0000oI00.I0000O).get(str)).intValue());
                }

                public final float I00000oOI(int i) {
/* 8 */             return (i * this.I00000oIO) / this.I0000Il00O;
                }

                public final float I0000Il00O(long j) {
/* 8 */             return (j * this.I00000oIO) / this.I0000Il00O;
                }

                public final void I0000O(List list, Float[] fArr, int i) {
                    I0OIIiOo0O i0OIIiOo0O;
/* 1 */             Il1oollOO1iI il1oollOO1iI = this.I0000O;
/* 5 */             for (int i2 = 0; i2 < i; i2++) {
/* 13 */                int iIntValue = ((Number) list.get(i2)).intValue();
/* 17 */                il1oollOO1iI.getClass();
/* 20 */                FreeTypeAndroid freeTypeAndroid = IoOil1.I00000oIO;
/* 29 */                if (freeTypeAndroid.loadGlyph(il1oollOO1iI.I00000oIO, iIntValue, 1)) {
/* 31 */                    II0lO0IOI iI0lO0IOII00000oIO = il1oollOO1iI.I00000oIO();
/* 35 */                    if (iI0lO0IOII00000oIO != null) {
/* 39 */                        long[] jArrGlyphSlotGetAdvance = freeTypeAndroid.glyphSlotGetAdvance(iI0lO0IOII00000oIO.I00000oIO);
/* 45 */                        long j = jArrGlyphSlotGetAdvance[0];
/* 47 */                        long j2 = jArrGlyphSlotGetAdvance[1];
/* 49 */                        i0OIIiOo0O = new I0OIIiOo0O();
/* 52 */                        i0OIIiOo0O.I00000oOI = j;
/* 54 */                        i0OIIiOo0O.I0000Il00O = j2;
/* 56 */                        VarHandle.storeStoreFence();
                            } else {
/* 60 */                        i0OIIiOo0O = null;
                            }
/* 61 */                    if (i0OIIiOo0O != null) {
/* 73 */                        fArr[i2] = Float.valueOf(I0000Il00O(i0OIIiOo0O.I00000oOI));
                            }
                        }
                    }
                }

                public final void I0000oI00(List list, II1i0i0ilO[] iI1i0i0ilOArr, int i) {
/* 3 */             Il1oollOO1iI il1oollOO1iI = this.I0000O;
/* 5 */             float fMin = 0.0f;
/* 6 */             int i2 = 0;
/* 9 */             float f = 0.0f;
/* 10 */            float f2 = 0.0f;
/* 11 */            float f3 = 0.0f;
/* 12 */            int i3 = 0;
/* 13 */            while (i3 < i) {
/* 23 */                int iIntValue = ((Number) list.get(i3)).intValue();
/* 27 */                il1oollOO1iI.getClass();
/* 30 */                FreeTypeAndroid freeTypeAndroid = IoOil1.I00000oIO;
/* 39 */                if (freeTypeAndroid.loadGlyph(il1oollOO1iI.I00000oIO, iIntValue, 1)) {
/* 43 */                    II1i0i0ilO iI1i0i0ilO = new II1i0i0ilO(i2);
/* 46 */                    II0lO0IOI iI0lO0IOII00000oIO = il1oollOO1iI.I00000oIO();
/* 58 */                    long j = (iI0lO0IOII00000oIO != null ? iI0lO0IOII00000oIO.I00000oIO() : null).I00000oIO;
/* 64 */                    float fI0000Il00O = I0000Il00O(freeTypeAndroid.glyphMetricsGetWidth(j));
/* 68 */                    float f4 = f;
/* 74 */                    float fI0000Il00O2 = I0000Il00O(freeTypeAndroid.glyphMetricsGetHeight(j));
/* 84 */                    float fI0000Il00O3 = I0000Il00O(freeTypeAndroid.glyphMetricsGetHoriBearingX(j));
/* 92 */                    float fI0000Il00O4 = I0000Il00O(freeTypeAndroid.glyphMetricsGetHoriBearingY(j));
/* 96 */                    iI1i0i0ilO.I00000oOI = fI0000Il00O3;
/* 100 */                   iI1i0i0ilO.I0000Il00O = fI0000Il00O4 - fI0000Il00O2;
/* 103 */                   iI1i0i0ilO.I0000O = fI0000Il00O + fI0000Il00O3;
/* 105 */                   iI1i0i0ilO.I0000oI00 = fI0000Il00O4;
/* 107 */                   fMin = Math.min(fMin, fI0000Il00O3);
/* 115 */                   float fMin2 = Math.min(f4, iI1i0i0ilO.I0000Il00O);
/* 121 */                   float fMax = Math.max(f2, iI1i0i0ilO.I0000O);
/* 127 */                   float fMax2 = Math.max(f3, iI1i0i0ilO.I0000oI00);
/* 131 */                   iI1i0i0ilOArr[i3] = iI1i0i0ilO;
/* 133 */                   f3 = fMax2;
/* 134 */                   f2 = fMax;
/* 135 */                   f = fMin2;
                        }
/* 136 */               i3++;
/* 138 */               i2 = 0;
                    }
                }

                public final float I0001Ioi1lo(int i) {
/* 15 */            Integer num = (Integer) ((HashMap) this.I0000oI00.I0001Ioi1lo).get(Integer.valueOf(i));
/* 17 */            if (num != null) {
/* 23 */                return I00000oOI(num.intValue());
                    }
/* 32 */            Integer[] numArr = {Integer.valueOf(i)};
/* 41 */            Float[] fArr = {Float.valueOf(0.0f)};
/* 50 */            I0000O(I1IoiO1l.I00IioO0OiOi(numArr), fArr, 1);
/* 62 */            return fArr[0].floatValue() / 2.0f;
                }
            }
