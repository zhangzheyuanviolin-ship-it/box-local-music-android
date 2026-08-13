            package p000;

            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.Canvas;
            import android.graphics.Color;
            import android.graphics.ColorFilter;
            import android.graphics.Matrix;
            import android.graphics.Outline;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.PorterDuffXfermode;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.Region;
            import android.graphics.drawable.Drawable;
            import android.os.Looper;
            import android.util.AndroidRuntimeException;
            import android.util.StateSet;
            import android.view.Choreographer;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.BitSet;
            import java.util.Objects;
            
/* 233 */   public final class O1Ooi0 extends Drawable implements OioilII {
                public static final O1OoOol[] I00ooiO1I;
                public final Oi0Oooi I00iOIl;
                public O1OoOIoiiO1I I00iiI;
                public final Oioiio0iO0[] I00iiO;
                public final Oioiio0iO0[] I00iio;
                public final BitSet I00ilI0I1;
                public boolean I00ilO0;
                public boolean I00io1l;
                public final Matrix I00ioIO;
                public final Path I00l0I0l0lO1;
                public final Path I00l0OO0IO;
                public final RectF I00li1OI;
                public final RectF I00ll1;
                public final Region I00lli11;
                public final Region I00lll10;
                public final Paint I00o0iI0io1;
                public final Paint I00o0l1o1o0;
                public final Oi00IilOloo0 I00o101lO;
                public final OOoo1il I00oI0i;
                public PorterDuffColorFilter I00oII;
                public PorterDuffColorFilter I00oIiI10;
                public final RectF I00oO101o;
                public boolean I00oOio10iI1;
                public OioOlIlii1il I00ol1;
                public OlIOOlill1o I00olI;
                public final OlIOOillOO[] I00oli;
                public float[] I00oliIiO01i;
                public float[] I00oo1iO0ll;
                public I0IOIlIOIII I00ooIo0;

                static {
/* 4 */             Paint paint = new Paint(1);
/* 8 */             paint.setColor(-1);
/* 18 */            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
/* 24 */            I00ooiO1I = new O1OoOol[4];
/* 26 */            int i = 0;
                    while (true) {
/* 27 */                O1OoOol[] o1OoOolArr = I00ooiO1I;
/* 30 */                if (i >= o1OoOolArr.length) {
/* 113 */                   return;
                        }
/* 34 */                O1OoOol o1OoOol = new O1OoOol();
/* 37 */                o1OoOol.I00000oIO = i;
/* 39 */                VarHandle.storeStoreFence();
/* 42 */                o1OoOolArr[i] = o1OoOol;
/* 44 */                i++;
                    }
                }

                public O1Ooi0(O1OoOIoiiO1I o1OoOIoiiO1I) {
/* 9 */             Oi0Oooi oi0Oooi = new Oi0Oooi(15, false);
/* 12 */            oi0Oooi.I00iiI = this;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            this.I00iOIl = oi0Oooi;
/* 22 */            this.I00iiO = new Oioiio0iO0[4];
/* 26 */            this.I00iio = new Oioiio0iO0[4];
/* 35 */            this.I00ilI0I1 = new BitSet(8);
/* 42 */            this.I00ioIO = new Matrix();
/* 49 */            this.I00l0I0l0lO1 = new Path();
/* 56 */            this.I00l0OO0IO = new Path();
/* 63 */            this.I00li1OI = new RectF();
/* 70 */            this.I00ll1 = new RectF();
/* 77 */            this.I00lli11 = new Region();
/* 84 */            this.I00lll10 = new Region();
/* 89 */            Paint paint = new Paint(1);
/* 92 */            this.I00o0iI0io1 = paint;
/* 96 */            Paint paint2 = new Paint(1);
/* 99 */            this.I00o0l1o1o0 = paint2;
/* 103 */           IIi0oIl iIi0oIl = new IIi0oIl();
/* 108 */           new Path();
/* 113 */           Paint paint3 = new Paint();
/* 118 */           Paint paint4 = new Paint();
/* 129 */           iIi0oIl.I00iOIl = IOOliIoI1l.I0000O(-16777216, 68);
/* 133 */           IOOliIoI1l.I0000O(-16777216, 20);
/* 136 */           IOOliIoI1l.I0000O(-16777216, 0);
/* 141 */           paint4.setColor(iIi0oIl.I00iOIl);
/* 144 */           paint3.setColor(0);
/* 149 */           Paint paint5 = new Paint(4);
/* 152 */           Paint.Style style = Paint.Style.FILL;
/* 154 */           paint5.setStyle(style);
/* 159 */           new Paint(paint5);
/* 162 */           VarHandle.storeStoreFence();
/* 187 */           this.I00oI0i = Looper.getMainLooper().getThread() == Thread.currentThread() ? OioOo1I.I00000oIO : new OOoo1il(1);
/* 194 */           this.I00oO101o = new RectF();
/* 196 */           this.I00oOio10iI1 = true;
/* 200 */           this.I00oli = new OlIOOillOO[4];
/* 202 */           this.I00iiI = o1OoOIoiiO1I;
/* 206 */           paint2.setStyle(Paint.Style.STROKE);
/* 209 */           paint.setStyle(style);
/* 212 */           I000l1();
/* 219 */           I000OiO(getState());
/* 224 */           Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 227 */           oi00IilOloo0.I00iOIl = this;
/* 229 */           VarHandle.storeStoreFence();
/* 232 */           this.I00o101lO = oi00IilOloo0;
                }

                public static float I00000oOI(RectF rectF, OioOlIlii1il oioOlIlii1il, float[] fArr) {
/* 1 */             if (fArr == null) {
/* 7 */                 if (oioOlIlii1il.I0000oI00(rectF)) {
/* 11 */                    return oioOlIlii1il.I0000oI00.I00000oIO(rectF);
                        }
/* 46 */                return -1.0f;
                    }
/* 19 */            if (fArr.length > 1) {
/* 22 */                float f = fArr[0];
/* 25 */                for (int i = 1; i < fArr.length; i++) {
/* 31 */                    if (fArr[i] != f) {
/* 46 */                        return -1.0f;
                            }
                        }
                    }
/* 41 */            if (oioOlIlii1il.I0000O()) {
/* 43 */                return fArr[0];
                    }
/* 46 */            return -1.0f;
                }

                public final void I00000oIO(RectF rectF, Path path) {
/* 1 */             O1OoOIoiiO1I o1OoOIoiiO1I = this.I00iiI;
/* 15 */            this.I00oI0i.I00000oIO(o1OoOIoiiO1I.I00000oIO, this.I00oliIiO01i, o1OoOIoiiO1I.I000OiO, rectF, this.I00o101lO, path);
/* 26 */            if (this.I00iiI.I000OOo1O != 1.0f) {
/* 28 */                Matrix matrix = this.I00ioIO;
/* 30 */                matrix.reset();
/* 35 */                float f = this.I00iiI.I000OOo1O;
/* 49 */                matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
/* 52 */                path.transform(matrix);
                    }
/* 58 */            path.computeBounds(this.I00oO101o, true);
                }

                public final int I0000Il00O(int i) {
                    int i2;
/* 1 */             O1OoOIoiiO1I o1OoOIoiiO1I = this.I00iiI;
/* 9 */             float f = o1OoOIoiiO1I.I000o00OoI0I + 0.0f + o1OoOIoiiO1I.I000lI;
/* 10 */            IioiIIi00i iioiIIi00i = o1OoOIoiiO1I.I0000Il00O;
/* 12 */            if (iioiIIi00i == null || !iioiIIi00i.I00000oIO || IOOliIoI1l.I0000O(i, 255) != iioiIIi00i.I0000O) {
/* 186 */               return i;
                    }
/* 62 */            float fMin = (iioiIIi00i.I0000oI00 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
/* 63 */            int iAlpha = Color.alpha(i);
/* 73 */            int iI0000Il00O = l1I10i.I0000Il00O(IOOliIoI1l.I0000O(i, 255), iioiIIi00i.I00000oOI, fMin);
/* 79 */            if (fMin > 0.0f && (i2 = iioiIIi00i.I0000Il00O) != 0) {
/* 91 */                iI0000Il00O = IOOliIoI1l.I00000oOI(IOOliIoI1l.I0000O(i2, IioiIIi00i.I0001Ioi1lo), iI0000Il00O);
                    }
/* 95 */            return IOOliIoI1l.I0000O(iI0000Il00O, iAlpha);
                }

                public final RectF I0000O() {
/* 1 */             Rect bounds = getBounds();
/* 5 */             RectF rectF = this.I00li1OI;
/* 7 */             rectF.set(bounds);
/* 29 */            return rectF;
                }

                public final float I0000oI00() {
/* 5 */             if (I0001Ioi1lo()) {
/* 15 */                return this.I00o0l1o1o0.getStrokeWidth() / 2.0f;
                    }
/* 17 */            return 0.0f;
                }

                public final boolean I0001Ioi1lo() {
/* 3 */             Paint.Style style = this.I00iiI.I00100o1O0lo;
                    return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.I00o0l1o1o0.getStrokeWidth() > 0.0f;
                }

                public final void I000II(Context context) {
/* 1 */             O1OoOIoiiO1I o1OoOIoiiO1I = this.I00iiI;
/* 9 */             boolean zI00000oOI = l1I0O0OI0oO.I00000oOI(context, R.attr.elevationOverlayEnabled, false);
/* 16 */            int iI00000oIO = l1I10i.I00000oIO(context, R.attr.elevationOverlayColor);
/* 23 */            int iI00000oIO2 = l1I10i.I00000oIO(context, R.attr.elevationOverlayAccentColor);
/* 30 */            int iI00000oIO3 = l1I10i.I00000oIO(context, R.attr.colorSurface);
/* 42 */            float f = context.getResources().getDisplayMetrics().density;
/* 44 */            IioiIIi00i iioiIIi00i = new IioiIIi00i();
/* 47 */            iioiIIi00i.I00000oIO = zI00000oOI;
/* 49 */            iioiIIi00i.I00000oOI = iI00000oIO;
/* 51 */            iioiIIi00i.I0000Il00O = iI00000oIO2;
/* 53 */            iioiIIi00i.I0000O = iI00000oIO3;
/* 55 */            iioiIIi00i.I0000oI00 = f;
/* 57 */            VarHandle.storeStoreFence();
/* 60 */            o1OoOIoiiO1I.I0000Il00O = iioiIIi00i;
/* 62 */            I000lI();
                }

                public final void I000O01llI0(OlIOOlill1o olIOOlill1o) {
/* 3 */             if (this.I00olI == olIOOlill1o) {
/* 186 */               return;
                    }
/* 5 */             this.I00olI = olIOOlill1o;
/* 8 */             int i = 0;
                    while (true) {
/* 9 */                 OlIOOillOO[] olIOOillOOArr = this.I00oli;
/* 12 */                if (i >= olIOOillOOArr.length) {
/* 177 */                   I000iOII(getState(), true);
/* 180 */                   invalidateSelf();
/* 186 */                   return;
                        }
/* 17 */                if (olIOOillOOArr[i] == null) {
/* 23 */                    O1OoOol o1OoOol = I00ooiO1I[i];
/* 25 */                    OlIOOillOO olIOOillOO = new OlIOOillOO();
/* 28 */                    olIOOillOO.I00000oIO = 0.0f;
/* 33 */                    olIOOillOO.I00000oOI = Float.MAX_VALUE;
/* 35 */                    olIOOillOO.I0000oI00 = false;
/* 39 */                    olIOOillOO.I0001Ioi1lo = 0L;
/* 46 */                    olIOOillOO.I000O01llI0 = new ArrayList();
/* 53 */                    olIOOillOO.I000OOo1O = new ArrayList();
/* 55 */                    olIOOillOO.I0000Il00O = this;
/* 57 */                    olIOOillOO.I0000O = o1OoOol;
/* 61 */                    if (o1OoOol == OlIOOillOO.I000oI1ioi || o1OoOol == OlIOOillOO.I00100l0 || o1OoOol == OlIOOillOO.I00100o1O0lo) {
/* 104 */                       olIOOillOO.I000II = 0.1f;
                            } else if (o1OoOol == OlIOOillOO.I0010I0i) {
/* 78 */                        olIOOillOO.I000II = 0.00390625f;
                            } else if (o1OoOol == OlIOOillOO.I000lI || o1OoOol == OlIOOillOO.I000o00OoI0I) {
/* 98 */                        olIOOillOO.I000II = 0.002f;
                            } else {
/* 92 */                        olIOOillOO.I000II = 1.0f;
                            }
/* 107 */                   olIOOillOO.I000OiO = null;
/* 109 */                   olIOOillOO.I000iOII = Float.MAX_VALUE;
/* 111 */                   olIOOillOO.I000l1 = false;
/* 113 */                   VarHandle.storeStoreFence();
/* 116 */                   olIOOillOOArr[i] = olIOOillOO;
                        }
/* 118 */               OlIOOillOO olIOOillOO2 = olIOOillOOArr[i];
/* 122 */               OlIOOlill1o olIOOlill1o2 = new OlIOOlill1o();
/* 127 */               float f = (float) olIOOlill1o.I00000oOI;
/* 130 */               if (f < 0.0f) {
/* 168 */                   I000II.I000iOII("Damping ratio must be non-negative");
/* 171 */                   return;
                        }
/* 133 */               olIOOlill1o2.I00000oOI = f;
/* 135 */               olIOOlill1o2.I0000Il00O = false;
/* 137 */               double d = olIOOlill1o.I00000oIO;
/* 140 */               float f2 = (float) (d * d);
/* 143 */               if (f2 <= 0.0f) {
/* 162 */                   I000II.I000iOII("Spring stiffness constant must be positive.");
/* 165 */                   return;
                        }
/* 150 */               olIOOlill1o2.I00000oIO = Math.sqrt(f2);
/* 152 */               olIOOlill1o2.I0000Il00O = false;
/* 154 */               olIOOillOO2.I000OiO = olIOOlill1o2;
/* 156 */               i++;
                    }
                }

                public final void I000OOo1O(OlO0lil1 olO0lil1) {
/* 1 */             O1OoOIoiiO1I o1OoOIoiiO1I = this.I00iiI;
/* 5 */             if (o1OoOIoiiO1I.I00000oOI != olO0lil1) {
/* 7 */                 o1OoOIoiiO1I.I00000oOI = olO0lil1;
/* 14 */                I000iOII(getState(), true);
/* 17 */                invalidateSelf();
                    }
                }

                public final boolean I000OiO(int[] iArr) {
                    boolean z;
                    Paint paint;
                    int color;
                    int colorForState;
                    Paint paint2;
                    int color2;
                    int colorForState2;
/* 6 */             if (this.I00iiI.I0000O == null || color2 == (colorForState2 = this.I00iiI.I0000O.getColorForState(iArr, (color2 = (paint2 = this.I00o0iI0io1).getColor())))) {
/* 29 */                z = false;
                    } else {
/* 24 */                paint2.setColor(colorForState2);
/* 27 */                z = true;
                    }
/* 34 */            if (this.I00iiI.I0000oI00 == null || color == (colorForState = this.I00iiI.I0000oI00.getColorForState(iArr, (color = (paint = this.I00o0l1o1o0).getColor())))) {
/* 186 */               return z;
                    }
/* 52 */            paint.setColor(colorForState);
/* 5 */             return true;
                }

                public final void I000iOII(int[] iArr, boolean z) {
                    int i;
/* 3 */             RectF rectFI0000O = I0000O();
/* 11 */            if (this.I00iiI.I00000oOI == null || rectFI0000O.isEmpty()) {
/* 551 */               return;
                    }
/* 23 */            int i2 = 0;
/* 30 */            boolean z2 = z | (this.I00olI == null);
/* 35 */            if (this.I00oliIiO01i == null) {
/* 39 */                this.I00oliIiO01i = new float[4];
                    }
/* 43 */            OlO0lil1 olO0lil1 = this.I00iiI.I00000oOI;
/* 45 */            int[][] iArr2 = olO0lil1.I0000Il00O;
/* 47 */            int i3 = olO0lil1.I00000oIO;
/* 49 */            int i4 = 0;
                    while (true) {
/* 50 */                i = -1;
/* 51 */                if (i4 >= i3) {
/* 67 */                    i4 = -1;
                            break;
                        } else if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                            break;
                        } else {
/* 64 */                    i4++;
                        }
                    }
/* 68 */            if (i4 < 0) {
/* 70 */                int[] iArr3 = StateSet.WILD_CARD;
/* 72 */                int[][] iArr4 = olO0lil1.I0000Il00O;
/* 74 */                int i5 = 0;
                        while (true) {
/* 75 */                    if (i5 >= i3) {
                                break;
                            }
/* 83 */                    if (StateSet.stateSetMatches(iArr4[i5], iArr3)) {
/* 85 */                        i = i5;
                                break;
                            }
/* 87 */                    i5++;
                        }
/* 90 */                i4 = i;
                    }
/* 93 */            OioOlIlii1il oioOlIlii1il = olO0lil1.I0000O[i4];
/* 95 */            int i6 = 0;
/* 96 */            for (int i7 = 4; i6 < i7; i7 = 4) {
/* 100 */               this.I00oI0i.getClass();
/* 103 */               int i8 = 2;
/* 122 */               float fI00000oIO = (i6 != 1 ? i6 != 2 ? i6 != 3 ? oioOlIlii1il.I0001Ioi1lo : oioOlIlii1il.I0000oI00 : oioOlIlii1il.I000O01llI0 : oioOlIlii1il.I000II).I00000oIO(rectFI0000O);
/* 126 */               if (z2) {
/* 130 */                   this.I00oliIiO01i[i6] = fI00000oIO;
                        }
/* 132 */               OlIOOillOO[] olIOOillOOArr = this.I00oli;
/* 134 */               OlIOOillOO olIOOillOO = olIOOillOOArr[i6];
/* 136 */               if (olIOOillOO != null) {
/* 142 */                   if (olIOOillOO.I0000oI00) {
/* 144 */                       olIOOillOO.I000iOII = fI00000oIO;
                            } else {
/* 148 */                       OlIOOlill1o olIOOlill1o = olIOOillOO.I000OiO;
/* 150 */                       if (olIOOlill1o == null) {
/* 154 */                           olIOOlill1o = new OlIOOlill1o();
/* 166 */                           olIOOlill1o.I00000oIO = Math.sqrt(1500.0d);
/* 170 */                           olIOOlill1o.I00000oOI = 0.5d;
/* 172 */                           olIOOlill1o.I0000Il00O = false;
/* 179 */                           olIOOlill1o.I000OiO = new Iio1o1I();
/* 182 */                           olIOOlill1o.I000OOo1O = fI00000oIO;
/* 184 */                           VarHandle.storeStoreFence();
/* 187 */                           olIOOillOO.I000OiO = olIOOlill1o;
                                }
                                double d = fI00000oIO;
/* 190 */                       olIOOlill1o.I000OOo1O = d;
/* 192 */                       double d2 = (float) d;
/* 201 */                       if (d2 > 3.4028234663852886E38d) {
/* 450 */                           OoOil11Ol1o.I000OiO("Final position of the spring cannot be greater than the max value.");
/* 453 */                           return;
                                }
/* 210 */                       if (d2 < -3.4028234663852886E38d) {
/* 444 */                           OoOil11Ol1o.I000OiO("Final position of the spring cannot be less than the min value.");
/* 447 */                           return;
                                }
/* 218 */                       double dAbs = Math.abs(olIOOillOO.I000II * 0.75f);
/* 222 */                       olIOOlill1o.I0000O = dAbs;
/* 231 */                       olIOOlill1o.I0000oI00 = dAbs * 62.5d;
/* 237 */                       OlOO1i11110 olOO1i11110 = I1100oilii.I00000oIO().I0000oI00;
/* 239 */                       olOO1i11110.getClass();
/* 254 */                       if (Thread.currentThread() != ((Looper) olOO1i11110.I00iiO).getThread()) {
/* 441 */                           throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                                }
/* 256 */                       boolean z3 = olIOOillOO.I0000oI00;
/* 258 */                       if (!z3 && !z3) {
/* 262 */                           olIOOillOO.I0000oI00 = true;
/* 268 */                           float fI00000oIO2 = olIOOillOO.I0000O.I00000oIO(olIOOillOO.I0000Il00O);
/* 272 */                           olIOOillOO.I00000oOI = fI00000oIO2;
/* 279 */                           if (fI00000oIO2 > Float.MAX_VALUE || fI00000oIO2 < -3.4028235E38f) {
/* 376 */                               I000II.I000iOII("Starting value need to be in between min value and max value");
/* 379 */                               return;
                                    }
/* 288 */                           I1100oilii i1100oiliiI00000oIO = I1100oilii.I00000oIO();
/* 292 */                           ArrayList arrayList = i1100oiliiI00000oIO.I00000oOI;
/* 298 */                           if (arrayList.size() == 0) {
/* 300 */                               OlOO1i11110 olOO1i111102 = i1100oiliiI00000oIO.I0000oI00;
/* 302 */                               I0100i i0100i = i1100oiliiI00000oIO.I0000O;
/* 306 */                               Choreographer choreographer = (Choreographer) olOO1i111102.I00iiI;
/* 310 */                               I1100io i1100io = new I1100io(i2);
/* 313 */                               i1100io.I00iiI = i0100i;
/* 315 */                               VarHandle.storeStoreFence();
/* 318 */                               choreographer.postFrameCallback(i1100io);
/* 325 */                               i1100oiliiI00000oIO.I000II = ValueAnimator.getDurationScale();
/* 327 */                               IoloOio0I ioloOio0I = i1100oiliiI00000oIO.I000O01llI0;
/* 329 */                               if (ioloOio0I == null) {
/* 333 */                                   ioloOio0I = new IoloOio0I(i8);
/* 336 */                                   ioloOio0I.I00iiO = i1100oiliiI00000oIO;
/* 338 */                                   VarHandle.storeStoreFence();
/* 341 */                                   i1100oiliiI00000oIO.I000O01llI0 = ioloOio0I;
                                        }
/* 347 */                               if (((I10oollIOol) ioloOio0I.I00iiI) == null) {
/* 351 */                                   I10oollIOol i10oollIOol = new I10oollIOol();
/* 354 */                                   i10oollIOol.I00000oIO = ioloOio0I;
/* 356 */                                   VarHandle.storeStoreFence();
/* 359 */                                   ioloOio0I.I00iiI = i10oollIOol;
/* 361 */                                   ValueAnimator.registerDurationScaleChangeListener(i10oollIOol);
                                        }
                                    }
/* 368 */                           if (!arrayList.contains(olIOOillOO)) {
/* 370 */                               arrayList.add(olIOOillOO);
                                    }
                                }
                            }
/* 380 */                   if (z2) {
/* 382 */                       OlIOOillOO olIOOillOO2 = olIOOillOOArr[i6];
/* 392 */                       if (olIOOillOO2.I000OiO.I00000oOI <= 0.0d) {
/* 432 */                           OoOil11Ol1o.I000OiO("Spring animations can only come to an end when there is damping");
/* 435 */                           return;
                                }
/* 398 */                       OlOO1i11110 olOO1i111103 = I1100oilii.I00000oIO().I0000oI00;
/* 400 */                       olOO1i111103.getClass();
/* 415 */                       if (Thread.currentThread() != ((Looper) olOO1i111103.I00iiO).getThread()) {
/* 429 */                           throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                                }
/* 419 */                       if (olIOOillOO2.I0000oI00) {
/* 421 */                           olIOOillOO2.I000l1 = true;
                                }
                            } else {
                                continue;
                            }
                        }
/* 454 */               i6++;
                    }
/* 459 */           if (z2) {
/* 461 */               invalidateSelf();
                    }
                }

                public final boolean I000l1() {
                    PorterDuffColorFilter porterDuffColorFilter;
/* 1 */             PorterDuffColorFilter porterDuffColorFilter2 = this.I00oII;
/* 3 */             PorterDuffColorFilter porterDuffColorFilter3 = this.I00oIiI10;
/* 5 */             O1OoOIoiiO1I o1OoOIoiiO1I = this.I00iiI;
/* 7 */             ColorStateList colorStateList = o1OoOIoiiO1I.I0001Ioi1lo;
/* 9 */             PorterDuff.Mode mode = o1OoOIoiiO1I.I000II;
/* 14 */            if (colorStateList == null || mode == null) {
/* 39 */                int color = this.I00o0iI0io1.getColor();
/* 43 */                int iI0000Il00O = I0000Il00O(color);
/* 57 */                porterDuffColorFilter = iI0000Il00O != color ? new PorterDuffColorFilter(iI0000Il00O, PorterDuff.Mode.SRC_IN) : null;
                    } else {
/* 33 */                porterDuffColorFilter = new PorterDuffColorFilter(I0000Il00O(colorStateList.getColorForState(getState(), 0)), mode);
                    }
/* 58 */            this.I00oII = porterDuffColorFilter;
/* 62 */            this.I00iiI.getClass();
/* 65 */            this.I00oIiI10 = null;
/* 69 */            this.I00iiI.getClass();
                    return (Objects.equals(porterDuffColorFilter2, this.I00oII) && Objects.equals(porterDuffColorFilter3, this.I00oIiI10)) ? false : true;
                }

                public final void I000lI() {
/* 1 */             O1OoOIoiiO1I o1OoOIoiiO1I = this.I00iiI;
/* 6 */             float f = o1OoOIoiiO1I.I000o00OoI0I + 0.0f;
/* 16 */            o1OoOIoiiO1I.I000oI1ioi = (int) Math.ceil(0.75f * f);
/* 29 */            this.I00iiI.I00100l0 = (int) Math.ceil(f * 0.25f);
/* 31 */            I000l1();
/* 34 */            super.invalidateSelf();
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[EDGE_INSN: B:57:0x0090->B:28:0x0090 BREAK  A[LOOP:1: B:19:0x0078->B:24:0x0082]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void draw(Canvas canvas) {
                    Path path;
/* 5 */             PorterDuffColorFilter porterDuffColorFilter = this.I00oII;
/* 7 */             Paint paint = this.I00o0iI0io1;
/* 9 */             paint.setColorFilter(porterDuffColorFilter);
/* 12 */            int alpha = paint.getAlpha();
/* 18 */            int i = this.I00iiI.I000l1;
/* 26 */            paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
/* 29 */            PorterDuffColorFilter porterDuffColorFilter2 = this.I00oIiI10;
/* 31 */            Paint paint2 = this.I00o0l1o1o0;
/* 33 */            paint2.setColorFilter(porterDuffColorFilter2);
/* 40 */            paint2.setStrokeWidth(this.I00iiI.I000iOII);
/* 43 */            int alpha2 = paint2.getAlpha();
/* 49 */            int i2 = this.I00iiI.I000l1;
/* 57 */            paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
/* 62 */            Paint.Style style = this.I00iiI.I00100o1O0lo;
/* 68 */            if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
/* 74 */                boolean z = this.I00ilO0;
/* 76 */                Path path2 = this.I00l0I0l0lO1;
/* 78 */                if (z) {
/* 84 */                    I00000oIO(I0000O(), path2);
/* 87 */                    this.I00ilO0 = false;
                        }
/* 89 */                O1OoOIoiiO1I o1OoOIoiiO1I = this.I00iiI;
/* 91 */                o1OoOIoiiO1I.getClass();
/* 96 */                if (o1OoOIoiiO1I.I000oI1ioi > 0 && !o1OoOIoiiO1I.I00000oIO.I0000oI00(I0000O())) {
/* 110 */                   float[] fArr = this.I00oliIiO01i;
/* 112 */                   if (fArr != null) {
/* 116 */                       if (fArr.length > 1) {
/* 119 */                           float f = fArr[0];
/* 122 */                           for (int i3 = 1; i3 < fArr.length; i3++) {
/* 128 */                               if (fArr[i3] != f) {
                                            break;
                                        }
                                    }
/* 142 */                           if (!this.I00iiI.I00000oIO.I0000O()) {
                                    }
                                } else if (!this.I00iiI.I00000oIO.I0000O()) {
/* 145 */                           path2.isConvex();
                                }
                            }
                        }
/* 150 */               OioOlIlii1il oioOlIlii1il = this.I00iiI.I00000oIO;
/* 152 */               float[] fArr2 = this.I00oliIiO01i;
/* 154 */               RectF rectFI0000O = I0000O();
/* 158 */               float fI00000oOI = I00000oOI(rectFI0000O, oioOlIlii1il, fArr2);
/* 164 */               if (fI00000oOI >= 0.0f) {
/* 170 */                   float f2 = fI00000oOI * this.I00iiI.I000OiO;
/* 171 */                   canvas.drawRoundRect(rectFI0000O, f2, f2, paint);
                        } else {
/* 175 */                   canvas.drawPath(path2, paint);
                        }
                    }
/* 182 */           if (I0001Ioi1lo()) {
/* 184 */               boolean z2 = this.I00io1l;
/* 186 */               RectF rectF = this.I00ll1;
/* 188 */               Path path3 = this.I00l0OO0IO;
/* 190 */               if (z2) {
/* 194 */                   OioOlIlii1il oioOlIlii1il2 = this.I00iiI.I00000oIO;
/* 196 */                   OioOio1lI0 oioOio1lI0I0001Ioi1lo = oioOlIlii1il2.I0001Ioi1lo();
/* 200 */                   Ii0010O01 ii0010O01 = oioOlIlii1il2.I0000oI00;
/* 202 */                   Oi0Oooi oi0Oooi = this.I00iOIl;
/* 208 */                   oioOio1lI0I0001Ioi1lo.I0000oI00 = oi0Oooi.I00000oIO(ii0010O01);
/* 216 */                   oioOio1lI0I0001Ioi1lo.I0001Ioi1lo = oi0Oooi.I00000oIO(oioOlIlii1il2.I0001Ioi1lo);
/* 224 */                   oioOio1lI0I0001Ioi1lo.I000O01llI0 = oi0Oooi.I00000oIO(oioOlIlii1il2.I000O01llI0);
/* 232 */                   oioOio1lI0I0001Ioi1lo.I000II = oi0Oooi.I00000oIO(oioOlIlii1il2.I000II);
/* 238 */                   this.I00ol1 = oioOio1lI0I0001Ioi1lo.I00000oIO();
/* 240 */                   float[] fArr3 = this.I00oliIiO01i;
/* 242 */                   if (fArr3 != null) {
/* 250 */                       if (this.I00oo1iO0ll == null) {
/* 255 */                           this.I00oo1iO0ll = new float[fArr3.length];
                                }
/* 257 */                       float fI0000oI00 = I0000oI00();
/* 261 */                       int i4 = 0;
                                while (true) {
/* 262 */                           float[] fArr4 = this.I00oliIiO01i;
/* 265 */                           if (i4 >= fArr4.length) {
                                        break;
                                    }
/* 276 */                           this.I00oo1iO0ll[i4] = Math.max(0.0f, fArr4[i4] - fI0000oI00);
/* 278 */                           i4++;
                                }
                            } else {
/* 245 */                       this.I00oo1iO0ll = null;
                            }
/* 281 */                   OioOlIlii1il oioOlIlii1il3 = this.I00ol1;
/* 283 */                   float[] fArr5 = this.I00oo1iO0ll;
/* 287 */                   float f3 = this.I00iiI.I000OiO;
/* 293 */                   rectF.set(I0000O());
/* 296 */                   float fI0000oI002 = I0000oI00();
/* 300 */                   rectF.inset(fI0000oI002, fI0000oI002);
/* 308 */                   this.I00oI0i.I00000oIO(oioOlIlii1il3, fArr5, f3, rectF, null, path3);
/* 311 */                   path = path3;
/* 313 */                   this.I00io1l = false;
                        } else {
/* 316 */                   path = path3;
                        }
/* 317 */               OioOlIlii1il oioOlIlii1il4 = this.I00ol1;
/* 319 */               float[] fArr6 = this.I00oo1iO0ll;
/* 325 */               rectF.set(I0000O());
/* 328 */               float fI0000oI003 = I0000oI00();
/* 332 */               rectF.inset(fI0000oI003, fI0000oI003);
/* 335 */               float fI00000oOI2 = I00000oOI(rectF, oioOlIlii1il4, fArr6);
/* 341 */               if (fI00000oOI2 >= 0.0f) {
/* 347 */                   float f4 = fI00000oOI2 * this.I00iiI.I000OiO;
/* 348 */                   canvas.drawRoundRect(rectF, f4, f4, paint2);
                        } else {
/* 352 */                   canvas.drawPath(path, paint2);
                        }
                    }
/* 355 */           paint.setAlpha(alpha);
/* 358 */           paint2.setAlpha(alpha2);
                }

                @Override
                public final int getAlpha() {
/* 3 */             return this.I00iiI.I000l1;
                }

                @Override
                public final Drawable.ConstantState getConstantState() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final int getOpacity() {
/* 1 */             return -3;
                }

                @Override
                public final void getOutline(Outline outline) {
/* 3 */             this.I00iiI.getClass();
/* 6 */             RectF rectFI0000O = I0000O();
/* 14 */            if (rectFI0000O.isEmpty()) {
/* 16 */                return;
                    }
/* 23 */            float fI00000oOI = I00000oOI(rectFI0000O, this.I00iiI.I00000oIO, this.I00oliIiO01i);
/* 30 */            if (fI00000oOI >= 0.0f) {
/* 41 */                outline.setRoundRect(getBounds(), fI00000oOI * this.I00iiI.I000OiO);
/* 44 */                return;
                    }
/* 45 */            boolean z = this.I00ilO0;
/* 47 */            Path path = this.I00l0I0l0lO1;
/* 49 */            if (z) {
/* 51 */                I00000oIO(rectFI0000O, path);
/* 55 */                this.I00ilO0 = false;
                    }
/* 57 */            IiloIOlilI.I00000oIO(outline, path);
                }

                @Override
                public final boolean getPadding(Rect rect) {
/* 3 */             Rect rect2 = this.I00iiI.I000O01llI0;
/* 5 */             if (rect2 == null) {
/* 12 */                return super.getPadding(rect);
                    }
/* 7 */             rect.set(rect2);
/* 10 */            return true;
                }

                @Override
                public final Region getTransparentRegion() {
/* 1 */             Rect bounds = getBounds();
/* 5 */             Region region = this.I00lli11;
/* 7 */             region.set(bounds);
/* 10 */            RectF rectFI0000O = I0000O();
/* 14 */            Path path = this.I00l0I0l0lO1;
/* 16 */            I00000oIO(rectFI0000O, path);
/* 19 */            Region region2 = this.I00lll10;
/* 21 */            region2.setPath(path, region);
/* 26 */            region.op(region2, Region.Op.DIFFERENCE);
/* 29 */            return region;
                }

                @Override
                public final void invalidateSelf() {
/* 2 */             this.I00ilO0 = true;
/* 4 */             this.I00io1l = true;
/* 6 */             super.invalidateSelf();
                }

                @Override
                public final boolean isStateful() {
                    ColorStateList colorStateList;
                    ColorStateList colorStateList2;
                    OlO0lil1 olO0lil1;
/* 6 */             if (!super.isStateful() && ((colorStateList = this.I00iiI.I0001Ioi1lo) == null || !colorStateList.isStateful())) {
/* 22 */                this.I00iiI.getClass();
/* 27 */                ColorStateList colorStateList3 = this.I00iiI.I0000oI00;
/* 29 */                if ((colorStateList3 == null || !colorStateList3.isStateful()) && (((colorStateList2 = this.I00iiI.I0000O) == null || !colorStateList2.isStateful()) && ((olO0lil1 = this.I00iiI.I00000oOI) == null || olO0lil1.I00000oIO <= 1))) {
/* 59 */                    return false;
                        }
                    }
/* 5 */             return true;
                }

                @Override
                public final Drawable mutate() {
/* 3 */             O1OoOIoiiO1I o1OoOIoiiO1I = this.I00iiI;
/* 5 */             O1OoOIoiiO1I o1OoOIoiiO1I2 = new O1OoOIoiiO1I();
/* 9 */             o1OoOIoiiO1I2.I0000O = null;
/* 11 */            o1OoOIoiiO1I2.I0000oI00 = null;
/* 13 */            o1OoOIoiiO1I2.I0001Ioi1lo = null;
/* 17 */            o1OoOIoiiO1I2.I000II = PorterDuff.Mode.SRC_IN;
/* 19 */            o1OoOIoiiO1I2.I000O01llI0 = null;
/* 23 */            o1OoOIoiiO1I2.I000OOo1O = 1.0f;
/* 25 */            o1OoOIoiiO1I2.I000OiO = 1.0f;
/* 29 */            o1OoOIoiiO1I2.I000l1 = 255;
/* 32 */            o1OoOIoiiO1I2.I000lI = 0.0f;
/* 34 */            o1OoOIoiiO1I2.I000o00OoI0I = 0.0f;
/* 37 */            o1OoOIoiiO1I2.I000oI1ioi = 0;
/* 39 */            o1OoOIoiiO1I2.I00100l0 = 0;
/* 43 */            o1OoOIoiiO1I2.I00100o1O0lo = Paint.Style.FILL_AND_STROKE;
/* 47 */            o1OoOIoiiO1I2.I00000oIO = o1OoOIoiiO1I.I00000oIO;
/* 51 */            o1OoOIoiiO1I2.I00000oOI = o1OoOIoiiO1I.I00000oOI;
/* 55 */            o1OoOIoiiO1I2.I0000Il00O = o1OoOIoiiO1I.I0000Il00O;
/* 59 */            o1OoOIoiiO1I2.I000iOII = o1OoOIoiiO1I.I000iOII;
/* 63 */            o1OoOIoiiO1I2.I0000O = o1OoOIoiiO1I.I0000O;
/* 67 */            o1OoOIoiiO1I2.I0000oI00 = o1OoOIoiiO1I.I0000oI00;
/* 71 */            o1OoOIoiiO1I2.I000II = o1OoOIoiiO1I.I000II;
/* 75 */            o1OoOIoiiO1I2.I0001Ioi1lo = o1OoOIoiiO1I.I0001Ioi1lo;
/* 79 */            o1OoOIoiiO1I2.I000l1 = o1OoOIoiiO1I.I000l1;
/* 83 */            o1OoOIoiiO1I2.I000OOo1O = o1OoOIoiiO1I.I000OOo1O;
/* 87 */            o1OoOIoiiO1I2.I00100l0 = o1OoOIoiiO1I.I00100l0;
/* 91 */            o1OoOIoiiO1I2.I000OiO = o1OoOIoiiO1I.I000OiO;
/* 95 */            o1OoOIoiiO1I2.I000lI = o1OoOIoiiO1I.I000lI;
/* 99 */            o1OoOIoiiO1I2.I000o00OoI0I = o1OoOIoiiO1I.I000o00OoI0I;
/* 103 */           o1OoOIoiiO1I2.I000oI1ioi = o1OoOIoiiO1I.I000oI1ioi;
/* 107 */           o1OoOIoiiO1I2.I00100o1O0lo = o1OoOIoiiO1I.I00100o1O0lo;
/* 109 */           Rect rect = o1OoOIoiiO1I.I000O01llI0;
/* 111 */           if (rect != null) {
/* 118 */               o1OoOIoiiO1I2.I000O01llI0 = new Rect(rect);
                    }
/* 120 */           this.I00iiI = o1OoOIoiiO1I2;
/* 541 */           return this;
                }

                @Override
                public final void onBoundsChange(Rect rect) {
/* 2 */             this.I00ilO0 = true;
/* 4 */             this.I00io1l = true;
/* 6 */             super.onBoundsChange(rect);
/* 13 */            if (this.I00iiI.I00000oOI != null && !rect.isEmpty()) {
/* 27 */                I000iOII(getState(), this.I00oOio10iI1);
                    }
/* 34 */            this.I00oOio10iI1 = rect.isEmpty();
                }

                @Override
                public final boolean onStateChange(int[] iArr) {
/* 6 */             if (this.I00iiI.I00000oOI != null) {
/* 8 */                 I000iOII(iArr, false);
                    }
/* 19 */            boolean z = I000OiO(iArr) || I000l1();
/* 24 */            if (z) {
/* 26 */                invalidateSelf();
                    }
/* 49 */            return z;
                }

                @Override
                public final void setAlpha(int i) {
/* 1 */             O1OoOIoiiO1I o1OoOIoiiO1I = this.I00iiI;
/* 5 */             if (o1OoOIoiiO1I.I000l1 != i) {
/* 7 */                 o1OoOIoiiO1I.I000l1 = i;
/* 9 */                 super.invalidateSelf();
                    }
                }

                @Override
                public final void setColorFilter(ColorFilter colorFilter) {
/* 3 */             this.I00iiI.getClass();
/* 6 */             super.invalidateSelf();
                }

                @Override
                public final void setShapeAppearanceModel(OioOlIlii1il oioOlIlii1il) {
/* 1 */             O1OoOIoiiO1I o1OoOIoiiO1I = this.I00iiI;
/* 3 */             o1OoOIoiiO1I.I00000oIO = oioOlIlii1il;
/* 6 */             o1OoOIoiiO1I.I00000oOI = null;
/* 8 */             this.I00oliIiO01i = null;
/* 10 */            this.I00oo1iO0ll = null;
/* 12 */            invalidateSelf();
                }

                @Override
                public final void setTint(int i) {
/* 5 */             setTintList(ColorStateList.valueOf(i));
                }

                @Override
                public final void setTintList(ColorStateList colorStateList) {
/* 3 */             this.I00iiI.I0001Ioi1lo = colorStateList;
/* 5 */             I000l1();
/* 8 */             super.invalidateSelf();
                }

                @Override
                public final void setTintMode(PorterDuff.Mode mode) {
/* 1 */             O1OoOIoiiO1I o1OoOIoiiO1I = this.I00iiI;
/* 5 */             if (o1OoOIoiiO1I.I000II != mode) {
/* 7 */                 o1OoOIoiiO1I.I000II = mode;
/* 9 */                 I000l1();
/* 12 */                super.invalidateSelf();
                    }
                }

/* 234 */       public O1Ooi0(OioOlIlii1il oioOlIlii1il) {
/* 236 */           O1OoOIoiiO1I o1OoOIoiiO1I = new O1OoOIoiiO1I();
/* 237 */           o1OoOIoiiO1I.I0000O = null;
/* 238 */           o1OoOIoiiO1I.I0000oI00 = null;
/* 239 */           o1OoOIoiiO1I.I0001Ioi1lo = null;
/* 240 */           o1OoOIoiiO1I.I000II = PorterDuff.Mode.SRC_IN;
/* 241 */           o1OoOIoiiO1I.I000O01llI0 = null;
/* 242 */           o1OoOIoiiO1I.I000OOo1O = 1.0f;
/* 243 */           o1OoOIoiiO1I.I000OiO = 1.0f;
/* 244 */           o1OoOIoiiO1I.I000l1 = 255;
/* 245 */           o1OoOIoiiO1I.I000lI = 0.0f;
/* 246 */           o1OoOIoiiO1I.I000o00OoI0I = 0.0f;
/* 247 */           o1OoOIoiiO1I.I000oI1ioi = 0;
/* 248 */           o1OoOIoiiO1I.I00100l0 = 0;
/* 249 */           o1OoOIoiiO1I.I00100o1O0lo = Paint.Style.FILL_AND_STROKE;
/* 250 */           o1OoOIoiiO1I.I00000oIO = oioOlIlii1il;
/* 251 */           o1OoOIoiiO1I.I0000Il00O = null;
/* 252 */           this(o1OoOIoiiO1I);
                }
            }
