            package p000;

            import android.graphics.Path;
            import android.util.Log;
            
            public final class OO0iO1ll00 {
                public char I00000oIO;
                public float[] I00000oOI;

                public static void I00000oIO(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
                    double d;
                    double d2;
/* 12 */            double radians = Math.toRadians(f7);
/* 16 */            double dCos = Math.cos(radians);
/* 20 */            double dSin = Math.sin(radians);
                    double d3 = f;
                    double d4 = f2;
                    double d5 = f5;
/* 37 */            double d6 = ((d4 * dSin) + (d3 * dCos)) / d5;
                    double d7 = f6;
/* 47 */            double d8 = ((d4 * dCos) + ((-f) * dSin)) / d7;
                    double d9 = f4;
/* 62 */            double d10 = ((d9 * dSin) + (f3 * dCos)) / d5;
/* 73 */            double d11 = ((d9 * dCos) + ((-f3) * dSin)) / d7;
/* 75 */            double d12 = d6 - d10;
/* 77 */            double d13 = d8 - d11;
/* 83 */            double d14 = (d6 + d10) / 2.0d;
/* 87 */            double d15 = (d8 + d11) / 2.0d;
/* 95 */            double d16 = (d13 * d13) + (d12 * d12);
/* 105 */           if (d16 == 0.0d) {
/* 109 */               Log.w("PathParser", " Points are coincident");
/* 112 */               return;
                    }
/* 119 */           double d17 = (1.0d / d16) - 0.25d;
/* 123 */           if (d17 < 0.0d) {
/* 139 */               Log.w("PathParser", "Points are too far apart " + d16);
/* 152 */               float fSqrt = (float) (Math.sqrt(d16) / 1.99999d);
/* 169 */               I00000oIO(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z, z2);
/* 172 */               return;
                    }
/* 175 */           double dSqrt = Math.sqrt(d17);
/* 179 */           double d18 = dSqrt * d12;
/* 181 */           double d19 = dSqrt * d13;
/* 185 */           if (z == z2) {
/* 187 */               d = d14 - d19;
/* 189 */               d2 = d15 + d18;
                    } else {
/* 192 */               d = d14 + d19;
/* 194 */               d2 = d15 - d18;
                    }
/* 200 */           double dAtan2 = Math.atan2(d8 - d2, d6 - d);
/* 214 */           double dAtan22 = Math.atan2(d11 - d2, d10 - d) - dAtan2;
/* 223 */           if (z2 != (dAtan22 >= 0.0d)) {
/* 235 */               dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
                    }
/* 237 */           double d20 = d * d5;
/* 239 */           double d21 = d2 * d7;
/* 245 */           double d22 = (d20 * dCos) - (d21 * dSin);
/* 251 */           double d23 = (d21 * dCos) + (d20 * dSin);
/* 272 */           int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
/* 273 */           double dCos2 = Math.cos(radians);
/* 277 */           double dSin2 = Math.sin(radians);
/* 281 */           double dCos3 = Math.cos(dAtan2);
/* 285 */           double dSin3 = Math.sin(dAtan2);
/* 291 */           double d24 = -d5;
/* 292 */           double d25 = d24 * dCos2;
/* 296 */           double d26 = d7 * dSin2;
/* 300 */           double d27 = (d25 * dSin3) - (d26 * dCos3);
/* 302 */           double d28 = d24 * dSin2;
/* 306 */           double d29 = d7 * dCos2;
/* 315 */           double d30 = dAtan22 / iCeil;
/* 310 */           double d31 = (dCos3 * d29) + (dSin3 * d28);
/* 319 */           double d32 = d3;
/* 321 */           double d33 = d4;
/* 322 */           int i = 0;
/* 323 */           double d34 = dAtan2;
/* 325 */           while (i < iCeil) {
/* 327 */               double d35 = d34 + d30;
/* 329 */               double dSin4 = Math.sin(d35);
/* 333 */               double dCos4 = Math.cos(d35);
/* 345 */               int i2 = iCeil;
/* 348 */               double d36 = (((d5 * dCos2) * dCos4) + d22) - (d26 * dSin4);
/* 360 */               double d37 = (d29 * dSin4) + (d5 * dSin2 * dCos4) + d23;
/* 366 */               double d38 = (d25 * dSin4) - (d26 * dCos4);
/* 372 */               double d39 = (dCos4 * d29) + (dSin4 * d28);
/* 374 */               double d40 = d35 - d34;
/* 378 */               double dTan = Math.tan(d40 / 2.0d);
/* 402 */               double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d40)) / 3.0d;
/* 433 */               path.rLineTo(0.0f, 0.0f);
/* 456 */               path.cubicTo((float) ((d27 * dSqrt2) + d32), (float) ((d31 * dSqrt2) + d33), (float) (d36 - (dSqrt2 * d38)), (float) (d37 - (dSqrt2 * d39)), (float) d36, (float) d37);
/* 459 */               i++;
/* 461 */               d33 = d37;
/* 462 */               dCos2 = dCos2;
/* 464 */               d28 = d28;
/* 466 */               d34 = d35;
/* 468 */               d31 = d39;
/* 470 */               d32 = d36;
/* 472 */               iCeil = i2;
/* 474 */               d27 = d38;
/* 476 */               d30 = d30;
                    }
                }
            }
