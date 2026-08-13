            package p000;

            import android.graphics.Bitmap;
            import android.util.Log;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.ai.edge.litert.TensorBuffer;
            import java.util.List;
            
            public final class i01olii11O0 extends Oll0io implements IlliIl1l11O {
                public final IIOo1i I00iOIl;
                public final Bitmap I00iiI;
                public final float I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i01olii11O0(IIOo1i iIOo1i, Bitmap bitmap, float f, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = iIOo1i;
/* 3 */             this.I00iiI = bitmap;
/* 5 */             this.I00iiO = f;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             return new i01olii11O0(this.I00iOIl, this.I00iiI, this.I00iiO, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((i01olii11O0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Bitmap bitmap = this.I00iiI;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             lIoii1l01l0i.I00000oOI(obj);
/* 13 */            CompiledModel compiledModel = (CompiledModel) this.I00iOIl.I0000Il00O;
/* 15 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 17 */            if (compiledModel == null) {
/* 19 */                return il01100l;
                    }
                    try {
/* 20 */                i01oioio i01oioioVarI000l1 = IIOo1i.I000l1(bitmap);
/* 28 */                List listCreateInputBuffers$default = CompiledModel.createInputBuffers$default(compiledModel, 0, 1, null);
/* 32 */                List listCreateOutputBuffers$default = CompiledModel.createOutputBuffers$default(compiledModel, 0, 1, null);
/* 44 */                ((TensorBuffer) listCreateInputBuffers$default.get(0)).writeFloat(i01oioioVarI000l1.I00000oIO);
/* 50 */                CompiledModel.run$default(compiledModel, listCreateInputBuffers$default, listCreateOutputBuffers$default, 0, 4, (Object) null);
/* 77 */                return this.I00iOIl.I0000oI00(((TensorBuffer) listCreateOutputBuffers$default.get(0)).readFloat(), i01oioioVarI000l1, bitmap.getWidth(), bitmap.getHeight(), this.I00iiO);
                    } catch (Throwable th) {
/* 88 */                Log.e("BoxAssistYolox", "detect failed", th);
/* 168 */               return il01100l;
                    }
                }
            }
