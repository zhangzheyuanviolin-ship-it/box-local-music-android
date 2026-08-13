            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.PointF;
            import android.graphics.RectF;
            import android.speech.tts.TextToSpeech;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.text.TextRecognizer;
            import com.k2fsa.sherpa.onnx.OfflineRecognizer;
            import java.io.File;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LII1o0111IO0;", "LOooioIIoi0O;", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class II1o0111IO0 extends OooioIIoi0O {
                public Context I00000oOI;
                public OlO0OIIl1 I0000Il00O;
                public OOli1O I0000O;
                public IIOo1i I0000oI00;
                public O1loO10Ii0I I0001Ioi1lo;
                public Oi0Oooi I000II;
                public I1OI0i1lo I000O01llI0;
                public Oil1lO I000OOo1O;
                public II1iIoli I000OiO;
                public volatile boolean I000iOII;
                public volatile boolean I000l1;
                public volatile int I000lI;
                public volatile O1oIOiI11o0 I000o00OoI0I;
                public volatile Bitmap I000oI1ioi;
                public volatile boolean I00100l0;
                public long I00100o1O0lo;
                public String I0010I0i;
                public volatile IIlO1O0lOl I0010o;
                public volatile IIllOioOlolI I00111O;
                public OlIl0i I001IIilI0O;
                public volatile boolean I001IO000;
                public long I001i1O0Ol;
                public int I001i1lo1io;
                public int I001iOo1i0O;
                public volatile float I001l0I00;

                public static String I0000oI00(String str) {
/* 35 */            List listI000O01llI0 = IOOi1I.I000O01llI0('a', 'e', 'i', 'o', 'u');
/* 55 */            Character chValueOf = str.length() == 0 ? null : Character.valueOf(str.charAt(0));
                    return IOOi0Ool1i.I001i1O0Ol(listI000O01llI0, chValueOf != null ? Character.valueOf(Character.toLowerCase(chValueOf.charValue())) : null) ? "an " : "a ";
                }

                public static final OIoi0IIoi I000l1(O1oiOloOo o1oiOloOo, Function1 function1) {
                    O1oIOiI11o0 o1oIOiI11o0I000lI;
                    O1oIOiI11o0 o1oIOiI11o0I000lI2;
/* 13 */            Iterator it = IOOi1I.I000O01llI0("llm_ask_image", "llm_chat").iterator();
                    while (true) {
/* 21 */                Object obj = null;
/* 22 */                if (!it.hasNext()) {
/* 86 */                    for (OloIl1l1oOii oloIl1l1oOii : o1oiOloOo.I00000oIO) {
/* 102 */                       if (!O0000Ioio00.I0000O(oloIl1l1oOii.I00000oIO, "llm_agent_chat") && (o1oIOiI11o0I000lI = I000lI(function1, oloIl1l1oOii)) != null) {
/* 112 */                           return new OIoi0IIoi(oloIl1l1oOii, o1oIOiI11o0I000lI);
                                }
                            }
/* 21 */                    return null;
                        }
/* 28 */                String str = (String) it.next();
/* 34 */                Iterator it2 = o1oiOloOo.I00000oIO.iterator();
                        while (true) {
/* 42 */                    if (!it2.hasNext()) {
                                break;
                            }
/* 44 */                    Object next = it2.next();
/* 57 */                    if (O0000Ioio00.I0000O(((OloIl1l1oOii) next).I00000oIO, str)) {
/* 59 */                        obj = next;
                                break;
                            }
                        }
/* 60 */                OloIl1l1oOii oloIl1l1oOii2 = (OloIl1l1oOii) obj;
/* 62 */                if (oloIl1l1oOii2 != null && (o1oIOiI11o0I000lI2 = I000lI(function1, oloIl1l1oOii2)) != null) {
/* 72 */                    return new OIoi0IIoi(oloIl1l1oOii2, o1oIOiI11o0I000lI2);
                        }
                    }
                }

                public static final O1oIOiI11o0 I000lI(Function1 function1, OloIl1l1oOii oloIl1l1oOii) {
                    Object next;
/* 3 */             Iterator it = oloIl1l1oOii.I000OiO.iterator();
                    while (true) {
/* 11 */                if (!it.hasNext()) {
/* 37 */                    next = null;
                            break;
                        }
/* 13 */                next = it.next();
/* 18 */                O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) next;
/* 22 */                if (o1oIOiI11o0.I001i1O0Ol && ((Boolean) function1.invoke(o1oIOiI11o0)).booleanValue()) {
                            break;
                        }
                    }
/* 38 */            return (O1oIOiI11o0) next;
                }

                /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
                
                    r8 = r1 + 1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0010o(StringBuilder sb, OOo0ll111 oOo0ll111, II1o0111IO0 iI1o0111IO0, OOo0l0ii10l oOo0l0ii10l, boolean z) {
                    int length;
/* 2 */             if (z) {
/* 4 */                 length = sb.length();
                    } else {
/* 9 */                 length = oOo0ll111.I00iOIl;
/* 15 */                int length2 = sb.length() - 1;
/* 16 */                if (length <= length2) {
                            while (true) {
/* 18 */                        char cCharAt = sb.charAt(length2);
/* 24 */                        if (cCharAt != '\n' && ((cCharAt != '.' && cCharAt != '!' && cCharAt != '?') || (length2 != sb.length() - 1 && !iOlI1lIi0.I0000Il00O(sb.charAt(length2 + 1))))) {
/* 61 */                            if (length2 == length) {
                                        break;
                                    } else {
                                        length2--;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
/* 66 */            int i = oOo0ll111.I00iOIl;
/* 68 */            if (length > i) {
/* 78 */                String string = OlOoOIi0o.I00OIo(sb.substring(i, length)).toString();
/* 82 */                oOo0ll111.I00iOIl = length;
/* 88 */                if (string.length() > 0) {
/* 90 */                    I1OI0i1lo i1OI0i1lo = iI1o0111IO0.I000O01llI0;
/* 92 */                    boolean z2 = oOo0l0ii10l.I00iOIl;
/* 94 */                    i1OI0i1lo.getClass();
/* 101 */                   String string2 = OlOoOIi0o.I00OIo(string).toString();
/* 109 */                   if (string2.length() != 0) {
/* 114 */                       i1OI0i1lo.I0001Ioi1lo = "";
/* 116 */                       TextToSpeech textToSpeech = i1OI0i1lo.I00000oOI;
/* 118 */                       if (textToSpeech != null && i1OI0i1lo.I0000Il00O) {
/* 136 */                           textToSpeech.speak(string2, z2 ? 1 : 0, null, IlIi0I0.I000iOII(System.currentTimeMillis(), "boxassist-stream-"));
                                } else if (i1OI0i1lo.I0000O == null || !z2) {
/* 151 */                           i1OI0i1lo.I0000O = new I1OI0OoIOl(string2, z2 ? 1 : 0);
                                }
                            }
/* 153 */                   oOo0l0ii10l.I00iOIl = true;
                        }
                    }
                }

                public static float I00111O(Bitmap bitmap) {
/* 4 */             Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 96, 96, true);
/* 10 */            int[] iArr = new int[9216];
/* 17 */            bitmapCreateScaledBitmap.getPixels(iArr, 0, 96, 0, 0, 96, 96);
/* 20 */            if (bitmapCreateScaledBitmap != bitmap) {
/* 22 */                bitmapCreateScaledBitmap.recycle();
                    }
/* 25 */            int[] iArr2 = new int[9216];
/* 27 */            int i = 0;
/* 29 */            for (int i2 = 0; i2 < 9216; i2++) {
/* 31 */                int i3 = iArr[i2];
/* 53 */                iArr2[i2] = (((i3 & 255) * 114) + ((((i3 >> 8) & 255) * 587) + (((i3 >> 16) & 255) * 299))) / 1000;
                    }
/* 58 */            double d = 0.0d;
/* 60 */            double d2 = 0.0d;
/* 64 */            for (int i4 = 1; i4 < 95; i4++) {
/* 66 */                int i5 = i4 * 96;
/* 69 */                for (int i6 = 1; i6 < 95; i6++) {
/* 71 */                    int i7 = i5 + i6;
/* 95 */                    double d3 = ((((iArr2[i7] * 4) - iArr2[i7 - 1]) - iArr2[i7 + 1]) - iArr2[i7 - 96]) - iArr2[i7 + 96];
/* 97 */                    d += d3;
/* 99 */                    d2 += d3 * d3;
/* 100 */                   i++;
                        }
                    }
                    double d4 = i;
/* 109 */           double d5 = d / d4;
/* 113 */           return (float) ((d2 / d4) - (d5 * d5));
                }

                @Override
                public final void I0000O() {
                    IIlO1O0lOl iIlO1O0lOl;
                    try {
/* 4 */                 if (this.I001IO000 && (iIlO1O0lOl = this.I0010o) != null) {
/* 10 */                    iIlO1O0lOl.I000OOo1O(false);
                        }
                    } catch (Throwable th) {
/* 15 */                lIoii1l01l0i.I00000oIO(th);
                    }
/* 19 */            this.I0010o = null;
/* 21 */            this.I00111O = null;
/* 34 */            iOi1II01i0.I0000O(OooiooIOO.I00000oIO(this), null, null, new II1liI(this, null, 1), 3);
/* 37 */            Oi0Oooi oi0Oooi = this.I000II;
/* 39 */            oi0Oooi.getClass();
                    try {
/* 46 */                ((TextRecognizer) oi0Oooi.I00iiI).close();
                    } catch (Throwable unused) {
                    }
/* 49 */            Oil1lO oil1lO = this.I000OOo1O;
/* 51 */            OfflineRecognizer offlineRecognizer = oil1lO.I00000oIO;
/* 53 */            if (offlineRecognizer != null) {
/* 55 */                offlineRecognizer.release();
                    }
/* 58 */            oil1lO.I00000oIO = null;
/* 60 */            I1OI0i1lo i1OI0i1lo = this.I000O01llI0;
/* 62 */            i1OI0i1lo.getClass();
                    try {
/* 65 */                TextToSpeech textToSpeech = i1OI0i1lo.I00000oOI;
/* 67 */                if (textToSpeech != null) {
/* 69 */                    textToSpeech.stop();
                        }
                    } catch (Throwable th2) {
/* 74 */                lIoii1l01l0i.I00000oIO(th2);
                    }
                    try {
/* 77 */                TextToSpeech textToSpeech2 = i1OI0i1lo.I00000oOI;
/* 79 */                if (textToSpeech2 != null) {
/* 81 */                    textToSpeech2.shutdown();
                        }
                    } catch (Throwable th3) {
/* 86 */                lIoii1l01l0i.I00000oIO(th3);
                    }
/* 89 */            i1OI0i1lo.I00000oOI = null;
/* 91 */            i1OI0i1lo.I0000Il00O = false;
/* 93 */            i1OI0i1lo.I0000O = null;
/* 95 */            this.I000oI1ioi = null;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007a -> B:27:0x007d). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Serializable I0001Ioi1lo(IOoilo iOoilo) {
                    II1lO00 iI1lO00;
                    OOo0ooi oOo0ooi;
                    OOo0lO oOo0lO;
                    int i;
                    int i2;
/* 3 */             if (iOoilo instanceof II1lO00) {
/* 6 */                 iI1lO00 = (II1lO00) iOoilo;
/* 8 */                 int i3 = iI1lO00.I00io1l;
/* 14 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 17 */                    iI1lO00.I00io1l = i3 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iI1lO00 = new II1lO00(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = iI1lO00.I00ilI0I1;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i4 = iI1lO00.I00io1l;
/* 34 */            if (i4 == 0) {
/* 56 */                lIoii1l01l0i.I00000oOI(obj);
/* 61 */                OOo0ooi oOo0ooi2 = new OOo0ooi();
/* 64 */                Bitmap bitmap = this.I000oI1ioi;
/* 66 */                if (bitmap == null) {
/* 31 */                    return null;
                        }
/* 69 */                oOo0ooi2.I00iOIl = bitmap;
/* 73 */                OOo0lO oOo0lO2 = new OOo0lO();
/* 80 */                oOo0lO2.I00iOIl = I00111O(bitmap);
/* 83 */                oOo0ooi = oOo0ooi2;
/* 84 */                oOo0lO = oOo0lO2;
/* 85 */                i = 2;
/* 86 */                i2 = 0;
/* 89 */                if (i2 >= i) {
                        }
                    } else {
/* 36 */                if (i4 != 1) {
/* 52 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 38 */                i2 = iI1lO00.I00iio;
/* 40 */                i = iI1lO00.I00iiO;
/* 42 */                oOo0lO = iI1lO00.I00iiI;
/* 44 */                oOo0ooi = iI1lO00.I00iOIl;
/* 46 */                lIoii1l01l0i.I00000oOI(obj);
/* 126 */               Bitmap bitmap2 = this.I000oI1ioi;
/* 128 */               if (bitmap2 != null) {
/* 131 */                   float fI00111O = I00111O(bitmap2);
/* 139 */                   if (fI00111O > oOo0lO.I00iOIl) {
/* 141 */                       oOo0ooi.I00iOIl = bitmap2;
/* 143 */                       oOo0lO.I00iOIl = fI00111O;
                            }
                        }
/* 145 */               i2++;
/* 89 */                if (i2 >= i) {
/* 162 */                   return new OIoi0IIoi(oOo0ooi.I00iOIl, Boolean.valueOf(oOo0lO.I00iOIl >= 60.0f));
                        }
/* 95 */                if (oOo0lO.I00iOIl >= 60.0f) {
/* 103 */                   return new OIoi0IIoi(oOo0ooi.I00iOIl, Boolean.TRUE);
                        }
/* 107 */               iI1lO00.I00iOIl = oOo0ooi;
/* 109 */               iI1lO00.I00iiI = oOo0lO;
/* 111 */               iI1lO00.I00iiO = i;
/* 113 */               iI1lO00.I00iio = i2;
/* 115 */               iI1lO00.I00io1l = 1;
/* 123 */               if (il0l1o1l.I00000oOI(350L, iI1lO00) == ii0111o) {
/* 125 */                   return ii0111o;
                        }
/* 126 */               Bitmap bitmap22 = this.I000oI1ioi;
/* 128 */               if (bitmap22 != null) {
                        }
/* 145 */               i2++;
/* 89 */                if (i2 >= i) {
                        }
                    }
                }

                public final void I000II(Bitmap bitmap) {
                    IIllOioOlolI iIllOioOlolI;
/* 1 */             IIlO1O0lOl iIlO1O0lOl = this.I0010o;
/* 3 */             if (iIlO1O0lOl == null || (iIllOioOlolI = this.I00111O) == null || !iIllOioOlolI.I00100o1O0lo()) {
/* 168 */               return;
                    }
/* 23 */            int width = (bitmap.getWidth() - 1) / 7;
/* 25 */            if (width < 1) {
/* 27 */                width = 1;
                    }
/* 33 */            int height = (bitmap.getHeight() - 1) / 7;
/* 35 */            if (height < 1) {
/* 37 */                height = 1;
                    }
/* 39 */            long j = 0;
/* 42 */            int i = 0;
/* 47 */            for (int i2 = 0; i2 < bitmap.getHeight(); i2 += height) {
/* 54 */                for (int i3 = 0; i3 < bitmap.getWidth(); i3 += width) {
/* 72 */                    int pixel = ((bitmap.getPixel(i3, i2) >> 8) & 255) * 587;
/* 81 */                    j += (((r10 & 255) * 114) + (pixel + (((r10 >> 16) & 255) * 299))) / 1000;
/* 82 */                    i++;
                        }
                    }
/* 89 */            long j2 = j / i;
/* 95 */            if (j2 < 35) {
/* 97 */                this.I001iOo1i0O = 0;
/* 101 */               if (this.I001IO000) {
/* 168 */                   return;
                        }
/* 105 */               int i4 = this.I001i1lo1io + 1;
/* 106 */               this.I001i1lo1io = i4;
/* 108 */               if (i4 >= 3) {
/* 110 */                   this.I001i1lo1io = 0;
/* 112 */                   this.I001IO000 = true;
                            try {
/* 114 */                       iIlO1O0lOl.I000OOo1O(true);
                            } catch (Throwable th) {
/* 119 */                       lIoii1l01l0i.I00000oIO(th);
                            }
/* 128 */                   this.I000O01llI0.I00000oIO("It's dark. Turning on the flashlight.", Ool0lIo1o000.I00iiO);
/* 168 */                   return;
                        }
/* 168 */               return;
                    }
/* 136 */           if (j2 <= 90) {
/* 164 */               this.I001i1lo1io = 0;
/* 166 */               this.I001iOo1i0O = 0;
/* 168 */               return;
                    }
/* 138 */           this.I001i1lo1io = 0;
/* 142 */           if (this.I001IO000) {
/* 146 */               int i5 = this.I001iOo1i0O + 1;
/* 147 */               this.I001iOo1i0O = i5;
/* 149 */               if (i5 >= 3) {
/* 151 */                   this.I001iOo1i0O = 0;
/* 153 */                   this.I001IO000 = false;
                            try {
/* 155 */                       iIlO1O0lOl.I000OOo1O(false);
                            } catch (Throwable th2) {
/* 160 */                       lIoii1l01l0i.I00000oIO(th2);
                            }
                        }
                    }
                }

                public final void I000O01llI0(boolean z) {
                    int iI00000oOI;
/* 1 */             Il0li01oOil il0li01oOil = I1O1ioi1ll0O.I00iio;
/* 3 */             OlO0OIIl1 olO0OIIl1 = this.I0000Il00O;
/* 13 */            int iOrdinal = ((II1l1O1oi01) olO0OIIl1.getValue()).I00000oIO.ordinal();
/* 17 */            if (z) {
/* 25 */                iI00000oOI = (iOrdinal + 1) % il0li01oOil.I00000oOI();
                    } else {
/* 38 */                iI00000oOI = (il0li01oOil.I00000oOI() + (iOrdinal - 1)) % il0li01oOil.I00000oOI();
                    }
/* 45 */            I1O1ioi1ll0O i1O1ioi1ll0O = (I1O1ioi1ll0O) il0li01oOil.get(iI00000oOI);
/* 47 */            I1OI0i1lo i1OI0i1lo = this.I000O01llI0;
/* 49 */            String str = i1O1ioi1ll0O.I00iOIl;
/* 59 */            if (i1O1ioi1ll0O == ((II1l1O1oi01) olO0OIIl1.getValue()).I00000oIO) {
/* 61 */                return;
                    }
/* 62 */            TextToSpeech textToSpeech = i1OI0i1lo.I00000oOI;
/* 64 */            if (textToSpeech != null) {
/* 66 */                textToSpeech.stop();
                    }
/* 71 */            i1OI0i1lo.I0001Ioi1lo = "";
/* 73 */            this.I0010I0i = "";
/* 98 */            olO0OIIl1.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl1.getValue(), i1O1ioi1ll0O, false, str.concat(" mode"), null, false, 26));
/* 107 */           i1OI0i1lo.I00000oIO(str.concat(" mode"), Ool0lIo1o000.I00iiI);
                }

                public final void I000OOo1O(Context context, O1ol100o0O o1ol100o0O, String str) {
/* 15 */            if (((II1l1O1oi01) this.I0000Il00O.getValue()).I0000oI00) {
/* 17 */                return;
                    }
/* 18 */            Bitmap bitmap = this.I000oI1ioi;
/* 20 */            if (bitmap == null) {
/* 28 */                this.I000O01llI0.I00000oIO("No camera image yet.", Ool0lIo1o000.I00iiI);
/* 31 */                return;
                    }
/* 40 */            O1oiOloOo o1oiOloOo = (O1oiOloOo) o1ol100o0O.I000OOo1O.I00iOIl.getValue();
/* 44 */            boolean z = false;
/* 44 */            z = false;
/* 48 */            OIoi0IIoi oIoi0IIoiI000l1 = I000l1(o1oiOloOo, new II1lOl(o1oiOloOo, 0));
/* 53 */            if (oIoi0IIoiI000l1 == null) {
/* 60 */                oIoi0IIoiI000l1 = I000l1(o1oiOloOo, new II1lOl(o1oiOloOo, 1));
                    }
/* 65 */            if (oIoi0IIoiI000l1 == null) {
/* 75 */                O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) o1oiOloOo.I0000Il00O.get("Gemma-4-E2B-it");
/* 83 */                if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) != ModelDownloadStatusType.IN_PROGRESS) {
/* 129 */                   this.I000O01llI0.I00000oOI("No vision model is downloaded. Open A I Chat and download an image-capable model first.");
/* 132 */                   return;
                        }
/* 85 */                long j = o1oIo0iI00.I00000oOI;
/* 99 */                int i = j > 0 ? (int) ((o1oIo0iI00.I0000Il00O * 100) / j) : 0;
/* 121 */               this.I000O01llI0.I00000oOI("Still downloading the vision model for Describe mode, " + i + " percent done. Try again in a bit.");
/* 124 */               return;
                    }
/* 135 */           OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) oIoi0IIoiI000l1.I00iOIl;
/* 139 */           O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) oIoi0IIoiI000l1.I00iiI;
                    this.I000lI++;
/* 146 */           int i2 = this.I000lI;
/* 148 */           this.I000o00OoI0I = o1oIOiI11o0;
/* 150 */           I1OI0i1lo i1OI0i1lo = this.I000O01llI0;
/* 152 */           TextToSpeech textToSpeech = i1OI0i1lo.I00000oOI;
/* 154 */           if (textToSpeech != null) {
/* 156 */               textToSpeech.stop();
                    }
/* 161 */           i1OI0i1lo.I0001Ioi1lo = "";
/* 163 */           OlO0OIIl1 olO0OIIl1 = this.I0000Il00O;
/* 186 */           olO0OIIl1.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl1.getValue(), null, false, "Describing…", null, true, 11));
/* 197 */           this.I000O01llI0.I0000Il00O(new long[]{0, 25});
/* 202 */           if (o1oIOiI11o0.I00IlilI0i0i != null) {
/* 212 */               O1oOil o1oOil = (O1oOil) o1oiOloOo.I0000O.get(o1oIOiI11o0.I00000oIO);
/* 220 */               if ((o1oOil != null ? o1oOil.I00000oIO : null) == O1oOl0.I00iiO) {
/* 222 */                   z = true;
                        }
                    }
/* 225 */           II1l1oiI0 iI1l1oiI0 = new II1l1oiI0();
/* 228 */           iI1l1oiI0.I00iOIl = this;
/* 230 */           iI1l1oiI0.I00iiI = bitmap;
/* 232 */           iI1l1oiI0.I00iiO = i2;
/* 234 */           iI1l1oiI0.I00iio = z;
/* 236 */           iI1l1oiI0.I00ilI0I1 = o1ol100o0O;
/* 240 */           iI1l1oiI0.I00ilO0 = context;
/* 242 */           iI1l1oiI0.I00io1l = oloIl1l1oOii;
/* 244 */           iI1l1oiI0.I00ioIO = o1oIOiI11o0;
/* 248 */           iI1l1oiI0.I00l0I0l0lO1 = str;
/* 250 */           VarHandle.storeStoreFence();
/* 253 */           I000o00OoI0I(iI1l1oiI0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object I000OiO(Context context, O1oiOloOo o1oiOloOo, I00oIiI10 i00oIiI10) {
                    O1oIOiI11o0 o1oIOiI11o0;
/* 1 */             Oil1lO oil1lO = this.I000OOo1O;
/* 5 */             if (oil1lO.I00000oIO != null) {
/* 7 */                 return Boolean.TRUE;
                    }
/* 12 */            Iterator it = o1oiOloOo.I00000oIO.iterator();
/* 81 */            do {
/* 20 */                o1oIOiI11o0 = null;
/* 21 */                if (!it.hasNext()) {
                            break;
                        }
/* 31 */                Iterator it2 = ((OloIl1l1oOii) it.next()).I000OiO.iterator();
                        while (true) {
/* 39 */                    if (!it2.hasNext()) {
                                break;
                            }
/* 41 */                    Object next = it2.next();
/* 46 */                    O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) next;
/* 56 */                    if (O0000Ioio00.I0000O(o1oIOiI11o02.I000OiO, "model.int8.onnx")) {
/* 66 */                        O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) o1oiOloOo.I0000Il00O.get(o1oIOiI11o02.I00000oIO);
/* 76 */                        if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.SUCCEEDED) {
/* 78 */                            o1oIOiI11o0 = next;
                                    break;
                                }
                            }
                        }
/* 79 */                o1oIOiI11o0 = o1oIOiI11o0;
/* 81 */            } while (o1oIOiI11o0 == null);
/* 83 */            if (o1oIOiI11o0 == null) {
/* 85 */                return Boolean.FALSE;
                    }
/* 90 */            String strI00000oOI = o1oIOiI11o0.I00000oOI(context, o1oIOiI11o0.I000OiO);
/* 96 */            String strI00000oOI2 = o1oIOiI11o0.I00000oOI(context, "tokens.txt");
/* 109 */           if (!new File(strI00000oOI).exists() || !new File(strI00000oOI2).exists()) {
/* 143 */               return Boolean.FALSE;
                    }
/* 123 */           oil1lO.getClass();
/* 138 */           return iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new Oil1l0lOIl(oil1lO, strI00000oOI, "auto", true, strI00000oOI2, null), i00oIiI10);
                }

                public final String I000iOII(O1oIOiI11o0 o1oIOiI11o0, String str) {
/* 3 */             String strI00000oOI = o1oIOiI11o0.I00000oOI(this.I00000oOI, str);
/* 16 */            if (new File(strI00000oOI).exists()) {
/* 18 */                return strI00000oOI;
                    }
/* 27 */            Log.w("BoxAssistVM", "model file missing: ".concat(strI00000oOI));
/* 30 */            return null;
                }

                public final void I000o00OoI0I(IllOOo00lI illOOo00lI) {
                    Object objI00000oIO;
/* 1 */             IIlO1O0lOl iIlO1O0lOl = this.I0010o;
/* 3 */             if (iIlO1O0lOl == null) {
/* 5 */                 illOOo00lI.invoke();
/* 8 */                 return;
                    }
/* 12 */            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
/* 15 */            IOoil1iiIilo iOoil1iiIilo = null;
                    try {
/* 20 */                PointF pointF = new PointF(0.5f, 0.5f);
/* 25 */                float f = pointF.x;
/* 27 */                float f2 = pointF.y;
/* 29 */                O1liloIo o1liloIo = new O1liloIo();
/* 32 */                o1liloIo.I00000oIO = f;
/* 34 */                o1liloIo.I00000oOI = f2;
/* 39 */                o1liloIo.I0000Il00O = 0.15f;
/* 41 */                o1liloIo.I0000O = null;
/* 45 */                ArrayList arrayList = new ArrayList();
/* 50 */                ArrayList arrayList2 = new ArrayList();
/* 55 */                ArrayList arrayList3 = new ArrayList();
/* 58 */                arrayList.add(o1liloIo);
/* 61 */                arrayList2.add(o1liloIo);
/* 66 */                IioiI0IIIIO iioiI0IIIIO = new IioiI0IIIIO();
/* 73 */                iioiI0IIIIO.I00000oOI = Collections.unmodifiableList(arrayList);
/* 79 */                iioiI0IIIIO.I0000Il00O = Collections.unmodifiableList(arrayList2);
/* 85 */                iioiI0IIIIO.I0000O = Collections.unmodifiableList(arrayList3);
/* 89 */                iioiI0IIIIO.I00000oIO = 3000L;
/* 91 */                VarHandle.storeStoreFence();
/* 94 */                ListenableFuture listenableFutureI000II = iIlO1O0lOl.I000II(iioiI0IIIIO);
/* 101 */               I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(6);
/* 104 */               i0iOo0oioiO.I00iiI = atomicBoolean;
/* 106 */               i0iOo0oioiO.I00iiO = illOOo00lI;
/* 108 */               VarHandle.storeStoreFence();
/* 117 */               listenableFutureI000II.addListener(i0iOo0oioiO, this.I00000oOI.getMainExecutor());
/* 120 */               objI00000oIO = OoiIlOl1iI.I00000oIO;
                    } catch (Throwable th) {
/* 124 */               objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                    }
/* 132 */           if (Oi10ii.I00000oOI(objI00000oIO) != null && atomicBoolean.compareAndSet(false, true)) {
/* 141 */               illOOo00lI.invoke();
                    }
/* 156 */           iOi1II01i0.I0000O(OooiooIOO.I00000oIO(this), null, null, new I00oI0i(atomicBoolean, illOOo00lI, iOoil1iiIilo, 10), 3);
                }

                public final void I000oI1ioi(Bitmap bitmap) {
/* 1 */             this.I000oI1ioi = bitmap;
/* 3 */             long jCurrentTimeMillis = System.currentTimeMillis();
/* 15 */            if (jCurrentTimeMillis - this.I001i1O0Ol >= 1000) {
/* 17 */                this.I001i1O0Ol = jCurrentTimeMillis;
                        try {
/* 19 */                    I000II(bitmap);
                        } catch (Throwable th) {
/* 24 */                    lIoii1l01l0i.I00000oIO(th);
                        }
                    }
/* 39 */            if (((II1l1O1oi01) this.I0000Il00O.getValue()).I00000oIO != I1O1ioi1ll0O.I00iiI || !((II1l1O1oi01) this.I0000Il00O.getValue()).I00000oOI || ((II1l1O1oi01) this.I0000Il00O.getValue()).I0000oI00 || this.I000iOII) {
/* 168 */               return;
                    }
/* 71 */            long jCurrentTimeMillis2 = System.currentTimeMillis();
/* 77 */            if (this.I00100l0 || jCurrentTimeMillis2 - this.I00100o1O0lo < 350) {
/* 168 */               return;
                    }
/* 90 */            this.I00100o1O0lo = jCurrentTimeMillis2;
/* 93 */            this.I00100l0 = true;
/* 108 */           iOi1II01i0.I0000O(OooiooIOO.I00000oIO(this), null, null, new I00oI0i(this, bitmap, null, 11), 3);
                }

                public final void I00100l0(Context context, O1ol100o0O o1ol100o0O) {
/* 11 */            int iOrdinal = ((II1l1O1oi01) this.I0000Il00O.getValue()).I00000oIO.ordinal();
/* 15 */            if (iOrdinal == 0) {
/* 114 */               this.I0010I0i = "";
/* 116 */               Bitmap bitmap = this.I000oI1ioi;
/* 118 */               if (bitmap != null) {
/* 120 */                   I000oI1ioi(bitmap);
/* 123 */                   return;
                        }
/* 123 */               return;
                    }
/* 18 */            int i = 1;
/* 19 */            if (iOrdinal != 1) {
/* 21 */                if (iOrdinal != 2) {
/* 45 */                    I000II.I00000oIO();
/* 48 */                    return;
                        } else if (((II1l1O1oi01) this.I0000Il00O.getValue()).I0000oI00) {
/* 35 */                    I001IIilI0O();
/* 38 */                    return;
                        } else {
/* 41 */                    I000OOo1O(context, o1ol100o0O, "Briefly describe what is in front of me for a blind person. Lead with the most important thing. Two or three short sentences.");
/* 44 */                    return;
                        }
                    }
/* 51 */            if (this.I000oI1ioi == null) {
/* 59 */                this.I000O01llI0.I00000oIO("No camera image yet.", Ool0lIo1o000.I00iiI);
/* 62 */                return;
                    }
/* 63 */            OlO0OIIl1 olO0OIIl1 = this.I0000Il00O;
/* 85 */            olO0OIIl1.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl1.getValue(), null, false, "Reading…", null, true, 11));
/* 95 */            this.I000O01llI0.I0000Il00O(new long[]{0, 25});
/* 100 */           II1iiO1I iI1iiO1I = new II1iiO1I(i);
/* 103 */           iI1iiO1I.I00iiI = this;
/* 105 */           VarHandle.storeStoreFence();
/* 108 */           I000o00OoI0I(iI1iiO1I);
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0177  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x01a3  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00100o1O0lo(Bitmap bitmap, IOoilo iOoilo) throws Throwable {
                    II1llo1I1ol iI1llo1I1ol;
                    Bitmap bitmap2;
                    List list;
                    ArrayList arrayList;
                    Iterator it;
                    Object next;
                    Iterator it2;
                    int i;
                    int i2;
                    IiO0i0O iiO0i0O;
/* 3 */             Bitmap bitmap3 = bitmap;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 11 */            if (iOoilo instanceof II1llo1I1ol) {
/* 14 */                iI1llo1I1ol = (II1llo1I1ol) iOoilo;
/* 16 */                int i3 = iI1llo1I1ol.I00ilI0I1;
/* 22 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 25 */                    iI1llo1I1ol.I00ilI0I1 = i3 - Integer.MIN_VALUE;
                        } else {
/* 30 */                    iI1llo1I1ol = new II1llo1I1ol(this, iOoilo);
                        }
                    }
/* 33 */            Object objI0000oI00 = iI1llo1I1ol.I00iiO;
/* 35 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 37 */            int i4 = iI1llo1I1ol.I00ilI0I1;
/* 39 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 40 */            int i5 = 2;
/* 41 */            int i6 = 1;
/* 42 */            if (i4 == 0) {
/* 70 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 73 */                IIOo1i iIOo1i = this.I0000oI00;
/* 75 */                float f = this.I001l0I00;
/* 77 */                iI1llo1I1ol.I00iOIl = bitmap3;
/* 79 */                iI1llo1I1ol.I00ilI0I1 = 1;
/* 81 */                iIOo1i.getClass();
/* 91 */                objI0000oI00 = iOi1II01i0.I0000oI00(II1o1O1O1iIi.I00000oIO, new i01olii11O0(iIOo1i, bitmap3, f, null), iI1llo1I1ol);
/* 95 */                if (objI0000oI00 != ii0111o) {
                        }
/* 137 */               return ii0111o;
                    }
/* 44 */            if (i4 != 1) {
/* 46 */                if (i4 != 2) {
/* 60 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 39 */                    return null;
                        }
/* 48 */                list = iI1llo1I1ol.I00iiI;
/* 52 */                bitmap2 = iI1llo1I1ol.I00iOIl;
/* 54 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 140 */               List list2 = list;
/* 150 */               arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 153 */               it = list2.iterator();
/* 162 */               while (it.hasNext()) {
/* 168 */                   IiOoOOO iiOoOOO = (IiOoOOO) it.next();
/* 170 */                   O1loO10Ii0I o1loO10Ii0I = this.I0001Ioi1lo;
/* 172 */                   RectF rectF = iiOoOOO.I0000Il00O;
/* 174 */                   int width = bitmap2.getWidth();
/* 178 */                   int height = bitmap2.getHeight();
/* 182 */                   float[] fArr = o1loO10Ii0I.I0000Il00O;
/* 184 */                   if (fArr == null) {
/* 188 */                       it2 = it;
/* 186 */                       iiO0i0O = IiO0i0O.I00ilI0I1;
/* 191 */                       i = i5;
/* 193 */                       i2 = i6;
                            } else {
/* 207 */                       float fI00000oOI = lIiioliIlo.I00000oOI(rectF.centerX() / width, 0.0f, 0.9999f);
/* 217 */                       float fI00000oOI2 = lIiioliIlo.I00000oOI(rectF.centerY() / height, 0.0f, 0.9999f);
/* 221 */                       float f2 = o1loO10Ii0I.I0000O;
/* 225 */                       int i7 = (int) (fI00000oOI * f2);
/* 227 */                       int i8 = (int) (fI00000oOI2 * f2);
/* 232 */                       ArrayList arrayList2 = new ArrayList(9);
/* 236 */                       for (int i9 = -1; i9 < i5; i9++) {
/* 238 */                           int i10 = -1;
/* 239 */                           while (i10 < i5) {
/* 277 */                               arrayList2.add(Float.valueOf(fArr[(lIiioliIlo.I0000Il00O(i8 + i9, 0, o1loO10Ii0I.I0000O - 1) * o1loO10Ii0I.I0000O) + lIiioliIlo.I0000Il00O(i7 + i10, 0, o1loO10Ii0I.I0000O - 1)]));
/* 280 */                               i10++;
/* 282 */                               i5 = i5;
/* 284 */                               i6 = i6;
/* 286 */                               it = it;
                                    }
                                }
/* 298 */                       it2 = it;
/* 300 */                       i = i5;
/* 302 */                       i2 = i6;
/* 304 */                       IOOiOil.I000o00OoI0I(arrayList2);
/* 319 */                       float fFloatValue = ((Number) arrayList2.get(arrayList2.size() / 2)).floatValue();
/* 342 */                       iiO0i0O = fFloatValue >= o1loO10Ii0I.I0000oI00 ? IiO0i0O.I00iiI : fFloatValue >= o1loO10Ii0I.I0001Ioi1lo ? IiO0i0O.I00iiO : IiO0i0O.I00iio;
                            }
/* 358 */                   arrayList.add(new IiOoOOO(iiOoOOO.I00000oIO, iiOoOOO.I00000oOI, iiOoOOO.I0000Il00O, iiO0i0O, iiOoOOO.I0000oI00));
/* 361 */                   i5 = i;
/* 363 */                   i6 = i2;
/* 365 */                   it = it2;
                        }
/* 370 */               int i11 = i6;
/* 374 */               if (this.I000l1) {
/* 378 */                   ArrayList arrayList3 = new ArrayList();
/* 381 */                   Iterator it3 = arrayList.iterator();
/* 389 */                   while (it3.hasNext()) {
/* 391 */                       Object next2 = it3.next();
/* 406 */                       if (II1o1O1O1iIi.I0000Il00O.contains(((IiOoOOO) next2).I00000oIO)) {
/* 408 */                           arrayList3.add(next2);
                                }
                            }
/* 412 */                   arrayList = arrayList3;
                        }
/* 417 */               if (!arrayList.isEmpty()) {
/* 424 */                   IliIiio1 iliIiio1 = new IliIiio1(11);
/* 429 */                   II1liooilI iI1liooilI = new II1liooilI(0);
/* 432 */                   iI1liooilI.I00iiI = iliIiio1;
/* 434 */                   VarHandle.storeStoreFence();
/* 437 */                   List listI00Ol1ll1 = IOOi0Ool1i.I00Ol1ll1(arrayList, iI1liooilI);
/* 445 */                   IiOoOOO iiOoOOO2 = (IiOoOOO) IOOi0Ool1i.I001lllioOl(listI00Ol1ll1);
/* 451 */                   Ool0lIo1o000 ool0lIo1o000I00000oIO = II1o1O1O1iIi.I00000oIO(iiOoOOO2.I00000oIO, iiOoOOO2.I0000O);
/* 483 */                   String str = iiOoOOO2.I00000oIO + "|" + iiOoOOO2.I0000O + "|" + iiOoOOO2.I0000oI00;
/* 493 */                   if (!str.equals(this.I0010I0i) || ool0lIo1o000I00000oIO == Ool0lIo1o000.I00iOIl) {
/* 500 */                       this.I0010I0i = str;
/* 502 */                       IiO0i0O iiO0i0O2 = iiOoOOO2.I0000O;
/* 504 */                       String str2 = iiOoOOO2.I0000oI00;
/* 506 */                       String str3 = iiOoOOO2.I00000oIO;
/* 561 */                       String string = OlOoOIi0o.I00OIo(I0000oI00(str3) + str3 + (iiO0i0O2 == IiO0i0O.I00ilI0I1 ? "" : " ".concat(iiO0i0O2.I00iOIl)) + (str2.length() != 0 ? " ".concat(str2) : "")).toString();
/* 575 */                       Iterator it4 = IOOi0Ool1i.I001iOo1i0O(listI00Ol1ll1, i11).iterator();
                                while (true) {
/* 583 */                           if (!it4.hasNext()) {
/* 601 */                               next = null;
                                        break;
                                    }
/* 585 */                           next = it4.next();
/* 598 */                           if (!O0000Ioio00.I0000O(((IiOoOOO) next).I00000oIO, str3)) {
                                        break;
                                    }
                                }
/* 602 */                       IiOoOOO iiOoOOO3 = (IiOoOOO) next;
/* 604 */                       if (iiOoOOO3 != null) {
/* 606 */                           String str4 = iiOoOOO3.I00000oIO;
/* 614 */                           string = Oi010OO0.I001IIilI0O(string, ", and ", I0000oI00(str4), str4);
                                }
/* 618 */                       String str5 = string;
/* 621 */                       if (ool0lIo1o000I00000oIO == Ool0lIo1o000.I00iOIl) {
/* 631 */                           this.I000O01llI0.I0000Il00O(new long[]{0, 80, 80, 80});
                                }
/* 636 */                       this.I000O01llI0.I00000oIO(str5, ool0lIo1o000I00000oIO);
/* 639 */                       OlO0OIIl1 olO0OIIl1 = this.I0000Il00O;
/* 659 */                       olO0OIIl1.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl1.getValue(), null, false, null, str5, false, 23));
/* 662 */                       return ooiIlOl1iI;
                            }
                        }
/* 499 */               return ooiIlOl1iI;
                    }
/* 64 */            bitmap3 = iI1llo1I1ol.I00iOIl;
/* 66 */            lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 98 */            List list3 = (List) objI0000oI00;
/* 104 */           if (!list3.isEmpty()) {
/* 108 */               O1loO10Ii0I o1loO10Ii0I2 = this.I0001Ioi1lo;
/* 110 */               iI1llo1I1ol.I00iOIl = bitmap3;
/* 115 */               iI1llo1I1ol.I00iiI = list3;
/* 117 */               iI1llo1I1ol.I00ilI0I1 = 2;
/* 119 */               o1loO10Ii0I2.getClass();
/* 135 */               if (iOi1II01i0.I0000oI00(II1o1O1O1iIi.I00000oIO, new O00lOIIO(o1loO10Ii0I2, bitmap3, iOoil1iiIilo, 14), iI1llo1I1ol) != ii0111o) {
/* 138 */                   bitmap2 = bitmap3;
/* 139 */                   list = list3;
/* 140 */                   List list22 = list;
/* 150 */                   arrayList = new ArrayList(IOOi1I.I0000O(list22, 10));
/* 153 */                   it = list22.iterator();
/* 162 */                   while (it.hasNext()) {
                            }
/* 370 */                   int i112 = i6;
/* 374 */                   if (this.I000l1) {
                            }
/* 417 */                   if (!arrayList.isEmpty()) {
                            }
                        }
/* 137 */               return ii0111o;
                    }
/* 499 */           return ooiIlOl1iI;
                }

                public final void I0010I0i(O1oIOiI11o0 o1oIOiI11o0, String str, Bitmap bitmap, int i) {
/* 5 */             StringBuilder sb = new StringBuilder();
/* 10 */            OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 15 */            OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
                    try {
/* 18 */                O11il1ilio1o o11il1ilio1oI00000oIO = l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0);
/* 24 */                II1lIIl1l1OO iI1lIIl1l1OO = new II1lIIl1l1OO();
/* 27 */                iI1lIIl1l1OO.I00iOIl = i;
/* 29 */                iI1lIIl1l1OO.I00iiI = this;
/* 31 */                iI1lIIl1l1OO.I00iiO = sb;
/* 33 */                iI1lIIl1l1OO.I00iio = oOo0ll111;
/* 35 */                iI1lIIl1l1OO.I00ilI0I1 = oOo0l0ii10l;
/* 37 */                VarHandle.storeStoreFence();
/* 44 */                I01iOOoiOI i01iOOoiOI = new I01iOOoiOI(27);
/* 50 */                II1lIIolo iI1lIIolo = new II1lIIolo(0);
/* 53 */                iI1lIIolo.I00iiI = i;
/* 55 */                iI1lIIolo.I00iiO = this;
/* 57 */                VarHandle.storeStoreFence();
/* 74 */                o11il1ilio1oI00000oIO.I0001Ioi1lo(o1oIOiI11o0, str, iI1lIIl1l1OO, i01iOOoiOI, iI1lIIolo, Collections.singletonList(bitmap), Il01100l.I00iOIl, OooiooIOO.I00000oIO(this), null);
                    } catch (Throwable th) {
/* 83 */                Log.e("BoxAssistVM", "runVlm failed", th);
/* 90 */                this.I000O01llI0.I00000oOI("Sorry, the vision model failed to run.");
/* 93 */                OlO0OIIl1 olO0OIIl1 = this.I0000Il00O;
/* 115 */               olO0OIIl1.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl1.getValue(), null, false, "Describe mode", null, false, 11));
                    }
                }

                public final void I001IIilI0O() {
                    Object objI00000oIO;
                    this.I000lI++;
/* 7 */             O1oIOiI11o0 o1oIOiI11o0 = this.I000o00OoI0I;
/* 9 */             if (o1oIOiI11o0 != null) {
                        try {
/* 15 */                    l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0).I0000oI00(o1oIOiI11o0);
/* 18 */                    objI00000oIO = OoiIlOl1iI.I00000oIO;
                        } catch (Throwable th) {
/* 22 */                    objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                        }
/* 26 */                Oi10ii.I00000oIO(objI00000oIO);
                    }
/* 29 */            I1OI0i1lo i1OI0i1lo = this.I000O01llI0;
/* 31 */            TextToSpeech textToSpeech = i1OI0i1lo.I00000oOI;
/* 33 */            if (textToSpeech != null) {
/* 35 */                textToSpeech.stop();
                    }
/* 40 */            i1OI0i1lo.I0001Ioi1lo = "";
/* 42 */            OlO0OIIl1 olO0OIIl1 = this.I0000Il00O;
/* 64 */            olO0OIIl1.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl1.getValue(), null, false, "Describe mode", null, false, 11));
                }
            }
