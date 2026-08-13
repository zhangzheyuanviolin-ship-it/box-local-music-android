            package p000;

            import android.graphics.Bitmap;
            import android.graphics.drawable.Drawable;
            import android.net.Uri;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            
            public final class I1O1Ii implements IlIIoIo {
                public final int I00000oIO;

                @Override
                public final IlIO00OOi1OO I00000oIO(Object obj, OIil0IlIIol oIil0IlIIol) {
                    switch (this.I00000oIO) {
                        case 0:
/* 124 */                   Uri uri = (Uri) obj;
/* 130 */                   if (!I000O01llI0.I0000Il00O(uri)) {
/* 6 */                         return null;
                            }
/* 135 */                   I1O1Il1iIill i1O1Il1iIill = new I1O1Il1iIill(0);
/* 138 */                   i1O1Il1iIill.I00000oOI = uri;
/* 140 */                   i1O1Il1iIill.I0000Il00O = oIil0IlIIol;
/* 142 */                   VarHandle.storeStoreFence();
/* 145 */                   return i1O1Il1iIill;
                        case 1:
/* 113 */                   II0o0I0 iI0o0I0 = new II0o0I0(0);
/* 116 */                   iI0o0I0.I0000Il00O = (Bitmap) obj;
/* 118 */                   iI0o0I0.I00000oOI = oIil0IlIIol;
/* 120 */                   VarHandle.storeStoreFence();
/* 123 */                   return iI0o0I0;
                        case 2:
/* 98 */                    II0o0I0 iI0o0I02 = new II0o0I0(1);
/* 101 */                   iI0o0I02.I0000Il00O = (ByteBuffer) obj;
/* 103 */                   iI0o0I02.I00000oOI = oIil0IlIIol;
/* 105 */                   VarHandle.storeStoreFence();
/* 108 */                   return iI0o0I02;
                        case 3:
/* 66 */                    Uri uri2 = (Uri) obj;
/* 78 */                    if (!O0000Ioio00.I0000O(uri2.getScheme(), "content")) {
/* 6 */                         return null;
                            }
/* 83 */                    I1O1Il1iIill i1O1Il1iIill2 = new I1O1Il1iIill(1);
/* 86 */                    i1O1Il1iIill2.I00000oOI = uri2;
/* 88 */                    i1O1Il1iIill2.I0000Il00O = oIil0IlIIol;
/* 90 */                    VarHandle.storeStoreFence();
/* 93 */                    return i1O1Il1iIill2;
                        case 4:
/* 55 */                    II0o0I0 iI0o0I03 = new II0o0I0(2);
/* 58 */                    iI0o0I03.I0000Il00O = (Drawable) obj;
/* 60 */                    iI0o0I03.I00000oOI = oIil0IlIIol;
/* 62 */                    VarHandle.storeStoreFence();
/* 65 */                    return iI0o0I03;
                        case 5:
/* 42 */                    IlIOll1Il ilIOll1Il = new IlIOll1Il();
/* 45 */                    ilIOll1Il.I00000oIO = (File) obj;
/* 47 */                    VarHandle.storeStoreFence();
/* 50 */                    return ilIOll1Il;
                        default:
/* 10 */                    Uri uri3 = (Uri) obj;
/* 22 */                    if (!O0000Ioio00.I0000O(uri3.getScheme(), "android.resource")) {
/* 6 */                         return null;
                            }
/* 27 */                    I1O1Il1iIill i1O1Il1iIill3 = new I1O1Il1iIill(2);
/* 30 */                    i1O1Il1iIill3.I00000oOI = uri3;
/* 32 */                    i1O1Il1iIill3.I0000Il00O = oIil0IlIIol;
/* 34 */                    VarHandle.storeStoreFence();
/* 37 */                    return i1O1Il1iIill3;
                    }
                }
            }
