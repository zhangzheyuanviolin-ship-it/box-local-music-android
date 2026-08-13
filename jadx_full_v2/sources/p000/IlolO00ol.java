            package p000;

            import android.graphics.Bitmap;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.BarcodeScanner;
            import com.google.mlkit.vision.common.InputImage;
            import java.util.List;
            
            public final class IlolO00ol extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final BarcodeScanner I00iiI;
                public final Bitmap I00iiO;
                public final OI10i0Il I00iio;
                public final OI10i0Il I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlolO00ol(BarcodeScanner barcodeScanner, Bitmap bitmap, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = barcodeScanner;
/* 3 */             this.I00iiO = bitmap;
/* 5 */             this.I00iio = oI10i0Il;
/* 7 */             this.I00ilI0I1 = oI10i0Il2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            return new IlolO00ol(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IlolO00ol) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iOIl;
/* 9 */             OI10i0Il oI10i0Il = this.I00iio;
/* 12 */            OI10i0Il oI10i0Il2 = this.I00ilI0I1;
                    try {
                        try {
/* 14 */                    if (i == 0) {
/* 36 */                        lIoii1l01l0i.I00000oOI(obj);
/* 48 */                        OloIIoII1oo oloIIoII1ooProcess = this.I00iiI.process(InputImage.fromBitmap(this.I00iiO, 0));
/* 52 */                        this.I00iOIl = 1;
/* 54 */                        obj = lOio0oO.I00000oIO(oloIIoII1ooProcess, this);
/* 58 */                        if (obj == ii0111o) {
/* 60 */                            return ii0111o;
                                }
                            } else {
/* 16 */                        if (i != 1) {
/* 31 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 34 */                            return null;
                                }
/* 18 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 61 */                    List list = (List) obj;
/* 88 */                    String strI00IlilI0i0i = list.isEmpty() ? "No barcodes found." : IOOi0Ool1i.I00IlilI0i0i(list, "\n\n", null, null, new Ilo10O1IlOl(24), 30);
/* 92 */                    List list2 = Iloo0ilo.I00000oIO;
/* 94 */                    oI10i0Il.setValue(strI00IlilI0i0i);
                        } catch (Exception e) {
/* 115 */                   String str = "Error: " + e.getMessage();
/* 119 */                   List list3 = Iloo0ilo.I00000oIO;
/* 121 */                   oI10i0Il.setValue(str);
/* 142 */                   Log.e("GeminiNanoHub", "barcode error: " + e.getMessage());
                        }
/* 99 */                oI10i0Il2.setValue(Boolean.FALSE);
/* 146 */               return OoiIlOl1iI.I00000oIO;
                    } catch (Throwable th) {
/* 149 */               List list4 = Iloo0ilo.I00000oIO;
/* 153 */               oI10i0Il2.setValue(Boolean.FALSE);
/* 168 */               throw th;
                    }
                }
            }
