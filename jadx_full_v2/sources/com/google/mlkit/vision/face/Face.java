            package com.google.mlkit.vision.face;

            import android.graphics.Matrix;
            import android.graphics.PointF;
            import android.graphics.Rect;
            import android.util.SparseArray;
            import com.google.mlkit.vision.common.internal.CommonConvertUtils;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import p000.Oi010OO0;
            import p000.il11l0O1;
            import p000.io0oIoliO1;
            import p000.l1IllOOOo1;
            import p000.lOi1oIlo0i;
            import p000.liOOl0OlOol0;
            import p000.lii0IOlOO1;
            import p000.lil0ii1OIO0;
            import p000.ll1O1oOi1Oil;
            
/* 192 */   public class Face {
                private final Rect zza;
                private int zzb;
                private final float zzc;
                private final float zzd;
                private final float zze;
                private final float zzf;
                private final float zzg;
                private final float zzh;
                private final SparseArray zzi = new SparseArray();
                private final SparseArray zzj = new SparseArray();

                public Face(io0oIoliO1 io0oiolio1, Matrix matrix) {
/* 20 */            float f = io0oiolio1.I00iiO;
/* 26 */            float f2 = io0oiolio1.I00ilI0I1 / 2.0f;
/* 27 */            float f3 = io0oiolio1.I00iio;
/* 31 */            float f4 = io0oiolio1.I00ilO0 / 2.0f;
/* 42 */            Rect rect = new Rect((int) (f - f2), (int) (f3 - f4), (int) (f + f2), (int) (f3 + f4));
/* 45 */            this.zza = rect;
/* 47 */            if (matrix != null) {
/* 49 */                CommonConvertUtils.transformRect(rect, matrix);
                    }
/* 54 */            this.zzb = io0oiolio1.I00iiI;
/* 61 */            for (lOi1oIlo0i loi1oilo0i : io0oiolio1.I00l0OO0IO) {
/* 71 */                if (zze(loi1oilo0i.I00iio)) {
/* 79 */                    PointF pointF = new PointF(loi1oilo0i.I00iiI, loi1oilo0i.I00iiO);
/* 82 */                    if (matrix != null) {
/* 84 */                        CommonConvertUtils.transformPointF(pointF, matrix);
                            }
/* 87 */                    SparseArray sparseArray = this.zzi;
/* 89 */                    int i = loi1oilo0i.I00iio;
/* 96 */                    sparseArray.put(i, new FaceLandmark(i, pointF));
                        }
                    }
/* 105 */           for (il11l0O1 il11l0o1 : io0oiolio1.I00lll10) {
/* 109 */               int i2 = il11l0o1.I00iiI;
/* 115 */               if (zzd(i2)) {
/* 117 */                   PointF[] pointFArr = il11l0o1.I00iOIl;
/* 119 */                   pointFArr.getClass();
/* 130 */                   long length = pointFArr.length + 5 + (r5 / 10);
/* 145 */                   ArrayList arrayList = new ArrayList(length > 2147483647L ? Integer.MAX_VALUE : (int) length);
/* 148 */                   Collections.addAll(arrayList, pointFArr);
/* 151 */                   if (matrix != null) {
/* 153 */                       CommonConvertUtils.transformPointList(arrayList, matrix);
                            }
/* 163 */                   this.zzj.put(i2, new FaceContour(i2, arrayList));
                        }
                    }
/* 171 */           this.zzf = io0oiolio1.I00l0I0l0lO1;
/* 175 */           this.zzg = io0oiolio1.I00io1l;
/* 179 */           this.zzh = io0oiolio1.I00ioIO;
/* 183 */           this.zze = io0oiolio1.I00lli11;
/* 187 */           this.zzd = io0oiolio1.I00li1OI;
/* 191 */           this.zzc = io0oiolio1.I00ll1;
                }

                private static boolean zzd(int i) {
                    return i <= 15 && i > 0;
                }

                private static boolean zze(int i) {
                    return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
                }

                public List<FaceContour> getAllContours() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             int size = this.zzj.size();
/* 13 */            for (int i = 0; i < size; i++) {
/* 23 */                arrayList.add((FaceContour) this.zzj.valueAt(i));
                    }
/* 55 */            return arrayList;
                }

                public List<FaceLandmark> getAllLandmarks() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             int size = this.zzi.size();
/* 13 */            for (int i = 0; i < size; i++) {
/* 23 */                arrayList.add((FaceLandmark) this.zzi.valueAt(i));
                    }
/* 55 */            return arrayList;
                }

                public Rect getBoundingBox() {
/* 1 */             return this.zza;
                }

                public FaceContour getContour(int i) {
/* 7 */             return (FaceContour) this.zzj.get(i);
                }

                public float getHeadEulerAngleX() {
/* 1 */             return this.zzf;
                }

                public float getHeadEulerAngleY() {
/* 1 */             return this.zzg;
                }

                public float getHeadEulerAngleZ() {
/* 1 */             return this.zzh;
                }

                public FaceLandmark getLandmark(int i) {
/* 7 */             return (FaceLandmark) this.zzi.get(i);
                }

                public Float getLeftEyeOpenProbability() {
/* 1 */             float f = this.zze;
/* 6 */             if (f < 0.0f || f > 1.0f) {
/* 22 */                return null;
                    }
/* 17 */            return Float.valueOf(this.zzd);
                }

                public Float getRightEyeOpenProbability() {
/* 1 */             float f = this.zzc;
/* 6 */             if (f < 0.0f || f > 1.0f) {
/* 20 */                return null;
                    }
/* 15 */            return Float.valueOf(f);
                }

                public Float getSmilingProbability() {
/* 1 */             float f = this.zze;
/* 6 */             if (f < 0.0f || f > 1.0f) {
/* 20 */                return null;
                    }
/* 15 */            return Float.valueOf(f);
                }

                public Integer getTrackingId() {
/* 1 */             int i = this.zzb;
/* 4 */             if (i == -1) {
/* 6 */                 return null;
                    }
/* 8 */             return Integer.valueOf(i);
                }

                public String toString() {
/* 3 */             l1IllOOOo1 l1illoooo1I00000oIO = ll1O1oOi1Oil.I00000oIO("Face");
/* 11 */            l1illoooo1I00000oIO.I0001Ioi1lo("boundingBox", this.zza);
/* 18 */            l1illoooo1I00000oIO.I0000oI00(this.zzb, "trackingId");
/* 25 */            l1illoooo1I00000oIO.I00000oIO("rightEyeOpenProbability", this.zzc);
/* 32 */            l1illoooo1I00000oIO.I00000oIO("leftEyeOpenProbability", this.zzd);
/* 39 */            l1illoooo1I00000oIO.I00000oIO("smileProbability", this.zze);
/* 46 */            l1illoooo1I00000oIO.I00000oIO("eulerX", this.zzf);
/* 53 */            l1illoooo1I00000oIO.I00000oIO("eulerY", this.zzg);
/* 60 */            l1illoooo1I00000oIO.I00000oIO("eulerZ", this.zzh);
/* 65 */            l1IllOOOo1 l1illoooo1I00000oIO2 = ll1O1oOi1Oil.I00000oIO("Landmarks");
/* 72 */            for (int i = 0; i <= 11; i++) {
/* 78 */                if (zze(i)) {
/* 90 */                    l1illoooo1I00000oIO2.I0001Ioi1lo(Oi010OO0.I000oI1ioi(i, "landmark_"), getLandmark(i));
                        }
                    }
/* 102 */           l1illoooo1I00000oIO.I0001Ioi1lo("landmarks", l1illoooo1I00000oIO2.toString());
/* 107 */           l1IllOOOo1 l1illoooo1I00000oIO3 = ll1O1oOi1Oil.I00000oIO("Contours");
/* 114 */           for (int i2 = 1; i2 <= 15; i2++) {
/* 126 */               l1illoooo1I00000oIO3.I0001Ioi1lo(Oi010OO0.I000oI1ioi(i2, "Contour_"), getContour(i2));
                    }
/* 138 */           l1illoooo1I00000oIO.I0001Ioi1lo("contours", l1illoooo1I00000oIO3.toString());
/* 141 */           return l1illoooo1I00000oIO.toString();
                }

                public final SparseArray zza() {
/* 1 */             return this.zzj;
                }

                public final void zzb(SparseArray sparseArray) {
/* 3 */             this.zzj.clear();
/* 11 */            for (int i = 0; i < sparseArray.size(); i++) {
/* 25 */                this.zzj.put(sparseArray.keyAt(i), (FaceContour) sparseArray.valueAt(i));
                    }
                }

                public final void zzc(int i) {
/* 2 */             this.zzb = -1;
                }

/* 193 */       public Face(lii0IOlOO1 lii0ioloo1, Matrix matrix) {
/* 196 */           Rect rect = lii0ioloo1.I00iiI;
/* 197 */           this.zza = rect;
                    if (matrix != null) {
/* 198 */               CommonConvertUtils.transformRect(rect, matrix);
                    }
/* 200 */           this.zzb = lii0ioloo1.I00iOIl;
                    for (lil0ii1OIO0 lil0ii1oio0 : lii0ioloo1.I00l0OO0IO) {
/* 204 */               if (zze(lil0ii1oio0.I00iOIl)) {
/* 205 */                   PointF pointF = lil0ii1oio0.I00iiI;
                            if (matrix != null) {
/* 206 */                       CommonConvertUtils.transformPointF(pointF, matrix);
                            }
                            SparseArray sparseArray = this.zzi;
/* 207 */                   int i = lil0ii1oio0.I00iOIl;
/* 208 */                   sparseArray.put(i, new FaceLandmark(i, pointF));
                        }
                    }
                    for (liOOl0OlOol0 liool0olool0 : lii0ioloo1.I00li1OI) {
/* 211 */               int i2 = liool0olool0.I00iOIl;
/* 212 */               if (zzd(i2)) {
/* 213 */                   ArrayList arrayList = liool0olool0.I00iiI;
/* 214 */                   arrayList.getClass();
/* 216 */                   ArrayList arrayList2 = new ArrayList(arrayList);
                            if (matrix != null) {
/* 217 */                       CommonConvertUtils.transformPointList(arrayList2, matrix);
                            }
/* 218 */                   this.zzj.put(i2, new FaceContour(i2, arrayList2));
                        }
                    }
/* 220 */           this.zzf = lii0ioloo1.I00ilI0I1;
/* 222 */           this.zzg = lii0ioloo1.I00iio;
/* 224 */           this.zzh = -lii0ioloo1.I00iiO;
/* 226 */           this.zze = lii0ioloo1.I00ioIO;
/* 228 */           this.zzd = lii0ioloo1.I00ilO0;
/* 230 */           this.zzc = lii0ioloo1.I00io1l;
                }
            }
