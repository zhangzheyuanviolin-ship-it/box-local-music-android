            package p000;

            import android.graphics.Matrix;
            import android.view.View;
            import android.view.ViewParent;
            
            public final class IIi1oollolII {
                public static final IIi1oollolII I00000oIO = new IIi1oollolII();

                public final void I00000oIO(View view, float[] fArr, Matrix matrix, int[] iArr) {
/* 7 */             matrix.reset();
/* 10 */            View view2 = view;
/* 12 */            view2.transformMatrixToGlobal(matrix);
/* 15 */            ViewParent parent = view2.getParent();
/* 21 */            while (parent instanceof View) {
/* 24 */                view2 = parent;
/* 26 */                parent = view2.getParent();
                    }
/* 31 */            view2.getLocationOnScreen(iArr);
/* 35 */            int i = iArr[0];
/* 38 */            int i2 = iArr[1];
/* 40 */            view2.getLocationInWindow(iArr);
/* 51 */            matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
/* 54 */            matrix.getValues(fArr);
/* 57 */            float f = fArr[0];
/* 59 */            float f2 = fArr[1];
/* 62 */            float f3 = fArr[2];
/* 65 */            float f4 = fArr[3];
/* 68 */            float f5 = fArr[4];
/* 71 */            float f6 = fArr[5];
/* 74 */            float f7 = fArr[6];
/* 77 */            float f8 = fArr[7];
/* 81 */            float f9 = fArr[8];
/* 83 */            fArr[0] = f;
/* 85 */            fArr[1] = f4;
/* 88 */            fArr[2] = 0.0f;
/* 90 */            fArr[3] = f7;
/* 92 */            fArr[4] = f2;
/* 94 */            fArr[5] = f5;
/* 96 */            fArr[6] = 0.0f;
/* 98 */            fArr[7] = f8;
/* 100 */           fArr[8] = 0.0f;
/* 104 */           fArr[9] = 0.0f;
/* 110 */           fArr[10] = 1.0f;
/* 114 */           fArr[11] = 0.0f;
/* 118 */           fArr[12] = f3;
/* 122 */           fArr[13] = f6;
/* 126 */           fArr[14] = 0.0f;
/* 130 */           fArr[15] = f9;
                }
            }
