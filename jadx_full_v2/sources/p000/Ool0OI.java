            package p000;

            import android.graphics.Bitmap;
            import android.graphics.Color;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.ai.edge.litert.TensorBuffer;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.List;
            
            public final class Ool0OI {
                public CompiledModel I00000oIO;
                public boolean I00000oOI;

                public final void I00000oIO(float[] fArr, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
                    int iRgb;
/* 1 */             int i7 = i5;
/* 5 */             if (i7 <= 0 || i6 <= 0) {
/* 1750 */              return;
                    }
/* 10 */            int[] iArr = new int[i7];
/* 13 */            int i8 = 0;
/* 14 */            while (i8 < i6) {
/* 16 */                int i9 = i4 + i8;
/* 19 */                for (int i10 = 0; i10 < i7; i10++) {
/* 25 */                    int i11 = (i9 * Barcode.FORMAT_UPC_A) + i3 + i10;
/* 28 */                    if (this.I00000oOI) {
/* 30 */                        int i12 = i11 * 3;
/* 54 */                        iRgb = Color.rgb(li0I0lOII0o.I00000oIO(fArr[i12]), li0I0lOII0o.I00000oIO(fArr[i12 + 1]), li0I0lOII0o.I00000oIO(fArr[i12 + 2]));
                            } else {
/* 83 */                        iRgb = Color.rgb(li0I0lOII0o.I00000oIO(fArr[i11]), li0I0lOII0o.I00000oIO(fArr[262144 + i11]), li0I0lOII0o.I00000oIO(fArr[524288 + i11]));
                            }
/* 87 */                    iArr[i10] = iRgb;
                        }
/* 100 */               bitmap.setPixels(iArr, 0, i7, i, i2 + i8, i5, 1);
/* 103 */               i8++;
/* 105 */               i7 = i5;
                    }
                }

                public final Bitmap I00000oOI(float[] fArr) {
/* 3 */             int[] iArr = new int[262144];
/* 7 */             int i = 0;
/* 8 */             if (this.I00000oOI) {
/* 10 */                while (i < 262144) {
/* 12 */                    int i2 = i * 3;
/* 40 */                    iArr[i] = Color.rgb(li0I0lOII0o.I00000oIO(fArr[i2]), li0I0lOII0o.I00000oIO(fArr[i2 + 1]), li0I0lOII0o.I00000oIO(fArr[i2 + 2]));
/* 42 */                    i++;
                        }
                    } else {
/* 45 */                while (i < 262144) {
/* 74 */                    iArr[i] = Color.rgb(li0I0lOII0o.I00000oIO(fArr[i]), li0I0lOII0o.I00000oIO(fArr[262144 + i]), li0I0lOII0o.I00000oIO(fArr[524288 + i]));
/* 76 */                    i++;
                        }
                    }
/* 83 */            return Bitmap.createBitmap(iArr, Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_A, Bitmap.Config.ARGB_8888);
                }

                public final float[] I0000Il00O(CompiledModel compiledModel, Bitmap bitmap) {
/* 3 */             int[] iArr = new int[16384];
/* 15 */            bitmap.getPixels(iArr, 0, Barcode.FORMAT_ITF, 0, 0, Barcode.FORMAT_ITF, Barcode.FORMAT_ITF);
/* 21 */            float[] fArr = new float[49152];
/* 27 */            if (this.I00000oOI) {
/* 30 */                for (int i = 0; i < 16384; i++) {
/* 32 */                    int i2 = iArr[i];
/* 34 */                    int i3 = i * 3;
/* 42 */                    fArr[i3] = ((i2 >> 16) & 255) / 255.0f;
/* 52 */                    fArr[i3 + 1] = ((i2 >> 8) & 255) / 255.0f;
/* 60 */                    fArr[i3 + 2] = (i2 & 255) / 255.0f;
                        }
                    } else {
/* 66 */                for (int i4 = 0; i4 < 16384; i4++) {
/* 68 */                    int i5 = iArr[i4];
/* 76 */                    fArr[i4] = ((i5 >> 16) & 255) / 255.0f;
/* 86 */                    fArr[16384 + i4] = ((i5 >> 8) & 255) / 255.0f;
/* 96 */                    fArr[32768 + i4] = (i5 & 255) / 255.0f;
                        }
                    }
/* 103 */           List listCreateInputBuffers$default = CompiledModel.createInputBuffers$default(compiledModel, 0, 1, null);
/* 107 */           List listCreateOutputBuffers$default = CompiledModel.createOutputBuffers$default(compiledModel, 0, 1, null);
/* 117 */           ((TensorBuffer) listCreateInputBuffers$default.get(0)).writeFloat(fArr);
/* 124 */           CompiledModel.run$default(compiledModel, listCreateInputBuffers$default, listCreateOutputBuffers$default, 0, 4, (Object) null);
/* 133 */           return ((TensorBuffer) listCreateOutputBuffers$default.get(0)).readFloat();
                }
            }
