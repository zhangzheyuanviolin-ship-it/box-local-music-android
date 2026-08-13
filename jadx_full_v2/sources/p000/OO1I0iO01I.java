            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.litert.Accelerator;
            import com.google.ai.edge.litert.CompiledModel;
            import java.io.File;
            import java.util.Iterator;
            
            public final class OO1I0iO01I extends Oll0io implements IlliIl1l11O {
                public Object I00iOIl;
                public final OO1I0o I00iiI;
                public final String I00iiO;
                public final Context I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OO1I0iO01I(OO1I0o oO1I0o, String str, Context context, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = oO1I0o;
/* 3 */             this.I00iiO = str;
/* 5 */             this.I00iio = context;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             OO1I0iO01I oO1I0iO01I = new OO1I0iO01I(this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo);
/* 12 */            oO1I0iO01I.I00iOIl = obj;
/* 37 */            return oO1I0iO01I;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OO1I0iO01I) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z;
                    Object next;
                    File file;
/* 3 */             String str = this.I00iiO;
/* 5 */             OO1I0o oO1I0o = this.I00iiI;
/* 11 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 13 */            lIoii1l01l0i.I00000oOI(obj);
                    try {
/* 16 */                CompiledModel compiledModel = oO1I0o.I00000oIO;
/* 18 */                if (compiledModel != null) {
/* 20 */                    compiledModel.close();
                        }
                    } catch (Throwable unused) {
                    }
                    try {
/* 24 */                oO1I0o.I00000oIO = null;
/* 37 */                Iterator it = IlIl10.I000l1(new File(str), IlIl0l1lO.I00iOIl).iterator();
                        while (true) {
/* 42 */                    I011lIilI0lo i011lIilI0lo = (I011lIilI0lo) it;
/* 48 */                    if (!i011lIilI0lo.hasNext()) {
/* 79 */                        next = null;
                                break;
                            }
/* 50 */                    next = i011lIilI0lo.next();
/* 55 */                    File file2 = (File) next;
/* 61 */                    if (file2.isFile() && IlIl10.I0001Ioi1lo(file2).equals("tflite")) {
                                break;
                            }
                        }
/* 80 */                file = (File) next;
                    } catch (Throwable th) {
/* 145 */               Log.e("PlantRecogniseEngine", "loadModel failed", th);
                        try {
/* 148 */                   CompiledModel compiledModel2 = oO1I0o.I00000oIO;
/* 150 */                   if (compiledModel2 != null) {
/* 152 */                       compiledModel2.close();
                            }
                        } catch (Throwable unused2) {
                        }
/* 155 */               oO1I0o.I00000oIO = null;
/* 157 */               z = false;
                    }
/* 82 */            if (file != null) {
/* 131 */               oO1I0o.I00000oIO = CompiledModel.Companion.create$default(CompiledModel.INSTANCE, file.getAbsolutePath(), new CompiledModel.Options(Accelerator.GPU), null, 4, null);
/* 139 */               oO1I0o.I00000oOI = OO1I0o.I00000oIO(this.I00iio);
/* 141 */               z = true;
/* 158 */               return Boolean.valueOf(z);
                    }
/* 101 */           Log.e("PlantRecogniseEngine", "No .tflite found under " + str);
/* 104 */           return Boolean.FALSE;
                }
            }
