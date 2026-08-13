            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.drawable.BitmapDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.VectorDrawable;
            import java.nio.ByteBuffer;
            
            public final class II0o0I0 implements IlIO00OOi1OO {
                public final int I00000oIO;
                public OIil0IlIIol I00000oOI;
                public Object I0000Il00O;

                @Override
                public final Object I00000oIO(IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00000oIO) {
                        case 0:
/* 117 */                   return new Iilo1lOIl01i(new BitmapDrawable(this.I00000oOI.I00000oIO.getResources(), (Bitmap) this.I0000Il00O), false, Ii1I1OOilolI.I00iiI);
                        case 1:
/* 60 */                    ByteBuffer byteBuffer = (ByteBuffer) this.I0000Il00O;
                            try {
/* 64 */                        III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 67 */                        iII1o0lOio0.write(byteBuffer);
/* 70 */                        byteBuffer.position(0);
/* 77 */                        Context context = this.I00000oOI.I00000oIO;
/* 87 */                        return new OlIIO11IoO1(new OlI1oO01O0(iII1o0lOio0, null), null, Ii1I1OOilolI.I00iiI);
                            } catch (Throwable th) {
/* 92 */                        byteBuffer.position(0);
/* 95 */                        throw th;
                            }
                        default:
/* 7 */                     OIil0IlIIol oIil0IlIIol = this.I00000oOI;
/* 11 */                    Drawable bitmapDrawable = (Drawable) this.I0000Il00O;
/* 13 */                    Bitmap.Config[] configArr = I000O01llI0.I00000oIO;
/* 17 */                    boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof Ooo1IlOO);
/* 26 */                    if (z) {
/* 48 */                        bitmapDrawable = new BitmapDrawable(oIil0IlIIol.I00000oIO.getResources(), ilI00Ioo.I00000oIO(bitmapDrawable, oIil0IlIIol.I00000oOI, oIil0IlIIol.I0000O, oIil0IlIIol.I0000oI00, oIil0IlIIol.I0001Ioi1lo));
                            }
/* 54 */                    return new Iilo1lOIl01i(bitmapDrawable, z, Ii1I1OOilolI.I00iiI);
                    }
                }
            }
