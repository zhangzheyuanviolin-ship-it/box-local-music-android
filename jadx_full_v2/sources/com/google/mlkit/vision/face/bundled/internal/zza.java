            package com.google.mlkit.vision.face.bundled.internal;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.PointF;
            import android.graphics.Rect;
            import android.media.Image;
            import android.os.Build;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.android.gms.vision.face.FaceDetectorV2Jni;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.List;
            import p000.I000II;
            import p000.IoOlilli0ol;
            import p000.OIOiOlIO01;
            import p000.Oi010OO0;
            import p000.i1ii1o0IlIi;
            import p000.i1liOiiOI;
            import p000.iI0iI1lIo;
            import p000.iI1I0l;
            import p000.iI1ol0i;
            import p000.iolIo0O01;
            import p000.l0IIOo;
            import p000.l1olI0l1;
            import p000.lIOioi0II0o;
            import p000.lilli00o;
            import p000.ll0olII;
            import p000.lo1oIIiO;
            import p000.loI0OlIOo;
            import p000.loI1oilO;
            import p000.loIiIliiO;
            import p000.loIlli0;
            import p000.loO1iOl0O;
            import p000.loOOlllI0;
            import p000.o00i0iIlO0;
            import p000.o00o01oI1oo;
            import p000.o0IiO00l;
            import p000.o0iIO111;
            import p000.o0lIl00i0oI;
            import p000.o0li0oIi;
            import p000.o0o1OolIOl10;
            import p000.o0oI0I;
            import p000.o0oIIo01;
            import p000.o10lOOO;
            
            final class zza extends loIlli0 {
                private final Context zza;
                private final o0iIO111 zzb;
                private final FaceDetectorV2Jni zzc;
                private long zzd = -1;

                public zza(Context context, loI1oilO loi1oilo, FaceDetectorV2Jni faceDetectorV2Jni) {
/* 8 */             this.zza = context;
/* 10 */            int i = loi1oilo.I00iio;
/* 12 */            iI0iI1lIo ii0ii1lioI000oI1ioi = iI1I0l.I000oI1ioi();
/* 18 */            ii0ii1lioI000oI1ioi.I0001Ioi1lo("models_bundled");
/* 25 */            iI1I0l ii1i0l = (iI1I0l) ii0ii1lioI000oI1ioi.I00000oIO();
/* 27 */            int i2 = loi1oilo.I00iOIl;
/* 29 */            o0oIIo01 o0oiio01I000oI1ioi = o10lOOO.I000oI1ioi();
/* 33 */            iI0iI1lIo ii0ii1lioI000oI1ioi2 = iI1I0l.I000oI1ioi();
/* 37 */            ii0ii1lioI000oI1ioi2.I0001Ioi1lo("models_bundled");
/* 46 */            String str = i2 == 2 ? "fssd_medium_8bit_v5.tflite" : "fssd_25_8bit_v2.tflite";
/* 48 */            ii0ii1lioI000oI1ioi2.I0000O();
/* 55 */            iI1I0l.I00100o1O0lo((iI1I0l) ii0ii1lioI000oI1ioi2.I00iiI, str);
/* 62 */            iI1I0l ii1i0l2 = (iI1I0l) ii0ii1lioI000oI1ioi2.I00000oIO();
/* 64 */            o0oiio01I000oI1ioi.I0000O();
/* 71 */            o10lOOO.I00100l0((o10lOOO) o0oiio01I000oI1ioi.I00iiI, ii1i0l2);
/* 74 */            iI0iI1lIo ii0ii1lioI000oI1ioi3 = iI1I0l.I000oI1ioi();
/* 78 */            ii0ii1lioI000oI1ioi3.I0001Ioi1lo("models_bundled");
/* 86 */            String str2 = i2 == 2 ? "fssd_medium_8bit_gray_v5.tflite" : "fssd_25_8bit_gray_v2.tflite";
/* 88 */            ii0ii1lioI000oI1ioi3.I0000O();
/* 95 */            iI1I0l.I00100o1O0lo((iI1I0l) ii0ii1lioI000oI1ioi3.I00iiI, str2);
/* 102 */           iI1I0l ii1i0l3 = (iI1I0l) ii0ii1lioI000oI1ioi3.I00000oIO();
/* 104 */           o0oiio01I000oI1ioi.I0000O();
/* 111 */           o10lOOO.I00100o1O0lo((o10lOOO) o0oiio01I000oI1ioi.I00iiI, ii1i0l3);
/* 114 */           iI0iI1lIo ii0ii1lioI000oI1ioi4 = iI1I0l.I000oI1ioi();
/* 118 */           ii0ii1lioI000oI1ioi4.I0001Ioi1lo("models_bundled");
/* 126 */           String str3 = i2 == 2 ? "fssd_anchors_v5.pb" : "fssd_anchors_v2.pb";
/* 128 */           ii0ii1lioI000oI1ioi4.I0000O();
/* 135 */           iI1I0l.I00100o1O0lo((iI1I0l) ii0ii1lioI000oI1ioi4.I00iiI, str3);
/* 142 */           iI1I0l ii1i0l4 = (iI1I0l) ii0ii1lioI000oI1ioi4.I00000oIO();
/* 144 */           o0oiio01I000oI1ioi.I0000O();
/* 151 */           o10lOOO.I0010o((o10lOOO) o0oiio01I000oI1ioi.I00iiI, ii1i0l4);
/* 154 */           o0oiio01I000oI1ioi.I0000O();
/* 161 */           o10lOOO.I0010I0i((o10lOOO) o0oiio01I000oI1ioi.I00iiI, ii1i0l);
/* 168 */           o10lOOO o10looo = (o10lOOO) o0oiio01I000oI1ioi.I00000oIO();
/* 170 */           o0IiO00l o0iio00lI000oI1ioi = o0iIO111.I000oI1ioi();
/* 174 */           o0iio00lI000oI1ioi.I0000O();
/* 181 */           o0iIO111.I0010o((o0iIO111) o0iio00lI000oI1ioi.I00iiI, o10looo);
/* 184 */           l1olI0l1 l1oli0l1I000oI1ioi = lIOioi0II0o.I000oI1ioi();
/* 188 */           l1oli0l1I000oI1ioi.I0000O();
/* 195 */           lIOioi0II0o.I00100l0((lIOioi0II0o) l1oli0l1I000oI1ioi.I00iiI, ii1i0l);
/* 198 */           l1oli0l1I000oI1ioi.I0000O();
/* 205 */           lIOioi0II0o.I00100o1O0lo((lIOioi0II0o) l1oli0l1I000oI1ioi.I00iiI, ii1i0l);
/* 208 */           o0iio00lI000oI1ioi.I0000O();
/* 221 */           o0iIO111.I00111O((o0iIO111) o0iio00lI000oI1ioi.I00iiI, (lIOioi0II0o) l1oli0l1I000oI1ioi.I00000oIO());
/* 224 */           i1ii1o0IlIi i1ii1o0iliiI000oI1ioi = i1liOiiOI.I000oI1ioi();
/* 228 */           i1ii1o0iliiI000oI1ioi.I0000O();
/* 235 */           i1liOiiOI.I00100o1O0lo((i1liOiiOI) i1ii1o0iliiI000oI1ioi.I00iiI, ii1i0l);
/* 238 */           i1ii1o0iliiI000oI1ioi.I0000O();
/* 245 */           i1liOiiOI.I0010I0i((i1liOiiOI) i1ii1o0iliiI000oI1ioi.I00iiI, ii1i0l);
/* 248 */           i1ii1o0iliiI000oI1ioi.I0000O();
/* 255 */           i1liOiiOI.I0010o((i1liOiiOI) i1ii1o0iliiI000oI1ioi.I00iiI, ii1i0l);
/* 258 */           i1ii1o0iliiI000oI1ioi.I0000O();
/* 265 */           i1liOiiOI.I00111O((i1liOiiOI) i1ii1o0iliiI000oI1ioi.I00iiI, ii1i0l);
/* 268 */           o0iio00lI000oI1ioi.I0000O();
/* 281 */           o0iIO111.I001IIilI0O((o0iIO111) o0iio00lI000oI1ioi.I00iiI, (i1liOiiOI) i1ii1o0iliiI000oI1ioi.I00000oIO());
/* 284 */           boolean z = false;
/* 290 */           boolean z2 = i == 2;
/* 291 */           o0iio00lI000oI1ioi.I0000O();
/* 298 */           o0iIO111.I001IO000((o0iIO111) o0iio00lI000oI1ioi.I00iiI, z2);
/* 301 */           if (!z2 && loi1oilo.I00ilI0I1) {
/* 307 */               z = true;
                    }
/* 308 */           o0iio00lI000oI1ioi.I0000O();
/* 315 */           o0iIO111.I00100o1O0lo((o0iIO111) o0iio00lI000oI1ioi.I00iiI, z);
/* 318 */           float f = loi1oilo.I00ilO0;
/* 320 */           o0iio00lI000oI1ioi.I0000O();
/* 327 */           o0iIO111.I00100l0((o0iIO111) o0iio00lI000oI1ioi.I00iiI, f);
/* 330 */           o0iio00lI000oI1ioi.I0000O();
/* 337 */           o0iIO111.I0010I0i((o0iIO111) o0iio00lI000oI1ioi.I00iiI);
/* 340 */           if (z2) {
/* 343 */               o0iio00lI000oI1ioi.I000II(4);
/* 346 */               o0iio00lI000oI1ioi.I0001Ioi1lo(4);
                    } else {
/* 351 */               if (i2 == 1) {
/* 360 */                   o0iio00lI000oI1ioi.I000II(2);
                        } else if (i2 == 2) {
/* 356 */                   o0iio00lI000oI1ioi.I000II(3);
                        }
/* 363 */               int i3 = loi1oilo.I00iiI;
/* 365 */               if (i3 == 1) {
/* 374 */                   o0iio00lI000oI1ioi.I0001Ioi1lo(2);
                        } else if (i3 == 2) {
/* 370 */                   o0iio00lI000oI1ioi.I0001Ioi1lo(3);
                        }
/* 377 */               int i4 = loi1oilo.I00iiO;
/* 379 */               if (i4 == 1) {
/* 395 */                   o0iio00lI000oI1ioi.I0000O();
/* 402 */                   o0iIO111.I001l0I00((o0iIO111) o0iio00lI000oI1ioi.I00iiI, 2);
                        } else if (i4 == 2) {
/* 384 */                   o0iio00lI000oI1ioi.I0000O();
/* 391 */                   o0iIO111.I001l0I00((o0iIO111) o0iio00lI000oI1ioi.I00iiI, 3);
                        }
                    }
/* 411 */           this.zzb = (o0iIO111) o0iio00lI000oI1ioi.I00000oIO();
/* 413 */           this.zzc = faceDetectorV2Jni;
                }

                private final List zze(o00i0iIlO0 o00i0iilo0) {
                    float f;
                    float f2;
                    float f3;
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    int i;
                    int i2;
/* 5 */             ArrayList arrayList3 = new ArrayList();
/* 24 */            for (o0oI0I o0oi0i : o00i0iilo0.I00100l0().I00100l0()) {
/* 39 */                if (this.zzb.I001i1O0Ol() == 3) {
/* 49 */                    float fI000oI1ioi = -1.0f;
/* 51 */                    float fI000oI1ioi2 = -1.0f;
/* 53 */                    float fI000oI1ioi3 = -1.0f;
/* 59 */                    for (o0lIl00i0oI o0lil00i0oi : o0oi0i.I001i1lo1io()) {
/* 67 */                        String strI00100l0 = o0lil00i0oi.I00100l0();
/* 71 */                        int iHashCode = strI00100l0.hashCode();
/* 80 */                        if (iHashCode != -1940789646) {
/* 85 */                            if (iHashCode != -1837755075) {
/* 90 */                                if (iHashCode == 105428 && strI00100l0.equals("joy")) {
/* 101 */                                   fI000oI1ioi3 = o0lil00i0oi.I000oI1ioi();
                                        }
                                    } else if (strI00100l0.equals("right_eye_closed")) {
/* 118 */                               fI000oI1ioi2 = 1.0f - o0lil00i0oi.I000oI1ioi();
                                    }
                                } else if (strI00100l0.equals("left_eye_closed")) {
/* 133 */                           fI000oI1ioi = 1.0f - o0lil00i0oi.I000oI1ioi();
                                }
                            }
/* 136 */                   f = fI000oI1ioi;
/* 138 */                   f2 = fI000oI1ioi2;
/* 140 */                   f3 = fI000oI1ioi3;
                        } else {
/* 143 */                   f = -1.0f;
/* 145 */                   f2 = -1.0f;
/* 147 */                   f3 = -1.0f;
                        }
/* 160 */               int i3 = 1;
/* 161 */               int i4 = -1;
/* 162 */               if (this.zzb.I001i1lo1io() == 3) {
/* 164 */                   o00o01oI1oo<o0o1OolIOl10> o00o01oi1ooI001iOo1i0O = o0oi0i.I001iOo1i0O();
/* 170 */                   arrayList = new ArrayList();
/* 181 */                   for (o0o1OolIOl10 o0o1ooliol10 : o00o01oi1ooI001iOo1i0O) {
                                int iI00100o1O0lo = o0o1ooliol10.I00100o1O0lo() - 1;
/* 195 */                       if (iI00100o1O0lo == 0) {
/* 242 */                           i2 = 4;
                                } else if (iI00100o1O0lo == i3) {
/* 239 */                           i2 = 10;
                                } else if (iI00100o1O0lo != 9) {
                                    switch (iI00100o1O0lo) {
                                        case 11:
/* 235 */                                   i2 = 0;
                                            break;
                                        case 12:
/* 233 */                                   i2 = 5;
                                            break;
                                        case 13:
/* 230 */                                   i2 = 11;
                                            break;
                                        default:
                                            switch (iI00100o1O0lo) {
                                                case 238:
/* 228 */                                           i2 = 1;
                                                    break;
                                                case 239:
/* 226 */                                           i2 = 7;
                                                    break;
                                                case 240:
/* 224 */                                           i2 = 3;
                                                    break;
                                                case 241:
/* 222 */                                           i2 = 9;
                                                    break;
                                                case 242:
/* 220 */                                           i2 = 2;
                                                    break;
                                                case 243:
/* 218 */                                           i2 = 8;
                                                    break;
                                                default:
/* 213 */                                           "Unknown landmark type: ".concat(Integer.toString(iI00100o1O0lo));
/* 216 */                                           i2 = -1;
                                                    break;
                                            }
                                    }
                                } else {
/* 237 */                           i2 = 6;
                                }
/* 243 */                       if (i2 >= 0) {
/* 263 */                           arrayList.add(new loOOlllI0(i2, new PointF(o0o1ooliol10.I000oI1ioi(), o0o1ooliol10.I00100l0())));
                                }
/* 266 */                       i3 = 1;
                            }
                        } else {
/* 270 */                   arrayList = new ArrayList();
                        }
/* 279 */               if (this.zzb.I001i1lo1io() == 4) {
/* 287 */                   List<loO1iOl0O> list = (List) o0oi0i.I000oI1ioi(iI1ol0i.I00000oIO);
/* 291 */                   arrayList2 = new ArrayList();
/* 302 */                   for (loO1iOl0O loo1iol0o : list) {
                                switch (loo1iol0o.I00100o1O0lo() + i4) {
                                    case 1:
/* 354 */                               i = 1;
                                        break;
                                    case 2:
/* 352 */                               i = 2;
                                        break;
                                    case 3:
/* 350 */                               i = 3;
                                        break;
                                    case 4:
/* 348 */                               i = 4;
                                        break;
                                    case 5:
/* 346 */                               i = 5;
                                        break;
                                    case 6:
/* 344 */                               i = 6;
                                        break;
                                    case 7:
/* 342 */                               i = 7;
                                        break;
                                    case 8:
/* 340 */                               i = 8;
                                        break;
                                    case 9:
/* 338 */                               i = 9;
                                        break;
                                    case 10:
/* 335 */                               i = 10;
                                        break;
                                    case 11:
/* 332 */                               i = 11;
                                        break;
                                    case 12:
/* 329 */                               i = 12;
                                        break;
                                    case 13:
/* 326 */                               i = 13;
                                        break;
                                    case 14:
/* 323 */                               i = 14;
                                        break;
                                    case 15:
/* 320 */                               i = 15;
                                        break;
                                    default:
/* 318 */                               i = i4;
                                        break;
                                }
/* 355 */                       if (i != i4) {
/* 359 */                           ArrayList arrayList4 = new ArrayList();
/* 374 */                           for (ll0olII ll0olii : loo1iol0o.I00100l0()) {
/* 395 */                               arrayList4.add(new PointF(ll0olii.I000oI1ioi(), ll0olii.I00100l0()));
                                    }
/* 405 */                           arrayList2.add(new loI0OlIOo(i, arrayList4));
/* 408 */                           i4 = -1;
                                }
                            }
                        } else {
/* 415 */                   arrayList2 = new ArrayList();
                        }
/* 410 */               ArrayList arrayList5 = arrayList2;
/* 419 */               o0li0oIi o0li0oiiI001IO000 = o0oi0i.I001IO000();
/* 488 */               arrayList3.add(new loIiIliiO((int) o0oi0i.I001IIilI0O(), new Rect((int) o0li0oiiI001IO000.I000oI1ioi(), (int) o0li0oiiI001IO000.I00100o1O0lo(), (int) o0li0oiiI001IO000.I00100l0(), (int) o0li0oiiI001IO000.I0010I0i()), o0oi0i.I0010o(), o0oi0i.I0010I0i(), o0oi0i.I00111O(), f, f2, f3, o0oi0i.I00100l0() ? o0oi0i.I00100o1O0lo() : -1.0f, arrayList, arrayList5));
                    }
/* 493 */           return arrayList3;
                }

                private static int zzf(int i) {
/* 2 */             if (i == 0) {
/* 1 */                 return 1;
                    }
/* 4 */             if (i == 1) {
/* 25 */                return 4;
                    }
/* 8 */             if (i == 2) {
/* 6 */                 return 3;
                    }
/* 10 */            if (i == 3) {
/* 7 */                 return 2;
                    }
/* 19 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Unsupported rotation degree: "));
/* 22 */            return 0;
                }

                private final List zzg(ByteBuffer byteBuffer, lo1oIIiO lo1oiiio, int i) {
                    o00i0iIlO0 o00i0iilo0I00000oOI;
/* 1 */             iolIo0O01 iolio0o01I000oI1ioi = l0IIOo.I000oI1ioi();
/* 5 */             int i2 = lo1oiiio.I00iiI;
/* 7 */             iolio0o01I000oI1ioi.I0000O();
/* 14 */            l0IIOo.I00100l0((l0IIOo) iolio0o01I000oI1ioi.I00iiI, i2);
/* 17 */            int i3 = lo1oiiio.I00iiO;
/* 19 */            iolio0o01I000oI1ioi.I0000O();
/* 26 */            l0IIOo.I0010I0i((l0IIOo) iolio0o01I000oI1ioi.I00iiI, i3);
/* 31 */            int iZzf = zzf(lo1oiiio.I00iio);
/* 35 */            iolio0o01I000oI1ioi.I0000O();
/* 42 */            l0IIOo.I00111O((l0IIOo) iolio0o01I000oI1ioi.I00iiI, iZzf);
/* 45 */            iolio0o01I000oI1ioi.I0000O();
/* 52 */            l0IIOo.I0010o((l0IIOo) iolio0o01I000oI1ioi.I00iiI, i);
/* 55 */            long j = lo1oiiio.I00ilI0I1;
/* 61 */            if (j > 0) {
/* 66 */                iolio0o01I000oI1ioi.I0000O();
/* 73 */                l0IIOo.I00100o1O0lo((l0IIOo) iolio0o01I000oI1ioi.I00iiI, j * 1000);
                    }
/* 80 */            l0IIOo l0iioo = (l0IIOo) iolio0o01I000oI1ioi.I00000oIO();
/* 86 */            if (byteBuffer.isDirect()) {
/* 92 */                o00i0iilo0I00000oOI = this.zzc.I0000O(this.zzd, byteBuffer, l0iioo);
                    } else if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
/* 117 */               o00i0iilo0I00000oOI = this.zzc.I00000oOI(this.zzd, byteBuffer.array(), l0iioo);
                    } else {
/* 126 */               byte[] bArr = new byte[byteBuffer.remaining()];
/* 128 */               byteBuffer.get(bArr);
/* 135 */               o00i0iilo0I00000oOI = this.zzc.I00000oOI(this.zzd, bArr, l0iioo);
                    }
                    return o00i0iilo0I00000oOI != null ? zze(o00i0iilo0I00000oOI) : new ArrayList();
                }

                @Override
                public final List zzb(IoOlilli0ol ioOlilli0ol, lo1oIIiO lo1oiiio) throws RemoteException {
                    o00i0iIlO0 o00i0iilo0I0000Il00O;
/* 5 */             int i = lo1oiiio.I00iOIl;
/* 9 */             if (i == -1) {
/* 406 */               return zzg(lilli00o.I00000oIO((Bitmap) OIOiOlIO01.I00O0o1oo(ioOlilli0ol)), lo1oiiio, 2);
                    }
/* 13 */            if (i == 17) {
/* 391 */               return zzg((ByteBuffer) OIOiOlIO01.I00O0o1oo(ioOlilli0ol), lo1oiiio, 2);
                    }
/* 17 */            if (i != 35) {
/* 22 */                if (i == 842094169) {
/* 31 */                    return zzg((ByteBuffer) OIOiOlIO01.I00O0o1oo(ioOlilli0ol), lo1oiiio, 7);
                        }
/* 56 */                String str = "Unsupported image format " + i + " at API " + Build.VERSION.SDK_INT;
/* 62 */                Log.e("ThickFaceDetector", str);
/* 70 */                throw new RemoteException(str);
                    }
/* 77 */            Image.Plane[] planes = ((Image) OIOiOlIO01.I00O0o1oo(ioOlilli0ol)).getPlanes();
/* 84 */            ByteBuffer buffer = planes[0].getBuffer();
/* 91 */            ByteBuffer buffer2 = planes[1].getBuffer();
/* 97 */            ByteBuffer buffer3 = planes[2].getBuffer();
/* 101 */           iolIo0O01 iolio0o01I000oI1ioi = l0IIOo.I000oI1ioi();
/* 105 */           int i2 = lo1oiiio.I00iiI;
/* 107 */           iolio0o01I000oI1ioi.I0000O();
/* 114 */           l0IIOo.I00100l0((l0IIOo) iolio0o01I000oI1ioi.I00iiI, i2);
/* 117 */           int i3 = lo1oiiio.I00iiO;
/* 119 */           iolio0o01I000oI1ioi.I0000O();
/* 126 */           l0IIOo.I0010I0i((l0IIOo) iolio0o01I000oI1ioi.I00iiI, i3);
/* 131 */           int iZzf = zzf(lo1oiiio.I00iio);
/* 135 */           iolio0o01I000oI1ioi.I0000O();
/* 142 */           l0IIOo.I00111O((l0IIOo) iolio0o01I000oI1ioi.I00iiI, iZzf);
/* 145 */           long j = lo1oiiio.I00ilI0I1;
/* 151 */           if (j > 0) {
/* 156 */               iolio0o01I000oI1ioi.I0000O();
/* 163 */               l0IIOo.I00100o1O0lo((l0IIOo) iolio0o01I000oI1ioi.I00iiI, j * 1000);
                    }
/* 172 */           l0IIOo l0iioo = (l0IIOo) iolio0o01I000oI1ioi.I00000oIO();
/* 178 */           if (buffer.isDirect()) {
/* 222 */               o00i0iilo0I0000Il00O = this.zzc.I0000oI00(this.zzd, buffer, buffer2, buffer3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), l0iioo);
                    } else if (buffer.hasArray() && buffer.arrayOffset() == 0) {
/* 292 */               o00i0iilo0I0000Il00O = this.zzc.I0000Il00O(this.zzd, buffer.array(), buffer2.array(), buffer3.array(), planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), l0iioo);
                    } else {
/* 301 */               byte[] bArr = new byte[buffer.remaining()];
/* 303 */               buffer.get(bArr);
/* 310 */               byte[] bArr2 = new byte[buffer2.remaining()];
/* 312 */               buffer.get(bArr);
/* 319 */               byte[] bArr3 = new byte[buffer3.remaining()];
/* 321 */               buffer.get(bArr);
/* 368 */               o00i0iilo0I0000Il00O = this.zzc.I0000Il00O(this.zzd, bArr, bArr2, bArr3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), l0iioo);
                    }
                    return o00i0iilo0I0000Il00O != null ? zze(o00i0iilo0I0000Il00O) : new ArrayList();
                }

                @Override
                public final void zzc() {
/* 15 */            this.zzd = this.zzc.I00000oIO(this.zzb, this.zza.getAssets());
                }

                @Override
                public final void zzd() {
/* 1 */             long j = this.zzd;
/* 7 */             if (j > 0) {
/* 11 */                this.zzc.I0001Ioi1lo(j);
/* 16 */                this.zzd = -1L;
                    }
                }
            }
