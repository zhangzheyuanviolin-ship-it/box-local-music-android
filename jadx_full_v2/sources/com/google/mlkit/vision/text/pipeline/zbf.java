            package com.google.mlkit.vision.text.pipeline;

            import android.graphics.Matrix;
            import android.graphics.Point;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import p000.i0i1oI1l0;
            import p000.i10lIlo;
            
            final class zbf {
                public static Rect zba(List list, Matrix matrix) {
/* 1 */             Iterator it = list.iterator();
/* 5 */             int iMax = Integer.MIN_VALUE;
/* 10 */            int iMin = Integer.MAX_VALUE;
/* 11 */            int iMin2 = Integer.MAX_VALUE;
/* 12 */            int iMax2 = Integer.MIN_VALUE;
/* 17 */            while (it.hasNext()) {
/* 23 */                Point point = (Point) it.next();
/* 27 */                iMin = Math.min(iMin, point.x);
/* 33 */                iMax = Math.max(iMax, point.x);
/* 39 */                iMin2 = Math.min(iMin2, point.y);
/* 45 */                iMax2 = Math.max(iMax2, point.y);
                    }
/* 56 */            RectF rectF = new RectF(iMin, iMin2, iMax, iMax2);
/* 59 */            if (matrix != null) {
/* 61 */                matrix.mapRect(rectF);
                    }
/* 66 */            Rect rect = new Rect();
/* 69 */            rectF.round(rect);
/* 89 */            return rect;
                }

                public static i10lIlo zbb(i0i1oI1l0 i0i1oi1l0) {
                    return i0i1oi1l0.I00111O() ? i0i1oi1l0.I00100l0().I00100l0() : i0i1oi1l0.I000oI1ioi() ? i0i1oi1l0.I0010I0i().I000oI1ioi() : i0i1oi1l0.I00100o1O0lo();
                }

                public static List zbc(i10lIlo i10lilo) {
/* 13 */            double dSin = Math.sin(Math.toRadians(i10lilo.I000oI1ioi()));
/* 26 */            double dCos = Math.cos(Math.toRadians(i10lilo.I000oI1ioi()));
/* 74 */            Point point = new Point((int) (i10lilo.I00100o1O0lo() + (i10lilo.I0010o() * dCos)), (int) ((i10lilo.I0010o() * dSin) + i10lilo.I0010I0i()));
/* 82 */            double d = point.x;
/* 90 */            double dI00100l0 = i10lilo.I00100l0() * dSin;
/* 102 */           double dI00100l02 = (i10lilo.I00100l0() * dCos) + pointArr[1].y;
/* 114 */           Point point2 = pointArr[0];
/* 116 */           int i = point2.x;
/* 118 */           Point point3 = pointArr[2];
/* 120 */           int i2 = point3.x;
/* 122 */           Point point4 = pointArr[1];
/* 2 */             Point[] pointArr = {new Point(i10lilo.I00100o1O0lo(), i10lilo.I0010I0i()), point, new Point((int) (d - dI00100l0), (int) dI00100l02), new Point((i2 - point4.x) + i, (point3.y - point4.y) + point2.y)};
/* 142 */           return Arrays.asList(pointArr);
                }
            }
