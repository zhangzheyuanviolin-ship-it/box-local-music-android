            package p000;

            import android.content.Context;
            import android.graphics.Rect;
            import android.view.View;
            
            public final class Oio1o1iIliO implements IllOOo00lI {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public int I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public Oio1o1iIliO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    int iI000II;
/* 1 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 199 */                   OI10i0Il oI10i0Il = this.I00iiI;
/* 201 */                   int i2 = this.I00iiO;
/* 205 */                   Context context = (Context) this.I00iio;
/* 209 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilI0I1;
/* 215 */                   oI10i0Il.setValue(Integer.valueOf(i2));
/* 232 */                   context.getSharedPreferences("box_settings", 0).edit().putInt("llama_context_size", i2).apply();
/* 237 */                   oI10i0Il2.setValue(Boolean.FALSE);
                            break;
                        case 1:
/* 157 */                   OI10i0Il oI10i0Il3 = this.I00iiI;
/* 159 */                   int i3 = this.I00iiO;
/* 163 */                   Context context2 = (Context) this.I00iio;
/* 167 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00ilI0I1;
/* 173 */                   oI10i0Il3.setValue(Integer.valueOf(i3));
/* 190 */                   context2.getSharedPreferences("box_settings", 0).edit().putInt("llama_num_threads", i3).apply();
/* 195 */                   oI10i0Il4.setValue(Boolean.FALSE);
                            break;
                        case 2:
/* 115 */                   OI10i0Il oI10i0Il5 = this.I00iiI;
/* 117 */                   int i4 = this.I00iiO;
/* 121 */                   Context context3 = (Context) this.I00iio;
/* 125 */                   OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00ilI0I1;
/* 131 */                   oI10i0Il5.setValue(Integer.valueOf(i4));
/* 148 */                   context3.getSharedPreferences("box_settings", 0).edit().putInt("llama_gpu_layers", i4).apply();
/* 153 */                   oI10i0Il6.setValue(Boolean.FALSE);
                            break;
                        default:
/* 13 */                    i00I1l11OlI i00i1l11oli = (i00I1l11OlI) this.I00ilI0I1;
/* 15 */                    int i5 = this.I00iiO;
/* 17 */                    OI10i0Il oI10i0Il7 = this.I00iiI;
/* 21 */                    OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00iio;
/* 23 */                    View view = i00i1l11oli.I00000oIO;
/* 27 */                    Rect rect = new Rect();
/* 30 */                    view.getWindowVisibleDisplayFrame(rect);
/* 33 */                    int i6 = rect.top;
/* 35 */                    int i7 = rect.bottom;
/* 41 */                    O0iOOo0Ii o0iOOo0Ii = (O0iOOo0Ii) oI10i0Il7.getValue();
/* 71 */                    OOo0IO oOo0IOI00000oIO = (o0iOOo0Ii == null || !o0iOOo0Ii.I0010o()) ? OOo0IO.I0000oI00 : lIl0looO.I00000oIO(o0iOOo0Ii.I0000O(0L), l000O1l.I00000oOI(o0iOOo0Ii.I000iOII()));
/* 73 */                    int i8 = i6 + i5;
/* 75 */                    int i9 = i7 - i5;
/* 77 */                    float f = oOo0IOI00000oIO.I00000oOI;
/* 82 */                    if (f <= i7) {
/* 84 */                        float f2 = oOo0IOI00000oIO.I0000O;
/* 105 */                       iI000II = f2 < ((float) i6) ? i9 - i8 : O1OooO0IlOo.I000II(Math.max(f - i8, i9 - f2));
                            }
/* 111 */                   oIooi1iOiOol.I000O01llI0(Math.max(iI000II, 0));
                            break;
                    }
/* 114 */           return ooiIlOl1iI;
                }
            }
