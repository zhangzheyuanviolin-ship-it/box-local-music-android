            package p000;

            import android.graphics.Bitmap;
            import android.util.Log;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.text.Text;
            import com.google.mlkit.vision.text.TextRecognizer;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OOlOoOo extends Oll0io implements IlliIl1l11O {
                public final Bitmap I00iOIl;
                public final Oi0Oooi I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OOlOoOo(Bitmap bitmap, Oi0Oooi oi0Oooi, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = bitmap;
/* 3 */             this.I00iiI = oi0Oooi;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             return new OOlOoOo(this.I00iOIl, this.I00iiI, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OOlOoOo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             lIoii1l01l0i.I00000oOI(obj);
                    try {
/* 42 */                List listI00Ol1ll1 = IOOi0Ool1i.I00Ol1ll1(((Text) lOio0o.I00000oIO(((TextRecognizer) this.I00iiI.I00iiI).process(InputImage.fromBitmap(this.I00iOIl, 0)))).getTextBlocks(), new IliIiio1(29));
/* 50 */                ArrayList arrayList = new ArrayList();
/* 53 */                Iterator it = listI00Ol1ll1.iterator();
/* 61 */                while (it.hasNext()) {
/* 77 */                    String string = OlOoOIi0o.I00OIo(((Text.TextBlock) it.next()).getText()).toString();
/* 85 */                    if (string.length() == 0) {
/* 87 */                        string = null;
                            }
/* 88 */                    if (string != null) {
/* 90 */                        arrayList.add(string);
                            }
                        }
/* 101 */               return IOOi0Ool1i.I00IlilI0i0i(arrayList, "\n", null, null, null, 62);
                    } catch (Throwable th) {
/* 112 */               Log.e("BoxAssistReading", "read failed", th);
/* 115 */               return "";
                    }
                }
            }
