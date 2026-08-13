            package p000;

            import android.opengl.Matrix;
            
            public abstract class l1II0ioIoOo {
                public static void I00000oIO(float[] fArr, float f) {
/* 5 */             Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
/* 15 */            Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
/* 20 */            Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
                }

                public static void I00000oOI(float[] fArr) {
/* 5 */             Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
/* 12 */            Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
/* 19 */            Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
                }
            }
