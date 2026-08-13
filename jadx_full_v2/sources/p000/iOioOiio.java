            package p000;
            
            public abstract class iOioOiio {
                public static int I00000oIO(int i, int i2, boolean z) {
/* 12 */            int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
/* 21 */            if (l11I11lO.I0000O(2, "CameraOrientationUtil")) {
/* 29 */                StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("getRelativeImageRotation: destRotationDegrees=", i, ", sourceRotationDegrees=", i2, ", isOppositeFacing=");
/* 33 */                sbI0010I0i.append(z);
/* 38 */                sbI0010I0i.append(", result=");
/* 41 */                sbI0010I0i.append(i3);
/* 45 */                l11I11lO.I0000O(3, "CameraOrientationUtil");
                    }
/* 98 */            return i3;
                }

                public static int I00000oOI(int i) {
/* 1 */             if (i == 0) {
/* 32 */                return 0;
                    }
/* 4 */             if (i == 1) {
/* 29 */                return 90;
                    }
/* 7 */             if (i == 2) {
/* 26 */                return 180;
                    }
/* 10 */            if (i == 3) {
/* 12 */                return 270;
                    }
/* 21 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Unsupported surface rotation: "));
/* 24 */            return 0;
                }
            }
