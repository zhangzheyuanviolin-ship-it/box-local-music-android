            package p000;

            import android.content.Context;
            import android.database.Cursor;
            import android.graphics.Bitmap;
            import android.net.Uri;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import com.google.mlkit.genai.prompt.GenerativeModel;
            import com.google.mlkit.vision.facemesh.FaceMeshDetector;
            import com.google.mlkit.vision.pose.PoseDetector;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
/* 16 */    public final class I000oI1ioi extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public final Object I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I000oI1ioi(int i, II1o0111IO0 iI1o0111IO0, O1oIOiI11o0 o1oIOiI11o0, String str, Bitmap bitmap, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 2;
/* 4 */             this.I00iiI = i;
/* 6 */             this.I00iio = iI1o0111IO0;
/* 8 */             this.I00ilI0I1 = o1oIOiI11o0;
/* 10 */            this.I00ilO0 = str;
/* 12 */            this.I00io1l = bitmap;
                }

                private final Object I00000oIO(Object obj) throws Throwable {
                    long j;
                    String str;
                    long j2;
                    Object obj2;
                    File file;
                    Io11l1li io11l1li;
                    I0O0il1iIl i0O0il1iIl;
/* 6 */             Uri uri = (Uri) this.I00ilO0;
/* 10 */            Context context = (Context) this.I00ilI0I1;
/* 16 */            OlO0OIIl1 olO0OIIl1 = ((IoiIII) this.I00iio).I00000oOI;
/* 18 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 20 */            int i = this.I00iiI;
/* 22 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 25 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 26 */            if (i == 0) {
/* 50 */                lIoii1l01l0i.I00000oOI(obj);
/* 90 */                olO0OIIl1.I000lI(null, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl1.getValue(), null, null, 0, 0.0f, null, false, 0, 0, null, null, true, 0.0f, false, 5119));
/* 108 */               Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_size", "_display_name"}, null, null, null);
/* 112 */               String string = "";
/* 114 */               if (cursorQuery != null) {
                            try {
/* 120 */                       if (cursorQuery.moveToFirst()) {
/* 126 */                           long j3 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
/* 134 */                           string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
/* 141 */                           j = j3;
                                } else {
/* 147 */                           j = 0;
                                }
/* 149 */                       cursorQuery.close();
/* 154 */                       str = string;
/* 155 */                       j2 = j;
                            } finally {
                            }
                        } else {
/* 112 */                   str = "";
/* 165 */                   j2 = 0;
                        }
/* 171 */               long jLongValue = Long.valueOf(j2).longValue();
/* 179 */               if (str.length() == 0) {
/* 218 */                   olO0OIIl1.I000lI(null, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl1.getValue(), null, null, 0, 0.0f, null, false, 0, 0, null, "Could not read file info", false, 0.0f, false, 6655));
/* 221 */                   return ooiIlOl1iI;
                        }
/* 230 */               File file2 = new File(context.getExternalFilesDir(null), "__sd_imports");
/* 233 */               file2.mkdirs();
/* 238 */               File file3 = new File(file2, str);
                        try {
/* 245 */                   InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 249 */                   if (inputStreamOpenInputStream != null) {
                                try {
/* 253 */                           FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                    try {
/* 258 */                               byte[] bArr = new byte[8192];
/* 260 */                               long j4 = 0;
/* 262 */                               long j5 = 0;
                                        while (true) {
/* 264 */                                   int i2 = inputStreamOpenInputStream.read(bArr);
/* 271 */                                   if (i2 == -1) {
                                                break;
                                            }
/* 274 */                                   fileOutputStream.write(bArr, 0, i2);
/* 278 */                                   long j6 = j4 + i2;
/* 280 */                                   long jCurrentTimeMillis = System.currentTimeMillis();
/* 290 */                                   if (jCurrentTimeMillis - j5 <= 200 || jLongValue <= 0) {
/* 350 */                                       j4 = j6;
                                            } else {
/* 338 */                                       olO0OIIl1.I000lI(null, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl1.getValue(), null, null, 0, 0.0f, null, false, 0, 0, null, null, false, j6 / jLongValue, false, 6143));
/* 341 */                                       j5 = jCurrentTimeMillis;
/* 344 */                                       j4 = j6;
                                            }
                                        }
/* 354 */                               fileOutputStream.close();
/* 357 */                               inputStreamOpenInputStream.close();
                                    } finally {
                                    }
                                } finally {
                                }
                            }
/* 420 */                   olO0OIIl1.I000lI(null, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl1.getValue(), null, null, 0, 0.0f, null, false, 0, 0, null, null, false, 1.0f, false, 5119));
/* 423 */                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 425 */                   io11l1li = O1OI1l011OO1.I00000oIO;
                            try {
/* 438 */                       i0O0il1iIl = new I0O0il1iIl((IoI011li) this.I00io1l, str, file3, iOoil1iiIilo, 12);
/* 441 */                       obj2 = null;
                            } catch (Exception e) {
/* 458 */                       e = e;
/* 459 */                       obj2 = null;
                            }
                        } catch (Exception e2) {
/* 361 */                   e = e2;
/* 362 */                   obj2 = null;
/* 363 */                   file = file3;
/* 462 */                   file.delete();
/* 508 */                   olO0OIIl1.I000lI(obj2, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl1.getValue(), null, null, 0, 0.0f, null, false, 0, 0, null, IIl001iO0Io.I000o00OoI0I("Import failed: ", e.getMessage()), false, 0.0f, false, 6655));
/* 1261 */                  return ooiIlOl1iI;
                        }
                        try {
/* 443 */                   this.I00iiO = file3;
/* 446 */                   this.I00iiI = 1;
                            return iOi1II01i0.I0000oI00(io11l1li, i0O0il1iIl, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                        } catch (Exception e3) {
/* 456 */                   e = e3;
/* 363 */                   file = file3;
/* 462 */                   file.delete();
/* 508 */                   olO0OIIl1.I000lI(obj2, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl1.getValue(), null, null, 0, 0.0f, null, false, 0, 0, null, IIl001iO0Io.I000o00OoI0I("Import failed: ", e.getMessage()), false, 0.0f, false, 6655));
/* 1261 */                  return ooiIlOl1iI;
                        }
                    }
/* 28 */            if (i != 1) {
/* 45 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 48 */                return null;
                    }
/* 33 */            file = (File) this.I00iiO;
                    try {
/* 35 */                lIoii1l01l0i.I00000oOI(obj);
/* 38 */                return ooiIlOl1iI;
                    } catch (Exception e4) {
/* 39 */                e = e4;
/* 40 */                obj2 = null;
                    }
/* 462 */           file.delete();
/* 508 */           olO0OIIl1.I000lI(obj2, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl1.getValue(), null, null, 0, 0.0f, null, false, 0, 0, null, IIl001iO0Io.I000o00OoI0I("Import failed: ", e.getMessage()), false, 0.0f, false, 6655));
/* 1261 */          return ooiIlOl1iI;
                }

                private final Object I000II(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 6 */             if (i == 0) {
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 43 */                ((Function1) this.I00iiO).invoke(Collections.singletonList(new I1i1lO11OOO(WhisperEngine.SAMPLE_RATE, (byte[]) this.I00iio)));
/* 48 */                Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00ilI0I1;
/* 50 */                this.I00iiI = 1;
/* 56 */                if (ol010000lo00.I0000O(this) == ii0111o) {
/* 58 */                    return ii0111o;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 61 */            OI10i0Il oI10i0Il = (OI10i0Il) this.I00io1l;
/* 63 */            Boolean bool = Boolean.FALSE;
/* 65 */            oI10i0Il.setValue(bool);
/* 72 */            ((Function1) this.I00ilO0).invoke(bool);
/* 75 */            return OoiIlOl1iI.I00000oIO;
                }

                private final Object I000O01llI0(Object obj) throws Throwable {
                    OI1OloOIO1O oI1OloOIO1O;
/* 3 */             OIooO1iiliI oIooO1iiliI = (OIooO1iiliI) this.I00ilO0;
/* 7 */             OI10i0Il oI10i0Il = (OI10i0Il) this.I00io1l;
/* 11 */            IOl00O1iI1Oo iOl00O1iI1Oo = (IOl00O1iI1Oo) this.I00iio;
/* 15 */            OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilI0I1;
/* 17 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 19 */            int i = this.I00iiI;
/* 21 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    try {
/* 25 */                if (i == 0) {
/* 53 */                    lIoii1l01l0i.I00000oOI(obj);
/* 58 */                    IlOil1ii ilOil1ii = (IlOil1ii) this.I00iiO;
/* 70 */                    if (((List) oI10i0Il2.getValue()).size() < 2) {
/* 72 */                        IlolOO0l0IO0 ilolOO0l0IO0 = IlolOO0l0IO0.I00iiO;
/* 74 */                        this.I00iiI = 1;
/* 80 */                        if (ilOil1ii.I00000oIO(ilolOO0l0IO0, this) != ii0111o) {
/* 83 */                            return ooiIlOl1iI;
                                }
                            } else {
/* 85 */                        oIooO1iiliI.I000O01llI0(0.0f);
/* 98 */                        OI1OloOIO1O oI1OloOIO1O2 = (OI1OloOIO1O) IOOi0Ool1i.I00Io1o110i((List) oI10i0Il2.getValue());
/* 100 */                       iOl00O1iI1Oo.I000II(oI1OloOIO1O2);
/* 126 */                       iOl00O1iI1Oo.I000II((OI1OloOIO1O) ((List) oI10i0Il2.getValue()).get(((List) oI10i0Il2.getValue()).size() - 2));
/* 132 */                       IIilO0 iIilO0 = new IIilO0(5);
/* 135 */                       iIilO0.I00iiI = oI10i0Il;
/* 137 */                       iIilO0.I00iiO = oIooO1iiliI;
/* 139 */                       VarHandle.storeStoreFence();
/* 142 */                       this.I00iiO = oI1OloOIO1O2;
/* 144 */                       this.I00iiI = 2;
/* 150 */                       if (ilOil1ii.I00000oIO(iIilO0, this) != ii0111o) {
/* 153 */                           oI1OloOIO1O = oI1OloOIO1O2;
                                }
                            }
/* 152 */                   return ii0111o;
                        }
/* 27 */                if (i == 1) {
/* 49 */                    lIoii1l01l0i.I00000oOI(obj);
/* 52 */                    return ooiIlOl1iI;
                        }
/* 29 */                if (i != 2) {
/* 44 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 33 */                oI1OloOIO1O = (OI1OloOIO1O) this.I00iiO;
/* 35 */                lIoii1l01l0i.I00000oOI(obj);
/* 155 */               iOl00O1iI1Oo.I0000oI00(oI1OloOIO1O, false);
/* 163 */               return ooiIlOl1iI;
                    } finally {
/* 166 */               oI10i0Il.setValue(Boolean.FALSE);
                    }
                }

                private final Object I000iOII(Object obj) throws Throwable {
                    Object obj2;
                    Object obj3;
/* 3 */             Throwable th = (Throwable) this.I00iiO;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiI;
/* 11 */            if (i == 0) {
/* 25 */                lIoii1l01l0i.I00000oOI(obj);
/* 30 */                OOiIOI10OOIi oOiIOI10OOIi = (OOiIOI10OOIi) this.I00iio;
/* 34 */                Oi0IO111o10 oi0IO111o10 = (Oi0IO111o10) this.I00ilI0I1;
/* 51 */                do {
/* 36 */                    obj2 = oOiIOI10OOIi.I0000oI00;
/* 51 */                } while (!OOiIOI10OOIi.I000II.compareAndSet(oOiIOI10OOIi, obj2, ((OO0oOlOi1) obj2).I0001Ioi1lo(oi0IO111o10)));
/* 56 */                OOiIOI10OOIi oOiIOI10OOIi2 = (OOiIOI10OOIi) this.I00iio;
/* 61 */                Oi0IO111o10 oi0IO111o102 = (Oi0IO111o10) this.I00ilI0I1;
/* 78 */                do {
/* 63 */                    obj3 = oOiIOI10OOIi2.I0001Ioi1lo;
/* 78 */                } while (!OOiIOI10OOIi.I000O01llI0.compareAndSet(oOiIOI10OOIi2, obj3, ((OO0oOlOi1) obj3).I0001Ioi1lo(oi0IO111o102)));
/* 86 */                Oi0IO111o10 oi0IO111o103 = (Oi0IO111o10) this.I00ilI0I1;
/* 88 */                String message = th.getMessage();
/* 92 */                if (message == null) {
/* 94 */                    message = "Unknown";
                        }
/* 96 */                IIolIl iIolIl = new IIolIl();
/* 99 */                iIolIl.I00000oIO = oi0IO111o103;
/* 101 */               iIolIl.I00000oOI = message;
/* 103 */               iIolIl.I0000Il00O = null;
/* 105 */               IIoiol iIoiol = new IIoiol();
/* 108 */               iIoiol.I00000oIO = iIolIl;
/* 112 */               iIoiol.I00000oOI = O1llOIO.I00ll1;
/* 114 */               O00i1OoOll1I o00i1OoOll1II00000oIO = l0IOoOo0O0O.I00000oIO(iIoiol);
/* 120 */               Ii10ioolOI ii10ioolOI = (Ii10ioolOI) this.I00ilO0;
/* 122 */               this.I00iiO = th;
/* 124 */               this.I00iiI = 1;
/* 130 */               if (ii10ioolOI.I0001Ioi1lo(o00i1OoOll1II00000oIO, null, this) == ii0111o) {
/* 132 */                   return ii0111o;
                        }
                    } else {
/* 13 */                if (i != 1) {
/* 21 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                    return null;
                        }
/* 15 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 137 */           ((IOi10loi) this.I00io1l).I00iIO(th);
/* 140 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Code restructure failed: missing block: B:51:0x016c, code lost:
                
                    if (r3.emit(r2, r20) == r4) goto L52;
                 */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[Catch: all -> 0x0030, PHI: r5
                  0x0089: PHI (r5v6 java.lang.Object) = (r5v5 java.lang.Object), (r5v16 java.lang.Object) binds: [B:26:0x0085, B:18:0x0050] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0030, blocks: (B:8:0x002b, B:13:0x0039, B:43:0x013f, B:16:0x0044, B:40:0x00dd, B:17:0x0049, B:37:0x00c0, B:18:0x0050, B:28:0x0089, B:34:0x00a3, B:31:0x0096, B:33:0x009a, B:46:0x014e, B:47:0x0153, B:19:0x0056, B:25:0x006c, B:22:0x005d), top: B:56:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0096 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:8:0x002b, B:13:0x0039, B:43:0x013f, B:16:0x0044, B:40:0x00dd, B:17:0x0049, B:37:0x00c0, B:18:0x0050, B:28:0x0089, B:34:0x00a3, B:31:0x0096, B:33:0x009a, B:46:0x014e, B:47:0x0153, B:19:0x0056, B:25:0x006c, B:22:0x005d), top: B:56:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00c0 A[Catch: all -> 0x0030, PHI: r5
                  0x00c0: PHI (r5v17 java.lang.Object) = (r5v15 java.lang.Object), (r5v19 java.lang.Object) binds: [B:35:0x00bc, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0030, blocks: (B:8:0x002b, B:13:0x0039, B:43:0x013f, B:16:0x0044, B:40:0x00dd, B:17:0x0049, B:37:0x00c0, B:18:0x0050, B:28:0x0089, B:34:0x00a3, B:31:0x0096, B:33:0x009a, B:46:0x014e, B:47:0x0153, B:19:0x0056, B:25:0x006c, B:22:0x005d), top: B:56:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00dd A[Catch: all -> 0x0030, PHI: r5
                  0x00dd: PHI (r5v20 java.util.List) = (r5v18 java.util.List), (r5v28 java.util.List) binds: [B:38:0x00d9, B:16:0x0044] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0030, blocks: (B:8:0x002b, B:13:0x0039, B:43:0x013f, B:16:0x0044, B:40:0x00dd, B:17:0x0049, B:37:0x00c0, B:18:0x0050, B:28:0x0089, B:34:0x00a3, B:31:0x0096, B:33:0x009a, B:46:0x014e, B:47:0x0153, B:19:0x0056, B:25:0x006c, B:22:0x005d), top: B:56:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x013f A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:8:0x002b, B:13:0x0039, B:43:0x013f, B:16:0x0044, B:40:0x00dd, B:17:0x0049, B:37:0x00c0, B:18:0x0050, B:28:0x0089, B:34:0x00a3, B:31:0x0096, B:33:0x009a, B:46:0x014e, B:47:0x0153, B:19:0x0056, B:25:0x006c, B:22:0x005d), top: B:56:0x0016 }] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I000lI(Object obj) throws Throwable {
                    Object objI0000oI00;
                    OOio1IioOO1l oOio1IioOO1l;
                    List listSingletonList;
                    Object objI0000oI002;
                    List list;
                    OOl00i10 oOl00i10;
                    IlOil1ii ilOil1iiI00000oOI;
                    I10OIli10o1 i10OIli10o1;
                    OOioooo oOioooo;
/* 5 */             String str = (String) this.I00ilO0;
/* 9 */             IOO000ilo iOO000ilo = (IOO000ilo) this.I00ilI0I1;
/* 13 */            IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.I00iio;
/* 15 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 21 */            int i = 4;
/* 22 */            IOoil1iiIilo iOoil1iiIilo = null;
                    try {
                    } catch (Throwable th) {
/* 343 */               if (th instanceof CancellationException) {
/* 371 */                   throw th;
                        }
/* 347 */               OOl0011oioO oOl0011oioO = new OOl0011oioO();
/* 350 */               oOl0011oioO.I00000oIO = th;
/* 352 */               VarHandle.storeStoreFence();
/* 355 */               this.I00iio = null;
/* 357 */               this.I00iiO = null;
/* 359 */               this.I00iiI = 7;
                    }
                    switch (this.I00iiI) {
                        case 0:
/* 91 */                    lIoii1l01l0i.I00000oOI(obj);
/* 94 */                    OOl00oli oOl00oli = OOl00oli.I00000oIO;
/* 96 */                    this.I00iio = ilOil1iooOO0;
/* 99 */                    this.I00iiI = 1;
/* 105 */                   if (ilOil1iooOO0.emit(oOl00oli, this) != ii0111o) {
/* 111 */                       Oo0oIo00ioo oo0oIo00ioo = (Oo0oIo00ioo) iOO000ilo.I00iiI;
/* 113 */                       this.I00iio = ilOil1iooOO0;
/* 116 */                       this.I00iiI = 2;
/* 118 */                       oo0oIo00ioo.getClass();
/* 130 */                       objI0000oI00 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new Ol0Oli(oo0oIo00ioo, str, iOoil1iiIilo, 10), this);
/* 134 */                       if (objI0000oI00 == ii0111o) {
/* 139 */                           float[] fArr = (float[]) objI0000oI00;
/* 143 */                           oOio1IioOO1l = (OOio1IioOO1l) this.I00io1l;
/* 147 */                           if (!(oOio1IioOO1l instanceof OOio0ooIIo)) {
/* 149 */                               listSingletonList = null;
                                    } else {
/* 153 */                               if (!(oOio1IioOO1l instanceof OOio11)) {
/* 340 */                                   throw new IOiIIo1l(6);
                                        }
/* 159 */                               listSingletonList = Collections.singletonList(((OOio11) oOio1IioOO1l).I00000oIO);
                                    }
/* 167 */                           OOl0lo oOl0lo = (OOl0lo) iOO000ilo.I00iiO;
/* 169 */                           this.I00iio = ilOil1iooOO0;
/* 172 */                           this.I00iiI = 3;
/* 174 */                           oOl0lo.getClass();
/* 185 */                           objI0000oI002 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new OO11OilO(listSingletonList, oOl0lo, fArr, iOoil1iiIilo, 3), this);
/* 189 */                           if (objI0000oI002 == ii0111o) {
/* 193 */                               list = (List) objI0000oI002;
/* 197 */                               oOl00i10 = new OOl00i10();
/* 200 */                               oOl00i10.I00000oIO = list;
/* 202 */                               VarHandle.storeStoreFence();
/* 205 */                               this.I00iio = ilOil1iooOO0;
/* 210 */                               this.I00iiO = list;
/* 212 */                               this.I00iiI = 4;
/* 218 */                               if (ilOil1iooOO0.emit(oOl00i10, this) == ii0111o) {
/* 240 */                                   String strI00IlilI0i0i = IOOi0Ool1i.I00IlilI0i0i(list, "\n\n", null, null, new OOii01Ioi1(i), 30);
/* 284 */                                   IIiOO0o iIiOO0oI00000oIO = ilOl0O00Il0i.I00000oIO(new II1oiioO0((I1I0i0Ilo1Oi) iOO000ilo.I00iio, OlOoOOooiIll.I0000Il00O("\n        You are a helpful assistant. Use ONLY the context below to answer the question.\n        If the answer is not in the context, say: \"I don't know based on the provided documents.\"\n\n        Context:\n        ---\n        " + strI00IlilI0i0i + "\n        ---\n\n        Question: " + str + "\n\n        Answer:\n    "), null));
/* 288 */                                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 292 */                                   ilOil1iiI00000oOI = ilOlOoO1lO.I00000oOI(iIiOO0oI00000oIO, Ii1oo1ooill0.I00iiI);
/* 298 */                                   i10OIli10o1 = new I10OIli10o1(7);
/* 301 */                                   i10OIli10o1.I00iiI = ilOil1iooOO0;
/* 303 */                                   VarHandle.storeStoreFence();
/* 306 */                                   this.I00iio = ilOil1iooOO0;
/* 308 */                                   this.I00iiO = null;
/* 311 */                                   this.I00iiI = 5;
/* 317 */                                   if (ilOil1iiI00000oOI.I00000oIO(i10OIli10o1, this) == ii0111o) {
/* 320 */                                       oOioooo = OOioooo.I00000oIO;
/* 322 */                                       this.I00iio = ilOil1iooOO0;
/* 324 */                                       this.I00iiO = null;
/* 326 */                                       this.I00iiI = 6;
/* 332 */                                       if (ilOil1iooOO0.emit(oOioooo, this) == ii0111o) {
                                                }
/* 368 */                                       return OoiIlOl1iI.I00000oIO;
                                            }
                                        }
                                    }
                                }
                            }
/* 367 */                   return ii0111o;
                        case 1:
/* 87 */                    lIoii1l01l0i.I00000oOI(obj);
/* 111 */                   Oo0oIo00ioo oo0oIo00ioo2 = (Oo0oIo00ioo) iOO000ilo.I00iiI;
/* 113 */                   this.I00iio = ilOil1iooOO0;
/* 116 */                   this.I00iiI = 2;
/* 118 */                   oo0oIo00ioo2.getClass();
/* 130 */                   objI0000oI00 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new Ol0Oli(oo0oIo00ioo2, str, iOoil1iiIilo, 10), this);
/* 134 */                   if (objI0000oI00 == ii0111o) {
                            }
/* 367 */                   return ii0111o;
                        case 2:
/* 81 */                    lIoii1l01l0i.I00000oOI(obj);
/* 84 */                    objI0000oI00 = obj;
/* 139 */                   float[] fArr2 = (float[]) objI0000oI00;
/* 143 */                   oOio1IioOO1l = (OOio1IioOO1l) this.I00io1l;
/* 147 */                   if (!(oOio1IioOO1l instanceof OOio0ooIIo)) {
                            }
/* 167 */                   OOl0lo oOl0lo2 = (OOl0lo) iOO000ilo.I00iiO;
/* 169 */                   this.I00iio = ilOil1iooOO0;
/* 172 */                   this.I00iiI = 3;
/* 174 */                   oOl0lo2.getClass();
/* 185 */                   objI0000oI002 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new OO11OilO(listSingletonList, oOl0lo2, fArr2, iOoil1iiIilo, 3), this);
/* 189 */                   if (objI0000oI002 == ii0111o) {
                            }
/* 367 */                   return ii0111o;
                        case 3:
/* 74 */                    lIoii1l01l0i.I00000oOI(obj);
/* 77 */                    objI0000oI002 = obj;
/* 193 */                   list = (List) objI0000oI002;
/* 197 */                   oOl00i10 = new OOl00i10();
/* 200 */                   oOl00i10.I00000oIO = list;
/* 202 */                   VarHandle.storeStoreFence();
/* 205 */                   this.I00iio = ilOil1iooOO0;
/* 210 */                   this.I00iiO = list;
/* 212 */                   this.I00iiI = 4;
/* 218 */                   if (ilOil1iooOO0.emit(oOl00i10, this) == ii0111o) {
                            }
/* 367 */                   return ii0111o;
                        case 4:
/* 65 */                    list = (List) this.I00iiO;
/* 69 */                    lIoii1l01l0i.I00000oOI(obj);
/* 240 */                   String strI00IlilI0i0i2 = IOOi0Ool1i.I00IlilI0i0i(list, "\n\n", null, null, new OOii01Ioi1(i), 30);
/* 284 */                   IIiOO0o iIiOO0oI00000oIO2 = ilOl0O00Il0i.I00000oIO(new II1oiioO0((I1I0i0Ilo1Oi) iOO000ilo.I00iio, OlOoOOooiIll.I0000Il00O("\n        You are a helpful assistant. Use ONLY the context below to answer the question.\n        If the answer is not in the context, say: \"I don't know based on the provided documents.\"\n\n        Context:\n        ---\n        " + strI00IlilI0i0i2 + "\n        ---\n\n        Question: " + str + "\n\n        Answer:\n    "), null));
/* 288 */                   IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 292 */                   ilOil1iiI00000oOI = ilOlOoO1lO.I00000oOI(iIiOO0oI00000oIO2, Ii1oo1ooill0.I00iiI);
/* 298 */                   i10OIli10o1 = new I10OIli10o1(7);
/* 301 */                   i10OIli10o1.I00iiI = ilOil1iooOO0;
/* 303 */                   VarHandle.storeStoreFence();
/* 306 */                   this.I00iio = ilOil1iooOO0;
/* 308 */                   this.I00iiO = null;
/* 311 */                   this.I00iiI = 5;
/* 317 */                   if (ilOil1iiI00000oOI.I00000oIO(i10OIli10o1, this) == ii0111o) {
                            }
/* 367 */                   return ii0111o;
                        case 5:
/* 58 */                    lIoii1l01l0i.I00000oOI(obj);
/* 320 */                   oOioooo = OOioooo.I00000oIO;
/* 322 */                   this.I00iio = ilOil1iooOO0;
/* 324 */                   this.I00iiO = null;
/* 326 */                   this.I00iiI = 6;
/* 332 */                   if (ilOil1iooOO0.emit(oOioooo, this) == ii0111o) {
                            }
/* 368 */                   return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 44 */                    lIoii1l01l0i.I00000oOI(obj);
/* 368 */                   return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 33 */                    lIoii1l01l0i.I00000oOI(obj);
/* 368 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 28 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                    }
                }

                private final Object I000o00OoI0I(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 6 */             if (i != 0) {
/* 8 */                 if (i == 1) {
/* 10 */                    lIoii1l01l0i.I00000oOI(obj);
/* 13 */                    return obj;
                        }
/* 16 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                return null;
                    }
/* 21 */            lIoii1l01l0i.I00000oOI(obj);
/* 29 */            IoiOl011o ioiOl011o = (IoiOl011o) this.I00iiO;
/* 59 */            OOlli1l1lOlI oOlli1l1lOlI = new OOlli1l1lOlI(ioiOl011o, ((OOllOII) this.I00iio).I000OOo1O, 0, ioiOl011o, (Ol0i11lo1l1I) this.I00ilI0I1, (Il10il1) this.I00ilO0, ((Bitmap) this.I00io1l) != null);
/* 62 */            this.I00iiI = 1;
/* 64 */            Object objI000II = oOlli1l1lOlI.I000II(ioiOl011o, this);
                    return objI000II == ii0111o ? ii0111o : objI000II;
                }

                /* JADX WARN: Removed duplicated region for block: B:116:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:120:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I00100l0(Object obj) throws Throwable {
                    O010OIi o010OIiI0000oI00;
                    OlO0OIIl1 olO0OIIl1;
                    OO0oo1 oO0oo1;
                    OO0oo1 oO0oo12;
                    I0IOIlIOIII i0IOIlIOIII;
                    Throwable th;
                    List listI00IOO;
                    OOlol11 oOlol11;
                    OOloolilI11i oOloolilI11i;
                    OOloolilI11i oOloolilI11i2;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 5 */             IOoil1iiIilo iOoil1iiIilo = null;
/* 7 */             if (i != 0) {
/* 9 */                 if (i != 1) {
/* 29 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                        }
/* 13 */                i0IOIlIOIII = (I0IOIlIOIII) this.I00iiO;
/* 17 */                o010OIiI0000oI00 = (O010OIi) this.I00iio;
                        try {
/* 19 */                    lIoii1l01l0i.I00000oOI(obj);
/* 332 */                   i0IOIlIOIII.I000II();
/* 337 */                   oOloolilI11i2 = (OOloolilI11i) this.I00ilI0I1;
                            synchronized (oOloolilI11i2.I0000Il00O) {
                                try {
/* 344 */                           if (oOloolilI11i2.I0000O == o010OIiI0000oI00) {
/* 346 */                               oOloolilI11i2.I0000O = null;
                                    }
/* 355 */                           if (oOloolilI11i2.I001lloI() != null) {
/* 359 */                               IOl1II00.I00000oIO("called outside of runRecomposeAndApplyChanges");
                                    }
                                } catch (Throwable th2) {
/* 378 */                           throw th2;
                                }
                            }
/* 363 */                   OlO0OIIl1 olO0OIIl12 = OOloolilI11i.I001l0I00;
/* 371 */                   lIilli1IoOII.I00000oIO(((OOloolilI11i) this.I00ilI0I1).I001iOo1i0O);
/* 374 */                   return OoiIlOl1iI.I00000oIO;
                        } catch (Throwable th3) {
/* 24 */                    th = th3;
/* 382 */                   i0IOIlIOIII.I000II();
/* 387 */                   oOloolilI11i = (OOloolilI11i) this.I00ilI0I1;
                            synchronized (oOloolilI11i.I0000Il00O) {
                                try {
/* 394 */                           if (oOloolilI11i.I0000O == o010OIiI0000oI00) {
/* 396 */                               oOloolilI11i.I0000O = null;
                                    }
/* 405 */                           if (oOloolilI11i.I001lloI() != null) {
/* 409 */                               IOl1II00.I00000oIO("called outside of runRecomposeAndApplyChanges");
                                    }
                                } catch (Throwable th4) {
/* 426 */                           throw th4;
                                }
                            }
/* 413 */                   OlO0OIIl1 olO0OIIl13 = OOloolilI11i.I001l0I00;
/* 421 */                   lIilli1IoOII.I00000oIO(((OOloolilI11i) this.I00ilI0I1).I001iOo1i0O);
/* 424 */                   throw th;
                        }
                    }
/* 33 */            lIoii1l01l0i.I00000oOI(obj);
/* 44 */            o010OIiI0000oI00 = l01oO1iOo.I0000oI00(((Ii0110) this.I00iio).I00000oIO());
/* 50 */            OOloolilI11i oOloolilI11i3 = (OOloolilI11i) this.I00ilI0I1;
/* 52 */            OlO0OIIl1 olO0OIIl14 = OOloolilI11i.I001l0I00;
                    synchronized (oOloolilI11i3.I0000Il00O) {
/* 57 */                Throwable th5 = oOloolilI11i3.I0000oI00;
/* 59 */                if (th5 != null) {
/* 446 */                   throw th5;
                        }
/* 75 */                if (((OOloloOII0ol) oOloolilI11i3.I001IIilI0O.getValue()).compareTo(OOloloOII0ol.I00iiI) <= 0) {
/* 445 */                   throw new IllegalStateException("Recomposer shut down");
                        }
/* 79 */                if (oOloolilI11i3.I0000O != null) {
/* 437 */                   throw new IllegalStateException("Recomposer already running");
                        }
/* 81 */                oOloolilI11i3.I0000O = o010OIiI0000oI00;
/* 87 */                if (oOloolilI11i3.I001lloI() != null) {
/* 91 */                    IOl1II00.I00000oIO("called outside of runRecomposeAndApplyChanges");
                        }
                    }
/* 101 */           OOloolilI11i oOloolilI11i4 = (OOloolilI11i) this.I00ilI0I1;
/* 107 */           O1IIii o1IIii = new O1IIii(18);
/* 110 */           o1IIii.I00iiI = oOloolilI11i4;
/* 112 */           VarHandle.storeStoreFence();
/* 117 */           Ol1l1lI1Ili.I00000oOI(Ol1l1lI1Ili.I00000oIO);
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 131 */               Ol1l1lI1Ili.I000O01llI0 = IOOi0Ool1i.I00OI1(Ol1l1lI1Ili.I000O01llI0, o1IIii);
                    }
/* 138 */           I0IOIlIOIII i0IOIlIOIII2 = new I0IOIlIOIII(27);
/* 141 */           i0IOIlIOIII2.I00iiI = o1IIii;
/* 143 */           VarHandle.storeStoreFence();
/* 150 */           l1I0oI l1i0oi = ((OOloolilI11i) this.I00ilI0I1).I001iOo1i0O;
                    try {
/* 234 */               do {
/* 152 */                   olO0OIIl1 = OOloolilI11i.I001l0I00;
/* 158 */                   oO0oo1 = (OO0oo1) olO0OIIl1.getValue();
/* 160 */                   l1I0oI l1i0oi2 = l1I0oI.I00iio;
/* 162 */                   OO0lili oO0lili = oO0oo1.I00iiO;
/* 168 */                   if (oO0lili.containsKey(l1i0oi)) {
/* 170 */                       oO0oo12 = oO0oo1;
                            } else if (oO0oo1.isEmpty()) {
/* 189 */                       oO0oo12 = new OO0oo1(l1i0oi, l1i0oi, oO0lili.I000OOo1O(l1i0oi, new O100ll1iO0il(l1i0oi2, l1i0oi2)));
                            } else {
/* 193 */                       Object obj2 = oO0oo1.I00iiI;
/* 225 */                       oO0oo12 = new OO0oo1(oO0oo1.I00iOIl, l1i0oi, oO0lili.I000OOo1O(obj2, new O100ll1iO0il(((O100ll1iO0il) oO0lili.get(obj2)).I00000oIO, l1i0oi)).I000OOo1O(l1i0oi, new O100ll1iO0il(obj2, l1i0oi2)));
                            }
/* 228 */                   if (oO0oo1 != oO0oo12) {
                            }
                            break;
/* 234 */               } while (!olO0OIIl1.I000iOII(oO0oo1, oO0oo12));
                        break;
/* 238 */               OOloolilI11i oOloolilI11i5 = (OOloolilI11i) this.I00ilI0I1;
                        synchronized (oOloolilI11i5.I0000Il00O) {
/* 243 */                   listI00IOO = oOloolilI11i5.I00IOO();
                        }
/* 251 */               int size = listI00IOO.size();
/* 257 */               for (int i2 = 0; i2 < size; i2++) {
/* 271 */                   for (Object obj3 : ((IOlIOiI0iiI1) listI00IOO.get(i2)).I00ilO0.I00iiO) {
/* 282 */                       OOloioIl oOloioIl = obj3 instanceof OOloioIl ? (OOloioIl) obj3 : null;
/* 283 */                       if (oOloioIl != null && (oOlol11 = oOloioIl.I00000oIO) != null) {
/* 289 */                           oOlol11.I0000Il00O(oOloioIl, null);
                                }
                            }
                        }
/* 315 */               OO11OilO oO11OilO = new OO11OilO((OOlooO1oiOlo) this.I00ilO0, (I101iI1i) this.I00io1l, iOoil1iiIilo, 6);
/* 318 */               this.I00iio = o010OIiI0000oI00;
/* 320 */               this.I00iiO = i0IOIlIOIII2;
/* 322 */               this.I00iiI = 1;
/* 328 */               if (il001oo1.I0000Il00O(oO11OilO, this) == ii0111o) {
/* 330 */                   return ii0111o;
                        }
/* 331 */               i0IOIlIOIII = i0IOIlIOIII2;
/* 332 */               i0IOIlIOIII.I000II();
/* 337 */               oOloolilI11i2 = (OOloolilI11i) this.I00ilI0I1;
                        synchronized (oOloolilI11i2.I0000Il00O) {
                        }
                    } catch (Throwable th6) {
/* 299 */               i0IOIlIOIII = i0IOIlIOIII2;
/* 300 */               th = th6;
/* 382 */               i0IOIlIOIII.I000II();
/* 387 */               oOloolilI11i = (OOloolilI11i) this.I00ilI0I1;
                        synchronized (oOloolilI11i.I0000Il00O) {
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I00111O(Object obj) throws Throwable {
                    OI1I0OoOl oI1I0OoOl;
                    Oii110oOoO oii110oOoO;
                    Object objI010OIo1l;
                    OIooliIO0 oIooliIO0;
                    float f;
                    Oii0iO0iOI oii0iO0iOI;
/* 5 */             OoI1Oi0l1I0o ooI1Oi0l1I0o = (OoI1Oi0l1I0o) this.I00io1l;
/* 7 */             Object obj2 = this.I00ilO0;
/* 11 */            Oii110oOoO oii110oOoO2 = (Oii110oOoO) this.I00ilI0I1;
/* 13 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 15 */            int i = this.I00iiI;
/* 17 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    try {
/* 30 */                if (i == 0) {
/* 81 */                    lIoii1l01l0i.I00000oOI(obj);
/* 86 */                    Object value = oii110oOoO2.I00iiI.getValue();
/* 94 */                    if (!O0000Ioio00.I0000O(obj2, value)) {
/* 96 */                        oii110oOoO2.I010ioo();
/* 99 */                        oii110oOoO2.I010o0o0oO(0.0f);
/* 102 */                       ooI1Oi0l1I0o.I00111O(obj2);
/* 105 */                       ooI1Oi0l1I0o.I00100l0(0L);
/* 108 */                       oii110oOoO2.I00oooO(value);
/* 113 */                       oii110oOoO2.I00iiI.setValue(obj2);
                            }
/* 116 */                   OI1I0OoOl oI1I0OoOl2 = oii110oOoO2.I00li1OI;
/* 118 */                   this.I00iiO = oI1I0OoOl2;
/* 120 */                   this.I00iio = oii110oOoO2;
/* 122 */                   this.I00iiI = 1;
/* 128 */                   if (oI1I0OoOl2.I00000oIO(this) != ii0111o) {
/* 132 */                       oI1I0OoOl = oI1I0OoOl2;
/* 133 */                       oii110oOoO = oii110oOoO2;
                            }
                        }
/* 32 */                if (i != 1) {
/* 34 */                    if (i == 2) {
/* 64 */                        lIoii1l01l0i.I00000oOI(obj);
/* 186 */                       this.I00iiI = 3;
/* 192 */                       if (oii110oOoO2.I0110OiO(this) != ii0111o) {
/* 196 */                           oIooliIO0 = oii110oOoO2.I00iiO;
/* 198 */                           OIooO1iiliI oIooO1iiliI = oii110oOoO2.I00l0I0l0lO1;
/* 208 */                           if (!O0000Ioio00.I0000O(oIooliIO0.getValue(), obj2)) {
                                    }
                                }
                            }
/* 36 */                    if (i != 3) {
/* 38 */                        if (i != 4) {
/* 40 */                            if (i == 5) {
/* 42 */                                lIoii1l01l0i.I00000oOI(obj);
/* 45 */                                return ooiIlOl1iI;
                                    }
/* 48 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 29 */                            return null;
                                }
/* 52 */                        lIoii1l01l0i.I00000oOI(obj);
/* 55 */                        f = 0.0f;
/* 381 */                       oii110oOoO2.I00oooO(obj2);
/* 386 */                       oii110oOoO2.I010o0o0oO(f);
/* 389 */                       ooI1Oi0l1I0o.I000iOII();
/* 393 */                       this.I00iiI = 5;
                                return oii110oOoO2.I01101olii(this) != ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 59 */                    lIoii1l01l0i.I00000oOI(obj);
/* 196 */                   oIooliIO0 = oii110oOoO2.I00iiO;
/* 198 */                   OIooO1iiliI oIooO1iiliI2 = oii110oOoO2.I00l0I0l0lO1;
/* 208 */                   if (!O0000Ioio00.I0000O(oIooliIO0.getValue(), obj2)) {
/* 218 */                       if (oIooO1iiliI2.I000II() >= 1.0f || ((oii0iO0iOI = oii110oOoO2.I00o0iI0io1) != null && O0000Ioio00.I0000O(null, oii0iO0iOI.I00000oOI))) {
/* 233 */                           f = 0.0f;
                                } else {
/* 244 */                           OooI0100Oill oooI0100Oill = oii0iO0iOI != null ? oii0iO0iOI.I00000oOI : null;
/* 246 */                           I110iOiOllO i110iOiOllO = Oii110oOoO.I00oII;
/* 248 */                           if (oooI0100Oill != null) {
/* 250 */                               long j = oii0iO0iOI.I00000oIO;
/* 252 */                               I110iOiOllO i110iOiOllO2 = oii0iO0iOI.I0000oI00;
/* 254 */                               f = 0.0f;
/* 256 */                               I110iOiOllO i110iOiOllO3 = oii0iO0iOI.I0001Ioi1lo;
/* 276 */                               i110iOiOllO = (I110iOiOllO) oooI0100Oill.I000oI1ioi(j, i110iOiOllO2, Oii110oOoO.I00oIiI10, i110iOiOllO3 == null ? i110iOiOllO : i110iOiOllO3);
                                    } else {
/* 279 */                               f = 0.0f;
/* 281 */                               if (oii0iO0iOI != null && oii0iO0iOI.I00000oIO != 0) {
/* 290 */                                   long j2 = oii0iO0iOI.I000II;
/* 294 */                                   if (j2 == Long.MIN_VALUE) {
/* 296 */                                       j2 = oii110oOoO2.I00ilO0;
                                            }
/* 302 */                                   float f2 = j2 / 1.0E9f;
/* 305 */                                   if (f2 > 0.0f) {
/* 311 */                                       i110iOiOllO = new I110iOiOllO(1.0f / f2);
                                            }
                                        }
                                    }
/* 314 */                           if (oii0iO0iOI == null) {
/* 318 */                               oii0iO0iOI = new Oii0iO0iOI();
                                    }
/* 321 */                           I110iOiOllO i110iOiOllO4 = oii0iO0iOI.I0000oI00;
/* 323 */                           oii0iO0iOI.I00000oOI = null;
/* 326 */                           oii0iO0iOI.I0000Il00O = false;
/* 332 */                           oii0iO0iOI.I0000O = oIooO1iiliI2.I000II();
/* 338 */                           i110iOiOllO4.I0000oI00(0, oIooO1iiliI2.I000II());
/* 341 */                           long j3 = oii110oOoO2.I00ilO0;
/* 343 */                           oii0iO0iOI.I000II = j3;
/* 345 */                           oii0iO0iOI.I00000oIO = 0L;
/* 347 */                           oii0iO0iOI.I0001Ioi1lo = i110iOiOllO;
/* 363 */                           oii0iO0iOI.I000O01llI0 = O1OooO0IlOo.I000O01llI0((1.0d - oIooO1iiliI2.I000II()) * j3);
/* 365 */                           oii110oOoO2.I00o0iI0io1 = oii0iO0iOI;
                                }
/* 367 */                       this.I00iiO = null;
/* 369 */                       this.I00iio = null;
/* 372 */                       this.I00iiI = 4;
/* 378 */                       if (oii110oOoO2.I010l1O(this) != ii0111o) {
/* 381 */                           oii110oOoO2.I00oooO(obj2);
/* 386 */                           oii110oOoO2.I010o0o0oO(f);
/* 389 */                           ooI1Oi0l1I0o.I000iOII();
/* 393 */                           this.I00iiI = 5;
                                    if (oii110oOoO2.I01101olii(this) != ii0111o) {
                                    }
                                }
                            }
                        }
/* 71 */                oii110oOoO = (Oii110oOoO) this.I00iio;
/* 75 */                oI1I0OoOl = (OI1I0OoOl) this.I00iiO;
/* 77 */                lIoii1l01l0i.I00000oOI(obj);
/* 134 */               Object obj3 = oii110oOoO.I00iio;
/* 136 */               oI1I0OoOl.I00000oOI(null);
/* 143 */               if (!O0000Ioio00.I0000O(obj2, obj3)) {
/* 145 */                   this.I00iiO = null;
/* 147 */                   this.I00iio = null;
/* 149 */                   this.I00iiI = 2;
/* 155 */                   if (oii110oOoO2.I00lli11 == Long.MIN_VALUE) {
/* 167 */                       objI010OIo1l = l1i0lii.I00000oIO(getContext()).I00000oIO(this, oii110oOoO2.I00o0l1o1o0);
/* 171 */                       if (objI010OIo1l != ii0111o) {
/* 174 */                           objI010OIo1l = ooiIlOl1iI;
                                }
/* 182 */                       if (objI010OIo1l != ii0111o) {
/* 186 */                           this.I00iiI = 3;
/* 192 */                           if (oii110oOoO2.I0110OiO(this) != ii0111o) {
                                    }
                                }
                            } else {
/* 176 */                       objI010OIo1l = oii110oOoO2.I010OIo1l(this);
/* 180 */                       if (objI010OIo1l != ii0111o) {
                                }
/* 182 */                       if (objI010OIo1l != ii0111o) {
                                }
                            }
                        }
                    } catch (Throwable th) {
/* 404 */               oI1I0OoOl.I00000oOI(null);
/* 437 */               throw th;
                    }
                }

                private final Object I001IIilI0O(Object obj) throws Throwable {
                    Oil1lO oil1lO;
                    String str;
/* 3 */             I0IO1io0I i0IO1io0I = (I0IO1io0I) this.I00io1l;
/* 7 */             Context context = (Context) this.I00ilO0;
/* 11 */            O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00ilI0I1;
/* 13 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 15 */            int i = this.I00iiI;
/* 18 */            if (i == 0) {
/* 41 */                lIoii1l01l0i.I00000oOI(obj);
/* 47 */                Oil1lO oil1lO2 = new Oil1lO();
/* 52 */                String strI00000oOI = o1oIOiI11o0.I00000oOI(context, o1oIOiI11o0.I000OiO);
/* 58 */                O1oIOoi0oo o1oIOoi0ooI00000oIO = o1oIOiI11o0.I00000oIO("tokens");
/* 69 */                String strI00000oOI2 = o1oIOiI11o0.I00000oOI(context, o1oIOoi0ooI00000oIO != null ? o1oIOoi0ooI00000oIO.I0000Il00O : "tokens.txt");
/* 73 */                this.I00iiO = oil1lO2;
/* 75 */                this.I00iio = strI00000oOI;
/* 77 */                this.I00iiI = 1;
/* 90 */                obj = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new Oil1l0lOIl(oil1lO2, strI00000oOI, "auto", true, strI00000oOI2, null), this);
/* 94 */                if (obj == ii0111o) {
/* 96 */                    return ii0111o;
                        }
/* 97 */                oil1lO = oil1lO2;
/* 98 */                str = strI00000oOI;
                    } else {
/* 20 */                if (i != 1) {
/* 36 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 39 */                    return null;
                        }
/* 24 */                str = (String) this.I00iio;
/* 28 */                oil1lO = (Oil1lO) this.I00iiO;
/* 30 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 105 */           if (((Boolean) obj).booleanValue()) {
/* 107 */               o1oIOiI11o0.I00IlilI0i0i = oil1lO;
/* 111 */               i0IO1io0I.invoke("");
                    } else {
/* 129 */               i0IO1io0I.invoke("Failed to load SenseVoice model from " + str);
                    }
/* 132 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Path cross not found for [B:26:0x00b2, B:31:0x00d1], limit reached: 49 */
                /* JADX WARN: Path cross not found for [B:31:0x00d1, B:26:0x00b2], limit reached: 49 */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00c3 A[Catch: all -> 0x0023, PHI: r1 r4 r6 r7
                  0x00c3: PHI (r1v8 java.lang.Object) = (r1v7 java.lang.Object), (r1v12 java.lang.Object) binds: [B:27:0x00c0, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
                  0x00c3: PHI (r4v7 ??) = (r4v12 ??), (r4v13 ??) binds: [B:27:0x00c0, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
                  0x00c3: PHI (r6v4 ??) = (r6v9 ??), (r6v10 ??) binds: [B:27:0x00c0, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
                  0x00c3: PHI (r7v3 IlOil1iooOO0) = (r7v2 IlOil1iooOO0), (r7v7 IlOil1iooOO0) binds: [B:27:0x00c0, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0023, blocks: (B:15:0x003a, B:29:0x00c3, B:26:0x00b2, B:31:0x00d1, B:8:0x001e), top: B:51:0x0008 }] */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00d1 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #1 {all -> 0x0023, blocks: (B:15:0x003a, B:29:0x00c3, B:26:0x00b2, B:31:0x00d1, B:8:0x001e), top: B:51:0x0008 }] */
                /* JADX WARN: Type inference failed for: r11v2, types: [I01O1lIi] */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v12 */
                /* JADX WARN: Type inference failed for: r4v13 */
                /* JADX WARN: Type inference failed for: r4v2, types: [IO1010] */
                /* JADX WARN: Type inference failed for: r4v3 */
                /* JADX WARN: Type inference failed for: r4v7, types: [IO1010, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v1, types: [IIloOI] */
                /* JADX WARN: Type inference failed for: r6v10 */
                /* JADX WARN: Type inference failed for: r6v2, types: [IIloOI, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v4, types: [IIloOI, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v9 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00cf -> B:26:0x00b2). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e2 -> B:26:0x00b2). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I001IO000(Object obj) throws Throwable {
                    ?? iIloOI;
                    IlOil1iooOO0 ilOil1iooOO0;
                    Object objI00O10llo;
                    OOlloO oOlloO;
                    IIloOI iIloOI2;
                    Object objI00O10llo2;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 7 */             ?? r4 = 1;
                    try {
/* 9 */                 if (i == 0) {
/* 64 */                    lIoii1l01l0i.I00000oOI(obj);
/* 70 */                    ilOil1iooOO0 = (IlOil1iooOO0) this.I00ilO0;
/* 76 */                    iIloOI = new IIloOI(25);
/* 82 */                    Ol0OoiI1ioO ol0OoiI1ioO = new Ol0OoiI1ioO(5);
/* 89 */                    OIoO1Ol oIoO1Ol = new OIoO1Ol(28);
/* 92 */                    oIoO1Ol.I00iiI = ol0OoiI1ioO;
/* 94 */                    VarHandle.storeStoreFence();
/* 97 */                    ol0OoiI1ioO.I00io1l = oIoO1Ol;
/* 102 */                   Ol0Oo0 ol0Oo0 = new Ol0Oo0(0);
/* 105 */                   ol0Oo0.I00iiI = ol0OoiI1ioO;
/* 107 */                   VarHandle.storeStoreFence();
/* 112 */                   Ol1l1lI1Ili.I00000oOI(Ol1l1lI1Ili.I00000oIO);
                            synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 126 */                       Ol1l1lI1Ili.I000O01llI0 = IOOi0Ool1i.I00OI1(Ol1l1lI1Ili.I000O01llI0, ol0Oo0);
                            }
/* 133 */                   I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(27);
/* 136 */                   i0IOIlIOIII.I00iiI = ol0Oo0;
/* 138 */                   VarHandle.storeStoreFence();
/* 141 */                   ol0OoiI1ioO.I00ioIO = i0IOIlIOIII;
/* 143 */                   VarHandle.storeStoreFence();
/* 146 */                   iIloOI.I00iiI = ol0OoiI1ioO;
/* 149 */                   IIIII1OI1 iiiii1oi1I00000oIO = iOl1iOi0I.I00000oIO(1, null, null, 6);
                            try {
/* 157 */                       objI00O10llo = iIloOI.I00O10llo(iiiii1oi1I00000oIO, (IllOOo00lI) this.I00io1l);
/* 161 */                       this.I00ilO0 = ilOil1iooOO0;
/* 163 */                       this.I00iiO = iIloOI;
/* 165 */                       this.I00iio = iiiii1oi1I00000oIO;
/* 167 */                       this.I00ilI0I1 = objI00O10llo;
/* 169 */                       this.I00iiI = 1;
/* 175 */                       if (ilOil1iooOO0.emit(objI00O10llo, this) != ii0111o) {
/* 178 */                           oOlloO = iiiii1oi1I00000oIO;
                                    iIloOI2 = iIloOI;
                                }
/* 226 */                       return ii0111o;
                            } catch (Throwable th) {
/* 229 */                       th = th;
/* 230 */                       r4 = iiiii1oi1I00000oIO;
/* 233 */                       ?? r11 = (I01O1lIi) iIloOI.I00iiI;
/* 235 */                       if (r11 != 0) {
/* 237 */                           r11.I00ooiO1I(r4);
                                }
/* 242 */                       I01O1lIi i01O1lIi = (I01O1lIi) iIloOI.I00iiI;
/* 244 */                       if (i01O1lIi == null) {
/* 249 */                           OO1oio00IO.I00000oOI("Called dispose on a manager that has been disposed of");
                                }
/* 252 */                       i01O1lIi.I00o101lO();
/* 255 */                       iIloOI.I00iiI = null;
/* 257 */                       throw th;
                            }
                        }
/* 11 */                if (i != 1) {
/* 13 */                    if (i == 2) {
/* 45 */                        objI00O10llo = this.I00ilI0I1;
/* 49 */                        IO1010 io1010 = (IO1010) this.I00iio;
/* 53 */                        IIloOI iIloOI3 = (IIloOI) this.I00iiO;
/* 57 */                        ilOil1iooOO0 = (IlOil1iooOO0) this.I00ilO0;
/* 59 */                        lIoii1l01l0i.I00000oOI(obj);
                                r4 = io1010;
                                iIloOI = iIloOI3;
/* 200 */                       objI00O10llo2 = iIloOI.I00O10llo(r4, (IllOOo00lI) this.I00io1l);
                                oOlloO = r4;
                                iIloOI2 = iIloOI;
/* 208 */                       if (!O0000Ioio00.I0000O(objI00O10llo2, objI00O10llo)) {
/* 210 */                           this.I00ilO0 = ilOil1iooOO0;
/* 212 */                           this.I00iiO = iIloOI;
/* 214 */                           this.I00iio = r4;
/* 216 */                           this.I00ilI0I1 = objI00O10llo2;
/* 218 */                           this.I00iiI = 3;
/* 224 */                           if (ilOil1iooOO0.emit(objI00O10llo2, this) != ii0111o) {
/* 227 */                               objI00O10llo = objI00O10llo2;
                                        oOlloO = r4;
                                        iIloOI2 = iIloOI;
                                    }
/* 226 */                           return ii0111o;
                                }
                            } else if (i != 3) {
/* 41 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
                        }
/* 17 */                objI00O10llo = this.I00ilI0I1;
/* 21 */                OOlloO oOlloO2 = (IO1010) this.I00iio;
/* 25 */                IIloOI iIloOI4 = (IIloOI) this.I00iiO;
/* 29 */                ilOil1iooOO0 = (IlOil1iooOO0) this.I00ilO0;
/* 31 */                lIoii1l01l0i.I00000oOI(obj);
                        oOlloO = oOlloO2;
                        iIloOI2 = iIloOI4;
/* 179 */               this.I00ilO0 = ilOil1iooOO0;
/* 181 */               this.I00iiO = iIloOI2;
/* 183 */               this.I00iio = oOlloO;
/* 185 */               this.I00ilI0I1 = objI00O10llo;
/* 187 */               this.I00iiI = 2;
/* 189 */               Object objI000iOII = oOlloO.I000iOII(this);
                        r4 = oOlloO;
                        iIloOI = iIloOI2;
/* 193 */               if (objI000iOII == ii0111o) {
/* 200 */                   objI00O10llo2 = iIloOI.I00O10llo(r4, (IllOOo00lI) this.I00io1l);
                            oOlloO = r4;
                            iIloOI2 = iIloOI;
/* 208 */                   if (!O0000Ioio00.I0000O(objI00O10llo2, objI00O10llo)) {
                            }
/* 179 */                   this.I00ilO0 = ilOil1iooOO0;
/* 181 */                   this.I00iiO = iIloOI2;
/* 183 */                   this.I00iio = oOlloO;
/* 185 */                   this.I00ilI0I1 = objI00O10llo;
/* 187 */                   this.I00iiI = 2;
/* 189 */                   Object objI000iOII2 = oOlloO.I000iOII(this);
                            r4 = oOlloO;
                            iIloOI = iIloOI2;
/* 193 */                   if (objI000iOII2 == ii0111o) {
                            }
                        }
/* 226 */               return ii0111o;
                    } catch (Throwable th2) {
/* 36 */                th = th2;
                    }
                }

                private final Object I001i1O0Ol(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 6 */             if (i == 0) {
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 27 */                Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 31 */                OO1io0l0 oO1io0l0 = (OO1io0l0) this.I00iio;
/* 52 */                IilOIol0lOl iilOIol0lOl = new IilOIol0lOl(ii0110, (Oo0I0O1Ii0o0) this.I00ilI0I1, (O1i0lolo) this.I00ilO0, (OOIII0OOoOi1) this.I00io1l, (IOoil1iiIilo) null, 2);
/* 55 */                this.I00iiI = 1;
/* 61 */                if (ililI0.I0000Il00O(oO1io0l0, iilOIol0lOl, this) == ii0111o) {
/* 63 */                    return ii0111o;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 64 */            return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0104  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0077 -> B:15:0x0079). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I001i1lo1io(Object obj) throws Throwable {
                    OiOol0il0il oiOol0il0il;
/* 5 */             Oii00o1ll oii00o1ll = (Oii00o1ll) this.I00ilO0;
/* 9 */             OOo0ooi oOo0ooi = (OOo0ooi) this.I00io1l;
/* 13 */            OoI0Iio ooI0Iio = (OoI0Iio) this.I00ilI0I1;
/* 15 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 17 */            int i = this.I00iiI;
/* 19 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 21 */            if (i == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(obj);
/* 52 */                OiOol0il0il oiOol0il0il2 = (OiOol0il0il) this.I00iio;
/* 64 */                float fI000OiO = oii00o1ll.I000OiO(oii00o1ll.I0001Ioi1lo(((OoI0I0o10ll) oOo0ooi.I00iOIl).I00000oIO));
/* 68 */                Oii00o1ll oii00o1ll2 = ooI0Iio.I00000oIO;
/* 86 */                oii00o1ll2.I000O01llI0(oii00o1ll2.I0001Ioi1lo(oiOol0il0il2.I00000oIO(1, oii00o1ll2.I000OOo1O(oii00o1ll2.I0000oI00(fI000OiO)))));
/* 89 */                oiOol0il0il = oiOol0il0il2;
/* 96 */                if (!((OoI0I0o10ll) oOo0ooi.I00iOIl).I0000Il00O) {
                        }
                    } else {
/* 23 */                if (i != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 27 */                OOo0ooi oOo0ooi2 = (OOo0ooi) this.I00iiO;
/* 31 */                OiOol0il0il oiOol0il0il3 = (OiOol0il0il) this.I00iio;
/* 33 */                lIoii1l01l0i.I00000oOI(obj);
/* 36 */                OiOol0il0il oiOol0il0il4 = oiOol0il0il3;
/* 37 */                OOo0ooi oOo0ooi3 = oOo0ooi2;
/* 38 */                Object objI0000Il00O = obj;
/* 122 */               oOo0ooi3.I00iOIl = objI0000Il00O;
/* 126 */               OoI0I0o10ll ooI0I0o10ll = (OoI0I0o10ll) oOo0ooi.I00iOIl;
/* 128 */               IoloOio0I ioloOio0I = ooI0Iio.I0000oI00;
/* 130 */               long j = ooI0I0o10ll.I00000oOI;
/* 132 */               long j2 = ooI0I0o10ll.I00000oIO;
/* 147 */               ((OooIlilo) ioloOio0I.I00iiI).I00000oIO(Float.intBitsToFloat((int) (j2 >> 32)), j);
/* 165 */               ((OooIlilo) ioloOio0I.I00iiO).I00000oIO(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
/* 170 */               OoI0I0o10ll ooI0I0o10llI0000oI00 = OoI0Iio.I0000oI00(ooI0Iio.I0001Ioi1lo);
/* 174 */               if (ooI0I0o10llI0000oI00 != null) {
/* 176 */                   IoloOio0I ioloOio0I2 = ooI0Iio.I0000oI00;
/* 178 */                   long j3 = ooI0I0o10llI0000oI00.I00000oOI;
/* 180 */                   long j4 = ooI0I0o10llI0000oI00.I00000oIO;
/* 195 */                   ((OooIlilo) ioloOio0I2.I00iiI).I00000oIO(Float.intBitsToFloat((int) (j4 >> 32)), j3);
/* 209 */                   ((OooIlilo) ioloOio0I2.I00iiO).I00000oIO(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
/* 220 */                   oOo0ooi.I00iOIl = ((OoI0I0o10ll) oOo0ooi.I00iOIl).I00000oIO(ooI0I0o10llI0000oI00);
                        }
/* 232 */               float fI000OiO2 = oii00o1ll.I000OiO(oii00o1ll.I0001Ioi1lo(((OoI0I0o10ll) oOo0ooi.I00iOIl).I00000oIO));
/* 236 */               Oii00o1ll oii00o1ll3 = ooI0Iio.I00000oIO;
/* 254 */               oii00o1ll3.I000O01llI0(oii00o1ll3.I0001Ioi1lo(oiOol0il0il4.I00000oIO(1, oii00o1ll3.I000OOo1O(oii00o1ll3.I0000oI00(fI000OiO2)))));
/* 257 */               oiOol0il0il = oiOol0il0il4;
/* 258 */               iOoil1iiIilo = null;
/* 96 */                if (!((OoI0I0o10ll) oOo0ooi.I00iOIl).I0000Il00O) {
/* 98 */                    IIIII1OI1 iiiii1oi1 = ooI0Iio.I0001Ioi1lo;
/* 100 */                   this.I00iio = oiOol0il0il;
/* 102 */                   this.I00iiO = oOo0ooi;
/* 104 */                   this.I00iiI = 1;
/* 113 */                   objI0000Il00O = il001oo1.I0000Il00O(new O1iIlllIoo(iiiii1oi1, iOoil1iiIilo, 8), this);
/* 117 */                   if (objI0000Il00O == ii0111o) {
/* 119 */                       return ii0111o;
                            }
/* 120 */                   oiOol0il0il4 = oiOol0il0il;
/* 121 */                   oOo0ooi3 = oOo0ooi;
/* 122 */                   oOo0ooi3.I00iOIl = objI0000Il00O;
/* 126 */                   OoI0I0o10ll ooI0I0o10ll2 = (OoI0I0o10ll) oOo0ooi.I00iOIl;
/* 128 */                   IoloOio0I ioloOio0I3 = ooI0Iio.I0000oI00;
/* 130 */                   long j5 = ooI0I0o10ll2.I00000oOI;
/* 132 */                   long j22 = ooI0I0o10ll2.I00000oIO;
/* 147 */                   ((OooIlilo) ioloOio0I3.I00iiI).I00000oIO(Float.intBitsToFloat((int) (j22 >> 32)), j5);
/* 165 */                   ((OooIlilo) ioloOio0I3.I00iiO).I00000oIO(Float.intBitsToFloat((int) (j22 & 4294967295L)), j5);
/* 170 */                   OoI0I0o10ll ooI0I0o10llI0000oI002 = OoI0Iio.I0000oI00(ooI0Iio.I0001Ioi1lo);
/* 174 */                   if (ooI0I0o10llI0000oI002 != null) {
                            }
/* 232 */                   float fI000OiO22 = oii00o1ll.I000OiO(oii00o1ll.I0001Ioi1lo(((OoI0I0o10ll) oOo0ooi.I00iOIl).I00000oIO));
/* 236 */                   Oii00o1ll oii00o1ll32 = ooI0Iio.I00000oIO;
/* 254 */                   oii00o1ll32.I000O01llI0(oii00o1ll32.I0001Ioi1lo(oiOol0il0il4.I00000oIO(1, oii00o1ll32.I000OOo1O(oii00o1ll32.I0000oI00(fI000OiO22)))));
/* 257 */                   oiOol0il0il = oiOol0il0il4;
/* 258 */                   iOoil1iiIilo = null;
/* 96 */                    if (!((OoI0I0o10ll) oOo0ooi.I00iOIl).I0000Il00O) {
/* 261 */                       return OoiIlOl1iI.I00000oIO;
                            }
                        }
                    }
                }

                private final Object I001iOo1i0O(Object obj) throws Throwable {
                    long j;
                    String str;
                    long j2;
                    Object obj2;
                    File file;
                    Io11l1li io11l1li;
                    OOl11O0ii0II oOl11O0ii0II;
/* 6 */             Uri uri = (Uri) this.I00ilO0;
/* 10 */            Context context = (Context) this.I00ilI0I1;
/* 16 */            OlO0OIIl1 olO0OIIl1 = ((OoIoI0iii0) this.I00iio).I00000oOI;
/* 18 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 20 */            int i = this.I00iiI;
/* 22 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 26 */            if (i == 0) {
/* 50 */                lIoii1l01l0i.I00000oOI(obj);
/* 82 */                olO0OIIl1.I000lI(null, OoIo10100O1.I00000oIO((OoIo10100O1) olO0OIIl1.getValue(), null, false, 0, 0.0f, 0, null, true, 0.0f, null, 63));
/* 100 */               Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_size", "_display_name"}, null, null, null);
/* 104 */               String string = "";
/* 106 */               if (cursorQuery != null) {
                            try {
/* 112 */                       if (cursorQuery.moveToFirst()) {
/* 118 */                           long j3 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
/* 126 */                           string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
/* 133 */                           j = j3;
                                } else {
/* 139 */                           j = 0;
                                }
/* 141 */                       cursorQuery.close();
/* 146 */                       str = string;
/* 147 */                       j2 = j;
                            } finally {
                            }
                        } else {
/* 104 */                   str = "";
/* 157 */                   j2 = 0;
                        }
/* 163 */               long jLongValue = Long.valueOf(j2).longValue();
/* 171 */               if (str.length() == 0) {
/* 202 */                   olO0OIIl1.I000lI(null, OoIo10100O1.I00000oIO((OoIo10100O1) olO0OIIl1.getValue(), null, false, 0, 0.0f, 0, null, false, 0.0f, "Could not read file info", 191));
/* 205 */                   return ooiIlOl1iI;
                        }
/* 214 */               File file2 = new File(context.getExternalFilesDir(null), "__tts_imports");
/* 217 */               file2.mkdirs();
/* 222 */               File file3 = new File(file2, str);
                        try {
/* 229 */                   InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 233 */                   if (inputStreamOpenInputStream != null) {
                                try {
/* 237 */                           FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                    try {
/* 242 */                               byte[] bArr = new byte[8192];
/* 244 */                               long j4 = 0;
/* 246 */                               long j5 = 0;
                                        while (true) {
/* 248 */                                   int i2 = inputStreamOpenInputStream.read(bArr);
/* 255 */                                   if (i2 == -1) {
                                                break;
                                            }
/* 258 */                                   fileOutputStream.write(bArr, 0, i2);
/* 262 */                                   long j6 = j4 + i2;
/* 264 */                                   long jCurrentTimeMillis = System.currentTimeMillis();
/* 274 */                                   if (jCurrentTimeMillis - j5 <= 200 || jLongValue <= 0) {
/* 326 */                                       j4 = j6;
                                            } else {
/* 314 */                                       olO0OIIl1.I000lI(null, OoIo10100O1.I00000oIO((OoIo10100O1) olO0OIIl1.getValue(), null, false, 0, 0.0f, 0, null, false, j6 / jLongValue, null, 383));
/* 317 */                                       j5 = jCurrentTimeMillis;
/* 320 */                                       j4 = j6;
                                            }
                                        }
/* 330 */                               fileOutputStream.close();
/* 333 */                               inputStreamOpenInputStream.close();
                                    } finally {
                                    }
                                } finally {
                                }
                            }
/* 388 */                   olO0OIIl1.I000lI(null, OoIo10100O1.I00000oIO((OoIo10100O1) olO0OIIl1.getValue(), null, false, 0, 0.0f, 0, null, false, 1.0f, null, 319));
/* 391 */                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 393 */                   io11l1li = O1OI1l011OO1.I00000oIO;
                            try {
/* 406 */                       oOl11O0ii0II = new OOl11O0ii0II((IoI011li) this.I00io1l, str, file3, null, 1);
/* 409 */                       obj2 = null;
                            } catch (Exception e) {
/* 426 */                       e = e;
/* 427 */                       obj2 = null;
                            }
                        } catch (Exception e2) {
/* 337 */                   e = e2;
/* 338 */                   obj2 = null;
                        }
                        try {
/* 411 */                   this.I00iiO = file3;
/* 414 */                   this.I00iiI = 1;
                            return iOi1II01i0.I0000oI00(io11l1li, oOl11O0ii0II, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                        } catch (Exception e3) {
/* 424 */                   e = e3;
/* 339 */                   file = file3;
/* 430 */                   file.delete();
/* 468 */                   olO0OIIl1.I000lI(obj2, OoIo10100O1.I00000oIO((OoIo10100O1) olO0OIIl1.getValue(), null, false, 0, 0.0f, 0, null, false, 0.0f, IIl001iO0Io.I000o00OoI0I("Import failed: ", e.getMessage()), 191));
/* 1261 */                  return ooiIlOl1iI;
                        }
                    }
/* 28 */            if (i != 1) {
/* 45 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 48 */                return null;
                    }
/* 33 */            file = (File) this.I00iiO;
                    try {
/* 35 */                lIoii1l01l0i.I00000oOI(obj);
/* 38 */                return ooiIlOl1iI;
                    } catch (Exception e4) {
/* 39 */                e = e4;
/* 40 */                obj2 = null;
                    }
/* 430 */           file.delete();
/* 468 */           olO0OIIl1.I000lI(obj2, OoIo10100O1.I00000oIO((OoIo10100O1) olO0OIIl1.getValue(), null, false, 0, 0.0f, 0, null, false, 0.0f, IIl001iO0Io.I000o00OoI0I("Import failed: ", e.getMessage()), 191));
/* 1261 */          return ooiIlOl1iI;
                }

                private final Object I001l0I00(Object obj) throws Throwable {
                    WhisperEngine whisperEngine;
                    String str;
/* 3 */             I0IO1io0I i0IO1io0I = (I0IO1io0I) this.I00io1l;
/* 7 */             O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00ilI0I1;
/* 9 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 11 */            int i = this.I00iiI;
/* 14 */            if (i == 0) {
/* 37 */                lIoii1l01l0i.I00000oOI(obj);
/* 42 */                WhisperEngine whisperEngine2 = new WhisperEngine();
/* 51 */                String strI00000oOI = o1oIOiI11o0.I00000oOI((Context) this.I00ilO0, o1oIOiI11o0.I000OiO);
/* 55 */                this.I00iiO = whisperEngine2;
/* 57 */                this.I00iio = strI00000oOI;
/* 59 */                this.I00iiI = 1;
/* 61 */                Object objLoadModel = whisperEngine2.loadModel(strI00000oOI, this);
/* 65 */                if (objLoadModel == ii0111o) {
/* 67 */                    return ii0111o;
                        }
/* 69 */                obj = objLoadModel;
/* 70 */                whisperEngine = whisperEngine2;
/* 71 */                str = strI00000oOI;
                    } else {
/* 16 */                if (i != 1) {
/* 32 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 20 */                str = (String) this.I00iio;
/* 24 */                whisperEngine = (WhisperEngine) this.I00iiO;
/* 26 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 78 */            if (((Boolean) obj).booleanValue()) {
/* 80 */                o1oIOiI11o0.I00IlilI0i0i = whisperEngine;
/* 84 */                i0IO1io0I.invoke("");
                    } else {
/* 102 */               i0IO1io0I.invoke("Failed to load Whisper model from " + str);
                    }
/* 105 */           return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00io1l;
                    switch (i) {
                        case 0:
/* 740 */                   return new I000oI1ioi((GenerativeModel) this.I00iiO, (IO1io1iOI) this.I00iio, (O1oIOiI11o0) this.I00ilI0I1, (O1lIIi) this.I00ilO0, (O1oiiIIo111o) obj2, iOoil1iiIilo, 0);
                        case 1:
/* 707 */                   I000oI1ioi i000oI1ioi = new I000oI1ioi((I0olOi00O) this.I00iio, (Function1) this.I00ilI0I1, (I0oOiiOi0l) this.I00ilO0, (O0oIIIiiO1) obj2, iOoil1iiIilo, 1);
/* 710 */                   i000oI1ioi.I00iiO = obj;
/* 712 */                   return i000oI1ioi;
                        case 2:
/* 678 */                   I000oI1ioi i000oI1ioi2 = new I000oI1ioi(this.I00iiI, (II1o0111IO0) this.I00iio, (O1oIOiI11o0) this.I00ilI0I1, (String) this.I00ilO0, (Bitmap) obj2, iOoil1iiIilo);
/* 681 */                   i000oI1ioi2.I00iiO = obj;
/* 683 */                   return i000oI1ioi2;
                        case 3:
/* 649 */                   I000oI1ioi i000oI1ioi3 = new I000oI1ioi((IlliIl1l11O) this.I00ilO0, (IIIloOl0I1I) obj2, iOoil1iiIilo);
/* 652 */                   i000oI1ioi3.I00ilI0I1 = obj;
/* 654 */                   return i000oI1ioi3;
                        case 4:
/* 636 */                   return new I000oI1ioi((OI10i0Il) this.I00iiO, (OI10i0Il) this.I00iio, (List) this.I00ilI0I1, (O0o0I1i0O) this.I00ilO0, (OlO01l1oOil) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 605 */                   return new I000oI1ioi((O0oIlOolIO) this.I00iiO, (OI10i0Il) this.I00iio, (Oo0Oo0) this.I00ilI0I1, (Oo0IOoOi01) this.I00ilO0, (IoiiO1O1) obj2, iOoil1iiIilo, 5);
                        case 6:
/* 574 */                   return new I000oI1ioi((III0Ii) this.I00iiO, (Oo0OI01Il) this.I00iio, (O0oIlOolIO) this.I00ilI0I1, (Oo0il0olo1l) this.I00ilO0, (OIOlOI) obj2, iOoil1iiIilo, 6);
                        case 7:
/* 543 */                   return new I000oI1ioi((FaceMeshDetector) this.I00iiO, (Bitmap) this.I00iio, (OI10i0Il) this.I00ilI0I1, (OI10i0Il) this.I00ilO0, (OI10i0Il) obj2, iOoil1iiIilo, 7);
                        case 8:
/* 512 */                   return new I000oI1ioi((PoseDetector) this.I00iiO, (Bitmap) this.I00iio, (OI10i0Il) this.I00ilI0I1, (OI10i0Il) this.I00ilO0, (OI10i0Il) obj2, iOoil1iiIilo, 8);
                        case 9:
/* 480 */                   return new I000oI1ioi((String) this.I00iiO, (IOO0IOIll) this.I00iio, (Function1) this.I00ilI0I1, (Ol010000lo00) this.I00ilO0, (IllOOo00lI) obj2, iOoil1iiIilo, 9);
                        case 10:
/* 448 */                   return new I000oI1ioi((O1oIOiI11o0) this.I00ilI0I1, (Context) this.I00ilO0, (I0IO1io0I) obj2, iOoil1iiIilo, 10);
                        case 11:
/* 425 */                   return new I000oI1ioi((IoiIII) this.I00iio, (Context) this.I00ilI0I1, (Uri) this.I00ilO0, (IoI011li) obj2, iOoil1iiIilo, 11);
                        case 12:
/* 397 */                   return new I000oI1ioi((OI10i0Il) this.I00iiO, (O11iO00I1o) this.I00iio, (IlliIl1l11O) this.I00ilI0I1, (OI10i0Il) this.I00ilO0, (OI10i0Il) obj2, iOoil1iiIilo, 12);
                        case 13:
/* 365 */                   return new I000oI1ioi((Function1) this.I00iiO, (byte[]) this.I00iio, (Ol010000lo00) this.I00ilI0I1, (Function1) this.I00ilO0, (OI10i0Il) obj2, iOoil1iiIilo, 13);
                        case 14:
/* 331 */                   I000oI1ioi i000oI1ioi4 = new I000oI1ioi((IOl00O1iI1Oo) this.I00iio, (OI10i0Il) this.I00ilI0I1, (OIooO1iiliI) this.I00ilO0, (OI10i0Il) obj2, iOoil1iiIilo, 14);
/* 334 */                   i000oI1ioi4.I00iiO = obj;
/* 336 */                   return i000oI1ioi4;
                        case 15:
/* 301 */                   I000oI1ioi i000oI1ioi5 = new I000oI1ioi((OOiIOI10OOIi) this.I00iio, (Oi0IO111o10) this.I00ilI0I1, (Ii10ioolOI) this.I00ilO0, (IOi10loi) obj2, iOoil1iiIilo, 15);
/* 304 */                   i000oI1ioi5.I00iiO = obj;
/* 306 */                   return i000oI1ioi5;
                        case 16:
/* 271 */                   I000oI1ioi i000oI1ioi6 = new I000oI1ioi((IOO000ilo) this.I00ilI0I1, (String) this.I00ilO0, (OOio1IioOO1l) obj2, iOoil1iiIilo, 16);
/* 274 */                   i000oI1ioi6.I00iio = obj;
/* 276 */                   return i000oI1ioi6;
                        case 17:
/* 248 */                   return new I000oI1ioi((IoiOl011o) this.I00iiO, (OOllOII) this.I00iio, (Ol0i11lo1l1I) this.I00ilI0I1, (Il10il1) this.I00ilO0, (Bitmap) obj2, iOoil1iiIilo, 17);
                        case PoseLandmark.RIGHT_PINKY:
/* 214 */                   I000oI1ioi i000oI1ioi7 = new I000oI1ioi((OOloolilI11i) this.I00ilI0I1, (OOlooO1oiOlo) this.I00ilO0, (I101iI1i) obj2, iOoil1iiIilo, 18);
/* 217 */                   i000oI1ioi7.I00iio = obj;
/* 219 */                   return i000oI1ioi7;
                        case PoseLandmark.LEFT_INDEX:
/* 191 */                   return new I000oI1ioi((Oii110oOoO) this.I00ilI0I1, this.I00ilO0, (OoI1Oi0l1I0o) obj2, iOoil1iiIilo, 19);
                        case PoseLandmark.RIGHT_INDEX:
/* 171 */                   return new I000oI1ioi((O1oIOiI11o0) this.I00ilI0I1, (Context) this.I00ilO0, (I0IO1io0I) obj2, iOoil1iiIilo, 20);
                        case PoseLandmark.LEFT_THUMB:
/* 146 */                   I000oI1ioi i000oI1ioi8 = new I000oI1ioi((IllOOo00lI) obj2, iOoil1iiIilo);
/* 149 */                   i000oI1ioi8.I00ilO0 = obj;
/* 151 */                   return i000oI1ioi8;
                        case PoseLandmark.RIGHT_THUMB:
/* 135 */                   I000oI1ioi i000oI1ioi9 = new I000oI1ioi((OO1io0l0) this.I00iio, (Oo0I0O1Ii0o0) this.I00ilI0I1, (O1i0lolo) this.I00ilO0, (OOIII0OOoOi1) obj2, iOoil1iiIilo, 22);
/* 138 */                   i000oI1ioi9.I00iiO = obj;
/* 140 */                   return i000oI1ioi9;
                        case PoseLandmark.LEFT_HIP:
/* 105 */                   I000oI1ioi i000oI1ioi10 = new I000oI1ioi((OoI0Iio) this.I00ilI0I1, (Oii00o1ll) this.I00ilO0, (OOo0ooi) obj2, iOoil1iiIilo, 23);
/* 108 */                   i000oI1ioi10.I00iio = obj;
/* 110 */                   return i000oI1ioi10;
                        case PoseLandmark.RIGHT_HIP:
/* 82 */                    return new I000oI1ioi((OoIoI0iii0) this.I00iio, (Context) this.I00ilI0I1, (Uri) this.I00ilO0, (IoI011li) obj2, iOoil1iiIilo, 24);
                        case PoseLandmark.LEFT_KNEE:
/* 54 */                    return new I000oI1ioi((O1oIOiI11o0) this.I00ilI0I1, (Context) this.I00ilO0, (I0IO1io0I) obj2, iOoil1iiIilo, 25);
                        default:
/* 31 */                    return new I000oI1ioi((i001ll1) this.I00iio, (Context) this.I00ilI0I1, (Uri) this.I00ilO0, (IoI011li) obj2, iOoil1iiIilo, 26);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 1:
/* 393 */                   ((I000oI1ioi) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 2:
/* 379 */                   ((I000oI1ioi) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 93 */                    ((I000oI1ioi) create((IlOil1iooOO0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 18 */            return ((I000oI1ioi) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:134:0x0275  */
                /* JADX WARN: Removed duplicated region for block: B:138:0x0284  */
                /* JADX WARN: Removed duplicated region for block: B:298:0x0677 A[Catch: all -> 0x062c, TRY_LEAVE, TryCatch #6 {all -> 0x062c, blocks: (B:288:0x0628, B:296:0x0666, B:298:0x0677, B:293:0x063f), top: B:395:0x05e9 }] */
                /* JADX WARN: Removed duplicated region for block: B:302:0x0693 A[Catch: all -> 0x06a2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x06a2, blocks: (B:282:0x060e, B:311:0x06c0, B:302:0x0693), top: B:395:0x05e9 }] */
                /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v12, types: [O011OOl11] */
                /* JADX WARN: Type inference failed for: r5v14, types: [O010loOOi0Oo, O011OOl11] */
                /* JADX WARN: Type inference failed for: r5v58 */
                /* JADX WARN: Type inference failed for: r5v59 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x0273 -> B:135:0x0277). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:306:0x06a3 -> B:314:0x06cf). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Exception {
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        */
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*
                        Method dump skipped, instructions count: 2316
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.I000oI1ioi.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public I000oI1ioi(IllOOo00lI illOOo00lI, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 21;
/* 18 */            this.I00io1l = illOOo00lI;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public I000oI1ioi(IlliIl1l11O illiIl1l11O, IIIloOl0I1I iIIloOl0I1I, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 3;
/* 19 */            this.I00ilO0 = illiIl1l11O;
                    this.I00io1l = iIIloOl0I1I;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 19 */        public I000oI1ioi(Object obj, Object obj2, Object obj3, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 20 */            this.I00iOIl = i;
                    this.I00ilI0I1 = obj;
                    this.I00ilO0 = obj2;
                    this.I00io1l = obj3;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 20 */        public I000oI1ioi(Object obj, Object obj2, Object obj3, Object obj4, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 21 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00ilI0I1 = obj2;
                    this.I00ilO0 = obj3;
                    this.I00io1l = obj4;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 21 */        public I000oI1ioi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 22 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                    this.I00iio = obj2;
                    this.I00ilI0I1 = obj3;
                    this.I00ilO0 = obj4;
                    this.I00io1l = obj5;
                }
            }
