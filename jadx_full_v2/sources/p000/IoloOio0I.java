            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.pm.ServiceInfo;
            import android.graphics.Paint;
            import android.graphics.Typeface;
            import android.os.Bundle;
            import android.os.IInterface;
            import android.text.Spannable;
            import android.text.SpannableString;
            import android.util.ArrayMap;
            import android.util.Log;
            import android.util.Pair;
            import android.util.Size;
            import android.view.Surface;
            import android.view.View;
            import android.view.autofill.AutofillId;
            import android.view.contentcapture.ContentCaptureSession;
            import android.view.inputmethod.InputMethodManager;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.UUID;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.jvm.functions.Function1;
            
/* 10 */    public class IoloOio0I implements IiooiiI01Olo, OliI0OiOi1O, IoiO1ilO, Ol1iiOol0, OOooio11i00, OiIoliiIoIi0 {
                public static final IoloOio0I I00iio;
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                static {
/* 7 */             O0o01OIl o0o01OIl = new O0o01OIl(22);
/* 14 */            O0o01OIl o0o01OIl2 = new O0o01OIl(23);
/* 18 */            IoloOio0I ioloOio0I = new IoloOio0I(1);
/* 21 */            ioloOio0I.I00iiI = o0o01OIl;
/* 23 */            ioloOio0I.I00iiO = o0o01OIl2;
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            I00iio = ioloOio0I;
                }

                public IoloOio0I(String str, i0Oio1 i0oio1, loilIl10Ii loilil10ii) {
/* 2 */             this.I00iOIl = 3;
/* 7 */             this.I00iiO = str;
/* 9 */             this.I00iiI = i0oio1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r4v10 */
                /* JADX WARN: Type inference failed for: r4v11 */
                /* JADX WARN: Type inference failed for: r4v3 */
                /* JADX WARN: Type inference failed for: r4v4, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v6 */
                /* JADX WARN: Type inference failed for: r4v7 */
                /* JADX WARN: Type inference failed for: r4v8 */
                /* JADX WARN: Type inference failed for: r4v9 */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v10 */
                /* JADX WARN: Type inference failed for: r5v11 */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v3, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r5v4 */
                /* JADX WARN: Type inference failed for: r5v5 */
                /* JADX WARN: Type inference failed for: r5v6, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r5v8 */
                /* JADX WARN: Type inference failed for: r5v9 */
                public static void I001i1O0Ol(O0iiOioolIi o0iiOioolIi) {
/* 3 */             if (o0iiOioolIi.I010lI0oi > 0) {
/* 12 */                if (o0iiOioolIi.I010I0.I0000O == O0iiOII1OO.I00ilI0I1 && !o0iiOioolIi.I00100l0() && !o0iiOioolIi.I00100o1O0lo() && !o0iiOioolIi.I010o0o0oO && o0iiOioolIi.I00Io1o110i()) {
/* 44 */                    O1ooOo o1ooOo = (O1ooOo) o0iiOioolIi.I010101Oo1lO.I00io1l;
/* 51 */                    if ((o1ooOo.I00iio & Barcode.FORMAT_QR_CODE) != 0) {
/* 53 */                        while (o1ooOo != null) {
/* 58 */                            if ((o1ooOo.I00iiO & Barcode.FORMAT_QR_CODE) != 0) {
/* 61 */                                IiIioO0ol1oI iiIioO0ol1oII0000Il00O = o1ooOo;
/* 62 */                                ?? oi110o0 = 0;
/* 63 */                                while (iiIioO0ol1oII0000Il00O != 0) {
/* 67 */                                    if (iiIioO0ol1oII0000Il00O instanceof Io0Illo) {
/* 69 */                                        Io0Illo io0Illo = (Io0Illo) iiIioO0ol1oII0000Il00O;
/* 75 */                                        io0Illo.I00i01iIIliI(il0lI1i1olii.I0000oI00(io0Illo, Barcode.FORMAT_QR_CODE));
                                            } else if ((iiIioO0ol1oII0000Il00O.I00iiO & Barcode.FORMAT_QR_CODE) != 0 && (iiIioO0ol1oII0000Il00O instanceof IiIioO0ol1oI)) {
/* 91 */                                        O1ooOo o1ooOo2 = iiIioO0ol1oII0000Il00O.I00o0l1o1o0;
/* 93 */                                        int i = 0;
                                                iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                                oi110o0 = oi110o0;
/* 95 */                                        while (o1ooOo2 != null) {
/* 100 */                                           if ((o1ooOo2.I00iiO & Barcode.FORMAT_QR_CODE) != 0) {
/* 102 */                                               i++;
                                                        oi110o0 = oi110o0;
/* 104 */                                               if (i == 1) {
/* 106 */                                                   iiIioO0ol1oII0000Il00O = o1ooOo2;
                                                        } else {
/* 108 */                                                   if (oi110o0 == 0) {
/* 116 */                                                       oi110o0 = new OI110O0(new O1ooOo[16]);
                                                            }
/* 119 */                                                   if (iiIioO0ol1oII0000Il00O != 0) {
/* 121 */                                                       oi110o0.I00000oOI(iiIioO0ol1oII0000Il00O);
/* 124 */                                                       iiIioO0ol1oII0000Il00O = 0;
                                                            }
/* 125 */                                                   oi110o0.I00000oOI(o1ooOo2);
                                                        }
                                                    }
/* 128 */                                           o1ooOo2 = o1ooOo2.I00ilO0;
                                                    iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                                    oi110o0 = oi110o0;
                                                }
/* 131 */                                       if (i == 1) {
                                                }
                                            }
/* 134 */                                   iiIioO0ol1oII0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                        }
                                    }
/* 142 */                           if ((o1ooOo.I00iio & Barcode.FORMAT_QR_CODE) == 0) {
                                        break;
                                    } else {
/* 144 */                               o1ooOo = o1ooOo.I00ilO0;
                                    }
                                }
                            }
                        }
/* 147 */               o0iiOioolIi.I010l1ol111 = false;
/* 149 */               OI110O0 oi110o0I001lIiIIo1O = o0iiOioolIi.I001lIiIIo1O();
/* 153 */               Object[] objArr = oi110o0I001lIiIIo1O.I00iOIl;
/* 155 */               int i2 = oi110o0I001lIiIIo1O.I00iiO;
/* 157 */               for (int i3 = 0; i3 < i2; i3++) {
/* 163 */                   I001i1O0Ol((O0iiOioolIi) objArr[i3]);
                        }
                    }
                }

                @Override
                public void I00000oIO(Oli1ooI0oi oli1ooI0oi) {
/* 3 */             OI0o11I1 oI0o11I1 = (OI0o11I1) this.I00iiO;
/* 5 */             oI0o11I1.I00000oIO();
/* 10 */            OI0olI1Oii0I oI0olI1Oii0I = (OI0olI1Oii0I) oli1ooI0oi.I00iiI;
/* 12 */            Object[] objArr = oI0olI1Oii0I.I00000oOI;
/* 14 */            long[] jArr = oI0olI1Oii0I.I0000Il00O;
/* 16 */            int i = oI0olI1Oii0I.I0000oI00;
/* 21 */            while (i != Integer.MAX_VALUE) {
/* 32 */                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
/* 33 */                Object obj = objArr[i];
/* 39 */                Object objI00000oOI = ((O0liI0l) this.I00iiI).I00000oOI(obj);
/* 43 */                int iI0000O = oI0o11I1.I0000O(objI00000oOI);
/* 54 */                int i3 = iI0000O >= 0 ? oI0o11I1.I0000Il00O[iI0000O] : 0;
/* 56 */                if (i3 == 7) {
/* 58 */                    oli1ooI0oi.remove(obj);
                        } else {
/* 64 */                    oI0o11I1.I000II(i3 + 1, objI00000oOI);
                        }
/* 67 */                i = i2;
                    }
                }

                @Override
                public IoiO1IO1I1i I00000oOI() {
/* 9 */             return I00111O(((I0oO0iO1l0lo) this.I00iiI).I00000oOI());
                }

                @Override
                public int I0000Il00O() {
/* 5 */             return ((I0oO0iO1l0lo) this.I00iiI).I0000Il00O();
                }

                @Override
                public int I0000O() {
/* 5 */             return ((I0oO0iO1l0lo) this.I00iiI).I0000O();
                }

                @Override
                public void I0000oI00() {
/* 5 */             ((I0oO0iO1l0lo) this.I00iiI).I0000oI00();
                }

                @Override
                public int I0001Ioi1lo() {
/* 5 */             return ((I0oO0iO1l0lo) this.I00iiI).I0001Ioi1lo();
                }

                @Override
                public Object I000II(Object obj) {
/* 5 */             return ((Function1) this.I00iiO).invoke(obj);
                }

                @Override
                public float I000O01llI0(float f, float f2) {
/* 3 */             OIoIoIO0oI1O oIoIoIO0oI1O = (OIoIoIO0oI1O) this.I00iiI;
/* 5 */             int iI000oI1ioi = oIoIoIO0oI1O.I000oI1ioi();
/* 9 */             OIooliIO0 oIooliIO0 = oIoIoIO0oI1O.I000lI;
/* 19 */            int i = ((OIoI1lIli) oIooliIO0.getValue()).I0000Il00O + iI000oI1ioi;
/* 21 */            if (i == 0) {
/* 20 */                return 0.0f;
                    }
/* 26 */            int i2 = oIoIoIO0oI1O.I0000oI00;
/* 28 */            if (f < 0.0f) {
/* 30 */                i2++;
                    }
/* 41 */            int iI0000Il00O = lIiioliIlo.I0000Il00O(((int) (f2 / i)) + i2, 0, oIoIoIO0oI1O.I000o00OoI0I());
/* 45 */            oIoIoIO0oI1O.I000oI1ioi();
/* 54 */            int i3 = ((OIoI1lIli) oIooliIO0.getValue()).I0000Il00O;
                    long j = i2;
/* 59 */            long j2 = j - 1;
/* 65 */            if (j2 < 0) {
/* 67 */                j2 = 0;
                    }
/* 68 */            int i4 = (int) j2;
/* 69 */            long j3 = j + 1;
/* 75 */            if (j3 > 2147483647L) {
/* 77 */                j3 = 2147483647L;
                    }
/* 97 */            int iAbs = Math.abs((lIiioliIlo.I0000Il00O(lIiioliIlo.I0000Il00O(iI0000Il00O, i4, (int) j3), 0, oIoIoIO0oI1O.I000o00OoI0I()) - i2) * i) - i;
/* 98 */            int i5 = iAbs >= 0 ? iAbs : 0;
/* 102 */           if (i5 == 0) {
/* 104 */               return i5;
                    }
/* 111 */           return Math.signum(f) * i5;
                }

                @Override
                public boolean I000OOo1O(Object obj, Object obj2) {
/* 3 */             O0liI0l o0liI0l = (O0liI0l) this.I00iiI;
/* 13 */            return O0000Ioio00.I0000O(o0liI0l.I00000oOI(obj), o0liI0l.I00000oOI(obj2));
                }

                @Override
                public float I000OiO(float f) {
/* 3 */             OIoIoIO0oI1O oIoIoIO0oI1O = (OIoIoIO0oI1O) this.I00iiI;
/* 9 */             IOO0o0I1l iOO0o0I1l = oIoIoIO0oI1O.I000lI().I000o00OoI0I;
/* 15 */            List list = oIoIoIO0oI1O.I000lI().I00000oIO;
/* 20 */            int size = list.size();
/* 29 */            float f2 = Float.NEGATIVE_INFINITY;
/* 30 */            float f3 = Float.POSITIVE_INFINITY;
/* 32 */            for (int i = 0; i < size; i++) {
/* 38 */                O1iOii1 o1iOii1 = (O1iOii1) list.get(i);
/* 44 */                l1o01i0.I00000oIO(oIoIoIO0oI1O.I000lI());
/* 51 */                int i2 = oIoIoIO0oI1O.I000lI().I0001Ioi1lo;
/* 57 */                int i3 = oIoIoIO0oI1O.I000lI().I0000O;
/* 63 */                int i4 = oIoIoIO0oI1O.I000lI().I00000oOI;
/* 65 */                int i5 = o1iOii1.I000OiO;
/* 67 */                oIoIoIO0oI1O.I000o00OoI0I();
/* 70 */                iOO0o0I1l.getClass();
/* 74 */                float f4 = i5 - 0.0f;
/* 77 */                if (f4 <= 0.0f && f4 > f2) {
/* 83 */                    f2 = f4;
                        }
/* 86 */                if (f4 >= 0.0f && f4 < f3) {
/* 92 */                    f3 = f4;
                        }
                    }
/* 98 */            if (f2 == Float.NEGATIVE_INFINITY) {
/* 100 */               f2 = f3;
                    }
/* 103 */           if (f3 == Float.POSITIVE_INFINITY) {
/* 105 */               f3 = f2;
                    }
/* 110 */           if (!oIoIoIO0oI1O.I0000O()) {
/* 116 */               if (l1o1Io0I.I00000oOI(oIoIoIO0oI1O, f)) {
/* 118 */                   f2 = 0.0f;
/* 119 */                   f3 = 0.0f;
                        } else {
/* 121 */                   f3 = 0.0f;
                        }
                    }
/* 126 */           if (!oIoIoIO0oI1O.I00000oOI()) {
/* 132 */               f2 = 0.0f;
/* 133 */               if (!l1o1Io0I.I00000oOI(oIoIoIO0oI1O, f)) {
/* 135 */                   f3 = 0.0f;
                        }
                    }
/* 136 */           Float fValueOf = Float.valueOf(f2);
/* 140 */           Float fValueOf2 = Float.valueOf(f3);
/* 144 */           float fFloatValue = fValueOf.floatValue();
/* 148 */           float fFloatValue2 = fValueOf2.floatValue();
/* 174 */           float fFloatValue3 = ((Number) ((I0illI1iI) this.I00iiO).invoke(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
/* 180 */           if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
/* 220 */               Ioll0IliO1l.I0000Il00O("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
                    }
/* 225 */           if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
/* 31 */                return 0.0f;
                    }
/* 437 */           return fFloatValue3;
                }

                @Override
                public Object I000iOII(OiIiOi0II oiIiOi0II, Object obj) {
/* 5 */             return ((IlliIl1l11O) this.I00iiI).invoke(oiIiOi0II, obj);
                }

                @Override
                public Object I000l1() {
/* 3 */             return (Ooii0i) this.I00iiI;
                }

                @Override
                public void I000lI(IoiO1iOOil11 ioiO1iOOil11, Executor executor) {
/* 3 */             I0oO0iO1l0lo i0oO0iO1l0lo = (I0oO0iO1l0lo) this.I00iiI;
/* 9 */             IIoIil iIoIil = new IIoIil(11);
/* 12 */            iIoIil.I00iiI = this;
/* 14 */            iIoIil.I00iiO = ioiO1iOOil11;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            i0oO0iO1l0lo.I000lI(iIoIil, executor);
                }

                @Override
                public boolean I000o00OoI0I(CharSequence charSequence, int i, int i2, OoOl1ol1l ooOl1ol1l) {
/* 6 */             if ((ooOl1ol1l.I0000Il00O & 4) > 0) {
/* 5 */                 return true;
                    }
/* 13 */            if (((Ooii0i) this.I00iiI) == null) {
/* 33 */                this.I00iiI = new Ooii0i(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
                    }
/* 39 */            ((Io1Oioii1111) this.I00iiO).getClass();
/* 44 */            OoOlI0ii ooOlI0ii = new OoOlI0ii();
/* 52 */            ooOlI0ii.I00iOIl = new Paint.FontMetricsInt();
/* 55 */            ooOlI0ii.I00iiO = (short) -1;
/* 59 */            ooOlI0ii.I00iio = 1.0f;
/* 61 */            ooOlI0ii.I00iiI = ooOl1ol1l;
/* 63 */            VarHandle.storeStoreFence();
/* 72 */            ((Ooii0i) this.I00iiI).setSpan(ooOlI0ii, i, i2, 33);
/* 5 */             return true;
                }

                @Override
                public int I000oI1ioi() {
/* 5 */             return ((I0oO0iO1l0lo) this.I00iiI).I000oI1ioi();
                }

                @Override
                public IoiO1IO1I1i I00100l0() {
/* 9 */             return I00111O(((I0oO0iO1l0lo) this.I00iiI).I00100l0());
                }

                public Ii10oo I00100o1O0lo() {
/* 1 */             Object obj = Ol0OII1O11l.I0000Il00O;
/* 9 */             lII11l.I00000oIO(IIloOI.class, (IIloOI) this.I00iiI);
/* 18 */            lII11l.I00000oIO(Oo0olliOi1.class, (Oo0olliOi1) this.I00iiO);
/* 25 */            IIloOI iIloOI = (IIloOI) this.I00iiI;
/* 29 */            Oo0olliOi1 oo0olliOi1 = (Oo0olliOi1) this.I00iiO;
/* 31 */            Ii10oo ii10oo = new Ii10oo();
/* 34 */            ii10oo.I0000Il00O = ii10oo;
/* 36 */            ii10oo.I00000oIO = iIloOI;
/* 38 */            ii10oo.I00000oOI = oo0olliOi1;
/* 45 */            ii10oo.I0000O = IIl001iO0Io.I000OOo1O(ii10oo, 1);
/* 47 */            int i = 0;
/* 52 */            ii10oo.I0000oI00 = IIl001iO0Io.I000OOo1O(ii10oo, 0);
/* 59 */            ii10oo.I0001Ioi1lo = IIl001iO0Io.I000OOo1O(ii10oo, 5);
/* 64 */            Ii10lO01Oi ii10lO01Oi = new Ii10lO01Oi(ii10oo, 7, i);
/* 69 */            Ol0OII1O11l ol0OII1O11l = new Ol0OII1O11l();
/* 72 */            ol0OII1O11l.I00000oOI = obj;
/* 74 */            ol0OII1O11l.I00000oIO = ii10lO01Oi;
/* 76 */            ii10oo.I000II = ol0OII1O11l;
/* 84 */            ii10oo.I000O01llI0 = IIl001iO0Io.I000OOo1O(ii10oo, 8);
/* 92 */            ii10oo.I000OOo1O = IIl001iO0Io.I000OOo1O(ii10oo, 9);
/* 100 */           ii10oo.I000OiO = IIl001iO0Io.I000OOo1O(ii10oo, 10);
/* 107 */           ii10oo.I000iOII = IIl001iO0Io.I000OOo1O(ii10oo, 6);
/* 115 */           ii10oo.I000l1 = IIl001iO0Io.I000OOo1O(ii10oo, 12);
/* 123 */           ii10oo.I000lI = IIl001iO0Io.I000OOo1O(ii10oo, 13);
/* 131 */           ii10oo.I000o00OoI0I = IIl001iO0Io.I000OOo1O(ii10oo, 11);
/* 139 */           ii10oo.I000oI1ioi = IIl001iO0Io.I000OOo1O(ii10oo, 17);
/* 147 */           ii10oo.I00100l0 = IIl001iO0Io.I000OOo1O(ii10oo, 16);
/* 153 */           Ii10lO01Oi ii10lO01Oi2 = new Ii10lO01Oi(ii10oo, 18, i);
/* 158 */           Ol0OII1O11l ol0OII1O11l2 = new Ol0OII1O11l();
/* 161 */           ol0OII1O11l2.I00000oOI = obj;
/* 163 */           ol0OII1O11l2.I00000oIO = ii10lO01Oi2;
/* 165 */           ii10oo.I00100o1O0lo = ol0OII1O11l2;
/* 173 */           ii10oo.I0010I0i = IIl001iO0Io.I000OOo1O(ii10oo, 19);
/* 181 */           ii10oo.I0010o = IIl001iO0Io.I000OOo1O(ii10oo, 15);
/* 189 */           ii10oo.I00111O = IIl001iO0Io.I000OOo1O(ii10oo, 20);
/* 197 */           ii10oo.I001IIilI0O = IIl001iO0Io.I000OOo1O(ii10oo, 14);
/* 205 */           ii10oo.I001IO000 = new Ii10lO01Oi(ii10oo, 4, i);
/* 212 */           ii10oo.I001i1O0Ol = IIl001iO0Io.I000OOo1O(ii10oo, 3);
/* 219 */           ii10oo.I001i1lo1io = IIl001iO0Io.I000OOo1O(ii10oo, 2);
/* 227 */           ii10oo.I001iOo1i0O = IIl001iO0Io.I000OOo1O(ii10oo, 21);
/* 235 */           ii10oo.I001l0I00 = IIl001iO0Io.I000OOo1O(ii10oo, 22);
/* 243 */           ii10oo.I001lIiIIo1O = IIl001iO0Io.I000OOo1O(ii10oo, 23);
/* 245 */           VarHandle.storeStoreFence();
/* 743 */           return ii10oo;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I0010I0i() {
                    synchronized (this.I00iiI) {
/* 6 */                 OI0l1oli1I oI0l1oli1I = (OI0l1oli1I) this.I00iiO;
/* 8 */                 long[] jArr = oI0l1oli1I.I00000oIO;
                        int length = jArr.length - 2;
/* 13 */                if (length >= 0) {
/* 16 */                    int i = 0;
                            while (true) {
/* 17 */                        long j = jArr[i];
/* 31 */                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 40 */                            int i2 = 8 - ((~(i - length)) >>> 31);
/* 43 */                            for (int i3 = 0; i3 < i2; i3++) {
/* 52 */                                if ((255 & j) < 128) {
/* 56 */                                    int i4 = (i << 3) + i3;
/* 59 */                                    int i5 = oI0l1oli1I.I00000oOI[i4];
/* 65 */                                    Oli0I0iiiO oli0I0iiiO = (Oli0I0iiiO) oI0l1oli1I.I0000Il00O[i4];
/* 71 */                                    if (oli0I0iiiO.I0000Il00O != Oli0Io110.I00ilI0I1 && !oli0I0iiiO.I00000oOI.I0000oI00()) {
/* 81 */                                        oI0l1oli1I.I000O01llI0(i4);
                                            }
                                        }
/* 87 */                                j >>= 8;
                                    }
/* 91 */                            if (i2 != 8) {
                                        break;
                                    } else if (i == length) {
                                        break;
                                    } else {
/* 95 */                                i++;
                                    }
                                }
                            }
                        }
                    }
                }

                public boolean I0010o(i01IIlI i01iili) {
                    boolean zContainsKey;
                    synchronized (this.I00iiO) {
/* 12 */                zContainsKey = ((LinkedHashMap) ((IIloOI) this.I00iiI).I00iiI).containsKey(i01iili);
                    }
/* 17 */            return zContainsKey;
                }

                public Oio0oi11l I00111O(IoiO1IO1I1i ioiO1IO1I1i) {
                    Olo0o1II0 olo0o1II0;
/* 1 */             Object obj = null;
/* 2 */             if (ioiO1IO1I1i == null) {
/* 1 */                 return null;
                    }
/* 9 */             if (((OOIo1Iiiil) this.I00iiO) == null) {
/* 11 */                olo0o1II0 = Olo0o1II0.I00000oOI;
                    } else {
/* 18 */                OOIo1Iiiil oOIo1Iiiil = (OOIo1Iiiil) this.I00iiO;
/* 29 */                Pair pair = new Pair(oOIo1Iiiil.I000O01llI0, oOIo1Iiiil.I000OOo1O.get(0));
/* 32 */                Olo0o1II0 olo0o1II02 = Olo0o1II0.I00000oOI;
/* 36 */                ArrayMap arrayMap = new ArrayMap();
/* 45 */                arrayMap.put((String) pair.first, pair.second);
/* 50 */                olo0o1II0 = new Olo0o1II0(arrayMap);
                    }
/* 53 */            this.I00iiO = null;
/* 88 */            return new Oio0oi11l(ioiO1IO1I1i, new Size(ioiO1IO1I1i.I0001Ioi1lo(), ioiO1IO1I1i.I0000O()), new IIlI0lO(new O1Il01(obj, ioiO1IO1I1i.I00i0oil().I0000oI00(), olo0o1II0)));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
                public ArrayList I001IIilI0O() throws PackageManager.NameNotFoundException {
                    ?? arrayList;
/* 3 */             ArrayList arrayList2 = new ArrayList();
/* 8 */             O1OIll00i o1OIll00i = (O1OIll00i) this.I00iiO;
/* 12 */            Context context = (Context) this.I00iiI;
/* 16 */            Class cls = (Class) o1OIll00i.I00iiI;
/* 20 */            Bundle bundle = null;
                    try {
/* 21 */                PackageManager packageManager = context.getPackageManager();
/* 25 */                if (packageManager == null) {
/* 29 */                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                        } else {
/* 40 */                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), Barcode.FORMAT_ITF);
/* 44 */                    if (serviceInfo == null) {
/* 63 */                        Log.w("ComponentDiscovery", cls + " has no service info.");
                            } else {
/* 67 */                        bundle = serviceInfo.metaData;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
/* 72 */                Log.w("ComponentDiscovery", "Application info not found.");
                    }
/* 75 */            if (bundle == null) {
/* 79 */                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
/* 82 */                arrayList = Collections.EMPTY_LIST;
                    } else {
/* 87 */                arrayList = new ArrayList();
/* 102 */               for (String str : bundle.keySet()) {
/* 120 */                   if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
/* 136 */                       arrayList.add(str.substring(31));
                            }
                        }
                    }
/* 148 */           for (String str2 : arrayList) {
/* 159 */               IOiOi00Io1 iOiOi00Io1 = new IOiOi00Io1(0);
/* 162 */               iOiOi00Io1.I00000oOI = str2;
/* 164 */               VarHandle.storeStoreFence();
/* 167 */               arrayList2.add(iOiOi00Io1);
                    }
/* 245 */           return arrayList2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I001IO000() {
                    Object[] objArr;
/* 3 */             OI110O0 oi110o0 = (OI110O0) this.I00iiI;
/* 12 */            Arrays.sort(oi110o0.I00iOIl, 0, oi110o0.I00iiO, IliIiio1.I00ilI0I1);
/* 15 */            int i = oi110o0.I00iiO;
/* 19 */            O0iiOioolIi[] o0iiOioolIiArr = (O0iiOioolIi[]) this.I00iiO;
/* 21 */            if (o0iiOioolIiArr != null) {
/* 23 */                int length = o0iiOioolIiArr.length;
                        objArr = o0iiOioolIiArr;
/* 24 */                if (length < i) {
/* 32 */                    objArr = new O0iiOioolIi[Math.max(16, i)];
                        }
                    }
/* 35 */            this.I00iiO = null;
/* 37 */            for (int i2 = 0; i2 < i; i2++) {
/* 43 */                objArr[i2] = oi110o0.I00iOIl[i2];
                    }
/* 48 */            oi110o0.I000II();
                    while (true) {
                        i--;
/* 54 */                if (-1 >= i) {
/* 70 */                    this.I00iiO = objArr;
/* 110 */                   return;
                        }
/* 56 */                O0iiOioolIi o0iiOioolIi = objArr[i];
/* 60 */                if (o0iiOioolIi.I010l1ol111) {
/* 62 */                    I001i1O0Ol(o0iiOioolIi);
                        }
/* 65 */                objArr[i] = 0;
                    }
                }

                public void I001i1lo1io(boolean z) {
/* 5 */             Ill0l1 ill0l1 = ((Ill1OlOOl) this.I00iiO).I001IO000;
/* 7 */             if (ill0l1 != null) {
/* 16 */                ill0l1.I000lI().I000l1.I001i1lo1io(true);
                    }
/* 23 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiI).iterator();
/* 31 */            if (it.hasNext()) {
/* 37 */                if (it.next() != null) {
/* 44 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 40 */                    if (!z) {
/* 43 */                        throw null;
                            }
/* 42 */                    throw null;
                        }
                    }
                }

                public void I001iOo1i0O(boolean z) {
/* 3 */             Ill1OlOOl ill1OlOOl = (Ill1OlOOl) this.I00iiO;
/* 7 */             Ill0oOi0 ill0oOi0 = ill1OlOOl.I00111O.I00iiI;
/* 9 */             Ill0l1 ill0l1 = ill1OlOOl.I001IO000;
/* 11 */            if (ill0l1 != null) {
/* 20 */                ill0l1.I000lI().I000l1.I001iOo1i0O(true);
                    }
/* 27 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiI).iterator();
/* 35 */            if (it.hasNext()) {
/* 41 */                if (it.next() != null) {
/* 48 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 44 */                    if (!z) {
/* 47 */                        throw null;
                            }
/* 46 */                    throw null;
                        }
                    }
                }

                public void I001l0I00(boolean z) {
/* 5 */             Ill0l1 ill0l1 = ((Ill1OlOOl) this.I00iiO).I001IO000;
/* 7 */             if (ill0l1 != null) {
/* 16 */                ill0l1.I000lI().I000l1.I001l0I00(true);
                    }
/* 23 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiI).iterator();
/* 31 */            if (it.hasNext()) {
/* 37 */                if (it.next() != null) {
/* 44 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 40 */                    if (!z) {
/* 43 */                        throw null;
                            }
/* 42 */                    throw null;
                        }
                    }
                }

                @Override
                public void I001lIiIIo1O(IInterface iInterface, OOoolO01Ioo oOoolO01Ioo) {
/* 7 */             UUID uuid = (UUID) this.I00iiI;
/* 11 */            Ii11I1OOII1 ii11I1OOII1 = (Ii11I1OOII1) this.I00iiO;
/* 13 */            OIooloO1 oIooloO1 = new OIooloO1();
/* 20 */            oIooloO1.I00iOIl = uuid.toString();
/* 27 */            oIooloO1.I00iiI = new OIolIiIOI1I(ii11I1OOII1);
/* 29 */            VarHandle.storeStoreFence();
/* 36 */            ((IoOlo00) iInterface).I00IO1(oOoolO01Ioo, l1oOOloO0.I00000oIO(oIooloO1));
                }

                public void I001lllioOl(boolean z) {
/* 5 */             Ill0l1 ill0l1 = ((Ill1OlOOl) this.I00iiO).I001IO000;
/* 7 */             if (ill0l1 != null) {
/* 16 */                ill0l1.I000lI().I000l1.I001lllioOl(true);
                    }
/* 23 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiI).iterator();
/* 31 */            if (it.hasNext()) {
/* 37 */                if (it.next() != null) {
/* 44 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 40 */                    if (!z) {
/* 43 */                        throw null;
                            }
/* 42 */                    throw null;
                        }
                    }
                }

                public void I001lloI(boolean z) {
/* 5 */             Ill0l1 ill0l1 = ((Ill1OlOOl) this.I00iiO).I001IO000;
/* 7 */             if (ill0l1 != null) {
/* 16 */                ill0l1.I000lI().I000l1.I001lloI(true);
                    }
/* 23 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiI).iterator();
/* 31 */            if (it.hasNext()) {
/* 37 */                if (it.next() != null) {
/* 44 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 40 */                    if (!z) {
/* 43 */                        throw null;
                            }
/* 42 */                    throw null;
                        }
                    }
                }

                public void I00II0Ol1O0l(boolean z) {
/* 5 */             Ill0l1 ill0l1 = ((Ill1OlOOl) this.I00iiO).I001IO000;
/* 7 */             if (ill0l1 != null) {
/* 16 */                ill0l1.I000lI().I000l1.I00II0Ol1O0l(true);
                    }
/* 23 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiI).iterator();
/* 31 */            if (it.hasNext()) {
/* 37 */                if (it.next() != null) {
/* 44 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 40 */                    if (!z) {
/* 43 */                        throw null;
                            }
/* 42 */                    throw null;
                        }
                    }
                }

                public void I00II0oii1o(boolean z) {
/* 3 */             Ill1OlOOl ill1OlOOl = (Ill1OlOOl) this.I00iiO;
/* 7 */             Ill0oOi0 ill0oOi0 = ill1OlOOl.I00111O.I00iiI;
/* 9 */             Ill0l1 ill0l1 = ill1OlOOl.I001IO000;
/* 11 */            if (ill0l1 != null) {
/* 20 */                ill0l1.I000lI().I000l1.I00II0oii1o(true);
                    }
/* 27 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiI).iterator();
/* 35 */            if (it.hasNext()) {
/* 41 */                if (it.next() != null) {
/* 48 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 44 */                    if (!z) {
/* 47 */                        throw null;
                            }
/* 46 */                    throw null;
                        }
                    }
                }

                public void I00IO1(boolean z) {
/* 5 */             Ill0l1 ill0l1 = ((Ill1OlOOl) this.I00iiO).I001IO000;
/* 7 */             if (ill0l1 != null) {
/* 16 */                ill0l1.I000lI().I000l1.I00IO1(true);
                    }
/* 23 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiI).iterator();
/* 31 */            if (it.hasNext()) {
/* 37 */                if (it.next() != null) {
/* 44 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 40 */                    if (!z) {
/* 43 */                        throw null;
                            }
/* 42 */                    throw null;
                        }
                    }
                }

                public void I00IO1oi11O(boolean z) {
/* 5 */             Ill0l1 ill0l1 = ((Ill1OlOOl) this.I00iiO).I001IO000;
/* 7 */             if (ill0l1 != null) {
/* 16 */                ill0l1.I000lI().I000l1.I00IO1oi11O(true);
                    }
/* 23 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiI).iterator();
/* 31 */            if (it.hasNext()) {
/* 37 */                if (it.next() != null) {
/* 44 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 40 */                    if (!z) {
/* 43 */                        throw null;
                            }
/* 42 */                    throw null;
                        }
                    }
                }

                public void I00IOO(boolean z) {
/* 5 */             Ill0l1 ill0l1 = ((Ill1OlOOl) this.I00iiO).I001IO000;
/* 7 */             if (ill0l1 != null) {
/* 16 */                ill0l1.I000lI().I000l1.I00IOO(true);
                    }
/* 23 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiI).iterator();
/* 31 */            if (it.hasNext()) {
/* 37 */                if (it.next() != null) {
/* 44 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 40 */                    if (!z) {
/* 43 */                        throw null;
                            }
/* 42 */                    throw null;
                        }
                    }
                }

                public void I00IioO0OiOi(boolean z) {
/* 5 */             Ill0l1 ill0l1 = ((Ill1OlOOl) this.I00iiO).I001IO000;
/* 7 */             if (ill0l1 != null) {
/* 16 */                ill0l1.I000lI().I000l1.I00IioO0OiOi(true);
                    }
/* 23 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiI).iterator();
/* 31 */            if (it.hasNext()) {
/* 37 */                if (it.next() != null) {
/* 44 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 40 */                    if (!z) {
/* 43 */                        throw null;
                            }
/* 42 */                    throw null;
                        }
                    }
                }

                public void I00IlilI0i0i(boolean z) {
/* 5 */             Ill0l1 ill0l1 = ((Ill1OlOOl) this.I00iiO).I001IO000;
/* 7 */             if (ill0l1 != null) {
/* 16 */                ill0l1.I000lI().I000l1.I00IlilI0i0i(true);
                    }
/* 23 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiI).iterator();
/* 31 */            if (it.hasNext()) {
/* 37 */                if (it.next() != null) {
/* 44 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 40 */                    if (!z) {
/* 43 */                        throw null;
                            }
/* 42 */                    throw null;
                        }
                    }
                }

                public void I00Io1lO(boolean z) {
/* 5 */             Ill0l1 ill0l1 = ((Ill1OlOOl) this.I00iiO).I001IO000;
/* 7 */             if (ill0l1 != null) {
/* 16 */                ill0l1.I000lI().I000l1.I00Io1lO(true);
                    }
/* 23 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiI).iterator();
/* 31 */            if (it.hasNext()) {
/* 37 */                if (it.next() != null) {
/* 44 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 40 */                    if (!z) {
/* 43 */                        throw null;
                            }
/* 42 */                    throw null;
                        }
                    }
                }

                public void I00Io1o110i(boolean z) {
/* 5 */             Ill0l1 ill0l1 = ((Ill1OlOOl) this.I00iiO).I001IO000;
/* 7 */             if (ill0l1 != null) {
/* 16 */                ill0l1.I000lI().I000l1.I00Io1o110i(true);
                    }
/* 23 */            Iterator it = ((CopyOnWriteArrayList) this.I00iiI).iterator();
/* 31 */            if (it.hasNext()) {
/* 37 */                if (it.next() != null) {
/* 44 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 40 */                    if (!z) {
/* 43 */                        throw null;
                            }
/* 42 */                    throw null;
                        }
                    }
                }

                public InputMethodManager I00IoIO0lI() {
/* 9 */             return (InputMethodManager) ((O0ioIllo0i1) this.I00iiO).getValue();
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[PHI: r5
                  0x006a: PHI (r5v3 long) = (r5v2 long), (r5v4 long) binds: [B:8:0x0025, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public long I00IoO0() {
                    long j;
                    int i;
                    synchronized (this.I00iiI) {
/* 8 */                 OI0l1oli1I oI0l1oli1I = (OI0l1oli1I) this.I00iiO;
/* 10 */                int[] iArr = oI0l1oli1I.I00000oOI;
/* 12 */                Object[] objArr = oI0l1oli1I.I0000Il00O;
/* 14 */                long[] jArr = oI0l1oli1I.I00000oIO;
                        int length = jArr.length - 2;
/* 19 */                j = 0;
/* 21 */                if (length >= 0) {
/* 23 */                    int i2 = 0;
                            while (true) {
/* 24 */                        long j2 = jArr[i2];
/* 38 */                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 45 */                            int i3 = 8;
/* 47 */                            int i4 = 8 - ((~(i2 - length)) >>> 31);
/* 49 */                            int i5 = 0;
/* 50 */                            while (i5 < i4) {
/* 59 */                                if ((255 & j2) < 128) {
/* 63 */                                    int i6 = (i2 << 3) + i5;
/* 64 */                                    int i7 = iArr[i6];
/* 68 */                                    Oli0I0iiiO oli0I0iiiO = (Oli0I0iiiO) objArr[i6];
/* 72 */                                    i = i3;
/* 76 */                                    if (oli0I0iiiO.I0000Il00O == Oli0Io110.I00ilI0I1 || oli0I0iiiO.I00000oOI.I0000oI00()) {
/* 93 */                                        j |= 1 << i7;
                                            }
                                        } else {
/* 95 */                                    i = i3;
                                        }
/* 97 */                                j2 >>= i;
/* 99 */                                i5++;
/* 101 */                               i3 = i;
                                    }
/* 105 */                           if (i4 != i3) {
                                        break;
                                    }
/* 107 */                           if (i2 == length) {
                                        break;
                                    }
/* 109 */                           i2++;
                                }
                            }
                        }
                    }
/* 113 */           return j;
                }

                public AutofillId I00IoiI(long j) {
/* 17 */            return ((ContentCaptureSession) this.I00iiO).newAutofillId((AutofillId) li1iI1ill1.I00000oIO((View) this.I00iiI).I00iiI, j);
                }

                public void I00Iooi00oi(IliiOioI1l1I iliiOioI1l1I) {
/* 3 */             II0i0l01ooIO iI0i0l01ooIO = (II0i0l01ooIO) this.I00iiO;
/* 7 */             Oi00IilOloo0 oi00IilOloo0 = (Oi00IilOloo0) this.I00iiI;
/* 9 */             int i = iliiOioI1l1I.I00000oOI;
/* 11 */            if (i != 0) {
/* 35 */                IIiOiIiO01O iIiOiIiO01O = new IIiOiIiO01O(0);
/* 38 */                iIiOiIiO01O.I00iiO = oi00IilOloo0;
/* 40 */                iIiOiIiO01O.I00iiI = i;
/* 42 */                VarHandle.storeStoreFence();
/* 45 */                iI0i0l01ooIO.execute(iIiOiIiO01O);
/* 77 */                return;
                    }
/* 13 */            Typeface typeface = iliiOioI1l1I.I00000oIO;
/* 18 */            IlloOi1I1OO illoOi1I1OO = new IlloOi1I1OO(1);
/* 21 */            illoOi1I1OO.I00iiI = oi00IilOloo0;
/* 23 */            illoOi1I1OO.I00iiO = typeface;
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            iI0i0l01ooIO.execute(illoOi1I1OO);
                }

                public void I00O0i0ii(Oli0oiO oli0oiO) {
                    int i;
/* 5 */             OI0l1oli1I oI0l1oli1I = (OI0l1oli1I) this.I00iiO;
/* 7 */             int[] iArr = oI0l1oli1I.I00000oOI;
/* 9 */             Object[] objArr = oI0l1oli1I.I0000Il00O;
/* 11 */            long[] jArr = oI0l1oli1I.I00000oIO;
/* 14 */            int i2 = 2;
/* 15 */            int length = jArr.length - 2;
/* 16 */            if (length < 0) {
/* 168 */               return;
                    }
/* 18 */            int i3 = 0;
                    while (true) {
/* 19 */                long j = jArr[i3];
/* 33 */                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 40 */                    int i4 = 8;
/* 42 */                    int i5 = 8 - ((~(i3 - length)) >>> 31);
/* 44 */                    int i6 = 0;
/* 45 */                    while (i6 < i5) {
/* 54 */                        if ((255 & j) < 128) {
/* 58 */                            int i7 = (i3 << 3) + i6;
/* 59 */                            int i8 = iArr[i7];
/* 63 */                            Oli0I0iiiO oli0I0iiiO = (Oli0I0iiiO) objArr[i7];
/* 65 */                            Oli0Io110 oli0Io110 = oli0I0iiiO.I0000Il00O;
/* 67 */                            IoloOio0I ioloOio0I = oli0I0iiiO.I0000oI00;
/* 69 */                            int iOrdinal = oli0Io110.ordinal();
/* 73 */                            if (iOrdinal != 0) {
/* 75 */                                int i9 = 5;
/* 76 */                                IOoil1iiIilo iOoil1iiIilo = null;
/* 77 */                                i = i4;
/* 80 */                                if (iOrdinal == i2) {
/* 110 */                                   oli0I0iiiO.I0000Il00O = Oli0Io110.I00ilI0I1;
/* 112 */                                   Ii0110 ii0110I00ooiO1I = oli0oiO.I00ooiO1I();
/* 116 */                                   OlIl0i olIl0i = oli0I0iiiO.I0000O;
/* 118 */                                   if (olIl0i != null) {
/* 120 */                                       olIl0i.I000II(null);
                                            }
/* 132 */                                   oli0I0iiiO.I0000O = iOi1II01i0.I0000O(ii0110I00ooiO1I, null, null, new Ol110ii1I(ioloOio0I, oli0I0iiiO, iOoil1iiIilo, i9), 3);
                                        } else if (iOrdinal == 3) {
/* 85 */                                    Ii0110 ii0110I00ooiO1I2 = oli0oiO.I00ooiO1I();
/* 89 */                                    OlIl0i olIl0i2 = oli0I0iiiO.I0000O;
/* 91 */                                    if (olIl0i2 != null) {
/* 93 */                                        olIl0i2.I000II(null);
                                            }
/* 105 */                                   oli0I0iiiO.I0000O = iOi1II01i0.I0000O(ii0110I00ooiO1I2, null, null, new Ol110ii1I(ioloOio0I, oli0I0iiiO, iOoil1iiIilo, i9), 3);
                                        }
                                    } else {
/* 135 */                               i = i4;
/* 139 */                               oli0I0iiiO.I0000Il00O = Oli0Io110.I00ilO0;
                                    }
                                } else {
/* 142 */                           i = i4;
                                }
/* 144 */                       j >>= i;
/* 146 */                       i6++;
/* 148 */                       i4 = i;
/* 150 */                       i2 = 2;
                            }
/* 153 */                   if (i5 != i4) {
/* 168 */                       return;
                            }
                        }
/* 155 */               if (i3 == length) {
/* 168 */                   return;
                        }
/* 157 */               i3++;
/* 159 */               i2 = 2;
                    }
                }

                public boolean I00O0o1oo(int i, boolean z, I110IiI0o1Il i110IiI0o1Il) {
/* 3 */             OI0l1oli1I oI0l1oli1I = (OI0l1oli1I) this.I00iiO;
/* 9 */             Oli0I0iiiO oli0I0iiiO = (Oli0I0iiiO) oI0l1oli1I.I00000oOI(i);
/* 12 */            if (oli0I0iiiO != null) {
/* 14 */                if (!z && O0000Ioio00.I0000O(oli0I0iiiO.I00000oIO, i110IiI0o1Il)) {
/* 27 */                    oli0I0iiiO.I0000Il00O = Oli0Io110.I00iiI;
/* 29 */                    return false;
                        }
/* 31 */                oli0I0iiiO.I00000oIO = i110IiI0o1Il;
/* 35 */                oli0I0iiiO.I0000Il00O = Oli0Io110.I00iiO;
/* 11 */                return true;
                    }
/* 38 */            if (z) {
/* 42 */                Oli0I0iiiO oli0I0iiiO2 = new Oli0I0iiiO();
/* 45 */                oli0I0iiiO2.I0000oI00 = this;
/* 47 */                oli0I0iiiO2.I00000oIO = i110IiI0o1Il;
/* 54 */                oli0I0iiiO2.I00000oOI = O1OI1ll1Il0i.I00000oIO(0.0f);
/* 58 */                oli0I0iiiO2.I0000Il00O = Oli0Io110.I00iio;
/* 60 */                VarHandle.storeStoreFence();
/* 63 */                oI0l1oli1I.I000OOo1O(i, oli0I0iiiO2);
                    }
/* 11 */            return true;
                }

                public OlO0000lIOII I00O10llo(i01IIlI i01iili) {
                    OlO0000lIOII olO0000lIOIII00O0i0ii;
                    synchronized (this.I00iiO) {
/* 8 */                 olO0000lIOIII00O0i0ii = ((IIloOI) this.I00iiI).I00O0i0ii(i01iili);
                    }
/* 13 */            return olO0000lIOIII00O0i0ii;
                }

                public ListenableFuture I00OI1(I1OlOl11O0 i1OlOl11O0, Executor executor) {
/* 1 */             executor.getClass();
/* 8 */             Il11olIIio1i il11olIIio1i = new Il11olIIio1i(Il11o0l.I00iOIl);
/* 11 */            il11olIIio1i.I00iiI = executor;
/* 13 */            il11olIIio1i.I00iOIl = this;
/* 19 */            IIlio101Io iIlio101Io = new IIlio101Io(12);
/* 22 */            iIlio101Io.I00iiI = il11olIIio1i;
/* 24 */            iIlio101Io.I00iiO = i1OlOl11O0;
/* 26 */            VarHandle.storeStoreFence();
/* 31 */            Oio0llilli oio0llilli = new Oio0llilli();
/* 42 */            ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.I00iiI).getAndSet(oio0llilli);
/* 46 */            OoIlol ooIlol = new OoIlol();
/* 54 */            ooIlol.I00l0I0l0lO1 = new OoIlliloii0(ooIlol, iIlio101Io);
/* 56 */            listenableFuture.addListener(ooIlol, il11olIIio1i);
/* 59 */            ListenableFuture listenableFutureI0000O = IlloOoiiO.I0000O(ooIlol);
/* 66 */            IioOIoool1 iioOIoool1 = new IioOIoool1(1);
/* 69 */            iioOIoool1.I00iiI = ooIlol;
/* 71 */            iioOIoool1.I00iiO = oio0llilli;
/* 73 */            iioOIoool1.I00iio = listenableFuture;
/* 75 */            iioOIoool1.I00ilI0I1 = listenableFutureI0000O;
/* 77 */            iioOIoool1.I00ilO0 = il11olIIio1i;
/* 79 */            VarHandle.storeStoreFence();
/* 82 */            Iii11Ooi iii11Ooi = Iii11Ooi.I00iOIl;
/* 84 */            listenableFutureI0000O.addListener(iioOIoool1, iii11Ooi);
/* 87 */            ooIlol.addListener(iioOIoool1, iii11Ooi);
/* 106 */           return listenableFutureI0000O;
                }

                public float I00OIO1(int i) {
                    synchronized (this.I00iiI) {
/* 12 */                Oli0I0iiiO oli0I0iiiO = (Oli0I0iiiO) ((OI0l1oli1I) this.I00iiO).I00000oOI(i);
/* 14 */                float fFloatValue = 0.0f;
/* 15 */                if (oli0I0iiiO == null) {
/* 14 */                    return 0.0f;
                        }
/* 23 */                if (oli0I0iiiO.I0000Il00O != Oli0Io110.I00ilI0I1) {
/* 34 */                    fFloatValue = ((Number) oli0I0iiiO.I00000oOI.I0000O()).floatValue();
                        }
/* 39 */                return fFloatValue;
                    }
                }

                public OlO0000lIOII I00OIl(i01IIlI i01iili) {
                    OlO0000lIOII olO0000lIOIII00OIO1;
                    synchronized (this.I00iiO) {
/* 8 */                 olO0000lIOIII00OIO1 = ((IIloOI) this.I00iiI).I00OIO1(i01iili);
                    }
/* 13 */            return olO0000lIOIII00OIO1;
                }

                @Override
                public void close() {
/* 5 */             ((I0oO0iO1l0lo) this.I00iiI).close();
                }

                @Override
                public Surface getSurface() {
/* 5 */             return ((I0oO0iO1l0lo) this.I00iiI).getSurface();
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 17:
/* 13 */                    return (String) this.I00iiI;
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 11 */        public IoloOio0I(int i, Object obj, Object obj2) {
/* 12 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                    this.I00iiO = obj2;
                }

/* 12 */        public IoloOio0I(int i) {
/* 13 */            this.I00iOIl = i;
                }
            }
