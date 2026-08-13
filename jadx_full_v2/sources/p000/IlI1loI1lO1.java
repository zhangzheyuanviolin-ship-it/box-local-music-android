            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.PointF;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import com.google.ai.edge.gallery.data.local.BoxChatDatabase;
            import com.google.ai.edge.gallery.data.local.dao.FaceDao;
            import com.google.ai.edge.gallery.data.local.entities.FaceRecord;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.face.Face;
            import com.google.mlkit.vision.face.FaceDetector;
            import com.google.mlkit.vision.face.FaceLandmark;
            import com.google.mlkit.vision.facemesh.FaceMeshDetector;
            import java.io.Serializable;
            import java.nio.ByteBuffer;
            import java.nio.FloatBuffer;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LIlI1loI1lO1;", "LOooioIIoi0O;", "<init>", "()V", "ilO1io0", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class IlI1loI1lO1 extends OooioIIoi0O {
                public final OlO0OIIl1 I00000oOI;
                public final OOli1O I0000Il00O;
                public final OllO00oiil I0000O;
                public final OllO00oiil I0000oI00;
                public ArrayList I0001Ioi1lo;

                public IlI1loI1lO1() {
/* 6 */             IlI0olO00l0l ilI0olO00l0l = IlI0olO00l0l.I00iOIl;
/* 13 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 24 */            OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(new IlI10IO(ilI0olO00l0l, false, null, null, il01100l, il01100l, il01100l, 0.55f, true, true, false));
/* 28 */            this.I00000oOI = olO0OIIl1I00000oIO;
/* 34 */            this.I0000Il00O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
/* 48 */            this.I0000O = new OllO00oiil(new IOlIlo1(23));
/* 62 */            this.I0000oI00 = new OllO00oiil(new IOlIlo1(24));
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Bitmap I0000oI00(Bitmap bitmap, Face face) {
                    Bitmap bitmap2;
                    float f;
                    Bitmap bitmapCreateBitmap;
                    Bitmap bitmapCreateBitmap2;
                    PointF position;
                    FaceLandmark landmark;
                    PointF position2;
                    FaceLandmark landmark2;
                    PointF position3;
                    FaceLandmark landmark3;
                    PointF position4;
/* 4 */             FaceLandmark landmark4 = face.getLandmark(4);
/* 14 */            if (landmark4 != null && (position = landmark4.getPosition()) != null && (landmark = face.getLandmark(10)) != null && (position2 = landmark.getPosition()) != null && (landmark2 = face.getLandmark(5)) != null && (position3 = landmark2.getPosition()) != null && (landmark3 = face.getLandmark(11)) != null && (position4 = landmark3.getPosition()) != null) {
/* 79 */                f = 2.0f;
/* 94 */                float[] fArr = {position.x, position.y, position2.x, position2.y, (position3.x + position4.x) / 2.0f, (position3.y + position4.y) / 2.0f};
/* 116 */               Matrix matrix = new Matrix();
/* 135 */               if (matrix.setPolyToPoly(fArr, 0, new float[]{38.2946f, 51.6963f, 73.5318f, 51.5014f, 56.14f, 92.28f}, 0, 3)) {
                            try {
/* 145 */                       bitmapCreateBitmap = Bitmap.createBitmap(112, 112, Bitmap.Config.ARGB_8888);
/* 159 */                       bitmap2 = bitmap;
                                try {
/* 161 */                           new Canvas(bitmapCreateBitmap).drawBitmap(bitmap2, matrix, new Paint(2));
                                } catch (Throwable unused) {
                                }
                            } catch (Throwable unused2) {
                            }
                        } else {
/* 137 */                   bitmap2 = bitmap;
                        }
/* 164 */               if (bitmapCreateBitmap == null) {
/* 166 */                   return bitmapCreateBitmap;
                        }
/* 167 */               Rect boundingBox = face.getBoundingBox();
/* 171 */               float fExactCenterX = boundingBox.exactCenterX();
/* 175 */               float fExactCenterY = boundingBox.exactCenterY();
/* 195 */               float fMax = Math.max(boundingBox.width(), boundingBox.height()) * 1.15f;
/* 196 */               FaceLandmark landmark5 = face.getLandmark(4);
/* 207 */               PointF position5 = landmark5 != null ? landmark5.getPosition() : null;
/* 208 */               FaceLandmark landmark6 = face.getLandmark(10);
/* 219 */               PointF position6 = landmark6 != null ? landmark6.getPosition() : null;
/* 220 */               if (position5 == null || position6 == null) {
/* 319 */                   bitmapCreateBitmap2 = bitmap;
                        } else {
/* 244 */                   float degrees = (float) Math.toDegrees(Math.atan2(position6.y - position5.y, position6.x - position5.x));
/* 247 */                   Matrix matrix2 = new Matrix();
/* 251 */                   matrix2.postRotate(-degrees, fExactCenterX, fExactCenterY);
/* 267 */                   RectF rectF = new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight());
/* 270 */                   matrix2.mapRect(rectF);
/* 279 */                   matrix2.postTranslate(-rectF.left, -rectF.top);
                            try {
/* 300 */                       bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix2, true);
/* 304 */                       float[] fArr2 = {fExactCenterX, fExactCenterY};
/* 310 */                       matrix2.mapPoints(fArr2);
/* 313 */                       float f2 = fArr2[0];
/* 315 */                       fExactCenterY = fArr2[1];
/* 317 */                       fExactCenterX = f2;
                            } catch (Throwable unused3) {
                            }
                        }
/* 321 */               int i = (int) fMax;
/* 330 */               int iMin = Math.min(bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight());
/* 334 */               if (i > iMin) {
/* 336 */                   i = iMin;
                        }
/* 337 */               int i2 = i >= 1 ? i : 1;
/* 342 */               float f3 = i2 / f;
                        try {
/* 366 */                   return Bitmap.createBitmap(bitmapCreateBitmap2, lIiioliIlo.I0000Il00O((int) (fExactCenterX - f3), 0, bitmapCreateBitmap2.getWidth() - i2), lIiioliIlo.I0000Il00O((int) (fExactCenterY - f3), 0, bitmapCreateBitmap2.getHeight() - i2), i2, i2);
                        } catch (Throwable unused4) {
/* 13 */                    return null;
                        }
                    }
/* 64 */            bitmap2 = bitmap;
/* 66 */            f = 2.0f;
/* 139 */           bitmapCreateBitmap = null;
/* 164 */           if (bitmapCreateBitmap == null) {
                    }
                }

                public static OIoi0IIoi I0001Ioi1lo(float[] fArr, List list, float f) {
/* 1 */             Iterator it = list.iterator();
/* 6 */             float f2 = -1.0f;
/* 8 */             String name = null;
/* 13 */            while (it.hasNext()) {
/* 19 */                FaceRecord faceRecord = (FaceRecord) it.next();
/* 21 */                Il11ooO1o il11ooO1o = IlI00iOi1.I00000oOI;
/* 31 */                FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.wrap(faceRecord.getEmbedding()).asFloatBuffer();
/* 39 */                float[] fArr2 = new float[floatBufferAsFloatBuffer.remaining()];
/* 41 */                floatBufferAsFloatBuffer.get(fArr2);
/* 44 */                float fI00000oIO = ilO11lo1O.I00000oIO(fArr, fArr2);
/* 50 */                if (fI00000oIO > f2) {
/* 52 */                    name = faceRecord.getName();
/* 56 */                    f2 = fI00000oIO;
                        }
                    }
/* 69 */            return new OIoi0IIoi(f2 >= f ? name : null, Float.valueOf(f2));
                }

                @Override
                public final void I0000O() {
                    try {
/* 9 */                 ((FaceDetector) this.I0000O.getValue()).close();
                    } catch (Throwable unused) {
                    }
                    try {
/* 20 */                ((FaceMeshDetector) this.I0000oI00.getValue()).close();
                    } catch (Throwable unused2) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Serializable I000II(Bitmap bitmap, IOoilo iOoilo) throws Throwable {
                    IlI1O1OIoi ilI1O1OIoi;
/* 3 */             if (iOoilo instanceof IlI1O1OIoi) {
/* 6 */                 ilI1O1OIoi = (IlI1O1OIoi) iOoilo;
/* 8 */                 int i = ilI1O1OIoi.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ilI1O1OIoi.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ilI1O1OIoi = new IlI1O1OIoi(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00000oIO = ilI1O1OIoi.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ilI1O1OIoi.I00iio;
/* 32 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 65 */                OloIIoII1oo oloIIoII1ooProcess = ((FaceDetector) this.I0000O.getValue()).process(InputImage.fromBitmap(bitmap, 0));
/* 69 */                ilI1O1OIoi.I00iOIl = bitmap;
/* 71 */                ilI1O1OIoi.I00iio = 1;
/* 73 */                objI00000oIO = lOio0oO.I00000oIO(oloIIoII1ooProcess, ilI1O1OIoi);
/* 77 */                if (objI00000oIO == ii0111o) {
/* 79 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                bitmap = ilI1O1OIoi.I00iOIl;
/* 38 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
                    }
/* 86 */            ArrayList arrayList = new ArrayList();
/* 89 */            Iterator it = ((List) objI00000oIO).iterator();
/* 97 */            while (it.hasNext()) {
/* 105 */               Bitmap bitmapI0000oI00 = I0000oI00(bitmap, (Face) it.next());
/* 109 */               if (bitmapI0000oI00 != null) {
/* 111 */                   arrayList.add(bitmapI0000oI00);
                        }
                    }
/* 332 */           return arrayList;
                }

                public final void I000O01llI0(String str) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 28 */            olO0OIIl1.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl1.getValue(), null, false, str, null, null, null, null, 0.0f, false, false, false, 2041));
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000OOo1O(Context context, IOoilo iOoilo) throws Throwable {
                    IlI1Oi ilI1Oi;
/* 3 */             if (iOoilo instanceof IlI1Oi) {
/* 6 */                 ilI1Oi = (IlI1Oi) iOoilo;
/* 8 */                 int i = ilI1Oi.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ilI1Oi.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ilI1Oi = new IlI1Oi(this, iOoilo);
                        }
                    }
/* 25 */            Object all = ilI1Oi.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ilI1Oi.I00iiO;
/* 32 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(all);
/* 50 */                ArrayList arrayList = this.I0001Ioi1lo;
/* 52 */                if (arrayList != null) {
/* 54 */                    return arrayList;
                        }
/* 61 */                FaceDao faceDaoI001IO000 = BoxChatDatabase.I000l1.I000OiO(context).I001IO000();
/* 65 */                ilI1Oi.I00iiO = 1;
/* 67 */                all = faceDaoI001IO000.getAll(ilI1Oi);
/* 71 */                if (all == ii0111o) {
/* 73 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(all);
                    }
/* 74 */            Iterable<FaceRecord> iterable = (Iterable) all;
/* 84 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(iterable, 10));
/* 95 */            for (FaceRecord faceRecord : iterable) {
/* 103 */               String name = faceRecord.getName();
/* 115 */               FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.wrap(faceRecord.getEmbedding()).asFloatBuffer();
/* 123 */               float[] fArr = new float[floatBufferAsFloatBuffer.remaining()];
/* 125 */               floatBufferAsFloatBuffer.get(fArr);
/* 133 */               arrayList2.add(new OIoi0IIoi(name, fArr));
                    }
/* 137 */           this.I0001Ioi1lo = arrayList2;
/* 332 */           return arrayList2;
                }

                public final void I000OiO(Context context) {
/* 2 */             this.I0001Ioi1lo = null;
/* 4 */             IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(this);
/* 8 */             IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 19 */            iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new IlI1IiIo(this, context, null, 1), 2);
                }

                public final void I000iOII(Context context, OO0l00Ii10 oO0l00Ii10, String str) {
/* 5 */             String string = OlOoOIi0o.I00OIo(str).toString();
/* 13 */            if (string.length() == 0) {
/* 17 */                I000O01llI0("Enter a name");
/* 20 */                return;
                    }
/* 21 */            IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(this);
/* 25 */            IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 42 */            iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new I0iOI0o1i(this, context, string, oO0l00Ii10, (IOoil1iiIilo) null, 19), 2);
                }

                public final void I000l1(Context context, boolean z) {
/* 6 */             Oi010OO0.I001lllioOl(context, "facerec_prefs", 0, "frontCamera", z);
/* 9 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 36 */            olO0OIIl1.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl1.getValue(), null, false, null, null, null, null, null, 0.0f, z, false, false, 1791));
                }
            }
