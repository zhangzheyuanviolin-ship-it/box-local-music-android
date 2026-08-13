            package com.google.mlkit.vision.text.internal;

            import android.graphics.Point;
            import android.graphics.Rect;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import p000.io0oOoOi0o;
            
            final class zza {
                public static Rect zza(List list) {
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
/* 52 */            return new Rect(iMin, iMin2, iMax, iMax2);
                }

                public static List zzb(io0oOoOi0o io0ooooi0o) {
/* 2 */             Point[] pointArr = new Point[4];
/* 11 */            double dSin = Math.sin(Math.toRadians(io0ooooi0o.I00ilI0I1));
/* 22 */            double dCos = Math.cos(Math.toRadians(io0ooooi0o.I00ilI0I1));
/* 28 */            int i = io0ooooi0o.I00iOIl;
/* 30 */            int i2 = io0ooooi0o.I00iiI;
/* 36 */            pointArr[0] = new Point(i, i2);
/* 41 */            double d = io0ooooi0o.I00iiO;
/* 52 */            Point point = new Point((int) (i + (d * dCos)), (int) ((d * dSin) + i2));
/* 56 */            pointArr[1] = point;
/* 60 */            double d2 = point.x;
/* 63 */            int i3 = io0ooooi0o.I00iio;
/* 82 */            pointArr[2] = new Point((int) (d2 - (i3 * dSin)), (int) ((i3 * dCos) + pointArr[1].y));
/* 86 */            Point point2 = pointArr[0];
/* 88 */            int i4 = point2.x;
/* 90 */            Point point3 = pointArr[2];
/* 92 */            int i5 = point3.x;
/* 94 */            Point point4 = pointArr[1];
/* 112 */           pointArr[3] = new Point((i5 - point4.x) + i4, (point3.y - point4.y) + point2.y);
/* 114 */           return Arrays.asList(pointArr);
                }
            }
