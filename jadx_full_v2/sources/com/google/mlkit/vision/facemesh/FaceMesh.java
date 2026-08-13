            package com.google.mlkit.vision.facemesh;

            import android.graphics.Rect;
            import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
            import com.google.mlkit.vision.common.PointF3D;
            import com.google.mlkit.vision.common.Triangle;
            import com.google.mlkit.vision.mediapipe.facemesh.FaceMeshListHolder;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.I00Ol00;
            import p000.iOOii1Ol0Oli;
            import p000.iOio11oiIi0I;
            import p000.iOl1loOO11o;
            import p000.iOlloIll11;
            import p000.iiIiIlIo0;
            import p000.iiO111IOo;
            import p000.liill1Iil1;
            import p000.lilIoil;
            
            public class FaceMesh {
                public static final int FACE_OVAL = 1;
                public static final int LEFT_EYE = 6;
                public static final int LEFT_EYEBROW_BOTTOM = 3;
                public static final int LEFT_EYEBROW_TOP = 2;
                public static final int LOWER_LIP_BOTTOM = 11;
                public static final int LOWER_LIP_TOP = 10;
                public static final int NOSE_BRIDGE = 12;
                public static final int RIGHT_EYE = 7;
                public static final int RIGHT_EYEBROW_BOTTOM = 5;
                public static final int RIGHT_EYEBROW_TOP = 4;
                public static final int UPPER_LIP_BOTTOM = 9;
                public static final int UPPER_LIP_TOP = 8;
                private static final iOlloIll11 zza;
                private final Rect zzb;
                private final iOio11oiIi0I zzc;
                private final iOio11oiIi0I zzd;
                private final iOlloIll11 zze;

                @Retention(RetentionPolicy.CLASS)
                public @interface ContourType {
                }

                static {
/* 6 */             I00Ol00 i00Ol00 = new I00Ol00((char) 0, 16);
/* 238 */           i00Ol00.I001i1lo1io(1, iOio11oiIi0I.I001lIiIIo1O(10, 338, 297, 332, 284, 251, 389, 356, 454, 323, 361, 288, 397, 365, 379, 378, 400, 377, 152, 148, 176, 149, 150, 136, 172, 58, 132, 93, 234, 127, 162, 21, 54, 103, 67, 109));
/* 276 */           Object[] objArr = {70, 63, 105, 66, 107};
/* 281 */           lilIoil.I00000oIO(5, objArr);
/* 288 */           i00Ol00.I001i1lo1io(2, iOio11oiIi0I.I001iOo1i0O(5, objArr));
/* 326 */           Object[] objArr2 = {46, 53, 52, 65, 55};
/* 330 */           lilIoil.I00000oIO(5, objArr2);
/* 337 */           i00Ol00.I001i1lo1io(3, iOio11oiIi0I.I001iOo1i0O(5, objArr2));
/* 375 */           Object[] objArr3 = {300, 293, 334, 296, 336};
/* 379 */           lilIoil.I00000oIO(5, objArr3);
/* 386 */           i00Ol00.I001i1lo1io(4, iOio11oiIi0I.I001iOo1i0O(5, objArr3));
/* 423 */           Object[] objArr4 = {276, 283, 282, 295, 285};
/* 427 */           lilIoil.I00000oIO(5, objArr4);
/* 434 */           i00Ol00.I001i1lo1io(5, iOio11oiIi0I.I001iOo1i0O(5, objArr4));
/* 547 */           i00Ol00.I001i1lo1io(6, iOio11oiIi0I.I001lIiIIo1O(33, 246, 161, 160, 159, 158, 157, 173, 133, 155, 154, 153, 145, 144, 163, 7));
/* 654 */           i00Ol00.I001i1lo1io(7, iOio11oiIi0I.I001lIiIIo1O(362, 398, 384, 385, 386, 387, 388, 466, 263, 249, 390, 373, 374, 380, 381, 382));
/* 731 */           Object[] objArr5 = {61, Integer.valueOf(ModuleDescriptor.MODULE_VERSION), 40, 39, 37, 0, 267, 269, 270, 409, 291};
/* 737 */           lilIoil.I00000oIO(11, objArr5);
/* 744 */           i00Ol00.I001i1lo1io(8, iOio11oiIi0I.I001iOo1i0O(11, objArr5));
/* 839 */           i00Ol00.I001i1lo1io(9, iOio11oiIi0I.I001lIiIIo1O(62, 78, 191, 80, 81, 82, 13, 312, 311, 310, 415, 308, 292));
/* 904 */           i00Ol00.I001i1lo1io(10, iOio11oiIi0I.I001lIiIIo1O(62, 78, 95, 88, 178, 87, 14, 317, 402, 318, 324, 308, 292));
/* 965 */           Object[] objArr6 = {61, 146, 91, 181, 84, 17, 314, 405, 321, 375, 291};
/* 969 */           lilIoil.I00000oIO(11, objArr6);
/* 976 */           i00Ol00.I001i1lo1io(11, iOio11oiIi0I.I001iOo1i0O(11, objArr6));
/* 1004 */          Object[] objArr7 = {168, 6, 197, 195, 5, 4, 1};
/* 1008 */          lilIoil.I00000oIO(7, objArr7);
/* 1015 */          i00Ol00.I001i1lo1io(12, iOio11oiIi0I.I001iOo1i0O(7, objArr7));
/* 1020 */          iOl1loOO11o iol1looo11o = (iOl1loOO11o) i00Ol00.I0000O;
/* 1022 */          if (iol1looo11o != null) {
/* 2840 */              throw iol1looo11o.I00000oIO();
                    }
/* 1030 */          iiO111IOo iio111iooI00000oOI = iiO111IOo.I00000oOI(i00Ol00.I00000oOI, (Object[]) i00Ol00.I0000Il00O, i00Ol00);
/* 1036 */          iOl1loOO11o iol1looo11o2 = (iOl1loOO11o) i00Ol00.I0000O;
/* 1038 */          if (iol1looo11o2 != null) {
/* 1047 */              throw iol1looo11o2.I00000oIO();
                    }
/* 1040 */          zza = iio111iooI00000oOI;
                }

                public FaceMesh(FaceMeshListHolder.FaceMeshHolder faceMeshHolder) {
/* 8 */             this.zzb = faceMeshHolder.getBoundingBox();
/* 10 */            List<PointF3D> points = faceMeshHolder.getPoints();
/* 15 */            Object[] objArrCopyOf = new Object[4];
/* 18 */            int i = 0;
/* 19 */            int i2 = 0;
/* 24 */            while (i < points.size()) {
/* 34 */                FaceMeshPoint faceMeshPoint = new FaceMeshPoint(i, points.get(i));
/* 37 */                int i3 = i2 + 1;
/* 39 */                int length = objArrCopyOf.length;
/* 40 */                if (length < i3) {
/* 46 */                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, liill1Iil1.I00000oIO(length, i3));
                        }
/* 50 */                objArrCopyOf[i2] = faceMeshPoint;
/* 52 */                i++;
/* 54 */                i2 = i3;
                    }
/* 60 */            this.zzc = iOio11oiIi0I.I001iOo1i0O(i2, objArrCopyOf);
/* 62 */            Object[] objArrCopyOf2 = new Object[4];
/* 72 */            int i4 = 0;
/* 77 */            for (int[] iArr : faceMeshHolder.getTriangles()) {
/* 119 */               Triangle triangle = new Triangle((FaceMeshPoint) this.zzc.get(iArr[0]), (FaceMeshPoint) this.zzc.get(iArr[1]), (FaceMeshPoint) this.zzc.get(iArr[2]));
/* 122 */               int i5 = i4 + 1;
/* 124 */               int length2 = objArrCopyOf2.length;
/* 125 */               if (length2 < i5) {
/* 131 */                   objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, liill1Iil1.I00000oIO(length2, i5));
                        }
/* 135 */               objArrCopyOf2[i4] = triangle;
/* 137 */               i4 = i5;
                    }
/* 143 */           this.zzd = iOio11oiIi0I.I001iOo1i0O(i4, objArrCopyOf2);
/* 149 */           I00Ol00 i00Ol00 = new I00Ol00((char) 0, 16);
/* 158 */           if (!this.zzc.isEmpty()) {
/* 172 */               iOOii1Ol0Oli iooii1ol0oliListIterator = ((iiIiIlIo0) zza.entrySet()).I001i1O0Ol().listIterator(0);
/* 180 */               while (iooii1ol0oliListIterator.hasNext()) {
/* 186 */                   Map.Entry entry = (Map.Entry) iooii1ol0oliListIterator.next();
/* 192 */                   Integer num = (Integer) entry.getKey();
/* 194 */                   num.getClass();
/* 197 */                   Object[] objArrCopyOf3 = new Object[4];
/* 205 */                   Iterator it = ((List) entry.getValue()).iterator();
/* 209 */                   int i6 = 0;
/* 214 */                   while (it.hasNext()) {
/* 232 */                       FaceMeshPoint faceMeshPoint2 = (FaceMeshPoint) this.zzc.get(((Integer) it.next()).intValue());
/* 234 */                       faceMeshPoint2.getClass();
/* 237 */                       int i7 = i6 + 1;
/* 239 */                       int length3 = objArrCopyOf3.length;
/* 240 */                       if (length3 < i7) {
/* 246 */                           objArrCopyOf3 = Arrays.copyOf(objArrCopyOf3, liill1Iil1.I00000oIO(length3, i7));
                                }
/* 250 */                       objArrCopyOf3[i6] = faceMeshPoint2;
/* 252 */                       i6 = i7;
                            }
/* 258 */                   i00Ol00.I001i1lo1io(num, iOio11oiIi0I.I001iOo1i0O(i6, objArrCopyOf3));
                        }
                    }
/* 264 */           iOl1loOO11o iol1looo11o = (iOl1loOO11o) i00Ol00.I0000O;
/* 266 */           if (iol1looo11o != null) {
/* 966 */               throw iol1looo11o.I00000oIO();
                    }
/* 274 */           iiO111IOo iio111iooI00000oOI = iiO111IOo.I00000oOI(i00Ol00.I00000oOI, (Object[]) i00Ol00.I0000Il00O, i00Ol00);
/* 280 */           iOl1loOO11o iol1looo11o2 = (iOl1loOO11o) i00Ol00.I0000O;
/* 282 */           if (iol1looo11o2 != null) {
/* 291 */               throw iol1looo11o2.I00000oIO();
                    }
/* 284 */           this.zze = iio111iooI00000oOI;
                }

                public List<FaceMeshPoint> getAllPoints() {
/* 1 */             return this.zzc;
                }

                public List<Triangle<FaceMeshPoint>> getAllTriangles() {
/* 1 */             return this.zzd;
                }

                public Rect getBoundingBox() {
/* 1 */             return this.zzb;
                }

                public List<FaceMeshPoint> getPoints(int i) {
/* 11 */            List<FaceMeshPoint> list = (List) this.zze.get(Integer.valueOf(i));
                    return list != null ? list : new ArrayList();
                }
            }
