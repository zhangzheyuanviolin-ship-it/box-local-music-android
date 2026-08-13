            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.PointF;
            import android.graphics.Rect;
            import android.media.Image;
            import android.os.Build;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.util.Log;
            import com.google.android.gms.vision.face.FaceDetectorV2Jni;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class i1II10ol0 extends loIlli0 {
                public static final Io0Ool I000o00OoI0I = new Io0Ool("FaceDetector", "");
                public Context I000II;
                public loI1oilO I000O01llI0;
                public o0iIO111 I000OOo1O;
                public FaceDetectorV2Jni I000OiO;
                public i0O1lIi1O0IO I000iOII;
                public OoIol00Ool I000l1;
                public long I000lI;

                public static int zzf(int i) {
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

                public final ArrayList I00000oOI(o00i0iIlO0 o00i0iilo0) {
                    float f;
                    float f2;
                    float f3;
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    int i;
                    int i2;
/* 3 */             o0iIO111 o0iio111 = this.I000OOo1O;
/* 7 */             ArrayList arrayList3 = new ArrayList();
/* 26 */            for (o0oI0I o0oi0i : o00i0iilo0.I00100l0().I00100l0()) {
/* 39 */                if (o0iio111.I001i1O0Ol() == 3) {
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
/* 149 */               int iI001i1lo1io = o0iio111.I001i1lo1io();
/* 155 */               Io0Ool io0Ool = I000o00OoI0I;
/* 158 */               int i3 = 9;
/* 160 */               int i4 = 1;
/* 161 */               int i5 = -1;
/* 162 */               if (iI001i1lo1io == 3) {
/* 164 */                   o00o01oI1oo<o0o1OolIOl10> o00o01oi1ooI001iOo1i0O = o0oi0i.I001iOo1i0O();
/* 170 */                   arrayList = new ArrayList();
/* 181 */                   for (o0o1OolIOl10 o0o1ooliol10 : o00o01oi1ooI001iOo1i0O) {
                                int iI00100o1O0lo = o0o1ooliol10.I00100o1O0lo() - 1;
/* 195 */                       if (iI00100o1O0lo == 0) {
/* 247 */                           i2 = 4;
                                } else if (iI00100o1O0lo == i4) {
/* 244 */                           i2 = 10;
                                } else if (iI00100o1O0lo != i3) {
                                    switch (iI00100o1O0lo) {
                                        case 11:
/* 240 */                                   i2 = 0;
                                            break;
                                        case 12:
/* 238 */                                   i2 = 5;
                                            break;
                                        case 13:
/* 235 */                                   i2 = 11;
                                            break;
                                        default:
                                            switch (iI00100o1O0lo) {
                                                case 238:
/* 233 */                                           i2 = i4;
                                                    break;
                                                case 239:
/* 231 */                                           i2 = 7;
                                                    break;
                                                case 240:
/* 229 */                                           i2 = 3;
                                                    break;
                                                case 241:
/* 226 */                                           i2 = 9;
                                                    break;
                                                case 242:
/* 224 */                                           i2 = 2;
                                                    break;
                                                case 243:
/* 222 */                                           i2 = 8;
                                                    break;
                                                default:
/* 217 */                                           io0Ool.I00000oIO("Unknown landmark type: ".concat(Integer.toString(iI00100o1O0lo)));
/* 220 */                                           i2 = -1;
                                                    break;
                                            }
                                    }
                                } else {
/* 242 */                           i2 = 6;
                                }
/* 248 */                       if (i2 >= 0) {
/* 268 */                           arrayList.add(new loOOlllI0(i2, new PointF(o0o1ooliol10.I000oI1ioi(), o0o1ooliol10.I00100l0())));
/* 271 */                           i3 = 9;
/* 273 */                           i4 = 1;
                                } else {
/* 275 */                           i3 = 9;
                                }
                            }
                        } else {
/* 280 */                   arrayList = new ArrayList();
                        }
/* 287 */               if (o0iio111.I001i1lo1io() == 4) {
/* 295 */                   List<loO1iOl0O> list = (List) o0oi0i.I000oI1ioi(iI1ol0i.I00000oIO);
/* 299 */                   arrayList2 = new ArrayList();
/* 310 */                   for (loO1iOl0O loo1iol0o : list) {
/* 322 */                       int iI00100o1O0lo2 = loo1iol0o.I00100o1O0lo() + i5;
                                switch (iI00100o1O0lo2) {
                                    case 1:
/* 380 */                               i = 1;
                                        break;
                                    case 2:
/* 378 */                               i = 2;
                                        break;
                                    case 3:
/* 376 */                               i = 3;
                                        break;
                                    case 4:
/* 374 */                               i = 4;
                                        break;
                                    case 5:
/* 372 */                               i = 5;
                                        break;
                                    case 6:
/* 370 */                               i = 6;
                                        break;
                                    case 7:
/* 368 */                               i = 7;
                                        break;
                                    case 8:
/* 366 */                               i = 8;
                                        break;
                                    case 9:
/* 363 */                               i = 9;
                                        break;
                                    case 10:
/* 360 */                               i = 10;
                                        break;
                                    case 11:
/* 357 */                               i = 11;
                                        break;
                                    case 12:
/* 354 */                               i = 12;
                                        break;
                                    case 13:
/* 351 */                               i = 13;
                                        break;
                                    case 14:
/* 348 */                               i = 14;
                                        break;
                                    case 15:
/* 345 */                               i = 15;
                                        break;
                                    default:
/* 340 */                               io0Ool.I00000oIO("Unknown contour type: " + iI00100o1O0lo2);
/* 343 */                               i = i5;
                                        break;
                                }
/* 381 */                       if (i != i5) {
/* 385 */                           ArrayList arrayList4 = new ArrayList();
/* 400 */                           for (ll0olII ll0olii : loo1iol0o.I00100l0()) {
/* 421 */                               arrayList4.add(new PointF(ll0olii.I000oI1ioi(), ll0olii.I00100l0()));
                                    }
/* 431 */                           arrayList2.add(new loI0OlIOo(i, arrayList4));
/* 434 */                           i5 = -1;
                                }
                            }
                        } else {
/* 442 */                   arrayList2 = new ArrayList();
                        }
/* 437 */               ArrayList arrayList5 = arrayList2;
/* 446 */               o0li0oIi o0li0oiiI001IO000 = o0oi0i.I001IO000();
/* 515 */               arrayList3.add(new loIiIliiO((int) o0oi0i.I001IIilI0O(), new Rect((int) o0li0oiiI001IO000.I000oI1ioi(), (int) o0li0oiiI001IO000.I00100o1O0lo(), (int) o0li0oiiI001IO000.I00100l0(), (int) o0li0oiiI001IO000.I0010I0i()), o0oi0i.I0010o(), o0oi0i.I0010I0i(), o0oi0i.I00111O(), f, f2, f3, o0oi0i.I00100l0() ? o0oi0i.I00100o1O0lo() : -1.0f, arrayList, arrayList5));
                    }
/* 520 */           return arrayList3;
                }

                public final ArrayList I0000O(ByteBuffer byteBuffer, lo1oIIiO lo1oiiio, int i) {
                    o00i0iIlO0 o00i0iilo0I00000oOI;
/* 1 */             FaceDetectorV2Jni faceDetectorV2Jni = this.I000OiO;
/* 3 */             iolIo0O01 iolio0o01I000oI1ioi = l0IIOo.I000oI1ioi();
/* 7 */             int i2 = lo1oiiio.I00iiI;
/* 9 */             iolio0o01I000oI1ioi.I0000O();
/* 16 */            l0IIOo.I00100l0((l0IIOo) iolio0o01I000oI1ioi.I00iiI, i2);
/* 19 */            int i3 = lo1oiiio.I00iiO;
/* 21 */            iolio0o01I000oI1ioi.I0000O();
/* 28 */            l0IIOo.I0010I0i((l0IIOo) iolio0o01I000oI1ioi.I00iiI, i3);
/* 33 */            int iZzf = zzf(lo1oiiio.I00iio);
/* 37 */            iolio0o01I000oI1ioi.I0000O();
/* 44 */            l0IIOo.I00111O((l0IIOo) iolio0o01I000oI1ioi.I00iiI, iZzf);
/* 47 */            iolio0o01I000oI1ioi.I0000O();
/* 54 */            l0IIOo.I0010o((l0IIOo) iolio0o01I000oI1ioi.I00iiI, i);
/* 57 */            long j = lo1oiiio.I00ilI0I1;
/* 63 */            if (j > 0) {
/* 68 */                iolio0o01I000oI1ioi.I0000O();
/* 75 */                l0IIOo.I00100o1O0lo((l0IIOo) iolio0o01I000oI1ioi.I00iiI, j * 1000);
                    }
/* 82 */            l0IIOo l0iioo = (l0IIOo) iolio0o01I000oI1ioi.I00000oIO();
/* 88 */            if (byteBuffer.isDirect()) {
/* 92 */                o00i0iilo0I00000oOI = faceDetectorV2Jni.I0000O(this.I000lI, byteBuffer, l0iioo);
                    } else if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
/* 115 */               o00i0iilo0I00000oOI = faceDetectorV2Jni.I00000oOI(this.I000lI, byteBuffer.array(), l0iioo);
                    } else {
/* 124 */               byte[] bArr = new byte[byteBuffer.remaining()];
/* 126 */               byteBuffer.get(bArr);
/* 131 */               o00i0iilo0I00000oOI = faceDetectorV2Jni.I00000oOI(this.I000lI, bArr, l0iioo);
                    }
                    return o00i0iilo0I00000oOI != null ? I00000oOI(o00i0iilo0I00000oOI) : new ArrayList();
                }

                @Override
                public final List zzb(IoOlilli0ol ioOlilli0ol, lo1oIIiO lo1oiiio) throws RemoteException {
                    ArrayList arrayListI0000O;
                    o00i0iIlO0 o00i0iilo0I0000Il00O;
/* 5 */             SystemClock.elapsedRealtime();
/* 8 */             long jCurrentTimeMillis = System.currentTimeMillis();
/* 12 */            int i = lo1oiiio.I00iOIl;
/* 16 */            if (i == -1) {
/* 432 */               arrayListI0000O = I0000O(lilli00o.I00000oIO((Bitmap) OIOiOlIO01.I00O0o1oo(ioOlilli0ol)), lo1oiiio, 2);
                    } else if (i == 17) {
/* 416 */               arrayListI0000O = I0000O((ByteBuffer) OIOiOlIO01.I00O0o1oo(ioOlilli0ol), lo1oiiio, 2);
                    } else if (i == 35) {
/* 96 */                Image.Plane[] planes = ((Image) OIOiOlIO01.I00O0o1oo(ioOlilli0ol)).getPlanes();
/* 103 */               ByteBuffer buffer = planes[0].getBuffer();
/* 110 */               ByteBuffer buffer2 = planes[1].getBuffer();
/* 116 */               ByteBuffer buffer3 = planes[2].getBuffer();
/* 120 */               iolIo0O01 iolio0o01I000oI1ioi = l0IIOo.I000oI1ioi();
/* 124 */               int i2 = lo1oiiio.I00iiI;
/* 126 */               iolio0o01I000oI1ioi.I0000O();
/* 133 */               l0IIOo.I00100l0((l0IIOo) iolio0o01I000oI1ioi.I00iiI, i2);
/* 136 */               int i3 = lo1oiiio.I00iiO;
/* 138 */               iolio0o01I000oI1ioi.I0000O();
/* 145 */               l0IIOo.I0010I0i((l0IIOo) iolio0o01I000oI1ioi.I00iiI, i3);
/* 150 */               int iZzf = zzf(lo1oiiio.I00iio);
/* 154 */               iolio0o01I000oI1ioi.I0000O();
/* 161 */               l0IIOo.I00111O((l0IIOo) iolio0o01I000oI1ioi.I00iiI, iZzf);
/* 164 */               long j = lo1oiiio.I00ilI0I1;
/* 170 */               if (j > 0) {
/* 175 */                   iolio0o01I000oI1ioi.I0000O();
/* 182 */                   l0IIOo.I00100o1O0lo((l0IIOo) iolio0o01I000oI1ioi.I00iiI, j * 1000);
                        }
/* 191 */               l0IIOo l0iioo = (l0IIOo) iolio0o01I000oI1ioi.I00000oIO();
/* 197 */               if (buffer.isDirect()) {
/* 241 */                   o00i0iilo0I0000Il00O = this.I000OiO.I0000oI00(this.I000lI, buffer, buffer2, buffer3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), l0iioo);
                        } else if (buffer.hasArray() && buffer.arrayOffset() == 0) {
/* 312 */                   o00i0iilo0I0000Il00O = this.I000OiO.I0000Il00O(this.I000lI, buffer.array(), buffer2.array(), buffer3.array(), planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), l0iioo);
                        } else {
/* 321 */                   byte[] bArr = new byte[buffer.remaining()];
/* 323 */                   buffer.get(bArr);
/* 330 */                   byte[] bArr2 = new byte[buffer2.remaining()];
/* 332 */                   buffer.get(bArr);
/* 339 */                   byte[] bArr3 = new byte[buffer3.remaining()];
/* 341 */                   buffer.get(bArr);
/* 391 */                   o00i0iilo0I0000Il00O = this.I000OiO.I0000Il00O(this.I000lI, bArr, bArr2, bArr3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), l0iioo);
                        }
/* 405 */               arrayListI0000O = o00i0iilo0I0000Il00O != null ? I00000oOI(o00i0iilo0I0000Il00O) : new ArrayList();
                    } else {
/* 29 */                if (i != 842094169) {
/* 65 */                    String str = "Unsupported image format " + i + " at API " + Build.VERSION.SDK_INT;
/* 71 */                    Log.e("FaceDetector", str);
/* 81 */                    this.I000l1.I001IIilI0O(1, jCurrentTimeMillis, System.currentTimeMillis());
/* 89 */                    throw new RemoteException(str);
                        }
/* 38 */                arrayListI0000O = I0000O((ByteBuffer) OIOiOlIO01.I00O0o1oo(ioOlilli0ol), lo1oiiio, 7);
                    }
/* 42 */            ArrayList arrayList = arrayListI0000O;
/* 438 */           i0O1lIi1O0IO i0o1lii1o0io = this.I000iOII;
/* 440 */           loI1oilO loi1oilo = this.I000O01llI0;
/* 442 */           SystemClock.elapsedRealtime();
/* 445 */           i0o1lii1o0io.getClass();
/* 456 */           ((Oi1ol0llI) i0o1lii1o0io.I00iiI).I00100l0(loi1oilo, lOl1ol1OOO.OPTIONAL_MODULE_FACE_DETECTION_INFERENCE, lOl1IOlo.NO_ERROR);
/* 466 */           this.I000l1.I001IIilI0O(0, jCurrentTimeMillis, System.currentTimeMillis());
/* 900 */           return arrayList;
                }

                @Override
                public final void zzc() {
/* 15 */            this.I000lI = this.I000OiO.I00000oIO(this.I000OOo1O, this.I000II.getAssets());
/* 17 */            i0O1lIi1O0IO i0o1lii1o0io = this.I000iOII;
/* 19 */            loI1oilO loi1oilo = this.I000O01llI0;
/* 21 */            i0o1lii1o0io.getClass();
/* 32 */            ((Oi1ol0llI) i0o1lii1o0io.I00iiI).I00100l0(loi1oilo, lOl1ol1OOO.OPTIONAL_MODULE_FACE_DETECTION_INIT, lOl1IOlo.NO_ERROR);
                }

                @Override
                public final void zzd() {
/* 1 */             long j = this.I000lI;
/* 7 */             if (j > 0) {
/* 11 */                this.I000OiO.I0001Ioi1lo(j);
/* 16 */                this.I000lI = -1L;
                    }
                }
            }
