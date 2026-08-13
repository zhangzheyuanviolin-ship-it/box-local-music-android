            package p000;

            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.text.Layout;
            import android.text.Spanned;
            import android.text.style.LeadingMarginSpan;
            import java.lang.invoke.VarHandle;
            
            public final class Ii0iOiI implements LeadingMarginSpan {
                public float I00iOIl;
                public float I00iiI;
                public Iilloo0IOoIo I00iiO;
                public int I00iio;
                public int I00ilI0I1;

                @Override
                public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
/* 1 */             if (canvas == null) {
/* 1925 */              return;
                    }
/* 9 */             float f = (i3 + i5) / 2.0f;
/* 12 */            int i8 = i - this.I00iio;
/* 13 */            if (i8 < 0) {
/* 15 */                i8 = 0;
                    }
/* 22 */            if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
/* 1925 */              return;
                    }
/* 26 */            Paint.Style style = paint.getStyle();
/* 30 */            Iilloo0IOoIo iilloo0IOoIo = this.I00iiO;
/* 38 */            Integer numValueOf = null;
/* 39 */            if (O0000Ioio00.I0000O(iilloo0IOoIo, IlIl1I110o0I.I00000oIO)) {
/* 43 */                paint.setStyle(Paint.Style.FILL);
                    } else {
/* 49 */                if (!(iilloo0IOoIo instanceof OlOooI0l0011)) {
/* 212 */                   I000II.I00000oIO();
/* 1925 */                  return;
                        }
/* 53 */                paint.setStyle(Paint.Style.STROKE);
/* 56 */                OlOooI0l0011 olOooI0l0011 = (OlOooI0l0011) iilloo0IOoIo;
/* 60 */                paint.setStrokeWidth(olOooI0l0011.I00000oIO);
/* 65 */                paint.setStrokeMiter(olOooI0l0011.I00000oOI);
/* 68 */                int i9 = olOooI0l0011.I0000Il00O;
/* 89 */                paint.setStrokeCap(i9 == 0 ? Paint.Cap.BUTT : i9 == 1 ? Paint.Cap.ROUND : i9 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
/* 92 */                int i10 = olOooI0l0011.I0000O;
/* 111 */               paint.setStrokeJoin(i10 == 0 ? Paint.Join.MITER : i10 == 1 ? Paint.Join.ROUND : i10 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
/* 114 */               I0ol1Ioloo i0ol1Ioloo = olOooI0l0011.I0000oI00;
/* 122 */               paint.setPathEffect(i0ol1Ioloo != null ? i0ol1Ioloo.I00000oIO : null);
                    }
/* 148 */           long jFloatToRawIntBits = (Float.floatToRawIntBits(this.I00iOIl) << 32) | (Float.floatToRawIntBits(this.I00iiI) & 4294967295L);
/* 151 */           Ii0iIolI ii0iIolI = new Ii0iIolI();
/* 154 */           ii0iIolI.I00iOIl = jFloatToRawIntBits;
/* 156 */           ii0iIolI.I00iiI = i2;
/* 158 */           ii0iIolI.I00iiO = canvas;
/* 160 */           ii0iIolI.I00iio = paint;
/* 162 */           ii0iIolI.I00ilI0I1 = i8;
/* 164 */           ii0iIolI.I00ilO0 = f;
/* 166 */           VarHandle.storeStoreFence();
/* 175 */           if (!Float.isNaN(Float.NaN)) {
/* 181 */               numValueOf = Integer.valueOf(paint.getAlpha());
/* 193 */               paint.setAlpha((int) Math.rint(Double.NaN));
                    }
/* 196 */           ii0iIolI.invoke();
/* 199 */           if (numValueOf != null) {
/* 205 */               paint.setAlpha(numValueOf.intValue());
                    }
/* 208 */           paint.setStyle(style);
                }

                @Override
                public final int getLeadingMargin(boolean z) {
/* 1 */             int i = this.I00ilI0I1;
/* 3 */             if (i >= 0) {
/* 5 */                 return 0;
                    }
/* 7 */             return Math.abs(i);
                }
            }
