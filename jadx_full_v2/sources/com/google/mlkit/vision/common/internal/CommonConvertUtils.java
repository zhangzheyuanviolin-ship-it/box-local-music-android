            package com.google.mlkit.vision.common.internal;

            import android.graphics.Matrix;
            import android.graphics.Point;
            import android.graphics.PointF;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.os.SystemClock;
            import com.google.mlkit.vision.common.InputImage;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import p000.I000II;
            import p000.O1o00iolI11;
            import p000.Oi010OO0;
            import p000.l1Iii1;
            import p000.lOI00Ii101I0;
            import p000.lOO1IIO11il1;
            import p000.lOOIo0IlO;
            
            public class CommonConvertUtils {
                public static InputImage convertMlImagetoInputImage(O1o00iolI11 o1o00iolI11) {
/* 49 */            throw null;
                }

                public static int convertToAndroidImageFormat(int i) {
/* 1 */             int i2 = 17;
/* 3 */             if (i != 17) {
/* 5 */                 i2 = 35;
/* 7 */                 if (i != 35) {
/* 9 */                     i2 = InputImage.IMAGE_FORMAT_YV12;
/* 12 */                    if (i != 842094169) {
/* 14 */                        return 0;
                            }
                        }
                    }
/* 49 */            return i2;
                }

                public static int convertToMVRotation(int i) {
/* 1 */             if (i == 0) {
/* 32 */                return 0;
                    }
/* 5 */             if (i == 90) {
/* 30 */                return 1;
                    }
/* 9 */             if (i == 180) {
/* 28 */                return 2;
                    }
/* 13 */            if (i == 270) {
/* 15 */                return 3;
                    }
/* 23 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Invalid rotation: "));
/* 26 */            return 0;
                }

                public static void transformPointArray(Point[] pointArr, Matrix matrix) {
/* 1 */             int length = pointArr.length;
/* 3 */             float[] fArr = new float[length + length];
/* 8 */             for (int i = 0; i < pointArr.length; i++) {
/* 10 */                Point point = pointArr[i];
/* 15 */                int i2 = i + i;
/* 17 */                fArr[i2] = point.x;
/* 24 */                fArr[i2 + 1] = point.y;
                    }
/* 29 */            matrix.mapPoints(fArr);
/* 33 */            for (int i3 = 0; i3 < pointArr.length; i3++) {
/* 37 */                int i4 = i3 + i3;
/* 47 */                pointArr[i3].set((int) fArr[i4], (int) fArr[i4 + 1]);
                    }
                }

                public static void transformPointF(PointF pointF, Matrix matrix) {
/* 6 */             float[] fArr = {pointF.x, pointF.y};
/* 14 */            matrix.mapPoints(fArr);
/* 21 */            pointF.set(fArr[0], fArr[1]);
                }

                public static void transformPointList(List<PointF> list, Matrix matrix) {
/* 1 */             int size = list.size();
/* 6 */             float[] fArr = new float[size + size];
/* 14 */            for (int i = 0; i < list.size(); i++) {
/* 24 */                int i2 = i + i;
/* 26 */                fArr[i2] = list.get(i).x;
/* 38 */                fArr[i2 + 1] = list.get(i).y;
                    }
/* 43 */            matrix.mapPoints(fArr);
/* 50 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 58 */                int i4 = i3 + i3;
/* 66 */                list.get(i3).set(fArr[i4], fArr[i4 + 1]);
                    }
                }

                public static void transformRect(Rect rect, Matrix matrix) {
/* 3 */             RectF rectF = new RectF(rect);
/* 6 */             matrix.mapRect(rectF);
/* 21 */            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                }

                private static void zza(int i, int i2, long j, int i3, int i4, int i5, int i6) {
/* 1 */             lOI00Ii101I0 loi00ii101i0I00000oIO = lOO1IIO11il1.I00000oIO();
/* 9 */             long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
/* 12 */            lOOIo0IlO looio0ilo = new lOOIo0IlO();
/* 15 */            looio0ilo.I00000oIO = i;
/* 17 */            looio0ilo.I00000oOI = i2;
/* 19 */            looio0ilo.I0000Il00O = i5;
/* 21 */            looio0ilo.I0000O = i3;
/* 23 */            looio0ilo.I0000oI00 = i4;
/* 25 */            looio0ilo.I0001Ioi1lo = jElapsedRealtime;
/* 27 */            looio0ilo.I000II = i6;
/* 29 */            VarHandle.storeStoreFence();
/* 34 */            loi00ii101i0I00000oIO.I00000oIO(looio0ilo, l1Iii1.ODML_IMAGE);
                }
            }
