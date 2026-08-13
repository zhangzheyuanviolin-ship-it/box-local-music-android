            package p000;

            import android.graphics.Bitmap;
            import android.util.Log;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.segmentation.subject.SubjectSegmenter;
            import java.lang.invoke.VarHandle;
            
            public final class I1o10oiO extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public I1o1Ii0I I00ilI0I1;
                public IIoOo1iIio1l I00ilO0;
                public int I00io1l;
                public final IIoOoIol0Io0 I00ioIO;
                public final I1o1Ii0I I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1o10oiO(IIoOoIol0Io0 iIoOoIol0Io0, I1o1Ii0I i1o1Ii0I, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00ioIO = iIoOoIol0Io0;
/* 3 */             this.I00l0I0l0lO1 = i1o1Ii0I;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             return new I1o10oiO(this.I00ioIO, this.I00l0I0l0lO1, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((I1o10oiO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x00d0  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00f2  */
                /* JADX WARN: Type inference failed for: r11v1, types: [IIoOo1iIio1l] */
                /* JADX WARN: Type inference failed for: r9v8, types: [IIoOo1iIio1l] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00e7 -> B:24:0x00e8). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i;
                    IIoOoIol0Io0 iIoOoIol0Io0;
                    I1o1Ii0I i1o1Ii0I;
                    int i2;
                    int i3;
                    I1o1Ii0I i1o1Ii0I2;
                    int i4;
                    int i5;
                    int i6;
                    Object objI00000oIO;
                    int i7;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             int i8 = this.I00io1l;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             IIoOoIol0Io0 iIoOoIol0Io02 = this.I00ioIO;
/* 12 */            int i9 = 0;
/* 13 */            int i10 = 1;
/* 14 */            if (i8 == 0) {
/* 73 */                lIoii1l01l0i.I00000oOI(obj);
/* 76 */                i = 30;
/* 80 */                iIoOoIol0Io0 = iIoOoIol0Io02;
/* 78 */                i1o1Ii0I = this.I00l0I0l0lO1;
/* 82 */                i2 = 0;
/* 83 */                if (i2 < i) {
                        }
                    } else if (i8 == 1) {
/* 47 */                int i11 = this.I00iio;
/* 49 */                int i12 = this.I00iiO;
/* 51 */                int i13 = this.I00iiI;
/* 53 */                int i14 = this.I00iOIl;
/* 55 */                ?? r11 = this.I00ilO0;
/* 57 */                i1o1Ii0I2 = this.I00ilI0I1;
/* 59 */                lIoii1l01l0i.I00000oOI(obj);
/* 62 */                objI00000oIO = obj;
/* 64 */                i3 = 1;
/* 66 */                i6 = i11;
/* 67 */                i7 = i13;
/* 68 */                i4 = i12;
/* 69 */                i5 = i14;
/* 70 */                iIoOoIol0Io0 = r11;
/* 201 */               if (!((Boolean) objI00000oIO).booleanValue()) {
                        }
                    } else {
/* 18 */                if (i8 != 2) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 20 */                i7 = this.I00iiI;
/* 22 */                i5 = this.I00iOIl;
/* 24 */                ?? r9 = this.I00ilO0;
/* 26 */                I1o1Ii0I i1o1Ii0I3 = this.I00ilI0I1;
/* 28 */                lIoii1l01l0i.I00000oOI(obj);
/* 33 */                iIoOoIol0Io0 = r9;
/* 34 */                i1o1Ii0I = i1o1Ii0I3;
/* 36 */                i3 = 1;
/* 235 */               int i15 = i5;
/* 233 */               i2 = i7 + 1;
/* 237 */               i = i15;
/* 238 */               i10 = i3;
/* 240 */               i9 = 0;
/* 83 */                if (i2 < i) {
/* 85 */                    this.I00ilI0I1 = i1o1Ii0I;
/* 87 */                    this.I00ilO0 = iIoOoIol0Io0;
/* 89 */                    this.I00iOIl = i;
/* 91 */                    this.I00iiI = i2;
/* 93 */                    this.I00iiO = i2;
/* 95 */                    this.I00iio = i9;
/* 97 */                    this.I00io1l = i10;
/* 99 */                    i1o1Ii0I.getClass();
/* 108 */                   OiIOol0 oiIOol0 = new OiIOol0(l00iIoI.I0000Il00O(this));
/* 115 */                   Bitmap bitmapCreateBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
/* 131 */                   OloIIoII1oo oloIIoII1ooProcess = ((SubjectSegmenter) i1o1Ii0I.I0000O.getValue()).process(InputImage.fromBitmap(bitmapCreateBitmap, i9));
/* 138 */                   I01i01OoI i01i01OoI = new I01i01OoI(5);
/* 141 */                   i01i01OoI.I00iiI = bitmapCreateBitmap;
/* 143 */                   i01i01OoI.I00iiO = oiIOol0;
/* 145 */                   VarHandle.storeStoreFence();
/* 150 */                   i3 = i10;
/* 153 */                   I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(i01i01OoI, 3);
/* 156 */                   o0IiOl o0iiol = (o0IiOl) oloIIoII1ooProcess;
/* 158 */                   o0iiol.getClass();
/* 163 */                   o0iiol.I0000oI00(OloIo0oOIO0.I00000oIO, i0IIiO0iI);
/* 168 */                   OlOO1i11110 olOO1i11110 = new OlOO1i11110(5);
/* 171 */                   olOO1i11110.I00iiI = bitmapCreateBitmap;
/* 173 */                   olOO1i11110.I00iiO = oiIOol0;
/* 175 */                   VarHandle.storeStoreFence();
/* 178 */                   o0iiol.I0000Il00O(olOO1i11110);
/* 181 */                   objI00000oIO = oiIOol0.I00000oIO();
/* 185 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 187 */                   if (objI00000oIO != ii0111o) {
/* 190 */                       i1o1Ii0I2 = i1o1Ii0I;
/* 191 */                       i6 = 0;
/* 192 */                       i4 = i2;
/* 193 */                       i5 = i;
/* 194 */                       i7 = i4;
/* 201 */                       if (!((Boolean) objI00000oIO).booleanValue()) {
/* 205 */                           iIoOoIol0Io0.resumeWith(Boolean.TRUE);
/* 208 */                           return ooiIlOl1iI;
                                }
/* 209 */                       this.I00ilI0I1 = i1o1Ii0I2;
/* 211 */                       this.I00ilO0 = iIoOoIol0Io0;
/* 213 */                       this.I00iOIl = i5;
/* 215 */                       this.I00iiI = i7;
/* 217 */                       this.I00iiO = i4;
/* 219 */                       this.I00iio = i6;
/* 221 */                       this.I00io1l = 2;
/* 229 */                       if (il0l1o1l.I00000oOI(1000L, this) != ii0111o) {
/* 232 */                           i1o1Ii0I = i1o1Ii0I2;
/* 235 */                           int i152 = i5;
/* 233 */                           i2 = i7 + 1;
/* 237 */                           i = i152;
/* 238 */                           i10 = i3;
/* 240 */                           i9 = 0;
/* 83 */                            if (i2 < i) {
/* 247 */                               Log.e("BgRemover", "Model download timeout");
/* 252 */                               iIoOoIol0Io02.resumeWith(Boolean.FALSE);
/* 966 */                               return ooiIlOl1iI;
                                    }
                                }
                            }
/* 231 */                   return ii0111o;
                        }
                    }
                }
            }
