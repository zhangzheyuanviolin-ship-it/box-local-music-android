            package p000;

            import android.text.InputFilter;
            import android.text.method.PasswordTransformationMethod;
            import android.text.method.TransformationMethod;
            import android.util.SparseArray;
            import android.widget.TextView;
            import java.lang.invoke.VarHandle;
            
            public final class Iioolooo00I extends ilI1Oi0 {
                public TextView I00000oIO;
                public IiooOOOO0IIO I00000oOI;
                public boolean I0000Il00O;

                @Override
                public final InputFilter[] I00000oIO(InputFilter[] inputFilterArr) {
/* 5 */             if (this.I0000Il00O) {
/* 63 */                IiooOOOO0IIO iiooOOOO0IIO = this.I00000oOI;
/* 65 */                int length = inputFilterArr.length;
/* 67 */                for (InputFilter inputFilter : inputFilterArr) {
/* 71 */                    if (inputFilter == iiooOOOO0IIO) {
/* 73 */                        return inputFilterArr;
                            }
                        }
/* 79 */                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
/* 81 */                System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
/* 84 */                inputFilterArr2[length] = iiooOOOO0IIO;
/* 168 */               return inputFilterArr2;
                    }
/* 9 */             SparseArray sparseArray = new SparseArray(1);
/* 14 */            for (int i = 0; i < inputFilterArr.length; i++) {
/* 16 */                InputFilter inputFilter2 = inputFilterArr[i];
/* 20 */                if (inputFilter2 instanceof IiooOOOO0IIO) {
/* 22 */                    sparseArray.put(i, inputFilter2);
                        }
                    }
/* 32 */            if (sparseArray.size() == 0) {
/* 34 */                return inputFilterArr;
                    }
/* 35 */            int length2 = inputFilterArr.length;
/* 42 */            InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length - sparseArray.size()];
/* 44 */            int i2 = 0;
/* 45 */            for (int i3 = 0; i3 < length2; i3++) {
/* 51 */                if (sparseArray.indexOfKey(i3) < 0) {
/* 55 */                    inputFilterArr3[i2] = inputFilterArr[i3];
/* 57 */                    i2++;
                        }
                    }
/* 62 */            return inputFilterArr3;
                }

                @Override
                public final void I00000oOI(boolean z) {
/* 1 */             if (z) {
/* 3 */                 I0000O();
                    }
                }

                @Override
                public final void I0000Il00O(boolean z) {
/* 1 */             this.I0000Il00O = z;
/* 3 */             I0000O();
/* 6 */             TextView textView = this.I00000oIO;
/* 16 */            textView.setFilters(I00000oIO(textView.getFilters()));
                }

                public final void I0000O() {
/* 1 */             TextView textView = this.I00000oIO;
/* 3 */             TransformationMethod transformationMethod = textView.getTransformationMethod();
/* 9 */             if (this.I0000Il00O) {
/* 13 */                if (!(transformationMethod instanceof Il00011) && !(transformationMethod instanceof PasswordTransformationMethod)) {
/* 23 */                    Il00011 il00011 = new Il00011();
/* 26 */                    il00011.I00iOIl = transformationMethod;
/* 28 */                    VarHandle.storeStoreFence();
/* 31 */                    transformationMethod = il00011;
                        }
                    } else if (transformationMethod instanceof Il00011) {
/* 39 */                transformationMethod = ((Il00011) transformationMethod).I00iOIl;
                    }
/* 41 */            textView.setTransformationMethod(transformationMethod);
                }
            }
