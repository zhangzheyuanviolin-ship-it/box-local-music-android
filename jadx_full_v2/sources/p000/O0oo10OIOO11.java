            package p000;

            import android.graphics.Paint;
            import android.text.style.LineHeightSpan;
            
            public final class O0oo10OIOO11 implements LineHeightSpan {
                public final float I00iOIl;
                public final int I00iiI;
                public final boolean I00iiO;
                public final boolean I00iio;
                public final float I00ilI0I1;
                public final int I00ilO0;
                public int I00io1l = Integer.MIN_VALUE;
                public int I00ioIO = Integer.MIN_VALUE;
                public int I00l0I0l0lO1 = Integer.MIN_VALUE;
                public int I00l0OO0IO = Integer.MIN_VALUE;
                public int I00li1OI;
                public int I00ll1;

                public O0oo10OIOO11(float f, int i, boolean z, boolean z2, float f2, int i2) {
/* 4 */             this.I00iOIl = f;
/* 6 */             this.I00iiI = i;
/* 8 */             this.I00iiO = z;
/* 10 */            this.I00iio = z2;
/* 12 */            this.I00ilI0I1 = f2;
/* 14 */            this.I00ilO0 = i2;
/* 29 */            if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
/* 47 */                Ioliol.I0000Il00O("topRatio should be in [0..1] range or -1");
                    }
                }

                @Override
                public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
/* 1 */             int i5 = fontMetricsInt.descent;
/* 3 */             int i6 = fontMetricsInt.ascent;
/* 7 */             if (i5 - i6 <= 0) {
/* 42 */                return;
                    }
/* 16 */            boolean z = i == 0;
/* 23 */            boolean z2 = i2 == this.I00iiI;
/* 25 */            int i7 = this.I00ilO0;
/* 27 */            boolean z3 = this.I00iio;
/* 29 */            boolean z4 = this.I00iiO;
/* 31 */            if (z && z2 && z4 && z3 && i7 != 2) {
/* 42 */                return;
                    }
/* 47 */            if (this.I00io1l == Integer.MIN_VALUE) {
/* 49 */                int i8 = i5 - i6;
/* 58 */                int iCeil = (int) Math.ceil(this.I00iOIl);
/* 59 */                int i9 = iCeil - i8;
/* 61 */                if (i7 != 1 || i9 > 0) {
/* 85 */                    float fAbs = this.I00ilI0I1;
/* 89 */                    if (fAbs == -1.0f) {
/* 104 */                       fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                            }
/* 116 */                   int iCeil2 = (int) (i9 <= 0 ? Math.ceil(i9 * fAbs) : Math.ceil((1.0f - fAbs) * i9));
/* 129 */                   int i10 = fontMetricsInt.descent;
/* 131 */                   int i11 = iCeil2 + i10;
/* 132 */                   this.I00l0I0l0lO1 = i11;
/* 134 */                   int i12 = i11 - iCeil;
/* 136 */                   this.I00ioIO = i12;
/* 138 */                   if (i7 == 0 || i9 >= 0) {
/* 143 */                       if (z4) {
/* 145 */                           i12 = fontMetricsInt.ascent;
                                }
/* 147 */                       this.I00io1l = i12;
/* 149 */                       if (z3) {
/* 151 */                           i11 = i10;
                                }
/* 152 */                       this.I00l0OO0IO = i11;
/* 157 */                       this.I00li1OI = fontMetricsInt.ascent - i12;
/* 160 */                       this.I00ll1 = i11 - i10;
                            } else if (i7 == 2) {
/* 165 */                       int i13 = fontMetricsInt.ascent;
/* 178 */                       this.I00io1l = z4 ? Math.max(i13, i12) : Math.min(i13, i12);
/* 180 */                       int i14 = fontMetricsInt.descent;
/* 182 */                       int i15 = this.I00l0I0l0lO1;
/* 195 */                       this.I00l0OO0IO = z3 ? Math.min(i14, i15) : Math.max(i14, i15);
/* 197 */                       this.I00li1OI = 0;
/* 199 */                       this.I00ll1 = 0;
                            }
                        } else {
/* 65 */                    int i16 = fontMetricsInt.ascent;
/* 67 */                    this.I00ioIO = i16;
/* 69 */                    int i17 = fontMetricsInt.descent;
/* 71 */                    this.I00l0I0l0lO1 = i17;
/* 73 */                    this.I00io1l = i16;
/* 75 */                    this.I00l0OO0IO = i17;
/* 77 */                    this.I00li1OI = 0;
/* 79 */                    this.I00ll1 = 0;
                        }
                    }
/* 208 */           fontMetricsInt.ascent = z ? this.I00io1l : this.I00ioIO;
/* 217 */           fontMetricsInt.descent = z2 ? this.I00l0OO0IO : this.I00l0I0l0lO1;
                }
            }
