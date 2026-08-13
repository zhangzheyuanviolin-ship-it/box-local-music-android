            package p000;

            import android.content.Context;
            import android.graphics.Paint;
            import android.graphics.Typeface;
            import android.util.TypedValue;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class I0oIIIl00 implements OliiillO {
                public Context I00iOIl;

                public Typeface I00000oIO(Oi0l1olOi oi0l1olOi) {
                    String strI00000oIO;
/* 1 */             Context context = this.I00iOIl;
/* 6 */             if (!(oi0l1olOi instanceof Oi0l1olOi)) {
/* 5 */                 return null;
                    }
/* 8 */             int i = oi0l1olOi.I00000oIO;
/* 10 */            ThreadLocal threadLocal = Oi0oolOI.I00000oIO;
/* 28 */            Typeface typefaceI00000oIO = context.isRestricted() ? null : Oi0oolOI.I00000oIO(context, i, new TypedValue(), 0, null, false);
/* 34 */            List list = oi0l1olOi.I0000O.I00000oIO;
/* 36 */            ThreadLocal threadLocal2 = OoOl1OI01Ioi.I00000oIO;
/* 38 */            if (typefaceI00000oIO == null) {
/* 5 */                 return null;
                    }
/* 46 */            if (list.isEmpty()) {
/* 48 */                return typefaceI00000oIO;
                    }
/* 51 */            ThreadLocal threadLocal3 = OoOl1OI01Ioi.I00000oIO;
/* 57 */            Paint paint = (Paint) threadLocal3.get();
/* 59 */            if (paint == null) {
/* 63 */                paint = new Paint();
/* 66 */                threadLocal3.set(paint);
                    }
/* 69 */            paint.setFontVariationSettings(null);
/* 72 */            paint.setTypeface(typefaceI00000oIO);
/* 75 */            iOIl1O.I00000oIO(context);
/* 104 */           int i2 = context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
/* 106 */           if (i2 == 0) {
/* 112 */               OI1lOo oI1lOo = new OI1lOo(23);
/* 115 */               VarHandle.storeStoreFence();
/* 120 */               strI00000oIO = O10lllI0o0.I00000oIO(list, null, oI1lOo, 31);
                    } else {
/* 132 */               if (list.size() > 0) {
/* 191 */                   list.get(0).getClass();
/* 194 */                   OIiilo1Ool0o.I00000oIO();
/* 5 */                     return null;
                        }
/* 175 */               strI00000oIO = ((Object) (!list.isEmpty() ? "," : "")) + "'wght' " + lIiioliIlo.I00000oOI(i2 + 400.0f, 1.0f, 1000.0f);
                    }
/* 179 */           paint.setFontVariationSettings(strI00000oIO);
/* 182 */           return paint.getTypeface();
                }

                @Override
                public Object get() {
/* 1 */             Object obj = lIlIo1.I000OiO;
/* 15 */            lI1i1OI1O0l li1i1oi1o0l = new lI1i1OI1O0l(this.I00iOIl, l1oIOl1IIl1o.I00000oIO, I11O1IlIl1I.I00000oIO, Io0i00i0.I0000Il00O);
/* 18 */            lOIiI0 loiii0 = new lOIiI0();
/* 21 */            loiii0.I00000oIO = li1i1oi1o0l;
/* 23 */            VarHandle.storeStoreFence();
/* 55 */            return loiii0;
                }
            }
