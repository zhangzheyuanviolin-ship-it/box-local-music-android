            package p000;
            
            public abstract class i1Ioli1II {
                public static final float[][] I00000oIO = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
                public static final float[][] I00000oOI = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
                public static final float[] I0000Il00O = {95.047f, 100.0f, 108.883f};
                public static final float[][] I0000O = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

                public static int I00000oIO(float f) {
/* 5 */             if (f < 1.0f) {
/* 7 */                 return -16777216;
                    }
/* 14 */            if (f > 99.0f) {
/* 16 */                return -1;
                    }
/* 24 */            float f2 = (f + 16.0f) / 116.0f;
/* 38 */            float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
/* 41 */            float f4 = f2 * f2 * f2;
/* 53 */            boolean z = f4 > 0.008856452f;
/* 61 */            float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
/* 62 */            if (!z) {
/* 67 */                f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
                    }
/* 69 */            float[] fArr = I0000Il00O;
/* 84 */            return IOOliIoI1l.I00000oIO(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
                }

                public static float I00000oOI(int i) {
/* 4 */             float f = i / 255.0f;
/* 18 */            return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
                }

                public static float I0000Il00O() {
/* 15 */            return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
                }
            }
