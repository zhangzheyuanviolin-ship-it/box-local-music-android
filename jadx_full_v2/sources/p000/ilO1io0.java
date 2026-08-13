            package p000;

            import com.google.mlkit.vision.common.PointF3D;
            import com.google.mlkit.vision.facemesh.FaceMeshPoint;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.List;
            
            public abstract class ilO1io0 {
                public static float[] I00000oIO(List list) {
                    float[] fArr;
                    float f;
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 8 */                 return new float[0];
                    }
/* 11 */            float[] fArr2 = new float[size];
/* 13 */            float[] fArr3 = new float[size];
/* 15 */            float f2 = Float.MAX_VALUE;
/* 18 */            float x = -3.4028235E38f;
/* 22 */            float x2 = Float.MAX_VALUE;
/* 23 */            for (int i2 = 0; i2 < size; i2++) {
/* 33 */                PointF3D position = ((FaceMeshPoint) list.get(i2)).getPosition();
/* 41 */                fArr2[i2] = position.getX();
/* 47 */                fArr3[i2] = position.getY();
/* 55 */                if (position.getX() < x2) {
/* 57 */                    x2 = position.getX();
                        }
/* 67 */                if (position.getX() > x) {
/* 69 */                    x = position.getX();
                        }
                    }
/* 76 */            float f3 = x - x2;
/* 81 */            if (f3 < 1.0f) {
/* 83 */                f3 = 1.0f;
                    }
/* 87 */            float f4 = f3 * 0.2f;
/* 88 */            float f5 = f4 * f4;
/* 95 */            ArrayList arrayList = new ArrayList(size * 24);
/* 100 */           HashSet hashSet = new HashSet(size * 6);
/* 104 */           int[] iArr = new int[6];
/* 106 */           float[] fArr4 = new float[6];
/* 108 */           int i3 = 0;
/* 109 */           while (i3 < size) {
/* 112 */               for (int i4 = i; i4 < 6; i4++) {
/* 115 */                   iArr[i4] = -1;
/* 117 */                   fArr4[i4] = f2;
                        }
/* 123 */               for (int i5 = i; i5 < size; i5++) {
/* 125 */                   if (i5 != i3) {
/* 131 */                       float f6 = fArr2[i3] - fArr2[i5];
/* 136 */                       float f7 = fArr3[i3] - fArr3[i5];
/* 139 */                       float f8 = (f7 * f7) + (f6 * f6);
/* 140 */                       int i6 = 5;
/* 145 */                       if (f8 < fArr4[5]) {
/* 147 */                           while (i6 > 0) {
                                        int i7 = i6 - 1;
/* 151 */                               float f9 = fArr4[i7];
/* 155 */                               if (f8 >= f9) {
                                            break;
                                        }
/* 157 */                               fArr4[i6] = f9;
/* 161 */                               iArr[i6] = iArr[i7];
                                        i6--;
                                    }
/* 166 */                           fArr4[i6] = f8;
/* 168 */                           iArr[i6] = i5;
                                }
                            }
                        }
/* 173 */               int i8 = i;
/* 174 */               while (i8 < 6) {
/* 176 */                   int i9 = iArr[i8];
/* 178 */                   if (i9 < 0 || fArr4[i8] > f5) {
/* 186 */                       fArr = fArr2;
/* 188 */                       f = f5;
                            } else {
/* 191 */                       int iMin = Math.min(i3, i9);
/* 195 */                       int iMax = Math.max(i3, i9);
/* 199 */                       fArr = fArr2;
/* 207 */                       f = f5;
/* 219 */                       if (hashSet.add(Long.valueOf((iMin * 100000) + iMax))) {
/* 227 */                           arrayList.add(Float.valueOf(fArr[iMin]));
/* 236 */                           arrayList.add(Float.valueOf(fArr3[iMin]));
/* 245 */                           arrayList.add(Float.valueOf(fArr[iMax]));
/* 254 */                           arrayList.add(Float.valueOf(fArr3[iMax]));
                                }
                            }
/* 257 */                   i8++;
/* 259 */                   f5 = f;
/* 261 */                   fArr2 = fArr;
                        }
/* 272 */               i3++;
/* 274 */               i = 0;
/* 275 */               f2 = Float.MAX_VALUE;
                    }
/* 280 */           return IOOi0Ool1i.I00i0oil(arrayList);
                }
            }
