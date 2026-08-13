            package p000;

            import android.content.ContentValues;
            import android.content.Context;
            import android.content.Intent;
            import android.graphics.Bitmap;
            import android.net.Uri;
            import android.os.Environment;
            import android.provider.MediaStore;
            import java.io.OutputStream;
            
            public final class I1o0i1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Context I00iiO;
                public final Bitmap I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1o0i1(Context context, Bitmap bitmap, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = context;
/* 5 */             this.I00iio = bitmap;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    return new I1o0i1(this.I00iiO, this.I00iio, iOoil1iiIilo, 0);
                        default:
/* 13 */                    return new I1o0i1(this.I00iiO, this.I00iio, iOoil1iiIilo, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((I1o0i1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Bitmap bitmap = this.I00iio;
/* 7 */             Context context = this.I00iiO;
/* 9 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 11 */            int i2 = 1;
/* 12 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (i) {
                        case 0:
/* 164 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 166 */                   int i3 = this.I00iiI;
/* 168 */                   if (i3 != 0) {
/* 170 */                       if (i3 == 1) {
/* 172 */                           lIoii1l01l0i.I00000oOI(obj);
/* 206 */                           return ooiIlOl1iI;
                                }
/* 176 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 181 */                   lIoii1l01l0i.I00000oOI(obj);
/* 184 */                   this.I00iiI = 1;
/* 186 */                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 195 */                   Object objI0000oI00 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new I1o0i1(context, bitmap, iOoil1iiIilo, i2), this);
/* 199 */                   if (objI0000oI00 != ii0111o) {
/* 202 */                       objI0000oI00 = ooiIlOl1iI;
                            }
                            return objI0000oI00 == ii0111o ? ii0111o : ooiIlOl1iI;
                        default:
/* 20 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 22 */                    int i4 = this.I00iiI;
                            try {
/* 24 */                        if (i4 != 0) {
/* 26 */                            if (i4 == 1) {
/* 28 */                                lIoii1l01l0i.I00000oOI(obj);
/* 163 */                               return ooiIlOl1iI;
                                    }
/* 33 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 39 */                        lIoii1l01l0i.I00000oOI(obj);
/* 44 */                        ContentValues contentValues = new ContentValues();
/* 70 */                        contentValues.put("_display_name", "bgremoval_share_" + System.currentTimeMillis() + ".png");
/* 75 */                        contentValues.put("mime_type", "image/png");
/* 82 */                        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
/* 91 */                        Uri uriInsert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
/* 95 */                        if (uriInsert == null) {
/* 163 */                           return ooiIlOl1iI;
                                }
/* 102 */                       OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert);
/* 106 */                       if (outputStreamOpenOutputStream != null) {
                                    try {
/* 112 */                               bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
/* 115 */                               outputStreamOpenOutputStream.close();
                                    } finally {
                                    }
                                }
/* 130 */                       Intent intent = new Intent("android.intent.action.SEND");
/* 133 */                       intent.setType("image/png");
/* 138 */                       intent.putExtra("android.intent.extra.STREAM", uriInsert);
/* 141 */                       intent.addFlags(1);
/* 144 */                       IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 146 */                       Io11l1li io11l1li = O1OI1l011OO1.I00000oIO;
/* 151 */                       I1iIil1I i1iIil1I = new I1iIil1I(context, intent, null, 5);
/* 154 */                       this.I00iiI = 1;
                                return iOi1II01i0.I0000oI00(io11l1li, i1iIil1I, this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                            } catch (Exception unused) {
/* 163 */                       return ooiIlOl1iI;
                            }
                    }
                }
            }
