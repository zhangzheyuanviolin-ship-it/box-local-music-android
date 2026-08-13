            package p000;

            import android.graphics.Paint;
            import android.text.TextPaint;
            import android.text.style.CharacterStyle;
            import android.text.style.UpdateAppearance;
            
            public final class IillooIlIO extends CharacterStyle implements UpdateAppearance {
                public Iilloo0IOoIo I00iOIl;

                @Override
                public final void updateDrawState(TextPaint textPaint) {
/* 1 */             Iilloo0IOoIo iilloo0IOoIo = this.I00iOIl;
/* 3 */             if (textPaint != null) {
/* 11 */                if (O0000Ioio00.I0000O(iilloo0IOoIo, IlIl1I110o0I.I00000oIO)) {
/* 15 */                    textPaint.setStyle(Paint.Style.FILL);
/* 18 */                    return;
                        }
/* 21 */                if (!(iilloo0IOoIo instanceof OlOooI0l0011)) {
/* 98 */                    I000II.I00000oIO();
/* 168 */                   return;
                        }
/* 25 */                textPaint.setStyle(Paint.Style.STROKE);
/* 28 */                OlOooI0l0011 olOooI0l0011 = (OlOooI0l0011) iilloo0IOoIo;
/* 32 */                textPaint.setStrokeWidth(olOooI0l0011.I00000oIO);
/* 37 */                textPaint.setStrokeMiter(olOooI0l0011.I00000oOI);
/* 40 */                int i = olOooI0l0011.I0000O;
/* 61 */                textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
/* 64 */                int i2 = olOooI0l0011.I0000Il00O;
/* 83 */                textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
/* 86 */                I0ol1Ioloo i0ol1Ioloo = olOooI0l0011.I0000oI00;
/* 94 */                textPaint.setPathEffect(i0ol1Ioloo != null ? i0ol1Ioloo.I00000oIO : null);
                    }
                }
            }
